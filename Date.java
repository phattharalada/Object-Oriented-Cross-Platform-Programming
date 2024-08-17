public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
      setDate(day,month,year);
    }

//การเข้าถึงข้อมูล
    public int getDay() {

        return day;

    }

    public int getMonth() {

        return month;

    }

    public int getYear() {

        return year;

    }
//เปลี่ยนแปลงข้อมูล

    public void setDay(int day) {
        this.day = day;
        this.day = ((day > 0 && day <= 31) ? day : 0);
    }

    public void setMonth(int month) {
        this.month = month;
        this.month = ((month > 0 && month <= 12) ? month : 0);
    }

    public void setYear(int year) {
        this.year = year;
        this.year = ((year >= 1900 && year <= 9999) ? year : 0);
    }

    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
       public String toString() {

       return String.format("%02d/%02d/%04d", day,month,year);
    }
}
