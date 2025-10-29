def findsmartshackers(lista_correos):
    dominio_mas_usado = ""
    dominios = [elemento[elemento.index("@"):] for elemento in lista_correos]
    contador_correo_mas_usado = 0
    numero_mayor = 0

    ##Contamos el dominio que mas se repite
    for elemento in dominios:
        contador_correo_mas_usado = dominios.count(elemento)
        if contador_correo_mas_usado > numero_mayor:
            numero_mayor = contador_correo_mas_usado
            dominio_mas_repetido = elemento
    
    lista_correos_hackers = [elemento for elemento in lista_correos if dominio_mas_repetido in elemento]
    
    return lista_correos_hackers


if __name__ == "__main__":
    lista_hackers = [
'hola@somoshackersastutos.com', 'ambrosio@outlook.com', 'coco@malandriners.dev',
'hello@somoshackersastutos.com', 'ambrosio@outlook.com',
'ciao@somoshackersastutos.com', "ambrosio@outlook.com", "amboriso@outlook.com"]

lista_con_solo_hackers = findsmartshackers(lista_hackers)
print(lista_con_solo_hackers)