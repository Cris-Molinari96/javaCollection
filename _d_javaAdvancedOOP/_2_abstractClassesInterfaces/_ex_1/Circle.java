package a_javaExerciseForGithub._d_javaAdvancedOOP._2_abstractClassesInterfaces._ex_1;


public class Circle extends Shape {
    public Circle(double height, double width) {
        super(height, width);
    }

    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow((this.height / 2), 2);
    }
}
