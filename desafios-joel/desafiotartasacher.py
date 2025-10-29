casosprueba = int(input())
tabletasnecesarias = 1
for _ in range(casosprueba):
    ancho, alto, cuadradosnecesarios = map(int,input().split())
    if ancho*alto >= cuadradosnecesarios:
        tabletasnecesarias = 1
    elif ancho*alto < cuadradosnecesarios:
        cuadradostengo = ancho*alto
        while True:
            cuadradostengo*=2
            if cuadradostengo >= cuadradosnecesarios:
                tabletasnecesarias+=1
                break
            elif cuadradostengo < cuadradosnecesarios:
                tabletasnecesarias+=1
    print(f"{tabletasnecesarias}")