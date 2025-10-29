def calcular_numero_bolos(numero):
    if numero == 1:
        return 1
    return numero + calcular_numero_bolos(numero-1)
if __name__ == "__main__":  
    casos_prueba = int(input())
    for _ in range(casos_prueba):
        num_filas = int(input())
        print(calcular_numero_bolos(num_filas))