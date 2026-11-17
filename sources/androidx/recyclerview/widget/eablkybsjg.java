package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg implements kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final kcexrzcfyt f12982iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    int f12985zoijcleaow = 0;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f12983ppxfxbqfkf = -1;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    int f12984wkgbmnqykc = -1;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    Object f12981eablkybsjg = null;

    public eablkybsjg(kcexrzcfyt kcexrzcfytVar) {
        this.f12982iobyxmoadg = kcexrzcfytVar;
    }

    public void eablkybsjg() {
        int i13 = this.f12985zoijcleaow;
        if (i13 == 0) {
            return;
        }
        if (i13 == 1) {
            this.f12982iobyxmoadg.iobyxmoadg(this.f12983ppxfxbqfkf, this.f12984wkgbmnqykc);
        } else if (i13 == 2) {
            this.f12982iobyxmoadg.zoijcleaow(this.f12983ppxfxbqfkf, this.f12984wkgbmnqykc);
        } else if (i13 == 3) {
            this.f12982iobyxmoadg.ppxfxbqfkf(this.f12983ppxfxbqfkf, this.f12984wkgbmnqykc, this.f12981eablkybsjg);
        }
        this.f12981eablkybsjg = null;
        this.f12985zoijcleaow = 0;
    }

    @Override // androidx.recyclerview.widget.kcexrzcfyt
    public void iobyxmoadg(int i13, int i14) {
        int i15;
        if (this.f12985zoijcleaow == 1 && i13 >= (i15 = this.f12983ppxfxbqfkf)) {
            int i16 = this.f12984wkgbmnqykc;
            if (i13 <= i15 + i16) {
                this.f12984wkgbmnqykc = i16 + i14;
                this.f12983ppxfxbqfkf = Math.min(i13, i15);
                return;
            }
        }
        eablkybsjg();
        this.f12983ppxfxbqfkf = i13;
        this.f12984wkgbmnqykc = i14;
        this.f12985zoijcleaow = 1;
    }

    @Override // androidx.recyclerview.widget.kcexrzcfyt
    public void ppxfxbqfkf(int i13, int i14, Object obj) {
        int i15;
        if (this.f12985zoijcleaow == 3) {
            int i16 = this.f12983ppxfxbqfkf;
            int i17 = this.f12984wkgbmnqykc;
            if (i13 <= i16 + i17 && (i15 = i13 + i14) >= i16 && this.f12981eablkybsjg == obj) {
                this.f12983ppxfxbqfkf = Math.min(i13, i16);
                this.f12984wkgbmnqykc = Math.max(i17 + i16, i15) - this.f12983ppxfxbqfkf;
                return;
            }
        }
        eablkybsjg();
        this.f12983ppxfxbqfkf = i13;
        this.f12984wkgbmnqykc = i14;
        this.f12981eablkybsjg = obj;
        this.f12985zoijcleaow = 3;
    }

    @Override // androidx.recyclerview.widget.kcexrzcfyt
    public void wkgbmnqykc(int i13, int i14) {
        eablkybsjg();
        this.f12982iobyxmoadg.wkgbmnqykc(i13, i14);
    }

    @Override // androidx.recyclerview.widget.kcexrzcfyt
    public void zoijcleaow(int i13, int i14) {
        int i15;
        if (this.f12985zoijcleaow == 2 && (i15 = this.f12983ppxfxbqfkf) >= i13 && i15 <= i13 + i14) {
            this.f12984wkgbmnqykc += i14;
            this.f12983ppxfxbqfkf = i13;
        } else {
            eablkybsjg();
            this.f12983ppxfxbqfkf = i13;
            this.f12984wkgbmnqykc = i14;
            this.f12985zoijcleaow = 2;
        }
    }
}
