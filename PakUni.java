

public class PakUni {
   String name;
  String Word_rank;
  String Asia_rank;
  String Pak_rank;
  String address;
  int  num_of_publish;
   
  PakUni(){

   }
   PakUni(String name , String wrank , String Arank , String Prank   , String loc,int  pub ){
    this.name=name;
    this.Word_rank=wrank;
    this.Asia_rank=Arank;
    this.Pak_rank=Prank;
    this.address=loc;
    this.num_of_publish=pub;

   }
   // convert object to String
    public String toString (){
        return name + " "+ Word_rank+" "+Asia_rank+" "+Pak_rank+" "+address+" "+num_of_publish+" ";
    }
    //  getter to set the value 
    public String getName() {
        return name;
    }
        public String getWord_rank() {
        return Word_rank;
    }
    public String getAsia_rank() {
        return Asia_rank;
    }
    
    public String getPak_rank() {
        return Pak_rank;
    }
    
    public String getaddress() {
        return address;
    }

    public int getNum_of_publish() {
        return num_of_publish;
    }

}
