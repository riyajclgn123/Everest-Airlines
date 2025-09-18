import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Navbar } from './components/navbar/navbar'; 
import { Footer } from './components/footer/footer';
import { provideHttpClient, withFetch } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true, // <-- must be standalone
  imports: [RouterOutlet, Navbar, Footer], 
  templateUrl: './app.html',
  styleUrls: ['./app.css']  // <-- fix typo: styleUrls, not styleUrl
})

export class App {
  protected readonly title = signal('Everest_Airlines');
}
