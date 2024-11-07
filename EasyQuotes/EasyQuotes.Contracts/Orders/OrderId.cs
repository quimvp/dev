namespace EasyQuotes.Contracts.Orders
{
    public sealed class OrderId(long id)
    {
        private static bool IsValidId(long idValue)
        {
            return idValue >= 0L;
        }

        public static readonly OrderId Null = new(0L);

        public static readonly OrderId Default = new(1L);

        public long Value {get; init;} = IsValidId(id) ? id : throw new InvalidIDException();

        public override bool Equals(object? obj)
        {
            if (obj is null) return false;
            if (obj is int || obj is long) return (long)obj == Value;
            if (obj is OrderId id1)
            {
                return id1.Value == Value;
            }
            return base.Equals(obj);
        }

        public static bool operator ==(OrderId left, OrderId right)
        {
            return left.Equals(right);
        }

        public static bool operator !=(OrderId left, OrderId right)
        {
            return !left.Equals(right);
        }

        public override int GetHashCode()
        {
            return Value.GetHashCode();
        }
    }

    public class InvalidIDException(string message="Given value is not valid for this id."): Exception(message)
    {

    }
}