package androidx.compose.ui.platform;

import android.view.View;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class h0 implements androidx.compose.runtime.iwizpuwonk, androidx.lifecycle.agtfadlqog {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private tg.rgvfuqvkyq f6930cqumvgiudr = lrnfpwlwnk.f7002iobyxmoadg.iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private androidx.lifecycle.gtknphoqwx f6931iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f6932jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final androidx.compose.runtime.iwizpuwonk f6933yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final AndroidComposeView f6934zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f6935yggfygwlhe;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.h0$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0117iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ tg.rgvfuqvkyq f6937yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ h0 f6938zdlpuopuiu;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.h0$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C0118iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ h0 f6939yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f6940zdlpuopuiu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0118iobyxmoadg(h0 h0Var, lg.gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f6939yggfygwlhe = h0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    return new C0118iobyxmoadg(this.f6939yggfygwlhe, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f6940zdlpuopuiu;
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        AndroidComposeView androidComposeViewWwaezpbzkn = this.f6939yggfygwlhe.wwaezpbzkn();
                        this.f6940zdlpuopuiu = 1;
                        if (androidComposeViewWwaezpbzkn.zeieaojujs(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // tg.rgvfuqvkyq
                public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                    return ((C0118iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.h0$iobyxmoadg$iobyxmoadg$ppxfxbqfkf */
            static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ tg.rgvfuqvkyq f6941yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ h0 f6942zdlpuopuiu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                ppxfxbqfkf(h0 h0Var, tg.rgvfuqvkyq rgvfuqvkyqVar) {
                    super(2);
                    this.f6942zdlpuopuiu = h0Var;
                    this.f6941yggfygwlhe = rgvfuqvkyqVar;
                }

                @Override // tg.rgvfuqvkyq
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }

                public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                    if (!draadjrbmkVar.vdvldrhtss((i13 & 3) != 2, i13 & 1)) {
                        draadjrbmkVar.hkdspvbjdz();
                        return;
                    }
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-280240369, i13, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                    }
                    AndroidCompositionLocals_androidKt.iobyxmoadg(this.f6942zdlpuopuiu.wwaezpbzkn(), this.f6941yggfygwlhe, draadjrbmkVar, 0);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.h0$iobyxmoadg$iobyxmoadg$zoijcleaow */
            static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ h0 f6943yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f6944zdlpuopuiu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                zoijcleaow(h0 h0Var, lg.gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f6943yggfygwlhe = h0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    return new zoijcleaow(this.f6943yggfygwlhe, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f6944zdlpuopuiu;
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        AndroidComposeView androidComposeViewWwaezpbzkn = this.f6943yggfygwlhe.wwaezpbzkn();
                        this.f6944zdlpuopuiu = 1;
                        if (androidComposeViewWwaezpbzkn.nuxfzjnpeb(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // tg.rgvfuqvkyq
                public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                    return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0117iobyxmoadg(h0 h0Var, tg.rgvfuqvkyq rgvfuqvkyqVar) {
                super(2);
                this.f6938zdlpuopuiu = h0Var;
                this.f6937yggfygwlhe = rgvfuqvkyqVar;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                if (!draadjrbmkVar.vdvldrhtss((i13 & 3) != 2, i13 & 1)) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1330788943, i13, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:123)");
                }
                Object tag = this.f6938zdlpuopuiu.wwaezpbzkn().getTag(a.gtknphoqwx.inspection_slot_table_set);
                Set set = kotlin.jvm.internal.mbcevpiqjq.wflxmlrfwp(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f6938zdlpuopuiu.wwaezpbzkn().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(a.gtknphoqwx.inspection_slot_table_set) : null;
                    set = kotlin.jvm.internal.mbcevpiqjq.wflxmlrfwp(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(draadjrbmkVar.iozdgvuglv());
                    draadjrbmkVar.pmvmpeiblj();
                }
                AndroidComposeView androidComposeViewWwaezpbzkn = this.f6938zdlpuopuiu.wwaezpbzkn();
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(this.f6938zdlpuopuiu);
                h0 h0Var = this.f6938zdlpuopuiu;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new C0118iobyxmoadg(h0Var, null);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                androidx.compose.runtime.jlmebxxoox.eablkybsjg(androidComposeViewWwaezpbzkn, (tg.rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVar, 0);
                AndroidComposeView androidComposeViewWwaezpbzkn2 = this.f6938zdlpuopuiu.wwaezpbzkn();
                boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(this.f6938zdlpuopuiu);
                h0 h0Var2 = this.f6938zdlpuopuiu;
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new zoijcleaow(h0Var2, null);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                androidx.compose.runtime.jlmebxxoox.eablkybsjg(androidComposeViewWwaezpbzkn2, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, 0);
                androidx.compose.runtime.lmojexxdyd.ppxfxbqfkf(krqnebusok.agtfadlqog.ppxfxbqfkf().wkgbmnqykc(set), ezmngbhpjk.nufgyqmvbu.eablkybsjg(-280240369, true, new ppxfxbqfkf(this.f6938zdlpuopuiu, this.f6937yggfygwlhe), draadjrbmkVar, 54), draadjrbmkVar, androidx.compose.runtime.b.f5523dxjokdxxww | 48);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar) {
            super(1);
            this.f6935yggfygwlhe = rgvfuqvkyqVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((AndroidComposeView.zoijcleaow) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(AndroidComposeView.zoijcleaow zoijcleaowVar) {
            if (h0.this.f6932jyumaefscl) {
                return;
            }
            androidx.lifecycle.gtknphoqwx lifecycle = zoijcleaowVar.iobyxmoadg().getLifecycle();
            h0.this.f6930cqumvgiudr = this.f6935yggfygwlhe;
            if (h0.this.f6931iwizpuwonk == null) {
                h0.this.f6931iwizpuwonk = lifecycle;
                lifecycle.iobyxmoadg(h0.this);
            } else if (lifecycle.zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.CREATED)) {
                h0.this.lmojexxdyd().vdvldrhtss(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(1330788943, true, new C0117iobyxmoadg(h0.this, this.f6935yggfygwlhe)));
            }
        }
    }

    public h0(AndroidComposeView androidComposeView, androidx.compose.runtime.iwizpuwonk iwizpuwonkVar) {
        this.f6934zdlpuopuiu = androidComposeView;
        this.f6933yggfygwlhe = iwizpuwonkVar;
    }

    @Override // androidx.compose.runtime.iwizpuwonk
    public void iobyxmoadg() {
        if (!this.f6932jyumaefscl) {
            this.f6932jyumaefscl = true;
            this.f6934zdlpuopuiu.getView().setTag(a.gtknphoqwx.wrapped_composition_tag, null);
            androidx.lifecycle.gtknphoqwx gtknphoqwxVar = this.f6931iwizpuwonk;
            if (gtknphoqwxVar != null) {
                gtknphoqwxVar.wkgbmnqykc(this);
            }
        }
        this.f6933yggfygwlhe.iobyxmoadg();
    }

    public final androidx.compose.runtime.iwizpuwonk lmojexxdyd() {
        return this.f6933yggfygwlhe;
    }

    @Override // androidx.lifecycle.agtfadlqog
    public void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY) {
            iobyxmoadg();
        } else {
            if (iobyxmoadgVar != androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_CREATE || this.f6932jyumaefscl) {
                return;
            }
            vdvldrhtss(this.f6930cqumvgiudr);
        }
    }

    @Override // androidx.compose.runtime.iwizpuwonk
    public void vdvldrhtss(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f6934zdlpuopuiu.setOnViewTreeOwnersAvailable(new iobyxmoadg(rgvfuqvkyqVar));
    }

    public final AndroidComposeView wwaezpbzkn() {
        return this.f6934zdlpuopuiu;
    }
}
