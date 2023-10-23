package _1_javaExerciseForGithub._5_javaInProduction._99extra_functionLambda.calculator;
// quest'interfaccia accetta tutti i tipi di dati da stringhe a numeri
// ci consente tramite questo metodo, di effettuare qualsiasi tipo di operazione sui numeri, il metodo accetta due parametri di qualsiasi tipo
@FunctionalInterface
public interface MyInterfaceCalculator<T> {
    T calculator(T a, T b);
}
