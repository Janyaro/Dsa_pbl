
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.server.ObjID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;
import java.util.Map.Entry;


public class Maain {
    public static void SortPublication(Hashtable<String, PakUni> uni , ArrayList<PakUni> list) {
        int i=0;
        // Saved value and key in seprate array 
         Object [][] PubData = new Object [list.size()][2];
         for (Entry<String , PakUni> e :   ( uni.entrySet())) {
            PubData[i][0] =e.getValue();
            PubData[i][1]=e.getKey() ;
            i++;
         }
         // get published in the stack
         for(int j=0;j<PubData.length;j++) {
             Object obj =  PubData[j][1];
             PubData[j][1]=((PakUni) obj).getNum_of_publish();
         }
         // sort it data
         Arrays.sort(PubData);
         Stack st = new Stack<>();
         for (int index = PubData.length; index >= 0; index--) {
             st.push(PubData[index][0]);
         }
    }
    public static void main(String[] args) throws IOException {
      ArrayList<PakUni> list = new ArrayList<>();
        Hashtable<String , PakUni> uni = new Hashtable<>(100);
        // get file from location
        File csvfile = new File("pak unis.csv");
        // read csv file using buffer reader
        BufferedReader bf = new BufferedReader(new FileReader(csvfile)); 

        bf.readLine();
        String line =" ";
 while ((line=bf.readLine())!=null) {
String  attributies[] = line.split(",");
// System.out.println(Arrays.toString(attributies));
String name = attributies[0];
String Wrank = attributies[1];
String Arank = attributies[2];
String prank  = attributies[3];
String loc = attributies[4];
int   no_pub =Integer.parseInt(attributies[5]);

PakUni pak = new PakUni(name, Wrank, Arank, prank, loc ,no_pub);
// add data into arraylist 
list.add(pak);
// System.out.println(pak.toString());
}
System.out.println("Data store in the university is successful");
  
// add university data in hash table
   uni.put("AbUn", list.get(0)); // Abasyn University
   uni.put( "Awku",list.get(1)); // Abdul walid khan Uni
   uni.put("Agku", list.get(2));//Agha khan uni
   uni.put("Airu", list.get(3)); //Air uni
   uni.put("Baku", list.get(4));//Bacha khan uni
   uni.put("Bazu", list.get(5));//bahauddin zakariya uni
   uni.put("bahu", list.get(6));//bahria uni
   uni.put("Buit", list.get(7));//balochistan uni of inf and tech 
   uni.put("Bamu", list.get(8));// baqai medical uni
   uni.put("Benu", list.get(9));//Beaconhouse national uni
   uni.put("CECU", list.get(10));// cecos uni 
   uni.put("Coit", list.get(11));//comsts istitute of inf tech
   uni.put("Duet", list.get(12));//dawood uni of eng tech
   uni.put("DUHS", list.get(13));//dow uni of health scince
   uni.put("FJMU", list.get(14));//fatima jannah medical university
   uni.put("FJWU", list.get(15));//fatima jannah woman uni 
   uni.put("Fuas", list.get(16));//faderal urdu uni of art science and tech
   uni.put("FOCC", list.get(17));//Forman Christian College
   uni.put("FOUI", list.get(18));//Foundation University Islamabad
   uni.put("GIKT", list.get(19));//Ghulam Ishaq Khan Institute of Engineering Sciences and Technology 
   uni.put("GOUN", list.get(20));//Gomal University
   uni.put("GCWU", list.get(21));//Government College for Women University
   uni.put("GCUF", list.get(22));//Government College University; Faisalabad
   uni.put("GCUL", list.get(23));//Government College University; Lahore
   uni.put("GWUN", list.get(24));//Government College Women University
   uni.put("HAUN", list.get(25));//Hamdard University
   uni.put("HAZU", list.get(26));//Hazara University
   uni.put("HITU", list.get(27));//HITEC University 
   uni.put("IUPA", list.get(28));//Indus University Pakistan
   uni.put("ITUN", list.get(29));//Information Technology University
   uni.put("IBAU", list.get(30));//Institute of Business Administration
   uni.put("ISTE", list.get(31));//Institute of Space Technology
   uni.put("ILUN", list.get(32));//International Islamic University
   uni.put("IQRA", list.get(33));//Iqra University
   uni.put("ICPE", list.get(34));//Islamia College Peshawar
   uni.put("ILBH", list.get(35));//Islamia University of Bahawalpur
   uni.put("ISRA", list.get(36));//Isra University
   uni.put("JSMU", list.get(37));//Jinnah Sindh Medical University 
   uni.put("JUWO", list.get(38));//Jinnah University for Women
   uni.put("KIET", list.get(39));//Karachi Institute of Economics and Technology
   uni.put("KIUN", list.get(40));//Karakurum International University
   uni.put("KHMU", list.get(41));//Khyber Medical University
   uni.put("KEMU", list.get(42));//King Edward Medical University
   uni.put("KICW", list.get(43));//Kinnaird College for Women
   uni.put("KUST", list.get(44));//Kohat University of Science and Technology
   uni.put("LCWU", list.get(45));//Lahore College for Women University
   uni.put("LSEU", list.get(46));//Lahore School of Economics
   uni.put("LUMS", list.get(47));//Lahore University of Management Sciences
   uni.put("LUMH", list.get(48));//Liaquat University of Medical and Health Sciences
   uni.put("MUET", list.get(49));//Mehran University of Engineering and Technology
   uni.put("MUST", list.get(50));//Mirpur University of Science and Technology
   uni.put("MIJU", list.get(51));//Mohammad Ali Jinnah University
   uni.put("NBAE", list.get(52));//National College of Business Administration and Economics
   uni.put("NADU", list.get(53));//National Defence University
   uni.put("NATU", list.get(54));//National Textile University
   uni.put("NUCS", list.get(55));//National University of Computer and Emerging Sciences
   uni.put("NUML", list.get(56));//National University of Modern Languages
   uni.put("NUST", list.get(57));//National University of Sciences and Technology
   uni.put("NEDU", list.get(58));//NED University of Engineering and Technology
   uni.put("PIDE", list.get(59));//Pakistan Institute of Development Economics
   uni.put("PIEA", list.get(60));//Pakistan Institute of Engineering and Applied Sciences
   uni.put("MASA", list.get(61));//Pir Mehr Ali Shah Arid Agriculture University
   uni.put("PREU", list.get(62));//Preston University
   uni.put("QUST", list.get(63));//Quaid-e-Awam University of Engineering; Science and Technology
   uni.put("QUID", list.get(64));//Quaid-i-Azam University
   uni.put("RPMU", list.get(65));//Rawalpindi Medical University
   uni.put("RIUN", list.get(66));//Riphah International University
   uni.put("SUST", list.get(67));//Sarhad University of Science and Information Technology
   uni.put("SALU", list.get(68));//Shah Abdul Latif University
   uni.put("SBWU", list.get(69));//Shaheed Benazir Bhutto Women University
   uni.put("SZST", list.get(70));//Shaheed Zulfiqar Ali Bhutto Institute of Science and 
   uni.put("SIND", list.get(71));//Sindh Agriculture University
   uni.put("SWIU", list.get(72));//Sindh Madresatul Islam University
   uni.put("SSUE", list.get(73));//Sir Syed University of Engineering and Technology
   uni.put("SIBA", list.get(74));//Sukkur Institute of Business Administration
   uni.put("UAFA", list.get(75));//University of Agriculture; Faisalabad
   uni.put("UAPE", list.get(76));//University of Agriculture; Peshawar
   uni.put("UAJK", list.get(77));//University of Azad Jammu and Kashmir
   uni.put("UBAL", list.get(78));//University of Balochistan
   uni.put("UCPA", list.get(79));//University of Central Punjab
   uni.put("UEPA", list.get(80));//University of Education - Pakistan
   uni.put("UETL", list.get(81));//University of Engineering and Technology lahore
   uni.put("UETP", list.get(82));//University of Engineering and Technology; Peshawar
   uni.put("UETT", list.get(83));//University of Engineering and Technology; Taxila
   uni.put("UGUJ", list.get(84));//University of Gujrat
   uni.put("UHAR", list.get(85));//University of Haripur
   uni.put("UHSL", list.get(86));//University of Health Sciences; Lahore 
   uni.put("UKCH", list.get(87));//University of Karachi
   uni.put("UNLA", list.get(88));//University of Lahore
   uni.put("UNML", list.get(89));//University of Malakand
   uni.put("UMTL", list.get(90));//University of Management and Technology - Lahore
   uni.put("UNPS", list.get(91));//University of Peshawar
   uni.put("USAR", list.get(92));//University of Sargodha
   uni.put("USTB", list.get(93));//University of Science and Technology; Bannu
   uni.put("UNSI", list.get(94));//University of Sindh
   uni.put("SWAT", list.get(95));//University of Swat
   uni.put("PNBU", list.get(96));//University of the Punjab
   uni.put("UVAS", list.get(97));//University of Veterinary and Animal Sciences
   uni.put("UWAH", list.get(98));//University of Wah
   uni.put("ZIAU", list.get(99));//Ziauddin University
   System.out.println("Data savd hash table is successful");
   
   bf.close();	
int i=0;
// Saved value and key in seprate array 
 Object PubData[][] = new Object [list.size()][2];
 for (Entry<String , PakUni> e :    uni.entrySet()) {
    PubData[i][0] =e.getKey();
    PubData[i][1]=e.getValue() ;
    i++;
 }
 // get published in the stack
 for(int j=0;j<PubData.length;j++) {
     PakUni obj = (PakUni) PubData[j][1];
     PubData[j][1]= obj.getNum_of_publish();
 }
 // sort it data
Arrays.sort(PubData ,Comparator.comparingInt(a -> (int)a[1]));
 
 MyStack st = new MyStack<>();
 for (int index = PubData.length-1; index >= 0; index--) {
     st.push(PubData[index][0]);

}

System.out.println("Data sorted is complete");
st.Disply();
// take data from hash and store it into array to easily fatchd it
int m =0;
Object [][] sortRank = new Object[list.size()][2];
for (Entry<String , PakUni> f : uni.entrySet()) {
    sortRank[m][0]=f.getKey();
    sortRank[m][1]=f.getValue();
    m++;
}
// fatched data to sort it to store in the stack
for(int j=0;j<sortRank.length;j++) {
    PakUni obj = (PakUni) sortRank[j][1];
    // Remove / between the Pakistan Ranking 
    sortRank[j][1]=Integer.parseInt(obj.getPak_rank().substring(0,obj.getPak_rank().length()-6));

}

// sorted the university based on the  ranking
 Arrays.sort(sortRank , Comparator.comparingInt(a -> (int)a[1]) );
 System.out.println("pakistan ranking is sorted");
// add sort data in the stack based on the Pak ranking
 MyStack sortRanking = new MyStack<>();
for (int j = 0; j < sortRank.length; j++) {
    sortRanking.push(sortRank[j][0]);
}

}
   
}