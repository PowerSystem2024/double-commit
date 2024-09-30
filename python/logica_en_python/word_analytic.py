from colorama import init, Fore

init()

print("\n|---------------------|")
print("| Contador de Vocales |")
print("|          y          |")
print("|       Palabras      |")
print("|---------------------|\n")
word = input("Ingrese una palabra: ")


def analytics(word):
    vowels = "aeiouAEIOUáéíóúÁÉÍÓÚ"
    words = len(word.split())
    vowels_counter = 0
    for i in word:
        if i in vowels:
            vowels_counter += 1
    return vowels_counter, words


vowels, words = analytics(word)

print(
    f"""
    Cantidad de palabras: {words}
    La cantidad de vocales que hay en el texto: {Fore.LIGHTGREEN_EX}'{word}'{Fore.WHITE} son: {Fore.LIGHTYELLOW_EX}{vowels}
    """
)
