
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Node<String> n1 = new Node<String>("apple", null);
		  Node<String> n2 = new Node<String>("banana", n1);
		  Node<String> n3 = new Node<String>("orange", n2);
		  
		  System.out.println(n1);
		  System.out.println(n1.length());
		  
		  System.out.println(n2);
		  System.out.println(n2.length());
		  
		  System.out.println(n3);
		  System.out.println(n3.length());
		  
		  n3.append("pear");
		  System.out.println(n3);
		  System.out.println(n3.length());
		  
		  System.out.println(n3.contains("apple"));
		  System.out.println(n3.contains("pear"));
		  System.out.println(n3.contains("papaya"));

		  System.out.println(n3.get(0));
		  System.out.println(n3.get(3));
		  System.out.println(n3.get(4));
	  }

}
