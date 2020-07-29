package linearSearchMethod;

import java.util.LinkedList;

/**
 * 判断类是否相等
 * Create By Administrator
 * time:2020/7/29
 **/
public class LinearSearchByStudent {
    private LinearSearchByStudent(){}

     static LinkedList<Student> student = new LinkedList<Student>();

    public static void main(String[] args) {
        Student stu1 = Student.getInstance("张三","15");
        Student stu2 = Student.getInstance("李四","16");
        Student stu3 = Student.getInstance("王五","17");
        student.add(stu1);
        student.add(stu2);
        student.add(stu3);

        int result =  LinearSearchByStudent.search(student,stu1);
        System.out.println(result);
    }

    public static <E> int search(LinkedList<E> data ,E target){
        for(int i=0 ; i<data.size() ; i++){
            if(data.get(i).equals(target))
                return 1;
        }
        return -1;
    }

}
/**
  *@Author:Administrator on2020/7/29 14:17
  *@Description:Student类(单例模式,懒汉式)
  */
class Student{
    private volatile static Student instance = null;

    private Student(String name,String age){
        this.name = name;
        this.age = age;
    }

    public static Student getInstance(String name, String age){
        if (instance == null) {
            instance = new Student(name, age);
        }
        return instance;
    }

    private String name;
    private String age;

//重写equals方法
    public boolean equals(Student student){
        if(this.name.equals(student.name) && this.age.equals(student.age))
            return true;
        else
            return false;
    }
}
