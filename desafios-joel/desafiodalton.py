personajes = 1
comprobacion = False
anterior = 0
while personajes != 0:
    personajes = int(input())
    if personajes !=0:
        alturas = list(map(int,input().split(" ")))
        
        for i in alturas:
            anterior = alturas[0+1]
            if i >= anterior :
                comprobacion=True
            break
        
        if comprobacion:
            print("DALTON")
        elif not comprobacion:
            print("DESCONOCIDOS")            

         
    ###ARREGLAR
