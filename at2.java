import java.io.*;
import java.net.*;
import java.util.Scanner;

public class at2{
  public static void main(String[] args) throws Exception{
        try{
            ServerSocket ss = new ServerSocket(7);
            Socket socket;
            System.out.println("Server Started");
            System.out.println("Waiting....");
            socket=ss.accept();
            String opt="";
            String line="";
            boolean ind=true;
            String msg="";
            Scanner sc=new Scanner(System.in);
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            DataInputStream in=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            while(!opt.equals("Bye")){
                if(ind){
                    do{
                        opt=in.readUTF();
                        System.out.println(opt);
                      
                    }while(!opt.equals("over")&&!opt.equals("Bye"));
                    ind=false;
                }
                else{
                    System.out.print("your turn");
                    do{
                        opt=sc.nextLine();
                        ind=true;
                        out.writeUTF(opt);
                    }while(!opt.equals("over")&&!opt.equals("Bye"));
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }  
  
}