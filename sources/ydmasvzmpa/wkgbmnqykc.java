package ydmasvzmpa;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc implements jlmebxxoox {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.rgvfuqvkyq f124618iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private float f124619ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private crxdokpmqz f124620wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f124621zoijcleaow = w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null);

    public wkgbmnqykc(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f124618iobyxmoadg = rgvfuqvkyqVar;
    }

    @Override // ydmasvzmpa.jlmebxxoox
    public crxdokpmqz iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, long j13) {
        if (this.f124620wkgbmnqykc != null && w0.zoijcleaow.gxszxtbevo(this.f124621zoijcleaow, j13) && this.f124619ppxfxbqfkf == wkgbmnqykcVar.getDensity()) {
            crxdokpmqz crxdokpmqzVar = this.f124620wkgbmnqykc;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(crxdokpmqzVar);
            return crxdokpmqzVar;
        }
        this.f124621zoijcleaow = j13;
        this.f124619ppxfxbqfkf = wkgbmnqykcVar.getDensity();
        crxdokpmqz crxdokpmqzVar2 = (crxdokpmqz) this.f124618iobyxmoadg.invoke(wkgbmnqykcVar, w0.zoijcleaow.iobyxmoadg(j13));
        this.f124620wkgbmnqykc = crxdokpmqzVar2;
        return crxdokpmqzVar2;
    }
}
