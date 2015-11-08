/**
 * Created by Brenda on 11/8/2015.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        Shapemaker shapeMaker = new Shapemaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
