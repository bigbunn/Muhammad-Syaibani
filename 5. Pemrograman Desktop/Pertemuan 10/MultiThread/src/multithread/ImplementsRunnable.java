/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public class ImplementsRunnable implements Runnable {
    @Override
    public void run()   {
        try {
            for (int i=1; i<=5; i++)    {
                System.out.println("cetak data ke : " + i);
                Thread.sleep(600);
            }
        }   catch(Exception e)  {
            e.printStackTrace();
        }
    }
    public static void main (String args[]) {
        ExtendsThread t1 = new ExtendsThread();
        t1.start();
    }
}
