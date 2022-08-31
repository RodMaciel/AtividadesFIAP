print("Faca uma escolha de assinatura:")
print("basic 30%")
basic=30
print("silver 20%")
silver=20
print("gold 10%")
gold=10
print("platinum 5%")
platinum=5
opcao=int(input("Entre com o código do seu cargo:"))
if(opcao==basic):
print("Você contratou a assinatura basic e sua porcentagem paga será de {}".format(basic(basic*0.30))
elif(opcao==silver):
print("Você contratou a assinatura silver sua porcentagem paga será de {}".format(silver(silver*0.20))
elif(opcao==gold):
print("Você contratou a assinatura gold e sua porcentagem paga será de {}".format(gold)(platinum*0.10))
elif(opcao==plainum):
print("Você contratou a assinatura platinum e sua porcentagem paga será de {}".format(platinum(platinum*0.5))