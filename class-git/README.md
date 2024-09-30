<div align="center">
    <h1>Clase de GIT UTN-FRSR</h1>
</div>

<div align="center">
    <img src="GitBashLogo.jpg" alt="Logo Git Bash" width="300" height="auto" style="margin: 30px auto;">
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

# Confirmar los cambios de manera interactiva
git commit -v

# Confirmar los cambios con firma de GPG
git commit -S -m "Mensaje del commit"

# Ver el estado de los archivos en el repositorio
git status

# Ver el historial de commits
git log

# Ver el historial de commits con gráficos
git log --graph --oneline --all

# Crear una nueva rama
git branch <nombre_de_la_rama>

# Crear una nueva rama con seguimiento remoto
git branch --track <nombre_de_la_rama> <origen/remoto>

# Cambiar a una rama específica
git checkout <nombre_de_la_rama>

# Crear una nueva rama y cambiar a ella en un solo comando
git checkout -b <nombre_de_la_rama>

# Cambiar a la rama anterior
git checkout -

# Cambiar a la rama anterior sin perder cambios
git switch -

# Fusionar una rama específica en la rama actual
git merge <nombre_de_la_rama>

# Fusionar una rama sin generar un commit de fusión
git merge --no-commit <nombre_de_la_rama>

# Descargar los cambios del repositorio remoto al repositorio local
git pull

# Subir cambios locales al repositorio remoto
git push

# Subir una rama local al repositorio remoto
git push origin <nombre_de_la_rama>

# Subir todas las ramas locales al repositorio remoto
git push --all

# Subir tags al repositorio remoto
git push --tags

# Ver la diferencia entre el archivo local y el estado en el repositorio
git diff <nombre_del_archivo>

# Mostrar la diferencia en archivos ignorados
git diff --staged

# Deshacer los cambios en un archivo y restaurarlo al último commit
git checkout -- <nombre_del_archivo>

# Eliminar un archivo del directorio de trabajo y del índice de git
git rm <nombre_del_archivo>

# Eliminar un archivo solo del índice de git (manteniendo el archivo en el directorio de trabajo)
git rm --cached <nombre_del_archivo>

# Restablecer el estado del índice a la última confirmación
git reset HEAD <nombre_del_archivo>

# Deshacer los cambios en el directorio de trabajo
git checkout -- <nombre_del_archivo>

# Restablecer un archivo a un commit específico
git checkout <commit_id> -- <nombre_del_archivo>

# Ver una lista detallada de los cambios realizados en un archivo
git log -p <nombre_del_archivo>

# Cambiar de rama conservando los cambios sin confirmar en el directorio de trabajo
git stash save "Mensaje del stash"

# Aplicar un stash y mantenerlo en la lista
git stash apply

# Aplicar un stash y eliminarlo de la lista
git stash pop

# Eliminar un stash específico
git stash drop <stash_id>

# Limpiar todos los stash
git stash clear

# Mostrar estadísticas sobre los archivos modificados y confirmaciones en el repositorio
git log --stat

# Mostrar la diferencia entre dos ramas
git diff <branch_name1>..<branch_name2>

# Eliminar una rama en git
git branch -d <nombre_de_la_rama>

# Si necesitas eliminar la rama de todas formas, incluso si no está completamente fusionada,
# puedes usar -D:
git branch -D <nombre_de_la_rama>

# Eliminar una rama remota
git push origin --delete <nombre_de_la_rama>

# Aplicar un parche desde un archivo o una URL
git apply <patch_file>

# Mostrar un resumen de las confirmaciones realizadas por cada colaborador
git shortlog

# Esto agregará un nuevo control remoto con el nombre especificado en lugar de "origin".
git remote add nombre_deseado URL_del_repositorio_remoto

# Actualizar la URL del control remoto existente llamado "origin" con la nueva URL especificada.
git remote set-url origin nueva_URL

# Mostrar los controles remotos configurados
git remote -v

# Renombrar un control remoto
git remote rename <nombre_actual> <nuevo_nombre>

# Eliminar un control remoto
git remote remove <nombre>

# Cambiar el commit inicial
git commit --amend

# Este comando realiza dos acciones en una sola línea:
# -a: Agrega todos los archivos modificados y eliminados al área de preparación (staging area).
# -m "Mensaje del commit": Agrega un mensaje al commit para describir los cambios realizados.
git commit -am "Mensaje del commit"

# Este comando permite agregar o arreglar el mensaje de un commit
git commit --amend -m "Nuevo mensaje del commit"

# Este comando permite deshacer tu último commit
# y el parámetro --soft mantiene los cambios en local
git reset --soft HEAD~1

# Este comando permite deshacer tu último commit
# y el parámetro --hard para borrarlos del todo
git reset --hard HEAD~1

# Si has hecho un push al repositorio tiene arreglo
# hacemos un git log --oneline para buscar el id del commit
git revert "identificador del commit" ej: b3be3e0369

# Cambiar la descripción de un commit que ya fue publicado
git commit --amend --no-edit

# Este comando eliminará los archivos no rastreados
# que están pendientes de commit
git clean -f

# Este comando eliminará los directorios y archivos no rastreados
# que están pendientes de commit
git clean -fd

# Mostrar la configuración actual de git
git config --list

# Configurar el nombre de usuario global para Git
git config --global user.name "Tu Nombre"

# Configurar el correo electrónico global para Git
git config --global user.email "tu_email@example.com"

# Ver la configuración específica de un repositorio
git config --local --list

# Crear un alias para un comando de Git
git config --global alias.st status

# Verificar conectividad con el repositorio remoto
git ls-remote

# Mostrar los archivos rastreados en la rama actual
git ls-tree -r HEAD --name-only

# Mostrar el autor y la fecha de la última modificación de un archivo
git blame <nombre_del_archivo>

# Mostrar los archivos modificados en un commit específico
git show <commit_id> --name-only

# Buscar texto dentro del historial de commits
git log -S "texto_a_buscar"

# Buscar commits que contienen un mensaje específico
git log --grep "Mensaje a buscar"

# Crear un tag
git tag <nombre_del_tag>

# Crear un tag con mensaje
git tag -a <nombre_del_tag> -m "Mensaje del tag"

# Eliminar un tag local
git tag -d <nombre_del_tag>

# Enviar un tag al repositorio remoto
git push origin <nombre_del_tag>

# Eliminar un tag remoto
git push --delete origin <nombre_del_tag>

```
