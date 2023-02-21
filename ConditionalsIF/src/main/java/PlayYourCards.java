import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class PlayYourCards {
    public Map <String, Integer> map = Map.of(
            "ace", 11,
            "two", 2,
            "three", 3,
            "four", 4,
            "five", 5,
            "six", 6,
            "seven", 7,
            "eight", 8,
            "nine", 9
    );
    private HashSet <String> faceCards = new HashSet<>(Arrays.asList("ten", "jack", "queen", "king"));

    private final String stand = "s";
    private final String hit = "h";
    private final String split = "p";
    private final String win = "w";

    public int parseCard(String card) {
        if(faceCards.contains(card)) return 10;
        else
            return map.get(card);
        /*switch (card){
            case "ace": return 11;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
            case "five": return 5;
            case "six": return 6;
            case "seven": return 7;
            case "eight": return 8;
            case "nine": return 9;
            case "ten":
            case "jack":
            case "king":
            case "queen":
                return 10;
            default: return 0;
        }*/


    }

    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(!isBlackjack) return split;
        if(dealerScore == 10 || dealerScore == 11 )
            return stand;
        else
            return win;

    }

    public String smallHand(int handScore, int dealerScore) {
        if(handScore >= 17)
            return stand;
        else if( handScore <= 11)
            return hit;
        else if(dealerScore < 7)
            return stand;
        else return hit;
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }

}
