from iproduct import IProduct


class Product(IProduct):

    def __init__(self, quantity):
        self._quantity = quantity
        self.stores = []

    def add(self, store):
        self.stores.append(store)

    def remove(self, store):
        self.stores.append(store)

    def notify(self):
        for store in self.stores:
            store.update(self)
        print('---------------------------------------')

    @property
    def quantity(self):
        return self._quantity

    @quantity.setter
    def quantity(self, quantity):
        self._quantity = quantity
        self.notify()
