import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*
@author Pavithra Moravaneni
 */
public class Urinals {
    public static void main(String[] args) throws IOException {

        //int c = Urinals.UrinalSequence(Urinals.readFile().toString());
        //Urinals.writeFile();
        //String s2 = Urinals.readString();
//       Urinals.readFile();
//       int c = Urinals.UrinalSequence("0000");
        //System.out.println(c);
        //Urinals.UrinalSequence(Urinals.readFile());

        // System.out.println(c);
        //System.out.println(s2);
    }

    static Boolean goodExample(String str) {
        // System.out.println("Not yet implemented");
        return true;
    }

    static int sum(int val1, int val2) {
        return val1 + val2;
    }

    static boolean validStringLength(String str, int n) {
        if (n == str.length()) {
            return true;
        } else
            return false;

    }

    static int multiply(int val1, int val2) {
        return val1 * val2;
    }

    static Boolean readFile() {
        String str;

        File fle = new File("src/main/java/urinal.dat");
        try {
            FileReader fr = new FileReader(fle);
            BufferedReader br = new BufferedReader(fr);
            while ((str = br.readLine()) != null) {
                //System.out.println(str);
            }
            br.close();
            return true;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static int UrinalSequence(String ur1) {
        int count = 0;
        String ur = Urinals.readFile().toString();
        if (ur.contains("11"))
            return -1;


        char[] ch = ur.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            if (i == 0) {
                if (ch[i] == '0' && ch[i + 1] == '0') {
                    ch[i] = '1';
                    count++;
                }
            }
            if (i > 0) {
                if (ch[i] == '0' && ch[i - 1] == '0' && ch[i + 1] == '0') {
                    ch[i] = '1';
                    count++;

                }
            }
        }
        if (ch[ch.length - 1] == '0' && ch[ch.length - 2] == '0') {
            count++;
        }


        return count;
    }

    static void writeFile(){
        int n =0;
        try {
            File file = new File("src/main/java/rule.txt");
            if (file.createNewFile()) {
                FileWriter f1 = new FileWriter("file");
                f1.write(Urinals.UrinalSequence(Urinals.readFile().toString()));

            }
            else{
                while(file.exists()){
                   String  name = file.getName().toString() + (n++) + ".txt";
                   file = new File("src/main/java/", name);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

