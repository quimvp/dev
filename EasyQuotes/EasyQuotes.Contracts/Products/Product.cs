namespace EasyQuotes.Contracts.Products
{
    public class Product(ProductId productId, string description, Supplier supplier, VATRating taxStatus = VATRating.Taxed)
    {
        public ProductId Id {get; init;} = productId;

        public string Description{get; init;} = string.IsNullOrWhiteSpace(description) ? throw new InvalidIDException("") : description.Trim();
        
        public Supplier Supplier {get; init;} = supplier;

        public VATRating TaxStatus {get; init;} = taxStatus;

        public override bool Equals(object? obj)
        {
            if (obj is not Product)
            {
                return false;
            }
            return ((Product)obj).ProductId == Id;
        }
    }

    public enum VATRating:ushort
    {
        ZeroRating=0,
        Taxed = 1
    }

    
}