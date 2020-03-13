class passingArrayToMethods{
    public static void main(String[] args) {
        String array[] = {"kamal","nimal","amal","nayana","amara"};
        printing(array);
    }

    static void printing(String x[]) {
        for(String i:x){
            System.out.println("I'm " + i);
        }
    }
}