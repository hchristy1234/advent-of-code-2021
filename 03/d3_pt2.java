// still in progress
import java.io.*;
import java.util.*;
public class d3_pt2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("03.txt"))) {
            while (br.ready()) {
                result.add(br.readLine());
            }
        }
        catch (FileNotFoundException ex)  
        {
            System.out.println("bleh");
        }
        ArrayList<Integer> gamma = new ArrayList<>();
        ArrayList<Integer> epsilon = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            int zc = 0;
            int oc = 0;
            for (String temp : result) {
                if (temp.charAt(i) == '0') {
                    zc++;
                } else {
                    oc++;
                }
            }
            if (zc > oc) {
                gamma.add(0);
                epsilon.add(1);
            } else {
                gamma.add(1);
                epsilon.add(0);
            }
        }
        System.out.println(gamma);
        System.out.println(epsilon);
        ArrayList<String> oxygen = new ArrayList<String>();
        for (String temp : result) {
            oxygen.add(temp);
        }
        int counter = 0;
        for (int temp : gamma) {
            int c2 = 0;
            for (String element : oxygen) {
                if (element.charAt(counter) != temp) {
                    oxygen.remove(c2);
                }
                else {
                    c2++;
                }
            }
            counter++;
            if (oxygen.size() == 1) {
                break;
            }
        }
        System.out.println(oxygen);
        ArrayList<String> co2 = new ArrayList<String>();
        co2 = result;
    }
}