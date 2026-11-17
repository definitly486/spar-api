package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class z20 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ ka f59513iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ m60 f59514jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ b9 f59515yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f59516zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z20(lg.gxszxtbevo gxszxtbevoVar, b9 b9Var, m60 m60Var, ka kaVar) {
        super(2, gxszxtbevoVar);
        this.f59515yggfygwlhe = b9Var;
        this.f59514jyumaefscl = m60Var;
        this.f59513iwizpuwonk = kaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new z20(gxszxtbevoVar, this.f59515yggfygwlhe, this.f59514jyumaefscl, this.f59513iwizpuwonk);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((z20) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (r1.collect(r3, r6) == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
            int r1 = r6.f59516zdlpuopuiu
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L19
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            gg.zdlpuopuiu.zoijcleaow(r7)
            goto L89
        L1e:
            gg.zdlpuopuiu.zoijcleaow(r7)
            goto L6f
        L22:
            gg.zdlpuopuiu.zoijcleaow(r7)
            goto L43
        L26:
            gg.zdlpuopuiu.zoijcleaow(r7)
            kk.b9 r7 = r6.f59515yggfygwlhe
            r6.f59516zdlpuopuiu = r4
            kk.y1 r7 = r7.f55953yggfygwlhe
            pj.pkzmftpjix r1 = pj.ikoacuggdj.zoijcleaow()
            java.lang.Object r7 = r7.iobyxmoadg(r1, r6)
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            if (r7 != r1) goto L3e
            goto L40
        L3e:
            gg.wwaezpbzkn r7 = gg.wwaezpbzkn.f37140iobyxmoadg
        L40:
            if (r7 != r0) goto L43
            goto L88
        L43:
            kk.b9 r7 = r6.f59515yggfygwlhe
            r6.f59516zdlpuopuiu = r3
            kk.u2 r7 = r7.f55940lqeggnwhkg
            pj.pkzmftpjix r1 = pj.ikoacuggdj.zoijcleaow()
            r7.getClass()
            kk.t1 r3 = new kk.t1
            r4 = 0
            r3.<init>(r7, r4)
            java.lang.Object r7 = pj.dxjokdxxww.lqeggnwhkg(r1, r3, r6)
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            if (r7 != r1) goto L61
            goto L63
        L61:
            gg.wwaezpbzkn r7 = gg.wwaezpbzkn.f37140iobyxmoadg
        L63:
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            if (r7 != r1) goto L6a
            goto L6c
        L6a:
            gg.wwaezpbzkn r7 = gg.wwaezpbzkn.f37140iobyxmoadg
        L6c:
            if (r7 != r0) goto L6f
            goto L88
        L6f:
            kk.b9 r7 = r6.f59515yggfygwlhe
            kk.xf r1 = r7.f55931iobyxmoadg
            kk.ij r1 = (kk.ij) r1
            sj.wypolnanlu r1 = r1.f57056zoijcleaow
            kk.s10 r3 = new kk.s10
            kk.m60 r4 = r6.f59514jyumaefscl
            kk.ka r5 = r6.f59513iwizpuwonk
            r3.<init>(r7, r4, r5)
            r6.f59516zdlpuopuiu = r2
            java.lang.Object r7 = r1.collect(r3, r6)
            if (r7 != r0) goto L89
        L88:
            return r0
        L89:
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.z20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
