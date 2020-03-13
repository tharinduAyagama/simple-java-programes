class stringFormatting{
    public static void main(String[] args) {
        settingString setObject = new settingString();
        
        System.out.println(setObject.hoursFormat());
        System.out.println(setObject.amPmFormat());
        System.out.println();

        setObject.setTimeValuesFirst(20, 3, 5);
        System.out.println(setObject.hoursFormat());
        System.out.println(setObject.amPmFormat());
        System.out.println();

        setObject.setTimeValuesSeocond(20, 3, 5);
        System.out.println(setObject.hoursFormat());
        System.out.println(setObject.amPmFormat());
        System.out.println();
    }
}