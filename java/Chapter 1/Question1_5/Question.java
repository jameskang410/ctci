package Question1_5;

public class Question {

    public String compress(String s) {
        StringBuilder builder = new StringBuilder();
        
        //pointers
        int b = 0;
        
        for (int f = 0; f < s.length(); f++) {
            if (s.charAt(b) != s.charAt(f)) {
                builder.append(s.charAt(b));
                builder.append(f - b);
                b = f;
            }
        }
        
        //cover last one
        builder.append(s.charAt(b));
        builder.append(s.length() - b);
        
        String compressed = builder.toString();
        
        //if compressed is actually longer
        if (compressed.length() > s.length()) {
            return s;
        }
        else {
            return compressed;
        }
    }
}
