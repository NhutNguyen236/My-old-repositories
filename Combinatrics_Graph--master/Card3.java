//implement some operations in file from object serialization of the class Card3 and it is a .java file
import java.io.*;
public class Card3 implements Serializable{
    private String Name;
    private String Rank;
    
    public Card3(String name, String rank){
        this.Name = name;
        this.Rank = rank;
    }

    public String getCardName(){
        return this.Name;
    }
    
    public void setCardName(String name){
        this.Name = name;
    }
    
    public String getCardRank(){
        return this.Rank;
    }
    
    public void setCardRank(String rank){
        this.Rank = rank;
    }
}
