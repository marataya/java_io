import java.io.*;

public class OptionalTask {
    public static void main(String[] args) throws IOException {
        var randNumbersArr = new int[100];

        for (int i = 0; i < randNumbersArr.length; i++) {
            randNumbersArr[i] = (int) Math.ceil(Math.random()*100);
        }

        String fileSeparator = System.getProperty("file.separator");
        String userDir = System.getProperty("user.dir");
        File outputFile = new File(userDir+fileSeparator+"data"+fileSeparator+"output_Ex01.txt");
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
            pw.println("Random 100 numbers:");
            for (int i = 0; i < randNumbersArr.length; i++) {
                if (i % 10 == 0) {
                    pw.println();
                    pw.print(randNumbersArr[i] + "\t");
                }
                else
                    pw.print(randNumbersArr[i] + "\t");
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File javaFile = new File("");

    }
}
