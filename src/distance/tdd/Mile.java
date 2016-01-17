package distance.tdd;

public class Mile extends Distance{
    public Mile (int length) {
        _length = length;
    }

    public Mile Add(Distance addition) {
        Mile additionMile = DistanceMetric.ConvertToMile(addition);
        return (Mile)super.Add(additionMile);
    }
}
