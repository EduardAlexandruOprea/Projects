#include <iostream>
#include <ctime>
#include<fstream>
#include <vector>
#include <ctype.h>
#include <string>
#include<cmath>

using namespace std;

void arithmetic()
{
    int op = 0;
    float A = 0;
    float B = 0;

    cout<<"Select opeartion\n";
    cout<<"[1] Addition\n";
    cout<<"[2] Substraction\n";
    cout<<"[3] Product\n";
    cout<<"[4] Division\n";
    cin>>op;
    if (op<1 or op>4)
    {
        cout<<"Invalid option"<<endl;
        return;
    }
    cout<<"Enter the number:";
    cin>>A;

    cout<<"Enter second number:";
    cin>>B;

    cout<<"Result: ";

    switch(op)
    {
    case 1:
        cout<<(A+B);
        break;
    case 2:
        cout<<(A-B);
        break;
    case 3:
        cout<<(A*B);
        break;
    case 4:
        cout<<(A/B);
        break;
    default:
        cout<<"Invalid operation";
        break;
    }
    cout<< endl;
}

int getPhrase(string userInput)
{
    ifstream brainFile("brain.txt");
    string phrase;
    string response;
    while (getline(brainFile, phrase, '|'))
    {
        getline(brainFile, response);
        if (userInput == phrase)
        {
            cout << "[Bot]: " << response << endl;
            brainFile.close();
            return 1;
        }

    }
    brainFile.close();
    return 0;
}


void learner(string inputPhrase)
{
    string storePhrase = inputPhrase;
    cout << "Teach me: " << storePhrase << " : ";
    std::string learningResponse;
    getline(std::cin, learningResponse);
    cout << learningResponse << endl;
    std::ofstream saveBrain;
    saveBrain.open("brain.txt", std::ios::out | std::ios::app);
    if (!saveBrain.is_open())
    {
        cout << "File is open. close it." << endl;
    }
    else
    {
        saveBrain << endl << storePhrase << "|" << learningResponse;
        saveBrain.close();
    }
    return;
}
char  UserChoiceChar,DoWeContinueChar;
int timeoftheday=0, annoyed=0, UserChoice;
bool DoWeContinue=true, stillChoice1=true;
string name, surname, fullname;
int main()
{
    cout<<"Hello unknown user,I need to identify you"<<endl;
    cout<<"What is your name?"<<endl;
    cin>>name;
    cout<<"What is your surname?"<<endl;
    cin>>surname;
    fullname=name+" "+surname;
    system("CLS");

    time_t ttime = time(0);
    tm *local_time = localtime(&ttime);
    if (local_time->tm_hour >0 && local_time->tm_hour<12)
    {

        timeoftheday=1;
        cout << "Good morning "<<fullname<<" :) " << endl;

        cout<<" "<<endl;
    }
    else
    {
        timeoftheday=2 ;
        cout << "Good evening "<<fullname<<" :) " << endl;
        cout<<" "<<endl;

    }

    cout<<"I am currently capable of doing the following:"<<endl;
    cout<<" "<<endl;
    cout<<"1.Calculate things"<<endl;
    cout<<" "<<endl;
    cout<<"2.Learn new things from you"<<endl;
    cout<<" "<<endl;
    cout<<"3.We can end the chat , and I will go back to my nap ZzZzZz"<<endl;
    cout<<" "<<endl;
    cout<<"So, what are we doing ? :D : ";
    cin>>UserChoiceChar;
    if (UserChoiceChar=='1') UserChoice=1;
    if (UserChoiceChar=='2') UserChoice=2;
    if (UserChoiceChar=='3') UserChoice=3;
    if (UserChoiceChar!='1') cout<<"Error!"<<endl;
    if (UserChoiceChar!='2') cout<<"Error!"<<endl;
    if (UserChoiceChar!='3') cout<<"Error!"<<endl;

    cout<<" "<<endl;
    system("CLS");
    while (DoWeContinue==true)
    {

        if (UserChoice==1)
        {
            cout<<"Wish,com Calculator or something like that xD\n";
            arithmetic();


            cout<<"Do you want to continue? y/n"<<endl;
            cin>>DoWeContinueChar;
            if (DoWeContinueChar=='n' or DoWeContinueChar=='N') DoWeContinue=false;
        }


        if (UserChoice==2)

        {
            std::string userInput;
            do
            {
                std::cout << "[You] : ";
                getline(std::cin, userInput);
                if (userInput != "x" && userInput != "X")
                {
                    if (getPhrase(userInput))
                    {
                        ;
                    }
                    else
                    {
                        learner(userInput);
                    }
                }
            }
            while (userInput != "x" && userInput != "X");
        }




        if (UserChoice==3)
        {
            DoWeContinue=false;
            system("CLS");
            if (timeoftheday==1)
                cout<<"I will go to sleep now! Enjoy your day!"<<endl;
            else cout<<"I will go to sleep now! Enjoy your evening!"<<endl;
        }


    }

}
