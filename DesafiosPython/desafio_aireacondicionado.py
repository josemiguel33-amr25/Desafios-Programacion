num_casos = int(input())

for _ in range(num_casos):
    grados = int(input())

    if grados >= 2**31:
        continue
    else:
        if grados == 0 or grados == 180 or grados >= 360:
            print("OK")
        else:
            print("BRONCA")