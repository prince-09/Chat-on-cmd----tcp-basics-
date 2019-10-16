import java.io.*;
import java.net.*;

public class Com1{
  public static void main(String[] args) throws Exception{
        try{
            ServerSocket ss = new ServerSocket(7);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            String str = (String)din.readUTF();
            System.out.println(str);
            do{
                str = (String)din.readUTF();
                System.out.println(str);
            }while(str.charAt(0) != '-');
        }
        catch(Exception e){
            System.out.println(e);
        }
    }  
  
}
