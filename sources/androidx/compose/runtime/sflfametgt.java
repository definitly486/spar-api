package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class sflfametgt implements u, pj.hcddaimhww {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private pj.auzgnhcxok f5935iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final pj.cllcsxoeiz f5936jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final tg.rgvfuqvkyq f5937yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lg.btonecajqb f5938zdlpuopuiu;

    public sflfametgt(lg.btonecajqb btonecajqbVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f5938zdlpuopuiu = btonecajqbVar;
        this.f5937yggfygwlhe = rgvfuqvkyqVar;
        this.f5936jyumaefscl = pj.dsvhmnatus.iobyxmoadg(btonecajqbVar.plus(btonecajqbVar.get(krqnebusok.nufgyqmvbu.f60489yggfygwlhe) != null ? this : lg.gtknphoqwx.f62507zdlpuopuiu));
    }

    @Override // androidx.compose.runtime.u
    public void eablkybsjg() {
        pj.auzgnhcxok auzgnhcxokVar = this.f5935iwizpuwonk;
        if (auzgnhcxokVar != null) {
            auzgnhcxokVar.nufgyqmvbu(new oipsdeybqn());
        }
        this.f5935iwizpuwonk = null;
    }

    @Override // lg.btonecajqb
    public Object fold(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return pj.hcddaimhww.iobyxmoadg.iobyxmoadg(this, obj, rgvfuqvkyqVar);
    }

    @Override // lg.btonecajqb.zoijcleaow, lg.btonecajqb
    public lg.btonecajqb.zoijcleaow get(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return pj.hcddaimhww.iobyxmoadg.zoijcleaow(this, ppxfxbqfkfVar);
    }

    @Override // lg.btonecajqb.zoijcleaow
    public lg.btonecajqb.ppxfxbqfkf getKey() {
        return pj.hcddaimhww.f76711btonecajqb;
    }

    @Override // pj.hcddaimhww
    public void handleException(lg.btonecajqb btonecajqbVar, Throwable th2) throws Throwable {
        krqnebusok.nufgyqmvbu nufgyqmvbuVar = (krqnebusok.nufgyqmvbu) btonecajqbVar.get(krqnebusok.nufgyqmvbu.f60489yggfygwlhe);
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.zoijcleaow(th2, this);
        }
        pj.hcddaimhww hcddaimhwwVar = (pj.hcddaimhww) this.f5938zdlpuopuiu.get(pj.hcddaimhww.f76711btonecajqb);
        if (hcddaimhwwVar == null) {
            throw th2;
        }
        hcddaimhwwVar.handleException(btonecajqbVar, th2);
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb minusKey(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return pj.hcddaimhww.iobyxmoadg.ppxfxbqfkf(this, ppxfxbqfkfVar);
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb plus(lg.btonecajqb btonecajqbVar) {
        return pj.hcddaimhww.iobyxmoadg.wkgbmnqykc(this, btonecajqbVar);
    }

    @Override // androidx.compose.runtime.u
    public void ppxfxbqfkf() {
        pj.auzgnhcxok auzgnhcxokVar = this.f5935iwizpuwonk;
        if (auzgnhcxokVar != null) {
            auzgnhcxokVar.nufgyqmvbu(new oipsdeybqn());
        }
        this.f5935iwizpuwonk = null;
    }

    @Override // androidx.compose.runtime.u
    public void zoijcleaow() {
        pj.auzgnhcxok auzgnhcxokVar = this.f5935iwizpuwonk;
        if (auzgnhcxokVar != null) {
            pj.skhdrjzrfn.gxszxtbevo(auzgnhcxokVar, "Old job was still running!", null, 2, null);
        }
        this.f5935iwizpuwonk = pj.gtknphoqwx.wkgbmnqykc(this.f5936jyumaefscl, null, null, this.f5937yggfygwlhe, 3, null);
    }
}
