public class Algo8 {
    public static void main(String[] args) {
        
        int[] numA = {5,7,-2,3,4,6,-8};
        int[] numB = {7,8,-8,2,1,-9,6};

        String intersection = "";
        String noIntersection = "";
        String noIntersectionA = "";
        String noIntersectionB = "";

        // Seperating values in numA as intersection with numB and not intersection with numB
        loopNumA:
        for (int i = 0; i < numA.length; i++) {

            // Checking duplicates
            for (int z = 0; z < i; z++) {
                if (numA[i] == numA[z]) continue loopNumA;
            }

            int j;
            for (j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]) break;
            }

            if (j < numB.length) intersection+=(numA[i]+" ");
            else noIntersectionA+=(numA[i]+" ");
        }

        String[] intersectionArray = intersection.split(" ");

        // Collecting values in numB which are not intersection with numA
        loopNumB:
        for (int i = 0; i < numB.length; i++) {

            // Checking duplicates
            int z;
            for (z = 0; z < i; z++) {
                if (numB[i] == numB[z]) continue loopNumB;
            }

            int j;
            for (j = 0; j < intersectionArray.length; j++) {
                if ((numB[i]+"").equals(intersectionArray[j])) break;
            }

            if (j == intersectionArray.length) noIntersectionB+=(numB[i]+" ");
        }

        noIntersection = noIntersectionA + noIntersectionB;

        // All the values without duplicates
        String total = intersection + noIntersection;

        // numA intersection numB
        System.out.println("\nnumA \u2229 numB: " + intersection);

        // numA U numB
        System.out.println("\nnumA \u222A numB: " + total);

        // numA \ numB
        System.out.println("\nnumA \\ numB: "+ noIntersectionA);

        // numB \ numA
        System.out.println("\nnumB \\ numA: "+ noIntersectionB);

        // numA delta numB
        System.out.println("\n\nnumA \u25B3 numB: " + noIntersection);
        System.out.println();
    }
}
