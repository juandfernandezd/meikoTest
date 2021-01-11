from observer import Store
from product import Product

product = Product(10)
product.add(Store('Tennis'))
product.add(Store('Gucci'))

product.quantity = 10
product.quantity = 14