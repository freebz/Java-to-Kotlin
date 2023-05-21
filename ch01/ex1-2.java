public interface Function2 {
    Object apply(Object arg1, Object arg2);
}


public class Vectors {
    public static Object fold(Vector l, Object initial, Function2 f) {
        Object result = initial;
        for (int i = 0; i < l.size(); i++) {
            result = f.apply(result, l.get(i));
        }
        return result;
    }
    ... 그 외 벡터에 대한 연산
}


public class AddIntegers implements Function2 {
    public Object apply(Object arg1, Object arg2) {
        int i1 = ((Integer) arg1).getValue();
        int i2 = ((Integer) arg2).getValue();
        return new Integer(i1 + i2);
    }
}


int sum = ((Integer) Vectors.fold(counts, new Integer(0), new AddIntegers()))
    .intValue();