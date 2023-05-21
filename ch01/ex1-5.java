public interface Function2<A, B, R> {
    R apply(A arg1, B arg2);
}

int sum = Lists.fold(counts, 0,
    new Function2<Integer, Integer, Integer>() {
        @Override
        public Integer apply(Integer arg1, Integer arg2) {
            return arg1 + arg2;
        }
    });