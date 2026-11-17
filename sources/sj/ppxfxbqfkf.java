package sj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class ppxfxbqfkf extends tj.wkgbmnqykc {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f107038esjtqupxsv = AtomicIntegerFieldUpdater.newUpdater(ppxfxbqfkf.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f107039cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final rj.jyumaefscl f107040iwizpuwonk;

    public /* synthetic */ ppxfxbqfkf(rj.jyumaefscl jyumaefsclVar, boolean z13, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(jyumaefsclVar, z13, (i14 & 4) != 0 ? lg.gtknphoqwx.f62507zdlpuopuiu : btonecajqbVar, (i14 & 8) != 0 ? -3 : i13, (i14 & 16) != 0 ? rj.iobyxmoadg.SUSPEND : iobyxmoadgVar);
    }

    private final void agtfadlqog() {
        if (this.f107039cqumvgiudr && f107038esjtqupxsv.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // tj.wkgbmnqykc, sj.lqeggnwhkg
    public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (this.f110703yggfygwlhe != -3) {
            Object objCollect = super.collect(nufgyqmvbuVar, gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        agtfadlqog();
        Object objPpxfxbqfkf = gtknphoqwx.ppxfxbqfkf(nufgyqmvbuVar, this.f107040iwizpuwonk, this.f107039cqumvgiudr, gxszxtbevoVar);
        return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tj.wkgbmnqykc
    public rj.jyumaefscl draadjrbmk(pj.cllcsxoeiz cllcsxoeizVar) {
        agtfadlqog();
        return this.f110703yggfygwlhe == -3 ? this.f107040iwizpuwonk : super.draadjrbmk(cllcsxoeizVar);
    }

    @Override // tj.wkgbmnqykc
    protected Object eablkybsjg(rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objPpxfxbqfkf = gtknphoqwx.ppxfxbqfkf(new tj.esjtqupxsv(zdlpuopuiuVar), this.f107040iwizpuwonk, this.f107039cqumvgiudr, gxszxtbevoVar);
        return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tj.wkgbmnqykc
    protected tj.wkgbmnqykc gxszxtbevo(lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        return new ppxfxbqfkf(this.f107040iwizpuwonk, this.f107039cqumvgiudr, btonecajqbVar, i13, iobyxmoadgVar);
    }

    @Override // tj.wkgbmnqykc
    public lqeggnwhkg nufgyqmvbu() {
        return new ppxfxbqfkf(this.f107040iwizpuwonk, this.f107039cqumvgiudr, null, 0, null, 28, null);
    }

    @Override // tj.wkgbmnqykc
    protected String ppxfxbqfkf() {
        return "channel=" + this.f107040iwizpuwonk;
    }

    public ppxfxbqfkf(rj.jyumaefscl jyumaefsclVar, boolean z13, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        super(btonecajqbVar, i13, iobyxmoadgVar);
        this.f107040iwizpuwonk = jyumaefsclVar;
        this.f107039cqumvgiudr = z13;
        this.consumed$volatile = 0;
    }
}
