package igdgnonuha;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class jztzpxfvev implements j {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f43192iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f43193ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f43194wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f43195zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ jztzpxfvev f43196jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ k f43197yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f43198zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(k kVar, jztzpxfvev jztzpxfvevVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f43197yggfygwlhe = kVar;
            this.f43196jyumaefscl = jztzpxfvevVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f43197yggfygwlhe, this.f43196jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f43198zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                k kVar = this.f43197yggfygwlhe;
                float f13 = this.f43196jyumaefscl.f43192iobyxmoadg;
                float f14 = this.f43196jyumaefscl.f43195zoijcleaow;
                float f15 = this.f43196jyumaefscl.f43193ppxfxbqfkf;
                float f16 = this.f43196jyumaefscl.f43194wkgbmnqykc;
                this.f43198zdlpuopuiu = 1;
                if (kVar.gxszxtbevo(f13, f14, f15, f16, this) == objGxszxtbevo) {
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

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ k f43199iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe.btonecajqb f43200jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f43201yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f43202zdlpuopuiu;

        static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ k f43203jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ pj.cllcsxoeiz f43204yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ List f43205zdlpuopuiu;

            /* JADX INFO: renamed from: igdgnonuha.jztzpxfvev$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C1013iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ metgxyhuhe.dxjokdxxww f43206jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ k f43207yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f43208zdlpuopuiu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1013iobyxmoadg(k kVar, metgxyhuhe.dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f43207yggfygwlhe = kVar;
                    this.f43206jyumaefscl = dxjokdxxwwVar;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    return new C1013iobyxmoadg(this.f43207yggfygwlhe, this.f43206jyumaefscl, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f43208zdlpuopuiu;
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        k kVar = this.f43207yggfygwlhe;
                        metgxyhuhe.dxjokdxxww dxjokdxxwwVar = this.f43206jyumaefscl;
                        this.f43208zdlpuopuiu = 1;
                        if (kVar.zoijcleaow(dxjokdxxwwVar, this) == objGxszxtbevo) {
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
                    return ((C1013iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            iobyxmoadg(List list, pj.cllcsxoeiz cllcsxoeizVar, k kVar) {
                this.f43205zdlpuopuiu = list;
                this.f43204yggfygwlhe = cllcsxoeizVar;
                this.f43203jyumaefscl = kVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(metgxyhuhe.dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
                if (dxjokdxxwwVar instanceof metgxyhuhe.lqeggnwhkg) {
                    this.f43205zdlpuopuiu.add(dxjokdxxwwVar);
                } else if (dxjokdxxwwVar instanceof metgxyhuhe.nufgyqmvbu) {
                    this.f43205zdlpuopuiu.remove(((metgxyhuhe.nufgyqmvbu) dxjokdxxwwVar).iobyxmoadg());
                } else if (dxjokdxxwwVar instanceof metgxyhuhe.wkgbmnqykc) {
                    this.f43205zdlpuopuiu.add(dxjokdxxwwVar);
                } else if (dxjokdxxwwVar instanceof metgxyhuhe.eablkybsjg) {
                    this.f43205zdlpuopuiu.remove(((metgxyhuhe.eablkybsjg) dxjokdxxwwVar).iobyxmoadg());
                } else if (dxjokdxxwwVar instanceof metgxyhuhe.agtfadlqog.zoijcleaow) {
                    this.f43205zdlpuopuiu.add(dxjokdxxwwVar);
                } else if (dxjokdxxwwVar instanceof metgxyhuhe.agtfadlqog.ppxfxbqfkf) {
                    this.f43205zdlpuopuiu.remove(((metgxyhuhe.agtfadlqog.ppxfxbqfkf) dxjokdxxwwVar).iobyxmoadg());
                } else if (dxjokdxxwwVar instanceof metgxyhuhe.agtfadlqog.iobyxmoadg) {
                    this.f43205zdlpuopuiu.remove(((metgxyhuhe.agtfadlqog.iobyxmoadg) dxjokdxxwwVar).iobyxmoadg());
                }
                pj.gtknphoqwx.wkgbmnqykc(this.f43204yggfygwlhe, null, null, new C1013iobyxmoadg(this.f43203jyumaefscl, (metgxyhuhe.dxjokdxxww) hg.jyumaefscl.lxfrhoxuzk(this.f43205zdlpuopuiu), null), 3, null);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(metgxyhuhe.btonecajqb btonecajqbVar, k kVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f43200jyumaefscl = btonecajqbVar;
            this.f43199iwizpuwonk = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f43200jyumaefscl, this.f43199iwizpuwonk, gxszxtbevoVar);
            zoijcleaowVar.f43201yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f43202zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f43201yggfygwlhe;
                ArrayList arrayList = new ArrayList();
                sj.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = this.f43200jyumaefscl.ppxfxbqfkf();
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(arrayList, cllcsxoeizVar, this.f43199iwizpuwonk);
                this.f43202zdlpuopuiu = 1;
                if (lqeggnwhkgVarPpxfxbqfkf.collect(iobyxmoadgVar, this) == objGxszxtbevo) {
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

    public /* synthetic */ jztzpxfvev(float f13, float f14, float f15, float f16, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, f15, f16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jztzpxfvev)) {
            return false;
        }
        jztzpxfvev jztzpxfvevVar = (jztzpxfvev) obj;
        if (w0.nufgyqmvbu.dxjokdxxww(this.f43192iobyxmoadg, jztzpxfvevVar.f43192iobyxmoadg) && w0.nufgyqmvbu.dxjokdxxww(this.f43195zoijcleaow, jztzpxfvevVar.f43195zoijcleaow) && w0.nufgyqmvbu.dxjokdxxww(this.f43193ppxfxbqfkf, jztzpxfvevVar.f43193ppxfxbqfkf)) {
            return w0.nufgyqmvbu.dxjokdxxww(this.f43194wkgbmnqykc, jztzpxfvevVar.f43194wkgbmnqykc);
        }
        return false;
    }

    public int hashCode() {
        return (((((w0.nufgyqmvbu.btonecajqb(this.f43192iobyxmoadg) * 31) + w0.nufgyqmvbu.btonecajqb(this.f43195zoijcleaow)) * 31) + w0.nufgyqmvbu.btonecajqb(this.f43193ppxfxbqfkf)) * 31) + w0.nufgyqmvbu.btonecajqb(this.f43194wkgbmnqykc);
    }

    @Override // igdgnonuha.j
    public androidx.compose.runtime.i1 iobyxmoadg(metgxyhuhe.btonecajqb btonecajqbVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        draadjrbmkVar.sopmlzcsov(-478475335);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-478475335, i13, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:259)");
        }
        int i14 = i13 & 14;
        int i15 = i14 ^ 6;
        boolean z13 = (i15 > 4 && draadjrbmkVar.ulzqkzuiru(btonecajqbVar)) || (i13 & 6) == 4;
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new k(this.f43192iobyxmoadg, this.f43195zoijcleaow, this.f43193ppxfxbqfkf, this.f43194wkgbmnqykc, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        k kVar = (k) objYadqdtsiqt;
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(kVar) | ((((i13 & 112) ^ 48) > 32 && draadjrbmkVar.ulzqkzuiru(this)) || (i13 & 48) == 32);
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt2 = new iobyxmoadg(kVar, this, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        androidx.compose.runtime.jlmebxxoox.eablkybsjg(this, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, (i13 >> 3) & 14);
        boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(kVar) | ((i15 > 4 && draadjrbmkVar.ulzqkzuiru(btonecajqbVar)) || (i13 & 6) == 4);
        Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd2 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt3 = new zoijcleaow(btonecajqbVar, kVar, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
        }
        androidx.compose.runtime.jlmebxxoox.eablkybsjg(btonecajqbVar, (tg.rgvfuqvkyq) objYadqdtsiqt3, draadjrbmkVar, i14);
        androidx.compose.runtime.i1 i1VarPpxfxbqfkf = kVar.ppxfxbqfkf();
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return i1VarPpxfxbqfkf;
    }

    private jztzpxfvev(float f13, float f14, float f15, float f16) {
        this.f43192iobyxmoadg = f13;
        this.f43195zoijcleaow = f14;
        this.f43193ppxfxbqfkf = f15;
        this.f43194wkgbmnqykc = f16;
    }
}
