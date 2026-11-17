package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public /* synthetic */ Object f56478iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public int f56479jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f56480yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56481zdlpuopuiu;

    public f1(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        f1 f1Var = new f1(gxszxtbevoVar);
        f1Var.f56478iwizpuwonk = obj;
        return f1Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        f1 f1Var = new f1((lg.gxszxtbevo) obj2);
        f1Var.f56478iwizpuwonk = (sj.nufgyqmvbu) obj;
        return f1Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003b -> B:13:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
            int r1 = r6.f56479jyumaefscl
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            int r1 = r6.f56480yggfygwlhe
            int r3 = r6.f56481zdlpuopuiu
            java.lang.Object r4 = r6.f56478iwizpuwonk
            sj.nufgyqmvbu r4 = (sj.nufgyqmvbu) r4
            gg.zdlpuopuiu.zoijcleaow(r7)
            goto L3e
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            gg.zdlpuopuiu.zoijcleaow(r7)
            java.lang.Object r7 = r6.f56478iwizpuwonk
            sj.nufgyqmvbu r7 = (sj.nufgyqmvbu) r7
            r1 = 2
            r3 = 0
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L2c:
            if (r1 >= r3) goto L40
            r6.f56478iwizpuwonk = r4
            r6.f56481zdlpuopuiu = r3
            r6.f56480yggfygwlhe = r1
            r6.f56479jyumaefscl = r2
            r7 = 0
            java.lang.Object r7 = r4.emit(r7, r6)
            if (r7 != r0) goto L3e
            return r0
        L3e:
            int r1 = r1 + r2
            goto L2c
        L40:
            gg.wwaezpbzkn r7 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.f1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
