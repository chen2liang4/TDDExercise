package distance.tdd;

import java.lang.reflect.Constructor;

public abstract class Distance {
    protected int _length;

    public int getLength() {
        return _length;
    }

    public boolean equals (Distance compareTo) {
        return DistanceMetric.Compare(this, compareTo);
    }

    public Distance Add(Distance addition){
        assert this.getClass() == addition.getClass();
        Distance rlt = null;
        try {
            Constructor cons = Class.forName(addition.getClass().getName()).getConstructor(int.class);//Mile.class.getConstructor(int.class);// this.getClass().getConstructor();//.getConstructor(int.class);
            int length = this.getLength() + addition.getLength();
            rlt = (Distance)cons.newInstance(length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rlt;
    }
}
