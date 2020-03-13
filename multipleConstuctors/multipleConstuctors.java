class multipleConstuctors{
    public static void main(String[] args) {
        constructors objest1 = new constructors();
        constructors objest2 = new constructors(12);
        constructors objest3 = new constructors(12,4);
        constructors objest4 = new constructors(12,4,13);

        System.out.println(objest1.timeString());
        System.out.println();
        
        System.out.println(objest2.timeString());
        System.out.println();
        
        System.out.println(objest3.timeString());
        System.out.println();

        System.out.println(objest4.timeString());
        System.out.println();

        
        System.out.println("number of objects is " + objest1.getObjectCount());
        System.out.println("number of objects is " + objest2.getObjectCount());
        System.out.println("number of objects is " + objest3.getObjectCount());
        System.out.println("number of objects is " + objest4.getObjectCount());

        System.out.println(constructors.getObjectCount());   // we can access objectCount like this coz it is not different in objects 
        
    }
}