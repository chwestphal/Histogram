import java.io.*;
public class Histogram {


    public static void main(String[] args) throws IOException{


        File input = new File("sampletext.txt");
        File output = new File("frequencies.txt");

        BufferedReader bR = new BufferedReader(new FileReader(input));
        BufferedWriter bW = new BufferedWriter(new FileWriter(output));

        int character = bR.read();
        int[] freq = new int[26];

        while(character!=-1){
            if(character>=65 && character<=90){
                freq[character-65]++;
            }
            else if(character>=97 && character <= 122){
                freq[character-97]++;
            }
            character = bR.read();
        }
        for(int i=0;i<26;i++){
            int c = freq[i];
            char ch = (char) (i+65);
            String stars = "";
            for(int j=0;j<c;j++){
                stars = stars.concat("*");
            }
            bW.write(ch + " : " + stars + "\n");
        }
        bR.close();
        bW.close();
    }
}
