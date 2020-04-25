import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  public API = '//localhost:8080';
  public CATEGORY_API = this.API + '/categories';
  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get(this.API+'/all-categories');
  }

  get(id: string) {
    return this.http.get(this.CATEGORY_API + '/' + id);
  }

  save(category: any): Observable<any> {
    let result: Observable<Object>;
    if (category['href']) {
      result = this.http.put(category.href, category);
    } else {
      result = this.http.post(this.CATEGORY_API, category);
    }
    return result;
  }

  remove(href: string) {
    return this.http.delete(href);
  }
}
