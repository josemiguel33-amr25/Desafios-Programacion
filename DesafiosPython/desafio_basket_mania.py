num_casos = int(input())

for _ in range(num_casos):
    num_lineas = int(input())
    acumulador_puntos_local = 0
    acumulador_puntos_visitante = 0

    for _ in range(num_lineas):
        datos = input()
        
        valor1 = datos[0]
        valor2  = int(datos[2])

        if valor1 == "V":
            acumulador_puntos_visitante+=valor2
        elif valor1 == "L":
            acumulador_puntos_local+=valor2
    
    if acumulador_puntos_local == acumulador_puntos_visitante:
        print(f"E {acumulador_puntos_local} {acumulador_puntos_visitante}")
    elif acumulador_puntos_local > acumulador_puntos_visitante:
        print(f"L {acumulador_puntos_local} {acumulador_puntos_visitante}")
    elif acumulador_puntos_local < acumulador_puntos_visitante:
        print(f"V {acumulador_puntos_local} {acumulador_puntos_visitante}")