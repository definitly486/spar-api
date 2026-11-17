package i;

/* JADX INFO: loaded from: classes.dex */
public final class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f41581iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f41582zoijcleaow;

    public ylkuphrtab(float f13, float f14) {
        this.f41581iobyxmoadg = f13;
        this.f41582zoijcleaow = f14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylkuphrtab)) {
            return false;
        }
        ylkuphrtab ylkuphrtabVar = (ylkuphrtab) obj;
        return Float.compare(this.f41581iobyxmoadg, ylkuphrtabVar.f41581iobyxmoadg) == 0 && Float.compare(this.f41582zoijcleaow, ylkuphrtabVar.f41582zoijcleaow) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f41581iobyxmoadg) * 31) + Float.hashCode(this.f41582zoijcleaow);
    }

    public final float iobyxmoadg() {
        return this.f41581iobyxmoadg;
    }

    public final float[] ppxfxbqfkf() {
        float f13 = this.f41581iobyxmoadg;
        float f14 = this.f41582zoijcleaow;
        return new float[]{f13 / f14, 1.0f, ((1.0f - f13) - f14) / f14};
    }

    public String toString() {
        return "WhitePoint(x=" + this.f41581iobyxmoadg + ", y=" + this.f41582zoijcleaow + ')';
    }

    public final float zoijcleaow() {
        return this.f41582zoijcleaow;
    }
}
