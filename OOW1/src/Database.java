import java.util.ArrayList;

public class Database {
	ArrayList<Shape> entries;

	public Database() {
		entries = new ArrayList<Shape>();
		intializeDb();
	}

	public ArrayList<Shape> intializeDb() {
		entries.add(0, new Square());
		entries.add(1, new Circle());
		entries.add(2, new Triangle());
		return entries;
	}

	public void displayDbSize() {
		System.out.println("The database holds " + entries.size() + " entries");
	}

	public void displayDbContent() {
		int index = 0;
		while (index < entries.size()) {
			System.out.println("Database entry number " + index
					+ " contains the shape " + entries.get(index).getShape());
			index++;
		}
	}
}
