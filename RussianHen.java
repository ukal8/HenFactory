public class RussianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 2000;
    }

    String getDescription()
    {
        return super.getDescription()+"Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
