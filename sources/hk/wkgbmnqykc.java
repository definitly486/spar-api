package hk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int f40548iobyxmoadg;

    static {
        Object objWkgbmnqykc;
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(property, "getProperty(...)");
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(mj.kcexrzcfyt.vdvldrhtss(property));
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        Integer num = (Integer) objWkgbmnqykc;
        f40548iobyxmoadg = num != null ? num.intValue() : 2097152;
    }
}
