
import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Scanner;


public class problem3{
   // reverse stack for get lowest publication university
   public void  Bottom(MyStack<String > stack , Hashtable<String , PakUni > uni) {
  try {
    
  
    MyStack<String > clone = stack.duplicate();
    // make a stake if which the value is revrse because we want bottom university 
   MyStack<String > reverse = new MyStack<>();
   for (int i = 0; i < clone.size(); i++) {
    reverse.push(stack.pop());
   }
  String  key = reverse.pop();
  PakUni object = uni.get(key);

  System.out.println("Name : "+ object.getName());
  System.out.println("Word Ranking : "+ object.getWord_rank());
  System.out.println("Pakistan Ranking : "+object.getPak_rank());
  System.out.println("Asia Ranking "+ object.getAsia_rank());
  System.out.println("Location : "+object.getaddress());
  System.out.println("Publication  : "+object.num_of_publish);
} catch (Exception e) {
System.out.println("Stack is Empty");   
}
   }
    public void Best_worstUni(Hashtable <String , PakUni> uni ) {
                MyStack<String > Sindh = new MyStack<>();
        MyStack<String > punjab = new MyStack<>();
        MyStack<String > khyber = new MyStack<>();
        MyStack<String > balochistan = new MyStack<>();
        MyStack<String> gilgit = new MyStack<>();
        Object [][] pab = new Object[uni.size()][2];  
        Object [][] city = new Object[uni.size()][2];  
              
        Object sindhkey []= new Object[50];
        Object punjabkey []= new Object[50];
        Object kpkkey []= new Object[50];
        Object balochkey []= new Object[50];
        Object gilgitkey [ ] = new Object[50];
        int j= 0;
    for (java.util.Map.Entry<String, PakUni> e : uni.entrySet()) {
        pab[j][0]=e.getKey();
        pab[j][1]=e.getValue();
 
        j++;
    
    }
    for (int w = 0; w < pab.length; w++) {
        PakUni pa =(PakUni) pab[w][1];
        pab[w][1] = pa.getNum_of_publish();
    }   
  
    Arrays.sort(pab , Comparator.comparingInt(a -> (int) a[1]));
   
    Object sortpab [][] = new Object [city.length][2];
    for(int l = 0;l<pab.length;l++){
        sortpab[l][0]=pab[l][0];
        sortpab[l][1]=pab[l][1];

    }

for(int m=0;m<sortpab.length;m++){
    for (int n = 0; n < 2; n++) {
        System.out.print (sortpab[m][n] + "  ");
    }
    System.out.println();
}

int v = 0;
for (java.util.Map.Entry<String, PakUni> e : uni.entrySet()) {
    city[v][0]=e.getKey();
    city[v][1]=e.getValue();
    v++;

}

int a = 0;
int b = 0;
int c = 0;
int d = 0;
int g = 0;
// fatch key of the universities according to their proveince from hash table
for (int u = 0; u < uni.size(); u++) {
    PakUni pa = (PakUni) city[u][1];
    city[u][1] = pa.getaddress();
       if(city[u][1].equals("Jamshoro") ||  city[u][1].equals("TamdoJam ") || city[u][1].equals("Nawabshah") || city[u][1].equals("khairpur") || city[u][1].equals("Hyderabad")|| city[u][1].equals("Sukkur ") || city[u][1].equals("Karachi") ){
                sindhkey[a] =city[u][0];
                a++;
                
              
            }
            else if ( city[u][1].equals("Faisalabad") || city[u][1].equals("Lahore") || city[u][1].equals("Rawalpindi ") || city[u][1].equals("Bahawalpur")|| city[u][1].equals("Islamabad")|| city[u][1].equals("Taxila") || city[u][1].equals("Sargodha")|| city[u][1].equals("Sialkot")|| city[u][1].equals("Multan")|| city[u][1].equals("gujrat")){
                punjabkey[b] =city[u][0];
                b++;
            }
            else if ( city[u][1].equals("Peshawar") || city[u][1].equals("Haripur") || city[u][1].equals("Mardan ") || city[u][1].equals("Kohat")|| city[u][1].equals("Hazana")|| city[u][1].equals("Dera Ismail Khan") || city[u][1].equals("Totaken")|| city[u][1].equals("Bannu")|| city[u][1].equals("Kohat")|| city[u][1].equals("Topi")|| city[u][1].equals("Swat")){
                kpkkey[c]=city[u][0];
              c++;
            }
            else if(city[u][1].equals("Quetta")){
                balochkey[d] =  city[u][0];
            d++;
            }
            else if(city[u][1].equals("Gilgit")){
           gilgitkey[g] = city[u][0];
           g++;
            }
}
// for (int i = 0; i < gilgitkey.length; i++) {
//     System.out.println(gilgitkey[i]);
// }
for (int s = 0; s < 100; s++) {
    for (int t = 0; t < sindhkey.length; t++){ 
    if(sortpab[s][0].equals(sindhkey[t])){
    Sindh.push((String)sortpab[s][0]);
      
} 

else if(sortpab[s][0].equals(balochkey[t])){
    balochistan.push((String)sortpab[s][0]);
    
}
else if(sortpab[s][0].equals(kpkkey[t])){
    khyber.push((String)sortpab[s][0]);

}
else if(sortpab[s][0].equals(punjabkey[t])){
    punjab.push((String)sortpab[s][0]);
    
}

else if(sortpab[s][0].equals(gilgitkey[t])){
    gilgit.push((String) sortpab[s][0]);
}
}
}
System.out.println(Sindh.size());
Scanner scan = new Scanner(System.in);
System.out.println("Which provience you want to see the best and worst university");
System.out.println("******************************");
System.out.println("1 : Sindh ");
System.out.println("2 : Punjab ");
System.out.println("3 : Balochistan ");
System.out.println("4 : Khyber pakhtunkhwa ");
System.out.println("5 : Gilgit  ");
System.out.println("******************************");

int input = scan.nextInt();
switch (input) {
    case 1:
    
        String key = Sindh.pop();
        PakUni obj = uni.get(key);
        System.out.println("***********************************************");
        System.out.println("The High Publication  university of sindh is " );
        System.out.println("***********************************************");
        System.out.println("Name : "+ obj.getName());
        System.out.println("Word Ranking : "+ obj.getWord_rank());
        System.out.println("Pakistan Ranking : "+obj.getPak_rank());
        System.out.println("Asia Ranking "+ obj.getAsia_rank());
        System.out.println("Location : "+obj.getaddress());
        System.out.println("Publication  : "+obj.num_of_publish);
        System.out.println();
        System.out.println("***********************************************");  
        System.out.println("The low Publication  university of sindh is ");
        System.out.println("***********************************************");
       Bottom(Sindh, uni);
        break;
    case 2:
   
    punjab.Disply();
       String toppunj = punjab.pop();
       PakUni obj1 = uni.get(toppunj);
       System.out.println("***********************************************");
       System.out.println("The High Publication university of Punjab is " );
       System.out.println("***********************************************");
       System.out.println("Name : "+ obj1.getName());
       System.out.println("Word Ranking : "+ obj1.getWord_rank());
       System.out.println("Pakistan Ranking : "+obj1.getPak_rank());
       System.out.println("Asia Ranking "+ obj1.getAsia_rank());
       System.out.println("Location : "+obj1.getaddress());
       System.out.println("Publication  : "+obj1.num_of_publish);
       System.out.println();
       System.out.println("***********************************************");  
        System.out.println("The low Publication  university of punjab is ");
        System.out.println("***********************************************");
       Bottom(punjab, uni);       
        break;
    case 3:
    
        balochistan.Disply();
       String topbaloc = balochistan.pop();
       PakUni obj2 = uni.get(topbaloc);
       System.out.println("***********************************************");
       System.out.println("The High Publication university of balocistah is " );
       System.out.println("***********************************************");
       System.out.println("Name : "+ obj2.getName());
       System.out.println("Word Ranking : "+ obj2.getWord_rank());
       System.out.println("Pakistan Ranking : "+obj2.getPak_rank());
       System.out.println("Asia Ranking "+ obj2.getAsia_rank());
       System.out.println("Location : "+obj2.getaddress());
       System.out.println("Publication  : "+obj2.num_of_publish);
       System.out.println();
       System.out.println("***********************************************");  
        System.out.println("The low Publication  university of Balochistan is ");
        System.out.println("***********************************************");
       Bottom(balochistan, uni);
       break;
    case 4 :
   
        khyber.Disply();
       String topkpk = khyber.pop();
       PakUni obj3 = uni.get(topkpk);
       System.out.println("***********************************************");
       System.out.println("The High Publication university of Khyber is " );
       System.out.println("***********************************************");
       System.out.println("Name : "+ obj3.getName());
       System.out.println("Word Ranking : "+ obj3.getWord_rank());
       System.out.println("Pakistan Ranking : "+obj3.getPak_rank());
       System.out.println("Asia Ranking "+ obj3.getAsia_rank());
       System.out.println("Location : "+obj3.getaddress());
       System.out.println("Publication  : "+obj3.num_of_publish);
       System.out.println();
       System.out.println("***********************************************");  
        System.out.println("The low Publication  university of Khyber is ");
        System.out.println("***********************************************");
       Bottom(khyber, uni); 
       break;
    case 5 :
    MyStack<String > clonegilgit = gilgit.duplicate();
        gilgit.Disply();
       String topgilgit = clonegilgit.pop();
       PakUni obj4 = uni.get(topgilgit);
       System.out.println("***********************************************");
       System.out.println("The High Publication university of gilgit is " );
       System.out.println("***********************************************");
       System.out.println("Name : "+ obj4.getName());
       System.out.println("Word Ranking : "+ obj4.getWord_rank());
       System.out.println("Pakistan Ranking : "+obj4.getPak_rank());
       System.out.println("Asia Ranking "+ obj4.getAsia_rank());
       System.out.println("Location : "+obj4.getaddress());
       System.out.println("Publication  : "+obj4.num_of_publish);
       System.out.println();
       System.out.println("***********************************************");  
        System.out.println("The low Publication  university of Gilgit is ");
        System.out.println("***********************************************");
       Bottom(gilgit, uni);
        break;

    default:
        break;
}
// top university of sindh is 

// 3
// // System.out.println("The university of balochistan is ");
// // khyber.Disply();
// // }
}}
    
