package structure;

import visits.Visitor;

public class OperExpr<T> extends Expression<T>{
    private String val;

    public OperExpr(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public T visit(Visitor v, T arg) {
        return (T) v.visitOperExpr(this,arg);
    }
}
