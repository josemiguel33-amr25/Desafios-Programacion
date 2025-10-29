def contar_cifras(num):
    if num== 0:
        return 0
    
    return 1 + contar_cifras(num//10)

if __name__ == "__main__":
    num_casos = int(input())
    for _ in range(num_casos):
        numero = int(input())
        print(contar_cifras(numero))