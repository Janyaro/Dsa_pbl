import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Maain {
    public static void main(String[] args) throws IOException {
        ArrayList<PakUni> list = new ArrayList<>();
        MyHashtable<String , Object> uni = new MyHashtable<>(100);
        // get file from location
        File csvfile = new File("Pakuniversities.csv");
        // read csv file using buffer reader
        BufferedReader bf = new BufferedReader(new FileReader(csvfile));
        String line = bf.readLine();
        
        while (line!=null) {
String [] attributies = line.split(",");
String name = attributies[0];
String Wrank = attributies[1];
String Arank = attributies[2];
String prank  = attributies[3];
String loc = attributies[4];
// int no_pub =Integer.parseInt( attributies[5]);
int no_pub =12;
PakUni pk = new PakUni(name, Wrank, Arank, prank, loc, no_pub);
list.add(pk);
}
System.out.println("Data store in the university is successful");
  
// add university data in hash table

}
}