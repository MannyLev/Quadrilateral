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
        // System.out.println("acquired slope " + (secondPair.getY() - this.y) / (secondPair.getX() - this.x) + " " + secondPair.getY() + " " + this.y + " " + secondPair.getX() + " " + this.x);
        // System.out.println();
        return ((secondPair.getY() - this.y) / (secondPair.getX() - this.x));
    }

    public double getInterceptBetweenPoints(OrderedPair secondPair) {
        double slope = getSlopeBetweenPoints(secondPair);
        // if ((slope == 1.0 / 0.0) || (slope == 0.0 / 0.0)) {
        //     return 0.0;
        // }
        return (this.y - this.x * slope);
    }
}