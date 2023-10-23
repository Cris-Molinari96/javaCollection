package _1_javaExerciseForGithub._5_javaInProduction._99extra_functionLambda._6_wrapperMethodStaticELambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {

    private static List<Integer> arrayNotSorted = IntStream.range(0,41).boxed().toList();

    public static void main(String[] args) {

// metodi dei wrapper
    myCalculator(Integer::sum, 5,5);
    myCalculator(Double::sum, 2.5, 2.5);
    myCalculator(String::concat, "Hello","World" );


        String name = "name";
        List<String> stringList = new ArrayList<>(List.of("marco","peppe","franco","lella"));

        Function<String,String> uCase= String::toUpperCase;
        uCase.apply(name);

        List<String>upperList = stringList.stream().map(uCase).toList();
        upperList.forEach(System.out::println);
    }

    public static <T> T myCalculator(BinaryOperator<T> operation, T v1, T v2){
        T result = operation.apply(v1, v2);
        System.out.println(result);
        return result;
    }
}
