##TIPO 1 EAN-8 TIPO 2 = EAN-13
def calculo_codigo_pais(codigo_barras):
    if codigo_barras.startswith("0"):
        pais = "EEUU"
    elif codigo_barras.startswith("380"):
        pais = "Bulgaria"
    elif codigo_barras.startswith("50"):
        pais = "Inglaterra"
    elif codigo_barras.startswith("539"):
        pais = "Irlanda"
    elif codigo_barras.startswith("560"):
        pais = "Portugal"
    elif codigo_barras.startswith("70"):
        pais ="Noruega"
    elif codigo_barras.startswith("759"):
        pais = "Venezuela"
    elif codigo_barras.startswith("850"):
        pais = "Cuba"
    elif codigo_barras.startswith("890"):
        pais = "India"
    else:
        pais = "Desconocido"
    
    return pais
if __name__ == "__main__":

    while True:
        codigo_barras = input()
        codigo_barras_sin_control = codigo_barras[:-1]
        digito_control_cadena = int(codigo_barras[-1])

        contador_posicion = 1
        contador_indice = 0
        
        digito_control = 0
        
        if codigo_barras == "0":
            break

        if len(codigo_barras)-1 <= 8:
            tipo = 1
        elif len(codigo_barras)-1 > 8 and len(codigo_barras)-1 <= 13:
            tipo = 2

        
        for numero in codigo_barras_sin_control[::-1]:
            numero = int(numero)
            if contador_posicion%2 != 0:
                digito_control+=numero*3
            elif contador_posicion%2 == 0:
                digito_control+=numero*1
            contador_posicion+=1
        
        suma_digitos = digito_control+digito_control_cadena

        if suma_digitos % 10 == 0:
            codigo_barras_valido = True
        elif suma_digitos % 10 != 0:
            codigo_barras_valido = False

        if tipo == 1 and codigo_barras_valido:
            print(f"SI")
        elif tipo == 1 and not codigo_barras_valido:
            print(f"NO")
        elif tipo == 2 and codigo_barras_valido:
            pais_codigo_inicial = calculo_codigo_pais(codigo_barras)
            print(f"SI {pais_codigo_inicial}")
        elif tipo == 2 and not codigo_barras_valido:
            print(f"NO")
