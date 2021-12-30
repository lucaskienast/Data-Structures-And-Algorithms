import java.util.LinkedList;

public class AutoComplete {

    public LinkedList<String> makeSuggestions(String input, String[] possibleOutputs) {
        LinkedList<String> output = new LinkedList<>();
        for (int i = 0; i < possibleOutputs.length; i++) {
            if (input.equals(possibleOutputs[i].substring(0, input.length()))) {
                output.push(possibleOutputs[i]);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        AutoComplete ac = new AutoComplete();
        String queryString = "de";
        String[] possibleStrings = new String[] { "dog", "deer", "deal" };
        System.out.println(ac.makeSuggestions(queryString, possibleStrings));
    }
}