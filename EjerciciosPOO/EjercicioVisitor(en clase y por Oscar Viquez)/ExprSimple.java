package structure;

import visits.Visitor;

public abstract class ExprSimple<T> extends Expression<T>{
    private Object val;

    public ExprSimple(Object val) {
        this.val = val;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    @Override
    public abstract T visit(Visitor v, T arg);

}
