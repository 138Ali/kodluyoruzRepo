public class course {
     
    teacher  course_teacher;
    String name ;
    int note;
    String code;
    String prefix;
    int final_note;
    int performance_note;
   
    
    public course( String name, String code, String prefix ) {
        this.course_teacher = course_teacher;
        this.name = name;
        this.note = 0;
        this.code = code;
        this.prefix = prefix;
        this.final_note = 0;
        this.performance_note = 0;
    }
    public void add_teacher(teacher t){
       if(this.prefix.equals(t.branch)){
         this.course_teacher =t;
         System.out.println("işlem başarılı");
       }
       else{
        System.out.println(t.name+" akademisyen dersi veremez ");
       }
    }
    public void control_teacher(){

        if(course_teacher!= null){
            System.out.println(this.name +"dersinin akademisyenini :"+course_teacher.name);
        }
        else{
            System.out.println(this.name +" dersinin akademisyeni atanmamıştır");
        }
    }




}
