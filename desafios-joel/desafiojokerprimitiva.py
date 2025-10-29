if __name__ == "__main__":
    casos_prueba = int(input())
    for i in range(casos_prueba):
        
        cadena_numero1, cadena_numero2 = input().split()
        cadena_numero1 = sorted(cadena_numero1) 
        cadena_numero2 = sorted(cadena_numero2)
        
        for _ in range(1):
            if cadena_numero1 == cadena_numero2:
                print("GANA")
            else:
                print("PIERDE")