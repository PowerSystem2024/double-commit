<div align="center">
    <h1>Clase de GIT - UTN_FRSR</h1>
</div>

Este readme contiene la clase de git de la facultad UTN_FRSR de la cohorte 2024 de la carrera Tecnicatura Universitaria en Programación, mayormente sus comandos en la consola de Git Bash y sus utilidades.

Aquí algunos comandos:

```bash
# Clonar un repositorio remoto en tu máquina local
git clone <url_del_repositorio>

# Iniciar un nuevo repositorio en un directorio local
git init

# Agregar archivos al área de preparación (staging area) para el próximo commit
git add <nombre_del_archivo>

# Agregar todos los archivos modificados y eliminados al área de preparación
git add .

# Confirmar los cambios con un mensaje descriptivo
git commit -m "Mensaje del commit"

# Ver el estado de los archivos en el repositorio
git status

# Ver el historial de commits
git log

# Crear una nueva rama
git branch <nombre_de_la_rama>

# Cambiar a una rama específica
git checkout <nombre_de_la_rama>

# Crear una nueva rama y cambiar a ella en un solo comando
git checkout -b <nombre_de_la_rama>

# Fusionar una rama específica en la rama actual
git merge <nombre_de_la_rama>

# Descargar los cambios del repositorio remoto al repositorio local
git pull

# Subir cambios locales al repositorio remoto
git push

# Ver la diferencia entre el archivo local y el estado en el repositorio
git diff <nombre_del_archivo>

# Deshacer los cambios en un archivo y restaurarlo al último commit
git checkout -- <nombre_del_archivo>

# Ver la diferencia entre el archivo local y el estado en el repositorio
git diff <file_name>

# Eliminar un archivo del directorio de trabajo y del índice de git
git rm <file_name>

# Restablecer el estado del índice a la última confirmación
git reset HEAD <file_name>

# Deshacer los cambios en el directorio de trabajo
git checkout -- <file_name>

# Ver una lista detallada de los cambios realizados en un archivo
git log -p <file_name>

# Cambiar de rama conservando los cambios sin confirmar en el directorio de trabajo
git checkout -m <branch_name>

# Mostrar estadísticas sobre los archivos modificados y confirmaciones en el repositorio
git log --stat

# Mostrar la diferencia entre dos ramas
git diff <branch_name1>..<branch_name2>

# Eliminar una rama en git
git branch -d <nombre_de_la_rama>

# Si necesitas eliminar la rama de todas formas, incluso si no está completamente fusionada,
# puedes usar -D:
# La opción -D es más agresiva y forzará la eliminación, incluso si hay trabajo sin fusionar.
git branch -D <nombre_de_la_rama>

# Aplicar un parche desde un archivo o una URL
git apply <patch_file>

# Mostrar un resumen de las confirmaciones realizadas por cada colaborador
git shortlog

# Esto agregará un nuevo control remoto con el nombre especificado en lugar de "origin".</span>
git remote add nombre_deseado URL_del_repositorio_remoto

# Actualizar la URL del control remoto existente llamado "origin" con la nueva URL especificada.
git remote set-url origin nueva_URL

# Este comando realiza dos acciones en una sola línea:
# -a: Agrega todos los archivos modificados y eliminados al área de preparación (staging area).
# -m "Mensaje del commit": Agrega un mensaje al commit para describir los cambios realizados.
git commit -am "Mensaje del commit"

# Este comando permite agregar o arreglar el mensaje de un commit
git commit -amend -m "Mensaje del commit"

# Este comando permite deshacer tu último commit
# y el parámetro --soft mantiene los cambios en local
git reset --soft HEAD~1

# Este comando permite deshacer tu último commit
# y el parámetro --hard para borrarlos del todo
git reset --hard HEAD~1

# Si has hecho un push al repositorio tiene arreglo
# hacemos un git log --oneline para buscar el id del commit
git revert "identificador del commit" ej: b3be3e0369

# Este comando eliminará los archivos no rastreados
# que están pendientes de commit
git clean -f

# Este comando eliminará los directorios y archivos no rastreados
# que están pendientes de commit
git clean -fd
```
