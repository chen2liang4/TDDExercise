package distance.tdd;

import java.util.HashMap;
import java.util.Map;

public class DistanceMetric {
    public static Mile ConvertToMile(Distance origin) {
        int originBaseLength = ExchangeRatio.get(origin.getClass()) * origin.getLength();
        return new Mile(originBaseLength / ExchangeRatio.get(Mile.class));
    }

    public static Yard ConvertToYard(Distance origin) {
        int originBaseLength = ExchangeRatio.get(origin.getClass()) * origin.getLength();
        return new Yard(originBaseLength / ExchangeRatio.get(Yard.class));
    }

    public static boolean Compare(Distance from, Distance to) {
        int fromLength = ExchangeRatio.get(from.getClass()) * from.getLength();
        int toLength = ExchangeRatio.get(to.getClass()) * to.getLength();
        return fromLength == toLength;
    }

    public static Map<Class, Integer> ExchangeRatio = new HashMap<Class, Integer> () {{
        put(Yard.class, 1);
        put(Mile.class, 1760);
    }};
}
