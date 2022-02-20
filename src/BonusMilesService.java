public class BonusMilesService {
    public int calculate(int ticketAmount){
        int bonusConst = 20;    // Переменная для хранения количества рублей для одной бонусной мили
        int passengersBonus = ticketAmount/bonusConst; // Рассчитываем количество бонусных миль
        return passengersBonus;

    }
}
