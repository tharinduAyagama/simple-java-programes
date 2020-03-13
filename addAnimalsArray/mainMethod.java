class mainMethod{
    public static void main(String[] args) {
        dog dogObject = new dog();
        cat catObject = new cat();

        animalList animalListObject = new animalList();

        animalListObject.addAnimal(dogObject);
        animalListObject.addAnimal(catObject);

        System.out.println();

        for(animal i : animalListObject.animals){
            i.noise();
        }
        

    }
}