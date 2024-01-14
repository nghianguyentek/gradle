package vn.kihon;

aspect CalculatorAspect {
    after(Calculator c, int a, int b) returning(int r): target(c)
                                        && args(a, b)
                                        && call(int add(int, int)) {
        System.out.println(c.getClass().getName()
            + ".add(" + a
            + ", " + b
            + ") = " + r
        );
    }
}