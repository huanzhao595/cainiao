/**
 * Java 创建枚举类型要使用 enum 关键字，隐含了所创建的类型都是 java.lang.Enum 类的子类
对enum进行遍历和switch的操作示例代码：
 */
package cainiao.javaMethod;

public class MainClass11 {

	public static void main(String[] args) {
		
		Car1 c;
		c = Car1.tata;
		switch(c) {
		case lamborghini:
			System.out.println("你选择了lamborghini！");
			break;
		case tata:
			System.out.println("你选择了tata！");
			break;
		case audi:
			System.out.println("你选择了audi！");
			break;
		case fiat:
			System.out.println("你选择了fiat！");
			break;
		case honda:
			System.out.println("你选择了honda！");
			break;
		default:
			System.out.println("我不知道你的车型");
			break;
		}
	}
}
enum Car1{
	lamborghini,tata,audi,fiat,honda
}