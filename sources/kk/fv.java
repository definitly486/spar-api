package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class fv extends ui {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final g80 f56595iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final jlmebxxoox f56596zoijcleaow;

    public fv(g80 lazyNetworkModule, jlmebxxoox sPayDataContract) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lazyNetworkModule, "lazyNetworkModule");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        this.f56595iobyxmoadg = lazyNetworkModule;
        this.f56596zoijcleaow = sPayDataContract;
    }

    @Override // kk.ui
    public final /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return ppxfxbqfkf((jw) obj, gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:24:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0051
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object ppxfxbqfkf(kk.jw r9, lg.gxszxtbevo r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kk.bu
            if (r0 == 0) goto L13
            r0 = r10
            kk.bu r0 = (kk.bu) r0
            int r1 = r0.f56057lereixgezr
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56057lereixgezr = r1
            goto L18
        L13:
            kk.bu r0 = new kk.bu
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f56053cqumvgiudr
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.f56057lereixgezr
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.String r9 = r0.f56055iwizpuwonk
            java.util.Iterator r2 = r0.f56056jyumaefscl
            java.util.Map r5 = r0.f56058yggfygwlhe
            kk.fv r6 = r0.f56059zdlpuopuiu
            gg.zdlpuopuiu.zoijcleaow(r10)
            goto L75
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            gg.zdlpuopuiu.zoijcleaow(r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.List r9 = r9.f57230iobyxmoadg
            java.util.Iterator r9 = r9.iterator()
            r6 = r8
            r2 = r9
            r5 = r10
        L4b:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L97
            java.lang.Object r9 = r2.next()
            java.lang.String r9 = (java.lang.String) r9
            kk.g80 r10 = r6.f56595iobyxmoadg
            kk.km r10 = r10.f56667eablkybsjg
            if (r10 == 0) goto L5e
            goto L64
        L5e:
            java.lang.String r10 = "pageTitleApi"
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj(r10)
            r10 = r3
        L64:
            r0.f56059zdlpuopuiu = r6
            r0.f56058yggfygwlhe = r5
            r0.f56056jyumaefscl = r2
            r0.f56055iwizpuwonk = r9
            r0.f56057lereixgezr = r4
            java.lang.Object r10 = r10.zoijcleaow(r9, r0)
            if (r10 != r1) goto L75
            return r1
        L75:
            lm.kcexrzcfyt r10 = (lm.kcexrzcfyt) r10
            boolean r7 = r10.gxszxtbevo()
            if (r7 == 0) goto L4b
            java.lang.Object r10 = r10.iobyxmoadg()
            kk.iv r10 = (kk.iv) r10
            if (r10 == 0) goto L8e
            xl.gxszxtbevo r10 = r10.f57098iobyxmoadg
            if (r10 == 0) goto L8e
            java.lang.String r10 = r10.I()
            goto L8f
        L8e:
            r10 = r3
        L8f:
            if (r10 != 0) goto L93
            java.lang.String r10 = ""
        L93:
            r5.put(r9, r10)
            goto L4b
        L97:
            kk.jlmebxxoox r9 = r6.f56596zoijcleaow
            kk.auzgnhcxok r9 = (kk.auzgnhcxok) r9
            r9.getClass()
            java.lang.String r10 = "linksWithTitles"
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(r5, r10)
            sj.zynmafqrjb r9 = r9.f55850gtknphoqwx
            r9.setValue(r5)
            gg.wwaezpbzkn r9 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.fv.ppxfxbqfkf(kk.jw, lg.gxszxtbevo):java.lang.Object");
    }
}
