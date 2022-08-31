peso = float(input("Qual é o seu peso?"))
altura = float(input("Qual é a sua altura?"))
imc = peso/ altura *2
print (imc)
if imc < 16:
    print("Seu IMC é: Baixo peso Grau III")
elif imc >= 16 and imc < 16.99:
    print ("Seu IMC é: Baixo peso Grau II")
elif imc >= 17 and imc < 18.49:
    print("Seu IMC é: Baixo peso Grau I")
elif imc >= 18.50 and imc < 24.99:
    print("Você está no peso ideal!")
elif imc >= 25 and imc < 29.99:
    print("Você está com sobrepeso")
elif imc >= 30 and imc < 34.99:
    print ("Você está em obesidade Grau I")
elif imc >= 35 and imc < 39.99:
    print ("Você está em obesidade Grau II")
elif imc > 40:
    print ("Você está em obesidade Grau III")
