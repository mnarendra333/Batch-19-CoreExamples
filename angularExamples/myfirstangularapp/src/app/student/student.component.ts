import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent {


  message = "welcome to angular framework..!"

 

  studentsList = [

        {
            "stuId" : 101,
            "stuName" : 'surya',
            'addr' : 'bangl'

        },
        {
          "stuId" : 102,
          "stuName" : 'naveen',
          'addr' : 'bangl'

        },
        {
          "stuId" : 102,
          "stuName" : 'ravi',
          'addr' : 'bangl'
        }
  ]

}
