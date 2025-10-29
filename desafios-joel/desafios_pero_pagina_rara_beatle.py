nfilas = int(input())
ncolumnas = int(input())
donde_comienza = int(input())
contador_fila = donde_comienza
contador_veces_se_hace = 0

matriz = [[0] * nfilas for _ in range(ncolumnas)]

for _ in range(len(matriz)):
    if contador_fila >= len(matriz):
        break

    if contador_veces_se_hace == 0:
        for num_columnas in range(len(matriz[0])):
            matriz[contador_fila][num_columnas] = 1
    elif contador_veces_se_hace%2 == 0:
        for num_columnas in range(len(matriz[0])):
            matriz[contador_fila][num_columnas] = 1
    
    contador_veces_se_hace+=1 
    contador_fila+=1

if ncolumnas != 0:
    for fila in matriz:
        for elemento in fila:
            print(f"{elemento:>2}", end = " ")
        print()
elif ncolumnas == 0:
    print()
