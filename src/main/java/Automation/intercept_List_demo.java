package Automation;
import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class intercept_List_demo implements IMethodInterceptor{

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		
		List<IMethodInstance> result=new ArrayList<IMethodInstance>();
		for(IMethodInstance m:methods)
		{
			Test tm=m.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
			if(tm.priority()==1) {
							tm.invocationCount();
							result.add(m);
						}
					}
		return result;

		}
	
		
		
	}


