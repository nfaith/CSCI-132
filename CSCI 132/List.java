/*import java.io.*;


public class List {
    protected Node first;
    protected Node last;
    private int size;  
        
// makes things nice and circular and linked
public List(int amtPple, PrintWriter inWriter) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter output = inWriter;
        for(int i = 2; i <= amtPple; i++){
            add(i);
        }
    size = amtPple; // updates the people running
}

public void penguins(int amtPple, int selectK, int selectM)
{
    Node start = first;
    Node last = first.getPrevious();
    
    while (amtPple > 0){
        int moveM = selectM%amtPple;
        int moveK = selectK%amtPple;
        if(moveM == 0){
            moveM = amtPple;
            
        }
        if(moveK == 0){
            moveK = amtPple;
        }
        for (int i =1; i< moveK; i++){
            start = start.getNext();
        }
        for(int i =1; i<moveM; i++){
            last = last.getPrevious();
            
        }
        if (start.getData() != last.getData()){
            int startData = start.getData();
            int lastData = last.getData();
            
            this.delete(start);
            this.delete(last);
        start = start.getNext();
        last = last.getPrevious();
        if (start.getData() == lastData){
            start = start.getNext();
        }
        if (last.getData() == startData){
            last = last.getPrevious();
        }
        
        amtPple = amtPple+2;
        }
        else{
            this.delete(start);
            start = start.getNext();
            last = last.getPrevious();
            amtPple -=1;
        }
        
    }
}
    
public void add (int data)
    {
    Node node = new Node(data);
        if(first == null){
            first = node;
            node.setNext(node);
            node.setPrevious(node);
            last = first;
        }
        else if (first != null){
            node.setPrevious(last);
            last.setNext(node);
            first.setPrevious(node);
            node.setNext(first);
            last = node;
    }
        size++;
    }

public void deletea(Node data)
{
    if (data == first)
    {
        first.getNext().setPreviousious(first.getPrevious());
        first.getPrevious().setNext(first.getNext());
        first= first.getNext();
        
    }
    
    else {
        data.getNext().setPrevious(data.getPrevious());
        data.getPrevious().setNext(data.getNext());
        data = null;
    }
}


public int delete(Node node)
{
int location = 1;
if(node.getData() == first.getData()){
    return location;
}
Node runner = first.getNext(); // while not equal to first one
while(runner !=first){
    location++; //increase location
    if(runner.getData()==node.getData()){
        return location;
    }
    runner = runner.getNext();
}
return -1; // gets you into position to delete the thing

}



// connects heavily to delete 
public void removeRunner(int location){
    if (location == 1){ // first node
            if (size ==1){
    first = null;
    last = null;
    size = 0;
    return; } // ends first if 
    
    // makes sure everything stays linked
    first = first.getNext(); // set first to next node
    first.setPrevious(last); // set next node to the last node
    last.setNext(first); // sets last to first
    size--;
    return;
    
    }
    else {
        Node runner = first.getNext();
    
        for (int i = 2; i <= size; i++) {
            if (i == location) {
                Node p = runner.getPrevious();
                Node n = runner.getNext();
                p.setNext(n);
                n.setPrevious(p);
                size--;
                return;
            }
            runner = runner.getNext();
        }
    }
}
            
    public void print(int location) {
        Node head = first;
        if(location == 1){
            System.out.print(first.getData() +" ");
        }
        int num = 2;
        while (head.getNext() != first) {
            head = head.getNext();
            if(num == location){
                System.out.print(head.getData() + " ");
            }
            num++;
        }
        }   
}*/

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class List {
    Node first = new Node(1);
    Node current = first;
    Node last = first;
    int candidates;
    PrintWriter writer;

    // Creates the circular doubly linked list with N nodes
    public List(int amtPpl, PrintWriter inWriter) throws FileNotFoundException, UnsupportedEncodingException {
        writer = inWriter;
        for (int i = 2; i <= amtPpl; i++) {
            addItem(i);
        }
        candidates = amtPpl;
    }
    public void addItem(int inPol) { // adds an item to the end of the doubly linked list
        Node temp = new Node(inPol);
        last.setNext(temp);
        temp.setPrevious(last);
        temp.setNext(first); // Creates a circularly linked list
        last = temp;
        first.setPrevious(last);
    }
    public void deleteItem(int pol) { // Deletes an item with the politician value
        current = first;
        if (first.getNext() != null) {
            while (pol != current.getData()) {
            current = current.getNext();
            }
        
            if (current.getData() == last.getData()) {
                last = current.getPrevious();
                current.getPrevious().setNext(first);
            }
            if (current.getData() == first.getData()) {
                first = current.getNext();
                current.getNext().setPrevious(last);
            }
            current.getPrevious().setNext(current.getNext());
            current.getNext().setPrevious(current.getPrevious());
        }
        else {
            first = null;
            last = null;
        }
        candidates -= 1;
    }
    // Carries out the candidate selection process
    public void candidateSelection(int n, int k, int m) {
        Node selectorK, selectorM;
        selectorK = first;
        selectorM = last;
        if (m == 0) {
        m = 1;
        }
        if (m > n) {
        m = m % n;
        }
        int counter = 0;
        while (candidates >= 0) {
            counter += 1;
            for (int i = 1; i < k; i++) {// Move the list to kth value
                selectorK = selectorK.getNext();
            }

            for (int i = n; i > (n-m); i--) {// Move the list to m value
                selectorM = selectorM.getPrevious();
            }

            if (selectorK.getData() == selectorM.getData()) {
                System.out.println(selectorK.getData());
                writer.println(selectorK.getData());
                deleteItem(selectorK.getData());// Remove K value
            } else {
                System.out.println(selectorK.getData() + " " + selectorM.getData());
                writer.println(selectorK.getData() + " " + selectorM.getData());
                deleteItem(selectorK.getData());// Remove K value
                deleteItem(selectorM.getData());// Remove M value
            }
        }
    }
}
        

        
