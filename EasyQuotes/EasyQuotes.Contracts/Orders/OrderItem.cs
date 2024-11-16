using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using EasyQuotes.Contracts.Commerce;
using EasyQuotes.Contracts.Products;

namespace EasyQuotes.Contracts.Orders
{
    public class OrderItem(OrderItemId id, Product productOrdered, int quantityOrdered, double taxRatePercentage = 15)
    {
        public OrderItemId Id {get; init;} = id;

        public Product Product {get; init;} = productOrdered;

        public int Quantity {get; init;} = quantityOrdered > 0 ? quantityOrdered : throw new ArgumentException(message:"Quantity must be greater than 0", paramName:nameof(quantityOrdered));

        public double TaxRatePercentage {get; init;} = taxRatePercentage;
        public override int GetHashCode()
        {
            return HashCode.Combine(Id.GetHashCode(), Product.GetHashCode(), Quantity.GetHashCode());
        }

        public override bool Equals(object? obj)
        {
            if (obj is OrderItem orderItem)
            {
                return Id == orderItem.Id && Product == orderItem.Product && Quantity == orderItem.Quantity;
            }
            return false;
        }

        public static bool operator ==(OrderItem left, OrderItem right)
        {
            return left.Equals(right);
        }

        public static bool operator !=(OrderItem left, OrderItem right)
        {
            return !(left == right);
        }

        public Money CalculateTotalExcludingTax()
        {

            return Product.UnitPrice * Quantity;
        }

        public Money CalculateTaxDue()
        {
            if (Product.TaxStatus == VATRating.Taxed)
            {
                var totalPrice = Product.UnitPrice * Quantity;
                var taxedTotal = totalPrice.IncrementByPercent(TaxRatePercentage);
                var taxAmount = taxedTotal - totalPrice;
                return taxAmount;
            }
            return Money.Zero;
        }

        public Money CalculateTotalIncludingTax()
        {
            return CalculateTaxDue() + CalculateTotalExcludingTax();
        }
    }

    public sealed class OrderItemId(long id)
    {
        public long Value {get; init;} = IsValidId(id) ? id: throw new InvalidOrderItemIdException();

        private static readonly long MinIdValue = 202411010001;

        public static readonly OrderItemId Default = new(MinIdValue);

        public override bool Equals(object? obj)
        {
            if (obj is null) return false;
            if (obj is long id1)
            {
                return id1 == Value;
            }
            if (obj is OrderItemId oId)
            {
                return oId.Value == Value;
            }
            return false;
        }

        public override int GetHashCode()
        {
            return Value.GetHashCode();
        }
        
        public static bool operator ==(OrderItemId left, OrderItemId right)
        {
            return left.Equals(right);
        }

        public static bool operator !=(OrderItemId left, OrderItemId right)
        {
            return !(left == right);
        }

        public static implicit operator long(OrderItemId orderItemId)
        {
            if (orderItemId is null)
            {
                return long.MinValue;
            }
            return orderItemId.Value;
        }

        private static bool IsValidId(long theId)
        {
            return theId >= MinIdValue;
        }

    }

    public sealed class InvalidOrderItemIdException(string msg="Given identifier is not valid order item id."): ArgumentException(message: msg);
}