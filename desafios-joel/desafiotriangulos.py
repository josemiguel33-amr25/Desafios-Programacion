npros = int(input())
for _ in range(npros):
    l1, l2, l3 = map(int,input().split())
    lados = l1,l2,l3
    mayor = 0

    for v in lados:
        if v > mayor:
            mayor = v
    
    if mayor == l1:
         if mayor >= l2+l3:
             print("IMPOSIBLE")
    elif mayor == l2:
        if mayor >= l1+l3:
            print("IMPOSIBLE")
    elif mayor == l3:
        if mayor >= l1+l2:
            print("IMPOSIBLE")    

    ## if mayor>=(l1+l2+l3-mayor) print imposible mucho mas facil así             

    if mayor == l1:
        calctriangulo = (l2**2)+(l3**2)
    elif mayor == l2:
        calctriangulo = (l1**2)+(l3**2)    
    elif mayor == l3:
        calctriangulo = (l1**2)+(l2**2)

    
    mayor = mayor ** 2

    if mayor < calctriangulo:
        print("Acutangulo")
    elif mayor == calctriangulo:
        print("Rectangulo")
    elif mayor > calctriangulo:
        print("OBTUSANGULO")        