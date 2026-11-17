package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class ojitshcjhn extends kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f117195iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f117196zoijcleaow;

    public ojitshcjhn(float f13) {
        super(null);
        this.f117195iobyxmoadg = f13;
        this.f117196zoijcleaow = 1;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public void eablkybsjg(int i13, float f13) {
        if (i13 == 0) {
            this.f117195iobyxmoadg = f13;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ojitshcjhn) && ((ojitshcjhn) obj).f117195iobyxmoadg == this.f117195iobyxmoadg;
    }

    public final float gxszxtbevo() {
        return this.f117195iobyxmoadg;
    }

    public int hashCode() {
        return Float.hashCode(this.f117195iobyxmoadg);
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public float iobyxmoadg(int i13) {
        if (i13 == 0) {
            return this.f117195iobyxmoadg;
        }
        return 0.0f;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public ojitshcjhn ppxfxbqfkf() {
        return new ojitshcjhn(0.0f);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f117195iobyxmoadg;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public void wkgbmnqykc() {
        this.f117195iobyxmoadg = 0.0f;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public int zoijcleaow() {
        return this.f117196zoijcleaow;
    }
}
