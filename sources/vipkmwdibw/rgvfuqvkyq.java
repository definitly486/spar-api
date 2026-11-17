package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class rgvfuqvkyq extends kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f117229iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f117230ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private float f117231zoijcleaow;

    public rgvfuqvkyq(float f13, float f14) {
        super(null);
        this.f117229iobyxmoadg = f13;
        this.f117231zoijcleaow = f14;
        this.f117230ppxfxbqfkf = 2;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public void eablkybsjg(int i13, float f13) {
        if (i13 == 0) {
            this.f117229iobyxmoadg = f13;
        } else {
            if (i13 != 1) {
                return;
            }
            this.f117231zoijcleaow = f13;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof rgvfuqvkyq) {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            if (rgvfuqvkyqVar.f117229iobyxmoadg == this.f117229iobyxmoadg && rgvfuqvkyqVar.f117231zoijcleaow == this.f117231zoijcleaow) {
                return true;
            }
        }
        return false;
    }

    public final float gxszxtbevo() {
        return this.f117229iobyxmoadg;
    }

    public int hashCode() {
        return (Float.hashCode(this.f117229iobyxmoadg) * 31) + Float.hashCode(this.f117231zoijcleaow);
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public float iobyxmoadg(int i13) {
        if (i13 == 0) {
            return this.f117229iobyxmoadg;
        }
        if (i13 != 1) {
            return 0.0f;
        }
        return this.f117231zoijcleaow;
    }

    public final float lqeggnwhkg() {
        return this.f117231zoijcleaow;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public rgvfuqvkyq ppxfxbqfkf() {
        return new rgvfuqvkyq(0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f117229iobyxmoadg + ", v2 = " + this.f117231zoijcleaow;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public void wkgbmnqykc() {
        this.f117229iobyxmoadg = 0.0f;
        this.f117231zoijcleaow = 0.0f;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public int zoijcleaow() {
        return this.f117230ppxfxbqfkf;
    }
}
