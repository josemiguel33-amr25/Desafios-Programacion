def comprobar_si_cumplen_mismo_dia(cumpleanos):
    lista_solo_con_dias = [elemento[:-5] for elemento in cumpleanos]
    lista_si_hay_dos = [elemento for elemento in lista_solo_con_dias if lista_solo_con_dias.count(elemento) > 1]
    
    if len(lista_si_hay_dos) >= 1:
        si_cumplen_el_mismo_dia = True
    elif len(lista_si_hay_dos) < 1:
        si_cumplen_el_mismo_dia = False

    return si_cumplen_el_mismo_dia

if __name__ == "__main__":
    num_personas_grupo = 1
    while num_personas_grupo != 0:
        num_personas_grupo = int(input())
        cumples = list(input().split())
        if num_personas_grupo == 0:
            break
        print(comprobar_si_cumplen_mismo_dia(cumples))