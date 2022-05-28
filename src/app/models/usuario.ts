export class UsuarioModel{

    constructor(
        public id: number,
        public primerNombre: string,
        public segundoNombre: string,
        public primerApellido: string,
        public segundoApellido: string,
        public telefono: number,
        public direccion: string,
        public ciudadResidencia: string,
        public numeroDocumento: number,
        public tipoDocumento: string
    ){}

}