package visits;

import structure.*;

public interface Visitor<T> {
    T visitIntExpr(IntExpr ctx, T arg);
    T visitStringExpr(StringExpr ctx, T arg);
    T visitFloatExpr(FloatExpr ctx, T arg);
    T visitOperExpr(OperExpr ctx, T arg);
}
