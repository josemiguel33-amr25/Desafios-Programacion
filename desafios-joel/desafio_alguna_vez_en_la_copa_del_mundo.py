def calculo_goles(goles):
    if goles == "":
        return 0

    return int(goles[-1]) + int(calculo_goles(goles[:-1]))

if __name__ == "__main__":
    casos_prueba = int(input())
    for _ in range(casos_prueba):
        goles = input()
        print(calculo_goles(goles))