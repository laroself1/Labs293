
public class Main {

    public static char[] uniqueChars(String S){
        char [] A = S.toCharArray();                   //don't use capital letters for variable names
        StringBuilder SB = new StringBuilder();
        for (char N: A ) {
           if (S.indexOf(N, 0)==S.lastIndexOf(N, A.length)){
               SB.append(N);  }
        }
        char [] res = new char[SB.length()];
        SB.getChars(0,SB.length(),res,0);
    return res;}

    public static void main(String[] args) {
        String a = "abracadabra";  
      System.out.println(Main.uniqueChars(a));
    }
}
