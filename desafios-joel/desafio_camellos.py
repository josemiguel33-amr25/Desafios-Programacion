def comprobacion_variable_tipo(variable):
    variable_tipo = ""

    ##Comprobacion variable CamelCase
    if variable[0]  == variable[0].upper():
        variable_tipo = "CamelCase"
    elif "_" in variable:
        variable_tipo = "snake_case"
    elif "-" in variable:
        variable_tipo = "kebab-case"
    elif len(variable) == 1:
        variable_tipo = "snake_case"

    return variable_tipo

def transformacion_cadena(variable, tipo, tipo_a_convertir):
    contador_veces_iterar = 0
    variable_transformada = ""
    
    ##TRANSFORMACION TIPO CAMELCASE
    if tipo_variable == "CamelCase":
        if tipo_a_convertir == "kebab-case":
            for letra in variable:
                if letra == letra.upper() and contador_veces_iterar == 0:
                    variable_transformada+=letra.lower()
                elif letra == letra.upper() and contador_veces_iterar != len(variable)-1:
                    variable_transformada+= "-" + letra.lower()
                elif letra == letra.lower():
                    variable_transformada+=letra
                contador_veces_iterar+=1
        elif tipo_a_convertir == "snake_case":
            for letra in variable:
                if letra == letra.upper() and contador_veces_iterar == 0:
                    variable_transformada+=letra.lower()
                elif letra == letra.upper() and contador_veces_iterar != len(variable)-1:
                    variable_transformada+= "_" + letra.lower()
                elif letra == letra.lower():
                    variable_transformada+=letra
                contador_veces_iterar+=1

    letra_anterior = ""

    ##TRANSFORMACION snake_case
    if tipo_variable == "snake_case":
        if tipo_a_convertir == "CamelCase":
            for letra in variable:
                if contador_veces_iterar == 0:
                    variable_transformada+=letra.upper()
                elif letra_anterior == "_":
                    variable_transformada+=letra.upper()
                elif letra != "_":
                    variable_transformada+=letra
                letra_anterior = letra
                contador_veces_iterar+=1
        elif tipo_a_convertir == "kebab-case":
            for letra in variable:
                if letra == "_":
                    variable_transformada+="-"
                elif letra != "_":
                    variable_transformada+=letra
    
    ##TRANSFORMACION kebab-case

    if tipo_variable == "kebab-case":
        if tipo_a_convertir == "CamelCase":
            for letra in variable:
                if contador_veces_iterar == 0:
                    variable_transformada+=letra.upper()
                elif letra_anterior == "-":
                    variable_transformada+=letra.upper()
                elif letra != "-":
                    variable_transformada+=letra
                letra_anterior = letra
                contador_veces_iterar+=1
        elif tipo_a_convertir == "snake-case":
            for letra in variable:
                if letra == "-":
                    variable_transformada+="_"
                elif letra != "-":
                    variable_transformada+=letra

    return variable_transformada


if __name__ == "__main__":
    nombre_variable, tipo_convertir = input().split()
    tipo_variable = comprobacion_variable_tipo(nombre_variable)
    nombre_variable_transformada = transformacion_cadena(nombre_variable,tipo_variable,tipo_convertir)
    print(nombre_variable_transformada)