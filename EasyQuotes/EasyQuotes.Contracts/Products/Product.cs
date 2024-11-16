using System.Numerics;
using EasyQuotes.Contracts.Commerce;
using EasyQuotes.Contracts.Suppliers;

namespace EasyQuotes.Contracts.Products
{
    public class Product(ProductId productId, string description, Money priceEach, Supplier supplier, VATRating taxStatus = VATRating.Taxed)
    {
        public ProductId Id {get; init;} = productId;

        public string Description{get; init;} = string.IsNullOrWhiteSpace(description) ? throw new ArgumentException("Product description cannot be empty!") : description.Trim();
        
        public Supplier Supplier {get; init;} = supplier;

        public VATRating TaxStatus {get; init;} = taxStatus;

        public Money UnitPrice {get; init;} = priceEach;

        public override bool Equals(object? obj)
        {
            if (obj is not Product)
            {
                return false;
            }
            return ((Product)obj).Id == Id;
        }

        public override int GetHashCode()
        {
            return HashCode.Combine(Id.GetHashCode(), 
            Description.GetHashCode(),
            Supplier.GetHashCode(),
            UnitPrice.GetHashCode(), TaxStatus.GetHashCode());
        }

        public static bool operator ==(Product left, Product right)
        {
            return left.Equals(right);
        }

        public static bool operator !=(Product left, Product right)
        {
            return !(left == right);
        }
    }

    public enum VATRating:ushort
    {
        ZeroRating=0,
        Taxed = 1
    }

    
}