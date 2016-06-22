/**
 * Created by rotems on 6/22/16.
 */

import java.io.File;
import net.sourceforge.tess4j.*;

public class A {

    public static void main(String[] args) {
        File imageFile = new File("/Users/rotems/dev/IdeaProjects/sensorme/src/main/resources/4_360.jpg");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping
        instance.setDatapath("/usr/local/share/tessdata");

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}