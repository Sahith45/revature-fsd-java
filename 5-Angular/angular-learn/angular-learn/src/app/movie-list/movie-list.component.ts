import { Component, OnInit } from '@angular/core';
import { movies } from '../data';
import { Movie } from '../movie/model/movie';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent implements OnInit {

  movies : Movie[] = movies;

  constructor() { }

  ngOnInit(): void {
  }

}
