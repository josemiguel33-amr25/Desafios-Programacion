nfilas, ncolumnas = map(int,input().split())
lista_precios = []
lista_precios = [list(map(int, input().split())) for _ in range(nfilas)]
#lista_precios = [
    #list(map(int, input().split())) for _ in range(nfilas)
#]
aumento = int(input())


for indice_fila in range(len(lista_precios)):
    for indice_columna in range(len(lista_precios[0])):
        lista_precios[indice_fila][indice_columna] *= aumento


for fila in lista_precios:
    for elemento in fila:
        print(f"{elemento:>2}", end = " ")
    print()