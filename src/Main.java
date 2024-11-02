
public class Main {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);

        }
//        sillyCompare(10, 20);
        int count = 1;
        recFunction(count);
    }

    public static boolean sillyCompare(int a, int b){
        Student greatStudent = new Student("amir", "9831045", 22);
        if(a < b){
            return false;
        }else{
            if(Math.pow(a, 2) > b){
                return true;
            }
        }
        return false;
    }


    public static void recFunction(int count){
        count = count + 1;
        recFunction(count);
    }
}