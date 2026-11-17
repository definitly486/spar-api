package t6;

import android.content.Context;
import zone.bi.mobile.fingerprint.api.FingerprintGeneralException;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 implements d1 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final kegysxyocb f109897iobyxmoadg = nufgyqmvbu();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private lmojexxdyd f109898zoijcleaow;

    w0() {
    }

    private void lqeggnwhkg() {
        ppxfxbqfkf();
    }

    private kegysxyocb nufgyqmvbu() {
        return new jpowsppfya();
    }

    @Override // t6.d1
    public lmojexxdyd eablkybsjg() {
        if (ppxfxbqfkf()) {
            return this.f109898zoijcleaow;
        }
        throw new FingerprintGeneralException(m1.iobyxmoadg(new byte[]{62, 107, 70, -124, 53, 69, 78, -46, 19, -29, 61, 72, -59, -103, -116, -44, 0, 14, 112, 16, -106, 69, 56, -92, -55, 72, 6, 43, -95, 6, 108, -117, -105, 119, -4, 98, -103, 99, 30, -37, -70, -44, -112, 2, 78, 78, 8, 56}));
    }

    @Override // t6.h0
    public zone.bi.mobile.fingerprint.impl.cs.zoijcleaow gxszxtbevo(Context context) {
        lqeggnwhkg();
        return new zone.bi.mobile.fingerprint.impl.cs.ppxfxbqfkf(context);
    }

    @Override // t6.h0
    public wwaezpbzkn iobyxmoadg() {
        lqeggnwhkg();
        return new cllcsxoeiz();
    }

    @Override // t6.h0
    public synchronized boolean ppxfxbqfkf() {
        return this.f109898zoijcleaow != null;
    }

    @Override // t6.h0
    public synchronized boolean wkgbmnqykc(Context context) {
        boolean zPpxfxbqfkf;
        zPpxfxbqfkf = ppxfxbqfkf();
        if (!zPpxfxbqfkf) {
            lmojexxdyd lmojexxdydVarWkgbmnqykc = this.f109897iobyxmoadg.wkgbmnqykc(context);
            boolean zWkgbmnqykc = lmojexxdydVarWkgbmnqykc.wkgbmnqykc(context);
            if (zWkgbmnqykc) {
                this.f109898zoijcleaow = lmojexxdydVarWkgbmnqykc;
            }
            zPpxfxbqfkf = zWkgbmnqykc;
        }
        return zPpxfxbqfkf;
    }

    @Override // t6.h0
    public zoijcleaow zoijcleaow() {
        lqeggnwhkg();
        return new lqeggnwhkg();
    }
}
