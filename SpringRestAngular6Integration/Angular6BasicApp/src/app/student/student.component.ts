import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  studentList;
  constructor(private studentService : StudentService) { }

  ngOnInit() {

    this.studentList = this.studentService.getStudentList().subscribe((data:  Array<object>) => {
      this.studentList  =  data;
      console.log(data);
  });;
    console.log(this.studentList);
  }

  


}
