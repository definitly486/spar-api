package x0;

import androidx.collection.xrmfcynszj;
import gg.wwaezpbzkn;
import w0.wflxmlrfwp;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f120886eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f120887iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static volatile xrmfcynszj f120888ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Object[] f120889wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final float[] f120890zoijcleaow;

    static {
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        f120887iobyxmoadg = zoijcleaowVar;
        f120890zoijcleaow = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        f120888ppxfxbqfkf = new xrmfcynszj(0, 1, null);
        Object[] objArr = new Object[0];
        f120889wkgbmnqykc = objArr;
        synchronized (objArr) {
            zoijcleaowVar.nufgyqmvbu(f120888ppxfxbqfkf, 1.15f, new ppxfxbqfkf(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            zoijcleaowVar.nufgyqmvbu(f120888ppxfxbqfkf, 1.3f, new ppxfxbqfkf(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            zoijcleaowVar.nufgyqmvbu(f120888ppxfxbqfkf, 1.5f, new ppxfxbqfkf(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            zoijcleaowVar.nufgyqmvbu(f120888ppxfxbqfkf, 1.8f, new ppxfxbqfkf(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            zoijcleaowVar.nufgyqmvbu(f120888ppxfxbqfkf, 2.0f, new ppxfxbqfkf(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(zoijcleaowVar.eablkybsjg(f120888ppxfxbqfkf.gtknphoqwx(0)) - 0.01f > 1.03f)) {
            wflxmlrfwp.zoijcleaow("You should only apply non-linear scaling to font scales > 1");
        }
        f120886eablkybsjg = 8;
    }

    private zoijcleaow() {
    }

    private final float eablkybsjg(int i13) {
        return i13 / 100.0f;
    }

    private final iobyxmoadg iobyxmoadg(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, float f13) {
        float[] fArr = f120890zoijcleaow;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            float f14 = f120890zoijcleaow[i13];
            fArr2[i13] = wkgbmnqykc.f120885iobyxmoadg.zoijcleaow(iobyxmoadgVar.zoijcleaow(f14), iobyxmoadgVar2.zoijcleaow(f14), f13);
        }
        return new ppxfxbqfkf(f120890zoijcleaow, fArr2);
    }

    private final void lqeggnwhkg(float f13, iobyxmoadg iobyxmoadgVar) {
        synchronized (f120889wkgbmnqykc) {
            xrmfcynszj xrmfcynszjVarClone = f120888ppxfxbqfkf.clone();
            f120887iobyxmoadg.nufgyqmvbu(xrmfcynszjVarClone, f13, iobyxmoadgVar);
            f120888ppxfxbqfkf = xrmfcynszjVarClone;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    private final void nufgyqmvbu(xrmfcynszj xrmfcynszjVar, float f13, iobyxmoadg iobyxmoadgVar) {
        xrmfcynszjVar.draadjrbmk(wkgbmnqykc(f13), iobyxmoadgVar);
    }

    private final iobyxmoadg ppxfxbqfkf(float f13) {
        return (iobyxmoadg) f120888ppxfxbqfkf.eablkybsjg(wkgbmnqykc(f13));
    }

    private final int wkgbmnqykc(float f13) {
        return (int) (f13 * 100.0f);
    }

    public final boolean gxszxtbevo(float f13) {
        return f13 >= 1.03f;
    }

    public final iobyxmoadg zoijcleaow(float f13) {
        iobyxmoadg ppxfxbqfkfVar;
        if (!gxszxtbevo(f13)) {
            return null;
        }
        iobyxmoadg iobyxmoadgVarPpxfxbqfkf = f120887iobyxmoadg.ppxfxbqfkf(f13);
        if (iobyxmoadgVarPpxfxbqfkf != null) {
            return iobyxmoadgVarPpxfxbqfkf;
        }
        int iLqeggnwhkg = f120888ppxfxbqfkf.lqeggnwhkg(wkgbmnqykc(f13));
        if (iLqeggnwhkg >= 0) {
            return (iobyxmoadg) f120888ppxfxbqfkf.rgvfuqvkyq(iLqeggnwhkg);
        }
        int i13 = -(iLqeggnwhkg + 1);
        int i14 = i13 - 1;
        float fEablkybsjg = 1.0f;
        if (i13 >= f120888ppxfxbqfkf.ojitshcjhn()) {
            ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf(new float[]{1.0f}, new float[]{f13});
            lqeggnwhkg(f13, ppxfxbqfkfVar2);
            return ppxfxbqfkfVar2;
        }
        if (i14 < 0) {
            float[] fArr = f120890zoijcleaow;
            ppxfxbqfkfVar = new ppxfxbqfkf(fArr, fArr);
        } else {
            fEablkybsjg = eablkybsjg(f120888ppxfxbqfkf.gtknphoqwx(i14));
            ppxfxbqfkfVar = (iobyxmoadg) f120888ppxfxbqfkf.rgvfuqvkyq(i14);
        }
        iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg(ppxfxbqfkfVar, (iobyxmoadg) f120888ppxfxbqfkf.rgvfuqvkyq(i13), wkgbmnqykc.f120885iobyxmoadg.iobyxmoadg(0.0f, 1.0f, fEablkybsjg, eablkybsjg(f120888ppxfxbqfkf.gtknphoqwx(i13)), f13));
        lqeggnwhkg(f13, iobyxmoadgVarIobyxmoadg);
        return iobyxmoadgVarIobyxmoadg;
    }
}
