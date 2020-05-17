/*
 * Platform:- HackerRank
 * Problem:- https://www.hackerrank.com/challenges/grading/problem
 * Date:- 05/17/2020
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Date_051720_HackerRank_GradingStudents 
{
	public static List<Integer> gradingStudents(List<Integer> grades) 
	{
		int len = grades.size();
        List<Integer> finalGrades = new ArrayList<>();
        int grade;
        for(int i=0; i<len; i++)
        {
            grade = grades.get(i);
            if(grade<38)
            {
                finalGrades.add(i, grade);
                continue;
            }
            if(grade%5 == 0 || grade%5 == 1 || grade%5 == 2)
                finalGrades.add(i, grade);
            else
                finalGrades.add(i, grade+(5-(grade%5)));
        }
        return finalGrades;
	}
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Date_051720_HackerRank_GradingStudents.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}

}
