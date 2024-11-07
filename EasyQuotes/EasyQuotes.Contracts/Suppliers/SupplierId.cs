namespace EasyQuotes.Contracts.Suppliers
{
    public sealed class SupplierId(long tin)
    {
        private bool IsValidId(long id)
        {
            if (tin <=0) return false;
            return tin >= 10000000L;
        } 

        public long Value {get; init;} = IsValidId(tin) ? tin : throw new InvalidIDException("Given id is  not valid TIN.");

        public override int GetHashCode()
        {
            return Value.GetHashCode();
        }

        public override bool Equals(object? obj)
        {
            if (obj is null) return false;
            if (obj is int || obj is long) return (long)obj == Value;
            if (obj is SupplierId supplier)
            {
                return supplier.Value == Value;
            }
            return base.Equals(obj);
        }

        public override string ToString()
        {
            return $"SupplierID: {Value}";
        }

        public static bool operator ==(SupplierId left, SupplierId right)
        {
            return left.Equals(right);
        }

        public static bool operator !=(SupplierId left, SupplierId right)
        {
            return left.Equals(right);
        }

        
    }
}