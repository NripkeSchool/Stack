/**
 * Code credited to Roger Sedgewick
 */

public class Stack<Item>
{
  private Node first = null;
  private int size = 0;
  public void push(Item newItem)
  {
    Node oldFirst = first;
    first = new Node();
    first.item = newItem;
    first.next = oldFirst;
    size++;
  }
  
  public Item pop()
  {
      Item i = first.item;
      first = first.next;
      size--;
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
