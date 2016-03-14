
public class Main {

    public static char[] uniqueChars(String S){
        char [] A = S.toCharArray();
        StringBuilder SB = new StringBuilder();
        for (char N: A ) {
           if (S.indexOf(N, 0)==S.lastIndexOf(N, A.length)){
               SB.append(N);  }
        }
        char [] res = new char[SB.length()];
        SB.getChars(0,SB.length(),res,0);
    return res;}   //very hard readable code to convert from StringBuilder to String you can use toString() method
                    //I don't sure that this code works correctly

    public static void main(String[] args) {
        String a = "abracadabra";  
      System.out.println(Main.uniqueChars(a));
    }
}
