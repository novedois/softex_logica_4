'''
Estruture três códigos, os quais devem conter uma função de manipulação
de string que obtenha resultado.
'''

print('\n* * * * Manipulação de Strings * * * *\n')

texto = input('Digite uma palavra ou texto: ')

todas_maiusc = texto.upper()
todas_minusc = texto.lower()
tamanho_text = len(texto)
capitalizado = texto.title()

print(f'''
Texto informado: {texto}

Texto com todas as letras maiúsculas: {todas_maiusc}
Texto com todas as letras minúsculas: {todas_minusc}
Tamanho do texto: {tamanho_text}
Texto capitalizado: {capitalizado}
''')
