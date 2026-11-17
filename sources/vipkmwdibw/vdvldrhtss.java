package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss extends kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f117321iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f117322ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f117323wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private float f117324zoijcleaow;

    public vdvldrhtss(float f13, float f14, float f15) {
        super(null);
        this.f117321iobyxmoadg = f13;
        this.f117324zoijcleaow = f14;
        this.f117322ppxfxbqfkf = f15;
        this.f117323wkgbmnqykc = 3;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public void eablkybsjg(int i13, float f13) {
        if (i13 == 0) {
            this.f117321iobyxmoadg = f13;
        } else if (i13 == 1) {
            this.f117324zoijcleaow = f13;
        } else {
            if (i13 != 2) {
                return;
            }
            this.f117322ppxfxbqfkf = f13;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof vdvldrhtss) {
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            if (vdvldrhtssVar.f117321iobyxmoadg == this.f117321iobyxmoadg && vdvldrhtssVar.f117324zoijcleaow == this.f117324zoijcleaow && vdvldrhtssVar.f117322ppxfxbqfkf == this.f117322ppxfxbqfkf) {
                return true;
            }
        }
        return false;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public vdvldrhtss ppxfxbqfkf() {
        return new vdvldrhtss(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f117321iobyxmoadg) * 31) + Float.hashCode(this.f117324zoijcleaow)) * 31) + Float.hashCode(this.f117322ppxfxbqfkf);
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public float iobyxmoadg(int i13) {
        if (i13 == 0) {
            return this.f117321iobyxmoadg;
        }
        if (i13 == 1) {
            return this.f117324zoijcleaow;
        }
        if (i13 != 2) {
            return 0.0f;
        }
        return this.f117322ppxfxbqfkf;
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f117321iobyxmoadg + ", v2 = " + this.f117324zoijcleaow + ", v3 = " + this.f117322ppxfxbqfkf;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public void wkgbmnqykc() {
        this.f117321iobyxmoadg = 0.0f;
        this.f117324zoijcleaow = 0.0f;
        this.f117322ppxfxbqfkf = 0.0f;
    }

    @Override // vipkmwdibw.kcexrzcfyt
    public int zoijcleaow() {
        return this.f117323wkgbmnqykc;
    }
}
