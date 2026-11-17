package androidx.compose.foundation.relocation;

import g.lqeggnwhkg;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow implements zfvoamnweg.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f5279iobyxmoadg = new ipoelvxyzq.ppxfxbqfkf(new eablkybsjg[16], 0);

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f5280cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f5282iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f5283jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f5284lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f5285yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f5286zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f5280cqumvgiudr = obj;
            this.f5284lereixgezr |= Integer.MIN_VALUE;
            return zoijcleaow.this.zoijcleaow(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
        return lqeggnwhkgVar;
    }

    public final ipoelvxyzq.ppxfxbqfkf eablkybsjg() {
        return this.f5279iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:19:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // zfvoamnweg.iobyxmoadg
    public java.lang.Object zoijcleaow(g.lqeggnwhkg r10, lg.gxszxtbevo r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.relocation.zoijcleaow.iobyxmoadg
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.relocation.zoijcleaow$iobyxmoadg r0 = (androidx.compose.foundation.relocation.zoijcleaow.iobyxmoadg) r0
            int r1 = r0.f5284lereixgezr
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5284lereixgezr = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.zoijcleaow$iobyxmoadg r0 = new androidx.compose.foundation.relocation.zoijcleaow$iobyxmoadg
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f5280cqumvgiudr
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.f5284lereixgezr
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r10 = r0.f5282iwizpuwonk
            int r2 = r0.f5283jyumaefscl
            java.lang.Object r4 = r0.f5285yggfygwlhe
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f5286zdlpuopuiu
            g.lqeggnwhkg r5 = (g.lqeggnwhkg) r5
            gg.zdlpuopuiu.zoijcleaow(r11)
            r11 = r5
            goto L6c
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            gg.zdlpuopuiu.zoijcleaow(r11)
            ipoelvxyzq.ppxfxbqfkf r11 = r9.f5279iobyxmoadg
            java.lang.Object[] r2 = r11.f49169zdlpuopuiu
            int r11 = r11.draadjrbmk()
            r4 = 0
            r7 = r11
            r11 = r10
            r10 = r7
            r8 = r4
            r4 = r2
            r2 = r8
        L50:
            if (r2 >= r10) goto L6e
            r5 = r4[r2]
            androidx.compose.foundation.relocation.eablkybsjg r5 = (androidx.compose.foundation.relocation.eablkybsjg) r5
            androidx.compose.foundation.relocation.iobyxmoadg r6 = new androidx.compose.foundation.relocation.iobyxmoadg
            r6.<init>()
            r0.f5286zdlpuopuiu = r11
            r0.f5285yggfygwlhe = r4
            r0.f5283jyumaefscl = r2
            r0.f5282iwizpuwonk = r10
            r0.f5284lereixgezr = r3
            java.lang.Object r5 = d0.zoijcleaow.iobyxmoadg(r5, r6, r0)
            if (r5 != r1) goto L6c
            return r1
        L6c:
            int r2 = r2 + r3
            goto L50
        L6e:
            gg.wwaezpbzkn r10 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.zoijcleaow.zoijcleaow(g.lqeggnwhkg, lg.gxszxtbevo):java.lang.Object");
    }
}
