import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UsuarioModel } from 'src/app/models/usuario';
import { UsuariosService } from 'src/app/services/usuarios.service';

@Component({
  selector: 'app-detalles-usuario',
  templateUrl: './detalles-usuario.component.html',
  styles: []
})
export class DetallesUsuarioComponent implements OnInit {

  usuario: UsuarioModel | undefined

  constructor(private usuarioService: UsuariosService,
    private router: Router) { 

    this.usuario = this.usuarioService.usuario.getValue()
    console.log(this.usuario);
    
  }

  ngOnInit(): void {
    console.log(this.usuarioService.usuario.getValue())
  }

  onSubmit(){
    this.router.navigate(["/"])
  }
  

}
