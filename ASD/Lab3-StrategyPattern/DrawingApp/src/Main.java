public class Main {

    public static void main(String[] args) {
        DrawingCanvas canvas = new DrawingCanvas(new DrawLine());
        canvas.drawCanvas();

        canvas.setDrawing(new DrawCircle());
        canvas.drawCanvas();
        canvas.drawCanvas();

//        canvas.setDrawing(new DrawRectangle());
//        canvas.drawCanvas();
//
//        canvas.setDrawing(new DrawTriangle());
//        canvas.drawCanvas();

    }
}
