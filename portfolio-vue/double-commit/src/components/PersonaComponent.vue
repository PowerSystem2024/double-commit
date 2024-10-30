<script lang="js">
export class Persona {
  static idPersona = 0

  constructor(nombre, apellido, edad, telefono, correo) {
    this._idPersona = ++Persona.idPersona
    this._nombre = nombre
    this._apellido = apellido
    this._edad = edad
    this._telefono = telefono
    this._correo = correo
  }

  get idPersona() {
    return this._idPersona
  }

  get nombre() {
    return this._nombre
  }

  set nombre(nombre) {
    this._nombre = nombre
  }

  get apellido() {
    return this._apellido
  }

  set apellido(apellido) {
    this._apellido = apellido
  }

  get edad() {
    return this._edad
  }

  set edad(edad) {
    this._edad = edad
  }

  get telefono() {
    return this._telefono
  }

  set telefono(telefono) {
    this._telefono = telefono
  }

  get correo() {
    return this._correo
  }

  set correo(correo) {
    this._correo = correo
  }

  toString() {
    return `Persona: { Nombre: ${this._nombre}, Apellido: ${this._apellido}, Edad: ${this._edad}, Telefono: ${this._telefono}, Correo: ${this._correo} }`
  }
}

export class Caracteristicas extends Persona {
  static idCaracteristica = 0

  constructor(nombre, apellido, edad, correo, altura, raza, nacionalidad) {
    super(nombre, apellido, edad, correo)
    this._idCarcteristica = ++Caracteristicas.idCaracteristica
    this._altura = altura
    this._raza = raza
    this._nacionalidad = nacionalidad
  }

  get idCaracteristica() {
    return this._idCarcteristica
  }

  get altura() {
    return this._apellido
  }

  get raza() {
    return this._raza
  }

  get nacionalidad() {
    return this._nacionalidad
  }

  toString() {
    return `
    ${super.toString()},
    Características: { Altura: ${this._altura}, Raza: ${this._raza}, Nacionalidad: ${this._nacionalidad} }`
  }
}
</script>
