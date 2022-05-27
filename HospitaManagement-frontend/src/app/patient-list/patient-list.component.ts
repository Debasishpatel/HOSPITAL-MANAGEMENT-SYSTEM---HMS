import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';

@Component({
  selector: 'app-patient-list',
  templateUrl: './patient-list.component.html',
  styleUrls: ['./patient-list.component.css']
})
export class PatientListComponent implements OnInit {


  patients: Patient[];
  id: number;
  patientsid: number;
  patient: Patient = new Patient();
  buttonclicked = false;



  searchText: string;
  constructor(private patientService: PatientService,
    private router: Router) { }

  ngOnInit(): void {
    this.getPatients();
  }

  private getPatients(){
    this.patientService.getPatientsList().subscribe(data => {
      this.patients = data;
    })
  }
  
  getPrescription(){
    this.router.navigate(['get-prescription']);
  }

  showPatient(){
    this.patientService.getPatientById(this.patientsid).subscribe(data =>{
      console.log(data);
    },
    error => console.log(error));
    
    
  }


  search(id: number){
    this.buttonclicked = true;
    console.log(this.patient);
    console.log(this.buttonclicked);
    this.showPatient();
  }


}
