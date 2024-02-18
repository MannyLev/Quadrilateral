public class Quadrilateral {
    OrderedPair[] orderedPairs;
    Triangle[] triangleArray;

    public Quadrilateral(OrderedPair vertexA, OrderedPair vertexB, OrderedPair vertexC, OrderedPair vertexD) {
        orderedPairs = new OrderedPair[4];
        orderedPairs[0] = vertexA;
        orderedPairs[1] = vertexB;
        orderedPairs[2] = vertexC;
        orderedPairs[3] = vertexD;

        triangleArray = new Triangle[4];
        for (int i = 0; i < 4; i++) {
            OrderedPair vertexOne = null;
            OrderedPair vertexTwo = null;
            OrderedPair vertexThree = null;
            for (int j = 0; j < 4; j++) {
                if ((i != j) && (vertexOne == null)) {
                    vertexOne = orderedPairs[j];
                    System.out.println("triangle " + i + " ordered pair one " + vertexOne.x + ", " + vertexOne.y);
                } else if ((i != j) && (vertexTwo == null)) {
                    vertexTwo = orderedPairs[j];
                    System.out.println("triangle " + i + " ordered pair two " + vertexTwo.x + ", " + vertexTwo.y);
                } else if ((i != j) && (vertexThree == null)) {
                    vertexThree = orderedPairs[j];
                    System.out.println("triangle " + i + " ordered pair three " + vertexThree.x + ", " + vertexThree.y);
                }
            }
            triangleArray[i] = new Triangle(vertexOne, vertexTwo, vertexThree);
        }
    }

    public boolean isPointInterior(OrderedPair comparisonPoint) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Triangle "+ i + " is interior");
            System.out.println("Triangle " + i + " is " + triangleArray[i].getVertexOne().getX() + " " + triangleArray[i].getVertexOne().getY() + " " + 
            triangleArray[i].getVertexTwo().getX() + " " + triangleArray[i].getVertexTwo().getY() + " " + triangleArray[i].getVertexThree().getX() + " " + triangleArray[i].getVertexThree().getY() + " ");
            if (triangleArray[i].isPointInterior(comparisonPoint)) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " args " + args[i]);
        }
        OrderedPair firstPair = new OrderedPair(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        OrderedPair secondPair = new OrderedPair(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
        OrderedPair thirdPair = new OrderedPair(Double.parseDouble(args[4]), Double.parseDouble(args[5]));
        OrderedPair fourthPair = new OrderedPair(Double.parseDouble(args[6]), Double.parseDouble(args[7]));
        OrderedPair comparisonPair = new OrderedPair(Double.parseDouble(args[8]), Double.parseDouble(args[9]));
        Quadrilateral testQuad = new Quadrilateral(firstPair, secondPair, thirdPair, fourthPair);
        System.out.println(testQuad.isPointInterior(comparisonPair));
    }

}
