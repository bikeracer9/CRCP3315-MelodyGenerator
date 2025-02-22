/*
 * Prescott Lau
 * October 24th 2024
 * Tests the weave function.
 */
package com.linked_list_music_template;

public class WeaveUnitTest {

    LinkedListMelodyManager manager = new LinkedListMelodyManager(); //object reference to a MelodyManager class
    LinkedListMelody melodyList = new LinkedListMelody(); //object reference to LinkedListMelody class

    void testWeave1() 
    {
        melodyList.clear();
        System.out.println("--------------------------");
        System.out.println("Test Weave 1: ");

        for(int i = 0; i < 12; i++)
        {
            melodyList.insertAtEnd( new MelodyNode(manager, 3));
        }
        
        MelodyNode node = new MelodyNode(manager, 0);
        melodyList.weave(node, 3,4);
        melodyList.print();

        System.out.println("--------------------------");
        
    }//end testWeave1()


    void testWeave2() 
    {
        melodyList.clear();

        System.out.println("--------------------------");
        System.out.println("Test Weave 2: ");

        for(int i = 0; i < 12; i++)
        {
            melodyList.insertAtEnd( new MelodyNode(manager, 3));
        }

        MelodyNode node = new MelodyNode(manager, 0);
        melodyList.weave(node, 5, 10);

        melodyList.print();

        System.out.println("--------------------------");
    }//end testWeave2()
}
