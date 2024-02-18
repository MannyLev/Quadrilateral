public class OrderedPair {

    public double x, y;

    public OrderedPair(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getSlopeBetweenPoints(OrderedPair secondPair) {
        return ((secondPair.getY() - this.y) / (secondPair.getX() - this.x));
    }

    public double getInterceptBetweenPoints(OrderedPair secondPair) {
        double slope = getSlopeBetweenPoints(secondPair);
        return (this.y - this.x * slope);
    }
}