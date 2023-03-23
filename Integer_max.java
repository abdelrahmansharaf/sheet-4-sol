import java.util.ArrayList;
public class Integer_max {
    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0)
            return null;

        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }
}
