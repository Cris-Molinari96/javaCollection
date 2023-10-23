package _1_javaExerciseForGithub._5_javaInProduction._99extra_functionLambda._1_intro;

public class Main {
    public static void main(String[] args) {

        /**
         ** Instance di lambda
         *! senza parametri
         *! con parametri
         */
//        Lambda s = () -> {System.out.println("Ciao mondo");};
        Lambda s = (x) -> {
            System.out.println("Ciao mondo io sono " + x);
        };
//        s.hello("Cristian");

/*! Esempio che dobbiamo far riferimento alla firma del metodo per poter eseguire una lamda; */
        FuncInterface method = (String name) -> {
            System.out.println("Hello world!!!" + name);
        };

        method.printHello("Fuck");

    }

}
