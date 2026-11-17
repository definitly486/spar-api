package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk extends androidx.media3.exoplayer.source.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private v2.kcexrzcfyt f11118dxjokdxxww;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final long f11119nufgyqmvbu;

    public static final class zoijcleaow implements oxmwwwfdhm.iobyxmoadg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final long f11120ppxfxbqfkf;

        public zoijcleaow(long j13, btonecajqb btonecajqbVar) {
            this.f11120ppxfxbqfkf = j13;
        }

        @Override // androidx.media3.exoplayer.source.oxmwwwfdhm.iobyxmoadg
        public oxmwwwfdhm.iobyxmoadg eablkybsjg(i3.gtknphoqwx gtknphoqwxVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.oxmwwwfdhm.iobyxmoadg
        public oxmwwwfdhm.iobyxmoadg gxszxtbevo(androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.oxmwwwfdhm.iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public draadjrbmk wkgbmnqykc(v2.kcexrzcfyt kcexrzcfytVar) {
            return new draadjrbmk(kcexrzcfytVar, this.f11120ppxfxbqfkf, null);
        }
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public synchronized void btonecajqb(v2.kcexrzcfyt kcexrzcfytVar) {
        this.f11118dxjokdxxww = kcexrzcfytVar;
    }

    @Override // androidx.media3.exoplayer.source.iobyxmoadg
    protected void esjtqupxsv(b3.wflxmlrfwp wflxmlrfwpVar) {
        lereixgezr(new m3.zdlpuopuiu(this.f11119nufgyqmvbu, true, false, false, null, ppxfxbqfkf()));
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public void lqeggnwhkg(vdvldrhtss vdvldrhtssVar) {
        ((gtknphoqwx) vdvldrhtssVar).wflxmlrfwp();
    }

    @Override // androidx.media3.exoplayer.source.iobyxmoadg
    protected void pmvmpeiblj() {
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public synchronized v2.kcexrzcfyt ppxfxbqfkf() {
        return this.f11118dxjokdxxww;
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public vdvldrhtss rgvfuqvkyq(oxmwwwfdhm.zoijcleaow zoijcleaowVar, p3.zoijcleaow zoijcleaowVar2, long j13) {
        v2.kcexrzcfyt kcexrzcfytVarPpxfxbqfkf = ppxfxbqfkf();
        y2.iobyxmoadg.eablkybsjg(kcexrzcfytVarPpxfxbqfkf.f115398zoijcleaow);
        y2.iobyxmoadg.gxszxtbevo(kcexrzcfytVarPpxfxbqfkf.f115398zoijcleaow.f115490zoijcleaow, "Externally loaded mediaItems require a MIME type.");
        v2.kcexrzcfyt.nufgyqmvbu nufgyqmvbuVar = kcexrzcfytVarPpxfxbqfkf.f115398zoijcleaow;
        return new gtknphoqwx(nufgyqmvbuVar.f115485iobyxmoadg, nufgyqmvbuVar.f115490zoijcleaow, null);
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm
    public void wflxmlrfwp() {
    }

    private draadjrbmk(v2.kcexrzcfyt kcexrzcfytVar, long j13, btonecajqb btonecajqbVar) {
        this.f11118dxjokdxxww = kcexrzcfytVar;
        this.f11119nufgyqmvbu = j13;
    }
}
