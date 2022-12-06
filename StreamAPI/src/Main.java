import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        UseEffective useEffective = new UseEffective();

        List<Integer> list = Arrays.asList(2 , 1 , 5 , 8 ,11 , 14);
     //  List<Integer> newList = new ArrayList<>();


     //  for(Integer x : list) {

     //  newList.add(x * 2);

     //  }
     //  System.out.println(newList);



      List<Integer>  newList = list.stream().map(s ->s *2).collect(Collectors.toList());

        System.out.println(newList);

        System.out.println("Finish !");





    }









}
