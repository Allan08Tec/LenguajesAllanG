import structure.Expression;
import structure.*;
import visits.CheckExpressionVisitor;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList expr1 = new LinkedList<Expression>();
        LinkedList expr2 = new LinkedList<Expression>();

        //primera expresión para validar errores de forma
        expr1.add(new IntExpr<Object>(3));
        expr1.add(new OperExpr<Object>("+")); //comentar para generar error de formato y descomentar para eliminar el error de formato
        expr1.add(new StringExpr<Object>("hola")); //comentar para generar un error de faltante de algun elemento para una expresión matemética válida
        //expr1.add(new OperExpr<Object>("+")); //comentar para generar error de formato y descomentar para eliminar el error de formato

        CheckExpressionVisitor cev = new CheckExpressionVisitor();

        try {
            for (int i = 0; i < expr1.size(); i = i + 3){
                int val1,val2,val3;
                val1 = (int)((Expression)expr1.get(i)).visit(cev,null);
                val2 = (int)((Expression)expr1.get(i+1)).visit(cev,null);
                val3 = (int)((Expression)expr1.get(i+2)).visit(cev,null);

                if ( val2 != 3)
                    throw new RuntimeException(); //no hay un operador
                else if ( val1 == 3)
                    throw new RuntimeException(); //no hay una expresión simple
                else if ( val3 == 3)
                    throw new RuntimeException(); //no hay una expresión simple
                else
                    System.out.println("La expresión matemática en infijo está bien formada");
            }

        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Error por cantidad de elementos incorrecta para una expresión matemática");
        }
        catch(RuntimeException e){
            System.out.println("Error por orden inválido de los elementos para una expresión matemática en infijo");
        }

        //segunda expresión para validar errores de tipo
        expr2.add(new IntExpr<Object>(3));
        expr2.add(new OperExpr<Object>("+"));
        expr2.add(new IntExpr<Object>(10));
        expr2.add(new OperExpr<Object>("*"));
        expr2.add(new StringExpr<Object>("hola")); //cambiar por un entero para eliminar el error de tipo y poder devolver un valor

        //FALTARÍA EL VISITOR QUE HAGA ESTO

    }
}
