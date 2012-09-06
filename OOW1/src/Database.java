import java.util.ArrayList;

public class Database {
	ArrayList<Shape> entries;

	public Database() {
		entries = new ArrayList<Shape>();
		intializeDb();
	}

	private ArrayList<Shape> intializeDb() {
		entries.add(0, new Square());
		entries.add(1, new Circle());
		entries.add(2, new Triangle());
		return entries;
	}

	public void displayDbSize() {
		System.out.println("The database holds " + entries.size() + " entries");
	}

	public void displayDbContent() {
		for (int index = 0; index < entries.size(); index++) {
			System.out.println("Database entry number " + index + entries.get(index).display());
		}
	}
}
