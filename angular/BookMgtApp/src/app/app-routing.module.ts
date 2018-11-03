import { RouterModule, Routes } from '@angular/router';
import { ListBookComponent } from './list-book/list-book.component';
import { AddBookComponent } from './add-book/add-book.component';

const routes: Routes = [

  {path : '', component : AddBookComponent}
];

export const routing = RouterModule.forRoot(routes);
