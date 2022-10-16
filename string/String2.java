import java.util.StringTokenizer;
class String2{
    public static void main(String[] args){

        String s = "JAVA PYTHON SQL AI";
        // System.out.println(s);

        StringTokenizer st = new StringTokenizer(s," ");

        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}

// https://learn.thetapacademy.com/courses/take/java-fundamental/lessons/28573772-string-tokenizer