package pj;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f76705cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f76706iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f76707jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f76708yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f76709zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f76706iwizpuwonk = obj;
            this.f76705cqumvgiudr |= Integer.MIN_VALUE;
            return gxszxtbevo.zoijcleaow(null, this);
        }
    }

    public static final Object iobyxmoadg(Collection collection, lg.gxszxtbevo gxszxtbevoVar) {
        return collection.isEmpty() ? hg.jyumaefscl.wflxmlrfwp() : new eablkybsjg((ntlheqmsrt[]) collection.toArray(new ntlheqmsrt[0])).ppxfxbqfkf(gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object zoijcleaow(pj.auzgnhcxok[] r6, lg.gxszxtbevo r7) {
        /*
            boolean r0 = r7 instanceof pj.gxszxtbevo.iobyxmoadg
            if (r0 == 0) goto L13
            r0 = r7
            pj.gxszxtbevo$iobyxmoadg r0 = (pj.gxszxtbevo.iobyxmoadg) r0
            int r1 = r0.f76705cqumvgiudr
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f76705cqumvgiudr = r1
            goto L18
        L13:
            pj.gxszxtbevo$iobyxmoadg r0 = new pj.gxszxtbevo$iobyxmoadg
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f76706iwizpuwonk
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.f76705cqumvgiudr
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f76707jyumaefscl
            int r2 = r0.f76708yggfygwlhe
            java.lang.Object r4 = r0.f76709zdlpuopuiu
            pj.auzgnhcxok[] r4 = (pj.auzgnhcxok[]) r4
            gg.zdlpuopuiu.zoijcleaow(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            gg.zdlpuopuiu.zoijcleaow(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f76709zdlpuopuiu = r7
            r0.f76708yggfygwlhe = r2
            r0.f76707jyumaefscl = r6
            r0.f76705cqumvgiudr = r3
            java.lang.Object r4 = r4.wypolnanlu(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            gg.wwaezpbzkn r6 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pj.gxszxtbevo.zoijcleaow(pj.auzgnhcxok[], lg.gxszxtbevo):java.lang.Object");
    }
}
