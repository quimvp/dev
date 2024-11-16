using EasyQuotes.Contracts.Products;
using EasyQuotes.Contracts.Clients;
using EasyQuotes.Contracts.Commerce;

namespace EasyQuotes.Contracts.Orders
{
    public class Order(OrderId orderId, 
    Client forClient,
    ICollection<OrderItem> orderItems,
    DateTime dateOfOrder, 
    OrderStatus orderStatus = OrderStatus.Pending)
    {
        public OrderId Id {get; init;} = orderId;

        public IReadOnlyCollection<OrderItem> OrderItems {get; init;} = orderItems.AsEnumerable().ToArray();

        public DateTime DateOfOrder {get; init;} = dateOfOrder;

        public Client Client {get; init;} = forClient;

        public OrderStatus OrderStatus {get; init;} = orderStatus;

        public Money CalculateTaxTotal()
        {
            Money taxTotal = Money.Zero;
            foreach (var orderItem in OrderItems)
            {
                taxTotal += orderItem.CalculateTaxDue();
            }
            return taxTotal;
        }

        public Money CalculateOrderTotalExcludingTax()
        {
            Money total = Money.Zero;
            foreach (var orderItem in OrderItems)
            {
                total += orderItem.CalculateTotalExcludingTax();
            }
            return total;
        }

        public Money CalculateOrderTotalIncludingTax()
        {
            return CalculateOrderTotalExcludingTax() + CalculateTaxTotal();
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