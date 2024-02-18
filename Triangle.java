public class Triangle {
    public OrderedPair vertexOne, vertexTwo, vertexThree;
    public Line lineOne, lineTwo, lineThree;

    public Triangle(OrderedPair vertexOne, OrderedPair vertexTwo, OrderedPair vertexThree) {
        this.vertexOne = vertexOne;
        this.vertexTwo = vertexTwo;
        this.vertexThree = vertexThree;
        this.lineOne = new Line(vertexOne, vertexTwo);
        this.lineTwo = new Line(vertexTwo, vertexThree);
        this.lineThree = new Line(vertexThree, vertexOne);
    }

    public OrderedPair getVertexOne() {
        return vertexOne;
    }

    public OrderedPair getVertexTwo() {
        return vertexTwo;
    }

    public OrderedPair getVertexThree() {
        return vertexThree;
    }

    // Edge case when on triangle
    public boolean areInteriorPointsAboveLineOne() {
        return lineOne.isPointAboveLine(vertexThree);
    }

    public boolean areInteriorPointsAboveLineTwo() {
        return lineTwo.isPointAboveLine(vertexOne);
    }

    public boolean areInteriorPointsAboveLineThree() {
        return lineThree.isPointAboveLine(vertexTwo);
    }

    public boolean isPointInterior(OrderedPair comparisonPair) {
        if (areInteriorPointsAboveLineOne() != lineOne.isPointAboveLine(comparisonPair)) return false;
        if (areInteriorPointsAboveLineTwo() != lineTwo.isPointAboveLine(comparisonPair)) return false;
        if (areInteriorPointsAboveLineThree() != lineThree.isPointAboveLine(comparisonPair)) return false;
        return true;
    }

    public static void main(String[] args) {
        
    }

}
