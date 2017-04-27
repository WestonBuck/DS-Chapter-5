public class Main {
    public static void main(String[] args) {
        int diskNum = 6;
        Tower(diskNum,1,2,3);
    }

    //
    public static void Tower (int diskNum, int sourcePeg, int destinationPeg, int sparePeg)
    {
        //move top disk to next peg
        if (diskNum == 1)
        {
            System.out.println("moving disk 1 from peg " + sourcePeg + " to peg " + destinationPeg);
            return;
        }

        Tower(diskNum-1, sourcePeg,sparePeg,destinationPeg);
        System.out.println("moving disk " + diskNum +" from peg " + sourcePeg + " to peg " + destinationPeg);
        Tower(diskNum-1, sparePeg,destinationPeg,sourcePeg);
    }
}
