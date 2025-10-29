fi, c = map(int,input().split())
contador_puntos = 0
lista_coordenadas = []
lista_coordenadas = [list(map(int,input().split())) for _ in range(fi)]

coordenada_fila, coordenada_columna = map(int,input().split())

for indice_fila in range(len(lista_coordenadas)):
    for indice_columna in range(len(lista_coordenadas[0])):
        if indice_fila == coordenada_fila:
            contador_puntos+=lista_coordenadas[indice_fila][indice_columna]
            lista_coordenadas[indice_fila][indice_columna] = "x"
        elif indice_columna == coordenada_columna:
            contador_puntos+=lista_coordenadas[indice_fila][indice_columna]
            lista_coordenadas[indice_fila][indice_columna] = "x" 
        

print(contador_puntos)

for fila in lista_coordenadas:
    for elemento in fila:
        print(f"{elemento:>2}", end = " ")
    print()