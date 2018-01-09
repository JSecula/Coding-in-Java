package model;

import message.Sequencer;

public class Model
{

  public int _numTracks;
  public int _numBeats;
  private SoundBank _soundBank;
  private Sequencer _sequencer;
  private Chord[] _chords;
  private Clock _clock;

  /**
   * The model sets up the clock.
   * Most of the work of running the application happens in the clock.
   * @param numTracks
   * @param numBeats
   */
  public Model(int numTracks, int numBeats){
    // TODO
	  _numTracks = numTracks;
	  _numBeats = numBeats;
	  _sequencer = new Sequencer(numBeats);
	  _soundBank = new SoundBank(new Sound[_numTracks]);
	  _chords = new Chord[numTracks];
	  
	  for(int n=0; n < numTracks; n++){
		  Chord chord = new Chord(_soundBank, numBeats);
		  _chords[n] = chord;
		  _sequencer.subscribe(chord);
	  }
	  _clock = new Clock();
	  _clock.subscribe(_sequencer);
  }

  public int getBeatNumber(){
    return _sequencer.getStepNumber();
  }

  public Clock getClock(){
    return _clock;
  }

  public void startPlaying(){
    // TODO
  }
  
  public void stopPlaying(){
    // TODO
  }

  public void setNote(int trackNum, int beatNum, boolean value){
    // TODO
  }

  public void setSoundName(int trackNum, String soundName){
    // TODO
  }

}
