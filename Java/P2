#include <iostream>
#include <stack>


using namespace std;


int main()
{
  string keyboardIn;
  stack<char> checkStack;
  int closeParen = 0;
  int openParen = 0;
  bool balanced = true;
 
 cout << "Input a string, and the program will check if its parentheses are balanced." << endl;
  cin >> keyboardIn;
 
  for(int i = 0; i < keyboardIn.length(); i++)
  {
     checkStack.push(keyboardIn[i]);
  }
  
  for(int i = 0; i < keyboardIn.length(); i++)
  {
     if (checkStack.top() == ')')
     {
         closeParen += 1;
     }
     else if (checkStack.top() == '(')
     {
         openParen += 1;
     }
     
     if(openParen < closeParen)
     {
         break;
     }
     
     checkStack.pop();
  }
  
  if(closeParen != openParen)
  {
      balanced = false;
  }
  
  if(balanced)
  {
      cout << "The string has balanced parentheses";
  }
  else
  {
      cout << "The string does not have balanced parentheses.";
  }
 
  return 0;
}


