/*******************************
 * Jason Secula
 * Reynaldo Morillo
 * Lab10
 * 12/2/2015
 ******/
public class Node<E> {
	public E _data;
	  public Node<E> _next;
	  
	  public Node(E data, Node<E> next) {
	    _data = data;
	    _next = next;
	}
	  @Override
	  public String toString() {
	    if(_next == null)
	      return _data.toString();
	    return _data + " " + _next.toString();
	  }
	  public int length(){
		  if (_next == null)
			  return 1;
		  return 1 + _next.length();
	  }
	  public void append(E element){
		  if(_next == null)
			  _next = new Node<E>(element, null);
		  else
			  _next.append(element);
	  }
	  public boolean contains(E element){
		  if(_data.equals(element))
			  return true;
		  else if(_next == null)
			  return false;
		  else
			  return _next.contains(element);
	  }
	  public E get(int index){
		  if (index == 0)
			  return _data;
		  else if(_next == null)
			  throw new RuntimeException("index out of bounds");
		  else
			 return _next.get(index-1);	
	  }
}

//‰‰‰‰‰