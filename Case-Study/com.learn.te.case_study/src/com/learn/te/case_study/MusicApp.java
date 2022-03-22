package com.learn.te.case_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class SleepThread extends Thread {
	// run method for thread
	public void run() {

		String arr[] = { "1.Senorita....", "2.Convicted....", "3.Blank Space...." };
		//List<String> list=new ArrayList<String> (Arrays.asList(arr));
		for (int i = 0; i < arr.length; i++) {
			try {
				// call sleep method of thread
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			// print current thread instance with loop variable
			// System.out.println(Thread.currentThread().getName() + " : " + i+arr[i]);
			// System.out.println(Thread.currentThread().getName() + " : " +arr[i]);
			// System.out.println(Thread.currentThread() + " : " + i+arr[i]);
			// System.out.println(getName() + " : " + i+arr[i]);
			System.out.println("\n Playing: " + arr[i]);
			// System.out.println(Arrays.toString(arr)+"\n");

		}
		System.out.println("\n :) Thanks for listening");
	}
}

public class MusicApp {

	public static void main(String[] args) {

		int song_id;
		// String song_title;
		// String Artist_name;
		// String Album_locatio;
		// String Song_location;
		// String Description;

		String arr[] = { "1.Senorita...", "2.Convicted...", "3.Blank Space..." };
		
		List<String> list=new ArrayList<String> (Arrays.asList(arr));

		String st1 = "Thank you";

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose the below options");
		System.out.println("i.Press 1 to play song");
		System.out.println("ii.Press 2 to search a song");
		System.out.println("iii.Press 3 to show all songs");
		//System.out.println("iv.Press 4 to “Operate on Songs Database");
		System.out.println("iv.Press 4 to Add/Edit/Delete");
		

		int option = 0;

		option = sc.nextInt();

		if (option == 1) {

			System.out.println("Press A to “Play all songs\n" + "Press B to “Play Songs Randomly\n"
					+ "Press C to Play a Particular Song");

			// System.out.println("wellcome...wellcome ....wellcome");

			String ch = sc.next();

			// ch=sc.next();

			switch (ch) {
			case "A":
				System.out.println("Playing all songs");
				SleepThread t1 = new SleepThread();
				t1.start();
				break;

			case "B":
				// Random r=new Random();
				// int r_no=r.nextInt(arr.length);
				// System.out.println("Playing random songs"+arr[r_no]);
				//
				int rand = ThreadLocalRandom.current().nextInt(arr.length);
				String randEle = arr[rand];
				System.out.println("Playing random songs" + randEle);
				break;

			case "C":
				System.out.println("Please provide the song title to play the particular song");
				// int flag=0;
				String find = sc.next();

				for (int i = 0; i < arr.length; i++) {
					// if(find.equals(arr))
					// if(arr[i].equalsIgnoreCase(find)) {
					boolean res = (arr[i].equalsIgnoreCase(find)) ? true : false;

					if (res) {

						System.out.println("Your song has been requested " + arr[i]);
					}

					else {

						System.out.println("Sorry the song is not present in the playlist");

					}
					break;
				}

				// System.out.println("Playing particular song" +":"+arr[1]);
			}

		}

		// else
		// {
		// System.out.println("Please choose the option");
		// }

		if (option == 2) {
			System.out.println("Enter the you want to search");

			String search = sc.next();

			for (int i = 0; i < arr.length; i++) {

				boolean look = (arr[i].equalsIgnoreCase(search)) ? true : false;

				if (look) {
					System.out.println("Yes the is present in the playlist" + arr[i]);
				}

				else {
					System.out.println("No the song you are searching for is not present in the list");
				}
				break;
			}

			if (option == 3)

			{
				// System.out.println(Arrays.toString(arr));
				// System.out.println("");

				Arrays.stream(arr).forEach(System.out::println);
			}

		}
		
		if(option==4) {
			System.out.println(" Press A: TO add songs \n Press B: To Edit the song playlist \n Press C: To Delete the song");
		
			String press=sc.next();
			
			
			
			
			switch (press) {
			
			case "A":
			int nosongs=2;
			
			System.out.println("Enter the new song which you want to add to playlist");
			
			String addsong=sc.next();
			
			arr[nosongs++]=addsong;
			
			System.out.println("The new song has been added to your playlist"+Arrays.toString(arr));
			
			break;
			
			case "C":
			int nodsong=2;
			System.out.println("Enter the song which you want to delete");
				
				String delsong=sc.next();
				 
				//arr[nodsong--]=delsong;
			
				//for (int i=0;i<arr.length;i++) {
					
					list.remove(delsong);
				//}
				
				
				
			System.out.println("The new song has been deleted from your playlist"+Arrays.toString(arr));
				
			    break;
		
			
			
			
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
