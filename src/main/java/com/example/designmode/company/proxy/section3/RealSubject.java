package com.example.designmode.company.proxy.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class RealSubject implements Subject {
	
	//实现方法
	public void request() {
		System.out.println("处理业务");
		//业务逻辑处理
	}

}
