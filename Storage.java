package courses.abstractbanking;

import java.io.*;

public class Storage {

    FileWriter fw;
    FileReader fr;
    BufferedReader br;
   // BufferedWriter bw;

    String customerDetails;

    public Storage(String firstName, String lastName, int id) {
        try {
            fw = new FileWriter("customerList.txt", true);
            fr = new FileReader("customerList.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.customerDetails = firstName + " " + lastName + "," + id;
        if (checkIfUserExists(customerDetails)) {
            writeCurrentDataToFile();
        } else {
            System.out.println("User already exists!");
        }
    }

    public void writeCurrentDataToFile() {
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(customerDetails + "\n");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public boolean checkIfUserExists(String customerDetails) {
        try (BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals(customerDetails))
                    return true;
                else {
                    return false;
                }
            }
        } catch (IOException ioex) {
            System.out.println(ioex);
        }

        return false;
    }


}
