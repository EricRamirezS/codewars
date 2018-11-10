namespace Kata {
  using System;
  using System.Collections.Generic;
  public class Kata{

    public static string RPSLP(string player1, string player2){
      List<String> validNames = new List<String>(new String[]{"scissor", "paper", "rock", "lizard", "spock"});
	  if(player1==null || player2==null)return "Oh, Unknown Thing";
      int p1 = validNames.IndexOf(player1.ToLower());
		  int p2 = validNames.IndexOf(player2.ToLower());
		  if(!(p1>-1 && p2>-1))return "Oh, Unknown Thing";
		  if(p1==p2) return "Draw!";
		  switch(p1){
			  case 0: if(p2==1 || p2==3) return "Player 1 won!"; else return "Player 2 won!";
			  case 1: if(p2==2 || p2==4) return "Player 1 won!"; else return "Player 2 won!";
			  case 2: if(p2==3 || p2==0) return "Player 1 won!"; else return "Player 2 won!";
			  case 3: if(p2==4 || p2==1) return "Player 1 won!"; else return "Player 2 won!";
        default: if(p2==0 || p2==2) return "Player 1 won!"; else return "Player 2 won!";
      }

    }
  }
}