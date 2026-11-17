package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class roivzttewh implements gxszxtbevo {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private kcexrzcfyt f117240dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private kcexrzcfyt f117241eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private kcexrzcfyt f117242gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final q f117243iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final kcexrzcfyt f117244lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f117245nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Object f117246ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Object f117247wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ezmngbhpjk f117248zoijcleaow;

    public roivzttewh(q qVar, ezmngbhpjk ezmngbhpjkVar, Object obj, Object obj2, kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfyt kcexrzcfytVarEablkybsjg;
        this.f117243iobyxmoadg = qVar;
        this.f117248zoijcleaow = ezmngbhpjkVar;
        this.f117246ppxfxbqfkf = obj2;
        this.f117247wkgbmnqykc = obj;
        this.f117241eablkybsjg = (kcexrzcfyt) eablkybsjg().iobyxmoadg().invoke(obj);
        this.f117242gxszxtbevo = (kcexrzcfyt) eablkybsjg().iobyxmoadg().invoke(obj2);
        this.f117244lqeggnwhkg = (kcexrzcfytVar == null || (kcexrzcfytVarEablkybsjg = zdlpuopuiu.eablkybsjg(kcexrzcfytVar)) == null) ? zdlpuopuiu.lqeggnwhkg((kcexrzcfyt) eablkybsjg().iobyxmoadg().invoke(obj)) : kcexrzcfytVarEablkybsjg;
        this.f117245nufgyqmvbu = -1L;
    }

    private final kcexrzcfyt nufgyqmvbu() {
        kcexrzcfyt kcexrzcfytVar = this.f117240dxjokdxxww;
        if (kcexrzcfytVar != null) {
            return kcexrzcfytVar;
        }
        kcexrzcfyt kcexrzcfytVarPpxfxbqfkf = this.f117243iobyxmoadg.ppxfxbqfkf(this.f117241eablkybsjg, this.f117242gxszxtbevo, this.f117244lqeggnwhkg);
        this.f117240dxjokdxxww = kcexrzcfytVarPpxfxbqfkf;
        return kcexrzcfytVarPpxfxbqfkf;
    }

    public final Object dxjokdxxww() {
        return this.f117247wkgbmnqykc;
    }

    @Override // vipkmwdibw.gxszxtbevo
    public ezmngbhpjk eablkybsjg() {
        return this.f117248zoijcleaow;
    }

    @Override // vipkmwdibw.gxszxtbevo
    public Object gxszxtbevo(long j13) {
        if (ppxfxbqfkf(j13)) {
            return lqeggnwhkg();
        }
        kcexrzcfyt kcexrzcfytVarLqeggnwhkg = this.f117243iobyxmoadg.lqeggnwhkg(j13, this.f117241eablkybsjg, this.f117242gxszxtbevo, this.f117244lqeggnwhkg);
        int iZoijcleaow = kcexrzcfytVarLqeggnwhkg.zoijcleaow();
        for (int i13 = 0; i13 < iZoijcleaow; i13++) {
            if (Float.isNaN(kcexrzcfytVarLqeggnwhkg.iobyxmoadg(i13))) {
                ikoacuggdj.zoijcleaow("AnimationVector cannot contain a NaN. " + kcexrzcfytVarLqeggnwhkg + ". Animation: " + this + ", playTimeNanos: " + j13);
            }
        }
        return eablkybsjg().zoijcleaow().invoke(kcexrzcfytVarLqeggnwhkg);
    }

    @Override // vipkmwdibw.gxszxtbevo
    public boolean iobyxmoadg() {
        return this.f117243iobyxmoadg.iobyxmoadg();
    }

    @Override // vipkmwdibw.gxszxtbevo
    public Object lqeggnwhkg() {
        return this.f117246ppxfxbqfkf;
    }

    public String toString() {
        return "TargetBasedAnimation: " + dxjokdxxww() + " -> " + lqeggnwhkg() + ",initial velocity: " + this.f117244lqeggnwhkg + ", duration: " + nufgyqmvbu.zoijcleaow(this) + " ms,animationSpec: " + this.f117243iobyxmoadg;
    }

    @Override // vipkmwdibw.gxszxtbevo
    public long wkgbmnqykc() {
        if (this.f117245nufgyqmvbu < 0) {
            this.f117245nufgyqmvbu = this.f117243iobyxmoadg.zoijcleaow(this.f117241eablkybsjg, this.f117242gxszxtbevo, this.f117244lqeggnwhkg);
        }
        return this.f117245nufgyqmvbu;
    }

    @Override // vipkmwdibw.gxszxtbevo
    public kcexrzcfyt zoijcleaow(long j13) {
        return !ppxfxbqfkf(j13) ? this.f117243iobyxmoadg.gxszxtbevo(j13, this.f117241eablkybsjg, this.f117242gxszxtbevo, this.f117244lqeggnwhkg) : nufgyqmvbu();
    }

    public /* synthetic */ roivzttewh(gtknphoqwx gtknphoqwxVar, ezmngbhpjk ezmngbhpjkVar, Object obj, Object obj2, kcexrzcfyt kcexrzcfytVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this(gtknphoqwxVar, ezmngbhpjkVar, obj, obj2, (i13 & 16) != 0 ? null : kcexrzcfytVar);
    }

    public roivzttewh(gtknphoqwx gtknphoqwxVar, ezmngbhpjk ezmngbhpjkVar, Object obj, Object obj2, kcexrzcfyt kcexrzcfytVar) {
        this(gtknphoqwxVar.iobyxmoadg(ezmngbhpjkVar), ezmngbhpjkVar, obj, obj2, kcexrzcfytVar);
    }
}
