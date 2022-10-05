package Project1;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class projectfirst {

public static void accendingorder()
{
		File dir = new File("C:\\users\\abhishek\\simplilearnprojectfiles");
		if(dir.isDirectory())
		{
		//  fetching the file from list the directory
		File[] files = dir.listFiles();

		System.out.println("All the files including folders");
		System.out.println("--------------------------------");



			// sort files by name
			Arrays.sort(files, new Comparator<Object>()
			{
				@Override
				public int compare(Object f1, Object f2) {
					return ((File) f1).getName().compareTo(((File) f2).getName());
				}
			});

			//  print the file name in accending order.
			for(File file:files)
			{
				System.out.println(file.getName());
			}
			System.out.println("\nAfter sorting by name");
			System.out.println("|||----------------------------------|||");

			// This is through Sort files by size.
			Arrays.sort(files, new Comparator<Object>()
			{
				@Override
				public int compare(Object f1, Object f2)
				{
					if (((File) f1).length() < ((File) f2).length())
					{
						return -1;
					}
					else if (((File) f1).length() > ((File) f2).length())
					{
						return 1;
					}
					else
					{
						return 0;
					}
				}
			});

			// Prints files in order by file size
			for(File file:files)
			{
				System.out.println(file.getName());
			}
			System.out.println("\nAfter sorting by length");
			System.out.println("<<<------------------------------->>>");


			for(File file:files)
			{
				System.out.println(file.getName());
			}
			System.out.println("-------------------------");
			System.out.println("-------------------------");
		}

	}

public static void add() throws IOException
	{
		System.out.println("enter file name to add");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String p= sc.nextLine();

		File obj=new File("C:\\users\\abhishek\\simplilearnprojectfiles\\"+p);
		if(obj.createNewFile()) {
			System.out.println("new file created");
		}
		else {
			System.out.println("file already exists");
		}

	}

	public static void delete()
	{

		System.out.println("enter file name to delete");
		Scanner dd = new Scanner(System.in);
		String pp= dd.nextLine();


		File ff= new File("C:\\users\\abhishek\\simplilearnprojectfiles\\"+pp);

		if(ff.delete()) {

			System.out.println("file is deleted");
		}
		else {
			System.out.println("file is deleted or file not found");
		}
	}


	public static void search()
	{
		System.out.println("enter file name to search");
		Scanner ss = new Scanner(System.in);
		String sss = null ;
		sss= ss.nextLine();

		File fff= new File("C:\\users\\abhishek\\simplilearnprojectfiles\\"+sss);

		if(fff.exists()) {
			System.out.println("file exists");

		}
		else {
			System.out.println("file not found");
		}

	}




	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		System.out.println("<><><><><><><><> WELCOME TO LockedMe.com <><><><><><><><>");
		System.out.println("Application Name: Virtual Key Repository\n");
		System.out.println("########## Developer Details ####################################");
		System.out.println("Name: Abhishek Dattatray Sawant");
		System.out.println("Designation: Java Developer");
		System.out.println("Date: 05/10/2022");
		System.out.println("#################################################################");	
		System.out.println();
		System.out.println("Press Enter to Start the Application..");
		Scanner sc = new Scanner(System.in);
		String Enter = sc.nextLine();
		System.out.println("--------------------------------------------------------------------");


		while(true) {
			System.out.println("Enter 1 : To get files in Ascending Order");
			System.out.println("Enter 2 : To Perform Business Level Operations");
			System.out.println("Enter 3 : To go back or exit");
			System.out.println(" Enter Your Choice");

			@SuppressWarnings("resource")
			Scanner cc= new Scanner(System.in);
			int option= cc.nextInt();

			if(option==1) {
				accendingorder();
			}
			else if(option==2) {
				System.out.println("\n>>>>>Select Any one to perform business level operations");
				System.out.println("\nEnter 1 : Add file");
				System.out.println("Enter 2:  Delete file");
				System.out.println("Enter 3:  Search file");
				System.out.println("Enter 4:  Go back");

				System.out.println("Enter your choice : ");

				int input= cc.nextInt();

				switch(input) {
				case 1:{ add();break;}
				case 2:{delete();break;}
				case 3:{search();break;}
				case 4 :{System.out.println("back option is execeuted"); break;}
				}
			}

			else if(option==3) {
				System.out.println("*******Thank you for using this Application*******");	
				System.out.println("____________________Exit____________________");
				System.exit(option); 
			}

			else {
				System.out.println("enter valid option");

			}
		}

	}
}


