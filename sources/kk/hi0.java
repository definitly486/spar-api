package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class hi0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ y0 f56929iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ a10 f56930jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ dvvnrvtcbc f56931yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56932zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi0(dvvnrvtcbc dvvnrvtcbcVar, a10 a10Var, y0 y0Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f56931yggfygwlhe = dvvnrvtcbcVar;
        this.f56930jyumaefscl = a10Var;
        this.f56929iwizpuwonk = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new hi0(this.f56931yggfygwlhe, this.f56930jyumaefscl, this.f56929iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((hi0) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r1.iobyxmoadg(r6, pj.ikoacuggdj.zoijcleaow(), r5) == r0) goto L22;
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
            int r1 = r5.f56932zdlpuopuiu
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            gg.zdlpuopuiu.zoijcleaow(r6)
            goto L8b
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            gg.zdlpuopuiu.zoijcleaow(r6)
            goto L56
        L1f:
            gg.zdlpuopuiu.zoijcleaow(r6)
            kk.dvvnrvtcbc r6 = r5.f56931yggfygwlhe
            kk.jlmebxxoox r6 = r6.f56063zoijcleaow
            kk.auzgnhcxok r6 = (kk.auzgnhcxok) r6
            java.util.List r6 = r6.nufgyqmvbu()
            if (r6 == 0) goto L47
            int r6 = r6.size()
            if (r6 != r3) goto L47
            kk.dvvnrvtcbc r6 = r5.f56931yggfygwlhe
            kk.pc r6 = r6.f56341gxszxtbevo
            kk.hj r1 = new kk.hj
            kk.kf r4 = new kk.kf
            r4.<init>()
            r1.<init>(r4)
            kk.ve r6 = (kk.ve) r6
            r6.zoijcleaow(r1)
        L47:
            kk.dvvnrvtcbc r6 = r5.f56931yggfygwlhe
            kk.a10 r1 = r5.f56930jyumaefscl
            kk.y0 r4 = r5.f56929iwizpuwonk
            r5.f56932zdlpuopuiu = r3
            java.lang.Object r6 = kk.dvvnrvtcbc.draadjrbmk(r6, r1, r4, r5)
            if (r6 != r0) goto L56
            goto L6a
        L56:
            kk.lg0 r6 = (kk.lg0) r6
            if (r6 == 0) goto L6b
            kk.dvvnrvtcbc r1 = r5.f56931yggfygwlhe
            kk.hf0 r1 = r1.f56346nufgyqmvbu
            r5.f56932zdlpuopuiu = r2
            pj.pkzmftpjix r2 = pj.ikoacuggdj.zoijcleaow()
            java.lang.Object r6 = r1.iobyxmoadg(r6, r2, r5)
            if (r6 != r0) goto L8b
        L6a:
            return r0
        L6b:
            kk.dvvnrvtcbc r6 = r5.f56931yggfygwlhe
            kk.pc r6 = r6.f56341gxszxtbevo
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(r6, r0)
            jc2.iobyxmoadg$zoijcleaow r0 = jc2.iobyxmoadg.f51100iobyxmoadg
            java.lang.String r1 = "ELSE BRANCH ERROR"
            jc2.iobyxmoadg$ppxfxbqfkf r0 = r0.rgvfuqvkyq(r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Unpredictable case"
            r0.zoijcleaow(r2, r1)
            kk.zw r0 = kk.zw.f59634iobyxmoadg
            kk.ve r6 = (kk.ve) r6
            r6.zoijcleaow(r0)
        L8b:
            gg.wwaezpbzkn r6 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.hi0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
