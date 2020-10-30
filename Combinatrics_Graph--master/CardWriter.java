/*CardWriter that creates a Card3 instance and serializes 
it’s value into a file named card.out. 
Here is an example of what CardWriter might display: Card to write is: Ace of Spades
*/
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class CardWriter {
    public static void main(String args[]){
        Card3 obj = new Card3("Spades","Ace");
        try{
            FileOutputStream fos = new FileOutputStream("card.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            fos.close();
            oos.close();
            System.out.println("Card to write is: " + obj.getCardRank() + " of " + obj.getCardName());
        }
        catch(IOException ioe){
            System.out.print(ioe.getMessage());
        }
    }
}
