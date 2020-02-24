import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class IOClass {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("data/info.txt")) {
            int code = input.read();
            System.out.println(code + " char = " + (char)code);
            byte[] ar = new byte[16];
            int num = input.read(ar);
            System.out.println("num = " + num);
            System.out.println(Arrays.toString(ar));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
