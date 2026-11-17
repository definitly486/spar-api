package iwxlajgraz;

import androidx.compose.runtime.ezmngbhpjk;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f49954iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private AtomicReference f49956zoijcleaow = new AtomicReference(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.compose.runtime.roivzttewh f49955ppxfxbqfkf = ezmngbhpjk.iobyxmoadg(0.0f);

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f49958yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f49959zdlpuopuiu;

        /* JADX INFO: renamed from: iwxlajgraz.yadqdtsiqt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1064iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ yadqdtsiqt f49960jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ pj.auzgnhcxok f49961yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f49962zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1064iobyxmoadg(pj.auzgnhcxok auzgnhcxokVar, yadqdtsiqt yadqdtsiqtVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f49961yggfygwlhe = auzgnhcxokVar;
                this.f49960jyumaefscl = yadqdtsiqtVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C1064iobyxmoadg(this.f49961yggfygwlhe, this.f49960jyumaefscl, gxszxtbevoVar);
            }

            /* JADX WARN: Code duplicated, block: B:32:0x0067 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:35:0x0075 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0073 -> B:36:0x0076). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:6:0x0015
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
                    int r1 = r10.f49962zdlpuopuiu
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 1065353216(0x3f800000, float:1.0)
                    r6 = 4
                    r7 = 3
                    r8 = 2
                    r9 = 1
                    if (r1 == 0) goto L33
                    if (r1 == r9) goto L2f
                    if (r1 == r8) goto L2b
                    if (r1 == r7) goto L27
                    if (r1 != r6) goto L1f
                    gg.zdlpuopuiu.zoijcleaow(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L76
                L1d:
                    r11 = move-exception
                    goto L7c
                L1f:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L27:
                    gg.zdlpuopuiu.zoijcleaow(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L68
                L2b:
                    gg.zdlpuopuiu.zoijcleaow(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L59
                L2f:
                    gg.zdlpuopuiu.zoijcleaow(r11)
                    goto L43
                L33:
                    gg.zdlpuopuiu.zoijcleaow(r11)
                    pj.auzgnhcxok r11 = r10.f49961yggfygwlhe
                    if (r11 == 0) goto L43
                    r10.f49962zdlpuopuiu = r9
                    java.lang.Object r11 = pj.dvvnrvtcbc.lqeggnwhkg(r11, r10)
                    if (r11 != r0) goto L43
                    return r0
                L43:
                    iwxlajgraz.yadqdtsiqt r11 = r10.f49960jyumaefscl     // Catch: java.lang.Throwable -> L1d
                    iwxlajgraz.yadqdtsiqt.zoijcleaow(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    iwxlajgraz.yadqdtsiqt r11 = r10.f49960jyumaefscl     // Catch: java.lang.Throwable -> L1d
                    boolean r11 = r11.ppxfxbqfkf()     // Catch: java.lang.Throwable -> L1d
                    if (r11 != 0) goto L5f
                    r10.f49962zdlpuopuiu = r8     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = pj.crxdokpmqz.iobyxmoadg(r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L59
                    return r0
                L59:
                    kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1d
                    r11.<init>()     // Catch: java.lang.Throwable -> L1d
                    throw r11     // Catch: java.lang.Throwable -> L1d
                L5f:
                    r10.f49962zdlpuopuiu = r7     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = pj.crxdokpmqz.zoijcleaow(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L68
                    return r0
                L68:
                    iwxlajgraz.yadqdtsiqt r11 = r10.f49960jyumaefscl     // Catch: java.lang.Throwable -> L1d
                    iwxlajgraz.yadqdtsiqt.zoijcleaow(r11, r2)     // Catch: java.lang.Throwable -> L1d
                    r10.f49962zdlpuopuiu = r6     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = pj.crxdokpmqz.zoijcleaow(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L76
                    return r0
                L76:
                    iwxlajgraz.yadqdtsiqt r11 = r10.f49960jyumaefscl     // Catch: java.lang.Throwable -> L1d
                    iwxlajgraz.yadqdtsiqt.zoijcleaow(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    goto L5f
                L7c:
                    iwxlajgraz.yadqdtsiqt r0 = r10.f49960jyumaefscl
                    iwxlajgraz.yadqdtsiqt.zoijcleaow(r0, r2)
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: iwxlajgraz.yadqdtsiqt.iobyxmoadg.C1064iobyxmoadg.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C1064iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = yadqdtsiqt.this.new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f49958yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f49959zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(mbcevpiqjq.wkgbmnqykc.iobyxmoadg(yadqdtsiqt.this.f49956zoijcleaow, null, pj.gtknphoqwx.wkgbmnqykc((pj.cllcsxoeiz) this.f49958yggfygwlhe, null, null, new C1064iobyxmoadg((pj.auzgnhcxok) yadqdtsiqt.this.f49956zoijcleaow.getAndSet(null), yadqdtsiqt.this, null), 3, null)));
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public yadqdtsiqt(boolean z13) {
        this.f49954iobyxmoadg = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eablkybsjg(float f13) {
        this.f49955ppxfxbqfkf.pkzmftpjix(f13);
    }

    public final Object gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo = pj.dsvhmnatus.gxszxtbevo(new iobyxmoadg(null), gxszxtbevoVar);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f49954iobyxmoadg;
    }

    public final float wkgbmnqykc() {
        return this.f49955ppxfxbqfkf.zoijcleaow();
    }
}
