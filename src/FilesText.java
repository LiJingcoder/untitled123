import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FilesText {
    public static void main(String[] args) {
        File file = new File("word.txt");
        try {
            FileOutputStream out = new FileOutputStream(file);
            String content = "你见过凌晨四点重邮的样子吗？";
            byte[] buy=content.getBytes();
            out.write(buy);
            out.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}