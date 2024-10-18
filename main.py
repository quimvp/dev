import math

def decimalToBinary(num):
    if num >= 1:
        decimalToBinary(num // 2)

    print(num % 2, end='')


def binaryToDecimal(binString, /, display):
    values = []
    binString = binString[::-1]
    for i in range(len(binString)):
        if binString[i] == '1':
            values.append(2**i)
    if display:
        print(sum(values))
    else:

        return sum(values)


def floating_point(bin_string,shift):
    shift = (bin_string.index(".") ) + shift  
    bin_string = bin_string.replace(".","")
    bin_string = list(bin_string)
    bin_string.insert(shift,".")
    print(bin_string)

    bin_string = "".join(x for x in bin_string).split(".")
    denary_bin = binaryToDecimal(bin_string[0], display=False)
    decimal_bin = sum([
        x[1] for x in [(k, float(v) * float(pow(2,-(k+1))) )
                       for k, v in enumerate(bin_string[1]) if int(v) == 1]])

    res = float(denary_bin) + decimal_bin

    return res


print(floating_point("0.0001",2))
