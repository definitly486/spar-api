package hk;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx extends nufgyqmvbu {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gk.zoijcleaow f40495ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f40496wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(ojitshcjhn writer, gk.zoijcleaow json) {
        super(writer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(writer, "writer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        this.f40495ppxfxbqfkf = json;
    }

    @Override // hk.nufgyqmvbu
    public void ppxfxbqfkf() {
        ojitshcjhn(false);
        gtknphoqwx("\n");
        int i13 = this.f40496wkgbmnqykc;
        for (int i14 = 0; i14 < i13; i14++) {
            gtknphoqwx(this.f40495ppxfxbqfkf.eablkybsjg().agtfadlqog());
        }
    }

    @Override // hk.nufgyqmvbu
    public void rgvfuqvkyq() {
        gxszxtbevo(' ');
    }

    @Override // hk.nufgyqmvbu
    public void vdvldrhtss() {
        this.f40496wkgbmnqykc--;
    }

    @Override // hk.nufgyqmvbu
    public void wkgbmnqykc() {
        if (iobyxmoadg()) {
            ojitshcjhn(false);
        } else {
            ppxfxbqfkf();
        }
    }

    @Override // hk.nufgyqmvbu
    public void zoijcleaow() {
        ojitshcjhn(true);
        this.f40496wkgbmnqykc++;
    }
}
