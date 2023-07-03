package polymorphism;

public class SeasonOn extends DiscCalSale{
	int cost;
	SeasonOn(int cost){
		this.cost=cost;
	}
public double discount(){
	double dis=cost*0.40;
	return dis;
}
}
