public enum subClass{
    tharindu("nice" , "sri lanka"),
    aliice("good" , "england"),
    peter("bad" , "usa"),
    linda("beauty" , "poland"),
    nathaliya("cute" , "coria"),
    john("thin" , "newzeland");

    //this enum can be use to store data set

    private final String description;
    private final String country;

    subClass(String description , String country){
        this.description = description;
        this.country = country;
    }

    String getDescription(){
        return description;
    }

    String getCountry(){
        return country;
    }

}