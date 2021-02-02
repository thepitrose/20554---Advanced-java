package a2017m863;

public interface Reduceable<T> {
	public T reduce() throws NonReduceable;

}
