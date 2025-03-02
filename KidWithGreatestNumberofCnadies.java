//Leetcode1431: Kids With the Greatest Number of Candies
import java.util.*;
public class KidWithGreatestNumberofCnadies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        KidWithGreatestNumberofCnadies obj = new KidWithGreatestNumberofCnadies();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> list = obj.kidsWithCandies(candies, extraCandies);
        System.out.println(list);
    }
}