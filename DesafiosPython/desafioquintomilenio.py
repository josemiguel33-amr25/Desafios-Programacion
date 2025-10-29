def encontrar_mensaje(mensaje_en_buscar, mensaje_a_buscar):
    flag_mensaje_encontrado = True
    indice = 0
    mensaje_en_buscar = mensaje_en_buscar.lower()
           
    for i in mensaje_a_buscar.lower():
        if mensaje_en_buscar.find(i,indice) != -1:
            indice = mensaje_en_buscar.find(i)+1
        
        elif mensaje_en_buscar.find(i,indice) == -1:
            flag_mensaje_encontrado = False
            break


    return flag_mensaje_encontrado

if __name__ == "__main__":
    numerocasos = int(input())
    
    for _ in range(numerocasos):
        mensaje_en_buscar = input()
        mensaje_a_buscar = input()
        mensaje_encontrado = (encontrar_mensaje(mensaje_en_buscar,mensaje_a_buscar))
        
        if mensaje_encontrado == True:
            print(f"SI")
        else: 
            print(f"NO")




