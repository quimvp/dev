namespace EasyQuotes.Contracts.Money
{
    public class Money(int cents, string currencyCode="ZAR")
    {
        public int InCents {get; init;} = cents;

        public string Currency {get; init;} = currencyCode;

        public static Money FromParts(int wholePart, int centPart)
        {
            return (wholePart * 100) + (centPart);
        }

        public decimal ToDecimal()
        {
            return Math.Round(InCents/100, 2);
        }

        public bool IsDeficit()
        {
            return InCents < 0;
        }        

        public override string ToString()
        {
            return $"{Currency} {ToDecimal()}";
        }

        public static bool operator ==(Money left, Money right)
        {
            return left.Equals(right);
        }

        public static bool operator !=(Money left, Money right)
        {
            return !left.Equals(right);
        }

        public static bool operator <(Money left, Money right)
        {
            return left.InCents < right.InCents;
        }

        public static bool operator >(Money left, Money right)
        {
            return left.InCents > right.InCents;
        }

        public static bool operator >=(Money left, Money right)
        {
            return left.InCents >= right.InCents;
        }

        public static bool operator <=(Money left, Money right)
        {
            return left.InCents <= right.InCents;
        }

        public static Money operator +(Money left, Money right)
        {
            return new(left.InCents + right.InCents);
        }

        public static Money operator -(Money left, Money right)
        {
            return new(left.InCents - right.InCents);
        }
    }

    //public enum CurrencyCode:u
}