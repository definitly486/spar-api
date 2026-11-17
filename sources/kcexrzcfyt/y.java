package kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
class y implements lereixgezr.auzgnhcxok {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f55064iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f55065ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float f55066wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f55067zoijcleaow;

    y(float f13, float f14) {
        this.f55067zoijcleaow = f13;
        this.f55065ppxfxbqfkf = f14;
    }

    private float eablkybsjg(float f13) {
        float f14 = this.f55067zoijcleaow;
        float f15 = this.f55065ppxfxbqfkf;
        if (f14 == f15) {
            return 0.0f;
        }
        if (f13 == f14) {
            return 1.0f;
        }
        if (f13 == f15) {
            return 0.0f;
        }
        float f16 = 1.0f / f15;
        return ((1.0f / f13) - f16) / ((1.0f / f14) - f16);
    }

    void gxszxtbevo(float f13) {
        if (f13 <= this.f55067zoijcleaow && f13 >= this.f55065ppxfxbqfkf) {
            this.f55064iobyxmoadg = f13;
            this.f55066wkgbmnqykc = eablkybsjg(f13);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f13 + " is not within valid range [" + this.f55065ppxfxbqfkf + " , " + this.f55067zoijcleaow + "]");
    }

    @Override // lereixgezr.auzgnhcxok
    public float iobyxmoadg() {
        return this.f55067zoijcleaow;
    }

    @Override // lereixgezr.auzgnhcxok
    public float ppxfxbqfkf() {
        return this.f55065ppxfxbqfkf;
    }

    @Override // lereixgezr.auzgnhcxok
    public float wkgbmnqykc() {
        return this.f55064iobyxmoadg;
    }

    @Override // lereixgezr.auzgnhcxok
    public float zoijcleaow() {
        return this.f55066wkgbmnqykc;
    }
}
