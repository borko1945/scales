import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Article } from './domain/article';
import { HttpClient, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ArticleService {

  constructor(private http:HttpClient) { }

  getAll(pageNumber = 0, pageSize = 3): Observable<Article[]> {
      return this.http.get<Article[]>('/articles', {
        params: new HttpParams()
            .set('pageNumber', pageNumber.toString())
            .set('pageSize', pageSize.toString())
    });
  }
}
