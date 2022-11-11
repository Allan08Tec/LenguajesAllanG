package structure;

import visits.Visitor;

public class StringExpr<T> extends ExprSimple<T>{

    public StringExpr(Object val) {
        super(val);
    }

    @Override
    public T visit(Visitor v, T arg) {
        return (T) v.visitStringExpr(this,arg);
    }
}
