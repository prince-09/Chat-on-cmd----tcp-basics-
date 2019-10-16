import java.io.*;
import java.net.*;

public class Com2{
  public static void main(String[] args)throws Exception{
        try{
            String ipaddr = ""; // write here ip addr of com 1  
            Socket s = new Socket(ipaddr,7);
            
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            Scanner sc = new Scanner(System.in);
            String str1;
            do{
                str1 = sc.nextLine();
                dout.writeUTF(str1);
                dout.flush();
            }while(str1.charAt(0) != '-');
            dout.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    } 
  
  
}
