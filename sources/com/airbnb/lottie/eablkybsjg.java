package com.airbnb.lottie;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static ThreadLocal f20397btonecajqb = null;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static volatile s7.lqeggnwhkg f20398dxjokdxxww = null;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static iobyxmoadg f20399eablkybsjg = iobyxmoadg.AUTOMATIC;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static s7.gxszxtbevo f20400gxszxtbevo = null;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static boolean f20401iobyxmoadg = false;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static s7.eablkybsjg f20402lqeggnwhkg = null;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static volatile s7.nufgyqmvbu f20403nufgyqmvbu = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static boolean f20404ppxfxbqfkf = true;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static boolean f20405wkgbmnqykc = true;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static boolean f20406zoijcleaow = false;

    public static s7.nufgyqmvbu dxjokdxxww(Context context) {
        s7.nufgyqmvbu nufgyqmvbuVar = f20403nufgyqmvbu;
        if (nufgyqmvbuVar == null) {
            synchronized (s7.nufgyqmvbu.class) {
                try {
                    nufgyqmvbuVar = f20403nufgyqmvbu;
                    if (nufgyqmvbuVar == null) {
                        s7.lqeggnwhkg lqeggnwhkgVarNufgyqmvbu = nufgyqmvbu(context);
                        s7.gxszxtbevo zoijcleaowVar = f20400gxszxtbevo;
                        if (zoijcleaowVar == null) {
                            zoijcleaowVar = new s7.zoijcleaow();
                        }
                        nufgyqmvbuVar = new s7.nufgyqmvbu(lqeggnwhkgVarNufgyqmvbu, zoijcleaowVar);
                        f20403nufgyqmvbu = nufgyqmvbuVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return nufgyqmvbuVar;
    }

    public static boolean eablkybsjg() {
        return f20405wkgbmnqykc;
    }

    private static v7.gxszxtbevo gxszxtbevo() {
        v7.gxszxtbevo gxszxtbevoVar = (v7.gxszxtbevo) f20397btonecajqb.get();
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar;
        }
        v7.gxszxtbevo gxszxtbevoVar2 = new v7.gxszxtbevo();
        f20397btonecajqb.set(gxszxtbevoVar2);
        return gxszxtbevoVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ File lqeggnwhkg(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static s7.lqeggnwhkg nufgyqmvbu(Context context) {
        if (!f20404ppxfxbqfkf) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        s7.lqeggnwhkg lqeggnwhkgVar = f20398dxjokdxxww;
        if (lqeggnwhkgVar == null) {
            synchronized (s7.lqeggnwhkg.class) {
                try {
                    lqeggnwhkgVar = f20398dxjokdxxww;
                    if (lqeggnwhkgVar == null) {
                        s7.eablkybsjg eablkybsjgVar = f20402lqeggnwhkg;
                        if (eablkybsjgVar == null) {
                            eablkybsjgVar = new s7.eablkybsjg() { // from class: com.airbnb.lottie.wkgbmnqykc
                                @Override // s7.eablkybsjg
                                public final File iobyxmoadg() {
                                    return eablkybsjg.lqeggnwhkg(applicationContext);
                                }
                            };
                        }
                        lqeggnwhkgVar = new s7.lqeggnwhkg(eablkybsjgVar);
                        f20398dxjokdxxww = lqeggnwhkgVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return lqeggnwhkgVar;
    }

    public static float ppxfxbqfkf(String str) {
        if (f20406zoijcleaow) {
            return gxszxtbevo().zoijcleaow(str);
        }
        return 0.0f;
    }

    public static iobyxmoadg wkgbmnqykc() {
        return f20399eablkybsjg;
    }

    public static void zoijcleaow(String str) {
        if (f20406zoijcleaow) {
            gxszxtbevo().iobyxmoadg(str);
        }
    }
}
