import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {



/*
    public static Collection<String> mapToUppercase(String ...names){

        Collection<String> upperCaseNames = new ArrayList<>();

        for (String name : names) {

            upperCaseNames.add(name.toUpperCase());
        }

        return upperCaseNames;
    }

 */

    public static Collection<String> mapToUppercase(String... names){

        Collection<String> upperCaseNames = new ArrayList<>();

       return  Arrays.asList(names).stream()
               .map(name -> name.toUpperCase()).collect(Collectors.toList());


    }





}
