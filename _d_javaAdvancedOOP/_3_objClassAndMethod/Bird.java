package a_javaExerciseForGithub._d_javaAdvancedOOP._3_objClassAndMethod;

public class Bird extends Animal{
    private double wingSpan;

    public Bird(double wingSpan, double height, double weight) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {return wingSpan;}
    public void setWingSpan(double wingSpan) {this.wingSpan = wingSpan;}

    public void printInfoBird(){
        System.out.println("Wing span: " + this.wingSpan + " cm - " + this.height + " cm - " + this.weight + " g");
    }

    public double flySpeedMetersPerSecond(){return wingSpan * 4 ;}
}
