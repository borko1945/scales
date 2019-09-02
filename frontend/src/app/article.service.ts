import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Article } from './domain/article';
import { HttpClient, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ArticleService {

  constructor(private http:HttpClient) { }

  getAll(page = 0, size = 3): Observable<Page<Article>> {
      return this.http.get<Page<Article>>('http://localhost:8080/articles', {
        params: new HttpParams()
            .set('page', page.toString())
            .set('size', size.toString())
    });
  }
}
