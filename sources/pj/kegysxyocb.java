package pj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kegysxyocb {
    public static final String iobyxmoadg(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof uj.lqeggnwhkg) {
            return ((uj.lqeggnwhkg) gxszxtbevoVar).toString();
        }
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gxszxtbevoVar + '@' + zoijcleaow(gxszxtbevoVar));
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
            objWkgbmnqykc = gxszxtbevoVar.getClass().getName() + '@' + zoijcleaow(gxszxtbevoVar);
        }
        return (String) objWkgbmnqykc;
    }

    public static final String zoijcleaow(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }
}
