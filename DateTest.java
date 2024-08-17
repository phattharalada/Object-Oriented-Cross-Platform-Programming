public class DateTest {

    public static void main(String[] args) {

        Date date = new Date (5, 6, 2024);

        System.out.println(date);

        Date dateWrong = new Date(40,22,10000);
        System.out.println(dateWrong);

       // Date b = new Date(2024);
        //b.setYear(2024);
       // System.out.println(b);
        // month, year
      //  Date c = new Date(6,2024);
      //  System.out.println(c);

    }
}