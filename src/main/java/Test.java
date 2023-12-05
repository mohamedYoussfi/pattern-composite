import fs.File;
import fs.Folder;

/**
 * @author mohamedyoussfi
 **/
public class Test {
    public static void main(String[] args) {
        Folder root =new Folder("Root");
        root.add(new File("Java.txt"));
        root.add(new File("pom.xml"));
        Folder src = (Folder) root.add(new Folder("src"));
        src.add(new File("data.csv"));
        src.add(new File("config.txt"));
        Folder org = (Folder) src.add(new Folder("org"));
        src.add(new File("config2.txt"));
        org.add(new File("data.bin"));
        root.afficher();
    }
}
