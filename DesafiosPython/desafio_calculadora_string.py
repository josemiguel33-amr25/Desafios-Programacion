num_casos = int(input())

for _ in range(num_casos):
    operacion = input()
    operacion_con_espacios = ""
    n1 = ""
    operador = ""
    n2 = ""

    for letra in operacion:
        if letra == " ":
            operacion_con_espacios+="_"
        elif letra != " ":
            operacion_con_espacios+=letra
    
    for letra in operacion:
        if letra == "+" or letra == "-" or letra == "*" or letra == "/":
            operador+=letra
            break
        elif letra != "_":
            n1+=letra
