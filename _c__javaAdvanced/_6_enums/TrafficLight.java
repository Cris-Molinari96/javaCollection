package a_javaExerciseForGithub._c__javaAdvanced._6_enums;

public enum TrafficLight {
    RED,
    YELLOW,
    GREEN ;

    public void stateCurrentTrafficLight(TrafficLight x){
        switch (x){
            case GREEN -> System.out.println(RED);
            case RED -> System.out.println(YELLOW);
            case YELLOW -> System.out.println(GREEN);
        }
    }
}
