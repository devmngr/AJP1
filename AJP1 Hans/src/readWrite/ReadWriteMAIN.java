package readWrite;

public class ReadWriteMAIN {
public static void main(String[] args) {
	

/*
	ReadWriteSafe lock = new ReadWriteSafe();
	Reader reader = new Reader("READER", lock);
	Reader reader2 = new Reader("READER2", lock);
	
	Writer writer = new Writer("writer", lock);
	Writer writer2 = new Writer("writer2", lock);
*/

	/*
	ReadWriteSafeAndBetterForWriting lock = new ReadWriteSafeAndBetterForWriting();
	Reader reader = new Reader("READER", lock);
	Reader reader2 = new Reader("READER2", lock);
	
	Writer writer = new Writer("writer", lock);
	Writer writer2 = new Writer("writer2", lock);
	*/
	
	ReadWriteSafeAndFair2 lock= new ReadWriteSafeAndFair2();
	Reader reader = new Reader("READER", lock);
	Reader reader2 = new Reader("READER2", lock);
	
	Writer writer = new Writer("writer", lock);
	Writer writer2 = new Writer("writer2", lock);

	reader.start();
	reader2.start();
	writer.start();
	writer2.start();
}	

}
