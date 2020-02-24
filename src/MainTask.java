import java.io.*;

public class MainTask {
    public static void main(String[] args) {
        File file = new File(args[0]);

        if (!file.exists()) {
            System.err.println("File or directory doesn't exist");
            System.exit(1);
        }

        if (file.isDirectory()){
            try (PrintStream stream = new PrintStream(new FileOutputStream("data/out.txt"))) {
                showDir(1, file, stream);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Parent path: " + file.getParent());
            System.out.println("File size: " + file.length());
            System.out.println("File Last modified: " + file.lastModified());
        }
    }

    static void showDir(int indent, File file, PrintStream stream) {
        for (int i = 0; i < indent; i++)
            stream.print('-');
        stream.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
                showDir(indent + 1, files[i], stream);
        }
    }
}
