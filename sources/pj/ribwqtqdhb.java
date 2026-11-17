package pj;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ribwqtqdhb extends wj.nufgyqmvbu {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public int f76767jyumaefscl;

    public ribwqtqdhb(int i13) {
        this.f76767jyumaefscl = i13;
    }

    public final void gxszxtbevo(Throwable th2) {
        jpowsppfya.iobyxmoadg(zoijcleaow().getContext(), new stevsuqkhv("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public void iobyxmoadg(Object obj, Throwable th2) {
    }

    public abstract Object lqeggnwhkg();

    public Throwable ppxfxbqfkf(Object obj) {
        istkbnxepw istkbnxepwVar = obj instanceof istkbnxepw ? (istkbnxepw) obj : null;
        if (istkbnxepwVar != null) {
            return istkbnxepwVar.f76725iobyxmoadg;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            lg.gxszxtbevo gxszxtbevoVarZoijcleaow = zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(gxszxtbevoVarZoijcleaow, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            uj.lqeggnwhkg lqeggnwhkgVar = (uj.lqeggnwhkg) gxszxtbevoVarZoijcleaow;
            lg.gxszxtbevo gxszxtbevoVar = lqeggnwhkgVar.f113654cqumvgiudr;
            Object obj = lqeggnwhkgVar.f113657lereixgezr;
            lg.btonecajqb context = gxszxtbevoVar.getContext();
            Object objDxjokdxxww = uj.pkzmftpjix.dxjokdxxww(context, obj);
            auzgnhcxok auzgnhcxokVar = null;
            h hVarWflxmlrfwp = objDxjokdxxww != uj.pkzmftpjix.f113663iobyxmoadg ? wwaezpbzkn.wflxmlrfwp(gxszxtbevoVar, context, objDxjokdxxww) : null;
            try {
                lg.btonecajqb context2 = gxszxtbevoVar.getContext();
                Object objLqeggnwhkg = lqeggnwhkg();
                Throwable thPpxfxbqfkf = ppxfxbqfkf(objLqeggnwhkg);
                if (thPpxfxbqfkf == null && vipkmwdibw.zoijcleaow(this.f76767jyumaefscl)) {
                    auzgnhcxokVar = (auzgnhcxok) context2.get(auzgnhcxok.f76671gtknphoqwx);
                }
                if (auzgnhcxokVar != null && !auzgnhcxokVar.isActive()) {
                    CancellationException cancellationExceptionVdvldrhtss = auzgnhcxokVar.vdvldrhtss();
                    iobyxmoadg(objLqeggnwhkg, cancellationExceptionVdvldrhtss);
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    gxszxtbevoVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(cancellationExceptionVdvldrhtss)));
                } else if (thPpxfxbqfkf != null) {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    gxszxtbevoVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(thPpxfxbqfkf)));
                } else {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    gxszxtbevoVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(wkgbmnqykc(objLqeggnwhkg)));
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                if (hVarWflxmlrfwp == null || hVarWflxmlrfwp.b()) {
                    uj.pkzmftpjix.gxszxtbevo(context, objDxjokdxxww);
                }
            }
        } catch (Throwable th2) {
            gxszxtbevo(th2);
        }
    }

    public Object wkgbmnqykc(Object obj) {
        return obj;
    }

    public abstract lg.gxszxtbevo zoijcleaow();
}
