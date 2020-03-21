class mainMethod{
    public static void main(String[] args) {
        String a = "tharindu";
        String b = "ayagama";
        String c = "AYAGAMA";
    
        if(a.equals("tharindu")){
            System.out.println("this is tharindu");
        }
    
        if(b.equalsIgnoreCase(c)){
            System.out.println("ayagama is matched");
        }
    }
}