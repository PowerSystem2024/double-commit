class Empleado extends Persona {
  static contadorEmpleado = 0;

  constructor(nombre, apellido, edad, sueldo) {
    super(nombre, apellido, edad);
    this._contadorEmpleado = ++Empleado.contadorPersonas;
    this._sueldo = sueldo;
  }

  get idEmpleado() {
    return this._contadorEmpleado;
  }

  get sueldo() {
    return this._sueldo;
  }

  set sueldo(sueldo) {
    this._sueldo = sueldo;
  }

  toString() {
    return `
    ${super.toString()}
    ${this._idEmpleado}
    ${this._sueldo}
    `;
  }
}
