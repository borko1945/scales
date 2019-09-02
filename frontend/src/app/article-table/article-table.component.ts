import { Component, OnInit } from '@angular/core';
import { Article } from '../domain/article';
import { ArticleService } from '../article.service';

@Component({
  selector: 'app-article-table',
  templateUrl: './article-table.component.html',
  styleUrls: ['./article-table.component.css']
})
export class ArticleTableComponent implements OnInit {
  dataSource: Article[] = [{id:1,name:"Beer", weight:500, created: new Date()},
  {id:2,name:"Banana", weight:0, created: new Date()}]
  displayedColumns: string[] = ['id', 'name', 'weight', 'created'];

  constructor(private service: ArticleService) { }

  ngOnInit() {
    this.service.getAll().subscribe((result:Page<Article>) => {
      this.dataSource=result.content;
    });
  }

}
