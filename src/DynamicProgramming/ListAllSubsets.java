package DynamicProgramming;

/**
 * Created by anusha on 11/18/16.
 */
import java.util.*;

public class ListAllSubsets {

    public static List<List<String>> getSubsets(List<String> input){
        List<List<String>> result = new ArrayList<>();

        for(String str : input){


            if(!result.isEmpty()){
                List<List<String>> tempResult = new ArrayList<>();
                for(List<String> res : result){
                    List<String> temp = new ArrayList<>(res);
                    temp.add(str);
                    tempResult.add(temp);
                }
                for(List<String> t : tempResult){
                    result.add(t);
                }

            }

            List<String> newList = new ArrayList<String>();
            newList.add(str);

            result.add(newList);

        }

        return result;

    }
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("1");
        input.add("3");
        input.add("5");
        input.add("7");
        System.out.println(getSubsets(input));
    }
}