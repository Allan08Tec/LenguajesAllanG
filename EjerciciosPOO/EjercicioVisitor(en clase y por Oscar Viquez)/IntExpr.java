package structure;

import visits.Visitor;

public class IntExpr<T> extends ExprSimple<T>{

    public IntExpr(Object val) {
        super(val);
    }

    @Override
    public T visit(Visitor v, T arg) {
        return (T) v.visitIntExpr(this,arg);
    }
}
