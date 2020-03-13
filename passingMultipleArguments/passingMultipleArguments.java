class passingMultipleArguments{
    public static void main(String[] args) {
        int avarage1 = avarage(10 , 20 , 30);
        int avarage2 = avarage(10 , 20 , 30 , 40 ,50);
        System.out.println(avarage1);
        System.out.println(avarage2);
    }

    //we can pass any number of aruguments when we call this function
    static int avarage(int ... x) {
        int total=0;
        for(int i:x){
            total += i;
        }
        return total/x.length;
    }
}