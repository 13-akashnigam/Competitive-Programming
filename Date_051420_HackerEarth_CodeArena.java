/*
In the race for the best Internet browser, there's now a new contender for it, this browser is called the: "The Semantic Mind-Reader!" After its promo on the world wide web, everyone's been desperately waiting for the browser to be released. And why shouldn't they be curious about it, after all, it's the new project of our very own genius "Little Jhool!" He's worked very hard for this browser, and to add new mind reading features to it.

Apart from the various security powers it possesses, it's called the mind-reader for a reason. Here's why:

You don't need to type 'www.' to open a website anymore.
Though, you still need to type '.com' to open a website.
The browser predicts ALL THE VOWELS in the name of the website. (Not '.com', though. Again!)
Obviously, this means you can type the name of a website faster and save some time.
Now to convince users that his browser will indeed save A LOT of time for users to open a particular website, Little Jhool has asked you to prepare a report on the same.

Input format:
The first line contains tc, the number of test cases.
The second line contains the name of websites, as a string.

Output format:
You have to print the ratio of characters you would have typed in Jhool's browser, to your normal browser.

Constraints:
1 <= tc <= 100
1 <= Length of the website <= 200

NOTE: You do NOT need to print the output in its lowest format. You should print in its original fraction format.
The names of all the websites will be in small case only.

Every string will start from *www. and end with *.com, so well!**

SAMPLE INPUT 
2
www.google.com
www.hackerearth.com
SAMPLE OUTPUT 
7/14
11/19
Explanation
Consider the first case:

In Jhool's browser, you'll only have to type: ggl.com (7 characters) while in a normal browser, you'll have to type www.google.com, which is 14 characters.

Time Limit: 1.0 sec(s) for each input file.
Memory Limit: 256 MB
Source Limit: 1024 KB
Marking Scheme: Marks are awarded if any testcase passes.
Allowed Languages: Bash, C, C++, C++14, C++17, Clojure, C#, D, Erlang, F#, Go, Groovy, Haskell, Java, Java 8, JavaScript(Rhino), JavaScript(Node.js), Julia, Kotlin, Lisp, Lisp (SBCL), Lua, Objective-C, OCaml, Octave, Pascal, Perl, PHP, Python, Python 3, R(RScript), Racket, Ruby, Rust, Scala, Swift, Swift-4.1, TypeScript, Visual Basic

Reference:- https://www.hackerearth.com/codearena/
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass 
{
	public static void main(String args[] ) throws Exception 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		for(int i=0; i<tc; i++)
		{
			String website = in.readLine();
			String websites[] = website.split("\\.");
			System.out.println(getFraction(websites[1]));
		}
	}

	public static String getFraction(String website)
	{
		int countOfVowels = 0;
		int len = website.length();
		for(int i=0; i<len; i++)
		{
			char ch = website.charAt(i);
			if(isVowel(ch))
				countOfVowels++;
		}
		return ""+(len-countOfVowels+4)+"/"+(len+4+4);
	}

	public static boolean isVowel(char ch)
	{
		if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'i' || ch == 'I' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')
			return true;
		else
			return false;
	}
}
