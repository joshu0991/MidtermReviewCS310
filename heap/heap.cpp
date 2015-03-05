/*
 * heap.cpp
 *
 *  Created on: Mar 4, 2015
 */

#include <iostream>

const int size = 12;
static int A[size] = {0, 3, 1, 1, 6, 3, 2, 10, 3, 16, 19, 4};

int left(int i)
{
	return (2*i)+1;
}

int right(int i)
{
	return (2*i)+2;
}

//a leaf of a value less than the size of the array
//and larger than the center of the array
bool isLeaf(int i)
{
	if(i >= (size/2) && i <= size)
	{
		return true;
	}
	return false;
}

void maxHeapify(int i)
{
	//if it isn't a leaf it may need to be swapped
	if(!isLeaf(i))
	{
		//if the value is less than it's right or left child
		if(A[i] < A[left(i)] || A[i] < A[right(i)])
		{
			//if the left child is smaller
			if(A[left(i)] > A[right(i)])
			{
				//swap the left child with the index
				std::cout << "Swapping " << A[i] << " and " << A[left(i)] << std::endl;
				int a = A[i];
				A[i] = A[left(i)];
				A[left(i)] = a;
				//and run maxHeapify in it. This will push the value to
				//it's lowest point and order all things below the parent
				maxHeapify(left(i));
			}
			else
			{
				//else swap with the right child since it is larger
				std::cout << "Swapping " << A[i] << " and " << A[right(i)] << std::endl;
				int a = A[i];
				A[i] = A[right(i)];
				A[right(i)] = a;
				//run maxheap on that value. This will push the value to it's lowest position
				maxHeapify(right(i));
			}
		}
	}
}


bool buildHeap()
{
	//need to run for each node that is not a leaf
	for(int i = (size/2); i >= 0; i--)
	{
		maxHeapify(i);
	}
	return true;
}


int main()
{
	std::cout << "before: " << std::endl;
	for(int i = 0; i < size; i++)
	{
		std::cout << A[i] << ", ";
	}
	std::cout << std::endl;
	buildHeap();
	std::cout << "After: " << std::endl;
	for(int i = 0; i < size; i++)
	{
		std::cout << A[i] << ",";
	}
	std::cout << std::endl;
	return 0;
}
