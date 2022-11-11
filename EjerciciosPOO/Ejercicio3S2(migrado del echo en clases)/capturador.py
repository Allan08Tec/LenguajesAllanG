#crear una clase capturador que extienda de la clase Exception
from numeros import Numero
from operador import Operador


class Capturador(Exception):
   
#crear una funcion de tipo List y que reciba un parametro de tipo String

    def capturarError(self,cadena):
        lista = []
        try:
            for i in range(0, len(cadena)):
                #verifica si ingresa un operador valido
                if cadena[i] == '+' or cadena[i] == '-' or cadena[i] == '*' or cadena[i] == '/':
                    lista.append(cadena[i])
                #verificar si la cadena es un numero del 0 al 9
                elif cadena[i] == '0' or cadena[i] == '1' or cadena[i] == '2' or cadena[i] == '3' or cadena[i] == '4' or operacion[i] == '5' or operacion[i] == '6' or operacion[i] == '7' or operacion[i] == '8' or operacion[i] == '9':
                    lista.append(cadena[i])
                else:
                    raise Capturador("Error: Caracter no valido")
        except Capturador as e:
            print(e.mensaje)
        return lista


  #crear una funcion que depende del tipo de operador que se ingrese, se realice la operacion correspondiente

    def operar(self,num1,num2,operador):
        if operador == '+':
            return num1 + num2
        elif operador == '-':
            return num1 - num2
        elif operador == '*':
            return num1 * num2
        elif operador == '/':
            return num1 / num2
        else:
            return 0


    def resultado(self, lista):
        result = Numero(-1)
        try:
            for i, j in enumerate(lista):
                i = 0
                if len(lista) < 3:
                    raise Excepcion("Los elementos ingresados no son suficientes")
                n1 = lista[i]
                operador = lista[i+1]
                n2 = lista[i+2]
                if (type(n1).__name__ == "Num") and (type(n2).__name__ == "Num") and (type(operador).__name__ == "Op") :
                    result.setNum(self.operar(n1.getNum(),n2.getNum(),operador.getOp()))
                    lista.insert(0,result)
                    del lista[1:4]
                else:
                    raise Capturador("Error:Los elementos de la expresión no están ordenados en infijo")
                if len(lista) == 1:
                    return result
        
        except Capturador as e:
           print("eror")
        return result

      

      
