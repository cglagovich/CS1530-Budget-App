import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CategoryListComponent } from './category-list/category-list.component';
import { CategoryEditComponent } from './category-edit/category-edit.component';

const routes: Routes = [
  { path: '', redirectTo: '/category-list', pathMatch: 'full' },
  {
    path: 'category-list',
    component: CategoryListComponent
  },
  {
    path: 'category-add',
    component: CategoryEditComponent
  },
  {
    path: 'category-edit/:id',
    component: CategoryEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
