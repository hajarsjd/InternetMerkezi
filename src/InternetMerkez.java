//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//    public class InternetMerkez {
//        Scanner sc = new Scanner(System.in);
//        String personName;
//        int personBalance;
//        int a;
//        HashMap<String,Integer> personInfo = new HashMap<>();
//        ArrayList<String> accountList = new ArrayList<>();
//
//        public void newAccount(){
//            System.out.println("Enter person name: ");
//            personName = sc.next();
//            System.out.println("Enter person balance: ");
//            personBalance = sc.nextInt();
//            personInfo.put(personName,personBalance);
//            accountList.add(personName);
//            System.out.println(personInfo);
//        }
//
//        public void increase(){
//            System.out.println("Balansini artirmaq istediyiniz sexs:");
//            personName = sc.next();
//            System.out.println("Balans ne qeder artacaq?");
//            a= sc.nextInt();
//            if(accountList.contains(personName)){
//                personBalance +=a;
//                personInfo.put(personName,personBalance);
//            }else{
//                System.out.println("Sexs movcud deyil!");
//            }
//            System.out.println(personInfo);
//        }
//
//        public void decrease(){
//            System.out.println("Balansini azaltmaq istediyiniz sexs:");
//            personName = sc.next();
//            System.out.println("Balans ne qeder azalacaq?");
//            a= sc.nextInt();
//            if(accountList.contains(personName) && personBalance > a){
//                personBalance-=a;
//                personInfo.put(personName,personBalance);
//            }else{
//                System.out.println("Balans daxil edilen balans miqdarindan asagidir!");
//            }
//            System.out.println(personInfo);
//        }
//
//
//
//
//    }
//
//
