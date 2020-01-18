import { Component, OnInit } from '@angular/core';

import { ComicService } from '../comic.service';

@Component({
  selector: 'app-comic-deck',
  templateUrl: './comic-deck.component.html',
  styles: []
})
export class ComicDeckComponent implements OnInit {

  private comicService : ComicService;

  comics : Comic = [
    {
      id: 99,
      pageCount: 100,
      price: 40.00,
      rating: 9,
      title: "Mock Comic 1 On FrontEnd"
    },
    {
      id: 100,
      pageCount: 101,
      price: 39.99,
      rating: 9,
      title: "Mock Comic 2 On FrontEnd"
    },
    {
      id: 100,
      pageCount: 101,
      price: 39.99,
      rating: 9,
      title: "Mock Comic 3 On FrontEnd"
    },
    {
      id: 100,
      pageCount: 101,
      price: 39.99,
      rating: 9,
      title: "Mock Comic 4 On FrontEnd"
    },
    {
      id: 100,
      pageCount: 101,
      price: 39.99,
      rating: 9,
      title: "Mock Comic 5 On FrontEnd"
    },
    {
      id: 100,
      pageCount: 101,
      price: 39.99,
      rating: 9,
      title: "Mock Comic 6 On FrontEnd"
    },
    {
      id: 100,
      pageCount: 101,
      price: 39.99,
      rating: 9,
      title: "Mock Comic 7 On FrontEnd"
    },
    {
      id: 100,
      pageCount: 101,
      price: 39.99,
      rating: 9,
      title: "Mock Comic 8 On FrontEnd"
    },
    {
      id: 100,
      pageCount: 101,
      price: 39.99,
      rating: 9,
      title: "Mock Comic 9 On FrontEnd"
    },
    {
      id: 100,
      pageCount: 101,
      price: 39.99,
      rating: 9,
      title: "Mock Comic 10 On FrontEnd"
    },
  ];

  constructor(comicService : ComicService) { }

  ngOnInit() {
    // this.comicService.getAllComics().subscribe( data => {
    //   this.comics = data;
    // });
    this.populateComics();
  }

  async populateComics() {
    this.comics = await this.comicService.promiseGetAllComics();
  };

}
