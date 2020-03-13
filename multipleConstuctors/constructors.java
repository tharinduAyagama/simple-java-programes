class constructors{
    private int hour;
    private int minute;
    private int second;
    private static int objectCount=0;    //static means if change the value of this in all object's  that variable will be changed(commen variable for any object)  

    constructors(int h , int m , int s){
        setTime(h,m,s);
    }

    constructors(){
        this(0, 0, 0);
    }

    constructors(int h){
        this(h, 0, 0);
    }

    constructors(int h , int m){
        this(h, m, 0);
    }

    void setTime(int h , int m , int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
        objectCount++;
    }

    void setHour(int h){
        hour = ((h>=0 && h<=24) ? h : 0);
    }

    void setMinute(int m){
        minute = ((m>=0 && m<=24) ? m : 0);
    }

    void setSecond(int s){
        second = ((s>=0 && s<=24) ? s : 0);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    String timeString(){
        return String.format("%02d:%02d:%02d", hour , minute , second);
    }

    public static int getObjectCount(){
        return objectCount;
    }
}