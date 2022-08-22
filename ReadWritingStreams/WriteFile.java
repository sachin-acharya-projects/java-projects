import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws Exception {
        FileOutputStream f = new FileOutputStream(new File("data.txt"));
        String s = "This is a test";
        byte[] b = s.getBytes();
        f.write(b);
        f.close();
    }
}