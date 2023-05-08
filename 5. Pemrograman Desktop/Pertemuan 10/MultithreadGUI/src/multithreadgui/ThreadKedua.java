/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadgui;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
*
* @author Alya Aiman Salsabila Arif
*/
public class ThreadKedua extends Thread{
    private MultithreadGUI f;
    
    public ThreadKedua(MultithreadGUI f){
        this.f = f;
    }
    @Override
    public void run() {
        //body of Thread
        for (int i=0;i<20;i++) {
            f.setMyLabelKedua(String.valueOf(i));
            try {
                Thread.sleep(900);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadPertama.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } 
    } 
}