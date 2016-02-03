/**
 * Created by Daniel Matache
 * CIT 337
 * Assignment 2
 */
public class BeerSong {
    //Created Main function
    public static void main(String[] args) {

        Ninety_Nine_Bottles_of_Beer(); //Calling 99 beer bottles song function

    }

    //Created 99 bottles of beer song function
    private static void Ninety_Nine_Bottles_of_Beer() {
        int beerNum = 99;  //Variable for number of 99 beer bottles
        String word = "bottles"; //Variable for word bottles
        String word2 = "bottle"; //Variable for single bottle


        //Created while loop to run program while the number of beer bottles is greater than 1
        while (beerNum > 1) {

            //Print out the beer bottle song lyrics and enter the correct bottle number for each line
            System.out.println(beerNum + " " + word + " of beer on the wall, " + beerNum + " " + word + " of beer");
            System.out.println("take one down, pass it around, " + (beerNum - 1) + " " + word + " " + "of beer on the wall.");
            beerNum = beerNum - 1; //Decrease the beer bottle number each time the loop runs

            //If statement to determine if the beer bottle number is one
            if (beerNum == 1){
                //Print out the beer bottle song lyric when the bottle count reaches one and print out one bottle
                System.out.println(beerNum + " " + word2 + " of beer on the wall, " + beerNum + " " + word2 + " of beer");
            }

        }
        //Print out final lyric with no more bottles of beer
        System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
    }
}
