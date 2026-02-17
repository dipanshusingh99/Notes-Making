package NotesMaking;

import java.io.*;
import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Write note: ");
            String note = sc.nextLine();

            FileWriter fw = new FileWriter("notes.txt", true);
            fw.write(note + "\n");
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
            String line;

            System.out.println("\nNotes:");
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();

        } catch(IOException e){
            System.out.println("Error");
        }

        sc.close();
    }
}
