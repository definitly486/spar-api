package uh0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import tg.kcexrzcfyt;
import vh0.eablkybsjg;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements kcexrzcfyt {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final eablkybsjg f113578yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final uh0.iobyxmoadg f113579zdlpuopuiu;

    static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        boolean f113580cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f113581cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        Object f113582esjtqupxsv;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        int f113583iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        Object f113584istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f113585iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f113586jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        Object f113587lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        /* synthetic */ Object f113588lmojexxdyd;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        Object f113589pmvmpeiblj;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        int f113591yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f113592yggfygwlhe;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        int f113593ylkuphrtab;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f113594zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        Object f113595zynmafqrjb;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f113588lmojexxdyd = obj;
            this.f113593ylkuphrtab |= Integer.MIN_VALUE;
            return zoijcleaow.this.zoijcleaow(false, 0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: uh0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2816zoijcleaow implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(((q00.zoijcleaow) obj).rgvfuqvkyq()), Integer.valueOf(((q00.zoijcleaow) obj2).rgvfuqvkyq()));
        }
    }

    public zoijcleaow(uh0.iobyxmoadg bannerListToUiModelList, eablkybsjg featuresUiMapper) {
        zdlpuopuiu.btonecajqb(bannerListToUiModelList, "bannerListToUiModelList");
        zdlpuopuiu.btonecajqb(featuresUiMapper, "featuresUiMapper");
        this.f113579zdlpuopuiu = bannerListToUiModelList;
        this.f113578yggfygwlhe = featuresUiMapper;
    }

    private final List btonecajqb(List list) {
        return jyumaefscl.d(list, new C2816zoijcleaow());
    }

    private final Object eablkybsjg(xg0.iobyxmoadg iobyxmoadgVar, boolean z13, int i13, String str, String str2, gxszxtbevo gxszxtbevoVar) {
        return this.f113578yggfygwlhe.wkgbmnqykc(btonecajqb(iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), z13)), i13, str, str2, gxszxtbevoVar);
    }

    private final nb0.wkgbmnqykc gxszxtbevo(xg0.iobyxmoadg iobyxmoadgVar, boolean z13, Integer num) {
        return new nb0.wkgbmnqykc(iobyxmoadgVar.ppxfxbqfkf(), this.f113579zdlpuopuiu.zoijcleaow(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.ppxfxbqfkf(), num, btonecajqb(iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), z13))));
    }

    private final List iobyxmoadg(List list, boolean z13) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            q00.zoijcleaow zoijcleaowVar = (q00.zoijcleaow) obj;
            if (z13 || !ppxfxbqfkf(zoijcleaowVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    static /* synthetic */ nb0.wkgbmnqykc lqeggnwhkg(zoijcleaow zoijcleaowVar, xg0.iobyxmoadg iobyxmoadgVar, boolean z13, Integer num, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            num = null;
        }
        return zoijcleaowVar.gxszxtbevo(iobyxmoadgVar, z13, num);
    }

    private final boolean ppxfxbqfkf(q00.zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar.draadjrbmk() == f40.zoijcleaow.PARTNERS || zoijcleaowVar.draadjrbmk() == f40.zoijcleaow.PARTNER;
    }

    @Override // tg.kcexrzcfyt
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zoijcleaow(((Boolean) obj).booleanValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj4, (gxszxtbevo) obj5);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:19:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:26:0x010b A[PHI: r14 r19 r20 r21 r27
      0x010b: PHI (r14v13 kotlin.jvm.internal.hkdspvbjdz) = (r14v11 kotlin.jvm.internal.hkdspvbjdz), (r14v14 kotlin.jvm.internal.hkdspvbjdz) binds: [B:31:0x0145, B:25:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r19v15 kotlin.jvm.internal.hkdspvbjdz) = (r19v11 kotlin.jvm.internal.hkdspvbjdz), (r19v17 kotlin.jvm.internal.hkdspvbjdz) binds: [B:31:0x0145, B:25:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r20v17 kotlin.jvm.internal.hkdspvbjdz) = (r20v13 kotlin.jvm.internal.hkdspvbjdz), (r20v19 kotlin.jvm.internal.hkdspvbjdz) binds: [B:31:0x0145, B:25:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r21v8 kotlin.jvm.internal.hkdspvbjdz) = (r21v7 kotlin.jvm.internal.hkdspvbjdz), (r21v9 kotlin.jvm.internal.hkdspvbjdz) binds: [B:31:0x0145, B:25:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r27v12 kotlin.jvm.internal.hkdspvbjdz) = (r27v8 kotlin.jvm.internal.hkdspvbjdz), (r27v17 kotlin.jvm.internal.hkdspvbjdz) binds: [B:31:0x0145, B:25:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0123  */
    /* JADX WARN: Code duplicated, block: B:30:0x0136  */
    /* JADX WARN: Code duplicated, block: B:33:0x0148  */
    /* JADX WARN: Code duplicated, block: B:34:0x0171  */
    /* JADX WARN: Code duplicated, block: B:36:0x0186 A[PHI: r7 r8 r9 r19 r20 r21 r22 r23
      0x0186: PHI (r7v14 java.util.Iterator) = (r7v13 java.util.Iterator), (r7v16 java.util.Iterator) binds: [B:39:0x01d0, B:35:0x0184] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r8v12 kotlin.jvm.internal.hkdspvbjdz) = (r8v11 kotlin.jvm.internal.hkdspvbjdz), (r8v13 kotlin.jvm.internal.hkdspvbjdz) binds: [B:39:0x01d0, B:35:0x0184] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r9v15 kotlin.jvm.internal.hkdspvbjdz) = (r9v14 kotlin.jvm.internal.hkdspvbjdz), (r9v17 kotlin.jvm.internal.hkdspvbjdz) binds: [B:39:0x01d0, B:35:0x0184] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r19v8 kotlin.jvm.internal.hkdspvbjdz) = (r19v7 kotlin.jvm.internal.hkdspvbjdz), (r19v9 kotlin.jvm.internal.hkdspvbjdz) binds: [B:39:0x01d0, B:35:0x0184] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r20v10 kotlin.jvm.internal.hkdspvbjdz) = (r20v9 kotlin.jvm.internal.hkdspvbjdz), (r20v11 kotlin.jvm.internal.hkdspvbjdz) binds: [B:39:0x01d0, B:35:0x0184] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r21v5 kotlin.jvm.internal.hkdspvbjdz) = (r21v4 kotlin.jvm.internal.hkdspvbjdz), (r21v6 kotlin.jvm.internal.hkdspvbjdz) binds: [B:39:0x01d0, B:35:0x0184] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r22v5 kotlin.jvm.internal.hkdspvbjdz) = (r22v4 kotlin.jvm.internal.hkdspvbjdz), (r22v6 kotlin.jvm.internal.hkdspvbjdz) binds: [B:39:0x01d0, B:35:0x0184] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r23v5 kotlin.jvm.internal.hkdspvbjdz) = (r23v4 kotlin.jvm.internal.hkdspvbjdz), (r23v6 kotlin.jvm.internal.hkdspvbjdz) binds: [B:39:0x01d0, B:35:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0195  */
    /* JADX WARN: Code duplicated, block: B:38:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x01e0 A[PHI: r7 r8 r9 r14 r20 r21 r22 r23
      0x01e0: PHI (r7v11 java.util.Iterator) = (r7v8 java.util.Iterator), (r7v13 java.util.Iterator) binds: [B:44:0x0207, B:41:0x01d3] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r8v10 kotlin.jvm.internal.hkdspvbjdz) = (r8v8 kotlin.jvm.internal.hkdspvbjdz), (r8v11 kotlin.jvm.internal.hkdspvbjdz) binds: [B:44:0x0207, B:41:0x01d3] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r9v12 kotlin.jvm.internal.hkdspvbjdz) = (r9v9 kotlin.jvm.internal.hkdspvbjdz), (r9v14 kotlin.jvm.internal.hkdspvbjdz) binds: [B:44:0x0207, B:41:0x01d3] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r14v8 kotlin.jvm.internal.hkdspvbjdz) = (r14v5 kotlin.jvm.internal.hkdspvbjdz), (r14v9 kotlin.jvm.internal.hkdspvbjdz) binds: [B:44:0x0207, B:41:0x01d3] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r20v7 kotlin.jvm.internal.hkdspvbjdz) = (r20v5 kotlin.jvm.internal.hkdspvbjdz), (r20v9 kotlin.jvm.internal.hkdspvbjdz) binds: [B:44:0x0207, B:41:0x01d3] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r21v3 kotlin.jvm.internal.hkdspvbjdz) = (r21v2 kotlin.jvm.internal.hkdspvbjdz), (r21v4 kotlin.jvm.internal.hkdspvbjdz) binds: [B:44:0x0207, B:41:0x01d3] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r22v3 kotlin.jvm.internal.hkdspvbjdz) = (r22v2 kotlin.jvm.internal.hkdspvbjdz), (r22v4 kotlin.jvm.internal.hkdspvbjdz) binds: [B:44:0x0207, B:41:0x01d3] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r23v3 kotlin.jvm.internal.hkdspvbjdz) = (r23v2 kotlin.jvm.internal.hkdspvbjdz), (r23v4 kotlin.jvm.internal.hkdspvbjdz) binds: [B:44:0x0207, B:41:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0255 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0256  */
    /* JADX WARN: Code duplicated, block: B:51:0x027d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0295 A[PHI: r1 r2 r7 r8 r9 r15 r17 r18 r19 r20 r27
      0x0295: PHI (r1v10 kotlin.jvm.internal.hkdspvbjdz) = (r1v9 kotlin.jvm.internal.hkdspvbjdz), (r1v11 kotlin.jvm.internal.hkdspvbjdz) binds: [B:56:0x02bd, B:52:0x0293] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r2v8 kotlin.jvm.internal.hkdspvbjdz) = (r2v7 kotlin.jvm.internal.hkdspvbjdz), (r2v9 kotlin.jvm.internal.hkdspvbjdz) binds: [B:56:0x02bd, B:52:0x0293] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r7v6 kotlin.jvm.internal.hkdspvbjdz) = (r7v5 kotlin.jvm.internal.hkdspvbjdz), (r7v7 kotlin.jvm.internal.hkdspvbjdz) binds: [B:56:0x02bd, B:52:0x0293] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r8v6 kotlin.jvm.internal.hkdspvbjdz) = (r8v5 kotlin.jvm.internal.hkdspvbjdz), (r8v7 kotlin.jvm.internal.hkdspvbjdz) binds: [B:56:0x02bd, B:52:0x0293] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r9v7 kotlin.jvm.internal.hkdspvbjdz) = (r9v6 kotlin.jvm.internal.hkdspvbjdz), (r9v8 kotlin.jvm.internal.hkdspvbjdz) binds: [B:56:0x02bd, B:52:0x0293] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r15v5 kotlin.jvm.internal.hkdspvbjdz) = (r15v3 kotlin.jvm.internal.hkdspvbjdz), (r15v6 kotlin.jvm.internal.hkdspvbjdz) binds: [B:56:0x02bd, B:52:0x0293] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r17v3 java.util.Iterator) = (r17v2 java.util.Iterator), (r17v4 java.util.Iterator) binds: [B:56:0x02bd, B:52:0x0293] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r18v3 kotlin.jvm.internal.hkdspvbjdz) = (r18v2 kotlin.jvm.internal.hkdspvbjdz), (r18v4 kotlin.jvm.internal.hkdspvbjdz) binds: [B:56:0x02bd, B:52:0x0293] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r19v3 int) = (r19v2 int), (r19v4 int) binds: [B:56:0x02bd, B:52:0x0293] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r20v3 uh0.zoijcleaow) = (r20v2 uh0.zoijcleaow), (r20v4 uh0.zoijcleaow) binds: [B:56:0x02bd, B:52:0x0293] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r27v2 int) = (r27v1 int), (r27v3 int) binds: [B:56:0x02bd, B:52:0x0293] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0297  */
    /* JADX WARN: Code duplicated, block: B:55:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0256 -> B:50:0x026a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:36:0x0186
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object zoijcleaow(boolean r27, int r28, int r29, java.util.List r30, lg.gxszxtbevo r31) {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uh0.zoijcleaow.zoijcleaow(boolean, int, int, java.util.List, lg.gxszxtbevo):java.lang.Object");
    }
}
