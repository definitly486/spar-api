package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class wizcaqwiak implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f6076iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f6077ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f6078zoijcleaow;

    public wizcaqwiak(wkgbmnqykc wkgbmnqykcVar, int i13) {
        this.f6076iobyxmoadg = wkgbmnqykcVar;
        this.f6078zoijcleaow = i13;
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void clear() {
        jyumaefscl.zdlpuopuiu("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void dxjokdxxww() {
        this.f6076iobyxmoadg.dxjokdxxww();
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void eablkybsjg(int i13, Object obj) {
        this.f6076iobyxmoadg.eablkybsjg(i13 + (this.f6077ppxfxbqfkf == 0 ? this.f6078zoijcleaow : 0), obj);
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void gtknphoqwx() {
        if (!(this.f6077ppxfxbqfkf > 0)) {
            jyumaefscl.zdlpuopuiu("OffsetApplier up called with no corresponding down");
        }
        this.f6077ppxfxbqfkf--;
        this.f6076iobyxmoadg.gtknphoqwx();
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public Object iobyxmoadg() {
        return this.f6076iobyxmoadg.iobyxmoadg();
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void lqeggnwhkg(int i13, Object obj) {
        this.f6076iobyxmoadg.lqeggnwhkg(i13 + (this.f6077ppxfxbqfkf == 0 ? this.f6078zoijcleaow : 0), obj);
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void nufgyqmvbu(Object obj) {
        this.f6077ppxfxbqfkf++;
        this.f6076iobyxmoadg.nufgyqmvbu(obj);
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void ppxfxbqfkf(int i13, int i14, int i15) {
        int i16 = this.f6077ppxfxbqfkf == 0 ? this.f6078zoijcleaow : 0;
        this.f6076iobyxmoadg.ppxfxbqfkf(i13 + i16, i14 + i16, i15);
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void wkgbmnqykc(tg.rgvfuqvkyq rgvfuqvkyqVar, Object obj) {
        this.f6076iobyxmoadg.wkgbmnqykc(rgvfuqvkyqVar, obj);
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void zoijcleaow(int i13, int i14) {
        this.f6076iobyxmoadg.zoijcleaow(i13 + (this.f6077ppxfxbqfkf == 0 ? this.f6078zoijcleaow : 0), i14);
    }
}
