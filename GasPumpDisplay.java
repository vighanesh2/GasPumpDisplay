/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Vighanesh
 */
public class GasPumpDisplay{
public GasPumpDisplay (int numberOfPosition){
        digits=numberOfPosition;
        
      
    }
public String nextElement (String ne){
    currentDigit=Integer.parseInt(ne);
    int flag=0;
    int cd=currentDigit;
    while(cd!=0)
    {
    int d=cd%10;
    if(d>MAX_DIGIT)
       flag=1;
    cd=cd/10;
    }
    if(flag==0)
    {
if(currentDigit<10)
    ne="00"+ne;
else if(currentDigit<100)
    ne="0"+ne;
    }
    else
        ne="";

return(ne) ;

}



public Boolean hasMoreElements (){
    int c=digits;
    String hd="";
    while(c!=0)
    {
      hd=hd+Integer.toString(MAX_DIGIT);
      c=c-1;
    }
    highestdigit=Integer.parseInt(hd);
   
   return((currentDigit+1)<=(highestdigit));
}

private final int digits;
private GasPumpDisplay tail;
private int currentDigit;
private static final int MAX_DIGIT=4;
private int highestdigit;
}
     

