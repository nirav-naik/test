import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class prg1
{
    public static void main(String[] args)
    {
        int a[]={1,1,1,3,3,4,5,5,5,5,5,100};
        Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(s->s))
                .forEach((k,v)->System.out.println(k+" -> "+v.size()));

        System.out.println();

       Map<Integer,Long> map=
               Arrays.stream(a)
                       .boxed()
                       .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
