package bt5;
import java.util.Scanner;
public class class1 {
    private String name;
    private String birthday;
    private String address;
    private String className;
    private int avgMark;

    public class1(){
        Scanner sc = new Scanner(System.in);

    }

    public class1(String name, String birthday, String address, String className, int avgMark) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.className = className;
        this.avgMark = avgMark;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getClassName() {
        return className;
    }

    public int getAvgMark() {
        return avgMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAvgMark(int avgMark) {
        this.avgMark = avgMark;
    }

    public void danhGia(){
        if(avgMark<4 && avgMark>= 0){
            System.out.println("Hoc sinh yeu");
        }
        if(avgMark<6 && avgMark>= 4){
            System.out.println("Hoc sinh trung binh");
        }
        if(avgMark<8 && avgMark>= 6){
            System.out.println("Hoc sinh kha");
        }
        if(avgMark<=9 && avgMark>= 8){
            System.out.println("Hoc sinh gioi");
        }
        if(avgMark<=10 && avgMark>= 9){
            System.out.println("Hoc sinh xuat sac");
        }else{
            System.out.println("Hoc sinh co trinh do ko the danh gia");
        }
    }
    public void stdInfor(){
        System.out.println(name+birthday+address+className+avgMark);
    }
}
