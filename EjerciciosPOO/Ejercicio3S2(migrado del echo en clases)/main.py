#crear el metodo main  que imprima hola mundo
#importar la clase capturador
from capturador import Capturador

def main():
    print("Ingrese la operación: ")
    x = input()
    #crear una variable de tipo capturador
    e = Capturador()
   
    expresion = e.capturarError(x)
    print("El resultado de la operación es: ", e.resultado(expresion).getNum())


if __name__ == "__main__":
    main()
