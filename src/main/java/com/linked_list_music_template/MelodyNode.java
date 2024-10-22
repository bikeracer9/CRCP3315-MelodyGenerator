/*
 * Prescott Lau
 * October 22nd 2024
 * 
 * The MelodyNode class. These are individual objects that will play a note.
 */
package com.linked_list_music_template;

public class MelodyNode {
    
    MelodyManager melodies; //object reference to a MelodyManager class
    MelodyNode nextMelodyNode; //next node in the list
    int whichMelody; //which melody to play (indexes the MelodyManager class)
    
    public MelodyNode(MelodyManager melodies, int m_) //constructor
    {
        this.whichMelody = m_;
        nextMelodyNode = null;
    }


    /*
     * Getters & Setters for nextMelodyNode
     */

     public MelodyNode getNextMelodyNode()
     {
        return nextMelodyNode;
     }

     public void setNextMelodyNode(MelodyNode node)
     {
        this.nextMelodyNode = node;
     }


     /*
      * This method starts the melody to start playing.
      */
     public void start()
     {
        melodies.start(whichMelody);
     }

     /*
      * This method brings in a new MelodyNode and creates a copy of it.
      */
     public MelodyNode copy(MelodyNode node)
     {
        // MelodyNode copyMelodyNode = new MelodyNode();
        // MelodyNode copyMelodyNode; 
        // copyMelodyNode = getNextMelodyNode();
        
        MelodyNode copyMelodyNode = node;

        return copyMelodyNode;
     }


}
