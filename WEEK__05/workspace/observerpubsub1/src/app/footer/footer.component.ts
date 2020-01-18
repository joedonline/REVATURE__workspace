import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styles: [`
    .myfooter {
      margin-bottom: 0;
      color: white;
      background: rgba(0,0,16, .88);
    }
    `]
})
export class FooterComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
