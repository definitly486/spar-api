package igdgnonuha;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class ipoelvxyzq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final float f43100iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final float f43101ppxfxbqfkf = w0.nufgyqmvbu.lqeggnwhkg(OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final vipkmwdibw.fmlbqenlif f43102wkgbmnqykc = new vipkmwdibw.fmlbqenlif(UserVerificationMethods.USER_VERIFY_HANDPRINT, 0, null, 6, null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final float f43103zoijcleaow;

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ h.e f43104cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ long f43105esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f43106istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ long f43107iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ pj.cllcsxoeiz f43108jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ long f43109lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ float f43110pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f43111yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ezmngbhpjk f43112zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f43113zynmafqrjb;

        /* JADX INFO: renamed from: igdgnonuha.ipoelvxyzq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1012iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ezmngbhpjk f43114yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f43115zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1012iobyxmoadg(ezmngbhpjk ezmngbhpjkVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f43114yggfygwlhe = ezmngbhpjkVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C1012iobyxmoadg(this.f43114yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f43115zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ezmngbhpjk ezmngbhpjkVar = this.f43114yggfygwlhe;
                    this.f43115zdlpuopuiu = 1;
                    if (ezmngbhpjkVar.eablkybsjg(this) == objGxszxtbevo) {
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
                return ((C1012iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class ppxfxbqfkf implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ tg.vdvldrhtss f43116zdlpuopuiu;

            ppxfxbqfkf(tg.vdvldrhtss vdvldrhtssVar) {
                this.f43116zdlpuopuiu = vdvldrhtssVar;
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
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1265707871, i13, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:540)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
                tg.vdvldrhtss vdvldrhtssVar = this.f43116zdlpuopuiu;
                x.zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVar, 0);
                int iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVar, 0);
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarGxszxtbevo);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
                tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                if (draadjrbmkVar.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVar.pkzmftpjix();
                if (draadjrbmkVar.lqeggnwhkg()) {
                    draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVar.yggfygwlhe();
                }
                androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = androidx.compose.runtime.m1.iobyxmoadg(draadjrbmkVar);
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf());
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
                tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iIobyxmoadg))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iIobyxmoadg));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iIobyxmoadg), rgvfuqvkyqVarZoijcleaow);
                }
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
                vdvldrhtssVar.invoke(czzsidtyhn.vdvldrhtss.f26487iobyxmoadg, draadjrbmkVar, 6);
                draadjrbmkVar.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ezmngbhpjk f43117yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f43118zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(ezmngbhpjk ezmngbhpjkVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f43117yggfygwlhe = ezmngbhpjkVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f43117yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f43118zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ezmngbhpjk ezmngbhpjkVar = this.f43117yggfygwlhe;
                    this.f43118zdlpuopuiu = 1;
                    if (ezmngbhpjkVar.eablkybsjg(this) == objGxszxtbevo) {
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

        iobyxmoadg(ezmngbhpjk ezmngbhpjkVar, boolean z13, pj.cllcsxoeiz cllcsxoeizVar, long j13, h.e eVar, long j14, long j15, float f13, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.vdvldrhtss vdvldrhtssVar) {
            this.f43112zdlpuopuiu = ezmngbhpjkVar;
            this.f43111yggfygwlhe = z13;
            this.f43108jyumaefscl = cllcsxoeizVar;
            this.f43107iwizpuwonk = j13;
            this.f43104cqumvgiudr = eVar;
            this.f43105esjtqupxsv = j14;
            this.f43109lereixgezr = j15;
            this.f43110pmvmpeiblj = f13;
            this.f43113zynmafqrjb = rgvfuqvkyqVar;
            this.f43106istkbnxepw = vdvldrhtssVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn agtfadlqog(String str, final ezmngbhpjk ezmngbhpjkVar, final pj.cllcsxoeiz cllcsxoeizVar, g0.yadqdtsiqt yadqdtsiqtVar) {
            g0.zynmafqrjb.czzsidtyhn(yadqdtsiqtVar, str);
            if (ezmngbhpjkVar.nufgyqmvbu()) {
                g0.zynmafqrjb.draadjrbmk(yadqdtsiqtVar, null, new tg.iobyxmoadg() { // from class: igdgnonuha.ageimvtcrz
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Boolean.valueOf(ipoelvxyzq.iobyxmoadg.ojitshcjhn(ezmngbhpjkVar, cllcsxoeizVar));
                    }
                }, 1, null);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float kcexrzcfyt(float f13, float f14, ezmngbhpjk ezmngbhpjkVar) {
            return ipoelvxyzq.yggfygwlhe(f13, f14, ezmngbhpjkVar.btonecajqb());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ojitshcjhn(ezmngbhpjk ezmngbhpjkVar, pj.cllcsxoeiz cllcsxoeizVar) {
            if (!((Boolean) ezmngbhpjkVar.gxszxtbevo().yggfygwlhe().invoke(rhgxfdycjh.Closed)).booleanValue()) {
                return true;
            }
            pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new zoijcleaow(ezmngbhpjkVar, null), 3, null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn oxmwwwfdhm(boolean z13, ezmngbhpjk ezmngbhpjkVar, pj.cllcsxoeiz cllcsxoeizVar) {
            if (z13 && ((Boolean) ezmngbhpjkVar.gxszxtbevo().yggfygwlhe().invoke(rhgxfdycjh.Closed)).booleanValue()) {
                pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new C1012iobyxmoadg(ezmngbhpjkVar, null), 3, null);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w0.agtfadlqog wflxmlrfwp(ezmngbhpjk ezmngbhpjkVar, w0.wkgbmnqykc wkgbmnqykcVar) {
            return w0.agtfadlqog.ppxfxbqfkf(w0.agtfadlqog.wkgbmnqykc((((long) vg.iobyxmoadg.wkgbmnqykc(ezmngbhpjkVar.btonecajqb())) << 32) | (((long) 0) & 4294967295L)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn yggfygwlhe(float f13, float f14, zeieaojujs zeieaojujsVar) {
            zeieaojujsVar.iobyxmoadg(rhgxfdycjh.Closed, f13);
            zeieaojujsVar.iobyxmoadg(rhgxfdycjh.Open, f14);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn zdlpuopuiu(ezmngbhpjk ezmngbhpjkVar, w0.wkgbmnqykc wkgbmnqykcVar, final float f13, final float f14) {
            ezmngbhpjkVar.gtknphoqwx(wkgbmnqykcVar);
            lqeggnwhkg.wypolnanlu(ezmngbhpjkVar.gxszxtbevo(), androidx.compose.material.iobyxmoadg.iobyxmoadg(new tg.draadjrbmk() { // from class: igdgnonuha.fyldjkxazc
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return ipoelvxyzq.iobyxmoadg.yggfygwlhe(f13, f14, (zeieaojujs) obj);
                }
            }), null, 2, null);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void gtknphoqwx(czzsidtyhn.gtknphoqwx gtknphoqwxVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            int i14;
            if ((i13 & 6) == 0) {
                i14 = i13 | (draadjrbmkVar.ulzqkzuiru(gtknphoqwxVar) ? 4 : 2);
            } else {
                i14 = i13;
            }
            if (!draadjrbmkVar.vdvldrhtss((i14 & 19) != 18, i14 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1549911011, i14, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:464)");
            }
            long jPpxfxbqfkf = gtknphoqwxVar.ppxfxbqfkf();
            if (!w0.zoijcleaow.nufgyqmvbu(jPpxfxbqfkf)) {
                throw new IllegalStateException("Drawer shouldn't have infinite width");
            }
            final float f13 = -w0.zoijcleaow.draadjrbmk(jPpxfxbqfkf);
            final w0.wkgbmnqykc wkgbmnqykcVar = (w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.gxszxtbevo());
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f43112zdlpuopuiu) | draadjrbmkVar.ulzqkzuiru(wkgbmnqykcVar) | draadjrbmkVar.zoijcleaow(f13);
            final ezmngbhpjk ezmngbhpjkVar = this.f43112zdlpuopuiu;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            final float f14 = 0.0f;
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: igdgnonuha.igdgnonuha
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return ipoelvxyzq.iobyxmoadg.zdlpuopuiu(ezmngbhpjkVar, wkgbmnqykcVar, f13, f14);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            androidx.compose.runtime.jlmebxxoox.lqeggnwhkg((tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, 0);
            boolean z13 = draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.draadjrbmk()) == w0.zdlpuopuiu.Rtl;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.material.iobyxmoadg.eablkybsjg(iobyxmoadgVar, this.f43112zdlpuopuiu.gxszxtbevo(), jztzpxfvev.jlmebxxoox.Horizontal, this.f43111yggfygwlhe, z13, null, false, 48, null);
            final ezmngbhpjk ezmngbhpjkVar2 = this.f43112zdlpuopuiu;
            final boolean z14 = this.f43111yggfygwlhe;
            final pj.cllcsxoeiz cllcsxoeizVar = this.f43108jyumaefscl;
            long j13 = this.f43107iwizpuwonk;
            h.e eVar = this.f43104cqumvgiudr;
            long j14 = this.f43105esjtqupxsv;
            long j15 = this.f43109lereixgezr;
            float f15 = this.f43110pmvmpeiblj;
            tg.rgvfuqvkyq rgvfuqvkyqVar = this.f43113zynmafqrjb;
            tg.vdvldrhtss vdvldrhtssVar = this.f43106istkbnxepw;
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar2.ojitshcjhn(), false);
            int iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVar, 0);
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarEablkybsjg);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVar.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar.pkzmftpjix();
            if (draadjrbmkVar.lqeggnwhkg()) {
                draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVar.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = androidx.compose.runtime.m1.iobyxmoadg(draadjrbmkVar);
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar3.ppxfxbqfkf());
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iIobyxmoadg))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iIobyxmoadg));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iIobyxmoadg), rgvfuqvkyqVarZoijcleaow);
            }
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar3.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar2.ojitshcjhn(), false);
            int iIobyxmoadg2 = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVar, 0);
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, iobyxmoadgVar);
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVar.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar.pkzmftpjix();
            if (draadjrbmkVar.lqeggnwhkg()) {
                draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVar.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2 = androidx.compose.runtime.m1.iobyxmoadg(draadjrbmkVar);
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar3.ppxfxbqfkf());
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iIobyxmoadg2))) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iIobyxmoadg2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iIobyxmoadg2), rgvfuqvkyqVarZoijcleaow2);
            }
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar3.wkgbmnqykc());
            rgvfuqvkyqVar.invoke(draadjrbmkVar, 0);
            draadjrbmkVar.cqumvgiudr();
            boolean zNufgyqmvbu = ezmngbhpjkVar2.nufgyqmvbu();
            boolean zIobyxmoadg = draadjrbmkVar.iobyxmoadg(z14) | draadjrbmkVar.ulzqkzuiru(ezmngbhpjkVar2) | draadjrbmkVar.lmojexxdyd(cllcsxoeizVar);
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zIobyxmoadg || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: igdgnonuha.lxfrhoxuzk
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return ipoelvxyzq.iobyxmoadg.oxmwwwfdhm(z14, ezmngbhpjkVar2, cllcsxoeizVar);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            tg.iobyxmoadg iobyxmoadgVar4 = (tg.iobyxmoadg) objYadqdtsiqt2;
            boolean zZoijcleaow = draadjrbmkVar.zoijcleaow(f13) | draadjrbmkVar.ulzqkzuiru(ezmngbhpjkVar2);
            Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
            if (zZoijcleaow || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                final float f16 = 0.0f;
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: igdgnonuha.wizcaqwiak
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(ipoelvxyzq.iobyxmoadg.kcexrzcfyt(f13, f16, ezmngbhpjkVar2));
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
            }
            ipoelvxyzq.btonecajqb(zNufgyqmvbu, iobyxmoadgVar4, (tg.iobyxmoadg) objYadqdtsiqt3, j13, draadjrbmkVar, 0);
            final String strIobyxmoadg = w3.iobyxmoadg(v3.f43979iobyxmoadg.eablkybsjg(), draadjrbmkVar, 6);
            w0.wkgbmnqykc wkgbmnqykcVar2 = (w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.gxszxtbevo());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZdlpuopuiu = androidx.compose.foundation.layout.cdpycssgdh.zdlpuopuiu(iobyxmoadgVar, wkgbmnqykcVar2.x(w0.zoijcleaow.agtfadlqog(jPpxfxbqfkf)), wkgbmnqykcVar2.x(w0.zoijcleaow.wflxmlrfwp(jPpxfxbqfkf)), wkgbmnqykcVar2.x(w0.zoijcleaow.draadjrbmk(jPpxfxbqfkf)), wkgbmnqykcVar2.x(w0.zoijcleaow.gtknphoqwx(jPpxfxbqfkf)));
            boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(ezmngbhpjkVar2);
            Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: igdgnonuha.hszhottldk
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ipoelvxyzq.iobyxmoadg.wflxmlrfwp(ezmngbhpjkVar2, (w0.wkgbmnqykc) obj);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(androidx.compose.foundation.layout.zdlpuopuiu.ppxfxbqfkf(wkgbmnqykcVarZdlpuopuiu, (tg.draadjrbmk) objYadqdtsiqt4), 0.0f, 0.0f, ipoelvxyzq.f43100iobyxmoadg, 0.0f, 11, null);
            boolean zUlzqkzuiru3 = draadjrbmkVar.ulzqkzuiru(strIobyxmoadg) | draadjrbmkVar.ulzqkzuiru(ezmngbhpjkVar2) | draadjrbmkVar.lmojexxdyd(cllcsxoeizVar);
            Object objYadqdtsiqt5 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru3 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt5 = new tg.draadjrbmk() { // from class: igdgnonuha.fiwbwshyhd
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ipoelvxyzq.iobyxmoadg.agtfadlqog(strIobyxmoadg, ezmngbhpjkVar2, cllcsxoeizVar, (g0.yadqdtsiqt) obj);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt5);
            }
            a4.ppxfxbqfkf(g0.kcexrzcfyt.ppxfxbqfkf(wkgbmnqykcVarOxmwwwfdhm, false, (tg.draadjrbmk) objYadqdtsiqt5, 1, null), eVar, j14, j15, null, f15, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1265707871, true, new ppxfxbqfkf(vdvldrhtssVar), draadjrbmkVar, 54), draadjrbmkVar, 1572864, 16);
            draadjrbmkVar.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            gtknphoqwx((czzsidtyhn.gtknphoqwx) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow implements PointerInputEventHandler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f43119iobyxmoadg;

        zoijcleaow(tg.iobyxmoadg iobyxmoadgVar) {
            this.f43119iobyxmoadg = iobyxmoadgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn zoijcleaow(tg.iobyxmoadg iobyxmoadgVar, g.eablkybsjg eablkybsjgVar) {
            iobyxmoadgVar.invoke();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(t.ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
            final tg.iobyxmoadg iobyxmoadgVar = this.f43119iobyxmoadg;
            Object objGtknphoqwx = jztzpxfvev.nuxfzjnpeb.gtknphoqwx(ylkuphrtabVar, null, null, null, new tg.draadjrbmk() { // from class: igdgnonuha.grlcpdaxtj
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return ipoelvxyzq.zoijcleaow.zoijcleaow(iobyxmoadgVar, (g.eablkybsjg) obj);
                }
            }, gxszxtbevoVar, 7, null);
            return objGtknphoqwx == mg.zoijcleaow.gxszxtbevo() ? objGtknphoqwx : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static {
        float f13 = 56;
        f43100iobyxmoadg = w0.nufgyqmvbu.lqeggnwhkg(f13);
        f43103zoijcleaow = w0.nufgyqmvbu.lqeggnwhkg(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn agtfadlqog(boolean z13, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, long j13, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        btonecajqb(z13, iobyxmoadgVar, iobyxmoadgVar2, j13, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(final boolean z13, final tg.iobyxmoadg iobyxmoadgVar, final tg.iobyxmoadg iobyxmoadgVar2, final long j13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1983403750);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.wkgbmnqykc(j13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 1171) != 1170, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1983403750, i14, -1, "androidx.compose.material.Scrim (Drawer.kt:751)");
            }
            final String strIobyxmoadg = w3.iobyxmoadg(v3.f43979iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, 6);
            if (z13) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1716233810);
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                int i15 = i14 & 112;
                boolean z14 = i15 == 32;
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new zoijcleaow(iobyxmoadgVar);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = t.tzroggbefp.ppxfxbqfkf(iobyxmoadgVar3, iobyxmoadgVar, (PointerInputEventHandler) objYadqdtsiqt);
                boolean zUlzqkzuiru = (i15 == 32) | draadjrbmkVarBtonecajqb.ulzqkzuiru(strIobyxmoadg);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: igdgnonuha.auzgnhcxok
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return ipoelvxyzq.gtknphoqwx(strIobyxmoadg, iobyxmoadgVar, (g0.yadqdtsiqt) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                wkgbmnqykcVarZoijcleaow = g0.kcexrzcfyt.zoijcleaow(wkgbmnqykcVarPpxfxbqfkf, true, (tg.draadjrbmk) objYadqdtsiqt2);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1716557884);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                wkgbmnqykcVarZoijcleaow = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null).eablkybsjg(wkgbmnqykcVarZoijcleaow);
            boolean z15 = ((i14 & 7168) == 2048) | ((i14 & 896) == 256);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: igdgnonuha.iwxlajgraz
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ipoelvxyzq.wflxmlrfwp(j13, iobyxmoadgVar2, (j.gxszxtbevo) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            ikoacuggdj.zdlpuopuiu.zoijcleaow(wkgbmnqykcVarEablkybsjg, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        androidx.compose.runtime.a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.dvvnrvtcbc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ipoelvxyzq.agtfadlqog(z13, iobyxmoadgVar, iobyxmoadgVar2, j13, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ezmngbhpjk cqumvgiudr(rhgxfdycjh rhgxfdycjhVar, tg.draadjrbmk draadjrbmkVar) {
        return new ezmngbhpjk(rhgxfdycjhVar, draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean draadjrbmk(tg.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(tg.vdvldrhtss vdvldrhtssVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, ezmngbhpjk ezmngbhpjkVar, boolean z13, h.e eVar, float f13, long j13, long j14, long j15, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        nufgyqmvbu(vdvldrhtssVar, wkgbmnqykcVar, ezmngbhpjkVar, z13, eVar, f13, j13, j14, j15, rgvfuqvkyqVar, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(String str, final tg.iobyxmoadg iobyxmoadgVar, g0.yadqdtsiqt yadqdtsiqtVar) {
        g0.zynmafqrjb.jhduphickx(yadqdtsiqtVar, str);
        g0.zynmafqrjb.lereixgezr(yadqdtsiqtVar, null, new tg.iobyxmoadg() { // from class: igdgnonuha.skhdrjzrfn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Boolean.valueOf(ipoelvxyzq.draadjrbmk(iobyxmoadgVar));
            }
        }, 1, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean iwizpuwonk(rhgxfdycjh rhgxfdycjhVar) {
        return true;
    }

    public static final ezmngbhpjk jyumaefscl(final rhgxfdycjh rhgxfdycjhVar, final tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i13, int i14) {
        if ((i14 & 2) != 0) {
            Object objYadqdtsiqt = draadjrbmkVar2.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: igdgnonuha.tbqsvytpvh
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ipoelvxyzq.iwizpuwonk((rhgxfdycjh) obj));
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar = (tg.draadjrbmk) objYadqdtsiqt;
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1435874229, i13, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:390)");
        }
        Object[] objArr = new Object[0];
        rhgxfdycjh.jyumaefscl jyumaefsclVarPpxfxbqfkf = ezmngbhpjk.f42884ppxfxbqfkf.ppxfxbqfkf(draadjrbmkVar);
        boolean z13 = true;
        boolean z14 = (((i13 & 14) ^ 6) > 4 && draadjrbmkVar2.ppxfxbqfkf(rhgxfdycjhVar.ordinal())) || (i13 & 6) == 4;
        if ((((i13 & 112) ^ 48) <= 32 || !draadjrbmkVar2.ulzqkzuiru(draadjrbmkVar)) && (i13 & 48) != 32) {
            z13 = false;
        }
        boolean z15 = z14 | z13;
        Object objYadqdtsiqt2 = draadjrbmkVar2.yadqdtsiqt();
        if (z15 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: igdgnonuha.roivzttewh
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return ipoelvxyzq.cqumvgiudr(rhgxfdycjhVar, draadjrbmkVar);
                }
            };
            draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
        }
        ezmngbhpjk ezmngbhpjkVar = (ezmngbhpjk) rhgxfdycjh.wkgbmnqykc.eablkybsjg(objArr, jyumaefsclVarPpxfxbqfkf, (tg.iobyxmoadg) objYadqdtsiqt2, draadjrbmkVar2, 0);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return ezmngbhpjkVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x010d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0111  */
    /* JADX WARN: Code duplicated, block: B:104:0x0117  */
    /* JADX WARN: Code duplicated, block: B:106:0x011d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0120  */
    /* JADX WARN: Code duplicated, block: B:111:0x012c  */
    /* JADX WARN: Code duplicated, block: B:112:0x012e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0137  */
    /* JADX WARN: Code duplicated, block: B:117:0x014b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0182  */
    /* JADX WARN: Code duplicated, block: B:138:0x0185  */
    /* JADX WARN: Code duplicated, block: B:141:0x018b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0195  */
    /* JADX WARN: Code duplicated, block: B:144:0x0198  */
    /* JADX WARN: Code duplicated, block: B:147:0x019d  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:150:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:155:0x01be  */
    /* JADX WARN: Code duplicated, block: B:158:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:169:0x0207  */
    /* JADX WARN: Code duplicated, block: B:172:0x025d  */
    /* JADX WARN: Code duplicated, block: B:174:0x026b  */
    /* JADX WARN: Code duplicated, block: B:177:0x027f  */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:96:0x0101  */
    /* JADX WARN: Code duplicated, block: B:98:0x0105  */
    public static final void nufgyqmvbu(final tg.vdvldrhtss vdvldrhtssVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, ezmngbhpjk ezmngbhpjkVar, boolean z13, h.e eVar, float f13, long j13, long j14, long j15, final tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        ezmngbhpjk ezmngbhpjkVar2;
        int i16;
        boolean z14;
        int i17;
        h.e eVar2;
        int i18;
        float f14;
        int i19;
        int i23;
        int i24;
        boolean z15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final ezmngbhpjk ezmngbhpjkVar3;
        final boolean z16;
        final h.e eVar3;
        final float f15;
        final long j16;
        final long j17;
        final long j18;
        androidx.compose.runtime.a0 a0VarWflxmlrfwp;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        ezmngbhpjk ezmngbhpjkVarJyumaefscl;
        h.e eVarWkgbmnqykc;
        float fZoijcleaow;
        long jIobyxmoadg;
        long jWkgbmnqykc;
        long jPpxfxbqfkf;
        int i25;
        long j19;
        Object objYadqdtsiqt;
        int i26;
        int i27;
        int i28;
        int i29;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1979404999);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i33 = i14 & 2;
        if (i33 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i14 & 4) == 0) {
                    ezmngbhpjkVar2 = ezmngbhpjkVar;
                    if (draadjrbmkVarBtonecajqb.ulzqkzuiru(ezmngbhpjkVar2)) {
                        i29 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    }
                    i15 |= i29;
                } else {
                    ezmngbhpjkVar2 = ezmngbhpjkVar;
                }
                i29 = UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 |= i29;
            } else {
                ezmngbhpjkVar2 = ezmngbhpjkVar;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z14 = z13;
                    if (draadjrbmkVarBtonecajqb.iobyxmoadg(z14)) {
                        i17 = 2048;
                    } else {
                        i17 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if ((i14 & 16) == 0) {
                        eVar2 = eVar;
                        int i34 = draadjrbmkVarBtonecajqb.ulzqkzuiru(eVar2) ? 16384 : 8192;
                        i15 |= i34;
                    } else {
                        eVar2 = eVar;
                    }
                    i15 |= i34;
                } else {
                    eVar2 = eVar;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        f14 = f13;
                        if (draadjrbmkVarBtonecajqb.zoijcleaow(f14)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i15 |= i19;
                    }
                    if ((1572864 & i13) == 0) {
                        if ((i14 & 64) == 0) {
                            i28 = i15;
                            int i35 = draadjrbmkVarBtonecajqb.wkgbmnqykc(j13) ? 1048576 : 524288;
                            i23 = i28 | i35;
                        } else {
                            i28 = i15;
                        }
                        i23 = i28 | i35;
                    } else {
                        i23 = i15;
                    }
                    if ((i13 & 12582912) != 0) {
                        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 || !draadjrbmkVarBtonecajqb.wkgbmnqykc(j14)) {
                            i27 = 4194304;
                        } else {
                            i27 = 8388608;
                        }
                        i23 |= i27;
                    }
                    if ((100663296 & i13) != 0) {
                        if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 || !draadjrbmkVarBtonecajqb.wkgbmnqykc(j15)) {
                            i26 = 33554432;
                        } else {
                            i26 = 67108864;
                        }
                        i23 |= i26;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        i23 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i23 |= i24;
                    }
                    if ((306783379 & i23) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (draadjrbmkVarBtonecajqb.vdvldrhtss(z15, i23 & 1)) {
                        draadjrbmkVarBtonecajqb.wwaezpbzkn();
                        if ((i13 & 1) != 0 || draadjrbmkVarBtonecajqb.dsvhmnatus()) {
                            if (i33 != 0) {
                                wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                            } else {
                                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                            }
                            if ((i14 & 4) != 0) {
                                ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                                i23 &= -897;
                            } else {
                                ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                            }
                            if (i16 != 0) {
                                z14 = true;
                            }
                            if ((i14 & 16) != 0) {
                                eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                                i23 &= -57345;
                            } else {
                                eVarWkgbmnqykc = eVar2;
                            }
                            if (i18 != 0) {
                                fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                            } else {
                                fZoijcleaow = f14;
                            }
                            if ((i14 & 64) != 0) {
                                jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                                i23 &= -3670017;
                            } else {
                                jIobyxmoadg = j13;
                            }
                            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            } else {
                                jWkgbmnqykc = j14;
                            }
                            if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                                i25 = i23 & (-234881025);
                                j19 = jWkgbmnqykc;
                                jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                            } else {
                                jPpxfxbqfkf = j15;
                                i25 = i23;
                                j19 = jWkgbmnqykc;
                            }
                        } else {
                            draadjrbmkVarBtonecajqb.hkdspvbjdz();
                            if ((i14 & 4) != 0) {
                                i23 &= -897;
                            }
                            if ((i14 & 16) != 0) {
                                i23 &= -57345;
                            }
                            if ((i14 & 64) != 0) {
                                i23 &= -3670017;
                            }
                            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                i23 &= -29360129;
                            }
                            if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                                i23 &= -234881025;
                            }
                            jPpxfxbqfkf = j15;
                            wkgbmnqykcVar4 = wkgbmnqykcVar2;
                            ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                            eVarWkgbmnqykc = eVar2;
                            fZoijcleaow = f14;
                            i25 = i23;
                            jIobyxmoadg = j13;
                            j19 = j14;
                        }
                        draadjrbmkVarBtonecajqb.esjtqupxsv();
                        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1979404999, i25, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                        }
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar4;
                        czzsidtyhn.btonecajqb.ppxfxbqfkf(androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(wkgbmnqykcVar4, 0.0f, 1, null), null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1549911011, true, new iobyxmoadg(ezmngbhpjkVarJyumaefscl, z14, (pj.cllcsxoeiz) objYadqdtsiqt, jPpxfxbqfkf, eVarWkgbmnqykc, jIobyxmoadg, j19, fZoijcleaow, rgvfuqvkyqVar, vdvldrhtssVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 3072, 6);
                        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                        }
                        ezmngbhpjkVar3 = ezmngbhpjkVarJyumaefscl;
                        eVar3 = eVarWkgbmnqykc;
                        f15 = fZoijcleaow;
                        z16 = z14;
                        j16 = jIobyxmoadg;
                        j17 = j19;
                        wkgbmnqykcVar3 = wkgbmnqykcVar5;
                        j18 = jPpxfxbqfkf;
                    } else {
                        draadjrbmkVarBtonecajqb.hkdspvbjdz();
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        ezmngbhpjkVar3 = ezmngbhpjkVar2;
                        z16 = z14;
                        eVar3 = eVar2;
                        f15 = f14;
                        j16 = j13;
                        j17 = j14;
                        j18 = j15;
                    }
                    a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                    if (a0VarWflxmlrfwp != null) {
                        a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.uawqvzlxes
                            @Override // tg.rgvfuqvkyq
                            public final Object invoke(Object obj, Object obj2) {
                                return ipoelvxyzq.dxjokdxxww(vdvldrhtssVar, wkgbmnqykcVar3, ezmngbhpjkVar3, z16, eVar3, f15, j16, j17, j18, rgvfuqvkyqVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 196608;
                f14 = f13;
                if ((1572864 & i13) == 0) {
                    if ((i14 & 64) == 0) {
                        i28 = i15;
                        if (draadjrbmkVarBtonecajqb.wkgbmnqykc(j13)) {
                        }
                        i23 = i28 | i35;
                    } else {
                        i28 = i15;
                    }
                    i23 = i28 | i35;
                } else {
                    i23 = i15;
                }
                if ((i13 & 12582912) != 0) {
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                        i27 = 4194304;
                    } else {
                        i27 = 4194304;
                    }
                    i23 |= i27;
                }
                if ((100663296 & i13) != 0) {
                    if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
                        i26 = 33554432;
                    } else {
                        i26 = 33554432;
                    }
                    i23 |= i26;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    i23 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i23 |= i24;
                }
                if ((306783379 & i23) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (draadjrbmkVarBtonecajqb.vdvldrhtss(z15, i23 & 1)) {
                    draadjrbmkVarBtonecajqb.wwaezpbzkn();
                    if ((i13 & 1) != 0) {
                        if (i33 != 0) {
                            wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar4 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                            i23 &= -897;
                        } else {
                            ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if ((i14 & 16) != 0) {
                            eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                            i23 &= -57345;
                        } else {
                            eVarWkgbmnqykc = eVar2;
                        }
                        if (i18 != 0) {
                            fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                        } else {
                            fZoijcleaow = f14;
                        }
                        if ((i14 & 64) != 0) {
                            jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                            i23 &= -3670017;
                        } else {
                            jIobyxmoadg = j13;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                            jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        } else {
                            jWkgbmnqykc = j14;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                            i25 = i23 & (-234881025);
                            j19 = jWkgbmnqykc;
                            jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                        } else {
                            jPpxfxbqfkf = j15;
                            i25 = i23;
                            j19 = jWkgbmnqykc;
                        }
                    } else {
                        if (i33 != 0) {
                            wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar4 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                            i23 &= -897;
                        } else {
                            ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if ((i14 & 16) != 0) {
                            eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                            i23 &= -57345;
                        } else {
                            eVarWkgbmnqykc = eVar2;
                        }
                        if (i18 != 0) {
                            fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                        } else {
                            fZoijcleaow = f14;
                        }
                        if ((i14 & 64) != 0) {
                            jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                            i23 &= -3670017;
                        } else {
                            jIobyxmoadg = j13;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                            jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        } else {
                            jWkgbmnqykc = j14;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                            i25 = i23 & (-234881025);
                            j19 = jWkgbmnqykc;
                            jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                        } else {
                            jPpxfxbqfkf = j15;
                            i25 = i23;
                            j19 = jWkgbmnqykc;
                        }
                    }
                    draadjrbmkVarBtonecajqb.esjtqupxsv();
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1979404999, i25, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                    }
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar4;
                    czzsidtyhn.btonecajqb.ppxfxbqfkf(androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(wkgbmnqykcVar4, 0.0f, 1, null), null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1549911011, true, new iobyxmoadg(ezmngbhpjkVarJyumaefscl, z14, (pj.cllcsxoeiz) objYadqdtsiqt, jPpxfxbqfkf, eVarWkgbmnqykc, jIobyxmoadg, j19, fZoijcleaow, rgvfuqvkyqVar, vdvldrhtssVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 3072, 6);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    ezmngbhpjkVar3 = ezmngbhpjkVarJyumaefscl;
                    eVar3 = eVarWkgbmnqykc;
                    f15 = fZoijcleaow;
                    z16 = z14;
                    j16 = jIobyxmoadg;
                    j17 = j19;
                    wkgbmnqykcVar3 = wkgbmnqykcVar6;
                    j18 = jPpxfxbqfkf;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    ezmngbhpjkVar3 = ezmngbhpjkVar2;
                    z16 = z14;
                    eVar3 = eVar2;
                    f15 = f14;
                    j16 = j13;
                    j17 = j14;
                    j18 = j15;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.uawqvzlxes
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return ipoelvxyzq.dxjokdxxww(vdvldrhtssVar, wkgbmnqykcVar3, ezmngbhpjkVar3, z16, eVar3, f15, j16, j17, j18, rgvfuqvkyqVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            z14 = z13;
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) == 0) {
                    eVar2 = eVar;
                    if (draadjrbmkVarBtonecajqb.ulzqkzuiru(eVar2)) {
                    }
                    i15 |= i34;
                } else {
                    eVar2 = eVar;
                }
                i15 |= i34;
            } else {
                eVar2 = eVar;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    f14 = f13;
                    if (draadjrbmkVarBtonecajqb.zoijcleaow(f14)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i15 |= i19;
                }
                if ((1572864 & i13) == 0) {
                    if ((i14 & 64) == 0) {
                        i28 = i15;
                        if (draadjrbmkVarBtonecajqb.wkgbmnqykc(j13)) {
                        }
                        i23 = i28 | i35;
                    } else {
                        i28 = i15;
                    }
                    i23 = i28 | i35;
                } else {
                    i23 = i15;
                }
                if ((i13 & 12582912) != 0) {
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                        i27 = 4194304;
                    } else {
                        i27 = 4194304;
                    }
                    i23 |= i27;
                }
                if ((100663296 & i13) != 0) {
                    if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
                        i26 = 33554432;
                    } else {
                        i26 = 33554432;
                    }
                    i23 |= i26;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    i23 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i23 |= i24;
                }
                if ((306783379 & i23) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (draadjrbmkVarBtonecajqb.vdvldrhtss(z15, i23 & 1)) {
                    draadjrbmkVarBtonecajqb.wwaezpbzkn();
                    if ((i13 & 1) != 0) {
                        if (i33 != 0) {
                            wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar4 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                            i23 &= -897;
                        } else {
                            ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if ((i14 & 16) != 0) {
                            eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                            i23 &= -57345;
                        } else {
                            eVarWkgbmnqykc = eVar2;
                        }
                        if (i18 != 0) {
                            fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                        } else {
                            fZoijcleaow = f14;
                        }
                        if ((i14 & 64) != 0) {
                            jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                            i23 &= -3670017;
                        } else {
                            jIobyxmoadg = j13;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                            jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        } else {
                            jWkgbmnqykc = j14;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                            i25 = i23 & (-234881025);
                            j19 = jWkgbmnqykc;
                            jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                        } else {
                            jPpxfxbqfkf = j15;
                            i25 = i23;
                            j19 = jWkgbmnqykc;
                        }
                    } else {
                        if (i33 != 0) {
                            wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar4 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                            i23 &= -897;
                        } else {
                            ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if ((i14 & 16) != 0) {
                            eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                            i23 &= -57345;
                        } else {
                            eVarWkgbmnqykc = eVar2;
                        }
                        if (i18 != 0) {
                            fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                        } else {
                            fZoijcleaow = f14;
                        }
                        if ((i14 & 64) != 0) {
                            jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                            i23 &= -3670017;
                        } else {
                            jIobyxmoadg = j13;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                            jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        } else {
                            jWkgbmnqykc = j14;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                            i25 = i23 & (-234881025);
                            j19 = jWkgbmnqykc;
                            jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                        } else {
                            jPpxfxbqfkf = j15;
                            i25 = i23;
                            j19 = jWkgbmnqykc;
                        }
                    }
                    draadjrbmkVarBtonecajqb.esjtqupxsv();
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1979404999, i25, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                    }
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar4;
                    czzsidtyhn.btonecajqb.ppxfxbqfkf(androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(wkgbmnqykcVar4, 0.0f, 1, null), null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1549911011, true, new iobyxmoadg(ezmngbhpjkVarJyumaefscl, z14, (pj.cllcsxoeiz) objYadqdtsiqt, jPpxfxbqfkf, eVarWkgbmnqykc, jIobyxmoadg, j19, fZoijcleaow, rgvfuqvkyqVar, vdvldrhtssVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 3072, 6);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    ezmngbhpjkVar3 = ezmngbhpjkVarJyumaefscl;
                    eVar3 = eVarWkgbmnqykc;
                    f15 = fZoijcleaow;
                    z16 = z14;
                    j16 = jIobyxmoadg;
                    j17 = j19;
                    wkgbmnqykcVar3 = wkgbmnqykcVar7;
                    j18 = jPpxfxbqfkf;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    ezmngbhpjkVar3 = ezmngbhpjkVar2;
                    z16 = z14;
                    eVar3 = eVar2;
                    f15 = f14;
                    j16 = j13;
                    j17 = j14;
                    j18 = j15;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.uawqvzlxes
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return ipoelvxyzq.dxjokdxxww(vdvldrhtssVar, wkgbmnqykcVar3, ezmngbhpjkVar3, z16, eVar3, f15, j16, j17, j18, rgvfuqvkyqVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 196608;
            f14 = f13;
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) == 0) {
                    i28 = i15;
                    if (draadjrbmkVarBtonecajqb.wkgbmnqykc(j13)) {
                    }
                    i23 = i28 | i35;
                } else {
                    i28 = i15;
                }
                i23 = i28 | i35;
            } else {
                i23 = i15;
            }
            if ((i13 & 12582912) != 0) {
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                    i27 = 4194304;
                } else {
                    i27 = 4194304;
                }
                i23 |= i27;
            }
            if ((100663296 & i13) != 0) {
                if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
                    i26 = 33554432;
                } else {
                    i26 = 33554432;
                }
                i23 |= i26;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                i23 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i23 |= i24;
            }
            if ((306783379 & i23) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (draadjrbmkVarBtonecajqb.vdvldrhtss(z15, i23 & 1)) {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0) {
                    if (i33 != 0) {
                        wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar4 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                        i23 &= -897;
                    } else {
                        ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if ((i14 & 16) != 0) {
                        eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                        i23 &= -57345;
                    } else {
                        eVarWkgbmnqykc = eVar2;
                    }
                    if (i18 != 0) {
                        fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                    } else {
                        fZoijcleaow = f14;
                    }
                    if ((i14 & 64) != 0) {
                        jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                        i23 &= -3670017;
                    } else {
                        jIobyxmoadg = j13;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    } else {
                        jWkgbmnqykc = j14;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                        i25 = i23 & (-234881025);
                        j19 = jWkgbmnqykc;
                        jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                    } else {
                        jPpxfxbqfkf = j15;
                        i25 = i23;
                        j19 = jWkgbmnqykc;
                    }
                } else {
                    if (i33 != 0) {
                        wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar4 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                        i23 &= -897;
                    } else {
                        ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if ((i14 & 16) != 0) {
                        eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                        i23 &= -57345;
                    } else {
                        eVarWkgbmnqykc = eVar2;
                    }
                    if (i18 != 0) {
                        fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                    } else {
                        fZoijcleaow = f14;
                    }
                    if ((i14 & 64) != 0) {
                        jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                        i23 &= -3670017;
                    } else {
                        jIobyxmoadg = j13;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    } else {
                        jWkgbmnqykc = j14;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                        i25 = i23 & (-234881025);
                        j19 = jWkgbmnqykc;
                        jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                    } else {
                        jPpxfxbqfkf = j15;
                        i25 = i23;
                        j19 = jWkgbmnqykc;
                    }
                }
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1979404999, i25, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar8 = wkgbmnqykcVar4;
                czzsidtyhn.btonecajqb.ppxfxbqfkf(androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(wkgbmnqykcVar4, 0.0f, 1, null), null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1549911011, true, new iobyxmoadg(ezmngbhpjkVarJyumaefscl, z14, (pj.cllcsxoeiz) objYadqdtsiqt, jPpxfxbqfkf, eVarWkgbmnqykc, jIobyxmoadg, j19, fZoijcleaow, rgvfuqvkyqVar, vdvldrhtssVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 3072, 6);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                ezmngbhpjkVar3 = ezmngbhpjkVarJyumaefscl;
                eVar3 = eVarWkgbmnqykc;
                f15 = fZoijcleaow;
                z16 = z14;
                j16 = jIobyxmoadg;
                j17 = j19;
                wkgbmnqykcVar3 = wkgbmnqykcVar8;
                j18 = jPpxfxbqfkf;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                ezmngbhpjkVar3 = ezmngbhpjkVar2;
                z16 = z14;
                eVar3 = eVar2;
                f15 = f14;
                j16 = j13;
                j17 = j14;
                j18 = j15;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.uawqvzlxes
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ipoelvxyzq.dxjokdxxww(vdvldrhtssVar, wkgbmnqykcVar3, ezmngbhpjkVar3, z16, eVar3, f15, j16, j17, j18, rgvfuqvkyqVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                ezmngbhpjkVar2 = ezmngbhpjkVar;
                if (draadjrbmkVarBtonecajqb.ulzqkzuiru(ezmngbhpjkVar2)) {
                    i29 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                }
                i15 |= i29;
            } else {
                ezmngbhpjkVar2 = ezmngbhpjkVar;
            }
            i29 = UserVerificationMethods.USER_VERIFY_PATTERN;
            i15 |= i29;
        } else {
            ezmngbhpjkVar2 = ezmngbhpjkVar;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z14 = z13;
                if (draadjrbmkVarBtonecajqb.iobyxmoadg(z14)) {
                    i17 = 2048;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) == 0) {
                    eVar2 = eVar;
                    if (draadjrbmkVarBtonecajqb.ulzqkzuiru(eVar2)) {
                    }
                    i15 |= i34;
                } else {
                    eVar2 = eVar;
                }
                i15 |= i34;
            } else {
                eVar2 = eVar;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    f14 = f13;
                    if (draadjrbmkVarBtonecajqb.zoijcleaow(f14)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i15 |= i19;
                }
                if ((1572864 & i13) == 0) {
                    if ((i14 & 64) == 0) {
                        i28 = i15;
                        if (draadjrbmkVarBtonecajqb.wkgbmnqykc(j13)) {
                        }
                        i23 = i28 | i35;
                    } else {
                        i28 = i15;
                    }
                    i23 = i28 | i35;
                } else {
                    i23 = i15;
                }
                if ((i13 & 12582912) != 0) {
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                        i27 = 4194304;
                    } else {
                        i27 = 4194304;
                    }
                    i23 |= i27;
                }
                if ((100663296 & i13) != 0) {
                    if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
                        i26 = 33554432;
                    } else {
                        i26 = 33554432;
                    }
                    i23 |= i26;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    i23 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i23 |= i24;
                }
                if ((306783379 & i23) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (draadjrbmkVarBtonecajqb.vdvldrhtss(z15, i23 & 1)) {
                    draadjrbmkVarBtonecajqb.wwaezpbzkn();
                    if ((i13 & 1) != 0) {
                        if (i33 != 0) {
                            wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar4 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                            i23 &= -897;
                        } else {
                            ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if ((i14 & 16) != 0) {
                            eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                            i23 &= -57345;
                        } else {
                            eVarWkgbmnqykc = eVar2;
                        }
                        if (i18 != 0) {
                            fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                        } else {
                            fZoijcleaow = f14;
                        }
                        if ((i14 & 64) != 0) {
                            jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                            i23 &= -3670017;
                        } else {
                            jIobyxmoadg = j13;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                            jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        } else {
                            jWkgbmnqykc = j14;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                            i25 = i23 & (-234881025);
                            j19 = jWkgbmnqykc;
                            jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                        } else {
                            jPpxfxbqfkf = j15;
                            i25 = i23;
                            j19 = jWkgbmnqykc;
                        }
                    } else {
                        if (i33 != 0) {
                            wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar4 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 4) != 0) {
                            ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                            i23 &= -897;
                        } else {
                            ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if ((i14 & 16) != 0) {
                            eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                            i23 &= -57345;
                        } else {
                            eVarWkgbmnqykc = eVar2;
                        }
                        if (i18 != 0) {
                            fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                        } else {
                            fZoijcleaow = f14;
                        }
                        if ((i14 & 64) != 0) {
                            jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                            i23 &= -3670017;
                        } else {
                            jIobyxmoadg = j13;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                            jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        } else {
                            jWkgbmnqykc = j14;
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                            i25 = i23 & (-234881025);
                            j19 = jWkgbmnqykc;
                            jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                        } else {
                            jPpxfxbqfkf = j15;
                            i25 = i23;
                            j19 = jWkgbmnqykc;
                        }
                    }
                    draadjrbmkVarBtonecajqb.esjtqupxsv();
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1979404999, i25, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                    }
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar9 = wkgbmnqykcVar4;
                    czzsidtyhn.btonecajqb.ppxfxbqfkf(androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(wkgbmnqykcVar4, 0.0f, 1, null), null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1549911011, true, new iobyxmoadg(ezmngbhpjkVarJyumaefscl, z14, (pj.cllcsxoeiz) objYadqdtsiqt, jPpxfxbqfkf, eVarWkgbmnqykc, jIobyxmoadg, j19, fZoijcleaow, rgvfuqvkyqVar, vdvldrhtssVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 3072, 6);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    ezmngbhpjkVar3 = ezmngbhpjkVarJyumaefscl;
                    eVar3 = eVarWkgbmnqykc;
                    f15 = fZoijcleaow;
                    z16 = z14;
                    j16 = jIobyxmoadg;
                    j17 = j19;
                    wkgbmnqykcVar3 = wkgbmnqykcVar9;
                    j18 = jPpxfxbqfkf;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    ezmngbhpjkVar3 = ezmngbhpjkVar2;
                    z16 = z14;
                    eVar3 = eVar2;
                    f15 = f14;
                    j16 = j13;
                    j17 = j14;
                    j18 = j15;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.uawqvzlxes
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return ipoelvxyzq.dxjokdxxww(vdvldrhtssVar, wkgbmnqykcVar3, ezmngbhpjkVar3, z16, eVar3, f15, j16, j17, j18, rgvfuqvkyqVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 196608;
            f14 = f13;
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) == 0) {
                    i28 = i15;
                    if (draadjrbmkVarBtonecajqb.wkgbmnqykc(j13)) {
                    }
                    i23 = i28 | i35;
                } else {
                    i28 = i15;
                }
                i23 = i28 | i35;
            } else {
                i23 = i15;
            }
            if ((i13 & 12582912) != 0) {
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                    i27 = 4194304;
                } else {
                    i27 = 4194304;
                }
                i23 |= i27;
            }
            if ((100663296 & i13) != 0) {
                if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
                    i26 = 33554432;
                } else {
                    i26 = 33554432;
                }
                i23 |= i26;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                i23 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i23 |= i24;
            }
            if ((306783379 & i23) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (draadjrbmkVarBtonecajqb.vdvldrhtss(z15, i23 & 1)) {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0) {
                    if (i33 != 0) {
                        wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar4 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                        i23 &= -897;
                    } else {
                        ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if ((i14 & 16) != 0) {
                        eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                        i23 &= -57345;
                    } else {
                        eVarWkgbmnqykc = eVar2;
                    }
                    if (i18 != 0) {
                        fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                    } else {
                        fZoijcleaow = f14;
                    }
                    if ((i14 & 64) != 0) {
                        jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                        i23 &= -3670017;
                    } else {
                        jIobyxmoadg = j13;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    } else {
                        jWkgbmnqykc = j14;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                        i25 = i23 & (-234881025);
                        j19 = jWkgbmnqykc;
                        jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                    } else {
                        jPpxfxbqfkf = j15;
                        i25 = i23;
                        j19 = jWkgbmnqykc;
                    }
                } else {
                    if (i33 != 0) {
                        wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar4 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                        i23 &= -897;
                    } else {
                        ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if ((i14 & 16) != 0) {
                        eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                        i23 &= -57345;
                    } else {
                        eVarWkgbmnqykc = eVar2;
                    }
                    if (i18 != 0) {
                        fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                    } else {
                        fZoijcleaow = f14;
                    }
                    if ((i14 & 64) != 0) {
                        jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                        i23 &= -3670017;
                    } else {
                        jIobyxmoadg = j13;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    } else {
                        jWkgbmnqykc = j14;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                        i25 = i23 & (-234881025);
                        j19 = jWkgbmnqykc;
                        jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                    } else {
                        jPpxfxbqfkf = j15;
                        i25 = i23;
                        j19 = jWkgbmnqykc;
                    }
                }
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1979404999, i25, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar10 = wkgbmnqykcVar4;
                czzsidtyhn.btonecajqb.ppxfxbqfkf(androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(wkgbmnqykcVar4, 0.0f, 1, null), null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1549911011, true, new iobyxmoadg(ezmngbhpjkVarJyumaefscl, z14, (pj.cllcsxoeiz) objYadqdtsiqt, jPpxfxbqfkf, eVarWkgbmnqykc, jIobyxmoadg, j19, fZoijcleaow, rgvfuqvkyqVar, vdvldrhtssVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 3072, 6);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                ezmngbhpjkVar3 = ezmngbhpjkVarJyumaefscl;
                eVar3 = eVarWkgbmnqykc;
                f15 = fZoijcleaow;
                z16 = z14;
                j16 = jIobyxmoadg;
                j17 = j19;
                wkgbmnqykcVar3 = wkgbmnqykcVar10;
                j18 = jPpxfxbqfkf;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                ezmngbhpjkVar3 = ezmngbhpjkVar2;
                z16 = z14;
                eVar3 = eVar2;
                f15 = f14;
                j16 = j13;
                j17 = j14;
                j18 = j15;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.uawqvzlxes
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ipoelvxyzq.dxjokdxxww(vdvldrhtssVar, wkgbmnqykcVar3, ezmngbhpjkVar3, z16, eVar3, f15, j16, j17, j18, rgvfuqvkyqVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        z14 = z13;
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) == 0) {
                eVar2 = eVar;
                if (draadjrbmkVarBtonecajqb.ulzqkzuiru(eVar2)) {
                }
                i15 |= i34;
            } else {
                eVar2 = eVar;
            }
            i15 |= i34;
        } else {
            eVar2 = eVar;
        }
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                f14 = f13;
                if (draadjrbmkVarBtonecajqb.zoijcleaow(f14)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i15 |= i19;
            }
            if ((1572864 & i13) == 0) {
                if ((i14 & 64) == 0) {
                    i28 = i15;
                    if (draadjrbmkVarBtonecajqb.wkgbmnqykc(j13)) {
                    }
                    i23 = i28 | i35;
                } else {
                    i28 = i15;
                }
                i23 = i28 | i35;
            } else {
                i23 = i15;
            }
            if ((i13 & 12582912) != 0) {
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                    i27 = 4194304;
                } else {
                    i27 = 4194304;
                }
                i23 |= i27;
            }
            if ((100663296 & i13) != 0) {
                if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
                    i26 = 33554432;
                } else {
                    i26 = 33554432;
                }
                i23 |= i26;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                i23 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i23 |= i24;
            }
            if ((306783379 & i23) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (draadjrbmkVarBtonecajqb.vdvldrhtss(z15, i23 & 1)) {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0) {
                    if (i33 != 0) {
                        wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar4 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                        i23 &= -897;
                    } else {
                        ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if ((i14 & 16) != 0) {
                        eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                        i23 &= -57345;
                    } else {
                        eVarWkgbmnqykc = eVar2;
                    }
                    if (i18 != 0) {
                        fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                    } else {
                        fZoijcleaow = f14;
                    }
                    if ((i14 & 64) != 0) {
                        jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                        i23 &= -3670017;
                    } else {
                        jIobyxmoadg = j13;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    } else {
                        jWkgbmnqykc = j14;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                        i25 = i23 & (-234881025);
                        j19 = jWkgbmnqykc;
                        jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                    } else {
                        jPpxfxbqfkf = j15;
                        i25 = i23;
                        j19 = jWkgbmnqykc;
                    }
                } else {
                    if (i33 != 0) {
                        wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar4 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 4) != 0) {
                        ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                        i23 &= -897;
                    } else {
                        ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if ((i14 & 16) != 0) {
                        eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                        i23 &= -57345;
                    } else {
                        eVarWkgbmnqykc = eVar2;
                    }
                    if (i18 != 0) {
                        fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                    } else {
                        fZoijcleaow = f14;
                    }
                    if ((i14 & 64) != 0) {
                        jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                        i23 &= -3670017;
                    } else {
                        jIobyxmoadg = j13;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    } else {
                        jWkgbmnqykc = j14;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                        i25 = i23 & (-234881025);
                        j19 = jWkgbmnqykc;
                        jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                    } else {
                        jPpxfxbqfkf = j15;
                        i25 = i23;
                        j19 = jWkgbmnqykc;
                    }
                }
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1979404999, i25, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar11 = wkgbmnqykcVar4;
                czzsidtyhn.btonecajqb.ppxfxbqfkf(androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(wkgbmnqykcVar4, 0.0f, 1, null), null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1549911011, true, new iobyxmoadg(ezmngbhpjkVarJyumaefscl, z14, (pj.cllcsxoeiz) objYadqdtsiqt, jPpxfxbqfkf, eVarWkgbmnqykc, jIobyxmoadg, j19, fZoijcleaow, rgvfuqvkyqVar, vdvldrhtssVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 3072, 6);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                ezmngbhpjkVar3 = ezmngbhpjkVarJyumaefscl;
                eVar3 = eVarWkgbmnqykc;
                f15 = fZoijcleaow;
                z16 = z14;
                j16 = jIobyxmoadg;
                j17 = j19;
                wkgbmnqykcVar3 = wkgbmnqykcVar11;
                j18 = jPpxfxbqfkf;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                ezmngbhpjkVar3 = ezmngbhpjkVar2;
                z16 = z14;
                eVar3 = eVar2;
                f15 = f14;
                j16 = j13;
                j17 = j14;
                j18 = j15;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.uawqvzlxes
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ipoelvxyzq.dxjokdxxww(vdvldrhtssVar, wkgbmnqykcVar3, ezmngbhpjkVar3, z16, eVar3, f15, j16, j17, j18, rgvfuqvkyqVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 196608;
        f14 = f13;
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) == 0) {
                i28 = i15;
                if (draadjrbmkVarBtonecajqb.wkgbmnqykc(j13)) {
                }
                i23 = i28 | i35;
            } else {
                i28 = i15;
            }
            i23 = i28 | i35;
        } else {
            i23 = i15;
        }
        if ((i13 & 12582912) != 0) {
            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                i27 = 4194304;
            } else {
                i27 = 4194304;
            }
            i23 |= i27;
        }
        if ((100663296 & i13) != 0) {
            if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
                i26 = 33554432;
            } else {
                i26 = 33554432;
            }
            i23 |= i26;
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            i23 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i23 |= i24;
        }
        if ((306783379 & i23) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss(z15, i23 & 1)) {
            draadjrbmkVarBtonecajqb.wwaezpbzkn();
            if ((i13 & 1) != 0) {
                if (i33 != 0) {
                    wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar4 = wkgbmnqykcVar2;
                }
                if ((i14 & 4) != 0) {
                    ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                    i23 &= -897;
                } else {
                    ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if ((i14 & 16) != 0) {
                    eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                    i23 &= -57345;
                } else {
                    eVarWkgbmnqykc = eVar2;
                }
                if (i18 != 0) {
                    fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                } else {
                    fZoijcleaow = f14;
                }
                if ((i14 & 64) != 0) {
                    jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                    i23 &= -3670017;
                } else {
                    jIobyxmoadg = j13;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                    i23 &= -29360129;
                } else {
                    jWkgbmnqykc = j14;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                    i25 = i23 & (-234881025);
                    j19 = jWkgbmnqykc;
                    jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                } else {
                    jPpxfxbqfkf = j15;
                    i25 = i23;
                    j19 = jWkgbmnqykc;
                }
            } else {
                if (i33 != 0) {
                    wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar4 = wkgbmnqykcVar2;
                }
                if ((i14 & 4) != 0) {
                    ezmngbhpjkVarJyumaefscl = jyumaefscl(rhgxfdycjh.Closed, null, draadjrbmkVarBtonecajqb, 6, 2);
                    i23 &= -897;
                } else {
                    ezmngbhpjkVarJyumaefscl = ezmngbhpjkVar2;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if ((i14 & 16) != 0) {
                    eVarWkgbmnqykc = nuxfzjnpeb.f43483iobyxmoadg.wkgbmnqykc(draadjrbmkVarBtonecajqb, 6);
                    i23 &= -57345;
                } else {
                    eVarWkgbmnqykc = eVar2;
                }
                if (i18 != 0) {
                    fZoijcleaow = nuxfzjnpeb.f43483iobyxmoadg.zoijcleaow();
                } else {
                    fZoijcleaow = f14;
                }
                if ((i14 & 64) != 0) {
                    jIobyxmoadg = nuxfzjnpeb.f43483iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6);
                    i23 &= -3670017;
                } else {
                    jIobyxmoadg = j13;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    jWkgbmnqykc = kegysxyocb.wkgbmnqykc(jIobyxmoadg, draadjrbmkVarBtonecajqb, (i23 >> 18) & 14);
                    i23 &= -29360129;
                } else {
                    jWkgbmnqykc = j14;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                    i25 = i23 & (-234881025);
                    j19 = jWkgbmnqykc;
                    jPpxfxbqfkf = nuxfzjnpeb.f43483iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 6);
                } else {
                    jPpxfxbqfkf = j15;
                    i25 = i23;
                    j19 = jWkgbmnqykc;
                }
            }
            draadjrbmkVarBtonecajqb.esjtqupxsv();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1979404999, i25, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar12 = wkgbmnqykcVar4;
            czzsidtyhn.btonecajqb.ppxfxbqfkf(androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(wkgbmnqykcVar4, 0.0f, 1, null), null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1549911011, true, new iobyxmoadg(ezmngbhpjkVarJyumaefscl, z14, (pj.cllcsxoeiz) objYadqdtsiqt, jPpxfxbqfkf, eVarWkgbmnqykc, jIobyxmoadg, j19, fZoijcleaow, rgvfuqvkyqVar, vdvldrhtssVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 3072, 6);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            ezmngbhpjkVar3 = ezmngbhpjkVarJyumaefscl;
            eVar3 = eVarWkgbmnqykc;
            f15 = fZoijcleaow;
            z16 = z14;
            j16 = jIobyxmoadg;
            j17 = j19;
            wkgbmnqykcVar3 = wkgbmnqykcVar12;
            j18 = jPpxfxbqfkf;
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            ezmngbhpjkVar3 = ezmngbhpjkVar2;
            z16 = z14;
            eVar3 = eVar2;
            f15 = f14;
            j16 = j13;
            j17 = j14;
            j18 = j15;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.uawqvzlxes
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ipoelvxyzq.dxjokdxxww(vdvldrhtssVar, wkgbmnqykcVar3, ezmngbhpjkVar3, z16, eVar3, f15, j16, j17, j18, rgvfuqvkyqVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wflxmlrfwp(long j13, tg.iobyxmoadg iobyxmoadgVar, j.gxszxtbevo gxszxtbevoVar) {
        j.gxszxtbevo.ribwqtqdhb(gxszxtbevoVar, j13, 0L, 0L, ((Number) iobyxmoadgVar.invoke()).floatValue(), null, null, 0, 118, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float yggfygwlhe(float f13, float f14, float f15) {
        float f16 = (f15 - f13) / (f14 - f13);
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        if (f16 > 1.0f) {
            return 1.0f;
        }
        return f16;
    }
}
