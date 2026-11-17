package pj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vipkmwdibw {
    private static final void eablkybsjg(ribwqtqdhb ribwqtqdhbVar) {
        czzsidtyhn czzsidtyhnVarZoijcleaow = c.f76674iobyxmoadg.zoijcleaow();
        if (czzsidtyhnVarZoijcleaow.weqkydbzbr()) {
            czzsidtyhnVarZoijcleaow.yfnezrywwk(ribwqtqdhbVar);
            return;
        }
        czzsidtyhnVarZoijcleaow.opjhrmiecq(true);
        try {
            wkgbmnqykc(ribwqtqdhbVar, ribwqtqdhbVar.zoijcleaow(), true);
            do {
            } while (czzsidtyhnVarZoijcleaow.uawqvzlxes());
        } catch (Throwable th2) {
            try {
                ribwqtqdhbVar.gxszxtbevo(th2);
            } finally {
                czzsidtyhnVarZoijcleaow.xrmfcynszj(true);
            }
        }
    }

    public static final void iobyxmoadg(ribwqtqdhb ribwqtqdhbVar, int i13) {
        lg.gxszxtbevo gxszxtbevoVarZoijcleaow = ribwqtqdhbVar.zoijcleaow();
        boolean z13 = i13 == 4;
        if (z13 || !(gxszxtbevoVarZoijcleaow instanceof uj.lqeggnwhkg) || zoijcleaow(i13) != zoijcleaow(ribwqtqdhbVar.f76767jyumaefscl)) {
            wkgbmnqykc(ribwqtqdhbVar, gxszxtbevoVarZoijcleaow, z13);
            return;
        }
        uj.lqeggnwhkg lqeggnwhkgVar = (uj.lqeggnwhkg) gxszxtbevoVarZoijcleaow;
        pkzmftpjix pkzmftpjixVar = lqeggnwhkgVar.f113656iwizpuwonk;
        lg.btonecajqb context = lqeggnwhkgVar.getContext();
        if (pkzmftpjixVar.ulzqkzuiru(context)) {
            pkzmftpjixVar.dsvhmnatus(context, ribwqtqdhbVar);
        } else {
            eablkybsjg(ribwqtqdhbVar);
        }
    }

    public static final boolean ppxfxbqfkf(int i13) {
        return i13 == 2;
    }

    public static final void wkgbmnqykc(ribwqtqdhb ribwqtqdhbVar, lg.gxszxtbevo gxszxtbevoVar, boolean z13) {
        Object objWkgbmnqykc;
        Object objLqeggnwhkg = ribwqtqdhbVar.lqeggnwhkg();
        Throwable thPpxfxbqfkf = ribwqtqdhbVar.ppxfxbqfkf(objLqeggnwhkg);
        if (thPpxfxbqfkf != null) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.zdlpuopuiu.iobyxmoadg(thPpxfxbqfkf);
        } else {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = ribwqtqdhbVar.wkgbmnqykc(objLqeggnwhkg);
        }
        Object objWkgbmnqykc2 = gg.kcexrzcfyt.wkgbmnqykc(objWkgbmnqykc);
        if (!z13) {
            gxszxtbevoVar.resumeWith(objWkgbmnqykc2);
            return;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(gxszxtbevoVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        uj.lqeggnwhkg lqeggnwhkgVar = (uj.lqeggnwhkg) gxszxtbevoVar;
        lg.gxszxtbevo gxszxtbevoVar2 = lqeggnwhkgVar.f113654cqumvgiudr;
        Object obj = lqeggnwhkgVar.f113657lereixgezr;
        lg.btonecajqb context = gxszxtbevoVar2.getContext();
        Object objDxjokdxxww = uj.pkzmftpjix.dxjokdxxww(context, obj);
        h hVarWflxmlrfwp = objDxjokdxxww != uj.pkzmftpjix.f113663iobyxmoadg ? wwaezpbzkn.wflxmlrfwp(gxszxtbevoVar2, context, objDxjokdxxww) : null;
        try {
            lqeggnwhkgVar.f113654cqumvgiudr.resumeWith(objWkgbmnqykc2);
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            if (hVarWflxmlrfwp == null || hVarWflxmlrfwp.b()) {
                uj.pkzmftpjix.gxszxtbevo(context, objDxjokdxxww);
            }
        }
    }

    public static final boolean zoijcleaow(int i13) {
        return i13 == 1 || i13 == 2;
    }
}
