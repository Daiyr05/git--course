
import javafx.scene.input.InputMethodTextRun;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,4);
        map.put(1,7);
        map.put(2,4);
        map.put(3,5);
        HashMap<Integer,int[]> map2 = new HashMap<>();
        map2.put(0,new int[]{1,2});
        map2.put(1,new int[]{1,2});
        map2.put(2,new int[]{2,2});
        map2.put(3,new int[]{3,1});
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(7);

        HashMap<Integer,int[]> res = new HashMap<>();
        int s = map.size();
        for (int i =0; i < arr.size(); i++){
            for(int j = 0; j <s; j++){
                if(map.get(j)==arr.get(i)){
                    map.remove(j);
                    res.put(i,map2.get(j));
                    break;
                }
            }
        }

        for(int i = 0; i < arr.size(); i++){
            System.out.println(res.get(i)[0]+" "+res.get(i)[1]);
        }
    }

}



