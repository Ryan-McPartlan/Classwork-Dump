#include<iostream>
#include<ctime>
#include<cstdlib>

using namespace std;

int main() 
{
	srand(time(0));

	//Generates the random number
	int winningNumber = (rand() % 1000 + 1);
	float userGuess = 6;
	int guesses = 0;

	//Asks user to guess the number 
	cout << "Guess a number from 1 to 1000!" << endl;
	cout << "Try to find my secret number!" << endl;

	//Asks the user to keep guessing until they get it right
	while((userGuess != winningNumber) && (guesses < 20))
	{
		cin >> userGuess;

		if ((userGuess < 1) || (userGuess > 1000))
		{
			cout << "Your number should be between 1 and 1000" << endl;
		}
		else if(userGuess < winningNumber)
		{
			cout << "Try a guessing higher!" << endl;
		}
		else if(userGuess > winningNumber)
		{
			cout << "Try a lower guess!" << endl;
		}
		else if (userGuess != winningNumber)
		{
			cout << "That is a rather odd guess... try again!" << endl;
		}

		guesses += 1;
	}

	//Tell the user they win
	if (userGuess == winningNumber)
	{
		cout << "That is the winning number!!!" << endl;
		cout << "CONGRATULATIONS!!!!!!!!" << endl;
	}
	else
	{
		cout << "Sorry, your taking wayyyy to many guesses..." << endl;
		cout << "The number was " << winningNumber << endl;
	}

	return 0;
}
