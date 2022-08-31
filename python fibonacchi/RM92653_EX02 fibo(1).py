## boas vindas
print('\033[34m*\033[m'*25,'\033[;4;33mOla Criancas!!! Bem vindos ao CONTROLADOR de GASTOS FINANCEIROS!\033[m \033[;1;35m:P\033[m','\033[34m*\033[m'*25,'\n')

## entrada de numeros transacoes financeiras
print('Favor preencher com as informacoes solicitadas abaixo.\n')
nf = int(input('Diga quantas transacoes financeiras voce fez hoje: '))

## variavel de total de gastos acumulados
accs = 0

## entrada dos valores de cada gasto
for gastos in range (1,nf+1):
    spd = float(input(f'Consulte seus recibos e diga quanto foi gasto na transacao numero {gastos}: '))
    accs = accs + spd

## final
print(f'No dia de hoje foram feitas {nf} transacoes, somando um total de R$ {accs} em gastos sendo o gasto medio R$ {accs/nf}.')