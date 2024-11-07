namespace EasyQuotes.Contracts.Money
{
    public class Money(int cents, Currency currency = Currency.ZAR)
    {
        public int InCents {get; init;} = cents;

        public Currency Currency {get; init;} = currency;

        public static Money FromParts(int wholePart, int centPar, Currency currency = Currency.ZAR)
        {
            int cents = (wholePart *100) + centPart;
            return new(cents, currency);
        }

        public static Money FromParts(MoneyParts parts, Currency currency = Currency.ZAR)
        {
            return FromParts(parts.WholePart, parts.Cents, currency);
        }

        public decimal ToDecimal()
        {
            return Math.Round(InCents/100m, 2);
        }

        public bool IsDeficit()
        {
            return InCents < 0;
        }        

        public override string ToString()
        {
            return $"{Currency} {ToDecimal()}";
        }

        public override bool Equals(object? obj)
        {
            if (obj is null) return false;
            if (obj is not Money) return false;
            if (obj is Money money1)
            {
                if (money1.Currency != Currency) return false;

                return money1.InCents == InCents;
            }
            return false;
        }

        public override int GetHashCode()
        {
            return InCents.GetHashCode();
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
            ThrowIfDifferentCurrencies(left, right);
            return left.InCents < right.InCents;
        }

        public static bool operator >(Money left, Money right)
        {
            ThrowIfDifferentCurrencies(left, right);
            return left.InCents > right.InCents;
        }

        public static bool operator >=(Money left, Money right)
        {
            ThrowIfDifferentCurrencies(left, right);
            return left.InCents >= right.InCents;
        }

        public static bool operator <=(Money left, Money right)
        {
            ThrowIfDifferentCurrencies(left, right);
            return left.InCents <= right.InCents;

        }

        public static Money operator +(Money left, Money right)
        {
            ThrowIfDifferentCurrencies(left, right);
            return new(left.InCents + right.InCents);
        }

        public static Money operator -(Money left, Money right)
        {
            ThrowIfDifferentCurrencies(left, right);
            return new(left.InCents - right.InCents);
        }


        private void ThrowIfDifferentCurrencies(Money money1, Money money2, string  message="Cannot perform requested operation on monies of different currencies. Convert to same currency first.")
        {
            if (money1.Currency !== money2.Currency)
            {
                throw new InvalidOperationException(message);
            }
        }
    }

    public enum Currency
    {
        ZAR,
        USD,
        EUR
    }

    public readonly struct MoneyParts(int whole, int cents)
    {
        public int WholePart{get;} = whole;

        public int Cents {get;} = cents;
    }
}