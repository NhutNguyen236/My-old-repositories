/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * this is for you, Jarvis
 */

/**
 *
 * @author NguyenNhut
 */
import java.time.LocalTime;
public class TimeCompare{
    public String compareresult(){
        String answer = null;
        LocalTime currentTime = LocalTime.now();
        LocalTime midDay = LocalTime.of(12, 00, 00);
        LocalTime sixOclock = LocalTime.of(6, 00, 00);
        LocalTime evening = LocalTime.of(18,00,00);
        LocalTime midNight = LocalTime.of(00, 00, 00);
        LocalTime ninepm = LocalTime.of(21, 00, 00);
        LocalTime lateNight = LocalTime.of(23, 00, 00);
        int midDaycompare = currentTime.compareTo(midDay);
        int sixOclockcompare = currentTime.compareTo(sixOclock);
        int eveningcompare = currentTime.compareTo(evening);
        int ninepmcompare = currentTime.compareTo(ninepm);
        int midNightcompare =  currentTime.compareTo(midNight);
        int lateNightcompare = currentTime.compareTo(lateNight);
        if(midDaycompare<=0 && sixOclockcompare>=0){
            answer = "Good Morning sir, what can I do to help sir?";
        }
        else{
            if(midDaycompare>=0 && eveningcompare<=0){
                answer = "Good afternoon sir, what can I do to help sir?";
            }
            else{
                if(eveningcompare>=0 && ninepmcompare<=0){
                    answer = "Good evening sir, what can I do to help sir?";
                }
                else{
                    if(ninepmcompare>=0 && lateNightcompare<=0){
                        answer = "It is late sir, please consider going to bed";
                    }
                    else{
                        if(midNightcompare>=0 && sixOclockcompare<=0){
                            answer = "It is not suitable time to wake up sir, consider going to bed again!";
                        }
                    }
                }
            }
        }
        return answer;
    }
}
