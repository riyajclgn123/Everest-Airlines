import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { provideRouter } from '@angular/router';
import { provideHttpClient, withFetch } from '@angular/common/http';
import { routes } from './app/app.routes';

bootstrapApplication(App, 
  {
  providers: [
    provideRouter(routes),
    provideHttpClient(withFetch()) 
  ]
});