package _1_javaExerciseForGithub._5_javaInProduction._99extra_functionLambda.calculator;

public class Main {
    public static void main(String[] args) {

        Integer num = operation(Integer::sum, 5, 5);
        Integer resultSott = operation((a,b) -> a-b,5,5);
        Integer multiply = operation((a,b) -> a * b, 5,5);
        Integer divide = operation((a,b) -> a / b, 5,5);

        System.out.println(num + " " + resultSott + " " + multiply + " " + divide);
    }

    //
    public static <T> T operation(MyInterfaceCalculator<T> operation, T v1,T v2){
        // abbiamo dovuto fare riferimento all'interfaccia per poter accedere al suo metodo
        return operation.calculator(v1,v2);
    }

}
