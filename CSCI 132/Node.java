/* basically just c+p from the inlab

*/

public class Node
{
    private int pol;
    private Node next;
    private Node previous;
    
    public Node (int pol)
    {
        this.pol = pol;
        this.next = next;
        this.previous = previous;
    }
    
    public void setNext(Node what)
    {
        this.next = what;
    }
    
    public void setPrevious(Node what)
    {
        this.previous = what;
    }
    
    public int getData()
    {
        return pol;
    }
    
    public Node  getNext()
    {
        return next;
    }
    
    public Node getPrevious()
    {
        return previous;
    }
    
  

}

