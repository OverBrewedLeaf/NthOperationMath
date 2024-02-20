NthOperationMath
Sorry for the format, I promise to fix this eventually.

So I was a math tutor at some point and I got lazy generating questions for students. As a computer science major, I created a program to randomly generate questions for me (definition of give a lazy person a hard task to let them find an easier method or something of that nature). There were many evolutions of the program adding features things and eventually this became more of a CS project.
I originally created this in Java and had a test subject accomplish this in C++. This also became an android application at some point, but it wasn’t my best work…
Before you start, I created this for people to learn and practice coding (relatively) long projects. Keep in mind that this is your project. Customize it as you want and implement anything you think that could be better. The instructions revolve around the usability of teaching math and not as a coding project. Implement everything as you see fit, especially when mentioned.
Skills that should/could be used:
  •	Terminal Input/Output
  •	File Reading/Writing
  •	Objects and Classes
    o	Polymorphism?
  •	Basic User Accounts
    o	Passwords
  •	Data Analysis
  •	Databases
  •	Graphical Interface¬ 
Primary Task
  I)	Create a terminal interface to prompt the “teacher” in choosing addition, and multiplication. Make space for subtraction, and division, however they will be implemented differently. Write your code with scalability in mind as you can add other operations such as modulation and exponential. (FYI: Switch Case is more efficient than many IF statements)
  II)	Determine Difficulty: Teaching different students necessitates a change in difficulty of the random numbers used in equation creation. Implement as you see fit. One method was choosing the max number the first and second variable. Another was choosing a max the answer should be. Subtraction and division should have their first variable always be larger than the second(Unless that’s a difficulty you want to add, having fractions and negative numbers).
  III)	Generating numbers: After a “teacher” chooses an operation and difficulty, implement a random number generator. Have the student answer the question and let the student know if they got the right answer or not. I like to repeat the question if it’s wrong. Implement as you see fit. Try to use objects and classes here for each question generated. Maybe some child classes for each operation just for fun.
    i.	For division, I created two variables then multiplied to get the divisor. One of the variables became the dividend and the other is the quotient. Implement as you see fit (remember not to divide by 0).
  IV)	End of Operation: Determine an end (unless you want the student to solve math till the end of time). You can try/catch a non-numerical input or prompt for a quantity in the beginning or have a dedicated ending input. 
Optionals : )
So now that the primary task is completed here are some optional features that could be implemented in no particular order.
  •	Subtraction Difficulties
    o	I categorized subtraction into 3 parts defined as easy, normal and hard. This is more for teaching subtraction as random numbers won’t create tailored questions on its own. Some students were new to subtraction, some needed help when a carryover was required.
      	Easy: does not require a carryover
        •	999-111
        •	88-46
        •	7-2
        •	42-11
      	Hard: Requires a carryover
        •	63-49
        •	30-14
        •	84-66
      	Normal will not affect the random numbers created and should have an even distribution of easy and hard questions.
      	Negatives can be implemented too.
  •	Division
    o	Teaching INT division is not practical unless that is your target. Create a way to accept remainders or implement fractions.
  •	Read/Write 
    o	Save questions and answers into local storage.
      	OR implement it into a database.
    o	Analyze data: (Examples below, implement more as you see fit)
      	How many questions were answered
      	How many questions were wrong
      	Per session or since the first file.
        •	Or both!
      	KPI to measure improvement?
•	Create User Accounts (sorry, I lied about order, please implement reading/writing before accounts)
  o	Have students make accounts to allow access to their work.
  o	Make sure accounts of the same name are not recreated.
  o	Password locked is a fun security challenge.
•	Graphical User Interface
  o	Not all students will react well to just text on a terminal although the idea was novel (Mine were receptive… or at least that’s what I told myself so I didn’t have to make one)
•	Remember, this will never be an exhaustive list. Feel free to add improvements and finally, Implement as you see fit : )


