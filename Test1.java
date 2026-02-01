//Byte stream 

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        os.write(65);   // ASCII value of 'A'
        os.flush();
    }
}
