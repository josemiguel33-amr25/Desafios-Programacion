while True:
    toros = list(map(int,input().split()))
    num_toros = toros[0]
    velocidades = toros[1:]
    
    mayor = 0
    for v in velocidades:
        if v > mayor:
            mayor = v
    #velocidad =  max(velocidades)
    print(mayor)