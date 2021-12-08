import java.io.*;
import java.util.*;
public class d3_pt1 {
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
    }
}