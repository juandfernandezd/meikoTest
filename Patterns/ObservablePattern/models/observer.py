from abc import ABC, abstractmethod


class StoreObserver(ABC):

    @abstractmethod
    def update(self, product):
        pass


class Store(StoreObserver):

    def __init__(self, store_name):
        self._store_name = store_name

    def update(self, product):
        print("Product quantity has been changed to ", product.quantity, ' in ', self._store_name)
