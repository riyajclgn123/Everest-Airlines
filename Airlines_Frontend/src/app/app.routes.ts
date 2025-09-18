import { Routes } from '@angular/router';
import {App} from './app';
import { Home } from './pages/home/home';
import { Booking } from './pages/booking/booking';
import { Contact } from './pages/contact/contact';  
import { About } from './pages/about/about';


export const routes: Routes = [
    { path: '', component: Home },
    { path: 'booking', component: Booking },
    { path: 'contact', component: Contact },  // <-- add this line
     { path: 'about', component: About }, 
];
