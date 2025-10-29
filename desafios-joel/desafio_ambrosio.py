numerocasos = int(input())


for _ in range(numerocasos):
    alturapiramide = int(input())
    canicasnecesarias = 0
    contador = 0

    for i in range(1,alturapiramide+1):
        canicasnecesarias+=i**2

    print(canicasnecesarias)