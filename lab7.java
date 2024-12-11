package daddy;

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width, height;
    public Rectangle(int width, int height) { this.width = width; this.height = height; }

    @Override
    public void resizeWidth(int width) { this.width = width; }
    @Override
    public void resizeHeight(int height) { this.height = height; }

    void display() { System.out.println("Rectangle: Width = " + width + ", Height = " + height); }
}

public class ResizeDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        rect.display();
        rect.resizeWidth(15);
        rect.resizeHeight(8);
        rect.display();
    }
}
