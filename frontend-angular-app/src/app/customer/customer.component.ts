import {Component, OnInit, ViewChild} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {MatTableDataSource} from "@angular/material/table";
import {MatPaginator} from "@angular/material/paginator";
import {MatSort} from "@angular/material/sort";

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent implements OnInit {

  public customers : any;
  public dataSource : any;
  public displayColumns : string[] = ['id', 'firstName', 'lastName', 'email', 'phone', 'address'];

  @ViewChild(MatPaginator) paginator! : MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  constructor(private httpClient: HttpClient) {

  }
  ngOnInit() {
    this.httpClient.get("http://localhost:9090/CUSTOMER-SERVICE/list-customers").subscribe(
      {
        next: data => {

          this.customers = data;
          this.dataSource = new MatTableDataSource(this.customers);
          this.dataSource.paginator = this.paginator;
          this.dataSource.sort = this.sort;

        }, error : err => {
          console.log(err);
        }
      }
    )
  }
}
