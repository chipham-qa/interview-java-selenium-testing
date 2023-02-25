package interview.coding;

public class ReverseString {
    public static void main(String[] args) {
        String input = "avaj ni gnirts a esreveR";
        StringBuffer output = new StringBuffer();

        for(int index = input.length() - 1; index >= 0; index--) {
            output.append(input.charAt(index));
        }

        System.out.println(output);
    }
}
