package Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


import Entities.Metro;

public class MetroDaoImpl implements MetroDao {
	 private Connection connection;

	   
	//This function will return all the stations and fare between them
	@Override
   public List<Metro> getAllMetroFare() {
		
		List<Metro> metroListAndFare=new LinkedList<>();
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stationsdata", "root",
				"SiyaRam&1")) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			PreparedStatement preparedStatement;
			
				preparedStatement = connection.prepareStatement("SELECT * FROM FARE");
			
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				String sourceName = resultSet.getString("source_station");
				String destName = resultSet.getString("destination_station");
				int fare = resultSet.getInt("fare");
				

				metroListAndFare.add(new Metro(sourceName, destName, fare));

			

    }
		}catch (ClassNotFoundException e) {

		e.printStackTrace();
	} catch (SQLException e) {

		e.printStackTrace();
	}


		return metroListAndFare;
	}
	
	
// This function returns the station between source_station and  destination_station
	@Override
	public String getNextStation(String currentStation)  {
	    String nextStation=null;
	    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stationsdata", "root",
				"SiyaRam&1");) {

			Class.forName("com.mysql.cj.jdbc.Driver");
			PreparedStatement preparedStatement;
	   
	    	
	    	preparedStatement = connection.prepareStatement("SELECT destination_station FROM Fare WHERE source_station = ?"); 
	    	preparedStatement.setString(1, currentStation);
	        ResultSet resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	               nextStation= resultSet.getString("destination_station");
	            }
	        
	    }
	    catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	    
	    return nextStation;
	}


//This function returns fare between all the stations
	@Override
	public int getFareBetweenStations(String sourceStation, String destinationStation) {
		int fare=0;
		 try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stationsdata", "root",
					"SiyaRam&1");) {

				Class.forName("com.mysql.cj.jdbc.Driver");
				PreparedStatement preparedStatement;
		   
	    String query = "SELECT fare FROM Fare WHERE source_station = ? AND destination_station = ?";
	    PreparedStatement statement = connection.prepareStatement(query);
	        statement.setString(1, sourceStation);
	        statement.setString(2, destinationStation);
	        try (ResultSet resultSet = statement.executeQuery()) {
	            if (resultSet.next()) {
	                fare=resultSet.getInt("fare");
	            }
	        }
	    }
		 
	    catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	    
	    return fare;
	}



		
}
