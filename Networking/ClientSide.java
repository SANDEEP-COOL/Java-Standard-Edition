import java.io.*;
import java.net.*;


public class ClientSide {
    
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    public ClientSide (String address, int port) {
        try {
            socket = new Socket(address, port);

            System.out.println("connected...");

            // input from terminal 
            input = new DataInputStream(System.in);

            // send input to socket 
            output = new DataOutputStream(socket.getOutputStream());
        }
        catch(UnknownHostException u) {
            System.out.println(u);
        }
        catch(IOException e) {
            System.out.println(e);
        }

        String line = "";

        // keep reading untill end is input 
        while(!line.equals("END")) {

            try {

                line = input.readLine();
                output.writeUTF(line);

            }
            catch(IOException e) {
                System.out.println(e);
            }

        }

        try{
            input.close();
            output.close();
            socket.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        
        ClientSide client = new ClientSide("45.249.87.86", 12345);

    }

}
