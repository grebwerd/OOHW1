import java.util.ArrayList;

public class main {

	ArrayList<Shape> database = new ArrayList<Shape>();
	
	public static void main(String[] args){
		main m = new main();
		
		m.intializeDatabase();
		m.displayDatabaseSize();
		m.displayDatabaseContent();
	}

	public ArrayList<Shape> intializeDatabase(){
		database.add(0, new Square());
		database.add(1, new Circle());
		database.add(2, new Triangle());
		return database;
	}
	
	public void displayDatabaseSize() {
		System.out.println("The database holds " + database.size() + " entries");
	}
	
	public void displayDatabaseContent() {
		int index = 0;
		while(index < database.size()){
			System.out.println("Database entry number " + index + " contains the shape " +database.get(index).getShape());
			index++;
		}
	}
}
