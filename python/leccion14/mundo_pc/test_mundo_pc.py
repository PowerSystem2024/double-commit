from Monitor import Monitor
from Teclado import Teclado
from Raton import Raton
from Computadora import Computadora
from Orden import Orden


if __name__ == "__main__":
    monitor1 = Monitor("HP", "24 pulgadas")
    teclado1 = Teclado("HP", "USB")
    raton1 = Raton("HP", "Bluetooth")
    computadora1 = Computadora("HP", monitor1, teclado1, raton1)
    print(computadora1)
    monitor2 = Monitor("Acer", "19 pulgadas")
    teclado2 = Teclado("Acer", "USB")
    raton2 = Raton("Acer", "USB")
    computadora2 = Computadora("Acer", monitor2, teclado2, raton2)
    print(computadora2)

    computadoras1 = [computadora1, computadora2]
    orden1 = Orden(computadoras1)

    monitor3 = Monitor("Lenovo", "17 pulgadas")
    teclado3 = Teclado("Lenovo", "USB")
    raton3 = Raton("Lenovo", "Bluetooth")
    computadora3 = Computadora("Lenovo", monitor3, teclado3, raton3)
    print(computadora1)
    monitor4 = Monitor("Gamer", "28 pulgadas")
    teclado4 = Teclado("Gamer", "USB")
    raton4 = Raton("Gamer", "USB")
    computadora4 = Computadora("AlienWare", monitor4, teclado4, raton4)
    print(computadora2)

    computadoras2 = [computadora3, computadora4]
    orden1 = Orden(computadoras1)
    print(orden1)

    monitor5 = Monitor("Dell", "17 pulgadas")
    teclado5 = Teclado("Dell", "USB")
    raton5 = Raton("Dell", "USB")
    computadora5 = Computadora("Dell", monitor5, teclado5, raton5)
    monitor6 = Monitor("Samsung", "17 pulgadas")
    teclado6 = Teclado("Samsung", "Bluetooh")
    raton6 = Raton("Samsung", "Bluetooh")
    computadora6 = Computadora("Dell", monitor5, teclado5, raton5)
    computadoras3 = [computadora5, computadora6]
    orden2 = Orden(computadoras3)
    orden2.agregar_computadora(computadora3)
    orden1.agregar_computadora(computadora6)
    print(orden2)
