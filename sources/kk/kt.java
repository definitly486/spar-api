package kk;

import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class kt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f57345yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57346zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(RedirectActivity redirectActivity, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f57345yggfygwlhe = redirectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new kt(this.f57345yggfygwlhe, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new kt(this.f57345yggfygwlhe, (lg.gxszxtbevo) obj2).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r7 == r0) goto L19;
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
            int r1 = r6.f57346zdlpuopuiu
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            gg.zdlpuopuiu.zoijcleaow(r7)
            goto L47
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            gg.zdlpuopuiu.zoijcleaow(r7)
            goto L2d
        L1f:
            gg.zdlpuopuiu.zoijcleaow(r7)
            r6.f57346zdlpuopuiu = r4
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r7 = pj.crxdokpmqz.zoijcleaow(r4, r6)
            if (r7 != r0) goto L2d
            goto L46
        L2d:
            spay.sdk.RedirectActivity r7 = r6.f57345yggfygwlhe
            kk.g4 r7 = r7.f107825c
            if (r7 == 0) goto L34
            goto L3a
        L34:
            java.lang.String r7 = "bankAuthenticator"
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj(r7)
            r7 = r2
        L3a:
            spay.sdk.RedirectActivity r1 = r6.f57345yggfygwlhe
            kk.hkdspvbjdz r4 = kk.hkdspvbjdz.INITIAL_AUTH
            r6.f57346zdlpuopuiu = r3
            java.lang.Object r7 = r7.iobyxmoadg(r1, r4, r6)
            if (r7 != r0) goto L47
        L46:
            return r0
        L47:
            kk.y0 r7 = (kk.y0) r7
            spay.sdk.RedirectActivity r0 = r6.f57345yggfygwlhe
            kk.b9 r0 = r0.f107824b
            if (r0 != 0) goto L55
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj(r0)
            goto L56
        L55:
            r2 = r0
        L56:
            r2.getClass()
            java.lang.String r0 = "bankAuthResult"
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(r7, r0)
            boolean r0 = r7.f59358ppxfxbqfkf
            if (r0 == 0) goto L75
            kk.pc r0 = r2.f55949wflxmlrfwp
            kk.nt r1 = new kk.nt
            java.lang.Object r7 = r7.f59357iobyxmoadg
            kk.dh0 r7 = (kk.dh0) r7
            spay.sdk.domain.model.request.SdkAuthRequestBody$AuthMethod r2 = spay.sdk.domain.model.request.SdkAuthRequestBody.AuthMethod.SBOL
            r1.<init>(r7, r2)
            kk.ve r0 = (kk.ve) r0
            r0.zoijcleaow(r1)
            goto L88
        L75:
            kk.pc r7 = r2.f55949wflxmlrfwp
            kk.l1 r0 = new kk.l1
            kk.z8 r1 = new kk.z8
            spay.sdk.domain.model.response.ErrorEntity$Unknown r2 = spay.sdk.domain.model.response.ErrorEntity.Unknown.INSTANCE
            r1.<init>(r2)
            r0.<init>(r1)
            kk.ve r7 = (kk.ve) r7
            r7.zoijcleaow(r0)
        L88:
            gg.wwaezpbzkn r7 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.kt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
