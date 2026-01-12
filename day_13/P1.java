import java.lang.classfile.instruction.StackInstruction;

public class P1 {
    /*
        input: "Meet me at the clock tower"

        1. first word vowels convert into %
        2. second word consonants convert into #
        3. Third word should be in a CAPITAL

        Repeat this sequence from forth word onward

        output: "M%%t #e AT th% ##o## TOWER"
    */

    // public static void main(String[] args) {
    //     String st = "Meet me at the clock tower";
    //     String[] word = st.split(" ");

    //     String vowel = "AEIOUaeiou";

    //     for(int i=0;i<word.length;i++){
    //         char[] ch = word[i].toCharArray();
    //         if(i%3==0){
    //             for(int j=0;j<ch.length;j++){
    //                 if(vowel.indexOf(ch[j])!=-1){
    //                     ch[j] = '%';
    //                 }
    //             }
    //             word[i] = new String(ch);
    //         }

    //         else if(i%3==1){
    //             for(int j=0;j<ch.length;j++){
    //                 if(vowel.indexOf(ch[j])==-1){
    //                     ch[j] ='#';
    //                 }
    //             }
    //             word[i] = new String(ch);
    //         }

    //         else{
    //             word[i] = word[i].toUpperCase();
    //         }
    //     }
    //     System.out.println(String.join(" ", word));
    // }

    /*
        String s = "java is a programming language it is a high level programming language" ;

        java = 1
        is = 2
        a = 2
        programming = 2
        language = 2
        it = 1
        high = 1
        level = 1
    */

    public static void main(String[] args){
         String s = "java is a programming language it is a high level programming language";

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("0")) continue;

            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0"; // mark counted
                }
            }

            System.out.println(words[i] + " = " + count);
        }

    }


}
