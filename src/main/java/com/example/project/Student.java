package com.example.project;

public class Student {
    // instance variables for 
    // first name (String)
    // last name (String)
    // graduation year (int)
    // sum of test scores (double).. should initialize at 0.0
    // test score count (int) ..should initialize at 0
    // highest test score (double).. should initialize at 0.0
 
    private String firstName;
    private String lastName;
    private int gradYear;
    private double sumOfScores = 0.0;
    private int testScoreCount = 0;
    private double highestScore = 0.0;
    private double averageTestScore = 0.0;
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        //implement code here!
    }
 
    // returns firstName
    public String getFirstName() {
        //implement code here!
        return firstName;
    }
 
    // returns lastName
    public String getLastName() {
        //implement code here!
        return lastName;
    }
 
    public double getHighestTestScore() {
        //implement code here!
        return highestScore;
    }

    public int getTestScoreCount(){
        //implement code here!
        return testScoreCount;
    }

    public int getGradYear(){
        //implement code here!
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        //implement code here!
        gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        //implement code here!
        sumOfScores += newTestScore;
        testScoreCount ++;
        if (newTestScore > highestScore){
            highestScore = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        //implement code here!
        if (sumOfScores / testScoreCount >= 65) {
            return true;
        } else {
            return false;
        }
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        //implement code here!
        return sumOfScores / testScoreCount;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + firstName + lastName );
        System.out.println("Graduation Year: "+ gradYear);
        System.out.println("Number of tests: "+ testScoreCount);
        System.out.println("Average Test Score: "+ averageTestScore);
        System.out.println("Highest Test Score: " + highestScore);
        System.out.println("Is passing: " + (isPassing()? "yes" : "no"));
    }
 }
 