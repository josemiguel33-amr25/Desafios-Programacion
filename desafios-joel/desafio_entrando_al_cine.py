def comprobar_ramiro_abrir_puerta(num_vecinos, butacas):
    puede_abrir = True
    elemento_anterior = 0
    contador_fila_ramiro = 0
    for elemento in butacas:
        if elemento_anterior%2 != 0:
            if elemento%2 == 0:
                puede_abrir = False
                break
        elif elemento%2 == 0:
            contador_fila_ramiro+=1
        elemento_anterior = elemento
    
    return puede_abrir, contador_fila_ramiro

if __name__ == "__main__":
    num_casos = int(input())
    for _ in range(num_casos):
        num_vecinos_esperando = int(input())
        numero_butaca_cada_vecino = [int(x) for x in input().split()]
        puede_abrir_otra_fila, numero_personas = comprobar_ramiro_abrir_puerta(num_vecinos_esperando, numero_butaca_cada_vecino)
        if puede_abrir_otra_fila:
            print(f"{puede_abrir_otra_fila} {numero_personas}")
        else:
            print(f"{puede_abrir_otra_fila}")