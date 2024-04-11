package org.tfoc.helpers;

import lombok.experimental.UtilityClass;
import org.tfoc.ListNode;

@UtilityClass
public class DataFaker {

    public ListNode createListNode(int[] head, int pos) {

        ListNode listNode = null;
        ListNode current = null;
        ListNode tail = null;
        for(int i=0; i< head.length; i++) {
            if(listNode ==  null) {
                listNode = new ListNode(head[i]);
                current = listNode;
            } else {
                ListNode newNode = new ListNode(head[i]);
                current.next = newNode;
                current = newNode;
            }
            if(i == pos)
                tail = current;
        }
        current.next = tail;
        return listNode;
    }
}
