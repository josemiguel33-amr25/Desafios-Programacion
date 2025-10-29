numerocasos = int(input())


for _ in range(numerocasos):
    alturapiramide = int(input())
    canicasnecesarias = 0
    contador = 0
    for _ in range(alturapiramide):
        contador+=1
        for i in range(1,contador+1):
            canicasnecesarias+=i
    print(canicasnecesarias)