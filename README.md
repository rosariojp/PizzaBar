# PizzaBar
* Pizza Bar Simulator using Multithreading
* Java Concurrent Multithreading practice

#### Pizza Builder
Create your own pizza
```
Pizza pizza = new Pizza.Builder().setCrust(Crust.REGULAR).addTopping(Topping.BELLPEPPERS).addTopping(Topping.OLIVES).addTopping(Topping.TOMATOES).build()
```
#### Execution Output
```
**** PIZZA BAR is OPEN ****
Ready to take orders.
[RECEIVED] ID=2, Order=Regular Crust Pizza with Bell Peppers, Olives and Tomatoes, Customer=Eddy Dayag
[RECEIVED] ID=1, Order=Thin Crust Pizza with Mozzarella and Pineapple, Customer=Juan Dela Cruz
ID=2, Preparing -> Regular Crust
ID=1, Preparing -> Thin Crust
ID=2, Putting toppings -> Bell Peppers, Olives, Tomatoes
ID=1, Putting toppings -> Mozzarella, Pineapple
ID=1, Baking -> Thin Crust Pizza with Mozzarella and Pineapple
ID=2, Baking -> Regular Crust Pizza with Bell Peppers, Olives and Tomatoes
[DONE] Hand over Regular Crust Pizza with Bell Peppers, Olives and Tomatoes order to Eddy Dayag
[DONE] Hand over Thin Crust Pizza with Mozzarella and Pineapple order to Juan Dela Cruz
[RECEIVED] ID=3, Order=Thin Crust Pizza with Bacon, Salami and Ham, Customer=Richard Guevarra
[RECEIVED] ID=4, Order=Stuffed Crust Pizza with Onions, Mushrooms and Spinach, Customer=Katrina Gatdula
ID=3, Preparing -> Thin Crust
ID=4, Preparing -> Stuffed Crust
ID=4, Putting toppings -> Onions, Mushrooms, Spinach
ID=3, Putting toppings -> Bacon, Salami, Ham
ID=4, Baking -> Stuffed Crust Pizza with Onions, Mushrooms and Spinach
ID=3, Baking -> Thin Crust Pizza with Bacon, Salami and Ham
[DONE] Hand over Stuffed Crust Pizza with Onions, Mushrooms and Spinach order to Katrina Gatdula
[DONE] Hand over Thin Crust Pizza with Bacon, Salami and Ham order to Richard Guevarra
[RECEIVED] ID=5, Order=Stuffed Crust Pizza with Mozzarella and Pineapple, Customer=Casey Trinidad
ID=5, Preparing -> Stuffed Crust
ID=5, Putting toppings -> Mozzarella, Pineapple

```
