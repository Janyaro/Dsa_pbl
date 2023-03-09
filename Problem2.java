import java.util.Hashtable;
import java.util.Scanner;



public class Problem2{
    // top university based on the user instruction 
    public void Top5Uni(MyStack<String> mystack , Hashtable<String, PakUni> uni) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many top university you want to see");
        int value = scan.nextInt();

    MyStack<String > temp = mystack.duplicate();
    // System.out.println(temp.size());

    for (int i = 1; i <= uni.size(); i++) {
        // give the reverse condition because we want only 5 university
        if(i>value){
         temp.pop();
        }
        else{
        
            String topuni = (String) temp.pop();
      
            PakUni obj =uni.get(topuni);
            
            System.out.println();
            System.out.println("Name  "+ obj.getName());
            System.out.println("Word Ranking  : "+obj.getWord_rank() );
          System.out.println("Asia Ranking    : "+obj.Asia_rank );
          System.out.println("Pakistan Ranking   : "+obj.getPak_rank() );
          System.out.println("Address   : "+obj.getaddress() );
          System.out.println("Publication   : "+obj.getNum_of_publish() );
            
    }
    }
       
// System.out.println(temp.size());

}

// bottom 5 university based on publication 
public void Bottom5(MyStack <String > stack , Hashtable<String, PakUni> uni) {
    // data doesnot loss in the orginal stack to resolve this problem make a deplicate stack
    MyStack<String > clone = stack.duplicate();
    // make a stake if which the value is revrse because we want bottom university 
   MyStack<String > reverse = new MyStack<>();
   for (int i = 0; i < stack.size(); i++) {
    reverse.push(clone.pop());
   }
//    System.out.println("The reverse stack is ready ");
   for (int i = 1; i < reverse.size(); i++) {
    if(i>5){
        reverse.pop();
    }
    else{
        PakUni key = uni.get(reverse.pop());
            System.out.println();
        System.out.println("Name  "+ key.getName());
        System.out.println("Word Ranking  : "+key.getWord_rank() );
      System.out.println("Asia Ranking    : "+key.Asia_rank );
      System.out.println("Pakistan Ranking   : "+key.getPak_rank() );
      System.out.println("Address   : "+key.getaddress() );
      System.out.println("Publication   : "+key.getNum_of_publish() );
    }
   }
//    reverse.Disply();
    }
    
 //  50th percentile university    
    public void  Uni50thpercentile(MyStack <String > stack , Hashtable<String, PakUni> uni) {
        MyStack<String > temp2 = stack.duplicate();
        // divide stack size  to get the 50 university name in the stack
        int size = (temp2.size())/2;
        for (int i = 1; i < size; i++) {
            // pop all 49 university data from the stack to reach the 50 university 
            temp2.pop();
        }
       // disply only top data that is 50 
        // System.out.println(temp2.size());
        
        String topuni1 = (String) temp2.pop();
   System.out.println(temp2.size());
         PakUni obj =uni.get(topuni1);
         System.out.println("The 50 percentile university is ");
         System.out.println();
         System.out.println("Name  "+ obj.getName());
         System.out.println("Word Ranking  : "+obj.getWord_rank() );
       System.out.println("Asia Ranking    : "+obj.Asia_rank );
       System.out.println("Pakistan Ranking   : "+obj.getPak_rank() );
       System.out.println("Address   : "+obj.getaddress() );
       System.out.println("Publication   : "+obj.getNum_of_publish() );
    
                // System.out.println(temp2.size());
        }

    }

