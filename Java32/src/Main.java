public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(31,1,2021);
        date.setDay(35);
        System.out.println("day: "+date.getDay());
        date.setDay(30);
        System.out.println("day: "+date.getDay());

        System.out.println("Month: " + date.getMonth());
        date.setMonth(13);
        System.out.println("Month: " + date.getMonth());
        date.setMonth(5);
        System.out.println("Month: " + date.getMonth());

    }
}
