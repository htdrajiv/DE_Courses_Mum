/**
 * Created by Rajiv on 3/10/2017.
 */
public class DrawingCanvas {
    Drawing drawing;

    public DrawingCanvas(Drawing drawing){
        this.drawing = drawing;
    }

    public void drawCanvas(){
        drawing.draw();
    }

    public void setDrawing(Drawing newDrawing){
        this.drawing = newDrawing;
    }
}
