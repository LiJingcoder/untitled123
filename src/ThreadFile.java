import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class ThreadFile extends FilesText implements Runnable{
    public void run() {
        File f1 = new File("word.txt");
        try {
            FileInputStream in = new FileInputStream(f1);
            byte[] bytes = new byte[256];
            in.read(bytes);
            System.out.print(new String(bytes));
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ThreadFile my = new ThreadFile();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
    }
}

