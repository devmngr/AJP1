package readWrite;

public interface IReadWrite {
	
	void acquireRead();

	void releaseRead();

	void acquireWrite();

	void releaseWrite();
}
