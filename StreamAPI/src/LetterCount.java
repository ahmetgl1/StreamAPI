import java.util.Arrays;

public class LetterCount {

    public static void main(String[] args) {

        getTotalNumberofLettersOfNamesLongerThanFive("Abb" , "Ccccc" , "Ahmet" , "Fatih" , "Güzeller");

    }

    public static int getTotalNumberofLettersOfNamesLongerThanFive(String ... names){


        return  Arrays.asList(names).stream()
                .filter(name -> name.length() > 5)
                .mapToInt(name -> name.length())
                .sum();
    }

}
