package zi;

/* JADX INFO: loaded from: classes3.dex */
public final class crxdokpmqz extends ixidwrxhsl {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final yi.dxjokdxxww f130014iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.iobyxmoadg f130015jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final yi.agtfadlqog f130016yggfygwlhe;

    public crxdokpmqz(yi.agtfadlqog storageManager, tg.iobyxmoadg computation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(computation, "computation");
        this.f130016yggfygwlhe = storageManager;
        this.f130015jyumaefscl = computation;
        this.f130014iwizpuwonk = storageManager.wkgbmnqykc(computation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kegysxyocb eslsurpljm(aj.lqeggnwhkg lqeggnwhkgVar, crxdokpmqz crxdokpmqzVar) {
        return lqeggnwhkgVar.iobyxmoadg((dj.dxjokdxxww) crxdokpmqzVar.f130015jyumaefscl.invoke());
    }

    @Override // zi.ixidwrxhsl
    public boolean ezmngbhpjk() {
        return this.f130014iwizpuwonk.draadjrbmk();
    }

    @Override // zi.ixidwrxhsl
    protected kegysxyocb fmlbqenlif() {
        return (kegysxyocb) this.f130014iwizpuwonk.invoke();
    }

    @Override // zi.kegysxyocb
    /* JADX INFO: renamed from: yzdjzghtvl, reason: merged with bridge method [inline-methods] */
    public crxdokpmqz ixidwrxhsl(aj.lqeggnwhkg kotlinTypeRefiner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new crxdokpmqz(this.f130016yggfygwlhe, new sopmlzcsov(kotlinTypeRefiner, this));
    }
}
