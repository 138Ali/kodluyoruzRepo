public class ögrenci_bilgi_sistemi {
    public static void main(String[] args) {
       

            course mat = new course ("Matematik", "MAT101", "MAT");
            course fizik = new course("Fizik", "FZK101", "FZK");
            course kimya = new course("Kimya", "KMY101", "KMY");
    
            teacher t1 = new teacher("Mahmut Hoca", "mahmut_krz123", "MAT");
            teacher t2 = new teacher("Fatma Ayşe", "ftm_1717@1", "FZK");
            teacher t3 = new teacher("Ali Veli", "ali4587qqkrk", "KMY");
           
            mat.add_teacher(t1);
            fizik.add_teacher(t2);
            kimya.add_teacher(t3);
    
            student s1 = new student("cem yılmaz", 4, "1401015", mat, fizik, kimya);
            s1.add_exam_note(50,20,20,20,40,20);
            s1.isPass();
    
            student s2 = new student("polat ", 4, "22133", mat, fizik, kimya);
            s2.add_exam_note(100,20,50,20,40,20);
            s2.isPass();
    
            student s3 = new student("merzifonlu ahmet", 4, "121312", mat, fizik, kimya);
            s3.add_exam_note(50,20,20,20,40,20);
            s3.isPass();
    
        }
    }

