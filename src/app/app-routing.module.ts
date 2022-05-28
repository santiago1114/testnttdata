import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BuscarComponent } from './pages/buscar/buscar.component';
import { DetallesUsuarioComponent } from './pages/detalles-usuario/detalles-usuario.component';

const routes: Routes = [
  { path: '', component: BuscarComponent },
  { path: 'usuario-detalles', component: DetallesUsuarioComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
