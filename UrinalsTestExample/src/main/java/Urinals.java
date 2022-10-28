import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
@author Pavithra Moravaneni
 */
public class Urinals {

    public static void main(String[] args) {

        //int c = Urinals.UrinalSequence(Urinals.readFile().toString());
        //Urinals.writeFile();
        //int s =Urinals.UrinalSequence(readFile().toString());
        //String s2 = Urinals.readString();
//       Urinals.readFile();
//       int c = Urinals.UrinalSequence("0000");
       // System.out.println(c);
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

    static ArrayList readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/urinal.dat"));
            String str;
            ArrayList inputArr = new ArrayList();
            ArrayList outputArr = new ArrayList();
            while ((str = br.readLine()) != null) {
                if(str=="-1"){
                    return inputArr;
                }
                inputArr.add(str);
            }
            for(int i=0; i<inputArr.size();i++){
                if(UrinalSequence(inputArr.get(i).toString())==-1){
                    outputArr.add(-1);
                    return outputArr;
                }
                outputArr.add(UrinalSequence(inputArr.get(i).toString()));
            }
            return outputArr;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        static int UrinalSequence(String ur) {
        int count = 0;
       //String ur = Urinals.readFile().toString();
        //System.out.println(ur);
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

    static void writeFile(List<String> str, String text){
        String path = "src/main/java";
        int count=0;
        File file = new File(path, text);
        while(file.exists()){
            text = "rule" + (++count) + ".txt";
            file = new File(path, text);
        }
        FileWriter fw=null;
        try{
             fw = new FileWriter(file);
            for(int i=0; i<str.size();i++){
                fw.write(String.valueOf(str.get(i)));
                fw.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                fw.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }


}

