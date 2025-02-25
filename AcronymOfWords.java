import java.util.List;

public class AcronymOfWords {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
                return false;
            }
            for (int i = 0; i < words.size(); i++) {
                if (words.get(i).charAt(0) != s.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
            AcronymOfWords solution = new AcronymOfWords();
            List<String> words = List.of("alice", "bob", "charlie");
            String s = "abc";
            boolean result = solution.isAcronym(words, s);
            System.out.println(result);
        }
}
