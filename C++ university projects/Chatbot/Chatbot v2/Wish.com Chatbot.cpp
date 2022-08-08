#include <iostream>
#include <ctime>
#include<fstream>
#include <vector>
#include <ctype.h>
#include <string.h>
#include<cmath>
#include<iomanip>

using namespace std;

class Chatbot
{
public:
    Chatbot();
    Chatbot(int, int);
    Chatbot(const Chatbot&);
    void Display();
    void Init(int,int);

private:
    int _SerialNumber;
    char* _Name;
    int _Age;
};

Chatbot::Chatbot(int SerialNumber, int Age)
{
    _SerialNumber = SerialNumber;

    _Age = Age;

}

void Chatbot::Display()
{
    cout<<"Hello, my name is Chatty ! Pleased to meet you!"<<endl;

    cout<<"My serial number is: "<<_SerialNumber<<endl;

    cout<<"I am currently "<<_Age<<" years old"<<endl;
}

void Chatbot::Init(int Serialnumber, int Age)
{
    _SerialNumber = Serialnumber;

    _Age = Age;
}

void arithmetic()
{
    int op = 0;
    float A = 0;
    float B = 0;

    cout<<"Select operation\n";
    cout<<"[1] Addition\n";
    cout<<"[2] Subtraction\n";
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

int ReadAllLines()
{
    std::ifstream file("brain.txt");
    std::string str;
    while (std::getline(file, str))
    {
        std::cout << str << "\n";
    }


    return 0;
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
char  DoWeContinueChar,UserChoiceChar;
int timeoftheday=0,inputLearner,SentencesTaught=0, annoyed=0, UserChoice;
bool DoWeContinueMain=true,DoWeContinueLearning=true,DoWeContinue=true, stillChoice1=true;
char fullname[100],DoWeContinueLearningChar, userInput[100];

int main()
{

    Chatbot chatty(1512561,2);
    chatty.Display();

    cout<<"Now then unknown user,I need to identify you"<<endl;
    cout<<"What is your name?"<<endl;
    cin.getline(fullname,100);
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
    while (DoWeContinueMain==true)
    {
        cout<<"I am currently capable of doing the following:"<<endl;
        cout<<" "<<endl;
        cout<<"1.Calculate things"<<endl;
        cout<<" "<<endl;
        cout<<"2.Learn new things from you"<<endl;
        cout<<" "<<endl;
        cout<<"3.I can show you everything that I know an answer to :) "<<endl;
        cout<<" "<<endl;
        cout<<"4.We can end the chat , and I will go back to my nap ZzZzZz"<<endl;
        cout<<" "<<endl;
        cout<<"So, what are we doing ? :D : ";
        cin>>UserChoiceChar;
        if (UserChoiceChar=='1') UserChoice=1;
        if (UserChoiceChar=='2') UserChoice=2;
        if (UserChoiceChar=='3') UserChoice=3;
        if (UserChoiceChar=='4') UserChoice=4;
        if (UserChoiceChar!='1') cout<<"Error!"<<endl;
        if (UserChoiceChar!='2') cout<<"Error!"<<endl;
        if (UserChoiceChar!='3') cout<<"Error!"<<endl;
        if (UserChoiceChar!='4') cout<<"Error!"<<endl;

        cout<<" "<<endl;
        system("CLS");
        do
        {
            if (UserChoice==1)
            {
                cout<<"Wish,com Calculator or something like that xD\n";
                arithmetic();


                cout<<"Do you want to continue? y/n"<<endl;
                cin>>DoWeContinueChar;
                if (DoWeContinueChar=='n' or DoWeContinueChar=='N')
                {
                    system("CLS");
                    DoWeContinue=false;
                }
                else
                {
                    system("CLS");
                }
            }
            if (UserChoice==2)

            {
                cout<<"Now that you have accessed this menu, you have to have at least 5 interactions with me or I will be very mad!"<<endl;
                cout<<"Make sure to save my brain file after i go to sleep, so I can remember everything you taught me"<<endl;
                while (DoWeContinueLearning==true)
                {
                    cout << "[You]: ";
                    cin.getline(userInput,100);

                    if (getPhrase(userInput))
                    {
                        SentencesTaught++;
                    }
                    else
                    {
                        learner(userInput);
                        SentencesTaught++;
                    }
                    if (SentencesTaught%5==0)
                    {
                        cout<<"Do you want to continue? y/n"<<endl;
                        cin>>DoWeContinueLearningChar;
                        if (DoWeContinueLearningChar=='n' or DoWeContinueLearningChar=='N')
                        {
                            system("CLS");
                            DoWeContinue=false;
                            DoWeContinueLearning=false;
                        }

                    }
                }
            }

            if (UserChoice==3)
            {
                system("CLS");
                ReadAllLines();
                cout<<"enter a key then press enter to return to the main menu"<<endl;
                cin>>DoWeContinueLearningChar ;
                DoWeContinue=false;
                system("CLS");
            }


            if (UserChoice==4)
            {
                DoWeContinue=false;
                DoWeContinueMain=false;
                system("CLS");
                if (timeoftheday==1)
                    cout<<"I will go to sleep now! Enjoy your day!"<<endl;
                else cout<<"I will go to sleep now! Enjoy your evening!"<<endl;
            }
        }
        while (DoWeContinue==true);
    }
}
