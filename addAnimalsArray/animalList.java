class animalList{

    public animal animals[] = new animal[10];
    private int i;

    public void addAnimal(animal x){
        if(i < animals.length){
            animals[i] = x;
            System.out.println("animal added to index " + i);
            i++;
        }
    }
}