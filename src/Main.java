import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File gamesDirectory = new File("C:\\Games");


        File srcDirectory = new File(gamesDirectory, "src");
        srcDirectory.mkdir();

        File resDirectory = new File(gamesDirectory, "res");
        resDirectory.mkdir();

        File savegamesDirectory = new File(gamesDirectory, "savegames");
        savegamesDirectory.mkdir();

        File tempDirectory = new File(gamesDirectory, "temp");
        tempDirectory.mkdir();


        File srcMainDirectory = new File(srcDirectory, "main");
        srcMainDirectory.mkdir();

        File srcTestDirectory = new File(srcDirectory, "test");
        srcTestDirectory.mkdir();


        try {
            File mainJavaFile = new File(srcMainDirectory, "Main.java");
            mainJavaFile.createNewFile();

            File utilsJavaFile = new File(srcMainDirectory, "Utils.java");
            utilsJavaFile.createNewFile();

            File drawablesDirectory = new File(resDirectory, "drawables");
            drawablesDirectory.mkdir();

            File vectorsDirectory = new File(resDirectory, "vectors");
            vectorsDirectory.mkdir();

            File iconsDirectory = new File(resDirectory, "icons");
            iconsDirectory.mkdir();

            File tempTxtFile = new File(tempDirectory, "temp.txt");
            tempTxtFile.createNewFile();


            StringBuilder log = new StringBuilder();
            log.append("Все файлы и директории были успешно созданы.");

            FileWriter writer = new FileWriter(tempTxtFile);
            writer.write(log.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}