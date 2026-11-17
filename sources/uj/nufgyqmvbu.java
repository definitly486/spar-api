package uj;

import java.util.concurrent.CancellationException;
import pj.auzgnhcxok;
import pj.c;
import pj.czzsidtyhn;
import pj.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final istkbnxepw f113658iobyxmoadg = new istkbnxepw("UNDEFINED");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final istkbnxepw f113659zoijcleaow = new istkbnxepw("REUSABLE_CLAIMED");

    public static final boolean ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar) {
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        czzsidtyhn czzsidtyhnVarZoijcleaow = c.f76674iobyxmoadg.zoijcleaow();
        if (czzsidtyhnVarZoijcleaow.nuxfzjnpeb()) {
            return false;
        }
        if (czzsidtyhnVarZoijcleaow.weqkydbzbr()) {
            lqeggnwhkgVar.f113655esjtqupxsv = wwaezpbzknVar;
            lqeggnwhkgVar.f76767jyumaefscl = 1;
            czzsidtyhnVarZoijcleaow.yfnezrywwk(lqeggnwhkgVar);
            return true;
        }
        czzsidtyhnVarZoijcleaow.opjhrmiecq(true);
        try {
            lqeggnwhkgVar.run();
            do {
            } while (czzsidtyhnVarZoijcleaow.uawqvzlxes());
        } catch (Throwable th2) {
            try {
                lqeggnwhkgVar.gxszxtbevo(th2);
            } finally {
                czzsidtyhnVarZoijcleaow.xrmfcynszj(true);
            }
        }
        return false;
    }

    public static final void zoijcleaow(lg.gxszxtbevo gxszxtbevoVar, Object obj) {
        if (!(gxszxtbevoVar instanceof lqeggnwhkg)) {
            gxszxtbevoVar.resumeWith(obj);
            return;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
        Object objZoijcleaow = pj.cdpycssgdh.zoijcleaow(obj);
        if (lqeggnwhkgVar.f113656iwizpuwonk.ulzqkzuiru(lqeggnwhkgVar.getContext())) {
            lqeggnwhkgVar.f113655esjtqupxsv = objZoijcleaow;
            lqeggnwhkgVar.f76767jyumaefscl = 1;
            lqeggnwhkgVar.f113656iwizpuwonk.dsvhmnatus(lqeggnwhkgVar.getContext(), lqeggnwhkgVar);
            return;
        }
        czzsidtyhn czzsidtyhnVarZoijcleaow = c.f76674iobyxmoadg.zoijcleaow();
        if (czzsidtyhnVarZoijcleaow.weqkydbzbr()) {
            lqeggnwhkgVar.f113655esjtqupxsv = objZoijcleaow;
            lqeggnwhkgVar.f76767jyumaefscl = 1;
            czzsidtyhnVarZoijcleaow.yfnezrywwk(lqeggnwhkgVar);
            return;
        }
        czzsidtyhnVarZoijcleaow.opjhrmiecq(true);
        try {
            auzgnhcxok auzgnhcxokVar = (auzgnhcxok) lqeggnwhkgVar.getContext().get(auzgnhcxok.f76671gtknphoqwx);
            if (auzgnhcxokVar == null || auzgnhcxokVar.isActive()) {
                lg.gxszxtbevo gxszxtbevoVar2 = lqeggnwhkgVar.f113654cqumvgiudr;
                Object obj2 = lqeggnwhkgVar.f113657lereixgezr;
                lg.btonecajqb context = gxszxtbevoVar2.getContext();
                Object objDxjokdxxww = pkzmftpjix.dxjokdxxww(context, obj2);
                h hVarWflxmlrfwp = objDxjokdxxww != pkzmftpjix.f113663iobyxmoadg ? pj.wwaezpbzkn.wflxmlrfwp(gxszxtbevoVar2, context, objDxjokdxxww) : null;
                try {
                    lqeggnwhkgVar.f113654cqumvgiudr.resumeWith(obj);
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    if (hVarWflxmlrfwp == null || hVarWflxmlrfwp.b()) {
                        pkzmftpjix.gxszxtbevo(context, objDxjokdxxww);
                    }
                } catch (Throwable th2) {
                    if (hVarWflxmlrfwp == null || hVarWflxmlrfwp.b()) {
                        pkzmftpjix.gxszxtbevo(context, objDxjokdxxww);
                    }
                    throw th2;
                }
            } else {
                CancellationException cancellationExceptionVdvldrhtss = auzgnhcxokVar.vdvldrhtss();
                lqeggnwhkgVar.iobyxmoadg(objZoijcleaow, cancellationExceptionVdvldrhtss);
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                lqeggnwhkgVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(cancellationExceptionVdvldrhtss)));
            }
            while (czzsidtyhnVarZoijcleaow.uawqvzlxes()) {
            }
        } catch (Throwable th3) {
            try {
                lqeggnwhkgVar.gxszxtbevo(th3);
            } finally {
                czzsidtyhnVarZoijcleaow.xrmfcynszj(true);
            }
        }
    }
}
