package linkedlistproject;



public class Singlylinkedlist {
	
	   private Node head;
	   int length;
	   private static class Node {
	      private Student data;
	      private Node next;

	      public Node(Student  data) {
	         this.data = data;
	         this.next = null;
	      }
	   }
	   Node newNode(Student data)
	    {
	        Node x = new Node(data);
	        return x;
	    }
	   // display function for print data
	    public void display() {
	        Node p = head;
	        while (p != null) {
	            System.out.print("Name:"+p.data.getName() + " , Roll no:" + p.data.getRoll() + " , Percentage:" + p.data.getPct() + " ---> ");
	            p = p.next;
	            System.out.println();
	        }
	       
	        System.out.println("null");
	    }
	    
	    // addFirst function 
	    public void addFirst(Student x) {
	        Node p = new Node(x);
	        length++;
	        if (head == null) {
	            head = p;

	        } else {
	            p.next = head;
	            head = p;
	        }

	    }
	 // delete at function 
	    public void deleteAt(String r) {
	        Node p = head;
	        while (p.next != null) {

	            if (p.next.data.getRoll() == r) {
	                break;
	            }
	            p = p.next;
	        }
	        length--;
	        p.next = p.next.next;
	    }


	    // set At function
	    public void setAt(String r, double pct) {

	        Node p = head;
	        while (p.next != null) {

	            if (p.next.data.getRoll() == r) {
	                p.next.data.setPct(pct);
	                break;
	            }
	            p = p.next;
	        }
	    }


	    // Add Sorted Function 
	    public void addSorted(Node new_node)
	    {
	        Node current;
	  
	      // To check Special Case
	        if (head == null || head.data.getPct() >= new_node.data.getPct()) {
	            new_node.next = head;
	            head = new_node;
	        }
	        else {
	  
	         // Locate the Node
	            current = head;
	  
	            while (current.next != null && current.next.data.getPct() < new_node.data.getPct()) {
	                
	              current = current.next;
	            }
	                  
	            new_node.next = current.next;
	            current.next = new_node;
	        }
	    }
	   
	   public static void main(String[] args) {
	   Student s1=new Student("Aman", "R01",84.2);
	   Student s2=new Student("Piyush", "R02",84.2);
	   Student s3=new Student("Sarthak", "R03",84.2);
	   Student s4=new Student("Tarun", "R04",84.2);
	   Student s5=new Student("Yash", "R05",84.2);
      


	   Singlylinkedlist sll=new Singlylinkedlist();
       Node new1=sll.newNode(s1);
       sll.addSorted(new1);
       Node new2=sll.newNode(s2);
	   sll.addSorted(new2);
       Node new3=sll.newNode(s3);
	   sll.addSorted(new3);
       Node new4=sll.newNode(s4);
	   sll.addSorted(new4);
       Node new5=sll.newNode(s5);
       sll.addSorted(new5);
	   sll.display();
	   sll.addFirst(s3);
	   sll.addFirst(s4);
	   sll.addFirst(s1);
	   sll.addFirst(s5);
	   sll.addFirst(s2);
	   sll.display();
	   sll.deleteAt("63");
	   sll.display();
	   sll.setAt("18", 9.99);
	   sll.display();
	   System.out.println("Length of the linked list is "+sll.length);
	}
	

}
