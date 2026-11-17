package igdgnonuha;

import androidx.compose.ui.platform.InspectableValueKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class m4 {

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ float f43384cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ jztzpxfvev.jlmebxxoox f43385esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f43386iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ g2 f43387jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ boolean f43388lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe.draadjrbmk f43389pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ r4 f43390yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Map f43391zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ boolean f43392zynmafqrjb;

        /* JADX INFO: renamed from: igdgnonuha.m4$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1017iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ w0.wkgbmnqykc f43393cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            final /* synthetic */ tg.rgvfuqvkyq f43394esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ g2 f43395iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ Map f43396jyumaefscl;

            /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
            final /* synthetic */ float f43397lereixgezr;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ r4 f43398yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f43399zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1017iobyxmoadg(r4 r4Var, Map map, g2 g2Var, w0.wkgbmnqykc wkgbmnqykcVar, tg.rgvfuqvkyq rgvfuqvkyqVar, float f13, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f43398yggfygwlhe = r4Var;
                this.f43396jyumaefscl = map;
                this.f43395iwizpuwonk = g2Var;
                this.f43393cqumvgiudr = wkgbmnqykcVar;
                this.f43394esjtqupxsv = rgvfuqvkyqVar;
                this.f43397lereixgezr = f13;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float kcexrzcfyt(Map map, tg.rgvfuqvkyq rgvfuqvkyqVar, w0.wkgbmnqykc wkgbmnqykcVar, float f13, float f14) {
                return ((x6) rgvfuqvkyqVar.invoke(hg.tzroggbefp.btonecajqb(map, Float.valueOf(f13)), hg.tzroggbefp.btonecajqb(map, Float.valueOf(f14)))).iobyxmoadg(wkgbmnqykcVar, f13, f14);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C1017iobyxmoadg(this.f43398yggfygwlhe, this.f43396jyumaefscl, this.f43395iwizpuwonk, this.f43393cqumvgiudr, this.f43394esjtqupxsv, this.f43397lereixgezr, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f43399zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    Map mapRgvfuqvkyq = this.f43398yggfygwlhe.rgvfuqvkyq();
                    this.f43398yggfygwlhe.yadqdtsiqt(this.f43396jyumaefscl);
                    this.f43398yggfygwlhe.wwaezpbzkn(this.f43395iwizpuwonk);
                    r4 r4Var = this.f43398yggfygwlhe;
                    final Map map = this.f43396jyumaefscl;
                    final tg.rgvfuqvkyq rgvfuqvkyqVar = this.f43394esjtqupxsv;
                    final w0.wkgbmnqykc wkgbmnqykcVar = this.f43393cqumvgiudr;
                    r4Var.ylkuphrtab(new tg.rgvfuqvkyq() { // from class: igdgnonuha.l4
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj2, Object obj3) {
                            return Float.valueOf(m4.iobyxmoadg.C1017iobyxmoadg.kcexrzcfyt(map, rgvfuqvkyqVar, wkgbmnqykcVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue()));
                        }
                    });
                    this.f43398yggfygwlhe.pkzmftpjix(this.f43393cqumvgiudr.I(this.f43397lereixgezr));
                    r4 r4Var2 = this.f43398yggfygwlhe;
                    Map map2 = this.f43396jyumaefscl;
                    this.f43399zdlpuopuiu = 1;
                    if (r4Var2.cdpycssgdh(mapRgvfuqvkyq, map2, this) == objGxszxtbevo) {
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
                return ((C1017iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ r4 f43400iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ float f43401jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f43402yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f43403zdlpuopuiu;

            /* JADX INFO: renamed from: igdgnonuha.m4$iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
            static final class C1018iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ float f43404jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ r4 f43405yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f43406zdlpuopuiu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1018iobyxmoadg(r4 r4Var, float f13, lg.gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f43405yggfygwlhe = r4Var;
                    this.f43404jyumaefscl = f13;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    return new C1018iobyxmoadg(this.f43405yggfygwlhe, this.f43404jyumaefscl, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f43406zdlpuopuiu;
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        r4 r4Var = this.f43405yggfygwlhe;
                        float f13 = this.f43404jyumaefscl;
                        this.f43406zdlpuopuiu = 1;
                        if (r4Var.istkbnxepw(f13, this) == objGxszxtbevo) {
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
                    return ((C1018iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(r4 r4Var, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f43400iwizpuwonk = r4Var;
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return ojitshcjhn((pj.cllcsxoeiz) obj, ((Number) obj2).floatValue(), (lg.gxszxtbevo) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f43403zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                pj.gtknphoqwx.wkgbmnqykc((pj.cllcsxoeiz) this.f43402yggfygwlhe, null, null, new C1018iobyxmoadg(this.f43400iwizpuwonk, this.f43401jyumaefscl, null), 3, null);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final Object ojitshcjhn(pj.cllcsxoeiz cllcsxoeizVar, float f13, lg.gxszxtbevo gxszxtbevoVar) {
                zoijcleaow zoijcleaowVar = new zoijcleaow(this.f43400iwizpuwonk, gxszxtbevoVar);
                zoijcleaowVar.f43402yggfygwlhe = cllcsxoeizVar;
                zoijcleaowVar.f43401jyumaefscl = f13;
                return zoijcleaowVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        iobyxmoadg(Map map, r4 r4Var, g2 g2Var, tg.rgvfuqvkyq rgvfuqvkyqVar, float f13, jztzpxfvev.jlmebxxoox jlmebxxooxVar, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, boolean z14) {
            this.f43391zdlpuopuiu = map;
            this.f43390yggfygwlhe = r4Var;
            this.f43387jyumaefscl = g2Var;
            this.f43386iwizpuwonk = rgvfuqvkyqVar;
            this.f43384cqumvgiudr = f13;
            this.f43385esjtqupxsv = jlmebxxooxVar;
            this.f43388lereixgezr = z13;
            this.f43389pmvmpeiblj = draadjrbmkVar;
            this.f43392zynmafqrjb = z14;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg((androidx.compose.ui.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
        }

        public final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            draadjrbmkVar.sopmlzcsov(43594985);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(43594985, i13, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:585)");
            }
            if (this.f43391zdlpuopuiu.isEmpty()) {
                throw new IllegalArgumentException("You must have at least one anchor.");
            }
            if (hg.jyumaefscl.metgxyhuhe(this.f43391zdlpuopuiu.values()).size() != this.f43391zdlpuopuiu.size()) {
                throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
            }
            w0.wkgbmnqykc wkgbmnqykcVar2 = (w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.gxszxtbevo());
            this.f43390yggfygwlhe.ojitshcjhn(this.f43391zdlpuopuiu);
            Map map = this.f43391zdlpuopuiu;
            r4 r4Var = this.f43390yggfygwlhe;
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f43390yggfygwlhe) | draadjrbmkVar.lmojexxdyd(this.f43391zdlpuopuiu) | draadjrbmkVar.ulzqkzuiru(this.f43387jyumaefscl) | draadjrbmkVar.ulzqkzuiru(this.f43386iwizpuwonk) | draadjrbmkVar.ulzqkzuiru(wkgbmnqykcVar2) | draadjrbmkVar.zoijcleaow(this.f43384cqumvgiudr);
            r4 r4Var2 = this.f43390yggfygwlhe;
            Map map2 = this.f43391zdlpuopuiu;
            g2 g2Var = this.f43387jyumaefscl;
            tg.rgvfuqvkyq rgvfuqvkyqVar = this.f43386iwizpuwonk;
            float f13 = this.f43384cqumvgiudr;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                Object c1017iobyxmoadg = new C1017iobyxmoadg(r4Var2, map2, g2Var, wkgbmnqykcVar2, rgvfuqvkyqVar, f13, null);
                draadjrbmkVar.jyumaefscl(c1017iobyxmoadg);
                objYadqdtsiqt = c1017iobyxmoadg;
            }
            androidx.compose.runtime.jlmebxxoox.wkgbmnqykc(map, r4Var, (tg.rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVar, 0);
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            boolean zPmvmpeiblj = this.f43390yggfygwlhe.pmvmpeiblj();
            jztzpxfvev.jpowsppfya jpowsppfyaVarYggfygwlhe = this.f43390yggfygwlhe.yggfygwlhe();
            jztzpxfvev.jlmebxxoox jlmebxxooxVar = this.f43385esjtqupxsv;
            boolean z13 = this.f43388lereixgezr;
            metgxyhuhe.draadjrbmk draadjrbmkVar2 = this.f43389pmvmpeiblj;
            boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(this.f43390yggfygwlhe);
            r4 r4Var3 = this.f43390yggfygwlhe;
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new zoijcleaow(r4Var3, null);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = jztzpxfvev.ylkuphrtab.nufgyqmvbu(iobyxmoadgVar, jpowsppfyaVarYggfygwlhe, jlmebxxooxVar, (32 & 4) != 0 ? true : z13, (32 & 8) != 0 ? null : draadjrbmkVar2, (32 & 16) != 0 ? false : zPmvmpeiblj, (32 & 32) != 0 ? jztzpxfvev.ylkuphrtab.f53087iobyxmoadg : null, (32 & 64) != 0 ? jztzpxfvev.ylkuphrtab.f53088zoijcleaow : (tg.vdvldrhtss) objYadqdtsiqt2, (32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : this.f43392zynmafqrjb);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar.stevsuqkhv();
            return wkgbmnqykcVarNufgyqmvbu;
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ boolean f43407cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe.draadjrbmk f43408esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ boolean f43409iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ jztzpxfvev.jlmebxxoox f43410jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f43411lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ g2 f43412pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Map f43413yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ r4 f43414zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ float f43415zynmafqrjb;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(r4 r4Var, Map map, jztzpxfvev.jlmebxxoox jlmebxxooxVar, boolean z13, boolean z14, metgxyhuhe.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar, g2 g2Var, float f13) {
            super(1);
            this.f43414zdlpuopuiu = r4Var;
            this.f43413yggfygwlhe = map;
            this.f43410jyumaefscl = jlmebxxooxVar;
            this.f43409iwizpuwonk = z13;
            this.f43407cqumvgiudr = z14;
            this.f43408esjtqupxsv = draadjrbmkVar;
            this.f43411lereixgezr = rgvfuqvkyqVar;
            this.f43412pmvmpeiblj = g2Var;
            this.f43415zynmafqrjb = f13;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
            iobyxmoadg(null);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.ui.platform.ixidwrxhsl ixidwrxhslVar) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h btonecajqb(Object obj, Object obj2) {
        return new h(w0.nufgyqmvbu.lqeggnwhkg(56), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r3 < ((java.lang.Number) r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5))).floatValue()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r3 > ((java.lang.Number) r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0))).floatValue()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float eablkybsjg(float r3, float r4, java.util.Set r5, tg.rgvfuqvkyq r6, float r7, float r8) {
        /*
            java.util.List r5 = gxszxtbevo(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L6c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L62
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L42
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L2b
            return r5
        L2b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L5e
            goto L60
        L42:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L48
            return r0
        L48:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L60
        L5e:
            r4 = r5
            goto L6c
        L60:
            r4 = r0
            goto L6c
        L62:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: igdgnonuha.m4.eablkybsjg(float, float, java.util.Set, tg.rgvfuqvkyq, float, float):float");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List gxszxtbevo(float f13, Set set) {
        Object obj;
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() <= ((double) f13) + 0.001d) {
                arrayList.add(obj2);
            }
        }
        Object obj3 = null;
        int i13 = 1;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            float fFloatValue = ((Number) obj).floatValue();
            int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(arrayList);
            if (1 <= iOjitshcjhn) {
                int i14 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i14);
                    float fFloatValue2 = ((Number) obj4).floatValue();
                    if (Float.compare(fFloatValue, fFloatValue2) < 0) {
                        obj = obj4;
                        fFloatValue = fFloatValue2;
                    }
                    if (i14 == iOjitshcjhn) {
                        break;
                    }
                    i14++;
                }
            }
        } else {
            obj = null;
        }
        Float f14 = (Float) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : set2) {
            if (((Number) obj5).floatValue() >= ((double) f13) - 0.001d) {
                arrayList2.add(obj5);
            }
        }
        if (!arrayList2.isEmpty()) {
            Object obj6 = arrayList2.get(0);
            float fFloatValue3 = ((Number) obj6).floatValue();
            int iOjitshcjhn2 = hg.jyumaefscl.ojitshcjhn(arrayList2);
            if (1 <= iOjitshcjhn2) {
                while (true) {
                    Object obj7 = arrayList2.get(i13);
                    float fFloatValue4 = ((Number) obj7).floatValue();
                    if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                        obj6 = obj7;
                        fFloatValue3 = fFloatValue4;
                    }
                    if (i13 == iOjitshcjhn2) {
                        break;
                    }
                    i13++;
                }
            }
            obj3 = obj6;
        }
        Float f15 = (Float) obj3;
        if (f14 == null) {
            return hg.jyumaefscl.vdvldrhtss(f15);
        }
        if (f15 != null && !kotlin.jvm.internal.zdlpuopuiu.wkgbmnqykc(f14, f15)) {
            return hg.jyumaefscl.rgvfuqvkyq(f14, f15);
        }
        return hg.jyumaefscl.eablkybsjg(f14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float lqeggnwhkg(Map map, Object obj) {
        Object next;
        Iterator it = map.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Map.Entry) next).getValue(), obj));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final androidx.compose.ui.wkgbmnqykc nufgyqmvbu(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, r4 r4Var, Map map, jztzpxfvev.jlmebxxoox jlmebxxooxVar, boolean z13, boolean z14, metgxyhuhe.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar, g2 g2Var, float f13) {
        return androidx.compose.ui.ppxfxbqfkf.zoijcleaow(wkgbmnqykcVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new zoijcleaow(r4Var, map, jlmebxxooxVar, z13, z14, draadjrbmkVar, rgvfuqvkyqVar, g2Var, f13) : InspectableValueKt.getNoInspectorInfo(), new iobyxmoadg(map, r4Var, g2Var, rgvfuqvkyqVar, f13, jlmebxxooxVar, z13, draadjrbmkVar, z14));
    }
}
