## Приложение "Miles"

### Краткое описание

На основе технического задания было создано приложение "Miles". 
Приложение высчитывает количество начисленных бонусов за покупку билета. Начисление идет по формуле 1 бонус за 20 потраченных рублей.

Приложение состоит из двух классов:
- Main.java
- BonusMilesService.java

Переменные используемы в приложении:
- price - стоимость билета в рублях;
- bonusMile - количество рублей неоходимых для получения 1 бонуса;
- miles - итоговая сумма бонусов.

### Описание использованных тестов

При тестировании приложения использовалось функциональное тестирование методом эквивалетных значений.

Для проверки были взяты следующие данные для price: 0, 1000, -1000.

### Результаты проверки.

- При price=0 полученный результат miles=0.
- При price=1000 полученный результат miles=500.
- При price=-1000 полученный результат miles=-500.

Приложение проверку прошло


### Общие рекомендации

- реализовать проверку на отрицательное число в price и вывод об этой ошибке.
- в качестве переменных использовать переменные типа float.