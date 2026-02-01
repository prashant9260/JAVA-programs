import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        os.write('ᛞ');
        os.flush();
    }
}
