package distance.tdd;

public class Yard extends Distance{
    public Yard(int length) {
        _length = length;
    }

    public Yard Add(Distance addition) {
        Yard additionYard = DistanceMetric.ConvertToYard(addition);
        return (Yard)super.Add(additionYard);
    }
}
