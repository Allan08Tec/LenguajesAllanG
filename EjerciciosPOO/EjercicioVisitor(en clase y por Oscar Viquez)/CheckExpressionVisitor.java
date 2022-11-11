package visits;

import structure.FloatExpr;
import structure.IntExpr;
import structure.OperExpr;
import structure.StringExpr;

public class CheckExpressionVisitor implements Visitor<Object>{
    @Override
    public Object visitIntExpr(IntExpr ctx, Object arg) {
        return 0;
    }

    @Override
    public Object visitStringExpr(StringExpr ctx, Object arg) {
        return 1;
    }

    @Override
    public Object visitFloatExpr(FloatExpr ctx, Object arg) {
        return 2;
    }

    @Override
    public Object visitOperExpr(OperExpr ctx, Object arg) {
        return 3;
    }
}
