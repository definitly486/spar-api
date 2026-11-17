package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class be0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ hf0 f55976iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ lg0 f55977jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public /* synthetic */ Object f55978yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f55979zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be0(lg0 lg0Var, hf0 hf0Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f55977jyumaefscl = lg0Var;
        this.f55976iwizpuwonk = hf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        be0 be0Var = new be0(this.f55977jyumaefscl, this.f55976iwizpuwonk, gxszxtbevoVar);
        be0Var.f55978yggfygwlhe = obj;
        return be0Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((be0) create((sj.nufgyqmvbu) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r1.emit((kk.hl) r7, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r1.emit(null, r6) == r0) goto L22;
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
            int r1 = r6.f55979zdlpuopuiu
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            gg.zdlpuopuiu.zoijcleaow(r7)
            goto L5a
        L1f:
            java.lang.Object r1 = r6.f55978yggfygwlhe
            sj.nufgyqmvbu r1 = (sj.nufgyqmvbu) r1
            gg.zdlpuopuiu.zoijcleaow(r7)
            goto L44
        L27:
            gg.zdlpuopuiu.zoijcleaow(r7)
            java.lang.Object r7 = r6.f55978yggfygwlhe
            r1 = r7
            sj.nufgyqmvbu r1 = (sj.nufgyqmvbu) r1
            kk.lg0 r7 = r6.f55977jyumaefscl
            spay.sdk.domain.model.request.SdkAuthRequestBody r7 = r7.f57473wkgbmnqykc
            if (r7 == 0) goto L51
            kk.hf0 r3 = r6.f55976iwizpuwonk
            kk.sn r3 = r3.f56910wkgbmnqykc
            r6.f55978yggfygwlhe = r1
            r6.f55979zdlpuopuiu = r5
            java.lang.Object r7 = r3.iobyxmoadg(r7, r6)
            if (r7 != r0) goto L44
            goto L59
        L44:
            kk.hl r7 = (kk.hl) r7
            r6.f55978yggfygwlhe = r2
            r6.f55979zdlpuopuiu = r4
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L5a
            goto L59
        L51:
            r6.f55979zdlpuopuiu = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L5a
        L59:
            return r0
        L5a:
            gg.wwaezpbzkn r7 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.be0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
