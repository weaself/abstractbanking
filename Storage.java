package courses.abstractbanking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Storage {

    FileWriter fw;
    BufferedReader br;
   // BufferedWriter bw;

    String fullName;

    public Storage(String firstName, String lastName) {
        try {
            fw = new FileWriter("customerList.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.fullName = firstName + " " + lastName;
        writeCurrentDataToFile();
    }

    public void writeCurrentDataToFile() {
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(fullName + "\n");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


}
