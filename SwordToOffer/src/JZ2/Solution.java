package JZ2;

public class Solution {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        if (s == null || "".equals(s))
            return s;
        String[] strs = s.split("");
        for (String str : strs) {
            if (" ".equals(str))
                sb.append("%20");
            else
                sb.append(str);
        }
        return sb.toString();
    }

//    public String replaceSpace (String s) {
//        if (s == null || "".equals(s))
//            return s;
//        return s.replaceAll(" ", "%20");
//    }
}
