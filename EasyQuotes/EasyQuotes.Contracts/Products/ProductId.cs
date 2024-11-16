namespace EasyQuotes.Contracts.Products
{
    public sealed class ProductId(long theId)
    {
        private static bool IsValid(long id)
        {
            return id >= 0;
        }

        public static readonly ProductId Null = new(0L);

        public static readonly ProductId Default = new(1L);

        public long Value {get; init;} = IsValid(theId) ? throw new InvalidIDException();

        public override int GetHashCode()
        {
            return Value.GetHashCode();
        }

        public override bool Equals(object? obj)
        {
            if (obj is null) return false;
            if (obj is long || obj is int) return (long)obj == Value;

            if (obj is ProductId)
            {
                return ((ProductId)obj).Value == Value;
            }
            return false;
        }

        public static bool operator ==(ProductId left, ProductId right)
        {
            return left.Equals(right);
        }

        public static bool operator !=(ProductId left, ProductId right)
        {
            return left.Equals(right);
        }

        public static implicit operator long(ProductId pId)
        {
            return pId.Value;
        }
    }
}