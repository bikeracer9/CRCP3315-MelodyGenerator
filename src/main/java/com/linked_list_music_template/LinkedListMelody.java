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
        curPlayingNode = null;
    }


    //fill in this class *****************************
    public void draw()
    {
        play();
        //loop(true);
        //loop(false);
    }//end of draw()

    MelodyNode curMelodyNode = null; //init to nothing bc nothings playing at the start.

    //this method will play the first note - start the music.
    public void start()
    {
        if(head != null)
        {
            curPlayingNode = head;
            head.start();
        }
    }//end of start()

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
                
                System.out.print(" " + current.getWhichMelody()); //print data
                
                current = current.getNextMelodyNode(); //go to next node
            }
            System.out.println(" "); 
        
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


    /*
     * This is the play method, it goes through all the Nodes and plays them!
     */
    public void play()
    {
        if( curPlayingNode != null )
        {
            if( curPlayingNode.atEnd() )
            {
                curPlayingNode = curPlayingNode.getNextMelodyNode();
                if(curPlayingNode != null)
                {
                    curPlayingNode.start();
                }
            }
        }
    }//end of play()


    /*
     * This is the stop method, it stops playing the melodies.
     */
    public void stop()
    {
        curPlayingNode = null;
        System.out.println("Stopped playing Melodies.");
    }//end of stop()

    
    /*
     * Loops the melody & also stops the loop.
     */
    public void loop(boolean loop)
    {
        System.out.println("LOOP ON!"); //test

        if((curPlayingNode != null) && (loop))
        {

        }

        // if(loop)
        // {
        //     System.out.println("Loop = True");
        //     while(loop == true)
        //     {
        //         play();
        //         if(curPlayingNode == null)
        //         {
        //             curPlayingNode = head;
        //         }
        //         if(loop == false)
        //         {
        //             System.out.println("Loop = False, Stopped playing.");
        //             stop();
        //         }
        //     }
        // }
        // else
        // {
        //     System.out.println("Loop = False, Stopped playing.");
        // }   
        
        
        // if(loop == true)
        // {
        //     System.out.println("Loop = True");
        //     while(curPlayingNode != null)
        //     {
        //         play();
        //     }
            
        //     if(curPlayingNode == null)
        //     {
        //         curPlayingNode = head;
        //     }
        // }
        // else
        // {
        //     System.out.println("Loop = False");
        //     stop();
        // }


    }//end of loop()

    
    /*
     * Weave the input melodyNode count times every skip nodes.
     */
    public void weave(MelodyNode node, int count, int skip)
    {
        /*
         * Weave the input melodyNode count times every skip nodes. 
         * Do no go over the edge of the list.
         * 
         * weave(node, 3, 4);
         * Melody: 3, 3, 3, 0, 3, 3, 3, 0, 3, 3, 3, 0, 3, 3, 3, 0
         */
        
        //  MelodyNode current = node;
        // int currentIndex = 0;
        // int weave = 0; 
        // while(current != null && weave < count)
        // {
        //     if( (currentIndex % (skip+1) == 0)  //4 % 4 = 0
        //     {

        //     }
        // }


        MelodyNode current = head;
        int currentIndex = 0;
        int weave = 0;
        while(current != null && weave < count)
        {
            if(currentIndex % (skip + 1) == skip)
            {
                MelodyNode copyNode = node.copy();
                copyNode.setNextMelodyNode(node);
                current = copyNode;
                weave++;
            }
            current = current.getNextMelodyNode();
            currentIndex++;
        }
    }//end of weave()


    /*
     * TWO OTHER METHODS BELOW:
     * ------------------------------------------------
     */

     /*
      * Clear method: this clears the List by setting both nodes to be null.
      */
      public void clear()
      {
        head = null;
        curPlayingNode = null;
      }

      /*
       * Reverse method: Reverses the List!
       */
      public void reverse()
      {
        MelodyNode previous = null;//set the previous node to be null.
        MelodyNode current = head; //set the current node to be the head node.
        MelodyNode next = null;    //set the next node to be null.

        while(current != null) //while loop to go through the list.
        {
            next = current.getNextMelodyNode(); 
            current.setNextMelodyNode(previous); //set current node to previous node
            previous = current;
            current = next;
        }
        head = previous;
      }

}
