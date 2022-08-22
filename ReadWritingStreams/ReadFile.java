import java.io.*;

/// Reading 
class ReadFile {
    public static void main(String[] args) throws Exception {
        int ch;
        FileInputStream f = new FileInputStream("data.txt");
        while ((ch = f.read()) != -1) {
            System.out.print((char) ch);
        }

        f.close();
    }
}