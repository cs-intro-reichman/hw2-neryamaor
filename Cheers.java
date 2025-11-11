//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word1 = args[0];
            String word = word1.toUpperCase();
            int cheersnumber = Integer.parseInt(args[1]);
            // convert. to big?
            int wordlength = word.length();
            int i = 0;
            char letter;
            String ana;
            while (i<wordlength) { 
                System.out.print("Give me ");
                letter = word.charAt(i);
                if(letter == 'A'||letter == 'E' ||letter == 'F' ||letter == 'H' ||letter == 'I' ||letter == 'L' ||letter == 'M' ||letter == 'N' ||letter == 'O' ||letter == 'R' ||letter == 'S' || letter == 'X'){
                ana = "an";
                } else{ana = "a ";
                }
                System.out.println(ana +" " + letter + ": " + letter + "!"); 
                i++;
            }
            System.out.println("What does that spell?");
            for(i = 0; i < cheersnumber;i++){
                System.out.println(word + "!!!");
            };
        }
}
