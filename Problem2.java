public class Problem2{
    public void Top5Uni(MyStack mystack) {
        MyStack stack = mystack;
        int i =5;
        for(Node p=stack.top;p!=null;p=p.next){
            System.out.print(stack.pop());
            i--;
        }
        System.out.println();
    }
    public void Top25uni() {
        
    }
    public void bottom5Uni() {
        
    }
    public void  Uni50thpercentile() {
        
    }

}