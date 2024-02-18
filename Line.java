public class Line {
    public double slope, intercept;

    public Line(double slope, double intercept) {
        this.intercept = intercept;
        this.slope = slope;
    }

    public Line(OrderedPair pointA, OrderedPair pointB) {
        this.slope = pointA.getSlopeBetweenPoints(pointB);
        this.intercept = pointB.getInterceptBetweenPoints(pointB);
    }

    public double getSlope() {
        return slope;
    }

    public double getIntercept() {
        return intercept;
    }

    public double valueAtX(double x) {
        return x * slope + intercept;
    }

    public boolean isPointAboveLine(OrderedPair comparisonPoint) {
        return valueAtX(comparisonPoint.getX()) <= comparisonPoint.getY();
    }
}
