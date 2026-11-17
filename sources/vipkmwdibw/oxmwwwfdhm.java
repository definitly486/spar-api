package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class oxmwwwfdhm extends kcexrzcfyt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f117202eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f117203iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f117204ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float f117205wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private float f117206zoijcleaow;

    public oxmwwwfdhm(float f13, float f14, float f15, float f16) {
        super(null);
        this.f117203iobyxmoadg = f13;
        this.f117206zoijcleaow = f14;
        this.f117204ppxfxbqfkf = f15;
        this.f117205wkgbmnqykc = f16;
        this.f117202eablkybsjg = 4;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public oxmwwwfdhm ppxfxbqfkf() {
        return new oxmwwwfdhm(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final float dxjokdxxww() {
        return this.f117205wkgbmnqykc;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public void eablkybsjg(int i13, float f13) {
        if (i13 == 0) {
            this.f117203iobyxmoadg = f13;
            return;
        }
        if (i13 == 1) {
            this.f117206zoijcleaow = f13;
        } else if (i13 == 2) {
            this.f117204ppxfxbqfkf = f13;
        } else {
            if (i13 != 3) {
                return;
            }
            this.f117205wkgbmnqykc = f13;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof oxmwwwfdhm) {
            oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) obj;
            if (oxmwwwfdhmVar.f117203iobyxmoadg == this.f117203iobyxmoadg && oxmwwwfdhmVar.f117206zoijcleaow == this.f117206zoijcleaow && oxmwwwfdhmVar.f117204ppxfxbqfkf == this.f117204ppxfxbqfkf && oxmwwwfdhmVar.f117205wkgbmnqykc == this.f117205wkgbmnqykc) {
                return true;
            }
        }
        return false;
    }

    public final float gxszxtbevo() {
        return this.f117203iobyxmoadg;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f117203iobyxmoadg) * 31) + Float.hashCode(this.f117206zoijcleaow)) * 31) + Float.hashCode(this.f117204ppxfxbqfkf)) * 31) + Float.hashCode(this.f117205wkgbmnqykc);
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public float iobyxmoadg(int i13) {
        if (i13 == 0) {
            return this.f117203iobyxmoadg;
        }
        if (i13 == 1) {
            return this.f117206zoijcleaow;
        }
        if (i13 == 2) {
            return this.f117204ppxfxbqfkf;
        }
        if (i13 != 3) {
            return 0.0f;
        }
        return this.f117205wkgbmnqykc;
    }

    public final float lqeggnwhkg() {
        return this.f117206zoijcleaow;
    }

    public final float nufgyqmvbu() {
        return this.f117204ppxfxbqfkf;
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f117203iobyxmoadg + ", v2 = " + this.f117206zoijcleaow + ", v3 = " + this.f117204ppxfxbqfkf + ", v4 = " + this.f117205wkgbmnqykc;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public void wkgbmnqykc() {
        this.f117203iobyxmoadg = 0.0f;
        this.f117206zoijcleaow = 0.0f;
        this.f117204ppxfxbqfkf = 0.0f;
        this.f117205wkgbmnqykc = 0.0f;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public int zoijcleaow() {
        return this.f117202eablkybsjg;
    }
}
