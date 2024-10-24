/*
 * Prescott Lau --based off of Courtney Brown's vimeo videos.
 * October 23rd 2024
 * 
 * Description: This class contains all the buttons for the MelodyLinkedList!
 * 
 * Classes included in this Class:
 * MelodyButton   -- the super class for all the buttons that use the MelodyLinkedList
 * PlayButton     -- plays the MelodyLinkedList
 * StopButton     -- stops playing the MelodyLinkedList.
 * LoopTrueButton -- turns ON the loop() function to loop the MelodyLinkedList.
 * LoopFalseButton-- turns OFF the loop() function to STOP looping the MelodyLinkedList.
 * TestWeaveButton: calls the WeaveUnitTest Class and tests the two weave methods.
 */
package com.linked_list_music_template;

import processing.core.PApplet;

/*
 * --------
 * MelodyButton: the super class for all the buttons that use the MelodyLinkedList
 * --------
 */
public abstract class MelodyButton extends Button{

    LinkedListMelody melody; //Linked List Melody to control

    //----- TEST WEAVE OBJECT DECLARATION
    WeaveUnitTest weaveUnitTest = new WeaveUnitTest();

    //overload the constructor for the MelodyButon -- use the default size for height & width & color.
    MelodyButton(PApplet main_, LinkedListMelody melody_, String label_,float x_, float y_)
    {
        super(main_, label_, x_, y_); 
        melody = melody_;
    }

}


/*
 * --------
 * PlayButton: plays the MelodyLinkedList
 * --------
 */
class PlayButton extends MelodyButton{

    //overload the constructor for the MelodyButon -- use the default size for height & width & color.
    PlayButton(PApplet main_, LinkedListMelody melody_, float x_, float y_)
    {
        super(main_, melody_, "Play", x_, y_); 
    }

    //Start playing the Melody
    public void onPress()
    {
        melody.start();
    }
}



/*
 * --------
 * StopButton: stops playing the MelodyLinkedList.
 * --------
 */
class StopButton extends MelodyButton{

    //overload the constructor for the MelodyButon -- use the default size for height & width & color.
    StopButton(PApplet main_, LinkedListMelody melody_, float x_, float y_)
    {
        super(main_, melody_, "Stop", x_, y_); 
    }

    //Start playing the Melody
    public void onPress()
    {
        melody.stop();
    }
}




/*
 * --------
 * LoopTrueButton: turns ON the loop() function to loop the MelodyLinkedList.
 * --------
 */
class LoopTrueButton extends MelodyButton{

    //overload the constructor for the MelodyButon -- use the default size for height & width & color.
    LoopTrueButton(PApplet main_, LinkedListMelody melody_, float x_, float y_)
    {
        super(main_, melody_, "Turn ON Loop", x_, y_); 
    }

    //Start playing the Melody
    public void onPress()
    {
        melody.loop(true);
    }
}



/*
 * --------
 * LoopFalseButton: turns OFF the loop() function to STOP looping the MelodyLinkedList.
 * --------
 */
class LoopFalseButton extends MelodyButton{

    //overload the constructor for the MelodyButon -- use the default size for height & width & color.
    LoopFalseButton(PApplet main_, LinkedListMelody melody_, float x_, float y_)
    {
        super(main_, melody_, "Turn OFF Loop", x_, y_); 
    }

    //Start playing the Melody
    public void onPress()
    {
        melody.loop(false);
    }
}



/*
 * --------
 * TestWeaveButton: calls the WeaveUnitTest Class and tests the weave method.
 * --------
 */
class TestWeaveButton extends MelodyButton{

    //overload the constructor for the MelodyButon -- use the default size for height & width & color.
    TestWeaveButton(PApplet main_, LinkedListMelody melody_, float x_, float y_)
    {
        super(main_, melody_, "WeaveUnitTest", x_, y_); 
    }

    //Test the WeaveUnitTests
    public void onPress()
    {
        weaveUnitTest.testWeave1();
        weaveUnitTest.testWeave2();
    }
}

