def contador_letras_aguja(cadena_aguja):
    contador_letrasaguja = ""
    letra_anterior = ""
    
    for letra in cadena_aguja:
        if letra == letra_anterior:
            continue
        elif letra != letra_anterior:
            contador_letrasaguja+=letra + " " + str(cadena_aguja.count(letra)) + " "

        letra_anterior = letra

    return contador_letrasaguja

def contador_letras_permutacion(cadena_permutacion):
    contador_letraspermutacion = ""
    letra_anterior = ""
    
    for letra in cadena_permutacion:
        if letra == letra_anterior:
            continue
        elif letra in contador_letraspermutacion:
            continue
        elif letra != letra_anterior:
            contador_letraspermutacion+=letra + " " + str(cadena_permutacion.count(letra)) + " "

        letra_anterior = letra

    return contador_letraspermutacion

if __name__ == "__main__":
    aguja = input()
    pajar = input()
    letra_anterior_copia = ""
    permutaciones_validas = []
    permutaciones = ""

    contador_permutaciones_validas = 0
    contador_indice = 0
    cont_letra_aguja = (contador_letras_aguja(aguja))

    longitud_aguja = len(aguja)
    

    ##EXTRAER TODAS LAS POSIBLES SUBcadenas
    for num_indice in range(len(pajar) - longitud_aguja + 1):
        permutacion = pajar[num_indice:num_indice+longitud_aguja]
            
        
        ##COMPROBACION PERMUTACION VALIDA:
        cont_letras_permutacion = contador_letras_permutacion(permutacion)   
        if cont_letras_permutacion == cont_letra_aguja:
            if permutacion not in permutaciones_validas:
                contador_permutaciones_validas+=1
                permutaciones_validas.append(permutacion)
    
    print(contador_permutaciones_validas)