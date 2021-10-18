import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { movies } from '../data';
import { Movie } from './model/movie';


@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {
 
 @Input()
  movie!: Movie;


  @Output() favoriteSelected: EventEmitter<boolean> = new EventEmitter();
  constructor() { }

  ngOnInit(): void {
  }

  toggleFavorite() : void {
    this.movie.favorite = !this.movie.favorite;
    this.favoriteSelected.emit(this.movie.favorite);
  }

 

}
