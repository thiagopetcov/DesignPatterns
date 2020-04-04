import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CountryDAO {
	//Attributes for connection 
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	//Getting connection 
	public CountryDAO() {
		new ConnectionFactory();
		this.connection = ConnectionFactory.getConnection();
	}
	
	public ArrayList<String> findByCode(String code) {
		//Getting query to the Database
		String sql = "SELECT * FROM country WHERE code = '" + code + "'";
		ArrayList<String> country = new ArrayList<>();
		
		try {
			//Preparing connection 
			preparedStatement = connection.prepareStatement(sql);
			
			resultSet = preparedStatement.executeQuery(sql);
			//Loop through the list getting result 
			while(resultSet.next()) {
				String name = resultSet.getString("name");
				String continent = resultSet.getString("continent");
				String surfaceArea = resultSet.getString("surfaceArea");
				String headOfState = resultSet.getString("headOfState");
				
				country.add(code);
				country.add(name);
				country.add(continent);
				country.add(surfaceArea);
				country.add(headOfState);
				
			}
			return country;
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void add(Country country) {
		    //Getting connection insert into table values 
			String sql = "INSERT INTO country(code, name, continent, surfaceArea, headOfState) VALUES(?,?,?,?,?)";
			try { 
	            preparedStatement = connection.prepareStatement(sql);
	            
	            preparedStatement.setString(1, country.getCode());
	            preparedStatement.setString(2, country.getName());
	            preparedStatement.setString(3, country.getContinent());
	            preparedStatement.setFloat(4, country.getSurfaceArea());
	            preparedStatement.setString(5, country.getHeadOfState());

	            preparedStatement.execute();
	            preparedStatement.close();
	           
	        } 
	        catch (SQLException u) { 
	            throw new RuntimeException(u);
	        } 
	}

	public ArrayList<Country> findAll() {
		
		String sql = "SELECT * FROM country";
		ArrayList<Country> countries = new ArrayList<Country>();
		
		try {
			//Preparing connection 
			preparedStatement = connection.prepareStatement(sql);
			
			resultSet = preparedStatement.executeQuery(sql);
			//loop through the List getting result  
			while(resultSet.next()) {
				String code = resultSet.getString("code");
				String name = resultSet.getString("name");
				String continent = resultSet.getString("continent");
				Integer surfaceArea = resultSet.getInt("surfaceArea");
				String headOfState = resultSet.getString("headOfState");
				
				//Creating object Country
				Country c = new Country(code, name, continent, surfaceArea, headOfState);
				
				countries.add(c);
			}
			return countries;
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public ArrayList<String> findByName(String nameToFind) {
		//Select statement from table
		String sql = "SELECT * FROM country WHERE name = '" + nameToFind + "'";
		ArrayList<String> country = new ArrayList<>();
		
		try {
			
			preparedStatement = connection.prepareStatement(sql);
			
			resultSet = preparedStatement.executeQuery(sql);
			
			while(resultSet.next()) {
				String code = resultSet.getString("code");
				String name = resultSet.getString("name");
				String continent = resultSet.getString("continent");
				String surfaceArea = resultSet.getString("surfaceArea");
				String headOfState = resultSet.getString("headOfState");
				
				country.add(code);
				country.add(name);
				country.add(continent);
				country.add(surfaceArea);
				country.add(headOfState);
			}
			return country;
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
}

