import java.io.*;
import java.net.*;
import java.util.*;

public class at{
  public static void main(String[] args)throws Exception{
        try{
            String ipaddr = "127.0.0.1"; // write here ip addr of com 1  
            Socket socket = new Socket(ipaddr,7);
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            DataInputStream in=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String opt="";
            String line="";
            String echo="";
           
            Scanner sc = new Scanner(System.in);
            String str1;
            while(!opt.equals("Bye")){
                do{
                    line = sc.nextLine();
                    out.writeUTF(line);
                }while(!line.equals("over"));
                do{
                    echo=in.readUTF();  
                }while(!line.equals("over"));
            }
           
        }
        catch(Exception e){
            System.out.println(e);
        }
    } 
  
  
}
