package spring.aop.core;

import java.io.IOException;

public class BusinessServiceImpl implements BusinessService{

	@Override
	public String businessMethodReturn() {
	System.out.println("핵심로직.businessMethodReturn()실행");
		return "리턴값-문자열";
	}

	@Override
	public void businessMethodThrow() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("핵심로직 BusinessMethodThrow() 실행중 예외발생");
		throw new IOException("IOException 발생");
	}

	@Override
	public void businessMethodBefore1() {
		// TODO Auto-generated method stub
		System.out.println("핵심로직.methodBefore1()");
	}

	@Override
	public void businessMethodBefore2(String name) {
		// TODO Auto-generated method stub
		System.out.println("핵심로직.methodBefore2()" +name+"을 받았습니다.");
		
		
	}
	
	

}
