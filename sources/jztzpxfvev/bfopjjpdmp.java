package jztzpxfvev;

import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bfopjjpdmp extends yadqdtsiqt implements r.eablkybsjg, z.iwxlajgraz, z.nufgyqmvbu, crxdokpmqz {

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private final s.zoijcleaow f52600crxdokpmqz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private final nufgyqmvbu f52601ikoacuggdj;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private final yfnezrywwk f52602jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private final metgxyhuhe f52603jlmebxxoox;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private tg.rgvfuqvkyq f52604jztzpxfvev;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private ikoacuggdj.xrmfcynszj f52605ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private tg.rgvfuqvkyq f52606okpsazkaxt;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private final wflxmlrfwp f52607ribwqtqdhb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private final boolean f52608sopmlzcsov;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private hkdspvbjdz f52609ulzqkzuiru;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private final zeieaojujs f52610vipkmwdibw;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private tzroggbefp f52611xrmfcynszj;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ long f52612jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52614zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(long j13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52612jyumaefscl = j13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return bfopjjpdmp.this.new eablkybsjg(this.f52612jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52614zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zeieaojujs zeieaojujsVar = bfopjjpdmp.this.f52610vipkmwdibw;
                long j13 = this.f52612jyumaefscl;
                this.f52614zdlpuopuiu = 1;
                if (zeieaojujsVar.cqumvgiudr(j13, true, this) == objGxszxtbevo) {
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
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ float f52615iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ float f52616jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52618zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(float f13, float f14, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52616jyumaefscl = f13;
            this.f52615iwizpuwonk = f14;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return bfopjjpdmp.this.new gxszxtbevo(this.f52616jyumaefscl, this.f52615iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52618zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zeieaojujs zeieaojujsVar = bfopjjpdmp.this.f52610vipkmwdibw;
                float f13 = this.f52616jyumaefscl;
                float f14 = this.f52615iwizpuwonk;
                long jEablkybsjg = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
                this.f52618zdlpuopuiu = 1;
                if (androidx.compose.foundation.gestures.iobyxmoadg.agtfadlqog(zeieaojujsVar, jEablkybsjg, this) == objGxszxtbevo) {
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
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ zeieaojujs f52619iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f52620jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f52621yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52622zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar, zeieaojujs zeieaojujsVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52620jyumaefscl = rgvfuqvkyqVar;
            this.f52619iwizpuwonk = zeieaojujsVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn zdlpuopuiu(sopmlzcsov sopmlzcsovVar, zeieaojujs zeieaojujsVar, ojitshcjhn.zoijcleaow zoijcleaowVar) {
            sopmlzcsovVar.iobyxmoadg(zeieaojujsVar.iozdgvuglv(zoijcleaowVar.iobyxmoadg()), s.eablkybsjg.f105077iobyxmoadg.zoijcleaow());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f52620jyumaefscl, this.f52619iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f52621yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52622zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                final sopmlzcsov sopmlzcsovVar = (sopmlzcsov) this.f52621yggfygwlhe;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f52620jyumaefscl;
                final zeieaojujs zeieaojujsVar = this.f52619iwizpuwonk;
                tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: jztzpxfvev.oipsdeybqn
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return bfopjjpdmp.iobyxmoadg.zdlpuopuiu(sopmlzcsovVar, zeieaojujsVar, (ojitshcjhn.zoijcleaow) obj2);
                    }
                };
                this.f52622zdlpuopuiu = 1;
                if (rgvfuqvkyqVar.invoke(draadjrbmkVar, this) == objGxszxtbevo) {
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
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sopmlzcsov sopmlzcsovVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(sopmlzcsovVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ long f52624yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52625zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lqeggnwhkg lqeggnwhkgVar = bfopjjpdmp.this.new lqeggnwhkg(gxszxtbevoVar);
            lqeggnwhkgVar.f52624yggfygwlhe = ((g.eablkybsjg) obj).zdlpuopuiu();
            return lqeggnwhkgVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ojitshcjhn(((g.eablkybsjg) obj).zdlpuopuiu(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52625zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                long j13 = this.f52624yggfygwlhe;
                zeieaojujs zeieaojujsVar = bfopjjpdmp.this.f52610vipkmwdibw;
                this.f52625zdlpuopuiu = 1;
                obj = androidx.compose.foundation.gestures.iobyxmoadg.agtfadlqog(zeieaojujsVar, j13, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return obj;
        }

        public final Object ojitshcjhn(long j13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(g.eablkybsjg.wkgbmnqykc(j13), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ long f52626jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52628zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(long j13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52626jyumaefscl = j13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return bfopjjpdmp.this.new ppxfxbqfkf(this.f52626jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52628zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zeieaojujs zeieaojujsVar = bfopjjpdmp.this.f52610vipkmwdibw;
                long j13 = this.f52626jyumaefscl;
                this.f52628zdlpuopuiu = 1;
                if (zeieaojujsVar.cqumvgiudr(j13, false, this) == objGxszxtbevo) {
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
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ long f52629jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52631zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ long f52632jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f52633yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f52634zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(long j13, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f52632jyumaefscl = j13;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f52632jyumaefscl, gxszxtbevoVar);
                iobyxmoadgVar.f52633yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f52634zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                ((sopmlzcsov) this.f52633yggfygwlhe).zoijcleaow(this.f52632jyumaefscl, s.eablkybsjg.f105077iobyxmoadg.zoijcleaow());
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sopmlzcsov sopmlzcsovVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(sopmlzcsovVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(long j13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52629jyumaefscl = j13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return bfopjjpdmp.this.new wkgbmnqykc(this.f52629jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52631zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zeieaojujs zeieaojujsVar = bfopjjpdmp.this.f52610vipkmwdibw;
                ikoacuggdj.ribwqtqdhb ribwqtqdhbVar = ikoacuggdj.ribwqtqdhb.UserInput;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f52629jyumaefscl, null);
                this.f52631zdlpuopuiu = 1;
                if (zeieaojujsVar.istkbnxepw(ribwqtqdhbVar, iobyxmoadgVar, this) == objGxszxtbevo) {
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
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.iobyxmoadg implements tg.rgvfuqvkyq {
        zoijcleaow(Object obj) {
            super(2, obj, bfopjjpdmp.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((w0.esjtqupxsv) obj).ojitshcjhn(), (lg.gxszxtbevo) obj2);
        }

        public final Object iobyxmoadg(long j13, lg.gxszxtbevo gxszxtbevoVar) {
            return bfopjjpdmp.u1((bfopjjpdmp) this.f60022zdlpuopuiu, j13, gxszxtbevoVar);
        }
    }

    public bfopjjpdmp(opjhrmiecq opjhrmiecqVar, ikoacuggdj.xrmfcynszj xrmfcynszjVar, hkdspvbjdz hkdspvbjdzVar, jlmebxxoox jlmebxxooxVar, boolean z13, boolean z14, metgxyhuhe.draadjrbmk draadjrbmkVar, jztzpxfvev.eablkybsjg eablkybsjgVar) {
        super(androidx.compose.foundation.gestures.iobyxmoadg.gxszxtbevo(), z13, draadjrbmkVar, jlmebxxooxVar);
        this.f52605ntlheqmsrt = xrmfcynszjVar;
        this.f52609ulzqkzuiru = hkdspvbjdzVar;
        s.zoijcleaow zoijcleaowVar = new s.zoijcleaow();
        this.f52600crxdokpmqz = zoijcleaowVar;
        this.f52603jlmebxxoox = (metgxyhuhe) H0(new metgxyhuhe(z13));
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(ribwqtqdhb.zdlpuopuiu.ppxfxbqfkf(androidx.compose.foundation.gestures.iobyxmoadg.dxjokdxxww()), null, 2, null);
        this.f52607ribwqtqdhb = wflxmlrfwpVar;
        ikoacuggdj.xrmfcynszj xrmfcynszjVar2 = this.f52605ntlheqmsrt;
        hkdspvbjdz hkdspvbjdzVar2 = this.f52609ulzqkzuiru;
        zeieaojujs zeieaojujsVar = new zeieaojujs(opjhrmiecqVar, xrmfcynszjVar2, hkdspvbjdzVar2 == null ? wflxmlrfwpVar : hkdspvbjdzVar2, jlmebxxooxVar, z14, zoijcleaowVar, this, new tg.iobyxmoadg() { // from class: jztzpxfvev.ydmasvzmpa
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Boolean.valueOf(bfopjjpdmp.w1(this.f53080zdlpuopuiu));
            }
        });
        this.f52610vipkmwdibw = zeieaojujsVar;
        yfnezrywwk yfnezrywwkVar = new yfnezrywwk(zeieaojujsVar, z13);
        this.f52602jhduphickx = yfnezrywwkVar;
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) H0(new nufgyqmvbu(jlmebxxooxVar, zeieaojujsVar, z14, eablkybsjgVar));
        this.f52601ikoacuggdj = nufgyqmvbuVar;
        H0(s.wkgbmnqykc.ppxfxbqfkf(yfnezrywwkVar, zoijcleaowVar));
        H0(androidx.compose.ui.focus.oxmwwwfdhm.zoijcleaow(androidx.compose.ui.focus.yggfygwlhe.f6268iobyxmoadg.zoijcleaow(), null, 2, null));
        H0(new zfvoamnweg.eablkybsjg(nufgyqmvbuVar));
        H0(new ikoacuggdj.wwaezpbzkn(new tg.draadjrbmk() { // from class: jztzpxfvev.sflfametgt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return bfopjjpdmp.p1(this.f52949zdlpuopuiu, (x.rgvfuqvkyq) obj);
            }
        }));
    }

    private final void A1() {
        if (n0()) {
            this.f52607ribwqtqdhb.lqeggnwhkg(z.gtknphoqwx.draadjrbmk(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn p1(bfopjjpdmp bfopjjpdmpVar, x.rgvfuqvkyq rgvfuqvkyqVar) {
        bfopjjpdmpVar.f52601ikoacuggdj.b1(rgvfuqvkyqVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void s1() {
        this.f52606okpsazkaxt = null;
        this.f52604jztzpxfvev = null;
    }

    private final void t1() {
        if (this.f52611xrmfcynszj == null) {
            this.f52611xrmfcynszj = new tzroggbefp(this.f52610vipkmwdibw, jztzpxfvev.zoijcleaow.iobyxmoadg(this), new zoijcleaow(this), z.gtknphoqwx.draadjrbmk(this));
        }
        tzroggbefp tzroggbefpVar = this.f52611xrmfcynszj;
        if (tzroggbefpVar != null) {
            tzroggbefpVar.esjtqupxsv(g0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object u1(bfopjjpdmp bfopjjpdmpVar, long j13, lg.gxszxtbevo gxszxtbevoVar) {
        bfopjjpdmpVar.v1(j13);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void v1(long j13) {
        pj.gtknphoqwx.wkgbmnqykc(this.f52600crxdokpmqz.eablkybsjg(), null, null, new eablkybsjg(j13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w1(bfopjjpdmp bfopjjpdmpVar) {
        return bfopjjpdmpVar.n0();
    }

    private final void x1() {
        this.f52606okpsazkaxt = new tg.rgvfuqvkyq() { // from class: jztzpxfvev.zfvoamnweg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(bfopjjpdmp.y1(this.f53128zdlpuopuiu, ((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            }
        };
        this.f52604jztzpxfvev = new lqeggnwhkg(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y1(bfopjjpdmp bfopjjpdmpVar, float f13, float f14) {
        pj.gtknphoqwx.wkgbmnqykc(bfopjjpdmpVar.g0(), null, null, bfopjjpdmpVar.new gxszxtbevo(f13, f14, null), 3, null);
        return true;
    }

    @Override // jztzpxfvev.yadqdtsiqt
    public Object a1(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        zeieaojujs zeieaojujsVar = this.f52610vipkmwdibw;
        Object objIstkbnxepw = zeieaojujsVar.istkbnxepw(ikoacuggdj.ribwqtqdhb.UserInput, new iobyxmoadg(rgvfuqvkyqVar, zeieaojujsVar, null), gxszxtbevoVar);
        return objIstkbnxepw == mg.zoijcleaow.gxszxtbevo() ? objIstkbnxepw : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // jztzpxfvev.yadqdtsiqt
    public void e1(long j13) {
    }

    @Override // jztzpxfvev.yadqdtsiqt
    public void f1(long j13) {
        pj.gtknphoqwx.wkgbmnqykc(this.f52600crxdokpmqz.eablkybsjg(), null, null, new ppxfxbqfkf(j13, null), 3, null);
    }

    @Override // jztzpxfvev.yadqdtsiqt
    public boolean j1() {
        return this.f52610vipkmwdibw.yadqdtsiqt();
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public boolean l0() {
        return this.f52608sopmlzcsov;
    }

    @Override // jztzpxfvev.yadqdtsiqt, z.tbqsvytpvh
    public void metgxyhuhe(t.rgvfuqvkyq rgvfuqvkyqVar, t.oxmwwwfdhm oxmwwwfdhmVar, long j13) {
        List listPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf();
        int size = listPpxfxbqfkf.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((Boolean) b1().invoke((t.pmvmpeiblj) listPpxfxbqfkf.get(i13))).booleanValue()) {
                super.metgxyhuhe(rgvfuqvkyqVar, oxmwwwfdhmVar, j13);
                break;
            }
        }
        if (c1()) {
            if (oxmwwwfdhmVar == t.oxmwwwfdhm.Initial && t.kcexrzcfyt.dxjokdxxww(rgvfuqvkyqVar.lqeggnwhkg(), t.kcexrzcfyt.f109096iobyxmoadg.gxszxtbevo())) {
                t1();
            }
            tzroggbefp tzroggbefpVar = this.f52611xrmfcynszj;
            if (tzroggbefpVar != null) {
                tzroggbefpVar.cqumvgiudr(rgvfuqvkyqVar, oxmwwwfdhmVar, j13);
            }
        }
    }

    @Override // jztzpxfvev.crxdokpmqz
    public void oipsdeybqn(long j13) {
        if (n0()) {
            z.gtknphoqwx.eablkybsjg(this, j13);
        }
    }

    @Override // r.eablkybsjg
    public boolean p(KeyEvent keyEvent) {
        long jEablkybsjg;
        if (c1()) {
            long jIobyxmoadg = r.wkgbmnqykc.iobyxmoadg(keyEvent);
            r.iobyxmoadg.C1811iobyxmoadg c1811iobyxmoadg = r.iobyxmoadg.f81183iobyxmoadg;
            if ((r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, c1811iobyxmoadg.draadjrbmk()) || r.iobyxmoadg.vdvldrhtss(r.wkgbmnqykc.iobyxmoadg(keyEvent), c1811iobyxmoadg.wflxmlrfwp())) && r.ppxfxbqfkf.eablkybsjg(r.wkgbmnqykc.zoijcleaow(keyEvent), r.ppxfxbqfkf.f81321iobyxmoadg.iobyxmoadg()) && !r.wkgbmnqykc.eablkybsjg(keyEvent)) {
                if (this.f52610vipkmwdibw.iwizpuwonk()) {
                    int iX0 = (int) (this.f52601ikoacuggdj.X0() & 4294967295L);
                    jEablkybsjg = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(r.iobyxmoadg.vdvldrhtss(r.wkgbmnqykc.iobyxmoadg(keyEvent), c1811iobyxmoadg.wflxmlrfwp()) ? iX0 : -iX0)) & 4294967295L));
                } else {
                    int iX1 = (int) (this.f52601ikoacuggdj.X0() >> 32);
                    jEablkybsjg = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(r.iobyxmoadg.vdvldrhtss(r.wkgbmnqykc.iobyxmoadg(keyEvent), c1811iobyxmoadg.wflxmlrfwp()) ? iX1 : -iX1)) << 32));
                }
                pj.gtknphoqwx.wkgbmnqykc(g0(), null, null, new wkgbmnqykc(jEablkybsjg, null), 3, null);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void q0() {
        A1();
        tzroggbefp tzroggbefpVar = this.f52611xrmfcynszj;
        if (tzroggbefpVar != null) {
            tzroggbefpVar.cdpycssgdh(z.gtknphoqwx.draadjrbmk(this));
        }
    }

    @Override // r.eablkybsjg
    public boolean rhgxfdycjh(KeyEvent keyEvent) {
        return false;
    }

    @Override // z.btonecajqb
    public void yadqdtsiqt() {
        s();
        A1();
        tzroggbefp tzroggbefpVar = this.f52611xrmfcynszj;
        if (tzroggbefpVar != null) {
            tzroggbefpVar.cdpycssgdh(z.gtknphoqwx.draadjrbmk(this));
        }
    }

    @Override // z.iwxlajgraz
    public void yfnezrywwk(g0.yadqdtsiqt yadqdtsiqtVar) {
        if (c1() && (this.f52606okpsazkaxt == null || this.f52604jztzpxfvev == null)) {
            x1();
        }
        tg.rgvfuqvkyq rgvfuqvkyqVar = this.f52606okpsazkaxt;
        if (rgvfuqvkyqVar != null) {
            g0.zynmafqrjb.mbcevpiqjq(yadqdtsiqtVar, null, rgvfuqvkyqVar, 1, null);
        }
        tg.rgvfuqvkyq rgvfuqvkyqVar2 = this.f52604jztzpxfvev;
        if (rgvfuqvkyqVar2 != null) {
            g0.zynmafqrjb.ntlheqmsrt(yadqdtsiqtVar, rgvfuqvkyqVar2);
        }
    }

    public final void z1(opjhrmiecq opjhrmiecqVar, jlmebxxoox jlmebxxooxVar, ikoacuggdj.xrmfcynszj xrmfcynszjVar, boolean z13, boolean z14, hkdspvbjdz hkdspvbjdzVar, metgxyhuhe.draadjrbmk draadjrbmkVar, jztzpxfvev.eablkybsjg eablkybsjgVar) {
        boolean z15;
        if (c1() != z13) {
            this.f52602jhduphickx.iobyxmoadg(z13);
            this.f52603jlmebxxoox.I0(z13);
            z15 = true;
        } else {
            z15 = false;
        }
        boolean z16 = z15;
        boolean zJpowsppfya = this.f52610vipkmwdibw.jpowsppfya(opjhrmiecqVar, jlmebxxooxVar, xrmfcynszjVar, z14, hkdspvbjdzVar == null ? this.f52607ribwqtqdhb : hkdspvbjdzVar, this.f52600crxdokpmqz);
        this.f52601ikoacuggdj.e1(jlmebxxooxVar, z14, eablkybsjgVar);
        this.f52605ntlheqmsrt = xrmfcynszjVar;
        this.f52609ulzqkzuiru = hkdspvbjdzVar;
        l1(androidx.compose.foundation.gestures.iobyxmoadg.gxszxtbevo(), z13, draadjrbmkVar, this.f52610vipkmwdibw.iwizpuwonk() ? jlmebxxoox.Vertical : jlmebxxoox.Horizontal, zJpowsppfya);
        if (z16) {
            s1();
            z.dvvnrvtcbc.zoijcleaow(this);
        }
    }
}
