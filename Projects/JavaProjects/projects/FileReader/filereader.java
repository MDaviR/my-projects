package FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class filereader {
    public static void main(String[] args) {
        try {
            Scanner sc =  new Scanner(System.in);
            System.out.println("inform the file name");//It depends where your terminal is. "file.txt"
            String fileName = sc.nextLine();
            FileReader file = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

