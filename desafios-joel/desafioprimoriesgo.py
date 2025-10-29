from math import sqrt
def caracter_ascii(caracter):
    asciii = 0
    for a in caracter:
        asciii += ord(a) 

    return asciii

def primo_menor(numero): 
    resultado = True
    while True:
        numero= numero-1

        resultado = True
        if numero == 1:
            resultado = False
        elif numero == 2:
            resultado = True 
        else:   
            raizcuadrada = int(sqrt(numero)+1)    
        
            for i in range(3,raizcuadrada,2):
                if (numero%i == 0) or (numero%2 == 0):
                    resultado = False
                else:
                    resultado = True

        if resultado:
            primocercano = numero
            break
    return primocercano

if __name__ == "__main__":
    numerocasos = int(input())
    contador = 0
    while contador < numerocasos:
        caracter = (input())
        numero = caracter_ascii(caracter)
        print(primo_menor(numero))
        contador+=1