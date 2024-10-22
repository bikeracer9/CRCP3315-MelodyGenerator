/*
 * c2024  Prescott Lau using a template by Dr. Courtney Brown
 * Class: LinkedListMelody
 * Description: The "container" that holds all the MelodyNodes to play them.
 * 
 */


package com.linked_list_music_template;

public class LinkedListMelody implements Drawable {
    MelodyNode head;//start of the list
    MelodyNode curPlayingNode; //the currently playing node of the melody

    public LinkedListMelody() //constructor.
    {
        head = null;
    }


    //fill in this class
    public void draw()
    {
        //fill this in to play melody
    }

    MelodyNode curMelodyNode = null; //init to nothing bc nothings playing at the start.

    //this method will play the first note - start the music.
    public void start()
    {
        if(head != null)
        {
            curMelodyNode = head;
            head.start();
        }
    }

    /*
     * Prints all the foods in a list.
     * If there is nothing in the list, it prints "GroceryList is empty."
     */
    public void print()
    {
        if (isEmpty()) //if isEmpty = true:
        
            System.out.println("MelodyList is empty"); 
        
        MelodyNode current = head ; //Start at head
        
        System.out.println("Melody: ");
        while (current != null)
            { //While not the end of the list
                
                System.out.print(" " + current.toString()); //print data
                
                current = current.getNextMelodyNode(); //go to next node
            }
            System.out.println(""); 
        
    } //end of print()


    /*
     * Boolean to return "true" if the list is empty.
     */
    boolean isEmpty() 
    {
        return head == null;
    }//end of isEmpty()


    /*
    * inserts a MelodyNode at the indicated index provided.
    */
    void insert(int index, MelodyNode node)
    {
        if(index == 0) //if the given index is zero, insert the node at the beginning.
        {
            insertAtStart(node);
        }
        else //otherwise: loop through the nodes to find where to place the next node.
        {
            MelodyNode current = head;
            int count = 0;
            while( (current != null) && (count < index - 1))
            {
                current = current.getNextMelodyNode();
                count++;
            }
            if (current != null) 
            {
                node.setNextMelodyNode( current.getNextMelodyNode() );
                current.setNextMelodyNode(node);
            }
        }
    }//end of insert(index, node)


    /*
     * Inserts a MelodyNode at the start of the list (prepend).
     */
    void insertAtStart(MelodyNode node) 
    {
        node.setNextMelodyNode(head); 
        head = node;
    }//end of insertAtStart()


    /*
     * Inserts a MelodyNode at the end of the list (append). 
     */
    void insertAtEnd(MelodyNode node) 
    {
        if(head == null) 
        {
            head = node;
        }
        else
        {
            MelodyNode current = head;
            while(current.getNextMelodyNode() != null)
            {
                current = current.getNextMelodyNode();
            }
            current.setNextMelodyNode(node);
        }
    }//end of insertAtEnd()

}
