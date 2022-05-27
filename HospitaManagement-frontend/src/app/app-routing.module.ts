import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookAppointmentComponent } from './book-appointment/book-appointment.component';
import { DoctorListComponent } from './doctor-list/doctor-list.component';
import { HomePageComponent } from './home-page/home-page.component';
import { LoginserviceComponent } from './loginservice/loginservice.component';
import { GetPrescriptionComponent } from './patient-list/get-prescription/get-prescription.component';
import { PatientListComponent } from './patient-list/patient-list.component';

const routes: Routes = [
  {path:'', redirectTo:'login', pathMatch:'full'},
  {path:'login', component:LoginserviceComponent},
  {path:'home', component:HomePageComponent},
  {path:'book-appointment', component:BookAppointmentComponent},
  {path:'doctors-info', component:DoctorListComponent},
  {path:'patients-info', component:PatientListComponent},
  {path:'get-prescription', component:GetPrescriptionComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
