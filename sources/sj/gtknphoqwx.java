package sj;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class gtknphoqwx {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f106887cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f106888esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f106889iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f106890jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f106891yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f106892zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f106887cqumvgiudr = obj;
            this.f106888esjtqupxsv |= Integer.MIN_VALUE;
            return gtknphoqwx.ppxfxbqfkf(null, null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object ppxfxbqfkf(sj.nufgyqmvbu r6, rj.jyumaefscl r7, boolean r8, lg.gxszxtbevo r9) {
        /*
            boolean r0 = r9 instanceof sj.gtknphoqwx.iobyxmoadg
            if (r0 == 0) goto L13
            r0 = r9
            sj.gtknphoqwx$iobyxmoadg r0 = (sj.gtknphoqwx.iobyxmoadg) r0
            int r1 = r0.f106888esjtqupxsv
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106888esjtqupxsv = r1
            goto L18
        L13:
            sj.gtknphoqwx$iobyxmoadg r0 = new sj.gtknphoqwx$iobyxmoadg
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f106887cqumvgiudr
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.f106888esjtqupxsv
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f106889iwizpuwonk
            java.lang.Object r6 = r0.f106890jyumaefscl
            rj.dxjokdxxww r6 = (rj.dxjokdxxww) r6
            java.lang.Object r7 = r0.f106891yggfygwlhe
            rj.jyumaefscl r7 = (rj.jyumaefscl) r7
            java.lang.Object r2 = r0.f106892zdlpuopuiu
            sj.nufgyqmvbu r2 = (sj.nufgyqmvbu) r2
            gg.zdlpuopuiu.zoijcleaow(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f106889iwizpuwonk
            java.lang.Object r6 = r0.f106890jyumaefscl
            rj.dxjokdxxww r6 = (rj.dxjokdxxww) r6
            java.lang.Object r7 = r0.f106891yggfygwlhe
            rj.jyumaefscl r7 = (rj.jyumaefscl) r7
            java.lang.Object r2 = r0.f106892zdlpuopuiu
            sj.nufgyqmvbu r2 = (sj.nufgyqmvbu) r2
            gg.zdlpuopuiu.zoijcleaow(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            gg.zdlpuopuiu.zoijcleaow(r9)
            sj.dxjokdxxww.esjtqupxsv(r6)
            rj.dxjokdxxww r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f106892zdlpuopuiu = r6     // Catch: java.lang.Throwable -> L3c
            r0.f106891yggfygwlhe = r7     // Catch: java.lang.Throwable -> L3c
            r0.f106890jyumaefscl = r9     // Catch: java.lang.Throwable -> L3c
            r0.f106889iwizpuwonk = r8     // Catch: java.lang.Throwable -> L3c
            r0.f106888esjtqupxsv = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.iobyxmoadg(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f106892zdlpuopuiu = r2     // Catch: java.lang.Throwable -> L3c
            r0.f106891yggfygwlhe = r7     // Catch: java.lang.Throwable -> L3c
            r0.f106890jyumaefscl = r6     // Catch: java.lang.Throwable -> L3c
            r0.f106889iwizpuwonk = r8     // Catch: java.lang.Throwable -> L3c
            r0.f106888esjtqupxsv = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            rj.agtfadlqog.iobyxmoadg(r7, r6)
        L9a:
            gg.wwaezpbzkn r6 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            rj.agtfadlqog.iobyxmoadg(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.gtknphoqwx.ppxfxbqfkf(sj.nufgyqmvbu, rj.jyumaefscl, boolean, lg.gxszxtbevo):java.lang.Object");
    }

    public static final lqeggnwhkg wkgbmnqykc(rj.jyumaefscl jyumaefsclVar) {
        return new ppxfxbqfkf(jyumaefsclVar, false, null, 0, null, 28, null);
    }

    public static final Object zoijcleaow(nufgyqmvbu nufgyqmvbuVar, rj.jyumaefscl jyumaefsclVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objPpxfxbqfkf = ppxfxbqfkf(nufgyqmvbuVar, jyumaefsclVar, true, gxszxtbevoVar);
        return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
