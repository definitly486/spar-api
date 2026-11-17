package pj;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends uj.esjtqupxsv {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ThreadLocal f76710cqumvgiudr;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(lg.btonecajqb btonecajqbVar, lg.gxszxtbevo gxszxtbevoVar) {
        i iVar = i.f76715zdlpuopuiu;
        super(btonecajqbVar.get(iVar) == null ? btonecajqbVar.plus(iVar) : btonecajqbVar, gxszxtbevoVar);
        this.f76710cqumvgiudr = new ThreadLocal();
        if (gxszxtbevoVar.getContext().get(lg.lqeggnwhkg.f62508dxjokdxxww) instanceof pkzmftpjix) {
            return;
        }
        Object objDxjokdxxww = uj.pkzmftpjix.dxjokdxxww(btonecajqbVar, null);
        uj.pkzmftpjix.gxszxtbevo(btonecajqbVar, objDxjokdxxww);
        c(btonecajqbVar, objDxjokdxxww);
    }

    public final boolean b() {
        boolean z13 = this.threadLocalIsSet && this.f76710cqumvgiudr.get() == null;
        this.f76710cqumvgiudr.remove();
        return !z13;
    }

    public final void c(lg.btonecajqb btonecajqbVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f76710cqumvgiudr.set(gg.cqumvgiudr.iobyxmoadg(btonecajqbVar, obj));
    }

    @Override // uj.esjtqupxsv, pj.iobyxmoadg
    protected void yzdjzghtvl(Object obj) {
        if (this.threadLocalIsSet) {
            gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) this.f76710cqumvgiudr.get();
            if (vdvldrhtssVar != null) {
                uj.pkzmftpjix.gxszxtbevo((lg.btonecajqb) vdvldrhtssVar.iobyxmoadg(), vdvldrhtssVar.wkgbmnqykc());
            }
            this.f76710cqumvgiudr.remove();
        }
        Object objIobyxmoadg = cdpycssgdh.iobyxmoadg(obj, this.f113643iwizpuwonk);
        lg.gxszxtbevo gxszxtbevoVar = this.f113643iwizpuwonk;
        lg.btonecajqb context = gxszxtbevoVar.getContext();
        Object objDxjokdxxww = uj.pkzmftpjix.dxjokdxxww(context, null);
        h hVarWflxmlrfwp = objDxjokdxxww != uj.pkzmftpjix.f113663iobyxmoadg ? wwaezpbzkn.wflxmlrfwp(gxszxtbevoVar, context, objDxjokdxxww) : null;
        try {
            this.f113643iwizpuwonk.resumeWith(objIobyxmoadg);
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            if (hVarWflxmlrfwp == null || hVarWflxmlrfwp.b()) {
                uj.pkzmftpjix.gxszxtbevo(context, objDxjokdxxww);
            }
        }
    }
}
