namespace EasyQuotes.Contracts.Products
{
    public class ProductPrice(Product theProduct, Money price, int year)
    {
        public Product Product {get; init;} = theProduct;

        public Money Price {get; init;} = IsValidPrice(price) ? price : throw new InvalidPriceException();

        public int YearOfPricing {get; init;} = year;

        private static bool IsValidPrice(Money thePrice)
        {
            return !thePrice.IsDeficit();
        }

        
    }

    public class InvalidPriceException(string message ="Given Money is not valid as Price."): Exception(message) {}
}