import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

# Definir la matriz de transición
P = np.array([[0.8, 0.2], [0.6, 0.4]])

# Calcular la matriz de transición de paso 5
P_5 = np.linalg.matrix_power(P, 5)

# Crear el mapa de temperatura
plt.figure(figsize=(8, 6))
sns.heatmap(
    P_5,
    annot=True,
    cmap="YlGnBu",
    cbar=True,
    xticklabels=["Estado 1", "Estado 2"],
    yticklabels=["Estado 1", "Estado 2"],
)
plt.title("Matriz de Transición de Paso 5")
plt.xlabel("Estados")
plt.ylabel("Estados")
plt.show()
