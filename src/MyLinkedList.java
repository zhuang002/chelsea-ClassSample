import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<T> implements List<T> {
	MyListNode<T> head = null;
	MyListNode<T> tail = null;
	int size = 0;
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		MyListNode<T> current = head;
		while (current != null) {
			if (current.data.equals(o))
				return true;
			current = current.next;
		}
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		Object[] ar = new Object[size];
		MyListNode<T> current = head;
		int i=0;
		while (current!=null) {
			ar[i] = current.data;
			current = current.next;
			i++;
		}
		return ar;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		MyListNode<T> current = head;
		int i=0;
		while (current!=null) {
			a[i] = current.data;
			current = current.next;
			i++;
		}
		return a;
	}

	@Override
	public boolean add(T e) {
		// TODO Auto-generated method stub
		MyListNode<T> node = new MyListNode<>(e);
		if (this.head==null) {
			this.head = node;
			this.tail = node;
			size = 1;
		} else {
			this.tail.next = node;
			node.previous=tail;
			size++;
		}
		return true;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		MyListNode<T> current = head;
		while (current!=null && !current.data.equals(o)) {
			current = current.next;
		}
		if (current!=null) {
			if (current == head) {
				this.head = current.next;
				if (this.head == null) {
					this.tail =null;
				} else {
					this.head.previous = null;
				}
		
				size --;
				return true;
			} else {
				current.previous.next = current.next;
				if (current.next == null) {
					this.tail = current.previous;
				} else {
					current.next.previous = current.previous;
				}
				size--
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	class MyListNode<T> {
		public MyListNode(T e) {
			// TODO Auto-generated constructor stub
			this.data = this.data;
		}
		T data;
		MyListNode<T> previous = null;
		MyListNode<T> next = null;
		
		
	}
}
