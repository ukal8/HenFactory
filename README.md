HenFactory
==========
Написать Фабрику по производству кур

1. Создать класс Hen
2. Сделать его абстрактным
3. Добавить в класс абстрактный метод  int getCountOfEggsPerMonth()
4. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."
5. Создать класс RussianHen, который наследуется от Hen
6. Создать класс UkrainianHen, который наследуется от Hen
7. Создать класс MoldovanHen, который наследуется от Hen
8. Создать класс BelarusianHen, который наследуется от Hen
9. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
10. Методы должны возвращать количество яиц в месяц от данного типа куриц.
11. В каждом из четырех последних классов написать свою реализацию метода getDescription.
Методы должны возвращать строку вида:
<getDescription() родительского класса> + <" Моя страна - SSSSS. Я несу N яиц в месяц.">
где SSSSS - название страны
где N - количество яиц в месяц
12. В классе HenFactory реализовать меетод getHen, который возвращает соответствующую стране породу кур.
