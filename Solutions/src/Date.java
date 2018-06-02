/**
 * Created by swest06 on 02/06/2018.
 */
public class Date {
        private int day;
        private int month;
        private int year;

    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Date)) return false;

        Date date = (Date) o;

        return year == date.year && month == date.month && day == date.day;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getDay();
        result = prime * result + getMonth();
        result = prime * result + getYear();
        return result;
    }
}
