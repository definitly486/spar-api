package igdgnonuha;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class r4 {

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final iobyxmoadg f43665vdvldrhtss = new iobyxmoadg(null);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final androidx.compose.runtime.roivzttewh f43666agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final sj.lqeggnwhkg f43667btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private float f43668draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f43669dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.compose.runtime.roivzttewh f43670eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private float f43671gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final androidx.compose.runtime.roivzttewh f43672gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vipkmwdibw.gtknphoqwx f43673iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final androidx.compose.runtime.roivzttewh f43674lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f43675nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f43676ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f43677ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final jztzpxfvev.jpowsppfya f43678rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f43679wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f43680wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f43681zoijcleaow;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f43682cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f43684jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        float f43685yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f43686zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f43684jyumaefscl = obj;
            this.f43682cqumvgiudr |= Integer.MIN_VALUE;
            return r4.this.cdpycssgdh(null, null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ r4 f43687iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ float f43688jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f43689yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f43690zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(float f13, r4 r4Var, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f43688jyumaefscl = f13;
            this.f43687iwizpuwonk = r4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(this.f43688jyumaefscl, this.f43687iwizpuwonk, gxszxtbevoVar);
            gxszxtbevoVar2.f43689yggfygwlhe = obj;
            return gxszxtbevoVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f43690zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ((jztzpxfvev.iozdgvuglv) this.f43689yggfygwlhe).iobyxmoadg(this.f43688jyumaefscl - this.f43687iwizpuwonk.f43674lqeggnwhkg.zoijcleaow());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(jztzpxfvev.iozdgvuglv iozdgvuglvVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(iozdgvuglvVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class lqeggnwhkg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f43691zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f43692zdlpuopuiu;

            /* JADX INFO: renamed from: igdgnonuha.r4$lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1022iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f43694yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f43695zdlpuopuiu;

                public C1022iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f43695zdlpuopuiu = obj;
                    this.f43694yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f43692zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1022iobyxmoadg c1022iobyxmoadg;
                if (gxszxtbevoVar instanceof C1022iobyxmoadg) {
                    c1022iobyxmoadg = (C1022iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1022iobyxmoadg.f43694yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1022iobyxmoadg.f43694yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1022iobyxmoadg = new C1022iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1022iobyxmoadg = new C1022iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1022iobyxmoadg.f43695zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1022iobyxmoadg.f43694yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f43692zdlpuopuiu;
                    if (!((Map) obj).isEmpty()) {
                        c1022iobyxmoadg.f43694yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c1022iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public lqeggnwhkg(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f43691zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f43691zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw.gtknphoqwx f43696jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ r4 f43697yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Object f43698zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            int f43699iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f43701yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f43702zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f43701yggfygwlhe = obj;
                this.f43699iwizpuwonk |= Integer.MIN_VALUE;
                return ppxfxbqfkf.this.emit(null, this);
            }
        }

        ppxfxbqfkf(Object obj, r4 r4Var, vipkmwdibw.gtknphoqwx gtknphoqwxVar) {
            this.f43698zdlpuopuiu = obj;
            this.f43697yggfygwlhe = r4Var;
            this.f43696jyumaefscl = gtknphoqwxVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(Map map, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f43699iwizpuwonk;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f43699iwizpuwonk = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj = iobyxmoadgVar.f43701yggfygwlhe;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f43699iwizpuwonk;
            try {
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    Float fLqeggnwhkg = m4.lqeggnwhkg(map, this.f43698zdlpuopuiu);
                    if (fLqeggnwhkg == null) {
                        throw new IllegalArgumentException("The target value must have an associated anchor.");
                    }
                    r4 r4Var = this.f43697yggfygwlhe;
                    float fFloatValue = fLqeggnwhkg.floatValue();
                    vipkmwdibw.gtknphoqwx gtknphoqwxVar = this.f43696jyumaefscl;
                    iobyxmoadgVar.f43702zdlpuopuiu = map;
                    iobyxmoadgVar.f43699iwizpuwonk = 1;
                    if (r4Var.gtknphoqwx(fFloatValue, gtknphoqwxVar, iobyxmoadgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) iobyxmoadgVar.f43702zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                float fZoijcleaow = this.f43697yggfygwlhe.f43674lqeggnwhkg.zoijcleaow();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (Math.abs(((Number) entry.getKey()).floatValue() - fZoijcleaow) < 0.5f) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Object objIyctptxqzt = hg.jyumaefscl.iyctptxqzt(linkedHashMap.values());
                if (objIyctptxqzt == null) {
                    objIyctptxqzt = this.f43697yggfygwlhe.kcexrzcfyt();
                }
                this.f43697yggfygwlhe.lmojexxdyd(objIyctptxqzt);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                float fZoijcleaow2 = this.f43697yggfygwlhe.f43674lqeggnwhkg.zoijcleaow();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    if (Math.abs(((Number) entry2.getKey()).floatValue() - fZoijcleaow2) < 0.5f) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Object objIyctptxqzt2 = hg.jyumaefscl.iyctptxqzt(linkedHashMap2.values());
                if (objIyctptxqzt2 == null) {
                    objIyctptxqzt2 = this.f43697yggfygwlhe.kcexrzcfyt();
                }
                this.f43697yggfygwlhe.lmojexxdyd(objIyctptxqzt2);
                throw th2;
            }
        }
    }

    static final class wkgbmnqykc implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ float f43703yggfygwlhe;

        wkgbmnqykc(float f13) {
            this.f43703yggfygwlhe = f13;
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(Map map, lg.gxszxtbevo gxszxtbevoVar) {
            Float fLqeggnwhkg = m4.lqeggnwhkg(map, r4.this.kcexrzcfyt());
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fLqeggnwhkg);
            float fFloatValue = fLqeggnwhkg.floatValue();
            Object obj = map.get(kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(m4.eablkybsjg(((Number) r4.this.jyumaefscl().getValue()).floatValue(), fFloatValue, map.keySet(), r4.this.esjtqupxsv(), this.f43703yggfygwlhe, r4.this.lereixgezr())));
            if (obj != null && ((Boolean) r4.this.oxmwwwfdhm().invoke(obj)).booleanValue()) {
                Object objWflxmlrfwp = r4.wflxmlrfwp(r4.this, obj, null, gxszxtbevoVar, 2, null);
                return objWflxmlrfwp == mg.zoijcleaow.gxszxtbevo() ? objWflxmlrfwp : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            r4 r4Var = r4.this;
            Object objGtknphoqwx = r4Var.gtknphoqwx(fFloatValue, r4Var.vdvldrhtss(), gxszxtbevoVar);
            return objGtknphoqwx == mg.zoijcleaow.gxszxtbevo() ? objGtknphoqwx : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw.gtknphoqwx f43705cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ float f43706iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f43708yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f43709zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(float f13, vipkmwdibw.gtknphoqwx gtknphoqwxVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f43706iwizpuwonk = f13;
            this.f43705cqumvgiudr = gtknphoqwxVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn zdlpuopuiu(jztzpxfvev.iozdgvuglv iozdgvuglvVar, kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar, vipkmwdibw.zoijcleaow zoijcleaowVar) {
            iozdgvuglvVar.iobyxmoadg(((Number) zoijcleaowVar.wflxmlrfwp()).floatValue() - pkzmftpjixVar.f60030zdlpuopuiu);
            pkzmftpjixVar.f60030zdlpuopuiu = ((Number) zoijcleaowVar.wflxmlrfwp()).floatValue();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = r4.this.new zoijcleaow(this.f43706iwizpuwonk, this.f43705cqumvgiudr, gxszxtbevoVar);
            zoijcleaowVar.f43708yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo;
            Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f43709zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    final jztzpxfvev.iozdgvuglv iozdgvuglvVar = (jztzpxfvev.iozdgvuglv) this.f43708yggfygwlhe;
                    final kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar = new kotlin.jvm.internal.pkzmftpjix();
                    pkzmftpjixVar.f60030zdlpuopuiu = r4.this.f43674lqeggnwhkg.zoijcleaow();
                    r4.this.f43675nufgyqmvbu.setValue(kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(this.f43706iwizpuwonk));
                    r4.this.iozdgvuglv(true);
                    vipkmwdibw.zoijcleaow zoijcleaowVarZoijcleaow = vipkmwdibw.ppxfxbqfkf.zoijcleaow(pkzmftpjixVar.f60030zdlpuopuiu, 0.0f, 2, null);
                    Float fPpxfxbqfkf = kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(this.f43706iwizpuwonk);
                    vipkmwdibw.gtknphoqwx gtknphoqwxVar = this.f43705cqumvgiudr;
                    tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: igdgnonuha.s4
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj2) {
                            return r4.zoijcleaow.zdlpuopuiu(iozdgvuglvVar, pkzmftpjixVar, (vipkmwdibw.zoijcleaow) obj2);
                        }
                    };
                    this.f43709zdlpuopuiu = 1;
                    objGxszxtbevo = vipkmwdibw.zoijcleaow.gxszxtbevo(zoijcleaowVarZoijcleaow, fPpxfxbqfkf, gtknphoqwxVar, null, draadjrbmkVar, this, 4, null);
                    if (objGxszxtbevo == objGxszxtbevo2) {
                        return objGxszxtbevo2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    objGxszxtbevo = obj;
                }
                r4.this.f43675nufgyqmvbu.setValue(null);
                r4.this.iozdgvuglv(false);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                r4.this.f43675nufgyqmvbu.setValue(null);
                r4.this.iozdgvuglv(false);
                throw th2;
            }
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public final Object invoke(jztzpxfvev.iozdgvuglv iozdgvuglvVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(iozdgvuglvVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public r4(Object obj, vipkmwdibw.gtknphoqwx gtknphoqwxVar, tg.draadjrbmk draadjrbmkVar) {
        this.f43673iobyxmoadg = gtknphoqwxVar;
        this.f43681zoijcleaow = draadjrbmkVar;
        this.f43677ppxfxbqfkf = androidx.compose.runtime.c1.ppxfxbqfkf(obj, null, 2, null);
        this.f43680wkgbmnqykc = androidx.compose.runtime.c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
        this.f43670eablkybsjg = androidx.compose.runtime.ezmngbhpjk.iobyxmoadg(0.0f);
        this.f43672gxszxtbevo = androidx.compose.runtime.ezmngbhpjk.iobyxmoadg(0.0f);
        this.f43674lqeggnwhkg = androidx.compose.runtime.ezmngbhpjk.iobyxmoadg(0.0f);
        this.f43675nufgyqmvbu = androidx.compose.runtime.c1.ppxfxbqfkf(null, null, 2, null);
        this.f43669dxjokdxxww = androidx.compose.runtime.c1.ppxfxbqfkf(hg.tzroggbefp.dxjokdxxww(), null, 2, null);
        this.f43667btonecajqb = sj.dxjokdxxww.vipkmwdibw(new lqeggnwhkg(androidx.compose.runtime.v0.ojitshcjhn(new tg.iobyxmoadg() { // from class: igdgnonuha.o4
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return r4.zynmafqrjb(this.f43518zdlpuopuiu);
            }
        })), 1);
        this.f43671gtknphoqwx = Float.NEGATIVE_INFINITY;
        this.f43668draadjrbmk = Float.POSITIVE_INFINITY;
        this.f43679wflxmlrfwp = androidx.compose.runtime.c1.ppxfxbqfkf(new tg.rgvfuqvkyq() { // from class: igdgnonuha.p4
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj2, Object obj3) {
                return Float.valueOf(r4.jpowsppfya(((Float) obj2).floatValue(), ((Float) obj3).floatValue()));
            }
        }, null, 2, null);
        this.f43666agtfadlqog = androidx.compose.runtime.ezmngbhpjk.iobyxmoadg(0.0f);
        this.f43676ojitshcjhn = androidx.compose.runtime.c1.ppxfxbqfkf(null, null, 2, null);
        this.f43678rgvfuqvkyq = jztzpxfvev.ylkuphrtab.zoijcleaow(new tg.draadjrbmk() { // from class: igdgnonuha.q4
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj2) {
                return r4.agtfadlqog(this.f43615zdlpuopuiu, ((Float) obj2).floatValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn agtfadlqog(r4 r4Var, float f13) {
        float fZoijcleaow = r4Var.f43674lqeggnwhkg.zoijcleaow() + f13;
        float fWflxmlrfwp = zg.gtknphoqwx.wflxmlrfwp(fZoijcleaow, r4Var.f43671gtknphoqwx, r4Var.f43668draadjrbmk);
        float f14 = fZoijcleaow - fWflxmlrfwp;
        g2 g2VarCqumvgiudr = r4Var.cqumvgiudr();
        r4Var.f43670eablkybsjg.pkzmftpjix(fWflxmlrfwp + (g2VarCqumvgiudr != null ? g2VarCqumvgiudr.iobyxmoadg(f14) : 0.0f));
        r4Var.f43672gxszxtbevo.pkzmftpjix(f14);
        r4Var.f43674lqeggnwhkg.pkzmftpjix(fZoijcleaow);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eablkybsjg(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object gtknphoqwx(float f13, vipkmwdibw.gtknphoqwx gtknphoqwxVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objIobyxmoadg = jztzpxfvev.jpowsppfya.iobyxmoadg(this.f43678rgvfuqvkyq, null, new zoijcleaow(f13, gtknphoqwxVar, null), gxszxtbevoVar, 1, null);
        return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final Object hcddaimhww(float f13, lg.gxszxtbevo gxszxtbevoVar) {
        Object objIobyxmoadg = jztzpxfvev.jpowsppfya.iobyxmoadg(this.f43678rgvfuqvkyq, null, new gxszxtbevo(f13, this, null), gxszxtbevoVar, 1, null);
        return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iozdgvuglv(boolean z13) {
        this.f43680wkgbmnqykc.setValue(Boolean.valueOf(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float jpowsppfya(float f13, float f14) {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lmojexxdyd(Object obj) {
        this.f43677ppxfxbqfkf.setValue(obj);
    }

    public static /* synthetic */ Object wflxmlrfwp(r4 r4Var, Object obj, vipkmwdibw.gtknphoqwx gtknphoqwxVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i13 & 2) != 0) {
            gtknphoqwxVar = r4Var.f43673iobyxmoadg;
        }
        return r4Var.draadjrbmk(obj, gtknphoqwxVar, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map zynmafqrjb(r4 r4Var) {
        return r4Var.rgvfuqvkyq();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24, types: [float] */
    /* JADX WARN: Type inference failed for: r10v65 */
    /* JADX WARN: Type inference failed for: r10v68, types: [float] */
    /* JADX WARN: Type inference failed for: r10v69 */
    /* JADX WARN: Type inference failed for: r10v70 */
    public final Object cdpycssgdh(Map map, Map map2, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        float fFloatValue;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f43682cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f43682cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object obj = eablkybsjgVar.f43684jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f43682cqumvgiudr;
        try {
            try {
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    if (map.isEmpty()) {
                        Float fFyldjkxazc = hg.jyumaefscl.fyldjkxazc(map2.keySet());
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fFyldjkxazc);
                        this.f43671gtknphoqwx = fFyldjkxazc.floatValue();
                        Float fFiwbwshyhd = hg.jyumaefscl.fiwbwshyhd(map2.keySet());
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fFiwbwshyhd);
                        this.f43668draadjrbmk = fFiwbwshyhd.floatValue();
                        Float fLqeggnwhkg = m4.lqeggnwhkg(map2, kcexrzcfyt());
                        if (fLqeggnwhkg == null) {
                            throw new IllegalArgumentException("The initial value must have an associated anchor.");
                        }
                        float fFloatValue2 = fLqeggnwhkg.floatValue();
                        eablkybsjgVar.f43682cqumvgiudr = 1;
                        if (hcddaimhww(fFloatValue2, eablkybsjgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(map2, map)) {
                        this.f43671gtknphoqwx = Float.NEGATIVE_INFINITY;
                        this.f43668draadjrbmk = Float.POSITIVE_INFINITY;
                        Float f13 = (Float) this.f43675nufgyqmvbu.getValue();
                        Object next = null;
                        if (f13 != null) {
                            Float fLqeggnwhkg2 = m4.lqeggnwhkg(map2, map.get(f13));
                            if (fLqeggnwhkg2 != null) {
                                fFloatValue = fLqeggnwhkg2.floatValue();
                            } else {
                                Iterator it = map2.keySet().iterator();
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (it.hasNext()) {
                                        float fAbs = Math.abs(((Number) next).floatValue() - f13.floatValue());
                                        do {
                                            Object next2 = it.next();
                                            float fAbs2 = Math.abs(((Number) next2).floatValue() - f13.floatValue());
                                            if (Float.compare(fAbs, fAbs2) > 0) {
                                                next = next2;
                                                fAbs = fAbs2;
                                            }
                                        } while (it.hasNext());
                                    }
                                }
                                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(next);
                                fFloatValue = ((Number) next).floatValue();
                            }
                        } else {
                            Object objKcexrzcfyt = map.get(jyumaefscl().getValue());
                            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objKcexrzcfyt, kcexrzcfyt())) {
                                objKcexrzcfyt = kcexrzcfyt();
                            }
                            Float fLqeggnwhkg3 = m4.lqeggnwhkg(map2, objKcexrzcfyt);
                            if (fLqeggnwhkg3 != null) {
                                fFloatValue = fLqeggnwhkg3.floatValue();
                            } else {
                                Iterator it2 = map2.keySet().iterator();
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (it2.hasNext()) {
                                        float fAbs3 = Math.abs(((Number) next).floatValue() - ((Number) jyumaefscl().getValue()).floatValue());
                                        do {
                                            Object next3 = it2.next();
                                            float fAbs4 = Math.abs(((Number) next3).floatValue() - ((Number) jyumaefscl().getValue()).floatValue());
                                            if (Float.compare(fAbs3, fAbs4) > 0) {
                                                next = next3;
                                                fAbs3 = fAbs4;
                                            }
                                        } while (it2.hasNext());
                                    }
                                }
                                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(next);
                                fFloatValue = ((Number) next).floatValue();
                            }
                        }
                        vipkmwdibw.gtknphoqwx gtknphoqwxVar = this.f43673iobyxmoadg;
                        eablkybsjgVar.f43686zdlpuopuiu = map2;
                        eablkybsjgVar.f43685yggfygwlhe = fFloatValue;
                        eablkybsjgVar.f43682cqumvgiudr = 2;
                        Object objGtknphoqwx = gtknphoqwx(fFloatValue, gtknphoqwxVar, eablkybsjgVar);
                        map = fFloatValue;
                        if (objGtknphoqwx == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i14 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i14 == 2) {
                    float f14 = eablkybsjgVar.f43685yggfygwlhe;
                    map2 = (Map) eablkybsjgVar.f43686zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    map = f14;
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = eablkybsjgVar.f43685yggfygwlhe;
                    map2 = (Map) eablkybsjgVar.f43686zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
            } catch (CancellationException unused) {
                eablkybsjgVar.f43686zdlpuopuiu = map2;
                eablkybsjgVar.f43685yggfygwlhe = map;
                eablkybsjgVar.f43682cqumvgiudr = 3;
                if (hcddaimhww(map, eablkybsjgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            lmojexxdyd(hg.tzroggbefp.btonecajqb(map2, kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(map)));
            Float fFyldjkxazc2 = hg.jyumaefscl.fyldjkxazc(map2.keySet());
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fFyldjkxazc2);
            this.f43671gtknphoqwx = fFyldjkxazc2.floatValue();
            Float fFiwbwshyhd2 = hg.jyumaefscl.fiwbwshyhd(map2.keySet());
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fFiwbwshyhd2);
            map = fFiwbwshyhd2.floatValue();
            this.f43668draadjrbmk = map;
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th2) {
            lmojexxdyd(hg.tzroggbefp.btonecajqb(map2, kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(map)));
            Float fFyldjkxazc3 = hg.jyumaefscl.fyldjkxazc(map2.keySet());
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fFyldjkxazc3);
            this.f43671gtknphoqwx = fFyldjkxazc3.floatValue();
            Float fFiwbwshyhd3 = hg.jyumaefscl.fiwbwshyhd(map2.keySet());
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fFiwbwshyhd3);
            this.f43668draadjrbmk = fFiwbwshyhd3.floatValue();
            throw th2;
        }
    }

    public final g2 cqumvgiudr() {
        return (g2) this.f43676ojitshcjhn.getValue();
    }

    public final Object draadjrbmk(Object obj, vipkmwdibw.gtknphoqwx gtknphoqwxVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = this.f43667btonecajqb.collect(new ppxfxbqfkf(obj, this, gtknphoqwxVar), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final tg.rgvfuqvkyq esjtqupxsv() {
        return (tg.rgvfuqvkyq) this.f43679wflxmlrfwp.getValue();
    }

    public final Object istkbnxepw(float f13, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = this.f43667btonecajqb.collect(new wkgbmnqykc(f13), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final b4 iwizpuwonk() {
        Object objKcexrzcfyt;
        Object objBtonecajqb;
        float fFloatValue;
        List listGxszxtbevo = m4.gxszxtbevo(((Number) jyumaefscl().getValue()).floatValue(), rgvfuqvkyq().keySet());
        int size = listGxszxtbevo.size();
        if (size == 0) {
            Object objKcexrzcfyt2 = kcexrzcfyt();
            objKcexrzcfyt = kcexrzcfyt();
            objBtonecajqb = objKcexrzcfyt2;
            fFloatValue = 1.0f;
        } else if (size != 1) {
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = zdlpuopuiu() > 0.0f ? gg.cqumvgiudr.iobyxmoadg(listGxszxtbevo.get(0), listGxszxtbevo.get(1)) : gg.cqumvgiudr.iobyxmoadg(listGxszxtbevo.get(1), listGxszxtbevo.get(0));
            float fFloatValue2 = ((Number) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).floatValue();
            float fFloatValue3 = ((Number) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).floatValue();
            objBtonecajqb = hg.tzroggbefp.btonecajqb(rgvfuqvkyq(), Float.valueOf(fFloatValue2));
            objKcexrzcfyt = hg.tzroggbefp.btonecajqb(rgvfuqvkyq(), Float.valueOf(fFloatValue3));
            fFloatValue = (((Number) jyumaefscl().getValue()).floatValue() - fFloatValue2) / (fFloatValue3 - fFloatValue2);
        } else {
            Object objBtonecajqb2 = hg.tzroggbefp.btonecajqb(rgvfuqvkyq(), listGxszxtbevo.get(0));
            objKcexrzcfyt = hg.tzroggbefp.btonecajqb(rgvfuqvkyq(), listGxszxtbevo.get(0));
            fFloatValue = 1.0f;
            objBtonecajqb = objBtonecajqb2;
        }
        return new b4(objBtonecajqb, objKcexrzcfyt, fFloatValue);
    }

    public final androidx.compose.runtime.i1 jyumaefscl() {
        return this.f43670eablkybsjg;
    }

    public final Object kcexrzcfyt() {
        return this.f43677ppxfxbqfkf.getValue();
    }

    public final float lereixgezr() {
        return this.f43666agtfadlqog.zoijcleaow();
    }

    public final void ojitshcjhn(Map map) {
        if (rgvfuqvkyq().isEmpty()) {
            Float fLqeggnwhkg = m4.lqeggnwhkg(map, kcexrzcfyt());
            if (fLqeggnwhkg == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            this.f43670eablkybsjg.pkzmftpjix(fLqeggnwhkg.floatValue());
            this.f43674lqeggnwhkg.pkzmftpjix(fLqeggnwhkg.floatValue());
        }
    }

    public final tg.draadjrbmk oxmwwwfdhm() {
        return this.f43681zoijcleaow;
    }

    public final void pkzmftpjix(float f13) {
        this.f43666agtfadlqog.pkzmftpjix(f13);
    }

    public final boolean pmvmpeiblj() {
        return ((Boolean) this.f43680wkgbmnqykc.getValue()).booleanValue();
    }

    public final Map rgvfuqvkyq() {
        return (Map) this.f43669dxjokdxxww.getValue();
    }

    public final vipkmwdibw.gtknphoqwx vdvldrhtss() {
        return this.f43673iobyxmoadg;
    }

    public final void wwaezpbzkn(g2 g2Var) {
        this.f43676ojitshcjhn.setValue(g2Var);
    }

    public final void yadqdtsiqt(Map map) {
        this.f43669dxjokdxxww.setValue(map);
    }

    public final jztzpxfvev.jpowsppfya yggfygwlhe() {
        return this.f43678rgvfuqvkyq;
    }

    public final void ylkuphrtab(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f43679wflxmlrfwp.setValue(rgvfuqvkyqVar);
    }

    public final float zdlpuopuiu() {
        Float fLqeggnwhkg = m4.lqeggnwhkg(rgvfuqvkyq(), kcexrzcfyt());
        if (fLqeggnwhkg == null) {
            return 0.0f;
        }
        return Math.signum(((Number) jyumaefscl().getValue()).floatValue() - fLqeggnwhkg.floatValue());
    }

    public /* synthetic */ r4(Object obj, vipkmwdibw.gtknphoqwx gtknphoqwxVar, tg.draadjrbmk draadjrbmkVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this(obj, (i13 & 2) != 0 ? j4.f43151iobyxmoadg.iobyxmoadg() : gtknphoqwxVar, (i13 & 4) != 0 ? new tg.draadjrbmk() { // from class: igdgnonuha.n4
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(r4.eablkybsjg(obj2));
            }
        } : draadjrbmkVar);
    }
}
