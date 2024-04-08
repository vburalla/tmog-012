# The Mirror of Galadriel!
## Episode #012 - Linked List Cycle

Welcome to ***The Mirror of Galadriel***, one of the activities that will follow in the *The Fellowship of Code*. If you haven't been here before, this is a place where programming problems of different types will be proposed to be solved as fast as possible.

Without further ado, we leave you with the next problem. 

Good luck adventurers!

## Statement

Given head, the ``head`` of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the ``next`` pointer. 
Internally, ``pos`` is used to denote the index of the node that tail's ``next`` pointer is connected to. Note that ``pos`` is not passed as a parameter.

Return ``true`` if there is a cycle in the linked list. Otherwise, return ``false``.

***Constraints***
> The number of the nodes in the list is in the range ``[0, 10^4]``.
> </br>``-10^5 <= Node.val <= 10^5``
> </br>``pos`` is ``-1`` or a valid index in the linked-list.

## Examples

*Example 1*
> ![example1](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png)
> </br> **Input**: head = [3,2,0,-4], pos = 1
> </br> **Output**: true
> </br> **Explanation**: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

*Example 2*
> ![example2](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png)
> </br> **Input**: head = [1,2], pos = 0
> </br> **Output**: true
> </br> **Explanation**: There is a cycle in the linked list, where the tail connects to the 0th node.

*Example 3*
> ![example3](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png)
> </br> **Input**: head = [1], pos = -1
> </br> **Output**: false
> </br> **Explanation**: There is no cycle in the linked list.

## Extra

Can you solve it using ``O(1)`` (i.e. constant) memory?

## Credits

This exercise has been extracted from the [LeetCode](https://leetcode.com/problems/linked-list-cycle) website. Don't hesitate, join and practice in this great community.
