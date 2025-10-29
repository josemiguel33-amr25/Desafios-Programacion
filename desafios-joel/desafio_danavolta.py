nfilas, ncolumnas = map(int,input().split())
es_inversa = True 
contador_fila_lista2 = nfilas-1 
contador_columna_lista2 = ncolumnas-1 

lista_1= [[int(num) for num in input().split()] for _ in range(nfilas)] 
lista_2= [[int(num) for num in input().split()] for _ in range(nfilas)] 

for num_fila in range(len(lista_1)): 
    for num_columna in range(len(lista_2[0])): 
        lista1_seleccion = lista_1[num_fila][num_columna]
        lista2_seleccion = lista_2[contador_fila_lista2][contador_columna_lista2]
        
        if lista1_seleccion != lista2_seleccion:
            es_inversa = False 
            break
        contador_columna_lista2-=1  
    contador_fila_lista2-=1 
    contador_columna_lista2=ncolumnas-1

if es_inversa:
    print("SI")
elif not es_inversa:
    print("NO")