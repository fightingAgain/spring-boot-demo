package com.example.designmode.company.visitor.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Element {
	/*#com.example.designmode.company.visitor.section3.IVisitor lnkIVisitor*/
//定义业务逻辑
	public abstract void doSomething();
	
	//允许谁来访问
	public abstract void accept(IVisitor visitor);
}
