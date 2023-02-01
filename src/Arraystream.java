import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class Arraystream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ArrayList<String> name = new ArrayList<String>();
				name.add("Ajay");
				name.add("Aravv");
				name.add("John");
				name.add("Aari");
				name.add("Ajith");
				/*
				 * int count=0; for(int i=0;i<name.size();i++) {
				 * 
				 * String actual=name.get(i); if(actual.startsWith("A")) { count++; } }
				 * System.out.println(count);
				 */
				//convert arraylist to stream
				long Total = name.stream().filter(s -> s.startsWith("A")).count();
				System.out.println(Total);
				//create stream with alues
				long total2 = Stream.of("Ajay", "Abi", "Vinay").filter(s -> s.startsWith("A")).count();
				System.out.println(total2);
				//Another way of coding stream
				long total3 = Stream.of("Ajay", "Anjali", "Vinay", "Ajith").filter(s -> {
					s.startsWith("A");
					return true;
				}).count();
				System.out.println(total3);
				//Print names with min length
				//name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
				name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
				streamMap();
			}
				public static void streamMap()
				{
					//print values with ends with a and coert to upper case
					Stream.of("Ajay", "Abi", "Vinay").filter(s->s.endsWith("y")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
					//print values in sorted way
					//conert array to array list and print in sorted way
					List<String> names=Arrays.asList("Ajay", "Abi", "Vinay");
					names.stream().filter(s->s.startsWith("A")).sorted().forEach(s->System.out.println(s));
					List<String> names1=Arrays.asList("Jo", "Janu", "John");
					//concat of two strems
					Stream<String> concatname = Stream.concat(names.stream(),names1.stream());
					//concatname.forEach(s->System.out.println(s));
					boolean flag=concatname.anyMatch(s->s.equalsIgnoreCase("Jo"));
					System.out.print(flag);
					Assert.assertTrue(flag);
				}
				
			

		}

