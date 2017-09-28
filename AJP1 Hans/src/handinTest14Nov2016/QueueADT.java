package handinTest14Nov2016;

public interface QueueADT <T>
{
	public void enqueue(T element);
	public T dequeue();
	public T first();
	public int indexOf(T element);
	public boolean isEmpty();
	public int size();
	
}
