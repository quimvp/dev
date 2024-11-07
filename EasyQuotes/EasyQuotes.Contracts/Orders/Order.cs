using EasyQuotes.Contracts.Products;

namespace EasyQuotes.Contracts.Orders
{
    public class Order(OrderId orderId, Product productOrdered, int quantity)
    {
        public OrderId Id {get; init;} = orderId;

        public Product OrderedProduct{get; init;} = productOrdered;

        public int Quantity {get; init;} = quantity > 0 ? quantity : throw new InvalidQuantityException();

        //public OrderStatus Status {get; init;} = status;

        public Money GetLineTotal()
        {
            return new Money(OrderedProduct.PriceEach);
        }
    }

    public enum OrderStatus:ushort
    {
        Pending = 0,
        Fulfilled = 1,
        Canceled = 2
    }

    public class InvalidQuantityException(string message="Specified quantity is not valid."):Exception(message)
    {}
}