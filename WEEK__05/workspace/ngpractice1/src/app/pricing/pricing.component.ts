import { Component, OnInit, Input } from '@angular/core';

import { HttpServiceService } from '../http-service.service';
import { People } from '../people';

@Component({
  selector: 'app-pricing',
  templateUrl: './pricing.component.html',
  styleUrls: ['./pricing.component.scss']
})
export class PricingComponent implements OnInit {

  people: People = { results: "" };

  @Input()
  results: {};

  constructor(private httpService : HttpServiceService) { }

  ngOnInit() {
    this.populatePeople();
  }

  async populatePeople() : Promise<any> {
    const data = await this.httpService.promiseGetAllComics();
    this.results = data.results;
    // return this.results;
  }

}
