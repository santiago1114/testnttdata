import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UsuariosService } from 'src/app/services/usuarios.service';

@Component({
  selector: 'app-buscar',
  templateUrl: './buscar.component.html',
  styles: []
})
export class BuscarComponent implements OnInit {
  constructor(private usuarioService: UsuariosService,
    private router: Router) {}

  ngOnInit(): void {}

  onSubmit(form: NgForm) {
    this.usuarioService
      .getUsuario(form)
      .subscribe({ next: (res) => {
        this.usuarioService.usuario.next(res)
        this.router.navigate(['/usuario-detalles'])

      },
      error: ()=> alert("No se encuentra el usuario") });
  }
}
