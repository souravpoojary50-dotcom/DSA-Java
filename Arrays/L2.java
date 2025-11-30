public class L2 {

    public static void main(String args[]) {
        String[] input = { "interview", "internet", "internal" };
        System.out.println(new L2().longestCommonPrefix(input)); // Output: "inte"
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;

    }
}
