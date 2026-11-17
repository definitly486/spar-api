package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f3257iobyxmoadg = 0;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f3262zoijcleaow = 0;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f3260ppxfxbqfkf = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f3261wkgbmnqykc = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f3255eablkybsjg = 0;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f3256gxszxtbevo = 0;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f3258lqeggnwhkg = false;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f3259nufgyqmvbu = false;

    cllcsxoeiz() {
    }

    public void eablkybsjg(int i13, int i14) {
        this.f3259nufgyqmvbu = false;
        if (i13 != Integer.MIN_VALUE) {
            this.f3255eablkybsjg = i13;
            this.f3257iobyxmoadg = i13;
        }
        if (i14 != Integer.MIN_VALUE) {
            this.f3256gxszxtbevo = i14;
            this.f3262zoijcleaow = i14;
        }
    }

    public void gxszxtbevo(boolean z13) {
        if (z13 == this.f3258lqeggnwhkg) {
            return;
        }
        this.f3258lqeggnwhkg = z13;
        if (!this.f3259nufgyqmvbu) {
            this.f3257iobyxmoadg = this.f3255eablkybsjg;
            this.f3262zoijcleaow = this.f3256gxszxtbevo;
            return;
        }
        if (z13) {
            int i13 = this.f3261wkgbmnqykc;
            if (i13 == Integer.MIN_VALUE) {
                i13 = this.f3255eablkybsjg;
            }
            this.f3257iobyxmoadg = i13;
            int i14 = this.f3260ppxfxbqfkf;
            if (i14 == Integer.MIN_VALUE) {
                i14 = this.f3256gxszxtbevo;
            }
            this.f3262zoijcleaow = i14;
            return;
        }
        int i15 = this.f3260ppxfxbqfkf;
        if (i15 == Integer.MIN_VALUE) {
            i15 = this.f3255eablkybsjg;
        }
        this.f3257iobyxmoadg = i15;
        int i16 = this.f3261wkgbmnqykc;
        if (i16 == Integer.MIN_VALUE) {
            i16 = this.f3256gxszxtbevo;
        }
        this.f3262zoijcleaow = i16;
    }

    public int iobyxmoadg() {
        return this.f3258lqeggnwhkg ? this.f3257iobyxmoadg : this.f3262zoijcleaow;
    }

    public void lqeggnwhkg(int i13, int i14) {
        this.f3260ppxfxbqfkf = i13;
        this.f3261wkgbmnqykc = i14;
        this.f3259nufgyqmvbu = true;
        if (this.f3258lqeggnwhkg) {
            if (i14 != Integer.MIN_VALUE) {
                this.f3257iobyxmoadg = i14;
            }
            if (i13 != Integer.MIN_VALUE) {
                this.f3262zoijcleaow = i13;
                return;
            }
            return;
        }
        if (i13 != Integer.MIN_VALUE) {
            this.f3257iobyxmoadg = i13;
        }
        if (i14 != Integer.MIN_VALUE) {
            this.f3262zoijcleaow = i14;
        }
    }

    public int ppxfxbqfkf() {
        return this.f3262zoijcleaow;
    }

    public int wkgbmnqykc() {
        return this.f3258lqeggnwhkg ? this.f3262zoijcleaow : this.f3257iobyxmoadg;
    }

    public int zoijcleaow() {
        return this.f3257iobyxmoadg;
    }
}
