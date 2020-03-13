class settingString{
    private int hour;
    private int minute;
    private int second;

    //arguments are deferent with class variables so here we dont need this key word
    public void setTimeValuesFirst(int h , int m , int s){
        hour=((h >= 0 && h <=24) ? h : 0);
        minute=((m >= 0 && m <=60) ? m : 0);
        second=((s >= 0 && s <=60) ? s : 0);
    }

    //arguments are same with class variables so here we need this key word
    public void setTimeValuesSeocond(int hour , int minute , int second){
        this.hour=((hour >= 0 && hour <=24) ? hour : 0);
        this.minute=((minute >= 0 && minute <=60) ? minute : 0);
        this.second=((second >= 0 && second <=60) ? second : 0);
    }

    public String hoursFormat(){
        return String.format("%02d:%02d:%02d", hour ,minute , second);  //setting the string format witch we want
    }

    public String amPmFormat(){
        return String.format("%02d:%02d:%02d %s", (hour==0 || hour==24) ? 12 : hour%12 , minute , second , hour< 12 ? "AM" : "PM");     //setting the string format witch we want
    }

}