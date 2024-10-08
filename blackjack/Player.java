

/**
 *
 * @author jasseldoong
 */
public class Player {
    private String name;
    private Hand hand;
    
    public Player(String name) {
        this.name = name;
        hand = new Hand();
    }
    
    public void addCard(Card card) {
        hand.addCard(card);
    }
    
    public int getSum() {
        return hand.getSum(); //hand.getSum();
    }
    
    public boolean isBust() {
        return hand.isBust();
    }
    
    public String getName() {
        return name;
    }
    
    public Hand getHand() {
        return hand;
    }
    
	@Override
    public String toString() {
        return name + "'s hand: " + hand;
    }
    
}
