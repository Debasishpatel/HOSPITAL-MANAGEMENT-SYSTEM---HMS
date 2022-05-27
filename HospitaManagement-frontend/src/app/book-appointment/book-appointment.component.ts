import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Doctor } from '../doctor';
import { DoctorService } from '../doctor.service';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';

@Component({
  selector: 'app-book-appointment',
  templateUrl: './book-appointment.component.html',
  styleUrls: ['./book-appointment.component.css']
})
export class BookAppointmentComponent implements OnInit {
 


  doctors: Doctor[];
  id: number;
  putDoctorId: number;
  doctor: Doctor = new Doctor();
  patient: Patient = new Patient();
  constructor(private doctorService: DoctorService,
    private patientService: PatientService,
    private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.getDoctors();
    this.id = this.route.snapshot.params['id'];

  }

  private getDoctors(){
    this.doctorService.getDoctorsList().subscribe(data => {
      this.doctors = data;
    })
  }

  savePatient(){
    this.patientService.bookAppointment(this.patient).subscribe(data =>{
      console.log(data); 
    },
    error => console.log(error));
    
  }
 
  onSubmit(){
   console.log(this.patient);  
   this.savePatient();
  }

  showDoctor(){
    this.doctorService.getDoctorById(this.putDoctorId).subscribe(data =>{
      console.log(data);
    },
    error => console.log(error));
    
  }

  viewProfile(id: number){
    console.log(this.doctor);
    this.showDoctor();
  }

}
