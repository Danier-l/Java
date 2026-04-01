import java.util.Scanner;


public class yujv {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("输入月份");
        int month=sc.nextInt();
//        switch(month){
//            case 1:
//                System.out.println("是冬天");
//                break;
//            case 2:
//                System.out.println("是冬天");
//                break;
//            case 3:
//                System.out.println("是春天");
//                break;
//            case 4:
//                System.out.println("是春天");
//                break;
//            case 5:
//                System.out.println("是春天");
//                break;
//            case 6:
//                System.out.println("是夏天");
//                break;
//            case 7:
//                System.out.println("是夏天");
//                break;
//            case 8:
//                System.out.println("是夏天");
//                break;
//            case 9:
//                System.out.println("是秋天");
//                break;
//            case 10:
//                System.out.println("是秋天");
//                break;
//            case 11:
//                System.out.println("是秋天");
//                break;
//            case 12:
//                System.out.println("是冬天");
//                break;
//            default:
//                System.out.println("请输入1~12");
//                break;

        //case穿透
//        switch(month){
//            case 11:
//            case 12:
//            case 1:
//                System.out.println(month+"月是冬天");
//                break;
//            case 2:
//            case 3:
//            case 4:
//                System.out.println(month+"月是春天");
//                break;
//            case 5:
//            case 6:
//            case 7:
//                System.out.println(month+"月是夏天");
//                break;
//            case 8:
//            case 9:
//            case 10:
//                System.out.println(month+"月是秋天");
//                break;
//            default:
//                System.out.println("请输入1~12");
//                break;
//

        //箭头标签
//        switch(month){
//
//            case 1 -> System.out.println("是冬天");
//
//            case 2 -> System.out.println("是冬天");
//
//            case 3 -> System.out.println("是春天");
//
//            case 4 -> System.out.println("是春天");
//
//            case 5 -> System.out.println("是春天");
//
//            case 6 -> System.out.println("是夏天");
//
//            case 7 -> System.out.println("是夏天");
//
//            case 8 -> System.out.println("是夏天");
//
//            case 9 -> System.out.println("是秋天");
//
//            case 10 -> System.out.println("是秋天");
//
//            case 11 -> System.out.println("是秋天");
//
//            case 12 -> System.out.println("是冬天");
//
//            default -> System.out.println("请输入1~12");
//
//        }


        switch(month){

            case 12,1,2 -> System.out.println("是冬天");


            case 3,4,5 -> System.out.println("是春天");


            case 6 ,7,8-> System.out.println("是夏天");


            case 9,10,11-> System.out.println("是秋天");


            default -> System.out.println("请输入1~12");

        }






    }
}
