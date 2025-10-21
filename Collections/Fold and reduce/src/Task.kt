// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> = customers.fold(customers.first().getOrderedProducts()) { acc, customer -> acc.intersect(customer.getOrderedProducts()) }

fun Customer.getOrderedProducts(): Set<Product> = orders.flatMap(Order::products).toSet()
