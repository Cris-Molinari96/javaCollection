package _1_javaExerciseForGithub._5_javaInProduction.optionalClass;

import _1_javaExerciseForGithub.tutorExe._2_concessionaria.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<>(Arrays.asList(
                new Cat("Frank",4),
                new Cat("Bob",2),
                new Cat("Robert",1),
                new Cat("Garfield",8),
                new Cat("Tommy",2)
        ));

        for (Cat cat : catList) {
            Cat finalCat = cat;
        }

    }
}
