public class Main {
    public static void main(String[] args) {
//        Task0 task0 = new Task0();
//        System.out.println("Вы ввели: " + task0.inDouble());

    task1(new int[]{1,2,3,4,5,6,7,8});
    task1(new int[]{1,2,3,4,5,6,7,8,9});
    }
    public static void task1(int[] intArray){
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catching exception: " + e);
        }
    }
}