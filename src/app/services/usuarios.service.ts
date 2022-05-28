import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BehaviorSubject } from 'rxjs';
import { UsuarioModel } from '../models/usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  usuario = new BehaviorSubject<any>(null)

  constructor(private http: HttpClient) { }

  getUsuario(form: NgForm){
    return this.http.get<UsuarioModel>(`http://localhost:8090/api/usuarios/get?tipoDocumento=${form.value.tipoDocumento}&numeroDocumento=${form.value.numeroDocumento}`)
  }

}
