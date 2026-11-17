package n21;

import androidx.fragment.app.FragmentManager;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import pj.crxdokpmqz;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: n21.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1476iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f68444iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f68445jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f68446yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f68447zdlpuopuiu;

        C1476iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f68445jyumaefscl = obj;
            this.f68444iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.iobyxmoadg(null, false, null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f68448cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f68449iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        long f68450jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f68451yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f68452zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f68449iwizpuwonk = obj;
            this.f68448cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.ppxfxbqfkf(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object iobyxmoadg(FragmentManager fragmentManager, boolean z13, draadjrbmk draadjrbmkVar, gxszxtbevo gxszxtbevoVar) {
        C1476iobyxmoadg c1476iobyxmoadg;
        if (gxszxtbevoVar instanceof C1476iobyxmoadg) {
            c1476iobyxmoadg = (C1476iobyxmoadg) gxszxtbevoVar;
            int i13 = c1476iobyxmoadg.f68444iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1476iobyxmoadg.f68444iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c1476iobyxmoadg = new C1476iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1476iobyxmoadg = new C1476iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c1476iobyxmoadg.f68445jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1476iobyxmoadg.f68444iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                draadjrbmk draadjrbmkVar2 = (draadjrbmk) c1476iobyxmoadg.f68446yggfygwlhe;
                FragmentManager fragmentManager2 = (FragmentManager) c1476iobyxmoadg.f68447zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                draadjrbmkVar = draadjrbmkVar2;
                fragmentManager = fragmentManager2;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(obj);
        if (!z13) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        while (fragmentManager.d()) {
            c1476iobyxmoadg.f68447zdlpuopuiu = fragmentManager;
            c1476iobyxmoadg.f68446yggfygwlhe = draadjrbmkVar;
            c1476iobyxmoadg.f68444iwizpuwonk = 1;
            if (crxdokpmqz.zoijcleaow(100L, c1476iobyxmoadg) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        c1476iobyxmoadg.f68447zdlpuopuiu = null;
        c1476iobyxmoadg.f68446yggfygwlhe = null;
        c1476iobyxmoadg.f68444iwizpuwonk = 2;
        if (draadjrbmkVar.invoke(c1476iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[PHI: r4 r10 r11
      0x0049: PHI (r4v1 long) = (r4v0 long), (r4v3 long) binds: [B:18:0x0047, B:36:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r10v3 androidx.fragment.app.Fragment) = (r10v0 androidx.fragment.app.Fragment), (r10v4 androidx.fragment.app.Fragment) binds: [B:18:0x0047, B:36:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v2 java.lang.String) binds: [B:18:0x0047, B:36:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0063 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008f -> B:35:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object ppxfxbqfkf(androidx.fragment.app.Fragment r10, java.lang.String r11, lg.gxszxtbevo r12) {
        /*
            boolean r0 = r12 instanceof n21.iobyxmoadg.zoijcleaow
            if (r0 == 0) goto L13
            r0 = r12
            n21.iobyxmoadg$zoijcleaow r0 = (n21.iobyxmoadg.zoijcleaow) r0
            int r1 = r0.f68448cqumvgiudr
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68448cqumvgiudr = r1
            goto L18
        L13:
            n21.iobyxmoadg$zoijcleaow r0 = new n21.iobyxmoadg$zoijcleaow
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f68449iwizpuwonk
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.f68448cqumvgiudr
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            long r10 = r0.f68450jyumaefscl
            java.lang.Object r2 = r0.f68451yggfygwlhe
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f68452zdlpuopuiu
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            gg.zdlpuopuiu.zoijcleaow(r12)
            r8 = r10
            r11 = r2
            r10 = r4
            r4 = r8
            goto L92
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            gg.zdlpuopuiu.zoijcleaow(r12)
            if (r11 != 0) goto L47
            gg.wwaezpbzkn r10 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r10
        L47:
            r4 = 0
        L49:
            androidx.fragment.app.FragmentManager r12 = r10.getChildFragmentManager()
            java.util.List r12 = r12.igdgnonuha()
            java.lang.String r2 = "getFragments(...)"
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(r12, r2)
            if (r12 == 0) goto L5f
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L5f
            goto L80
        L5f:
            java.util.Iterator r12 = r12.iterator()
        L63:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r12.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r6 = r2.getTag()
            boolean r6 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(r6, r11)
            if (r6 == 0) goto L63
            boolean r2 = r2.isVisible()
            if (r2 == 0) goto L63
            goto L98
        L80:
            r6 = 100
            long r4 = r4 + r6
            r0.f68452zdlpuopuiu = r10
            r0.f68451yggfygwlhe = r11
            r0.f68450jyumaefscl = r4
            r0.f68448cqumvgiudr = r3
            java.lang.Object r12 = pj.crxdokpmqz.zoijcleaow(r6, r0)
            if (r12 != r1) goto L92
            return r1
        L92:
            r6 = 500(0x1f4, double:2.47E-321)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 < 0) goto L49
        L98:
            gg.wwaezpbzkn r10 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n21.iobyxmoadg.ppxfxbqfkf(androidx.fragment.app.Fragment, java.lang.String, lg.gxszxtbevo):java.lang.Object");
    }

    public static /* synthetic */ Object zoijcleaow(FragmentManager fragmentManager, boolean z13, draadjrbmk draadjrbmkVar, gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        return iobyxmoadg(fragmentManager, z13, draadjrbmkVar, gxszxtbevoVar);
    }
}
