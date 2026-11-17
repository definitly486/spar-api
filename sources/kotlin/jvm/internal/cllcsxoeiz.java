package kotlin.jvm.internal;

import dh.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final dsvhmnatus f60002iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ah.wkgbmnqykc[] f60003zoijcleaow;

    static {
        dsvhmnatus dsvhmnatusVar = null;
        try {
            dsvhmnatusVar = (dsvhmnatus) f.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (dsvhmnatusVar == null) {
            dsvhmnatusVar = new dsvhmnatus();
        }
        f60002iobyxmoadg = dsvhmnatusVar;
        f60003zoijcleaow = new ah.wkgbmnqykc[0];
    }

    public static String btonecajqb(jyumaefscl jyumaefsclVar) {
        return f60002iobyxmoadg.dxjokdxxww(jyumaefsclVar);
    }

    public static String dxjokdxxww(ojitshcjhn ojitshcjhnVar) {
        return f60002iobyxmoadg.nufgyqmvbu(ojitshcjhnVar);
    }

    public static ah.dxjokdxxww eablkybsjg(cqumvgiudr cqumvgiudrVar) {
        return f60002iobyxmoadg.wkgbmnqykc(cqumvgiudrVar);
    }

    public static ah.draadjrbmk gxszxtbevo(zynmafqrjb zynmafqrjbVar) {
        return f60002iobyxmoadg.eablkybsjg(zynmafqrjbVar);
    }

    public static ah.lqeggnwhkg iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar) {
        return f60002iobyxmoadg.iobyxmoadg(rgvfuqvkyqVar);
    }

    public static ah.wflxmlrfwp lqeggnwhkg(cdpycssgdh cdpycssgdhVar) {
        return f60002iobyxmoadg.gxszxtbevo(cdpycssgdhVar);
    }

    public static ah.agtfadlqog nufgyqmvbu(iozdgvuglv iozdgvuglvVar) {
        return f60002iobyxmoadg.lqeggnwhkg(iozdgvuglvVar);
    }

    public static ah.gxszxtbevo ppxfxbqfkf(Class cls) {
        return f60002iobyxmoadg.ppxfxbqfkf(cls, "");
    }

    public static ah.gxszxtbevo wkgbmnqykc(Class cls, String str) {
        return f60002iobyxmoadg.ppxfxbqfkf(cls, str);
    }

    public static ah.wkgbmnqykc zoijcleaow(Class cls) {
        return f60002iobyxmoadg.zoijcleaow(cls);
    }
}
