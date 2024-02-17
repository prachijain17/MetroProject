package Persistence;
import Entities.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public interface MetroDao {
	
   public List<Metro> getAllMetroFare();
   public String getNextStation(String currentStation);
   public int getFareBetweenStations(String sourceStation, String destinationStation);
		
}
