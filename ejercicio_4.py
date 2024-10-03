peso = float(input("Ingresa tu peso en kilogramos: "))
altura = float(input("Ingresa tu altura en metros: "))

imc = float(peso / (altura * altura))

print("Su IMC es: " ,imc)

if  imc <= float(18.5):
    print("Bajo peso")
elif imc <= float(25.0):
    print("Normal")
elif imc <= float(30.0):
    print("sobre peso")
elif imc > float(30.0):
    print("Obeso")

