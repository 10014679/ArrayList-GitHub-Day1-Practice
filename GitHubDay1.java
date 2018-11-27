import java.util.ArrayList;
public class GitHubDay1{
	public static void main(String[]args){

	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	ArrayList<Integer> totallist = new ArrayList<>();
	for(int i = 0; i < 10; i++){
			list1.add(i);
			list2.add(i);
	}

	for(int i = 0; i < 10; i++){
		totallist.add(list1.get(i));
		totallist.add(list2.get(i));
	}

	printArrayList(totallist);
	}

	public static void printArrayList(ArrayList<Integer> x){
	//Note: method can be called toString
		for(int i = 0; i < x.size()-1; i++)
			System.out.print(x.get(i) + ", ");
		System.out.println(x.get(x.size()-1));
	}

}