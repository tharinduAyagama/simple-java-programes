import java.util.EnumSet;

class eNumeric{
    public static void main(String[] args) {
        for(subClass person : subClass.values()){
            System.out.printf("%s    %s    %s\n", person , person.getDescription() , person.getCountry());
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for(subClass person : EnumSet.range(subClass.aliice , subClass.nathaliya)){
            System.out.printf("%s    %s    %s\n", person , person.getDescription() , person.getCountry());

        }

        //we can access any data of subClass like below
        System.out.println(subClass.tharindu.getCountry());
        System.out.println(subClass.tharindu);

    }
}