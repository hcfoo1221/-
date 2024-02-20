class Account{
    //初始本金10000
    public static void main(String[] args) {
        int balance = 10000;//初始金额
        boolean isFlag = true;//用于结束系统
        //把全部信息整合说明
        String info = "";
        while(isFlag){//多次循环使系统不会执行一次就退出

            System.out.println("-------------记账系统-------------");
            System.out.println(" ");
            System.out.println("             1.收支明细   ");
            System.out.println("             2.登记收入   ");
            System.out.println("             3.登记支出   ");
            System.out.println("             4.退出系统   ");
            System.out.printf("            请选择(1~4): ");
            
            //获得用户的选择
            char selection = Utensil.RdMenuSelection();//调用隔壁的类

            //switch 来输出面向用户所输入的结果
            switch (selection) {
                case '1':
                    
                    System.out.println("-------------当前收支明细记录--------------");
                    System.out.println("收支\t账户金额\t收支金额\t说明\n");
                    System.out.println(info);
                    System.out.println("------------------------------------------");
                    break;

                case '2':

                    System.out.printf("本次收入金额：");
                    int income = Utensil.readNumber();

                    if(income>0){
                        balance+=income;
                    }
                    System.out.printf("本次收入说明：");
                    String earnDes = Utensil.readString();
                    info += "收入\t"+ balance +"\t\t" + income +"\t\t"+ earnDes + "\n"; 
                    System.out.println("-------------登记完成--------------");
                    break;
                
                case '3':

                    System.out.printf("本次支出金额：");
                    int expense = Utensil.readNumber();

                    if(expense>0 && balance >= expense){
                        balance -= expense;
                    }
                    System.out.printf("本次支出说明：");
                    String spendDes = Utensil.readString();
                    info += "收入\t"+ balance +"\t\t" + expense +"\t\t"+ spendDes + "\n"; 
                    System.out.println("-------------登记完成--------------");
                    break;
                    
                case '4':

                    System.out.println("确认是否退出(Y/N):");
                    char isExit = Utensil.ExitComfirmation();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }
                    break;

            }
        }
    }    
}
