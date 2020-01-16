package chapter4;

import java.util.Scanner;

/**
 * 计算输入的整形数字中每位数字之和
 * @author sunguangyu
 *
 */
public class CalcSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数字，我来计算各位之和");
		//得到要计算的整形数字
		int num = input.nextInt();	//进行拆分计算的整形数字
		int tempNun = num;
		//声明相关变量
		int i = 0;		//循环变量
		int sum = 0;	//累加和
		//循环操作计算累加和
		while(tempNun > 0){
			sum += tempNun % 10;
			tempNun /= 10;
		}
		//打印计算结果
		System.out.println("各位数字之和为: " + sum);
	}

}
