
public class RecordBook {
	private Record[] records;
	
	public RecordBook(int size) {
		records = new Record[size];
	}
	
	public Record findRecord(String name) {
		for (Record rec: records) {
			if (rec.getName().equals(name)) {
				return rec;
			}
		}
		return (new Record("empty", "empty"));
	}
	
	public void addRecord(Record rec) {
		
	}
	
	
}
