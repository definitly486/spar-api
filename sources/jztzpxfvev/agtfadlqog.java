package jztzpxfvev;

import androidx.compose.runtime.c1;

/* JADX INFO: loaded from: classes.dex */
final class agtfadlqog implements opjhrmiecq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f52584eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f52585gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f52586iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f52588wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final xrmfcynszj f52589zoijcleaow = new zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ikoacuggdj.vipkmwdibw f52587ppxfxbqfkf = new ikoacuggdj.vipkmwdibw();

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f52590iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ikoacuggdj.ribwqtqdhb f52591jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52593zdlpuopuiu;

        /* JADX INFO: renamed from: jztzpxfvev.agtfadlqog$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1132iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ tg.rgvfuqvkyq f52594iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f52595jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f52596yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f52597zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1132iobyxmoadg(agtfadlqog agtfadlqogVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f52595jyumaefscl = agtfadlqogVar;
                this.f52594iwizpuwonk = rgvfuqvkyqVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1132iobyxmoadg c1132iobyxmoadg = new C1132iobyxmoadg(this.f52595jyumaefscl, this.f52594iwizpuwonk, gxszxtbevoVar);
                c1132iobyxmoadg.f52596yggfygwlhe = obj;
                return c1132iobyxmoadg;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f52597zdlpuopuiu;
                try {
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        xrmfcynszj xrmfcynszjVar = (xrmfcynszj) this.f52596yggfygwlhe;
                        this.f52595jyumaefscl.f52588wkgbmnqykc.setValue(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
                        tg.rgvfuqvkyq rgvfuqvkyqVar = this.f52594iwizpuwonk;
                        this.f52597zdlpuopuiu = 1;
                        if (rgvfuqvkyqVar.invoke(xrmfcynszjVar, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    this.f52595jyumaefscl.f52588wkgbmnqykc.setValue(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    this.f52595jyumaefscl.f52588wkgbmnqykc.setValue(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
                    throw th2;
                }
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(xrmfcynszj xrmfcynszjVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C1132iobyxmoadg) create(xrmfcynszjVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(ikoacuggdj.ribwqtqdhb ribwqtqdhbVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52591jyumaefscl = ribwqtqdhbVar;
            this.f52590iwizpuwonk = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return agtfadlqog.this.new iobyxmoadg(this.f52591jyumaefscl, this.f52590iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52593zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ikoacuggdj.vipkmwdibw vipkmwdibwVar = agtfadlqog.this.f52587ppxfxbqfkf;
                xrmfcynszj xrmfcynszjVar = agtfadlqog.this.f52589zoijcleaow;
                ikoacuggdj.ribwqtqdhb ribwqtqdhbVar = this.f52591jyumaefscl;
                C1132iobyxmoadg c1132iobyxmoadg = new C1132iobyxmoadg(agtfadlqog.this, this.f52590iwizpuwonk, null);
                this.f52593zdlpuopuiu = 1;
                if (vipkmwdibwVar.gxszxtbevo(xrmfcynszjVar, ribwqtqdhbVar, c1132iobyxmoadg, this) == objGxszxtbevo) {
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
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements xrmfcynszj {
        zoijcleaow() {
        }

        @Override // jztzpxfvev.xrmfcynszj
        public float wkgbmnqykc(float f13) {
            if (Float.isNaN(f13)) {
                return 0.0f;
            }
            float fFloatValue = ((Number) agtfadlqog.this.draadjrbmk().invoke(Float.valueOf(f13))).floatValue();
            agtfadlqog.this.f52584eablkybsjg.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            agtfadlqog.this.f52585gxszxtbevo.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    public agtfadlqog(tg.draadjrbmk draadjrbmkVar) {
        this.f52586iobyxmoadg = draadjrbmkVar;
        Boolean bool = Boolean.FALSE;
        this.f52588wkgbmnqykc = c1.ppxfxbqfkf(bool, null, 2, null);
        this.f52584eablkybsjg = c1.ppxfxbqfkf(bool, null, 2, null);
        this.f52585gxszxtbevo = c1.ppxfxbqfkf(bool, null, 2, null);
    }

    public final tg.draadjrbmk draadjrbmk() {
        return this.f52586iobyxmoadg;
    }

    @Override // jztzpxfvev.opjhrmiecq
    public float gxszxtbevo(float f13) {
        return ((Number) this.f52586iobyxmoadg.invoke(Float.valueOf(f13))).floatValue();
    }

    @Override // jztzpxfvev.opjhrmiecq
    public boolean iobyxmoadg() {
        return ((Boolean) this.f52588wkgbmnqykc.getValue()).booleanValue();
    }

    @Override // jztzpxfvev.opjhrmiecq
    public Object zoijcleaow(ikoacuggdj.ribwqtqdhb ribwqtqdhbVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo = pj.dsvhmnatus.gxszxtbevo(new iobyxmoadg(ribwqtqdhbVar, rgvfuqvkyqVar, null), gxszxtbevoVar);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
