package arraysvscollections;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Integer[] myLottoNumbers = { 3, 20, 19, 3, 7, 13 };

        for (int i : myLottoNumbers){
            System.out.println(i);
        }

        // Try that with a collection
        // List<Integer> myLottoList = new ArrayList<>(Arrays.asList(myLottoNumbers));
        Set<Integer> myLottoList = new TreeSet<Integer>(Arrays.asList(myLottoNumbers));
        // Same way to iterate as an array!
        System.out.println("Print out list:");
        for (int i : myLottoList){
            System.out.println(i);
        }

        // Collections.sort(myLottoList);
        System.out.println("Print out list:");
        for (int i : myLottoList){
            System.out.println(i);
        }

        myLottoList.add(3);
        myLottoList.remove(0);
        System.out.println("Print out list:");
        for (int i : myLottoList){
            System.out.println(i);
        }



    }
}
