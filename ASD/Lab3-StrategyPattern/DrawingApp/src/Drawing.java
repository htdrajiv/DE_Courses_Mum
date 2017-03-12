/**
 * Created by Rajiv on 3/10/2017.
 */
public interface Drawing {
    void draw();
}

class DrawLine implements Drawing{
    @Override
    public void draw() {
        System.out.println("I draw line");
    }
}

class DrawCircle implements Drawing{
    @Override
    public void draw() {
        System.out.println("I draw Circle");
    }
}

class DrawRectangle implements Drawing{
    @Override
    public void draw() {
        System.out.println("I draw Rectangle");
    }
}

class DrawTriangle implements Drawing{
    @Override
    public void draw() {
        System.out.println("I draw Triangle");
    }
}