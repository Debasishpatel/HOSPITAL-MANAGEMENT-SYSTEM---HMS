import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { DoctorListComponent } from './doctor-list/doctor-list.component';
import { HomePageComponent } from './home-page/home-page.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { BookAppointmentComponent } from './book-appointment/book-appointment.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import { FormsModule } from '@angular/forms';
import {MatSelectModule} from '@angular/material/select';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { Ng2OrderModule } from 'ng2-order-pipe';
import {NgxPaginationModule} from 'ngx-pagination';
import { GetPrescriptionComponent } from './patient-list/get-prescription/get-prescription.component';
import { LoginserviceComponent } from './loginservice/loginservice.component';

@NgModule({
  declarations: [
    AppComponent,
    DoctorListComponent,
    HomePageComponent,
    PatientListComponent,
    BookAppointmentComponent,
    GetPrescriptionComponent,
    LoginserviceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    MatFormFieldModule,
    MatSelectModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    Ng2OrderModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
