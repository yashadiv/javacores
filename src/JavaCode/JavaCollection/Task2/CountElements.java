package JavaCode.JavaCollection.Task2;

import java.util.ArrayList;
import java.util.HashMap;

public class CountElements {
    public HashMap<?, Integer> counters(ArrayList<?> arr){
        HashMap<? super Object,Integer> counts = new HashMap<>();
        for(int i = 0; i<arr.size(); i ++){
            if (!counts.containsKey(arr.get(i))){
                counts.put(arr.get(i),1);
            }
            else {
                counts.put(arr.get(i),counts.get(arr.get(i))+1);
            }

        }
        return counts;
    }
}
