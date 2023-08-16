import java.text.DecimalFormat;

public class employee {
    String first_name , last_name;
    double  salary;
    int work_hours;
    int hire_year;
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getWork_hours() {
        return work_hours;
    }
    public void setWork_hours(int work_hours) {
        this.work_hours = work_hours;
    }
    public int getHire_year() {
        return hire_year;
    }
    public void setHire_year(int hire_year) {
        this.hire_year = hire_year;
    }
    public employee(String first_name, String last_name, int salary, int work_hours, int hire_year) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
        this.work_hours = work_hours;
        this.hire_year = hire_year;
    }
  public double calculate_salary(){
         
         double work_years =2023 - hire_year;
       
         if(work_years < 10){
             
           return  salary * 0.05;
        

         } else if(work_years <20){
          return  salary *0.10;
         }else{
            return salary *0.15;
         }    
  }
  public double bonus() {
    if (work_hours > 40) {
        return (work_hours - 40) * 30;
    } else {
        return 0;
    }
}
  public double tax() {
    if (salary < 1000) {
        return 0;
    } else {
        return salary * 0.03;
    }
   
}
  public String toString(){
    return  "Employee{" +
                "name='" + first_name + '\'' +
                ", salary=" +  new DecimalFormat("##.##").format(salary) +
                ", workHours=" + work_hours +
                ", hireYear=" + hire_year +
                '}';

  }

 


}