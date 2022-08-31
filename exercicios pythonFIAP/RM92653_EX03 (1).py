segunda = int=(input("Qual o dia da semana você deseja votar:"))
terca = int
quarta = int
quinta = int
sexta = int
print ("O dia escolhido é {}.".format(segunda))

if segunda > terca and segunda > quarta and segunda > quinta and segunda > sexta:\
    print("Segunda-feira foi o dia vencedor no total de {} votos".format(segunda))
elif segunda == terca or segunda == quarta and terca > quinta and terca > sexta:
    print("Empate:segunda")
if terca > segunda and terca > quarta and terca > quinta and terca > sexta:
    print("Terça-feira foi o dia vencedor no total de {} votos".format(terca))
elif terca == segunda or terca == quarta or terca == quinta or terca == sexta:
    print("Empate: Terça")
if quarta > terca and quarta > segunda and quarta > quinta and quarta > sexta:
    print("Quarta-feira foi o dia vencedor no total de {} votos".format(quarta))
elif quarta == segunda or terca == quarta or quarta == quinta or quarta == sexta:
    print("Empate: Quarta")
if quinta > segunda and quinta > terca and quinta > quarta or quinta > sexta:
    print("Quinta-feira foi o dia vencedor no total de {} votos".format(quinta))
elif quinta == segunda and quinta == terca and quinta == quarta or quinta == sexta:
    print("Empate: Quinta")
if sexta > terca and sexta > quarta and sexta > quinta and sexta > segunda:
    print("Sexta-feira foi o dia vencedor no total de {} votos".format(sexta))
