//Specification file for the NumberList class
#ifndef NUMBERIST_H
#define NUMBERLIST_H


class NumberList
{
private:
	//Declare a structure for the list
	struct ListNode
	{
		double value;                //The value of a given node in the list
		ListNode *next;             //A pointer to the next node
	};


ListNode *head;                                   // Pointer to first node (or nullptr for empty list)


public:
//Constructor
NumberList()
{
	head = nullptr;
}


//Destructor
~NumberList();


//Linked list operations
void appendNode(double);
void insertNode(double);
void deleteNode(double);
void search(double);
void displayList() const;
};




#endif














// Implementation file for the NumberList class
#include <iostream>                                                        //For cout
#include "NumberList.h"
using namespace std;


//Append Node function
//********************************************************
// appendNode appends a node containing the           *
// value passed into the function to the end of the list. *
//********************************************************


void NumberList::appendNode(double num)
{
	ListNode* newNode;             // To point to a new node
	ListNode* nodePtr;                // To move through the list


	// Allocate a new node and store num there
	newNode = new ListNode;
	newNode -> value = num;
	newNode->next = nullptr;


	// If there are no nodes in the list
	// Make newNode the first node.
	if (!head)
		head = newNode;
	else                                      //Otherwise, insert a newNode at the end.
	{
		//Initialize nodePtr to head of list
		nodePtr = head;


		//Find the last node in the list
		while(nodePtr->next)
		{
			nodePtr = nodePtr -> next;
		}


		//Insert newNode as the last node
		nodePtr ->next = newNode;
	}
}




//Display List function
//********************************************************
// displayList shows the value stored in each node of  *
// the linked list pointed to by head                               *
//********************************************************


void NumberList::displayList() const
{
	ListNode *nodePtr;                                            //To move through the list


	// Position nodePtr at the head of the list
	nodePtr = head;


	//While nodePtr points to a node, traverse the list
	while(nodePtr)
	{
		//Display the value in this node
		cout <<   (nodePtr -> value)   << endl;


		//Move to the next node
		nodePtr = nodePtr -> next;
	}
}








//Insert Node function
//*********************************************************************
//  insertNode  inserts a node with a value of the passed number  *
// to the first location where the nextnode’s value is greater           *
//*********************************************************************


void NumberList::insertNode(double num)
{
	ListNode* newNode = nullptr;                               //The new node
	ListNode* nodePtr = nullptr;                                  //To traverse the list
	ListNode* previousNode = nullptr;                        //Keeps track of previous node


	//Allocate a new node and store num there
	newNode = new ListNode;
	newNode -> value = num;


	// If there are no nodes in the list make newNode the first node
	if (!head)
	{
		head = newNode;
		newNode -> next = nullptr;
	}
	else                                                                         //Otherwise, insert newNode
	{
		// Position nodePtr at the head of the list
		nodePtr = head;


		// Initialize previousNode to nullPtr
		previousNode = nullptr;


		// Skip all nodes who’s value is less than num.
		while(nodePtr != nullptr && nodePtr -> value < num)
		{
			previousNode = nodePtr;
			nodePtr = nodePtr -> next;
		}


		//If the list is empty or the current first value is greater than the new value
		if(previousNode == nullptr)
		{
			head = newNode;
			newNode -> next = nodePtr;
		}
		else                                          //Insert between previous and current iteration node
		{
			previousNode -> next = newNode;
			newNode -> next = nodePtr;
		}		
	}
}






//Delete Node function
//*******************************************************************************
//  The deleteNode function searches for a node with the input as its value. *
//   It deletes the first node it finds with this value.                                          *
//*******************************************************************************


void NumberList::deleteNode(double num)
{
	ListNode *nodePtr = nullptr;                                                    //To traverse the list
	ListNode *previousNode = nullptr;                            //Keep track of previous node


	//If the list is empty, do nothing.
	if (!head)
		return;


	// Determine if the first node is the one.
	if (head -> value == num)
	{
		nodePtr = head->next;
		delete head;
		head = nodePtr;
	}
	else
	{ 
		nodePtr = head;                            //Initialize nodePtr to the head of the list


		//Skip all nodes who’s value is not num
		while (nodePtr != nullptr && nodePtr -> value != num)
		{
			previousNode = nodePtr;
			nodePtr = nodePtr -> next;
		}


		//If nodePtr is not at the end of the list (nullptr)
		//link the previous node to the node after nodePtr, delete nodePtr
		if (nodePtr)
		{
			previousNode -> next = nodePtr -> next;
			delete nodePtr;
		}
	}
}


void NumberList::search(double num)
{
	ListNode *nodePtr;                                            //To move through the list
	int count = 0;


	// Position nodePtr at the head of the list
	nodePtr = head;
	//While nodePtr points to a node, traverse the list
	while(nodePtr)
	{
		count++;
		if(nodePtr->value == num)
		{
			cout << "The position is " << count << endl;
			return;
		}
		nodePtr = nodePtr -> next;
	}


	cout << "That number is not in the list.";
}


//The Destructor function
//*******************************************************************************
//  The ~NumberList() function deletes every node in the list *
//*******************************************************************************


NumberList::~NumberList()
{
	ListNode* nodePtr;
	ListNode* nextNode;


	//nodePtr starts at head of list
	nodePtr = head;


	//While nodePtr is not at the end of the list
	while (nodePtr != nullptr)
	{
		nextNode = nodePtr-> next;
		delete nodePtr;
		nodePtr = nextNode;
	}
}











//Specification file for the NumberList class
#ifndef NUMBERIST_H
#define NUMBERLIST_H


class NumberList
{
private:
	//Declare a structure for the list
	struct ListNode
	{
		double value;                //The value of a given node in the list
		ListNode *next;             //A pointer to the next node
	};


ListNode *head;                                   // Pointer to first node (or nullptr for empty list)


public:
//Constructor
NumberList()
{
	head = nullptr;
}


//Destructor
~NumberList();


//Linked list operations
void appendNode(double);
void insertNode(double);
void deleteNode(double);
void search(double);
void displayList() const;
};




#endif
