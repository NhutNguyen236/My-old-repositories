import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.time.LocalTime;
public class Chatbot extends JFrame{
    private JTextArea chatarea = new JTextArea();
    private JTextField chatbox = new JTextField();
    public Chatbot(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setTitle("Jarvis");
        frame.add(chatarea);
        frame.add(chatbox);
        
        //FOR TEXTAREA
        chatarea.setSize(500,400);
        chatarea.setLocation(2,2);
        
        //FOR TESTFIELD
        chatbox.setSize(540,30);
        chatbox.setLocation(1,410);
        
        chatbox.addActionListener(new ActionListener(){
            public void TimeCompare(){
                LocalTime currentTime = LocalTime.now();
            }
            @Override
            public void actionPerformed(ActionEvent arg0) {
                LocalTime currentTime = LocalTime.now();
                String gtext = chatbox.getText();
                chatarea.append("USER: " + gtext + "\n");
                chatbox.setText("");
                if(gtext.toLowerCase().matches("(.*)name(.*)")||gtext.toLowerCase().matches("(.*)who are you(.*)")){
                    Jarvis("My name is Jarvis sir and I am Mr.Stark's assistant");
                }
                if(gtext.toLowerCase().matches("(.*)hey(.*)")){
                    TimeCompare JarvisgetTime = new TimeCompare();
                    Jarvis(JarvisgetTime.compareresult());
                }
                if(gtext.toLowerCase().matches("(.*)hi(.*)") || gtext.toLowerCase().matches("(.*)hello(.*)")){
					if(gtext.toLowerCase().matches("(.*)shit(.*)")){
						Jarvis("This is so impolite to swear that way sir, please be more specific this time");
					}
					else{
                                                TimeCompare JarvisgetTime = new TimeCompare();
                                                Jarvis(JarvisgetTime.compareresult());
					}
                }
                if(gtext.toLowerCase().matches("(.*)time(.*)")){
                    Jarvis("The current time is " + currentTime + " sir");
                }
                if(gtext.toLowerCase().matches("(.*)time(.*)") && gtext.toLowerCase().matches("(.*)tomorrow(.*)")){
                    Jarvis("The current time is " + currentTime + " sir");
                }
                if(gtext.toLowerCase().matches("(.*)fuck(.*)")){
                    Jarvis("It is impolite to swear sir, please be more specific this time");
                }
                if(gtext.toLowerCase().matches("(.*)sorry(.*)")){
                    Jarvis("It is alright sir let not do it again");
                }
                throw new UnsupportedOperationException("Sir please be more specific?"); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
       
    }
     private void Jarvis(String string){
            chatarea.append("JARVIS: " +string+ "\n");
            
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();
        // TODO code application logic here
    }
    
}
