

/**
 *
 * @author jasseldoong
 */
public class Dealer extends Player {
    private Card hiddenCard;
    
    public Dealer(String name) {
        super(name);
    }
    
    public void setHiddenCard(Card card) {
        hiddenCard = card;
        addCard(card);
    }
	
	public Card getHiddenCard() {
		return hiddenCard;
	}
    
//    public void makeMove(Deck deck, OutputHandler outputHandler) {
//        while (getSum() < 17) {
//            Card newCard = deck.dealCard();
//            addCard(newCard);
//        }
//        outputHandler.revealHiddenCard(hiddenCard);
//    }
    
//    @Override
//    public String toString() {
//        return "Dealer's hand: "+ getHand();
//	}
}
