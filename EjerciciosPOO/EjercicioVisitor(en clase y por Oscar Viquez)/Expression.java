package structure;

import visits.Visitor;

public abstract class Expression<T> {

    public abstract T visit(Visitor v, T arg);

}
