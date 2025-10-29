num_casos = int(input())

for _ in range(num_casos):
    cadena = input()
    cadena_cambiada = input()
    indices = ""
    contador_iteraciones = 0

    if cadena != cadena_cambiada:
        for letra in cadena:
            if letra != cadena_cambiada[contador_iteraciones]:
                indices+=str(contador_iteraciones)+" "
            contador_iteraciones+=1
    elif cadena == cadena_cambiada:
        letra_igual = cadena[0]

        for letra in cadena:
            cantidad_letra = cadena.count(letra)
            
            if ord(letra_igual) > ord(letra) and cantidad_letra >= 2:
                letra_igual = letra
        
        for letra in cadena:
            if letra == letra_igual:
                indices+=str(contador_iteraciones)+" "
            contador_iteraciones+=1

    
    print(indices)
    
