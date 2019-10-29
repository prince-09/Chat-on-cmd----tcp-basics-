import java.io.*;
import java.net.*;
import java.util.*;

public class at{
  public static void main(String[] args)throws Exception{
        try{
            String ipaddr = "127.0.0.1"; // write here ip addr of com 1  
            Socket socket = new Socket(ipaddr,7);
            boolean ind=false;
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            DataInputStream in=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String opt="";
            String line="";
            String echo="";
           
            Scanner sc = new Scanner(System.in);
            String str1;
            while(!opt.equals("Bye")){
                if(!ind){
                do{
                    opt = sc.nextLine();
                    ind=true;
                    out.writeUTF(opt);
                }while(!opt.equals("over")&&!opt.equals("Bye"));
            }
            else{
                do{
                    opt=in.readUTF();  
                    ind=false;
                    System.out.println(opt);
                }while(!opt.equals("over")&&!opt.equals("Bye"));
            }
            }
           
        }
        catch(Exception e){
            System.out.println(e);
        }
    } 
  
  
}
