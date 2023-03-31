import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class ReadFile {
    public ArrayList<String> getWords() {
        ArrayList<String> tempArray = new ArrayList<String>();
        try {
            File myObj = new File("Words.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                tempArray.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return tempArray;
    }

}
