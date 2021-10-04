package book;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook p1 = new ProgrammingBook("bk1","nhà giả kim",12,"alex","java","a");
        ProgrammingBook p2 = new  ProgrammingBook("bk2","câu bé chăn cừu",25,"prilo","hàn","b");
        ProgrammingBook p3 = new ProgrammingBook("bk3","phía kia ngọn đồi",99,"đức lập","nhật bản","c");
        ProgrammingBook p4 = new ProgrammingBook("bk4","chân trời mới",30,"kumamoto","java","d");
        ProgrammingBook p5 = new ProgrammingBook("bk5","hướng gió đông",23,"shapia","mỹ","e");

        FictionBook f1 = new FictionBook("Fc1","hoa cỏ xanh",10,"xuân anh","A");
        FictionBook f2 = new FictionBook("Fc2","chuồn chuồn ",15,"thái vũ","B");
        FictionBook f3 = new FictionBook("Fc3","ngáo vãi",45,"trường sơn","C");
        FictionBook f4 = new FictionBook("Fc4","lêu lêu",30,"quốc an","D");
        FictionBook f5 = new FictionBook("Fc5","các kiểu con đà điểu",20,"quân","E");


        Book [] arr = {p1,p2,p3,p4,p5,f1,f2,f3,f4,f5};     //ép kiểu thằng con lên thằng cha : upcasting "hay bị nhầm vãi lồi"

        int sum=checkSum(arr);
        int total =checkTotal(arr,"java");
        System.out.println("tổng số tiền là:"+sum);
        System.out.println("số sách ngôn ngữ java là:"+total);
    }
    public static int checkSum(Book [] arr){
        int sum=0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].getPrice();
        }
        return sum;
    }
    public static int checkTotal(Book [] arr,String name){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]instanceof ProgrammingBook){                      //Kiểm tra xem thằng củ lềnh này có phải là nằm trong kiểu Programingbook hay không???
                if (((ProgrammingBook)arr[i]).getLanguage()=="java"){   //ép kiểu thằng cha xuống thằng con để thằng cha lấy được phương thức getLanguage của thằng con downcasting
                    count++;
                }
            }
        }
        return count;
    }
}
