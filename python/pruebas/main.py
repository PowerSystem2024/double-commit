import requests

url = "https://docs.google.com/spreadsheets/d/e/2PACX-1vRhdeHyswVgUEwIQE4Fuis50gswvz4mDcgz43E1IVuRQeV5_qgw72-wwmCngbiFpIOfqksvIALohkBI/pub?output=csv"


def get_data_csv(url):
    res = requests.get(url)
    csv_txt = (
        res.text.strip()
    )  # Eliminamos espacios en blanco extras y nuevas líneas al final
    rows = csv_txt.splitlines()[
        1:
    ]  # Dividimos en líneas y omitimos la primera fila (encabezado)

    # Creamos una lista para almacenar los datos
    data = []
    for row in rows:
        # Nos aseguramos de dividir correctamente cada fila en cinco columnas
        columns = row.split(",")
        if len(columns) == 5:
            persona, edad, genero, correo, ciudad = columns
            data.append(
                {
                    "persona": persona,
                    "edad": edad,
                    "genero": genero,
                    "correo": correo,
                    "ciudad": ciudad,
                }
            )

    return data


# Obtenemos los datos
csv_data = get_data_csv(url)

# Imprimimos las ciudades de cada persona
for persona in csv_data:
    print(persona["persona"])
