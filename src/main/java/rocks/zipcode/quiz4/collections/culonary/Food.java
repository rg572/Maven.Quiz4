package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private Map<Class<? extends Spice>, Integer> spiceCount = new HashMap<>();
    private List<Spice> allSpices = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return allSpices;
    }

    // This works, but the introduction of SpiceType is needless convoluted and has no effect on the test
    // In the spirit of the quiz, I've kept the method signature as supplied but the commented out
    // getSpiceCount() method bellow is superior
    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> stupidMap = new HashMap<>();
        for(Class spiceClass : spiceCount.keySet()){
            stupidMap.put((SpiceType)spiceClass, spiceCount.get(spiceClass));
        }
        return stupidMap;
    }


//    public Map<Class<? extends Spice>, Integer> getSpiceCount() {
//        return spiceCount;
//    }

    public void applySpice(Spice spice) {
        allSpices.add(spice);
        spiceCount.merge(spice.getClass(), 1, Integer::sum);
    }
}
