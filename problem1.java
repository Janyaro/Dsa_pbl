import java.util.Hashtable;
import java.util.Scanner;
// almost complete only set ignore case sensitive in the key 
public class problem1 {
    public void search4keyWord(Hashtable<String , PakUni> uni ){

        Scanner sc = new Scanner(System.in);
        String key;
      System.out.println("Enter 4 Keys words ");
      key = sc.nextLine(); 
      
    while (key.length()!=4) {
      System.out.println("the key contain 4 word try again ");
      key = sc.nextLine();
      
    }
    
      
    
    if(uni.containsKey(key.toUpperCase()) && key.length()==4 ){
      PakUni value = uni.get(key.toUpperCase());
    
      System.out.println("Uni_Name  : "+value.getName() );
      System.out.println("Word Ranking  : "+value.getWord_rank() );
      System.out.println("Asia Ranking    : "+value.Asia_rank );
      System.out.println("Pakistan Ranking   : "+value.getPak_rank() );
      System.out.println("Address   : "+value.getaddress() );
      System.out.println("Publication   : "+value.getNum_of_publish() );
    }
    else{
  System.out.println("Data not contain in the hash table");
}}
    }

