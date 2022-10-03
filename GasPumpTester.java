

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vighanesh
 */
public class GasPumpTester{
    public static void main (String[] args){
        GasPumpDisplay d = new GasPumpDisplay(3);
        int f=1;
        int i=0;
        int countdisplay=0;
           while(f==1)
           {
              
               if(d.nextElement(Integer.toString(i)).equals("")==false){
              
                   System.out.print(d.nextElement(Integer.toString(i))+" ");
                 countdisplay=countdisplay+1;
                 if((countdisplay%20)==0)
                  System.out.println();
                   if(d.hasMoreElements())
                       f=1;
                   else
                       f=0;
                   i=i+1;
                   
               }
              else
               {
              i=i+1;
              
               
           }
           }
    }
}
               
            
            
