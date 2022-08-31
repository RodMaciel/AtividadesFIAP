## boas vindas
print('\033[34m*\033[m'*5,'\033[;4;33mBem vindo ao contador de calorias!\033[m \033[;1;35m\033[m','\033[34m*\033[m'*5,'\n')

## entrada de numeros de refeicoes
print('Favor preencher com as informacoes solicitadas abaixo.\n')
nf = int(input('Diga quantos alimentos foram consumidos hoje: '))

## variavel de total de calorias acumuladas no dia
accal = 0

## entrada do numero de calorias
for alimento in range (1,nf+1):
    ncal = float(input(f'Consulte uma tabela calorica e diga quantas calorias foram consumidas no {alimento} alimento: '))
    accal = accal + ncal

## relatorio final
print(f'No dia de hoje foram consumidos {nf} alimentos somando um total de {accal} calorias.')