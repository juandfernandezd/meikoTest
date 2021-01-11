from abc import ABC, abstractmethod


class IProduct(ABC):

    @abstractmethod
    def add(self, store):
        pass

    @abstractmethod
    def remove(self, store):
        pass

    @abstractmethod
    def notify(self):
        pass
