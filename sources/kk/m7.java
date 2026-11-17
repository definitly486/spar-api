package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class m7 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ pj.pkzmftpjix f57596iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ r9 f57597jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ o8 f57598yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57599zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(o8 o8Var, r9 r9Var, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57598yggfygwlhe = o8Var;
        this.f57597jyumaefscl = r9Var;
        this.f57596iwizpuwonk = pkzmftpjixVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new m7(this.f57598yggfygwlhe, this.f57597jyumaefscl, this.f57596iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((m7) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (pj.crxdokpmqz.iobyxmoadg(r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
            int r1 = r5.f57599zdlpuopuiu
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L16
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L16:
            gg.zdlpuopuiu.zoijcleaow(r6)
            goto L41
        L1a:
            gg.zdlpuopuiu.zoijcleaow(r6)
            goto L38
        L1e:
            gg.zdlpuopuiu.zoijcleaow(r6)
            kk.o8 r6 = r5.f57598yggfygwlhe
            int r1 = r6.f57908lqeggnwhkg
            r4 = 3
            if (r1 >= r4) goto L47
            int r1 = r1 + r3
            r6.f57908lqeggnwhkg = r1
            kk.r9 r1 = r5.f57597jyumaefscl
            pj.pkzmftpjix r4 = r5.f57596iwizpuwonk
            r5.f57599zdlpuopuiu = r3
            java.lang.Object r6 = r6.zoijcleaow(r1, r4, r5)
            if (r6 != r0) goto L38
            goto L40
        L38:
            r5.f57599zdlpuopuiu = r2
            java.lang.Object r6 = pj.crxdokpmqz.iobyxmoadg(r5)
            if (r6 != r0) goto L41
        L40:
            return r0
        L41:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        L47:
            kk.l1 r6 = new kk.l1
            kk.fa r0 = kk.fa.f56514iobyxmoadg
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.m7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
