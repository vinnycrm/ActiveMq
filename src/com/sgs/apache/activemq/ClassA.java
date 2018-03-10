package com.sgs.apache.activemq;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClassA
{
	public void test()
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map1 = new ConcurrentHashMap<Integer, String>();
	}
	ClassA()
	{
		
	}
	ClassA(int a)
	{
		
	}
}

class ClassB
{
	
}
