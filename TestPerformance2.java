import java.util.*;
class TestPerformance2
{
	public static void main(String args[])
	{
		List list1=new ArrayList();
		List list2=new LinkedList();
		addList(list1);
		addList(list2);
		System.out.println("Display List For Array");
		dispList(list1);
		System.out.println("Display List For Linked list");
		dispList(list2);
		
		
		
	}
	
	public static void addList(List list)
	{
		int i;
		for(i=0;i<10000;i++)
		{
			list.add("Madhu"+(i+1));
		}
	}

	public static void dispList(List list)
	{
		int i;
	
		long startTime= new Date().getTime();
		for(i=0;i<10000;i++)
		{
			
			System.out.println(list.get(i));
		}
		
		long endTime=new Date().getTime();
		System.out.println("Start Time = "+startTime);
		System.out.println("End Time = "+endTime);
		
		System.out.println("Time Taken ="+(endTime-startTime)/1000);
		
	}
}s