package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.tfoc.helpers.DataFaker;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideLinkedLists")
    void testSolution(ListNode head, Boolean validation) {

        Solution solution = new Solution();
        assertEquals(validation, solution.hasCycle(head));

    }

    private static Stream<Arguments> provideLinkedLists() {

        return Stream.of(
                Arguments.of(DataFaker.createListNode(new int[]{3,2,0,-4}, 1), true),
                Arguments.of(DataFaker.createListNode(new int[]{1,2}, 0), true),
                Arguments.of(DataFaker.createListNode(new int[]{1}, -1), false),
                Arguments.of(DataFaker.createListNode(new int[]{-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5}, -1), false)
        );
    }

}