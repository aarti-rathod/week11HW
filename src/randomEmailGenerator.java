import java.util.Random;
import java.lang.String;

/**
 * Created by JANVI on 13/10/2019.
 */
public class randomEmailGenerator {



    public String randomString(){
        String characters="abcdefghijklmnopqrstuvwxyz";

        String randomString = "";

        int length = 5;


        Random rand = new Random();


        char[] text = new char[length];


        for (int i = 0; i < length; i++) {

            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }




        for (int i = 0; i < text.length; i++) {

            randomString += text[i];

        }


        //System.out.println(randomString);

        return randomString;

    }

}