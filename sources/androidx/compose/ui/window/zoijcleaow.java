package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.cqumvgiudr;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.ntlheqmsrt;
import androidx.compose.runtime.ulzqkzuiru;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.zeieaojujs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g0.yadqdtsiqt;
import g0.zynmafqrjb;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import pj.cllcsxoeiz;
import x.istkbnxepw;
import x.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {

    static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ i1 f7449zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final iobyxmoadg f7450zdlpuopuiu = new iobyxmoadg();

            iobyxmoadg() {
                super(1);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((yadqdtsiqt) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(yadqdtsiqt yadqdtsiqtVar) {
                zynmafqrjb.dxjokdxxww(yadqdtsiqtVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(i1 i1Var) {
            super(2);
            this.f7449zdlpuopuiu = i1Var;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if (!draadjrbmkVar.vdvldrhtss((i13 & 3) != 2, i13 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(346960332, i13, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:211)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = iobyxmoadg.f7450zdlpuopuiu;
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            zoijcleaow.ppxfxbqfkf(g0.kcexrzcfyt.ppxfxbqfkf(iobyxmoadgVar, false, (tg.draadjrbmk) objYadqdtsiqt, 1, null), zoijcleaow.zoijcleaow(this.f7449zdlpuopuiu), draadjrbmkVar, 0, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class gxszxtbevo extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final gxszxtbevo f7451zdlpuopuiu = new gxszxtbevo();

        gxszxtbevo() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wflxmlrfwp f7452yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f7453zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(wflxmlrfwp wflxmlrfwpVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f7452yggfygwlhe = wflxmlrfwpVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f7452yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f7453zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            this.f7452yggfygwlhe.show();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg implements x.zynmafqrjb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f7454iobyxmoadg = new lqeggnwhkg();

        static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ List f7455zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(List list) {
                super(1);
                this.f7455zdlpuopuiu = list;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
                List list = this.f7455zdlpuopuiu;
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, (androidx.compose.ui.layout.kcexrzcfyt) list.get(i13), 0, 0, 0.0f, 4, null);
                }
            }
        }

        lqeggnwhkg() {
        }

        @Override // x.zynmafqrjb
        public final istkbnxepw lqeggnwhkg(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, List list, long j13) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int iAgtfadlqog = 0;
            int iWflxmlrfwp = 0;
            for (int i13 = 0; i13 < size; i13++) {
                androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = ((pmvmpeiblj) list.get(i13)).sflfametgt(j13);
                iAgtfadlqog = Math.max(iAgtfadlqog, kcexrzcfytVarSflfametgt.eslsurpljm());
                iWflxmlrfwp = Math.max(iWflxmlrfwp, kcexrzcfytVarSflfametgt.ipoelvxyzq());
                arrayList.add(kcexrzcfytVarSflfametgt);
            }
            if (list.isEmpty()) {
                iAgtfadlqog = w0.zoijcleaow.agtfadlqog(j13);
                iWflxmlrfwp = w0.zoijcleaow.wflxmlrfwp(j13);
            }
            return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, iAgtfadlqog, iWflxmlrfwp, null, new iobyxmoadg(arrayList), 4, null);
        }
    }

    static final class nufgyqmvbu extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ int f7456iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f7457jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f7458yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.wkgbmnqykc f7459zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14) {
            super(2);
            this.f7459zdlpuopuiu = wkgbmnqykcVar;
            this.f7458yggfygwlhe = rgvfuqvkyqVar;
            this.f7457jyumaefscl = i13;
            this.f7456iwizpuwonk = i14;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            zoijcleaow.ppxfxbqfkf(this.f7459zdlpuopuiu, this.f7458yggfygwlhe, draadjrbmkVar, f.iobyxmoadg(this.f7457jyumaefscl | 1), this.f7456iwizpuwonk);
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ w0.zdlpuopuiu f7460iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f7461jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f7462yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ wflxmlrfwp f7463zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(wflxmlrfwp wflxmlrfwpVar, tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, w0.zdlpuopuiu zdlpuopuiuVar) {
            super(0);
            this.f7463zdlpuopuiu = wflxmlrfwpVar;
            this.f7462yggfygwlhe = iobyxmoadgVar;
            this.f7461jyumaefscl = draadjrbmkVar;
            this.f7460iwizpuwonk = zdlpuopuiuVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f7463zdlpuopuiu.draadjrbmk(this.f7462yggfygwlhe, this.f7461jyumaefscl, this.f7460iwizpuwonk);
        }
    }

    static final class wkgbmnqykc extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ int f7464cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ int f7465iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f7466jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f7467yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f7468zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14) {
            super(2);
            this.f7468zdlpuopuiu = iobyxmoadgVar;
            this.f7467yggfygwlhe = draadjrbmkVar;
            this.f7466jyumaefscl = rgvfuqvkyqVar;
            this.f7465iwizpuwonk = i13;
            this.f7464cqumvgiudr = i14;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            zoijcleaow.iobyxmoadg(this.f7468zdlpuopuiu, this.f7467yggfygwlhe, this.f7466jyumaefscl, draadjrbmkVar, f.iobyxmoadg(this.f7465iwizpuwonk | 1), this.f7464cqumvgiudr);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0125zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ wflxmlrfwp f7469zdlpuopuiu;

        /* JADX INFO: renamed from: androidx.compose.ui.window.zoijcleaow$zoijcleaow$iobyxmoadg */
        public static final class iobyxmoadg implements ntlheqmsrt {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ wflxmlrfwp f7470iobyxmoadg;

            public iobyxmoadg(wflxmlrfwp wflxmlrfwpVar) {
                this.f7470iobyxmoadg = wflxmlrfwpVar;
            }

            @Override // androidx.compose.runtime.ntlheqmsrt
            public void iobyxmoadg() {
                this.f7470iobyxmoadg.dismiss();
                this.f7470iobyxmoadg.nufgyqmvbu();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0125zoijcleaow(wflxmlrfwp wflxmlrfwpVar) {
            super(1);
            this.f7469zdlpuopuiu = wflxmlrfwpVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ntlheqmsrt invoke(ulzqkzuiru ulzqkzuiruVar) {
            return new iobyxmoadg(this.f7469zdlpuopuiu);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0164  */
    /* JADX WARN: Code duplicated, block: B:70:0x0166  */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Code duplicated, block: B:81:0x018a  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i13, int i14) {
        int i15;
        draadjrbmk draadjrbmkVar3;
        int i16;
        int i17;
        boolean z13;
        draadjrbmk draadjrbmkVar4;
        a0 a0VarWflxmlrfwp;
        draadjrbmk draadjrbmkVar5;
        View view;
        w0.wkgbmnqykc wkgbmnqykcVar;
        w0.zdlpuopuiu zdlpuopuiuVar;
        cqumvgiudr cqumvgiudrVarEablkybsjg;
        i1 i1VarAgtfadlqog;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar2;
        UUID uuid;
        boolean zUlzqkzuiru;
        Object obj;
        wflxmlrfwp wflxmlrfwpVar;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt2;
        boolean zLmojexxdyd2;
        Object objYadqdtsiqt3;
        boolean z14;
        boolean zPpxfxbqfkf;
        Object objYadqdtsiqt4;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(826668973);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                draadjrbmkVar3 = draadjrbmkVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(draadjrbmkVar3) ? 32 : 16;
            }
            if ((i14 & 4) != 0) {
                i15 |= 384;
            } else if ((i13 & 384) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                    i16 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                } else {
                    i16 = UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                i15 |= i16;
            }
            i17 = i15;
            if ((i17 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (draadjrbmkVarBtonecajqb.vdvldrhtss(z13, i17 & 1)) {
                if (i18 != 0) {
                    draadjrbmkVar5 = new draadjrbmk(false, false, false, 7, null);
                } else {
                    draadjrbmkVar5 = draadjrbmkVar3;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(826668973, i17, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:199)");
                }
                view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
                wkgbmnqykcVar = (w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo());
                zdlpuopuiuVar = (w0.zdlpuopuiu) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.draadjrbmk());
                cqumvgiudrVarEablkybsjg = androidx.compose.runtime.nufgyqmvbu.eablkybsjg(draadjrbmkVarBtonecajqb, 0);
                i1VarAgtfadlqog = v0.agtfadlqog(rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, (i17 >> 6) & 14);
                Object[] objArr = new Object[0];
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar2 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar2.iobyxmoadg()) {
                    objYadqdtsiqt = gxszxtbevo.f7451zdlpuopuiu;
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                uuid = (UUID) rhgxfdycjh.wkgbmnqykc.gxszxtbevo(objArr, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 48);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view) | draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar);
                Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (!zUlzqkzuiru || objYadqdtsiqt5 == iobyxmoadgVar2.iobyxmoadg()) {
                    wflxmlrfwp wflxmlrfwpVar2 = new wflxmlrfwp(iobyxmoadgVar, draadjrbmkVar5, view, zdlpuopuiuVar, wkgbmnqykcVar, uuid);
                    wflxmlrfwpVar2.dxjokdxxww(cqumvgiudrVarEablkybsjg, ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(346960332, true, new eablkybsjg(i1VarAgtfadlqog)));
                    draadjrbmkVarBtonecajqb.jyumaefscl(wflxmlrfwpVar2);
                    obj = wflxmlrfwpVar2;
                } else {
                    obj = objYadqdtsiqt5;
                }
                wflxmlrfwpVar = (wflxmlrfwp) obj;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(wflxmlrfwpVar);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar2.iobyxmoadg()) {
                    objYadqdtsiqt2 = new iobyxmoadg(wflxmlrfwpVar, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                jlmebxxoox.eablkybsjg(wwaezpbzknVar, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 6);
                zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(wflxmlrfwpVar);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt3 == iobyxmoadgVar2.iobyxmoadg()) {
                    objYadqdtsiqt3 = new C0125zoijcleaow(wflxmlrfwpVar);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                jlmebxxoox.zoijcleaow(wflxmlrfwpVar, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 0);
                boolean zLmojexxdyd3 = draadjrbmkVarBtonecajqb.lmojexxdyd(wflxmlrfwpVar);
                if ((i17 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zPpxfxbqfkf = zLmojexxdyd3 | z14 | ((i17 & 112) == 32) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(zdlpuopuiuVar.ordinal());
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (!zPpxfxbqfkf || objYadqdtsiqt4 == iobyxmoadgVar2.iobyxmoadg()) {
                    draadjrbmkVar3 = draadjrbmkVar5;
                    objYadqdtsiqt4 = new ppxfxbqfkf(wflxmlrfwpVar, iobyxmoadgVar, draadjrbmkVar3, zdlpuopuiuVar);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                } else {
                    draadjrbmkVar3 = draadjrbmkVar5;
                }
                jlmebxxoox.lqeggnwhkg((tg.iobyxmoadg) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
            }
            draadjrbmkVar4 = draadjrbmkVar3;
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new wkgbmnqykc(iobyxmoadgVar, draadjrbmkVar4, rgvfuqvkyqVar, i13, i14));
            }
        }
        i15 |= 48;
        draadjrbmkVar3 = draadjrbmkVar;
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar)) {
                i16 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i16 = UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i15 |= i16;
        }
        i17 = i15;
        if ((i17 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss(z13, i17 & 1)) {
            if (i18 != 0) {
                draadjrbmkVar5 = new draadjrbmk(false, false, false, 7, null);
            } else {
                draadjrbmkVar5 = draadjrbmkVar3;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(826668973, i17, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:199)");
            }
            view = (View) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
            wkgbmnqykcVar = (w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo());
            zdlpuopuiuVar = (w0.zdlpuopuiu) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.draadjrbmk());
            cqumvgiudrVarEablkybsjg = androidx.compose.runtime.nufgyqmvbu.eablkybsjg(draadjrbmkVarBtonecajqb, 0);
            i1VarAgtfadlqog = v0.agtfadlqog(rgvfuqvkyqVar, draadjrbmkVarBtonecajqb, (i17 >> 6) & 14);
            Object[] objArr2 = new Object[0];
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar2 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar2.iobyxmoadg()) {
                objYadqdtsiqt = gxszxtbevo.f7451zdlpuopuiu;
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            uuid = (UUID) rhgxfdycjh.wkgbmnqykc.gxszxtbevo(objArr2, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 48);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(view) | draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar);
            Object objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                wflxmlrfwp wflxmlrfwpVar3 = new wflxmlrfwp(iobyxmoadgVar, draadjrbmkVar5, view, zdlpuopuiuVar, wkgbmnqykcVar, uuid);
                wflxmlrfwpVar3.dxjokdxxww(cqumvgiudrVarEablkybsjg, ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(346960332, true, new eablkybsjg(i1VarAgtfadlqog)));
                draadjrbmkVarBtonecajqb.jyumaefscl(wflxmlrfwpVar3);
                obj = wflxmlrfwpVar3;
            } else {
                wflxmlrfwp wflxmlrfwpVar4 = new wflxmlrfwp(iobyxmoadgVar, draadjrbmkVar5, view, zdlpuopuiuVar, wkgbmnqykcVar, uuid);
                wflxmlrfwpVar4.dxjokdxxww(cqumvgiudrVarEablkybsjg, ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(346960332, true, new eablkybsjg(i1VarAgtfadlqog)));
                draadjrbmkVarBtonecajqb.jyumaefscl(wflxmlrfwpVar4);
                obj = wflxmlrfwpVar4;
            }
            wflxmlrfwpVar = (wflxmlrfwp) obj;
            wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(wflxmlrfwpVar);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt2 = new iobyxmoadg(wflxmlrfwpVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new iobyxmoadg(wflxmlrfwpVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            jlmebxxoox.eablkybsjg(wwaezpbzknVar2, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 6);
            zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(wflxmlrfwpVar);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd2) {
                objYadqdtsiqt3 = new C0125zoijcleaow(wflxmlrfwpVar);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new C0125zoijcleaow(wflxmlrfwpVar);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            jlmebxxoox.zoijcleaow(wflxmlrfwpVar, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 0);
            boolean zLmojexxdyd4 = draadjrbmkVarBtonecajqb.lmojexxdyd(wflxmlrfwpVar);
            if ((i17 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            zPpxfxbqfkf = zLmojexxdyd4 | z14 | ((i17 & 112) == 32) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(zdlpuopuiuVar.ordinal());
            objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zPpxfxbqfkf) {
                draadjrbmkVar3 = draadjrbmkVar5;
                objYadqdtsiqt4 = new ppxfxbqfkf(wflxmlrfwpVar, iobyxmoadgVar, draadjrbmkVar3, zdlpuopuiuVar);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            } else {
                draadjrbmkVar3 = draadjrbmkVar5;
                objYadqdtsiqt4 = new ppxfxbqfkf(wflxmlrfwpVar, iobyxmoadgVar, draadjrbmkVar3, zdlpuopuiuVar);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            }
            jlmebxxoox.lqeggnwhkg((tg.iobyxmoadg) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        draadjrbmkVar4 = draadjrbmkVar3;
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new wkgbmnqykc(iobyxmoadgVar, draadjrbmkVar4, rgvfuqvkyqVar, i13, i14));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13, int i14) {
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1090521195);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar) ? 32 : 16;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i15 & 19) != 18, i15 & 1)) {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1090521195, i15, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:665)");
            }
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = lqeggnwhkg.f7454iobyxmoadg;
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            x.zynmafqrjb zynmafqrjbVar = (x.zynmafqrjb) objYadqdtsiqt;
            int i17 = ((i15 >> 3) & 14) | 384 | ((i15 << 3) & 112);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            int i18 = ((i17 << 6) & 896) | 6;
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVar, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            rgvfuqvkyqVar.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf((i18 >> 6) & 14));
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new nufgyqmvbu(wkgbmnqykcVar, rgvfuqvkyqVar, i13, i14));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tg.rgvfuqvkyq zoijcleaow(i1 i1Var) {
        return (tg.rgvfuqvkyq) i1Var.getValue();
    }
}
