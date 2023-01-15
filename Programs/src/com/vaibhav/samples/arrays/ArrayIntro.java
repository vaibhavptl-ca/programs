package arrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayIntro {

    public static void main(String[] args) throws Exception, IOException {
        File file = new File("/Users/vaibhavpatel/Downloads/programs/Programs/data.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
//                System.out.println(line);

                String[] words = line.trim().split(" ");

                String externalCustomerId = words[0];
                String emailAddress = words[1];
                String vaultId = words[2];
                String password = words[3];
                System.out.println("externalCustomerId " + externalCustomerId + " email "+ emailAddress + " vaultId "+ vaultId );
                try {

                    File outputFile = new File("/Users/vaibhavpatel/Downloads/acc_id_op.csv");
                    // create CSVWriter object filewriter object as parameter
                    FileWriter csvwriter = new FileWriter("output.csv",true);
                    List<String[]> data = getStrings(externalCustomerId, emailAddress, vaultId, password);
                    csvwriter.write(String.valueOf(data));
                    csvwriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }
    }

    private static List<String[]> getStrings( String externalCustomerId, String email, String vaultId, String pwd) {
        List<String[]> data = new ArrayList<String[]>();
        data.add(new String[]{externalCustomerId, email, vaultId,"assword1234$"});
        return data;
    }
    //Password1234$
}
