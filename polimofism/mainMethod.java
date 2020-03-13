class mainMethod{
    public static void main(String[] args) {
        food fArray[] = new food[2];
        fArray[0] = new cake();     //we can create a cake object witch the type of food 
        fArray[1] = new rice();

        for(food x : fArray){
            x.eat();
        }
        
        System.out.println();

        bite biteObject = new bite();

        cake cakeObject = new cake();
        rice riceObject = new rice();

        biteObject.eatFun(cakeObject);
        biteObject.eatFun(riceObject);      //we can use cake objrct and rice object to a place witch need a food object


    }
}