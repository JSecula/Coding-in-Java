//Project 2: Robert Grid
//CSE1102 Spring 2015
//Jason Secula
//09/13/2015
//TA: Reynaldo Morillo
// Section 01
//Instructor: Jeff-fa-fa A. Meun-i-er
import robotgrid.Grid;
import robotgrid.GridServer;
import robotgrid.Heading;
import robotgrid.Layer;
import robotgrid.Robot;
import robotgrid.TriggerCell;
import robotgrid.Utils;
import robotgrid.Wall;
public class Test
{
  public static void main(String[] args)
  {
    GridServer server = new GridServer();
    Grid grid = server.createGrid("Test", 10, 10 );
    Robot robot1 = new Robot("Robot 1", Heading.East);
    grid.placeObject(robot1, 0, 0);
    setup(grid);
    // pause a bit before things start to happen
    Utils.sleep(500);
int j = 0;
while(j<1){
	robot1.move();
	j++;
			}
robot1.turnRight();

while(j<11){		//j is now = to 10, so next while loop must be greater than value
	robot1.move();
	j++;
			}
robot1.turnLeft(2); //I got stuck here because I forgot the value of j changes.
while(j>=8){ //j is now equal to 8
	robot1.move();
	j--;
			}
robot1.turnRight();
while(j>4){
	robot1.move();
	j--;
			}
robot1.turnRight();
while(j>2){			//j is equal to 3 now? I lost track.
	robot1.move();
	j--; 			//still -- because the value is greater.
		}
robot1.turnLeft(2); //you should see how many test pages are open.
while(j<=5){
	robot1.move();
	j++;
			}
robot1.turnRight();
while(j>1){			//my j value is 5? but I think this will move it 4 times
	robot1.move();
	j--;
			}		//so my j value is equal to 1 now?
					//the program ran into the wall four times before turning.
					//probably a better way to do this.
robot1.turnRight();
while(j<3){			//j is equal to 3.
	robot1.move();
	j++;
}
robot1.turnLeft();
while(j<7){			//3 + 4(moves) = 7.
	robot1.move();
	j++;
			}
robot1.turnRight();	//final stretch!!
while(j<12){		//in order to get j(at value of 7) add 5 to get j to move 5 spots.
	robot1.move();
	j++;
			} 		//this program moved faster than the original.
}					//it was also harder to conceptualized

  private static void setup(final Grid grid)
  {
    for(int n=0; n<10; n++)
    {
      Wall wall = new Wall();
      grid.placeObject(wall, 3, n);
      grid.placeObject(wall, 6,  n);
    }
    Layer layer = grid.getLayer(null);
    TriggerCell tc1 = new TriggerCell(layer, 1, 9, "") {
@Override
      public void activate()
      {
        grid.removeObject(3, 5);
      }
    };
    TriggerCell tc2 = new TriggerCell(layer, 4, 7, "") {
@Override
      public void activate()
      {
        grid.removeObject(6, 5);
      }
    };
    layer.setCell(1, 9, tc1);
    layer.setCell(4, 7, tc2);
    TriggerCell tc3 = new TriggerCell(layer, 5, 3, "Checkpoint");
    layer.setCell(5, 3, tc3);
    TriggerCell tc4 = new TriggerCell(layer, 9, 9, "Finished!");
    layer.setCell(9, 9, tc4);
}
  }