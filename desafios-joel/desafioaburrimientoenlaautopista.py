if __name__ == "__main__":
    casosdeprueba = int(input())
    for _ in range(casosdeprueba):
        matriculas = input().split()

        antiguas = 0
        modernas = 0
        
        max_matriculas = len(matriculas)
        matricula_propia = matriculas[0]
        matricula_coche = matriculas[1]


        for i in range(2,max_matriculas): 
            letras_propia = matricula_propia[4:] 
            numeros_propios = matricula_propia[:4]
            letras_coche = matricula_coche[4:]
            numeros_coche = matricula_coche[:4]

            if letras_propia < letras_coche:
                antiguas+=1
            elif letras_propia > letras_coche:
                modernas+=1
            elif letras_propia == letras_coche:
                if numeros_propios > numeros_coche:
                    antiguas+=1
                elif numeros_propios < numeros_coche:
                    modernas+=1
            matricula_coche=matriculas[i]

        print(f"{antiguas} {modernas}")
