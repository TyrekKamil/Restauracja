class Terminal:
    def __init__(self):
        # array of order objects
        self.orders = []

    def newOrder(self, table):
        # make new order
        pass

    def cancleOrder(self):
        # cancel an order
        pass

    def payForOrder(self, order):
        # begin payment process for a specific order
        pass

    def customOrder(self):
        # create a custom order
        pass


class Order:
    def __init__(self, table, items):
        self.table = table
        self.items = items

    def __str__(self):
        orderStr = 'table ' + str(self.table) + '\n'
        for item in self.items:
            orderStr += '> ' + item.dishName + '\n'

        return orderStr


class MenuItem:
    def __init__(self, dishName, ingredients, price):
        self.dishName = dishName
        self.ingredients = ingredients
        self.price = price

    def __str__(self):
        return self.dishName + ', ' + str(self.price) + ' zł'


class Menu:
    def __init__(self):
        self.menu = []

    def __str__(self):
        printMenu = '>>> MENU <<<\n'
        for dish in self.menu:
            printMenu += '> ' + dish.dishName + ', ' + str(dish.price) + 'zł\n'
        return printMenu

    def addItem(self, menuItem):
        self.menu.append(menuItem)


menu = Menu()

dish1 = MenuItem(
    'Schabowy z ziemniakami i surówką',
    ['kotlet schabowy', 'ziemniaki', 'surówka'],
    15.99
)

dish2 = MenuItem(
    'Rosół',
    ['kurczak', 'wołowina', 'marchewka'],
    9.99
)

dish3 = MenuItem(
    'Hamburger z Frytkami',
    ['wołowina', 'ser', 'sałata', 'pomidor', 'bułka pszenna/sezamowa/graham', ],
    15.99
)

drink1 = MenuItem(
    'CocaCola',
    [],
    2.99
)

menu.addItem(dish1)
menu.addItem(dish2)
menu.addItem(dish3)
menu.addItem(drink1)

order1 = Order(12, [dish1, drink1])


print(order1)
