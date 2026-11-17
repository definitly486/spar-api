package x;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww implements gxszxtbevo {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f120811zoijcleaow;

    public dxjokdxxww(float f13) {
        this.f120811zoijcleaow = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxjokdxxww) && Float.compare(this.f120811zoijcleaow, ((dxjokdxxww) obj).f120811zoijcleaow) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f120811zoijcleaow);
    }

    @Override // x.gxszxtbevo
    public long iobyxmoadg(long j13, long j14) {
        float f13 = this.f120811zoijcleaow;
        return wypolnanlu.zoijcleaow((((long) Float.floatToRawIntBits(f13)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f13))));
    }

    public String toString() {
        return "FixedScale(value=" + this.f120811zoijcleaow + ')';
    }
}
