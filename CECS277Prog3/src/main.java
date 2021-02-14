import java.util.ArrayList;
import java.util.Scanner;

public class main {
	 
	 public static int menu()	{
		Scanner in = new Scanner(System.in);
		System.out.println("\nSolitaire Prime Menu:");
		System.out.println("1. Create New Deck");
		System.out.println("2. Shuffle Deck");
		System.out.println("3. Show Deck");
		System.out.println("4. Play War");
		System.out.println("5. Exit");
		System.out.print("User Input: ");
		int userInput = in.nextInt();
		return userInput;
	 }
	 
	 public static int warOne(Card p1, Card p2)	{
		 //Player 1 wins
		 System.out.println("Player One plays " + p1.toString());
		 System.out.println("Player Two plays " + p2.toString());
		 if (p1.getValue() > p2.getValue())	{
			 System.out.println("Player One Wins the round!");
			 return 1;
		 }
		 
		 //Player 2 wins
		 else if (p1.getValue() < p2.getValue())	{
			 System.out.println("Player Two Wins the round!");
			 return -1;
		 }
		 //Equal
		 System.out.println("It's a tie! Time for war!");
		 return 0;
	 }
	
	 public static void main(String args[])	{
//		 Card yeet = new Card(CardRank.FIVE, CardSuit.HEARTS);
//		 Hand hehe = new Hand();
//		 hehe.addCard(yeet);
//		 hehe.display();
//		 System.out.println(hehe.howMany());
//		 hehe.removeCard();
//		 System.out.println(hehe.howMany());
		 // Makes sure loop keeps going
		 boolean keepGoing = true;
		 Deck warDeck = new Deck();
		 do	{
			int userInput = menu();
			
            //New Deck
            if (userInput == 1)	{
            	warDeck = new Deck();
            }//end new deck
            
            //Shuffle Deck
            else if (userInput == 2)	{
            	warDeck.shuffle();
            	
            }//end shuffle deck
            
            //Display Deck
            else if (userInput == 3)	{
            	warDeck.display();
            }//end display deck
            
            //Play the game
            else if (userInput == 4)	{
            	Scanner in = new Scanner(System.in);
        		System.out.print("\nEnter Maximum Battle Number: ");
        		int battleNum = in.nextInt();
            	int player = 1;
            	int roundWin = 0;
            	boolean winner = true;
            	Card temp;
            	Card p1;
            	Card p2;
            	Hand playerOneHand = new Hand();
            	Hand playerTwoHand = new Hand();
            	ArrayList<Card> warHand = new ArrayList<Card>();
            	//Populates Player One and Twos hands
            	while (warDeck.cardsLeft() != 0)	{
            		temp = warDeck.deal();
            		if (player == 1)	{
            			playerOneHand.addCard(temp);
            		}
            		
            		else if (player == -1)	{
            			playerTwoHand.addCard(temp);
            		}
            		player *= -1;
            	}//end while; player = 1
            	//Displaying both players cards
            	System.out.println("Player One's Cards:");
            	playerOneHand.display();
            	System.out.println("\n\nPlayer Two's Cards:");
            	playerTwoHand.display();
            	System.out.println("\n\nEnter any key to continue.");
            	in.next();
            	
            	//Wargame officially started!
            	while (battleNum > 0)	{
            		//Whoever has more cards at the end wins
            		winner = playerOneHand.howMany() > playerTwoHand.howMany() ? true : false; 
            		if (playerOneHand.howMany() == 0 || playerTwoHand.howMany() == 0) {
            			break;
            		}
            		//Place the two cards down
            		p1 = playerOneHand.deal();
            		playerOneHand.removeCard();
            		p2 = playerTwoHand.deal();
            		playerTwoHand.removeCard();
            		//See who wins the round
            		roundWin = warOne(p1, p2);
            		//P1 Wins - Card removed from P2 and added to P1
//            		playerOneHand.reset();
//            		playerTwoHand.reset();
            		if (roundWin == 1)	{
//            			System.out.println("Player One wins the round!");
            			playerOneHand.addCard(p1);
            			playerOneHand.addCard(p2);
//            			playerTwoHand.removeCard();
            			
            		}
            		//end if
            		else if (roundWin == -1)	{
//            			System.out.println("Player Two wins the round!");
            			playerTwoHand.addCard(p1);
            			playerTwoHand.addCard(p2);
//            			playerOneHand.removeCard();
            			
            		}
            		
            		//Tied so it's a war
            		warHand.add(p1);
            		warHand.add(p2);
            		while (roundWin == 0)	{
            			//Makes sure no one runs out of cards and if they do the appropriate player wins
//            			System.out.println("\n\nP1 = " + playerOneHand.howMany() + " vs P2 = " + playerTwoHand.howMany() + "\n\n");
            			
                		if (playerOneHand.howMany() <= 4 || playerTwoHand.howMany() <= 4) {
                			winner = playerOneHand.howMany() > playerTwoHand.howMany() ? true : false; 
                			if (winner)	{
                				System.out.println("Player Two does not have enough cards for a war! Player Two automatically loses!");
                				playerOneHand.addCard(p1);
                    			playerOneHand.addCard(p2);
                			}
                			else if (!winner)	{
                				playerTwoHand.addCard(p1);
                    			playerTwoHand.addCard(p2);
                				System.out.println("Player One does not have enough cards for a war! Player One automatically loses!");
                			}
                			break;
                		}
//                		System.out.println("Player One's Remaining Cards(" + playerOneHand.howMany() + "):");
//                    	playerOneHand.display();
//                    	System.out.println("\n\nPlayer Two's Remaining Cards(" + playerTwoHand.howMany() + "):");
//                    	playerTwoHand.display();
            			for (int i = 0; i < 4; i++)	{
            				p1 = playerOneHand.deal();
                    		playerOneHand.removeCard();
                    		p2 = playerTwoHand.deal();
                    		playerTwoHand.removeCard();
                    		if (i != 3)	{
	                    		System.out.println("Player One plays card xx");
	                    		System.out.println("Player Two plays card xx");
                    		}
                    		player *= -1;
                    		warHand.add(p1);
                    		warHand.add(p2);
                    		playerOneHand.reset();
                    		playerTwoHand.reset();
            			}
            			roundWin = warOne(p1, p2);
            			//Adds all the warHand cards to player 1
            			if (roundWin == 1)	{
            				System.out.println("Player One Wins the war! Huzzah!!!!");
            				for (Card cTemp : warHand)	{
            					playerOneHand.addCard(cTemp);
            				}
            			}
            			//For player 2
            			else if (roundWin == -1)	{
            				System.out.println("Player Two Wins the war! Huzzah!!!!");
            				for (Card cTemp : warHand)	{
            					playerTwoHand.addCard(cTemp);
            				}
            			}
            			
            		}//end war while
            		
            		playerOneHand.reset();
            		playerTwoHand.reset();
            		warHand.clear();
            		battleNum--;
            	}
            	System.out.println("Player One's Remaining Cards(" + playerOneHand.howMany() + "):");
            	playerOneHand.display();
            	System.out.println("\n\nPlayer Two's Remaining Cards(" + playerTwoHand.howMany() + "):");
            	playerTwoHand.display();
            	//Display winner
            	if (winner)	{
            		System.out.println("\nPlayer One Wins!");
            	}
            	
            	else if (!winner)	{
            		System.out.println("\nPlayer Two Wins!");
            	}
            	//End display winner
            	
            }//End play the game
            
            //Exit
            else if (userInput == 5)	{
            	break;
            }
            
            else	{
            	System.out.println("Invalid User Input. Enter a valid option (1-5).");
            }
            
		 }	while (keepGoing);
	 }
}
