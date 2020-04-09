public class BonusMilesService {
    public int calculate(int price){
        int bonusMile = 20;
        int miles = price / bonusMile;
        return miles;
    }
}
