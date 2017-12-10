public class ArraysDriver {
    public static void main (String []args){
        Arrays today=new Arrays();
        today.setDays(6);
        today.nextDay();
        today.calculateDay(5);
        today.previousDay();
        System.out.println(today);
        System.out.println(today.nextDay());
        System.out.println(today.calculateDay(5));
        System.out.println(today.previousDay());
    }
}
