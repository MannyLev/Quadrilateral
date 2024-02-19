public class Line {
    public double slope, intercept;
    public OrderedPair pointA, pointB;

    public Line(OrderedPair pointA, OrderedPair pointB) {
        this.slope = pointA.getSlopeBetweenPoints(pointB);
        this.intercept = pointA.getInterceptBetweenPoints(pointB);
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public double getSlope() {
        return slope;
    }

    public double getIntercept() {
        return intercept;
    }

    public double valueAtX(double x) {
        // System.out.println("collected value at x "+ x * slope + intercept + " slope " + slope + " intercept " + intercept + " x " + x);
        // if ((slope == 1.0 / 0.0 ) || (slope == 0.0)) return 1.0 / 0.0;
        return x * slope + intercept;
    }

    public boolean isPointAboveLine(OrderedPair comparisonPoint) {
        // System.out.println("x of comparison point " + comparisonPoint.getX());
        // System.out.println("Line comparison point expected " + valueAtX(comparisonPoint.getX()) + " actual point " + comparisonPoint.getY());
        // if ((getSlope() == 1.0 / 0.0) || (getSlope() == 0.0 / 0.0)) {
        //     return (pointA.x < comparisonPoint.getX());
        // }
        return valueAtX(comparisonPoint.getX()) <= comparisonPoint.getY();
    }
}
