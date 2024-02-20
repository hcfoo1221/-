import java.util.Scanner;

public class Utensil{
    private static Scanner input = new Scanner(System.in,"gbk");
    
    public static char RdMenuSelection() {//处理目录面板数字的类
        char c;
        for(;;){
            String choice = readKeyBoard(1);//调用判断字数和input的类
            c = choice.charAt(0);//取得字串的首字符
            if(c !='1' && c !='2'&& c !='3'&& c !='4'){//判断式
                System.out.println("数值输入错误,请重新输入！ :");
            }else
                break;
        }return c;
    }

    public static char ExitComfirmation() {//单独处理选项四是否退出的类
        char c;
        for(;;){
            String choice = readKeyBoard(1).toUpperCase();//调用判断字数的类
            c = choice.charAt(0);//取得字串的首字符
            if(c !='Y' && c !='N'){//判断式
                System.out.println("选择错误,请重新输入！ :");
            }else
                break;
        }return c;
    }
    public static String readKeyBoard(int count){//判断字数的类
        String line = "";//宣告变数来装新的输入

        while(input.hasNextLine()){//判断是否有输入进来
            line = input.nextLine();//input获取来自前端的数值并返回给rdmenu
            if(line.length() == 0 ){
                continue;
            }

            if(line.length() > count ){
                System.out.println("输入长度不能大于"+count+",请重新输入数字：");
                continue;
            }
            break;
        }return line;
        
    }
    public static int readNumber(){//处理选择2的金额的的类

        int n;
        for(;;){//用字串收录在强转成整数
            String str = readKeyBoard(4);//只能收录4个字符
            try {
                n = Integer.parseInt(str);//把字串转换成整数
                break;
            } catch (NumberFormatException e) {//如果报错则返回
                System.out.println("数值输入错误,请重新输入！ :");
            }
        }return n;

    }
    public static String readString() {
        String str = readKeyBoard(8);
        return str; 
    }
}
