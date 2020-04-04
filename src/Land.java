import javax.swing.JOptionPane;

public class Land {
	public static void main(String[] args) {
		
		int type;
		boolean _continue = true;
		
		try {
			do {
				//Input dialog menu for all operation
				String op = (String) JOptionPane.showInputDialog(null,
						"1 - List all countries\n"
					  + "2 - Add a new country\n"
					  + "3 - Find country by name\n"
					  + "4 - Find country by code\n"
					  + "0 - Exit");
				
				type = Integer.parseInt(op);
				//Stop the operation 
				if (type == 0) {
					System.out.println("Thanks for using our System!");
					_continue = false;
				}
				//List all country from Database 
				else if (type == 1) {
					System.out.println("List");
					CountryDAO dao = new CountryDAO();
					System.out.println(dao.findAll());
				}
				//Add new country in the database.
				//@param code,name, continent,surface, headOfState
				else if (type == 2) {
					System.out.println("Add");
					String code = JOptionPane.showInputDialog("code");
					String name = JOptionPane.showInputDialog("name");
					Object continent = JOptionPane.showInputDialog(null, "continent", "CONTinent", JOptionPane.INFORMATION_MESSAGE, null, Continent.values(), Continent.values()[0]);
					String surfaceArea = JOptionPane.showInputDialog("surface");
					String headOfState = JOptionPane.showInputDialog("head of state");
					
					Country country = new Country(code, name, continent.toString(), Float.valueOf(surfaceArea), headOfState);
					CountryDAO dao = new CountryDAO();
					
					dao.add(country);
					JOptionPane.showMessageDialog(null, country.getName() + " has been added successfully!");
					
				}
				//Find country by name 
				else if (type == 3) {
					System.out.println("find name");
					String name = JOptionPane.showInputDialog(null, "name");
					CountryDAO dao = new CountryDAO();
					System.out.println(dao.findByName(name));
				}
				//Find country by code 
				else if (type == 4) {
					System.out.println("find code");
					String code = JOptionPane.showInputDialog(null, "code");
					CountryDAO dao = new CountryDAO();
					System.out.println(dao.findByCode(code));
				}
				//Throws the user "choice is invalid"
				else if (type > 4) {
					System.out.println("invalid option");
				}
				//Continues the loop to read
			} while (_continue);
		} catch(NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "that is not a number!");
		}
		
	}

}
