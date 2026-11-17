package rk;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.istkbnxepw;
import lk.iwizpuwonk;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;
import mk.draadjrbmk;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f82971iobyxmoadg;

    public zoijcleaow(boolean z13) {
        this.f82971iobyxmoadg = z13;
    }

    private final boolean iobyxmoadg(int i13, qk.ppxfxbqfkf ppxfxbqfkfVar) {
        return i13 == 100 || i13 == 103;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[Catch: IOException -> 0x006a, TRY_LEAVE, TryCatch #0 {IOException -> 0x006a, blocks: (B:17:0x0055, B:19:0x005b, B:30:0x0093, B:32:0x0099, B:22:0x006c, B:23:0x007b, B:25:0x0088), top: B:76:0x002c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, lk.cdpycssgdh$iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4, types: [lk.cdpycssgdh$iobyxmoadg] */
    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) throws IOException {
        boolean z13;
        ?? r13;
        ?? Vdvldrhtss;
        cdpycssgdh.iobyxmoadg iobyxmoadgVar;
        zdlpuopuiu.btonecajqb(chain, "chain");
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) chain;
        qk.ppxfxbqfkf ppxfxbqfkfVarBtonecajqb = lqeggnwhkgVar.btonecajqb();
        zdlpuopuiu.lqeggnwhkg(ppxfxbqfkfVarBtonecajqb);
        zynmafqrjb zynmafqrjbVarDraadjrbmk = lqeggnwhkgVar.draadjrbmk();
        istkbnxepw istkbnxepwVarIobyxmoadg = zynmafqrjbVarDraadjrbmk.iobyxmoadg();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ppxfxbqfkfVarBtonecajqb.jyumaefscl(zynmafqrjbVarDraadjrbmk);
            ?? Iobyxmoadg = gxszxtbevo.iobyxmoadg(zynmafqrjbVarDraadjrbmk.lqeggnwhkg());
            try {
                if (Iobyxmoadg == 0 || istkbnxepwVarIobyxmoadg == null) {
                    ppxfxbqfkfVarBtonecajqb.ojitshcjhn();
                    z13 = true;
                    Iobyxmoadg = 0;
                } else {
                    if (kcexrzcfyt.istkbnxepw("100-continue", zynmafqrjbVarDraadjrbmk.wkgbmnqykc("Expect"), true)) {
                        ppxfxbqfkfVarBtonecajqb.gxszxtbevo();
                        cdpycssgdh.iobyxmoadg iobyxmoadgVarVdvldrhtss = ppxfxbqfkfVarBtonecajqb.vdvldrhtss(true);
                        try {
                            ppxfxbqfkfVarBtonecajqb.kcexrzcfyt();
                            z13 = false;
                            iobyxmoadgVar = iobyxmoadgVarVdvldrhtss;
                        } catch (IOException e13) {
                            e = e13;
                            z13 = true;
                            r13 = iobyxmoadgVarVdvldrhtss;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            if (!ppxfxbqfkfVarBtonecajqb.gtknphoqwx()) {
                                Vdvldrhtss = r13;
                                throw e;
                            }
                        }
                    } else {
                        z13 = true;
                        iobyxmoadgVar = null;
                    }
                    if (iobyxmoadgVar != null) {
                        ppxfxbqfkfVarBtonecajqb.ojitshcjhn();
                        if (!ppxfxbqfkfVarBtonecajqb.nufgyqmvbu().vdvldrhtss()) {
                            Iobyxmoadg = iobyxmoadgVar;
                            ppxfxbqfkfVarBtonecajqb.agtfadlqog();
                            Iobyxmoadg = iobyxmoadgVar;
                        }
                    } else if (istkbnxepwVarIobyxmoadg.lqeggnwhkg()) {
                        ppxfxbqfkfVarBtonecajqb.gxszxtbevo();
                        istkbnxepwVarIobyxmoadg.dxjokdxxww(bl.zdlpuopuiu.zoijcleaow(ppxfxbqfkfVarBtonecajqb.ppxfxbqfkf(zynmafqrjbVarDraadjrbmk, true)));
                    } else {
                        bl.wkgbmnqykc wkgbmnqykcVarZoijcleaow = bl.zdlpuopuiu.zoijcleaow(ppxfxbqfkfVarBtonecajqb.ppxfxbqfkf(zynmafqrjbVarDraadjrbmk, false));
                        istkbnxepwVarIobyxmoadg.dxjokdxxww(wkgbmnqykcVarZoijcleaow);
                        wkgbmnqykcVarZoijcleaow.close();
                    }
                }
                if (istkbnxepwVarIobyxmoadg != null) {
                    Iobyxmoadg = iobyxmoadgVar;
                    if (!istkbnxepwVarIobyxmoadg.lqeggnwhkg()) {
                        Iobyxmoadg = iobyxmoadgVar;
                        Iobyxmoadg = iobyxmoadgVar;
                        Iobyxmoadg = iobyxmoadgVar;
                        ppxfxbqfkfVarBtonecajqb.eablkybsjg();
                    }
                } else {
                    Iobyxmoadg = iobyxmoadgVar;
                    Iobyxmoadg = iobyxmoadgVar;
                    Iobyxmoadg = iobyxmoadgVar;
                    ppxfxbqfkfVarBtonecajqb.eablkybsjg();
                }
                Iobyxmoadg = iobyxmoadgVar;
                e = null;
                Vdvldrhtss = Iobyxmoadg;
            } catch (IOException e14) {
                e = e14;
                r13 = Iobyxmoadg;
            }
        } catch (IOException e15) {
            e = e15;
            z13 = true;
            r13 = 0;
        }
        if (Vdvldrhtss == 0) {
            try {
                Vdvldrhtss = ppxfxbqfkfVarBtonecajqb.vdvldrhtss(false);
                zdlpuopuiu.lqeggnwhkg(Vdvldrhtss);
                if (z13) {
                    ppxfxbqfkfVarBtonecajqb.kcexrzcfyt();
                    z13 = false;
                }
            } catch (IOException e16) {
                if (e == null) {
                    throw e16;
                }
                gg.lqeggnwhkg.iobyxmoadg(e, e16);
                throw e;
            }
        }
        cdpycssgdh cdpycssgdhVarPpxfxbqfkf = Vdvldrhtss.vdvldrhtss(zynmafqrjbVarDraadjrbmk).nufgyqmvbu(ppxfxbqfkfVarBtonecajqb.nufgyqmvbu().wflxmlrfwp()).oxmwwwfdhm(jCurrentTimeMillis).rgvfuqvkyq(System.currentTimeMillis()).ppxfxbqfkf();
        int iBtonecajqb = cdpycssgdhVarPpxfxbqfkf.btonecajqb();
        if (iobyxmoadg(iBtonecajqb, ppxfxbqfkfVarBtonecajqb)) {
            cdpycssgdh.iobyxmoadg iobyxmoadgVarVdvldrhtss2 = ppxfxbqfkfVarBtonecajqb.vdvldrhtss(false);
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarVdvldrhtss2);
            if (z13) {
                ppxfxbqfkfVarBtonecajqb.kcexrzcfyt();
            }
            cdpycssgdhVarPpxfxbqfkf = iobyxmoadgVarVdvldrhtss2.vdvldrhtss(zynmafqrjbVarDraadjrbmk).nufgyqmvbu(ppxfxbqfkfVarBtonecajqb.nufgyqmvbu().wflxmlrfwp()).oxmwwwfdhm(jCurrentTimeMillis).rgvfuqvkyq(System.currentTimeMillis()).ppxfxbqfkf();
            iBtonecajqb = cdpycssgdhVarPpxfxbqfkf.btonecajqb();
        }
        ppxfxbqfkfVarBtonecajqb.oxmwwwfdhm(cdpycssgdhVarPpxfxbqfkf);
        cdpycssgdh cdpycssgdhVarYggfygwlhe = (this.f82971iobyxmoadg && iBtonecajqb == 101) ? draadjrbmk.yggfygwlhe(cdpycssgdhVarPpxfxbqfkf) : cdpycssgdhVarPpxfxbqfkf.cqumvgiudr().zoijcleaow(ppxfxbqfkfVarBtonecajqb.rgvfuqvkyq(cdpycssgdhVarPpxfxbqfkf)).ppxfxbqfkf();
        if (kcexrzcfyt.istkbnxepw("close", cdpycssgdhVarYggfygwlhe.cdpycssgdh().wkgbmnqykc("Connection"), true) || kcexrzcfyt.istkbnxepw("close", cdpycssgdh.vdvldrhtss(cdpycssgdhVarYggfygwlhe, "Connection", null, 2, null), true)) {
            ppxfxbqfkfVarBtonecajqb.agtfadlqog();
        }
        if ((iBtonecajqb != 204 && iBtonecajqb != 205) || cdpycssgdhVarYggfygwlhe.wkgbmnqykc().nufgyqmvbu() <= 0) {
            return cdpycssgdhVarYggfygwlhe;
        }
        throw new ProtocolException("HTTP " + iBtonecajqb + " had non-zero Content-Length: " + cdpycssgdhVarYggfygwlhe.wkgbmnqykc().nufgyqmvbu());
    }
}
