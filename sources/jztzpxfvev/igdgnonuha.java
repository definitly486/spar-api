package jztzpxfvev;

import vipkmwdibw.p;
import vipkmwdibw.q;

/* JADX INFO: loaded from: classes.dex */
public final class igdgnonuha {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final iobyxmoadg f52697gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f52698lqeggnwhkg = 8;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final vipkmwdibw.ojitshcjhn f52699nufgyqmvbu = new vipkmwdibw.ojitshcjhn(0.0f);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f52700eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final q f52701iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f52703wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f52704zoijcleaow = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private vipkmwdibw.ojitshcjhn f52702ppxfxbqfkf = f52699nufgyqmvbu;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final boolean iobyxmoadg(float f13) {
            return Math.abs(f13) < 0.01f;
        }

        private iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f52706esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f52707iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        float f52708jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f52709yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f52710zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f52707iwizpuwonk = obj;
            this.f52706esjtqupxsv |= Integer.MIN_VALUE;
            return igdgnonuha.this.ppxfxbqfkf(null, null, this);
        }
    }

    public igdgnonuha(vipkmwdibw.gtknphoqwx gtknphoqwxVar) {
        this.f52701iobyxmoadg = gtknphoqwxVar.iobyxmoadg(p.dsvhmnatus(kotlin.jvm.internal.wflxmlrfwp.f60035iobyxmoadg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(igdgnonuha igdgnonuhaVar, tg.draadjrbmk draadjrbmkVar, long j13) {
        float f13 = igdgnonuhaVar.f52700eablkybsjg;
        igdgnonuhaVar.f52700eablkybsjg = 0.0f;
        draadjrbmkVar.invoke(Float.valueOf(f13));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wkgbmnqykc(igdgnonuha igdgnonuhaVar, float f13, tg.draadjrbmk draadjrbmkVar, long j13) {
        if (igdgnonuhaVar.f52704zoijcleaow == Long.MIN_VALUE) {
            igdgnonuhaVar.f52704zoijcleaow = j13;
        }
        vipkmwdibw.ojitshcjhn ojitshcjhnVar = new vipkmwdibw.ojitshcjhn(igdgnonuhaVar.f52700eablkybsjg);
        long jZoijcleaow = f13 == 0.0f ? igdgnonuhaVar.f52701iobyxmoadg.zoijcleaow(new vipkmwdibw.ojitshcjhn(igdgnonuhaVar.f52700eablkybsjg), f52699nufgyqmvbu, igdgnonuhaVar.f52702ppxfxbqfkf) : vg.iobyxmoadg.gxszxtbevo((j13 - igdgnonuhaVar.f52704zoijcleaow) / f13);
        q qVar = igdgnonuhaVar.f52701iobyxmoadg;
        vipkmwdibw.ojitshcjhn ojitshcjhnVar2 = f52699nufgyqmvbu;
        float fGxszxtbevo = ((vipkmwdibw.ojitshcjhn) qVar.lqeggnwhkg(jZoijcleaow, ojitshcjhnVar, ojitshcjhnVar2, igdgnonuhaVar.f52702ppxfxbqfkf)).gxszxtbevo();
        igdgnonuhaVar.f52702ppxfxbqfkf = (vipkmwdibw.ojitshcjhn) igdgnonuhaVar.f52701iobyxmoadg.gxszxtbevo(jZoijcleaow, ojitshcjhnVar, ojitshcjhnVar2, igdgnonuhaVar.f52702ppxfxbqfkf);
        igdgnonuhaVar.f52704zoijcleaow = j13;
        float f14 = igdgnonuhaVar.f52700eablkybsjg - fGxszxtbevo;
        igdgnonuhaVar.f52700eablkybsjg = fGxszxtbevo;
        draadjrbmkVar.invoke(Float.valueOf(f14));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void gxszxtbevo(float f13) {
        this.f52700eablkybsjg = f13;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: all -> 0x0035, PHI: r12 r13 r14
      0x0077: PHI (r12v4 float) = (r12v2 float), (r12v5 float) binds: [B:29:0x0071, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r13v6 tg.draadjrbmk) = (r13v2 tg.draadjrbmk), (r13v7 tg.draadjrbmk) binds: [B:29:0x0071, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r14v16 tg.iobyxmoadg) = (r14v8 tg.iobyxmoadg), (r14v17 tg.iobyxmoadg) binds: [B:29:0x0071, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00bb, B:20:0x004a, B:35:0x0095, B:30:0x0077, B:32:0x0081, B:37:0x009c, B:40:0x00a8), top: B:48:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00bb, B:20:0x004a, B:35:0x0095, B:30:0x0077, B:32:0x0081, B:37:0x009c, B:40:0x00a8), top: B:48:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0092 -> B:35:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object ppxfxbqfkf(tg.draadjrbmk r12, tg.iobyxmoadg r13, lg.gxszxtbevo r14) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jztzpxfvev.igdgnonuha.ppxfxbqfkf(tg.draadjrbmk, tg.iobyxmoadg, lg.gxszxtbevo):java.lang.Object");
    }
}
