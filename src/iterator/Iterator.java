package iterator;

import java.util.List;

public class Iterator<E> {
	
	private List<E> list;
	private int counter;
	
	public Iterator(List<E> list) {
		this.list = list;
	}
	
	public boolean hasNext() {
		if(counter < list.size()) {
			return true;
		}
		return false;
	}
	
	public E next() {
		E element = list.get(counter);
		counter++;
		return element;
	}

}
