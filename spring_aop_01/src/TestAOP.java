import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.core.BusinessService;

//오송이 수정 
public class TestAOP {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/aop/config/aop.xml");

		BusinessService service =(BusinessService)context.getBean("businessService");
		
		service.businessMethodBefore1();
		
		
		System.out.println("****************");
		service.businessMethodBefore2("홍기롱");
	System.out.println("------------------");
		String ret =service.businessMethodReturn();
		System.out.println("--main(): 호출결과 :"+ ret);
		
		System.out.println("---------------------");
		try{
			service.businessMethodThrow();
			
		}catch(Exception e){
		}
		
	}
}
