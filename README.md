# The_300_Data_Migration_Project

## Table of content

- [Model][1]
- [Controller][2]
- [Logger][3]

[1]: (https://github.com/JamesKempadoo/The_300_Data_Migration_Project/tree/dev/src/main/java/com/sparta/the300/model) "Model"
[2]: (https://github.com/JamesKempadoo/The_300_Data_Migration_Project/tree/dev/src/main/java/com/sparta/the300/controller) "Controller"
[3]: (https://github.com/JamesKempadoo/The_300_Data_Migration_Project/tree/dev/src/main/java/com/sparta/the300/loggers) "Loggers"


### Application purpose
The project allows the user to firstly read the data from a CSV file by implementing the CSV reader
and the read data file method.Using the split method by "," the separation of the fields is done. 
The data is handled using the IF statement to create three different lists that contain the correct
data, corrupted data and duplicate data. 

### Usage

### Installation

- Download Zip file from git directory.
- Open project within IDE.
- Change your login properties (username,password) from the resources directory.
- Run the application from the Main Class.
- Create an "employeesdb"  database to migrate the data from the CSV file you are using.

### Fields of Data

| EmployeeID | Name prefix | FirstName | MiddleName | LastName | Gender | E-mail | Date of Birth | Date of Joinning | Salary |
|:----------:|:-----------:|:---------:|:----------:|:--------:|:--------:|:------:|:-------------:|:----------------:|:------:|



### Time Efficiency
This section purpose is to compare the time efficiency of the application using different
number of threads. The thread usage is important as the second part of the project has
to do with the data transfer of a large file.

| Number of threads | Time (s) |
|:-----------------:|:--------:|
|         1         |          |
|         2         |          |
|         4         |          |
|         8         |          |
|        16         |          |
|        20         |          |

