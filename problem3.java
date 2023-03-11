
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;


public class problem3{
    /**
     * @param uni
     */
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
        Object gilgitkey [ ] = new Object[10];
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
            else if ( city[u][1].equals("Faislabad") || city[u][1].equals("Lahore") || city[u][1].equals("Rawalpindi ") || city[u][1].equals("Bahawalpur")|| city[u][1].equals("Islamabad")|| city[u][1].equals("Taxila") || city[u][1].equals("Sargodha")|| city[u][1].equals("Sialkot")|| city[u][1].equals("Multan")|| city[u][1].equals("gujrat")){
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
           gilgitkey[g++] = city[u][0];
            }
}

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
}
}
System.out.println("The key of the university are ");
for(int z = 0 ; z<kpkkey.length;z++){
    System.out.println(sindhkey[z]);
}
System.out.println("The univerity of sindh are ");
Sindh.Disply();
// System.out.println("The university of balochistan is ");
// khyber.Disply();
// }
}}
    
