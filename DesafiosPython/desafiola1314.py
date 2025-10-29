casosprueba = int(input())

for _ in range(casosprueba):
    calibres1, calibres2 = map(int,input().split("-"))
    if calibres1 - 1 == calibres2:
        if calibres2%2 == 0:
            llave_valida = True
    elif calibres2 - 1 == calibres1:
        if calibres1 %2 == 0:
            llave_valida = True
        else:
            llave_valida = False

    if llave_valida:
        print("SI")
    else:
        print("NO")            