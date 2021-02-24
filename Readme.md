## Geek Goddess 2020
### Open Round question: Transcribed from Picture

A state is divided into R'C cities. The government has launched an initiative to find the cities which are dominated by coders. Each city may or may not have coders residing in it. If the city is dominated by coders, it is marked with 1 else it is marked with 0. Two cities are termed as connected cities if they both are dominated by coders and can be reached by moving vertically, horizontally, or diagonally. Example: The given is the state with 3*3 cities and their dominance representation, 1 2 3 1 1 1 1 2 0 0 1 3 0 0
Example: The given is the state with 3*3 cities and their dominance representation. 1 2 3 1 1 1 0 0 1 N 3 1 0 0 City[1.1) is directly connected to City[1,2]. City(1.2) is directly connected to City[1,1]. City(1, 3) and City(2, 3). City[1.3] is directly connected to City[1, 2] and City[2, 3]. City[2, 3] is directly connected to City[1, 2] and City(1,3). City[3.1) is not connected to any of the other coder dominant cities.
One or more coder dominant connected cities form the Coding belt. In a belt, there may be coder dominant cities which are not directly connected but can be reached by moving through other dominant cities. It is possible that there are multiple coding belts in the state. 
Example: The given is the state with 3*3 cities and their dominance representation 1 2 3 1 1 1 1 2 0 0 3 1 0 0 For the given example, there are two coding belts C1 represents Coding Belt 1 and C2 represents Coding Belt 2.
For the given example, there are two coding belts. C1 represents Coding Belt 1 and C2 represents Coding Belt 2. 1 2 3 1 C1 C1 C1 2. 0 0 C1 3 C2 0 0 The government wants to find the number of coder dominant cities in the largest coding belt The government will give you the credits in the initiative. Can you help the government? Note: For the given example, there are 4 coder dominant cities in the largest coding belt. Input Format
Note: For the given example, there are 4 coder dominant cities in the largest coding belt. Input Format The first line of input consists of two space-separated integers, number of rows, R. and number of columns, C. Next R lines each consist of space-separated integers. Constraints 1<= R. C <=10 Output Format Print the number of coder dominant cities in the largest Coding belt. Sample Test Case 1 Input 55 11100 01100 00001 10011 Output Format Print the number of coder dominant cities in the largest Coding belt. Sample Test Case 1
Input 55 11100 01100 00001 10011 11001 
Output 5
There are three belts in the given 5*5 cities. 1 2 3 4 5 1 C1 C1 C1 0 0 2 0 C1 C1 0 0 3 0 0 0 0 C2 C3 0 0 C2 C2 C3 un C3 0 0 C2 Please verify your internet connection and retry O DI Type here to search 2 0 C1 C1 0 0 3 0 0 0 0 C2 4 C3 0 0 C2 C2 5 C3 C3 0 0 C2 Coding Belt 1 (C1): Number of Coder Dominant Cities = 5 Coding Belt 2 (C2): Number of Coder Dominant Cities = 4 Coding Belt 3 (C3): Number of Coder Dominant Cities = 3 Time Limit(x): 0.50 sec(s) for each input.

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).
