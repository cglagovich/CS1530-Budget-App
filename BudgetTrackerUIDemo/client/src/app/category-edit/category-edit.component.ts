import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { ActivatedRoute, Router } from '@angular/router';
import { CategoryService } from '../shared/category/category.service';
import { GiphyService } from '../shared/giphy/giphy.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-category-edit',
  templateUrl: './category-edit.component.html',
  styleUrls: ['./category-edit.component.css']
})
export class CategoryEditComponent implements OnInit, OnDestroy {
  category: any = {};

  sub: Subscription;

  constructor(private route: ActivatedRoute,
              private router: Router,
              private categoryService: CategoryService,
              private giphyService: GiphyService) {
  }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      const id = params['id'];
      if (id) {
        this.categoryService.get(id).subscribe((category: any) => {
          if (category) {
            this.category = category;
            this.category.href = category._links.self.href;
            this.giphyService.get(category.name).subscribe(url => category.giphyUrl = url);
          } else {
            console.log(`category with id '${id}' not found, returning to list`);
            this.gotoList();
          }
        });
      }
    });
  }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

  gotoList() {
    this.router.navigate(['/category-list']);
  }

  save(form: NgForm) {
    this.categoryService.save(form).subscribe(result => {
      this.gotoList();
    }, error => console.error(error));
  }

  remove(href) {
    this.categoryService.remove(href).subscribe(result => {
      this.gotoList();
    }, error => console.error(error));
  }
}
