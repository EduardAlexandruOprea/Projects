#include <iostream>
#include "expressionSolver.h"

using namespace std;



int main() {
	ExpressionSolver SolverThing = ExpressionSolver();

	string givenCalculus;
    cout<<"Type 'exit' to..oh well..close the program xD \n\n";
	while(1) {
		cout << "Input: ";

		getline(cin,givenCalculus);
		if(givenCalculus == "exit") break;

		cout << "| ";

		string output = SolverThing.solveExpression(givenCalculus);
		cout << output << endl << endl;
	}
	return 0;
}


/*Inspired from many Github, Youtube StackOverflow and whatever other site i found , more like 97% inspired, but at least i am not claiming that this is my work in full lmao.
Credits:
https://www.fuscin.com/erzhtor/algebroid
https://github.com/StrictlyDominick/win32Calculator/tree/master/win32Calculator
https://www.youtube.com/watch?v=YLstT3mvm8k
https://www.youtube.com/watch?v=YLstT3mvm8k&ab_channel=monsterhunter445
https://github.com/yjy0625/expression-solver
https://www.youtube.com/watch?v=iyx6owo3SAI&ab_channel=StarGaming
http://www.cplusplus.com/forum/beginner/16496/
https://forum.softpedia.com/topic/1151831-calculatorul-unei-expresii-matematice-in-c/
+ some other links that i can't find due to them being to many. but yeah this are the main inspirations and probably many of us actually used the same sites xD
*/
