public class student {
    String name,stu_no;
    int classes;
    course mat;
    course fizik;
    course kimya;
    double avarage;
    boolean isPass;
    public student(String name,  String stu_no,int classes, course mat, course fizik, course kimya)
             {
        this.name = name;
        this.stu_no = stu_no;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
     calc_avarage();
        this.isPass = false;
    }
    
    
    public void add_exam_note(int mat ,int mat_sözlü,int kimya,int kimya_sözlü,int fizik,int fizik_sözlü ){
         if(mat <=0&& mat <=100) &&( mat_sözlü <=0 &&mat_sözlü<=100){
          this.mat.note=mat;
          this.mat.performance_note=mat_sözlü;
          this.mat.final_note=(this.mat.performance_note *0.20) + (this.mat.note*0.80);
         }
         if(kimya <=0&& kimya <=100) &&( kimya_sözlü <=0 &&kimya_sözlü<=100){
          this.kimya.note=kimya;
          this.kimya.performance_note=kimya_sözlü;
          this.kimya.final_note=(this.kimya.performance_note *0.20) + (this.kimya.note*0.80);
         }
         if(fizik <=0&& fizik <=100) &&( fizik_sözlü <=0 && fizik_sözlü<=100){
          this.fizik.note=fizik;
          this.mat.performance_note=fizik_sözlü;
          this.fizik.final_note=(this.fizik.performance_note *0.20) + (this.fizik.note*0.80);
         }
        
    }
    public void isPass(){
        if(this.mat.final_note ==0 || this.fizik.final_note ==0||this.kimya.final_note==0){
                    
System.out.println("notlar girilmemiştir");

        }
        else{
            this.isPass =isPass;
            printNote();
            
            System.out.println("Ortalama : " + this.avarage);
           
        } if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
            
    }
    public void calc_avarage(){
        this.avarage = (this.fizik.final_note + this.kimya.final_note + this.mat.final_note) / 3;
    }
    public boolean isCheckPass() {
        calc_avarage();
        return this.avarage > 50;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.final_note);
        System.out.println("Fizik Notu : " + this.fizik.final_note);
        System.out.println("Kimya Notu : " + this.kimya.final_note);
    }
}
