<script lang="js">
export const apiKey = import.meta.env.VITE_WEATHER_API_KEY
export const DBKEY = import.meta.env.VITE_SUPABASE_PUBLIC_ANNONKEY
export const DBURL = import.meta.env.VITE_SUPABASE_URL

export const navItems = [
  {
    name: 'Acerca',
    path: '#about'
  },
  {
    name: 'Proyectos',
    path: '#projects'
  },
  {
    name: 'Contacto',
    path: '#contact'
  }
]

export const members = [
  {
    name: 'Franco Morales',
    avatar: 'https://avatars.githubusercontent.com/u/134340520?v=4',
    link: 'https://github.com/Mendoxeneixe'
  },
  {
    name: 'Gabriel Calcagni',
    avatar: 'https://avatars.githubusercontent.com/u/93176365?v=4',
    link: 'https://github.com/solidsnk86/'
  },
  {
    name: 'Guardini Philama',
    avatar: 'https://avatars.githubusercontent.com/u/25463245?v=4',
    link: 'https://github.com/Philama'
  },
  {
    name: 'Mauro Gonzales',
    avatar: 'https://avatars.githubusercontent.com/u/86989774?v=4',
    link: 'https://github.com/megon1'
  },
  {
    name: 'Cecilia Olejarczyk',
    avatar: 'https://avatars.githubusercontent.com/u/104603137?v=4',
    link: 'https://github.com/CeciliaOlejar'
  }
]

export const projectsItems = [
  {
    name: 'Proyecto Python',
    img: 'https://i0.wp.com/junilearning.com/wp-content/uploads/2020/06/python-programming-language.webp?fit=800%2C800&ssl=1',
    link: 'https://elproyecto.qui',
    code: 'https://github.com/double-commit',
    description: 'Este es nuestro proyecto de Python creado para la UTN-FRSR.'
  },
  {
    name: 'Proyecto JavaScript',
    img: 'https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/1200px-Unofficial_JavaScript_logo_2.svg.png',
    link: 'https://elproyecto.qui',
    code: 'https://github.com/double-commit',
    description: 'Por aquí puedes ver el proyecto de JavaScript para la Facultad.'
  },
  {
    name: 'Proyecto Java',
    img: 'data:image/png;base64,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',
    link: 'https://elproyecto.qui',
    code: 'https://github.com/double-commit',
    description: 'Este es nuestro proyecto creado en Java para la Universidad.'
  }
]

export const resize = () => {
  const textarea = document.getElementById('textarea')
  textarea.addEventListener('input', () => {
    textarea.style.height = 'auto'
    textarea.style.height = textarea.scrollHeight + 'px'
  })
  return textarea
}
</script>
