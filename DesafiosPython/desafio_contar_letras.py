frase = "_"
contador_letras = 0
alfabeto = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
lista_numero_letras = []

while frase != "FI":
    frase = input()
    if frase == "FI":
        break
    
    for letra in frase:
        if letra in alfabeto:
            contador_letras+=1

    lista_numero_letras.append(contador_letras)
    contador_letras = 0

for numero in lista_numero_letras:
    print(f"{numero}" + " ", end = "")