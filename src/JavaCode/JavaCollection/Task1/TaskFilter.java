package JavaCode.JavaCollection.Task1;

import java.util.ArrayList;
import java.util.List;

public class TaskFilter {
    public List<?> filter(List<?> arr, Filter filter){
        List<? super Object> newList= new ArrayList<>();;
        for (int i = 0; i < arr.size(); i++){
            newList.add(filter.apply(arr.get(i)));
            if (newList.contains(null))
                newList.remove(null);
        }
        return newList;
    }
}
