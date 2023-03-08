interface stack{
    public void push(Object obj);
    public Object pop();
    public Object peek();
    int size();
}
class Node<t>{
    t data;
    Node next;
    Node(t data){
this.data = data;
    }
    Node (t data , Node next){
        this.data = data;
        this.next = next;
    }
}
public class MyStack<t> implements stack{
     Node top;
     int size;
     MyStack(){
        top=null;
     }
    @Override
    public void push(Object obj) {
        top = new Node( obj , top);
    }

    @Override
    public Object pop() {
       Object obj = top.data;
       obj = null;
       --size;
       return obj;
    }

    @Override
    public Object peek() {
    return top.data;
    }

    @Override
    public int size() {
        return size;
    }
    
    // IsEmpty method 
    public boolean IsEmpty() {
        return size==0;
    }
    // Disply all the data 
    public void Disply() {
        Node dis = top;
        while (dis!=null) {
            System.out.println(dis.data);
            dis=dis.next;
        }
    }
    public void Run(String key) {
        Node ri= top;
        while(ri!=null){
            if()
        }
    }
}
