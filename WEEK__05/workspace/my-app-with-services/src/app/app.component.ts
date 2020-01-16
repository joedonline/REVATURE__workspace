import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'my-app-with-services';

  logOutput(output : string) : void {
    console.log(output);
  }

  messages : string[] = ['message 1', 'message b', 'message iii', 'msg IV'];
}
