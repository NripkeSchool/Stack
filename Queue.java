/**
 * Code credited to Roger Sedgewick
 */

public class Queue<Item>
{
  private Node first, last = null;
  private int size = 0;

  public void enqueue(Item newItem)
  {
    Node oldLast = last;
    last = new Node();
    last.item = newItem;
    last.next = oldLast;
    
    if (isEmpty()) {  first = last;}else  {oldLast.next = last;}
    size++; 
  }
  
  public Item dequeue()
  {
     Item i = first.item;
     first = first.next;
     size--;
     if (isEmpty()) {last = null;}
     return i;
  }
  
  public boolean isEmpty()
  {
      return first == null;
  }
  
  public int getSize()
  {
      return size;
  }
  
  private class Node
  {
     Item item;
     Node next;
  }
}
