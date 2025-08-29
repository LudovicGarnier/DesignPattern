package creational_patterns.prototype.shapes;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        this.x = target.x;
        this.y = target.y;
        this.color = target.color;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape shape))
            return false;
        return shape.x == x && shape.y == y && shape.color.equals(color);
    }
}
