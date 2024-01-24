// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int lowTemp = 32;
        int currentTemp =3;
        int minWarm = 60;
        String windDirection = "west";
        String[] words = {"Hello", "how", "are", "you", "doing?"};
        //System.out.println(true || (lowTemp+=5)>0);
        System.out.println(true | (lowTemp+=5)>0);

        System.out.println(lowTemp);
        if(currentTemp>minWarm) {
            System.out.println("Its warm outside");
        }
        else{
            System.out.println("its cold outside");
        }
        switch(windDirection){
            case "north":
                System.out.println("The wind is blowing from the north");
            case "east":
                System.out.println("The wind is blowing from the east");
            case "south":
                System.out.println("The wind is blowing from the south");
            case "west":
                System.out.println("The wind is blowing from the west");
                break;
            default:
                System.out.println("I dont know where the wind is coming from");
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        for (String eachWord: words){
            System.out.println(eachWord);
        }
        int j = 0;
        while(j<10){
            System.out.println(j);
            j++;
        }
        int [] algeria = {1,2,3,4,-1,-2,10};
        for (int i = 0; i < algeria.length; i++) {
            if (algeria[i]<0){
                System.out.println(algeria[i]+" is negative.");
            }
            else{
                System.out.println(algeria[i]+" is positive.");
            }
        }
        String name = "Mr. Killoran";
        String newName = name.substring(1,name.length()-1);
        System.out.println(newName);
    }
}