/*
this method reads the Card3 object from card. out and write its 
value to another file. For example: Card read is: Ace of Spades
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class CardReader {
    @SuppressWarnings("empty-statement")
    public static void main(String args[]){
        Card3 o = null;
        try{
            FileInputStream fis = new FileInputStream("card.out");
            ObjectInputStream ois = new ObjectInputStream(fis);
            o = (Card3)ois.readObject();
            ois.close();;
            fis.close();
        }
        catch(ClassNotFoundException | IOException cnfe){
            System.out.print(cnfe.getMessage());
        }
        
        System.out.println("Card read is: " + o.getCardRank() + " of " + o.getCardName());
    }
}
