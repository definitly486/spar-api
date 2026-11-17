package igdgnonuha;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class j3 {

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f43131cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw.gtknphoqwx f43132iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f43133jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw.zoijcleaow f43134yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f43135zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(vipkmwdibw.zoijcleaow zoijcleaowVar, boolean z13, vipkmwdibw.gtknphoqwx gtknphoqwxVar, tg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f43134yggfygwlhe = zoijcleaowVar;
            this.f43133jyumaefscl = z13;
            this.f43132iwizpuwonk = gtknphoqwxVar;
            this.f43131cqumvgiudr = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f43134yggfygwlhe, this.f43133jyumaefscl, this.f43132iwizpuwonk, this.f43131cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f43135zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                vipkmwdibw.zoijcleaow zoijcleaowVar = this.f43134yggfygwlhe;
                Float fPpxfxbqfkf = kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(this.f43133jyumaefscl ? 1.0f : 0.0f);
                vipkmwdibw.gtknphoqwx gtknphoqwxVar = this.f43132iwizpuwonk;
                this.f43135zdlpuopuiu = 1;
                if (vipkmwdibw.zoijcleaow.gxszxtbevo(zoijcleaowVar, fPpxfxbqfkf, gtknphoqwxVar, null, null, this, 12, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            this.f43131cqumvgiudr.invoke();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw.gtknphoqwx f43136iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f43137jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw.zoijcleaow f43138yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f43139zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(vipkmwdibw.zoijcleaow zoijcleaowVar, boolean z13, vipkmwdibw.gtknphoqwx gtknphoqwxVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f43138yggfygwlhe = zoijcleaowVar;
            this.f43137jyumaefscl = z13;
            this.f43136iwizpuwonk = gtknphoqwxVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f43138yggfygwlhe, this.f43137jyumaefscl, this.f43136iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f43139zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                vipkmwdibw.zoijcleaow zoijcleaowVar = this.f43138yggfygwlhe;
                Float fPpxfxbqfkf = kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(this.f43137jyumaefscl ? 1.0f : 0.8f);
                vipkmwdibw.gtknphoqwx gtknphoqwxVar = this.f43136iwizpuwonk;
                this.f43139zdlpuopuiu = 1;
                if (vipkmwdibw.zoijcleaow.gxszxtbevo(zoijcleaowVar, fPpxfxbqfkf, gtknphoqwxVar, null, null, this, 12, null) == objGxszxtbevo) {
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

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f43140cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ g f43141iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ List f43142jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ z2 f43143yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ z2 f43144zdlpuopuiu;

        iobyxmoadg(z2 z2Var, z2 z2Var2, List list, g gVar, String str) {
            this.f43144zdlpuopuiu = z2Var;
            this.f43143yggfygwlhe = z2Var2;
            this.f43142jyumaefscl = list;
            this.f43141iwizpuwonk = gVar;
            this.f43140cqumvgiudr = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean btonecajqb(z2 z2Var, f fVar) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(fVar.ppxfxbqfkf(), z2Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn gtknphoqwx(boolean z13, String str, final z2 z2Var, g0.yadqdtsiqt yadqdtsiqtVar) {
            if (z13) {
                g0.zynmafqrjb.rlfsiqarku(yadqdtsiqtVar, g0.eablkybsjg.f35646zoijcleaow.zoijcleaow());
            }
            g0.zynmafqrjb.czzsidtyhn(yadqdtsiqtVar, str);
            g0.zynmafqrjb.draadjrbmk(yadqdtsiqtVar, null, new tg.iobyxmoadg() { // from class: igdgnonuha.h3
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return Boolean.valueOf(j3.iobyxmoadg.wflxmlrfwp(z2Var));
                }
            }, 1, null);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn lqeggnwhkg(final z2 z2Var, g gVar) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(z2Var, gVar.iobyxmoadg())) {
                hg.jyumaefscl.pkzmftpjix(gVar.zoijcleaow(), new tg.draadjrbmk() { // from class: igdgnonuha.i3
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(j3.iobyxmoadg.btonecajqb(z2Var, (f) obj));
                    }
                });
                androidx.compose.runtime.c cVarPpxfxbqfkf = gVar.ppxfxbqfkf();
                if (cVarPpxfxbqfkf != null) {
                    cVarPpxfxbqfkf.invalidate();
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean wflxmlrfwp(z2 z2Var) {
            z2Var.dismiss();
            return true;
        }

        public final void gxszxtbevo(tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            int i14;
            if ((i13 & 6) == 0) {
                i14 = i13 | (draadjrbmkVar.lmojexxdyd(rgvfuqvkyqVar) ? 4 : 2);
            } else {
                i14 = i13;
            }
            if (!draadjrbmkVar.vdvldrhtss((i14 & 19) != 18, i14 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1032415134, i14, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:257)");
            }
            final boolean zEablkybsjg = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f43144zdlpuopuiu, this.f43143yggfygwlhe);
            int i15 = zEablkybsjg ? 150 : 75;
            int i16 = (!zEablkybsjg || y0.ppxfxbqfkf.zoijcleaow(this.f43142jyumaefscl).size() == 1) ? 0 : 75;
            vipkmwdibw.fmlbqenlif fmlbqenlifVarGtknphoqwx = vipkmwdibw.draadjrbmk.gtknphoqwx(i15, i16, vipkmwdibw.lmojexxdyd.wkgbmnqykc());
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(this.f43144zdlpuopuiu) | draadjrbmkVar.lmojexxdyd(this.f43141iwizpuwonk);
            final z2 z2Var = this.f43144zdlpuopuiu;
            final g gVar = this.f43141iwizpuwonk;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: igdgnonuha.f3
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return j3.iobyxmoadg.lqeggnwhkg(z2Var, gVar);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            androidx.compose.runtime.i1 i1VarBtonecajqb = j3.btonecajqb(fmlbqenlifVarGtknphoqwx, zEablkybsjg, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, 0, 0);
            androidx.compose.runtime.i1 i1VarDraadjrbmk = j3.draadjrbmk(vipkmwdibw.draadjrbmk.gtknphoqwx(i15, i16, vipkmwdibw.lmojexxdyd.ppxfxbqfkf()), zEablkybsjg, draadjrbmkVar, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = androidx.compose.ui.graphics.gxszxtbevo.zoijcleaow(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, (131064 & 1) != 0 ? 1.0f : ((Number) i1VarDraadjrbmk.getValue()).floatValue(), (131064 & 2) != 0 ? 1.0f : ((Number) i1VarDraadjrbmk.getValue()).floatValue(), (131064 & 4) == 0 ? ((Number) i1VarBtonecajqb.getValue()).floatValue() : 1.0f, (131064 & 8) != 0 ? 0.0f : 0.0f, (131064 & 16) != 0 ? 0.0f : 0.0f, (131064 & 32) != 0 ? 0.0f : 0.0f, (131064 & 64) != 0 ? 0.0f : 0.0f, (131064 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0.0f : 0.0f, (131064 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? 0.0f : 0.0f, (131064 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 8.0f : 0.0f, (131064 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? androidx.compose.ui.graphics.btonecajqb.f6294zoijcleaow.iobyxmoadg() : 0L, (131064 & 2048) != 0 ? h.eslsurpljm.iobyxmoadg() : null, (131064 & 4096) != 0 ? false : false, (131064 & 8192) != 0 ? null : null, (131064 & 16384) != 0 ? h.iwxlajgraz.iobyxmoadg() : 0L, (131064 & 32768) != 0 ? h.iwxlajgraz.iobyxmoadg() : 0L, (131064 & 65536) != 0 ? androidx.compose.ui.graphics.eablkybsjg.f6319iobyxmoadg.iobyxmoadg() : 0);
            boolean zIobyxmoadg = draadjrbmkVar.iobyxmoadg(zEablkybsjg) | draadjrbmkVar.ulzqkzuiru(this.f43140cqumvgiudr) | draadjrbmkVar.lmojexxdyd(this.f43144zdlpuopuiu);
            final String str = this.f43140cqumvgiudr;
            final z2 z2Var2 = this.f43144zdlpuopuiu;
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zIobyxmoadg || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: igdgnonuha.g3
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return j3.iobyxmoadg.gtknphoqwx(zEablkybsjg, str, z2Var2, (g0.yadqdtsiqt) obj);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = g0.kcexrzcfyt.ppxfxbqfkf(wkgbmnqykcVarZoijcleaow, false, (tg.draadjrbmk) objYadqdtsiqt2, 1, null);
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
            int iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVar, 0);
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarPpxfxbqfkf);
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
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar.ppxfxbqfkf());
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iIobyxmoadg))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iIobyxmoadg));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iIobyxmoadg), rgvfuqvkyqVarZoijcleaow);
            }
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            rgvfuqvkyqVar.invoke(draadjrbmkVar, Integer.valueOf(i14 & 14));
            draadjrbmkVar.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            gxszxtbevo((tg.rgvfuqvkyq) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.dxjokdxxww f43145jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ z2 f43146yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f43147zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(z2 z2Var, androidx.compose.ui.platform.dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f43146yggfygwlhe = z2Var;
            this.f43145jyumaefscl = dxjokdxxwwVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f43146yggfygwlhe, this.f43145jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f43147zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                z2 z2Var = this.f43146yggfygwlhe;
                if (z2Var != null) {
                    long jWflxmlrfwp = j3.wflxmlrfwp(z2Var.iobyxmoadg(), this.f43146yggfygwlhe.ppxfxbqfkf() != null, this.f43145jyumaefscl);
                    this.f43147zdlpuopuiu = 1;
                    if (pj.crxdokpmqz.zoijcleaow(jWflxmlrfwp, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            this.f43146yggfygwlhe.dismiss();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f43148iobyxmoadg;

        static {
            int[] iArr = new int[b3.values().length];
            try {
                iArr[b3.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b3.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b3.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43148iobyxmoadg = iArr;
        }
    }

    static final class zoijcleaow implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ z2 f43149yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f43150zdlpuopuiu;

        zoijcleaow(tg.vdvldrhtss vdvldrhtssVar, z2 z2Var) {
            this.f43150zdlpuopuiu = vdvldrhtssVar;
            this.f43149yggfygwlhe = z2Var;
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(2017516783, i13, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:317)");
            }
            tg.vdvldrhtss vdvldrhtssVar = this.f43150zdlpuopuiu;
            z2 z2Var = this.f43149yggfygwlhe;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(z2Var);
            vdvldrhtssVar.invoke(z2Var, draadjrbmkVar, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.i1 btonecajqb(vipkmwdibw.gtknphoqwx gtknphoqwxVar, boolean z13, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13, int i14) {
        if ((i14 & 4) != 0) {
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: igdgnonuha.e3
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return j3.gtknphoqwx();
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt;
        }
        tg.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1016418159, i13, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:340)");
        }
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar3 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt2 == iobyxmoadgVar3.iobyxmoadg()) {
            objYadqdtsiqt2 = vipkmwdibw.ppxfxbqfkf.zoijcleaow(!z13 ? 1.0f : 0.0f, 0.0f, 2, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        vipkmwdibw.zoijcleaow zoijcleaowVar = (vipkmwdibw.zoijcleaow) objYadqdtsiqt2;
        Boolean boolValueOf = Boolean.valueOf(z13);
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(zoijcleaowVar) | ((((i13 & 112) ^ 48) > 32 && draadjrbmkVar.iobyxmoadg(z13)) || (i13 & 48) == 32) | draadjrbmkVar.lmojexxdyd(gtknphoqwxVar) | ((((i13 & 896) ^ 384) > 256 && draadjrbmkVar.ulzqkzuiru(iobyxmoadgVar2)) || (i13 & 384) == 256);
        Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt3 == iobyxmoadgVar3.iobyxmoadg()) {
            Object eablkybsjgVar = new eablkybsjg(zoijcleaowVar, z13, gtknphoqwxVar, iobyxmoadgVar2, null);
            draadjrbmkVar.jyumaefscl(eablkybsjgVar);
            objYadqdtsiqt3 = eablkybsjgVar;
        }
        androidx.compose.runtime.jlmebxxoox.eablkybsjg(boolValueOf, (tg.rgvfuqvkyq) objYadqdtsiqt3, draadjrbmkVar, (i13 >> 3) & 14);
        androidx.compose.runtime.i1 i1VarLqeggnwhkg = zoijcleaowVar.lqeggnwhkg();
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return i1VarLqeggnwhkg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.i1 draadjrbmk(vipkmwdibw.gtknphoqwx gtknphoqwxVar, boolean z13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(2003504988, i13, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:350)");
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt = vipkmwdibw.ppxfxbqfkf.zoijcleaow(!z13 ? 1.0f : 0.8f, 0.0f, 2, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        vipkmwdibw.zoijcleaow zoijcleaowVar = (vipkmwdibw.zoijcleaow) objYadqdtsiqt;
        Boolean boolValueOf = Boolean.valueOf(z13);
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(zoijcleaowVar) | ((((i13 & 112) ^ 48) > 32 && draadjrbmkVar.iobyxmoadg(z13)) || (i13 & 48) == 32) | draadjrbmkVar.lmojexxdyd(gtknphoqwxVar);
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt2 = new gxszxtbevo(zoijcleaowVar, z13, gtknphoqwxVar, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        androidx.compose.runtime.jlmebxxoox.eablkybsjg(boolValueOf, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, (i13 >> 3) & 14);
        androidx.compose.runtime.i1 i1VarLqeggnwhkg = zoijcleaowVar.lqeggnwhkg();
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return i1VarLqeggnwhkg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(z2 z2Var, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.vdvldrhtss vdvldrhtssVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        wkgbmnqykc(z2Var, wkgbmnqykcVar, vdvldrhtssVar, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx() {
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void gxszxtbevo(final k3 k3Var, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.vdvldrhtss vdvldrhtssVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1351125615);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(k3Var) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i15 & 147) != 146, i15 & 1)) {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (i17 != 0) {
                vdvldrhtssVar = mbcevpiqjq.f43420iobyxmoadg.iobyxmoadg();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1351125615, i15, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:155)");
            }
            z2 z2VarZoijcleaow = k3Var.zoijcleaow();
            androidx.compose.ui.platform.dxjokdxxww dxjokdxxwwVar = (androidx.compose.ui.platform.dxjokdxxww) draadjrbmkVarBtonecajqb.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.ppxfxbqfkf());
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(z2VarZoijcleaow) | draadjrbmkVarBtonecajqb.lmojexxdyd(dxjokdxxwwVar);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new ppxfxbqfkf(z2VarZoijcleaow, dxjokdxxwwVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            androidx.compose.runtime.jlmebxxoox.eablkybsjg(z2VarZoijcleaow, (tg.rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 0);
            wkgbmnqykc(k3Var.zoijcleaow(), wkgbmnqykcVar, vdvldrhtssVar, draadjrbmkVarBtonecajqb, i15 & 1008, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        final tg.vdvldrhtss vdvldrhtssVar2 = vdvldrhtssVar;
        androidx.compose.runtime.a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.c3
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return j3.lqeggnwhkg(k3Var, wkgbmnqykcVar2, vdvldrhtssVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(k3 k3Var, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.vdvldrhtss vdvldrhtssVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        gxszxtbevo(k3Var, wkgbmnqykcVar, vdvldrhtssVar, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final long wflxmlrfwp(b3 b3Var, boolean z13, androidx.compose.ui.platform.dxjokdxxww dxjokdxxwwVar) {
        long j13;
        int i13 = wkgbmnqykc.f43148iobyxmoadg[b3Var.ordinal()];
        if (i13 == 1) {
            j13 = Long.MAX_VALUE;
        } else if (i13 == 2) {
            j13 = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j13 = 4000;
        }
        long j14 = j13;
        return dxjokdxxwwVar == null ? j14 : dxjokdxxwwVar.iobyxmoadg(j14, true, true, z13);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3 A[LOOP:0: B:55:0x00d1->B:56:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107 A[LOOP:1: B:61:0x0105->B:62:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x014b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0178  */
    /* JADX WARN: Code duplicated, block: B:70:0x0184  */
    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e5 A[LOOP:2: B:78:0x01e3->B:79:0x01e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0221  */
    /* JADX WARN: Code duplicated, block: B:84:0x0226  */
    /* JADX WARN: Code duplicated, block: B:87:0x0230  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    private static final void wkgbmnqykc(final z2 z2Var, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final tg.vdvldrhtss vdvldrhtssVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        boolean z13;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        androidx.compose.runtime.a0 a0VarWflxmlrfwp;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        Object objYadqdtsiqt;
        g gVar;
        String strIobyxmoadg;
        int i17;
        int i18;
        int iIobyxmoadg;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        List listZoijcleaow;
        int size;
        int i19;
        List listZoijcleaow2;
        ArrayList arrayList;
        int size2;
        int i23;
        List listP;
        List listZoijcleaow3;
        List listZoijcleaow4;
        int size3;
        int i24;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1354335728);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(z2Var) : draadjrbmkVarBtonecajqb.lmojexxdyd(z2Var) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            if ((i14 & 4) != 0) {
                i15 |= 384;
            } else if ((i13 & 384) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar)) {
                    i16 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                } else {
                    i16 = UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (draadjrbmkVarBtonecajqb.vdvldrhtss(z13, i15 & 1)) {
                if (i25 != 0) {
                    wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar4 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1354335728, i15, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:245)");
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new g();
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                gVar = (g) objYadqdtsiqt;
                strIobyxmoadg = w3.iobyxmoadg(v3.f43979iobyxmoadg.nufgyqmvbu(), draadjrbmkVarBtonecajqb, 6);
                i17 = 54;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(z2Var, gVar.iobyxmoadg())) {
                    i18 = 54;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(95900978);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(141556995);
                    gVar.wkgbmnqykc(z2Var);
                    listZoijcleaow2 = gVar.zoijcleaow();
                    arrayList = new ArrayList(listZoijcleaow2.size());
                    size2 = listZoijcleaow2.size();
                    for (i23 = 0; i23 < size2; i23++) {
                        arrayList.add((z2) ((f) listZoijcleaow2.get(i23)).ppxfxbqfkf());
                    }
                    listP = hg.jyumaefscl.p(arrayList);
                    if (!listP.contains(z2Var)) {
                        listP.add(z2Var);
                    }
                    gVar.zoijcleaow().clear();
                    listZoijcleaow3 = y0.ppxfxbqfkf.zoijcleaow(listP);
                    listZoijcleaow4 = gVar.zoijcleaow();
                    size3 = listZoijcleaow3.size();
                    i24 = 0;
                    while (i24 < size3) {
                        z2 z2Var2 = (z2) listZoijcleaow3.get(i24);
                        List list = listZoijcleaow4;
                        int i26 = i17;
                        list.add(new f(z2Var2, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1032415134, true, new iobyxmoadg(z2Var2, z2Var, listP, gVar, strIobyxmoadg), draadjrbmkVarBtonecajqb, i26)));
                        i24++;
                        listZoijcleaow4 = list;
                        i17 = i26;
                        size3 = size3;
                        listZoijcleaow3 = listZoijcleaow3;
                        listP = listP;
                    }
                    i18 = i17;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
                x.zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar4);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = androidx.compose.runtime.m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar.ppxfxbqfkf());
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iIobyxmoadg))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iIobyxmoadg));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iIobyxmoadg), rgvfuqvkyqVarZoijcleaow);
                }
                androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                gVar.eablkybsjg(androidx.compose.runtime.nufgyqmvbu.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 0));
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1757732554);
                listZoijcleaow = gVar.zoijcleaow();
                size = listZoijcleaow.size();
                for (i19 = 0; i19 < size; i19++) {
                    f fVar = (f) listZoijcleaow.get(i19);
                    z2 z2Var3 = (z2) fVar.iobyxmoadg();
                    tg.vdvldrhtss vdvldrhtssVarZoijcleaow = fVar.zoijcleaow();
                    draadjrbmkVarBtonecajqb.ylkuphrtab(-1515535286, z2Var3);
                    vdvldrhtssVarZoijcleaow.invoke(ezmngbhpjk.nufgyqmvbu.eablkybsjg(2017516783, true, new zoijcleaow(vdvldrhtssVar, z2Var3), draadjrbmkVarBtonecajqb, i18), draadjrbmkVarBtonecajqb, 6);
                    draadjrbmkVarBtonecajqb.mbcevpiqjq();
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar4;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.d3
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return j3.eablkybsjg(z2Var, wkgbmnqykcVar3, vdvldrhtssVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar)) {
                i16 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i16 = UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss(z13, i15 & 1)) {
            if (i25 != 0) {
                wkgbmnqykcVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1354335728, i15, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:245)");
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new g();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            gVar = (g) objYadqdtsiqt;
            strIobyxmoadg = w3.iobyxmoadg(v3.f43979iobyxmoadg.nufgyqmvbu(), draadjrbmkVarBtonecajqb, 6);
            i17 = 54;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(z2Var, gVar.iobyxmoadg())) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(141556995);
                gVar.wkgbmnqykc(z2Var);
                listZoijcleaow2 = gVar.zoijcleaow();
                arrayList = new ArrayList(listZoijcleaow2.size());
                size2 = listZoijcleaow2.size();
                while (i23 < size2) {
                    arrayList.add((z2) ((f) listZoijcleaow2.get(i23)).ppxfxbqfkf());
                }
                listP = hg.jyumaefscl.p(arrayList);
                if (!listP.contains(z2Var)) {
                    listP.add(z2Var);
                }
                gVar.zoijcleaow().clear();
                listZoijcleaow3 = y0.ppxfxbqfkf.zoijcleaow(listP);
                listZoijcleaow4 = gVar.zoijcleaow();
                size3 = listZoijcleaow3.size();
                i24 = 0;
                while (i24 < size3) {
                    z2 z2Var4 = (z2) listZoijcleaow3.get(i24);
                    List list2 = listZoijcleaow4;
                    int i27 = i17;
                    list2.add(new f(z2Var4, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1032415134, true, new iobyxmoadg(z2Var4, z2Var, listP, gVar, strIobyxmoadg), draadjrbmkVarBtonecajqb, i27)));
                    i24++;
                    listZoijcleaow4 = list2;
                    i17 = i27;
                    size3 = size3;
                    listZoijcleaow3 = listZoijcleaow3;
                    listP = listP;
                }
                i18 = i17;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                i18 = 54;
                draadjrbmkVarBtonecajqb.sopmlzcsov(95900978);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
            iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVarBtonecajqb, 0);
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar4);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = androidx.compose.runtime.m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar2.ppxfxbqfkf());
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iIobyxmoadg));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iIobyxmoadg), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iIobyxmoadg));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iIobyxmoadg), rgvfuqvkyqVarZoijcleaow);
            }
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar2 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            gVar.eablkybsjg(androidx.compose.runtime.nufgyqmvbu.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 0));
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1757732554);
            listZoijcleaow = gVar.zoijcleaow();
            size = listZoijcleaow.size();
            while (i19 < size) {
                f fVar2 = (f) listZoijcleaow.get(i19);
                z2 z2Var5 = (z2) fVar2.iobyxmoadg();
                tg.vdvldrhtss vdvldrhtssVarZoijcleaow2 = fVar2.zoijcleaow();
                draadjrbmkVarBtonecajqb.ylkuphrtab(-1515535286, z2Var5);
                vdvldrhtssVarZoijcleaow2.invoke(ezmngbhpjk.nufgyqmvbu.eablkybsjg(2017516783, true, new zoijcleaow(vdvldrhtssVar, z2Var5), draadjrbmkVarBtonecajqb, i18), draadjrbmkVarBtonecajqb, 6);
                draadjrbmkVarBtonecajqb.mbcevpiqjq();
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar4;
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.d3
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return j3.eablkybsjg(z2Var, wkgbmnqykcVar3, vdvldrhtssVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
