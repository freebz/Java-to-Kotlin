int sum = ((Integer) Lists.fold(counts, new Integer(0),
    new Function2() {
        public Object apply(Object arg1, Object arg2) {
            int i1 = ((Integer) arg1).intValue();
            int i2 = ((Integer) arg2).intValue();
            return new Integer(i1 + i2);
        }
    })).intValue();