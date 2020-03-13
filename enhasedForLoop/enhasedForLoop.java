class enhasedForLoop{
    public static void main(String[] args) {
        int array[] = {10,20,30,40};
        int sum=0;

        //in this loop x equals to values of each indexes at a time
        for(int x: array){
            sum += x;
        }
        System.out.println(sum);
    }
}