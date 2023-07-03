package polymorphism;

public class SeasonOff extends DiscCalSale{
int cost;
SeasonOff(int cost){
	this.cost=cost;
}
public double discount() {
	double dis=cost*0.15;
	return dis;
}
}
