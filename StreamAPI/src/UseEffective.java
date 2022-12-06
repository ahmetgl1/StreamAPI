import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseEffective {

  List<String> list = Arrays.asList("ahmet" , "fatih" , "" , "saian"  , "salkım" , "youthall" , "sakultah");


    public List<String> getMyList(List<String> list) {

        return list.stream().filter(s -> s.startsWith("s"))
                .map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

}
