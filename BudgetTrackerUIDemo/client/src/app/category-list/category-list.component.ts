import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../shared/category/category.service';
import { GiphyService } from '../shared/giphy/giphy.service';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent implements OnInit {
  categories: Array<any>;

  constructor(private categoryService: CategoryService, private giphyService: GiphyService) { }

  ngOnInit() {
    this.categoryService.getAll().subscribe(data => {
      this.categories = data;
      for (const category of this.categories) {
        this.giphyService.get(category.name).subscribe(url => category.giphyUrl = url);
      }
    });
  }

}
