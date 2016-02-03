/**
 * Created by Daniel Matache
 * CIT 337
 * Assignment 2
 */
public class BeerSong {
    public static void main(String[] args) {

        int beerNum = 99;
        String word = "bottles";
        String word2 = "bottle";


        while (beerNum > 1) {

            System.out.println(beerNum + " " + word + " of beer on the wall, " + beerNum + " " + word + " of beer");
            System.out.println("take one down, pass it around, " + (beerNum - 1) + " " + word + " " + "of beer on the wall.");
            beerNum = beerNum - 1;

            if (beerNum == 1){
                System.out.println(beerNum + " " + word2 + " of beer on the wall, " + beerNum + " " + word2 + " of beer");
            }

        }
            System.out.println("take one down, pass it around, no more bottles of beer on the wall.");

    }
}
