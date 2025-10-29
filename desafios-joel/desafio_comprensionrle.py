num_casos = int(input())

for _ in range(num_casos):
    entrada = input()
    contador_indice = 0
    traduccion = ""
    simbolo_anterior = ""
    
    while contador_indice < len(entrada):
        simbolo = entrada[contador_indice]
        if simbolo_anterior == simbolo:
            contador_indice+=1
            continue
        elif simbolo_anterior != simbolo:
            contador_simbolo = str(entrada.count(simbolo, contador_indice))
            traduccion+=contador_simbolo + " " + simbolo + " "

        simbolo_anterior = simbolo
        contador_indice+=1
    
    print(traduccion)
