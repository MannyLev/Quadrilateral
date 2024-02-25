public class AngleBisector {
    public AngleBisector(OrderedPair bisectedPair, OrderedPair oppositePair1, OrderedPair opposoitePair2 ) {
        Triangle bisectingTriangle = new Triangle(bisectedPair, oppositePair1, opposoitePair2);
        Line bisectedLine = new Line(oppositePair1, opposoitePair2);
        double bisectedLineLength = bisectedLine.getLength();
        double adjacentLine1Length = new Line(oppositePair1, bisectedPair).getLength();
        double adjacentLine2Length = new Line(opposoitePair2, bisectedPair).getLength();
        double bisectedAngle = Math.acos((Math.pow(bisectedLineLength, 2) - Math.pow(adjacentLine1Length, 2) - Math.pow(adjacentLine2Length, 2)) / (-2 * adjacentLine1Length * adjacentLine2Length));
        double distantceFromOppositePair1 = adjacentLine1Length * bisectedLineLength / (adjacentLine1Length + adjacentLine2Length);
        double rightTriangleAngle = Math.toRadians(Math.atan(bisectedLine.getDeltaY() / bisectedLine.getDeltaX())); // returns an angle
        double yCoordinate = distantceFromOppositePair1 * Math.sin(rightTriangleAngle);
        double xCoordinate = distantceFromOppositePair1 * Math.cos(rightTriangleAngle);
        OrderedPair targetPair = new OrderedPair(xCoordinate, yCoordinate);
        Line basePointToTarget = new Line(targetPair, bisectedPair);
        double distanceToTarget = basePointToTarget.getLength();
    }
}