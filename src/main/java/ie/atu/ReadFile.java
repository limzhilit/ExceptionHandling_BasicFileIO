package ie.atu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        showFile();
    }

    static void showFile() {
        BufferedReader br = null;
        try {
            FileReader neverUsed = new FileReader("names.txt");
            br = new BufferedReader(neverUsed);
            System.out.println("Content of student.txt:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(" - " + line);
            }
        } catch (IOException ex){
            System.out.println("Could not read file: " + ex.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException closeEx) {
                    System.out.println("Could not close file: " + closeEx.getMessage());
                }
            }
        }
    }
}
