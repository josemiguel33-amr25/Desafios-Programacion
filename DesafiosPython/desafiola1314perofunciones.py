def comprobar_llave(calibres1, calibres2):
    if calibres1 - 1 == calibres2:
        if calibres2%2 == 0:
            llave_valida = True
    elif calibres2 - 1 == calibres1:
        if calibres1 %2 == 0:
            llave_valida = True
        else:
            llave_valida = False
    return llave_valida


if __name__ == "__main__":
    casosprueba = int(input())
    for _ in range(casosprueba):
        calibres1, calibres2 = map(int,input().split("-"))
        bandera = comprobar_llave(calibres1,calibres2)
        if bandera:
            print("SI")
        else:
            print("NO")