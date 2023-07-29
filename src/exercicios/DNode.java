package exercicios;

public class DNode<E> {
	protected E element;
	protected DNode<E> next;
	private DNode<E> previous;
	public DNode(E e) {
		element = e;
		next = null;
	}
	public E getElement() {
		return element;
	}
	public void setElement(E e) {
		element = e;
	}
	public DNode<E> getNext() {
		return next;
	}
	public void setNext(DNode<E> n) {
		next = n;
	}
	public DNode<E> getPrevious() {
		return previous;
	}
	public void setPrevious(DNode<E> p){
		previous = p;
	}
}