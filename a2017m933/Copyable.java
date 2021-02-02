package a2017m933;

public interface Copyable<T> {
	public T copy() throws CopyException;
}
