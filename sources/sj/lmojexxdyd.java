package sj;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import pj.jztzpxfvev;

/* JADX INFO: loaded from: classes3.dex */
public class lmojexxdyd extends tj.iobyxmoadg implements pmvmpeiblj, lqeggnwhkg, tj.rgvfuqvkyq {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f106988cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f106989cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final int f106990esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private long f106991istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final rj.iobyxmoadg f106992lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private Object[] f106993pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f106994yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private long f106995zynmafqrjb;

    private static final class iobyxmoadg implements jztzpxfvev {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public final lg.gxszxtbevo f106996iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public final Object f106997jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public long f106998yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final lmojexxdyd f106999zdlpuopuiu;

        public iobyxmoadg(lmojexxdyd lmojexxdydVar, long j13, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            this.f106999zdlpuopuiu = lmojexxdydVar;
            this.f106998yggfygwlhe = j13;
            this.f106997jyumaefscl = obj;
            this.f106996iwizpuwonk = gxszxtbevoVar;
        }

        @Override // pj.jztzpxfvev
        public void iobyxmoadg() {
            this.f106999zdlpuopuiu.cqumvgiudr(this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f107000cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f107002iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f107003jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f107004lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f107005yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107006zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107000cqumvgiudr = obj;
            this.f107004lereixgezr |= Integer.MIN_VALUE;
            return lmojexxdyd.lereixgezr(lmojexxdyd.this, null, this);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f107007iobyxmoadg;

        static {
            int[] iArr = new int[rj.iobyxmoadg.values().length];
            try {
                iArr[rj.iobyxmoadg.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rj.iobyxmoadg.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rj.iobyxmoadg.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f107007iobyxmoadg = iArr;
        }
    }

    public lmojexxdyd(int i13, int i14, rj.iobyxmoadg iobyxmoadgVar) {
        this.f106989cqumvgiudr = i13;
        this.f106990esjtqupxsv = i14;
        this.f106992lereixgezr = iobyxmoadgVar;
    }

    private final void cdpycssgdh() {
        Object[] objArr = this.f106993pmvmpeiblj;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objArr);
        wwaezpbzkn.lqeggnwhkg(objArr, pkzmftpjix(), null);
        this.f106988cdpycssgdh--;
        long jPkzmftpjix = pkzmftpjix() + 1;
        if (this.f106995zynmafqrjb < jPkzmftpjix) {
            this.f106995zynmafqrjb = jPkzmftpjix;
        }
        if (this.f106991istkbnxepw < jPkzmftpjix) {
            pmvmpeiblj(jPkzmftpjix);
        }
    }

    private final int cllcsxoeiz() {
        return (int) ((pkzmftpjix() + ((long) this.f106988cdpycssgdh)) - this.f106995zynmafqrjb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cqumvgiudr(iobyxmoadg iobyxmoadgVar) {
        synchronized (this) {
            if (iobyxmoadgVar.f106998yggfygwlhe < pkzmftpjix()) {
                return;
            }
            Object[] objArr = this.f106993pmvmpeiblj;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objArr);
            if (wwaezpbzkn.gxszxtbevo(objArr, iobyxmoadgVar.f106998yggfygwlhe) != iobyxmoadgVar) {
                return;
            }
            wwaezpbzkn.lqeggnwhkg(objArr, iobyxmoadgVar.f106998yggfygwlhe, wwaezpbzkn.f107053iobyxmoadg);
            esjtqupxsv();
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dsvhmnatus() {
        return this.f106988cdpycssgdh + this.f106994yadqdtsiqt;
    }

    private final void esjtqupxsv() {
        if (this.f106990esjtqupxsv != 0 || this.f106994yadqdtsiqt > 1) {
            Object[] objArr = this.f106993pmvmpeiblj;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objArr);
            while (this.f106994yadqdtsiqt > 0 && wwaezpbzkn.gxszxtbevo(objArr, (pkzmftpjix() + ((long) dsvhmnatus())) - 1) == wwaezpbzkn.f107053iobyxmoadg) {
                this.f106994yadqdtsiqt--;
                wwaezpbzkn.lqeggnwhkg(objArr, pkzmftpjix() + ((long) dsvhmnatus()), null);
            }
        }
    }

    private final long hkdspvbjdz() {
        return pkzmftpjix() + ((long) this.f106988cdpycssgdh) + ((long) this.f106994yadqdtsiqt);
    }

    private final Object iozdgvuglv(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        lg.gxszxtbevo[] gxszxtbevoVarArrWwaezpbzkn;
        iobyxmoadg iobyxmoadgVar;
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        lg.gxszxtbevo[] gxszxtbevoVarArrWwaezpbzkn2 = tj.zoijcleaow.f110717iobyxmoadg;
        synchronized (this) {
            try {
                if (stevsuqkhv(obj)) {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    rgvfuqvkyqVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
                    gxszxtbevoVarArrWwaezpbzkn = wwaezpbzkn(gxszxtbevoVarArrWwaezpbzkn2);
                    iobyxmoadgVar = null;
                } else {
                    iobyxmoadg iobyxmoadgVar3 = new iobyxmoadg(this, ((long) dsvhmnatus()) + pkzmftpjix(), obj, rgvfuqvkyqVar);
                    lmojexxdyd(iobyxmoadgVar3);
                    this.f106994yadqdtsiqt++;
                    if (this.f106990esjtqupxsv == 0) {
                        gxszxtbevoVarArrWwaezpbzkn2 = wwaezpbzkn(gxszxtbevoVarArrWwaezpbzkn2);
                    }
                    gxszxtbevoVarArrWwaezpbzkn = gxszxtbevoVarArrWwaezpbzkn2;
                    iobyxmoadgVar = iobyxmoadgVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iobyxmoadgVar != null) {
            pj.oxmwwwfdhm.iobyxmoadg(rgvfuqvkyqVar, iobyxmoadgVar);
        }
        for (lg.gxszxtbevo gxszxtbevoVar2 : gxszxtbevoVarArrWwaezpbzkn) {
            if (gxszxtbevoVar2 != null) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                gxszxtbevoVar2.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
            }
        }
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo() ? objZdlpuopuiu : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final Object iwizpuwonk(ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        synchronized (this) {
            try {
                if (tzroggbefp(ylkuphrtabVar) < 0) {
                    ylkuphrtabVar.f107103zoijcleaow = rgvfuqvkyqVar;
                } else {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    rgvfuqvkyqVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo() ? objZdlpuopuiu : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final Object jpowsppfya(long j13) {
        Object[] objArr = this.f106993pmvmpeiblj;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objArr);
        Object objGxszxtbevo = wwaezpbzkn.gxszxtbevo(objArr, j13);
        return objGxszxtbevo instanceof iobyxmoadg ? ((iobyxmoadg) objGxszxtbevo).f106997jyumaefscl : objGxszxtbevo;
    }

    private final boolean kegysxyocb(Object obj) {
        if (this.f106989cqumvgiudr == 0) {
            return true;
        }
        lmojexxdyd(obj);
        int i13 = this.f106988cdpycssgdh + 1;
        this.f106988cdpycssgdh = i13;
        if (i13 > this.f106989cqumvgiudr) {
            cdpycssgdh();
        }
        this.f106991istkbnxepw = pkzmftpjix() + ((long) this.f106988cdpycssgdh);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:15:0x003b, B:32:0x0092, B:34:0x009a, B:38:0x00ad, B:39:0x00b0, B:22:0x005d), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:15:0x003b, B:32:0x0092, B:34:0x009a, B:38:0x00ad, B:39:0x00b0, B:22:0x005d), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, sj.nufgyqmvbu] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [tj.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, sj.lmojexxdyd] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [sj.nufgyqmvbu] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [tj.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, sj.ylkuphrtab] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [sj.ylkuphrtab] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00be -> B:16:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:34:0x009a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    static /* synthetic */ java.lang.Object lereixgezr(sj.lmojexxdyd r8, sj.nufgyqmvbu r9, lg.gxszxtbevo r10) {
        /*
            boolean r0 = r10 instanceof sj.lmojexxdyd.ppxfxbqfkf
            if (r0 == 0) goto L13
            r0 = r10
            sj.lmojexxdyd$ppxfxbqfkf r0 = (sj.lmojexxdyd.ppxfxbqfkf) r0
            int r1 = r0.f107004lereixgezr
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f107004lereixgezr = r1
            goto L18
        L13:
            sj.lmojexxdyd$ppxfxbqfkf r0 = new sj.lmojexxdyd$ppxfxbqfkf
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f107000cqumvgiudr
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.f107004lereixgezr
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L77
            r8 = 1
            if (r2 == r8) goto L61
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.f107002iwizpuwonk
            pj.auzgnhcxok r8 = (pj.auzgnhcxok) r8
            java.lang.Object r9 = r0.f107003jyumaefscl
            sj.ylkuphrtab r9 = (sj.ylkuphrtab) r9
            java.lang.Object r2 = r0.f107005yggfygwlhe
            sj.nufgyqmvbu r2 = (sj.nufgyqmvbu) r2
            java.lang.Object r5 = r0.f107006zdlpuopuiu
            sj.lmojexxdyd r5 = (sj.lmojexxdyd) r5
            gg.zdlpuopuiu.zoijcleaow(r10)     // Catch: java.lang.Throwable -> L42
        L3e:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L8f
        L42:
            r8 = move-exception
            goto Lc4
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.f107002iwizpuwonk
            pj.auzgnhcxok r8 = (pj.auzgnhcxok) r8
            java.lang.Object r9 = r0.f107003jyumaefscl
            sj.ylkuphrtab r9 = (sj.ylkuphrtab) r9
            java.lang.Object r2 = r0.f107005yggfygwlhe
            sj.nufgyqmvbu r2 = (sj.nufgyqmvbu) r2
            java.lang.Object r5 = r0.f107006zdlpuopuiu
            sj.lmojexxdyd r5 = (sj.lmojexxdyd) r5
            gg.zdlpuopuiu.zoijcleaow(r10)     // Catch: java.lang.Throwable -> L42
            goto L92
        L61:
            java.lang.Object r8 = r0.f107003jyumaefscl
            r9 = r8
            sj.ylkuphrtab r9 = (sj.ylkuphrtab) r9
            java.lang.Object r8 = r0.f107005yggfygwlhe
            sj.nufgyqmvbu r8 = (sj.nufgyqmvbu) r8
            java.lang.Object r2 = r0.f107006zdlpuopuiu
            sj.lmojexxdyd r2 = (sj.lmojexxdyd) r2
            gg.zdlpuopuiu.zoijcleaow(r10)     // Catch: java.lang.Throwable -> L74
            r10 = r8
            r8 = r2
            goto L83
        L74:
            r8 = move-exception
            r5 = r2
            goto Lc4
        L77:
            gg.zdlpuopuiu.zoijcleaow(r10)
            tj.ppxfxbqfkf r10 = r8.eablkybsjg()
            sj.ylkuphrtab r10 = (sj.ylkuphrtab) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L83:
            lg.btonecajqb r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lc1
            pj.auzgnhcxok$zoijcleaow r5 = pj.auzgnhcxok.f76671gtknphoqwx     // Catch: java.lang.Throwable -> Lc1
            lg.btonecajqb$zoijcleaow r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lc1
            pj.auzgnhcxok r2 = (pj.auzgnhcxok) r2     // Catch: java.lang.Throwable -> Lc1
        L8f:
            r5 = r8
            r8 = r2
            r2 = r10
        L92:
            java.lang.Object r10 = r5.mbcevpiqjq(r9)     // Catch: java.lang.Throwable -> L42
            uj.istkbnxepw r6 = sj.wwaezpbzkn.f107053iobyxmoadg     // Catch: java.lang.Throwable -> L42
            if (r10 != r6) goto Lab
            r0.f107006zdlpuopuiu = r5     // Catch: java.lang.Throwable -> L42
            r0.f107005yggfygwlhe = r2     // Catch: java.lang.Throwable -> L42
            r0.f107003jyumaefscl = r9     // Catch: java.lang.Throwable -> L42
            r0.f107002iwizpuwonk = r8     // Catch: java.lang.Throwable -> L42
            r0.f107004lereixgezr = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r5.iwizpuwonk(r9, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L92
            return r1
        Lab:
            if (r8 == 0) goto Lb0
            pj.dvvnrvtcbc.btonecajqb(r8)     // Catch: java.lang.Throwable -> L42
        Lb0:
            r0.f107006zdlpuopuiu = r5     // Catch: java.lang.Throwable -> L42
            r0.f107005yggfygwlhe = r2     // Catch: java.lang.Throwable -> L42
            r0.f107003jyumaefscl = r9     // Catch: java.lang.Throwable -> L42
            r0.f107002iwizpuwonk = r8     // Catch: java.lang.Throwable -> L42
            r0.f107004lereixgezr = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L3e
            return r1
        Lc1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lc4:
            r5.dxjokdxxww(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.lmojexxdyd.lereixgezr(sj.lmojexxdyd, sj.nufgyqmvbu, lg.gxszxtbevo):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lmojexxdyd(Object obj) {
        int iDsvhmnatus = dsvhmnatus();
        Object[] objArrWypolnanlu = this.f106993pmvmpeiblj;
        if (objArrWypolnanlu == null) {
            objArrWypolnanlu = wypolnanlu(null, 0, 2);
        } else if (iDsvhmnatus >= objArrWypolnanlu.length) {
            objArrWypolnanlu = wypolnanlu(objArrWypolnanlu, iDsvhmnatus, objArrWypolnanlu.length * 2);
        }
        wwaezpbzkn.lqeggnwhkg(objArrWypolnanlu, pkzmftpjix() + ((long) iDsvhmnatus), obj);
    }

    private final Object mbcevpiqjq(ylkuphrtab ylkuphrtabVar) {
        Object obj;
        lg.gxszxtbevo[] gxszxtbevoVarArrUlzqkzuiru = tj.zoijcleaow.f110717iobyxmoadg;
        synchronized (this) {
            try {
                long jTzroggbefp = tzroggbefp(ylkuphrtabVar);
                if (jTzroggbefp < 0) {
                    obj = wwaezpbzkn.f107053iobyxmoadg;
                } else {
                    long j13 = ylkuphrtabVar.f107102iobyxmoadg;
                    Object objJpowsppfya = jpowsppfya(jTzroggbefp);
                    ylkuphrtabVar.f107102iobyxmoadg = jTzroggbefp + 1;
                    gxszxtbevoVarArrUlzqkzuiru = ulzqkzuiru(j13);
                    obj = objJpowsppfya;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (lg.gxszxtbevo gxszxtbevoVar : gxszxtbevoVarArrUlzqkzuiru) {
            if (gxszxtbevoVar != null) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                gxszxtbevoVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
            }
        }
        return obj;
    }

    private final void ntlheqmsrt(long j13, long j14, long j15, long j16) {
        long jMin = Math.min(j14, j13);
        for (long jPkzmftpjix = pkzmftpjix(); jPkzmftpjix < jMin; jPkzmftpjix++) {
            Object[] objArr = this.f106993pmvmpeiblj;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objArr);
            wwaezpbzkn.lqeggnwhkg(objArr, jPkzmftpjix, null);
        }
        this.f106995zynmafqrjb = j13;
        this.f106991istkbnxepw = j14;
        this.f106988cdpycssgdh = (int) (j15 - jMin);
        this.f106994yadqdtsiqt = (int) (j16 - j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long pkzmftpjix() {
        return Math.min(this.f106991istkbnxepw, this.f106995zynmafqrjb);
    }

    private final void pmvmpeiblj(long j13) {
        tj.ppxfxbqfkf[] ppxfxbqfkfVarArr;
        if (((tj.iobyxmoadg) this).f110685yggfygwlhe != 0 && (ppxfxbqfkfVarArr = ((tj.iobyxmoadg) this).f110686zdlpuopuiu) != null) {
            for (tj.ppxfxbqfkf ppxfxbqfkfVar : ppxfxbqfkfVarArr) {
                if (ppxfxbqfkfVar != null) {
                    ylkuphrtab ylkuphrtabVar = (ylkuphrtab) ppxfxbqfkfVar;
                    long j14 = ylkuphrtabVar.f107102iobyxmoadg;
                    if (j14 >= 0 && j14 < j13) {
                        ylkuphrtabVar.f107102iobyxmoadg = j13;
                    }
                }
            }
        }
        this.f106991istkbnxepw = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean stevsuqkhv(Object obj) {
        if (gtknphoqwx() == 0) {
            return kegysxyocb(obj);
        }
        if (this.f106988cdpycssgdh >= this.f106990esjtqupxsv && this.f106991istkbnxepw <= this.f106995zynmafqrjb) {
            int i13 = zoijcleaow.f107007iobyxmoadg[this.f106992lereixgezr.ordinal()];
            if (i13 == 1) {
                return false;
            }
            if (i13 == 2) {
                return true;
            }
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        lmojexxdyd(obj);
        int i14 = this.f106988cdpycssgdh + 1;
        this.f106988cdpycssgdh = i14;
        if (i14 > this.f106990esjtqupxsv) {
            cdpycssgdh();
        }
        if (cllcsxoeiz() > this.f106989cqumvgiudr) {
            ntlheqmsrt(this.f106995zynmafqrjb + 1, this.f106991istkbnxepw, ylkuphrtab(), hkdspvbjdz());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tzroggbefp(ylkuphrtab ylkuphrtabVar) {
        long j13 = ylkuphrtabVar.f107102iobyxmoadg;
        if (j13 < ylkuphrtab()) {
            return j13;
        }
        if (this.f106990esjtqupxsv <= 0 && j13 <= pkzmftpjix() && this.f106994yadqdtsiqt != 0) {
            return j13;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [lg.gxszxtbevo[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final lg.gxszxtbevo[] wwaezpbzkn(lg.gxszxtbevo[] gxszxtbevoVarArr) {
        tj.ppxfxbqfkf[] ppxfxbqfkfVarArr;
        ylkuphrtab ylkuphrtabVar;
        lg.gxszxtbevo gxszxtbevoVar;
        int length = gxszxtbevoVarArr.length;
        if (((tj.iobyxmoadg) this).f110685yggfygwlhe != 0 && (ppxfxbqfkfVarArr = ((tj.iobyxmoadg) this).f110686zdlpuopuiu) != null) {
            int length2 = ppxfxbqfkfVarArr.length;
            int i13 = 0;
            while (i13 < length2) {
                tj.ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkfVarArr[i13];
                if (ppxfxbqfkfVar == null || (gxszxtbevoVar = (ylkuphrtabVar = (ylkuphrtab) ppxfxbqfkfVar).f107103zoijcleaow) == null || tzroggbefp(ylkuphrtabVar) < 0) {
                    gxszxtbevoVarArr = gxszxtbevoVarArr;
                } else {
                    if (length >= gxszxtbevoVarArr.length) {
                        gxszxtbevoVarArr = gxszxtbevoVarArr;
                        gxszxtbevoVarArr = gxszxtbevoVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) gxszxtbevoVarArr, Math.max(2, gxszxtbevoVarArr.length * 2));
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
                        gxszxtbevoVarArr = objArrCopyOf;
                    }
                    gxszxtbevoVarArr = gxszxtbevoVarArr;
                    gxszxtbevoVarArr = gxszxtbevoVarArr;
                    ((lg.gxszxtbevo[]) gxszxtbevoVarArr)[length] = gxszxtbevoVar;
                    ylkuphrtabVar.f107103zoijcleaow = null;
                    length++;
                }
                i13++;
                gxszxtbevoVarArr = gxszxtbevoVarArr;
            }
            gxszxtbevoVarArr = gxszxtbevoVarArr;
        }
        return (lg.gxszxtbevo[]) gxszxtbevoVarArr;
    }

    private final Object[] wypolnanlu(Object[] objArr, int i13, int i14) {
        if (i14 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i14];
        this.f106993pmvmpeiblj = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jPkzmftpjix = pkzmftpjix();
        for (int i15 = 0; i15 < i13; i15++) {
            long j13 = ((long) i15) + jPkzmftpjix;
            wwaezpbzkn.lqeggnwhkg(objArr2, j13, wwaezpbzkn.gxszxtbevo(objArr, j13));
        }
        return objArr2;
    }

    static /* synthetic */ Object yadqdtsiqt(lmojexxdyd lmojexxdydVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        Object objIozdgvuglv;
        return (!lmojexxdydVar.iobyxmoadg(obj) && (objIozdgvuglv = lmojexxdydVar.iozdgvuglv(obj, gxszxtbevoVar)) == mg.zoijcleaow.gxszxtbevo()) ? objIozdgvuglv : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final long ylkuphrtab() {
        return pkzmftpjix() + ((long) this.f106988cdpycssgdh);
    }

    @Override // sj.pmvmpeiblj
    public void btonecajqb() {
        synchronized (this) {
            ntlheqmsrt(ylkuphrtab(), this.f106991istkbnxepw, ylkuphrtab(), hkdspvbjdz());
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    @Override // sj.iozdgvuglv, sj.lqeggnwhkg
    public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        return lereixgezr(this, nufgyqmvbuVar, gxszxtbevoVar);
    }

    @Override // sj.pmvmpeiblj, sj.nufgyqmvbu
    public Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return yadqdtsiqt(this, obj, gxszxtbevoVar);
    }

    protected final Object hcddaimhww() {
        Object[] objArr = this.f106993pmvmpeiblj;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objArr);
        return wwaezpbzkn.gxszxtbevo(objArr, (this.f106995zynmafqrjb + ((long) cllcsxoeiz())) - 1);
    }

    @Override // sj.pmvmpeiblj
    public boolean iobyxmoadg(Object obj) {
        int i13;
        boolean z13;
        lg.gxszxtbevo[] gxszxtbevoVarArrWwaezpbzkn = tj.zoijcleaow.f110717iobyxmoadg;
        synchronized (this) {
            if (stevsuqkhv(obj)) {
                gxszxtbevoVarArrWwaezpbzkn = wwaezpbzkn(gxszxtbevoVarArrWwaezpbzkn);
                z13 = true;
            } else {
                z13 = false;
            }
        }
        for (lg.gxszxtbevo gxszxtbevoVar : gxszxtbevoVarArrWwaezpbzkn) {
            if (gxszxtbevoVar != null) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                gxszxtbevoVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
            }
        }
        return z13;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tj.iobyxmoadg
    /* JADX INFO: renamed from: istkbnxepw, reason: merged with bridge method [inline-methods] */
    public ylkuphrtab[] nufgyqmvbu(int i13) {
        return new ylkuphrtab[i13];
    }

    public final long sopmlzcsov() {
        long j13 = this.f106995zynmafqrjb;
        if (j13 < this.f106991istkbnxepw) {
            this.f106991istkbnxepw = j13;
        }
        return j13;
    }

    public final lg.gxszxtbevo[] ulzqkzuiru(long j13) {
        long j14;
        long j15;
        long j16;
        tj.ppxfxbqfkf[] ppxfxbqfkfVarArr;
        if (j13 > this.f106991istkbnxepw) {
            return tj.zoijcleaow.f110717iobyxmoadg;
        }
        long jPkzmftpjix = pkzmftpjix();
        long j17 = ((long) this.f106988cdpycssgdh) + jPkzmftpjix;
        if (this.f106990esjtqupxsv == 0 && this.f106994yadqdtsiqt > 0) {
            j17++;
        }
        if (((tj.iobyxmoadg) this).f110685yggfygwlhe != 0 && (ppxfxbqfkfVarArr = ((tj.iobyxmoadg) this).f110686zdlpuopuiu) != null) {
            for (tj.ppxfxbqfkf ppxfxbqfkfVar : ppxfxbqfkfVarArr) {
                if (ppxfxbqfkfVar != null) {
                    long j18 = ((ylkuphrtab) ppxfxbqfkfVar).f107102iobyxmoadg;
                    if (j18 >= 0 && j18 < j17) {
                        j17 = j18;
                    }
                }
            }
        }
        if (j17 <= this.f106991istkbnxepw) {
            return tj.zoijcleaow.f110717iobyxmoadg;
        }
        long jYlkuphrtab = ylkuphrtab();
        int iMin = gtknphoqwx() > 0 ? Math.min(this.f106994yadqdtsiqt, this.f106990esjtqupxsv - ((int) (jYlkuphrtab - j17))) : this.f106994yadqdtsiqt;
        lg.gxszxtbevo[] gxszxtbevoVarArr = tj.zoijcleaow.f110717iobyxmoadg;
        long j19 = ((long) this.f106994yadqdtsiqt) + jYlkuphrtab;
        if (iMin > 0) {
            gxszxtbevoVarArr = new lg.gxszxtbevo[iMin];
            Object[] objArr = this.f106993pmvmpeiblj;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objArr);
            long j23 = jYlkuphrtab;
            int i13 = 0;
            while (true) {
                if (jYlkuphrtab >= j19) {
                    j14 = j17;
                    j15 = j19;
                    break;
                }
                Object objGxszxtbevo = wwaezpbzkn.gxszxtbevo(objArr, jYlkuphrtab);
                j14 = j17;
                uj.istkbnxepw istkbnxepwVar = wwaezpbzkn.f107053iobyxmoadg;
                if (objGxszxtbevo != istkbnxepwVar) {
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objGxszxtbevo, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    iobyxmoadg iobyxmoadgVar = (iobyxmoadg) objGxszxtbevo;
                    int i14 = i13 + 1;
                    j15 = j19;
                    gxszxtbevoVarArr[i13] = iobyxmoadgVar.f106996iwizpuwonk;
                    wwaezpbzkn.lqeggnwhkg(objArr, jYlkuphrtab, istkbnxepwVar);
                    wwaezpbzkn.lqeggnwhkg(objArr, j23, iobyxmoadgVar.f106997jyumaefscl);
                    j16 = 1;
                    j23++;
                    if (i14 >= iMin) {
                        break;
                    }
                    i13 = i14;
                } else {
                    j15 = j19;
                    j16 = 1;
                }
                jYlkuphrtab += j16;
                j17 = j14;
                j19 = j15;
            }
            jYlkuphrtab = j23;
        } else {
            j14 = j17;
            j15 = j19;
        }
        int i15 = (int) (jYlkuphrtab - jPkzmftpjix);
        long j24 = gtknphoqwx() == 0 ? jYlkuphrtab : j14;
        long jMax = Math.max(this.f106995zynmafqrjb, jYlkuphrtab - ((long) Math.min(this.f106989cqumvgiudr, i15)));
        if (this.f106990esjtqupxsv == 0 && jMax < j15) {
            Object[] objArr2 = this.f106993pmvmpeiblj;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objArr2);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wwaezpbzkn.gxszxtbevo(objArr2, jMax), wwaezpbzkn.f107053iobyxmoadg)) {
                jYlkuphrtab++;
                jMax++;
            }
        }
        ntlheqmsrt(jMax, j24, jYlkuphrtab, j15);
        esjtqupxsv();
        return !(gxszxtbevoVarArr.length == 0) ? wwaezpbzkn(gxszxtbevoVarArr) : gxszxtbevoVarArr;
    }

    @Override // tj.rgvfuqvkyq
    public lqeggnwhkg zoijcleaow(lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        return wwaezpbzkn.eablkybsjg(this, btonecajqbVar, i13, iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tj.iobyxmoadg
    /* JADX INFO: renamed from: zynmafqrjb, reason: merged with bridge method [inline-methods] */
    public ylkuphrtab gxszxtbevo() {
        return new ylkuphrtab();
    }
}
