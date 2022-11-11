package structure;

import visits.Visitor;

public class FloatExpr<T> extends ExprSimple<T> {

    public FloatExpr(Object val) {
        super(val);
    }

    @Override
    public T visit(Visitor v, T arg) {
        return (T) v.visitFloatExpr(this,arg);
    }

}
