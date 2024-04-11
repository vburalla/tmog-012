package org.tfoc;

import java.util.HashSet;
import java.util.Set;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public boolean hasCycle(ListNode head) {

        Set<Integer> visited = new HashSet<>();
        ListNode current = head;
        boolean isLoop = false;
        while(current != null && !isLoop) {
            int nodeHash = hashCode(current);
            if(visited.contains(nodeHash)) {
                isLoop = true;
            } else {
                visited.add(nodeHash);
                current = current.next;
            }
        }
        return isLoop;
    }

    public int hashCode(ListNode node) {
        return node != null ? node.hashCode() : 0;
    }
}
