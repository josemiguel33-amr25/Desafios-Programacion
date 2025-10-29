acumulador = 0
aviso = True
while aviso:
    x1,y1,x2,y2 = map(int,input().split())

    if (x2-x1<0)and(y2-y1<0):
        aviso = False
    else:    
        area = (y2-x1)*(x2-y1)
        print(area)