// Example array program

public class ArrayEx1 {
    public static void main(String[] args) {
        //int[] marks = new int[3];
        int marks[] = new int[3];
         marks[0] = 97; //phy
         marks[1] = 92; //chem
         marks[2] = 98; //eng

         /*System.out.println(marks[0]);
         System.out.println(marks[1]);
         System.out.println(marks[2]);*/

         for(int i = 0; i<3; i++){
            System.out.println(marks[i]);
         }
    }
}
