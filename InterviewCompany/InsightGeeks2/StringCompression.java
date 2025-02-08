public class StringCompression {
    public static void main(String[] args) {
        String input = "aabbbcdddd";
        String output = compressString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        return compressed.toString();
    }
}
