# CapstoneProject: Shooting Gallery
P6 Team Freshies Java

Our prjoect called the Shooting Gallery is a like a carnival game where you have a gun, and there are multiple targets. Given a certain time frame, the person playing or running the program is aiming to shoot as many circular targets as they can. All their makes and misses will be totaled to a percentage at the end of the round. There will be 3 rounds as after each round, the targets will pop up and down faster.

One class will be used for our targets. This class instantiates targets that randomly appear on the screen, and if hit, the user gains 100 points. It sets the targets color, and size. 

The next class named Gallery will set the shape of the target, and check if and where the mouse is clicked. It also calls a basic target that is instantiated to be outlined on the screen.

The third class creates the background that is to be displayed behind the targets. It sets its color and its size.

The fourth class gets the target color, size, and the points gained from the basic target class.

Lastly, the final class prints and displays the targets onto the gallery/ frame. 

A bonus class that might be added will have different colored targets and if hit, will reward the player with extra points. The extra point targets will be harder to hit, but if missed will not be added to accuracy(percentage).
