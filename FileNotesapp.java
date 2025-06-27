import java.io.*;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.notes;

public class FileNotesapp {
    public static void main(String[] args) {
        String filename="notes.txt";
        String note="this is sample note write using FileWriter";

        try(FileWriter writer=new FileWriter(filename)){
            writer.write(note);
            System.out.println("Note Write to the file");
            writer.close();
        }catch (IOException e)
        {
            System.out.println("Error write the file" + e.getMessage());
        }
        try(BufferedReader reader=new BufferedReader(new FileReader("notes.txt"))){
            String line;
            System.out.println("Read from file");
            while ((line=reader.readLine()) !=null){
                System.out.println(line);
            }
            reader.close();
        }catch (Exception e){
            System.out.println("Error read the file" + e.getMessage());

        }
    }
}
