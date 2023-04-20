public class Line {
    private double a, b, c;

    public Line(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public boolean containsPoint(double x, double y) {
        return a * x + b * y + c == 0;
    }

    public double[] intersection(Line other) {
        double det = a * other.b - other.a * b;
        if (det == 0) {
            return null; // прямі паралельні
        } else {
            double x = (b * other.c - other.b * c) / det;
            double y = (other.a * c - a * other.c) / det;
            return new double[] { x, y };
        }
    }

    @Override
    public String toString() {
        return "Info about line\na = " + a + " b = " + b + " c = " + c;
    }
}
