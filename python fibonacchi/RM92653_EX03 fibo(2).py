## boas vindas
print('Verifique se o numero pertence a sequencia de Fibonnaci')

## entrada do numero a ser verificado
num = int(input('Digite o numero no qual voce gostaria de verificar: '))

## definicao das variaveis
n1 = 1
n2 = 1
ns = 2

## verificacao
while True:
    if num == 1:
        print('O numero pertence a sequencia de Fibonnaci!')
        break
    elif num == 2:
        print('O numero pertence a sequencia de Fibonnaci!')
        break
    elif ns == num:
        print('O numero pertence a sequencia de Fibonnaci!')
        break
    elif ns > num:
        print('O numero \033[35mNAO\033[m pertence a sequencia de Fibonnaci!')
        break

    n1 = n2
    n2 = ns
    ns = n1 + n2
