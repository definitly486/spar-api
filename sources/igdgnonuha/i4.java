package igdgnonuha;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class i4 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final float f43061iobyxmoadg = w0.nufgyqmvbu.lqeggnwhkg(56);

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f43062cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f43063iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ bfopjjpdmp f43064jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f43065yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Set f43066zdlpuopuiu;

        iobyxmoadg(Set set, tg.draadjrbmk draadjrbmkVar, bfopjjpdmp bfopjjpdmpVar, tg.vdvldrhtss vdvldrhtssVar, tg.vdvldrhtss vdvldrhtssVar2) {
            this.f43066zdlpuopuiu = set;
            this.f43065yggfygwlhe = draadjrbmkVar;
            this.f43064jyumaefscl = bfopjjpdmpVar;
            this.f43063iwizpuwonk = vdvldrhtssVar;
            this.f43062cqumvgiudr = vdvldrhtssVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x6 eablkybsjg(tg.draadjrbmk draadjrbmkVar, opjhrmiecq opjhrmiecqVar, opjhrmiecq opjhrmiecqVar2) {
            sflfametgt sflfametgtVarDxjokdxxww = i4.dxjokdxxww(opjhrmiecqVar, opjhrmiecqVar2);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(sflfametgtVarDxjokdxxww);
            return (x6) draadjrbmkVar.invoke(sflfametgtVarDxjokdxxww);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w0.agtfadlqog gxszxtbevo(bfopjjpdmp bfopjjpdmpVar, w0.wkgbmnqykc wkgbmnqykcVar) {
            return w0.agtfadlqog.ppxfxbqfkf(w0.agtfadlqog.wkgbmnqykc((((long) vg.iobyxmoadg.wkgbmnqykc(((Number) bfopjjpdmpVar.jyumaefscl().getValue()).floatValue())) << 32) | (((long) 0) & 4294967295L)));
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            ppxfxbqfkf((czzsidtyhn.gtknphoqwx) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void ppxfxbqfkf(czzsidtyhn.gtknphoqwx gtknphoqwxVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1281726977, i14, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:167)");
            }
            float fDraadjrbmk = w0.zoijcleaow.draadjrbmk(gtknphoqwxVar.ppxfxbqfkf());
            boolean z13 = draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.draadjrbmk()) == w0.zdlpuopuiu.Rtl;
            Float fValueOf = Float.valueOf(0.0f);
            opjhrmiecq opjhrmiecqVar = opjhrmiecq.Default;
            Map mapWflxmlrfwp = hg.tzroggbefp.wflxmlrfwp(gg.cqumvgiudr.iobyxmoadg(fValueOf, opjhrmiecqVar));
            Set set = this.f43066zdlpuopuiu;
            sflfametgt sflfametgtVar = sflfametgt.StartToEnd;
            if (set.contains(sflfametgtVar)) {
                gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(Float.valueOf(fDraadjrbmk), opjhrmiecq.DismissedToEnd);
                mapWflxmlrfwp.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
            }
            Set set2 = this.f43066zdlpuopuiu;
            sflfametgt sflfametgtVar2 = sflfametgt.EndToStart;
            if (set2.contains(sflfametgtVar2)) {
                gg.vdvldrhtss vdvldrhtssVarIobyxmoadg2 = gg.cqumvgiudr.iobyxmoadg(Float.valueOf(-fDraadjrbmk), opjhrmiecq.DismissedToStart);
                mapWflxmlrfwp.put(vdvldrhtssVarIobyxmoadg2.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg2.nufgyqmvbu());
            }
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f43065yggfygwlhe);
            final tg.draadjrbmk draadjrbmkVar2 = this.f43065yggfygwlhe;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.rgvfuqvkyq() { // from class: igdgnonuha.g4
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return i4.iobyxmoadg.eablkybsjg(draadjrbmkVar2, (opjhrmiecq) obj, (opjhrmiecq) obj2);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            tg.rgvfuqvkyq rgvfuqvkyqVar = (tg.rgvfuqvkyq) objYadqdtsiqt;
            float f13 = this.f43066zdlpuopuiu.contains(sflfametgtVar2) ? 10.0f : 20.0f;
            float f14 = this.f43066zdlpuopuiu.contains(sflfametgtVar) ? 10.0f : 20.0f;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = m4.nufgyqmvbu(iobyxmoadgVar, this.f43064jyumaefscl, mapWflxmlrfwp, jztzpxfvev.jlmebxxoox.Horizontal, (288 & 8) != 0 ? true : this.f43064jyumaefscl.kcexrzcfyt() == opjhrmiecqVar, (288 & 16) != 0 ? false : z13, (288 & 32) != 0 ? null : null, (288 & 64) != 0 ? new tg.rgvfuqvkyq() { // from class: igdgnonuha.k4
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return m4.btonecajqb(obj, obj2);
                }
            } : rgvfuqvkyqVar, (288 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? j4.wkgbmnqykc(j4.f43151iobyxmoadg, mapWflxmlrfwp.keySet(), 0.0f, 0.0f, 6, null) : new g2(fDraadjrbmk, f13, f14), (288 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? j4.f43151iobyxmoadg.zoijcleaow() : 0.0f);
            tg.vdvldrhtss vdvldrhtssVar = this.f43063iwizpuwonk;
            final bfopjjpdmp bfopjjpdmpVar = this.f43064jyumaefscl;
            tg.vdvldrhtss vdvldrhtssVar2 = this.f43062cqumvgiudr;
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar2.ojitshcjhn(), false);
            int iIobyxmoadg = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVar, 0);
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarNufgyqmvbu);
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
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg.eablkybsjg(iobyxmoadgVar);
            czzsidtyhn.eablkybsjg eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            x.zynmafqrjb zynmafqrjbVarZoijcleaow = czzsidtyhn.lrnfpwlwnk.zoijcleaow(eablkybsjgVar.nufgyqmvbu(), iobyxmoadgVar2.draadjrbmk(), draadjrbmkVar, 0);
            int iIobyxmoadg2 = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVar, 0);
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarEablkybsjg2);
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
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarZoijcleaow, iobyxmoadgVar3.ppxfxbqfkf());
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iIobyxmoadg2))) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iIobyxmoadg2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iIobyxmoadg2), rgvfuqvkyqVarZoijcleaow2);
            }
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar3.wkgbmnqykc());
            czzsidtyhn.roivzttewh roivzttewhVar = czzsidtyhn.roivzttewh.f26469iobyxmoadg;
            vdvldrhtssVar.invoke(roivzttewhVar, draadjrbmkVar, 6);
            draadjrbmkVar.cqumvgiudr();
            boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(bfopjjpdmpVar);
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: igdgnonuha.h4
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return i4.iobyxmoadg.gxszxtbevo(bfopjjpdmpVar, (w0.wkgbmnqykc) obj);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = androidx.compose.foundation.layout.zdlpuopuiu.ppxfxbqfkf(iobyxmoadgVar, (tg.draadjrbmk) objYadqdtsiqt2);
            x.zynmafqrjb zynmafqrjbVarZoijcleaow2 = czzsidtyhn.lrnfpwlwnk.zoijcleaow(eablkybsjgVar.nufgyqmvbu(), iobyxmoadgVar2.draadjrbmk(), draadjrbmkVar, 0);
            int iIobyxmoadg3 = androidx.compose.runtime.nufgyqmvbu.iobyxmoadg(draadjrbmkVar, 0);
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg4 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarPpxfxbqfkf);
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg3 = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVar.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar.pkzmftpjix();
            if (draadjrbmkVar.lqeggnwhkg()) {
                draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg3);
            } else {
                draadjrbmkVar.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg3 = androidx.compose.runtime.m1.iobyxmoadg(draadjrbmkVar);
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, zynmafqrjbVarZoijcleaow2, iobyxmoadgVar3.ppxfxbqfkf());
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar3.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow3 = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg3.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg3.yadqdtsiqt(), Integer.valueOf(iIobyxmoadg3))) {
                draadjrbmkVarIobyxmoadg3.jyumaefscl(Integer.valueOf(iIobyxmoadg3));
                draadjrbmkVarIobyxmoadg3.zdlpuopuiu(Integer.valueOf(iIobyxmoadg3), rgvfuqvkyqVarZoijcleaow3);
            }
            androidx.compose.runtime.m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, wkgbmnqykcVarEablkybsjg4, iobyxmoadgVar3.wkgbmnqykc());
            vdvldrhtssVar2.invoke(roivzttewhVar, draadjrbmkVar, 6);
            draadjrbmkVar.cqumvgiudr();
            draadjrbmkVar.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final bfopjjpdmp btonecajqb(final opjhrmiecq opjhrmiecqVar, final tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i13, int i14) {
        if ((i14 & 1) != 0) {
            opjhrmiecqVar = opjhrmiecq.Default;
        }
        if ((i14 & 2) != 0) {
            Object objYadqdtsiqt = draadjrbmkVar2.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: igdgnonuha.c4
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(i4.gtknphoqwx((opjhrmiecq) obj));
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar = (tg.draadjrbmk) objYadqdtsiqt;
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1753522702, i13, -1, "androidx.compose.material.rememberDismissState (SwipeToDismiss.kt:135)");
        }
        Object[] objArr = new Object[0];
        rhgxfdycjh.jyumaefscl jyumaefsclVarPpxfxbqfkf = bfopjjpdmp.f42641oxmwwwfdhm.ppxfxbqfkf(draadjrbmkVar);
        boolean z13 = true;
        boolean z14 = (((i13 & 14) ^ 6) > 4 && draadjrbmkVar2.ppxfxbqfkf(opjhrmiecqVar.ordinal())) || (i13 & 6) == 4;
        if ((((i13 & 112) ^ 48) <= 32 || !draadjrbmkVar2.ulzqkzuiru(draadjrbmkVar)) && (i13 & 48) != 32) {
            z13 = false;
        }
        boolean z15 = z14 | z13;
        Object objYadqdtsiqt2 = draadjrbmkVar2.yadqdtsiqt();
        if (z15 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: igdgnonuha.d4
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return i4.draadjrbmk(opjhrmiecqVar, draadjrbmkVar);
                }
            };
            draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
        }
        bfopjjpdmp bfopjjpdmpVar = (bfopjjpdmp) rhgxfdycjh.wkgbmnqykc.eablkybsjg(objArr, jyumaefsclVarPpxfxbqfkf, (tg.iobyxmoadg) objYadqdtsiqt2, draadjrbmkVar2, 0);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return bfopjjpdmpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bfopjjpdmp draadjrbmk(opjhrmiecq opjhrmiecqVar, tg.draadjrbmk draadjrbmkVar) {
        return new bfopjjpdmp(opjhrmiecqVar, draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sflfametgt dxjokdxxww(opjhrmiecq opjhrmiecqVar, opjhrmiecq opjhrmiecqVar2) {
        if (opjhrmiecqVar == opjhrmiecqVar2 && opjhrmiecqVar == opjhrmiecq.Default) {
            return null;
        }
        if (opjhrmiecqVar == opjhrmiecqVar2 && opjhrmiecqVar == opjhrmiecq.DismissedToEnd) {
            return sflfametgt.StartToEnd;
        }
        if (opjhrmiecqVar == opjhrmiecqVar2 && opjhrmiecqVar == opjhrmiecq.DismissedToStart) {
            return sflfametgt.EndToStart;
        }
        opjhrmiecq opjhrmiecqVar3 = opjhrmiecq.Default;
        if (opjhrmiecqVar == opjhrmiecqVar3 && opjhrmiecqVar2 == opjhrmiecq.DismissedToEnd) {
            return sflfametgt.StartToEnd;
        }
        if (opjhrmiecqVar == opjhrmiecqVar3 && opjhrmiecqVar2 == opjhrmiecq.DismissedToStart) {
            return sflfametgt.EndToStart;
        }
        if (opjhrmiecqVar == opjhrmiecq.DismissedToEnd && opjhrmiecqVar2 == opjhrmiecqVar3) {
            return sflfametgt.StartToEnd;
        }
        if (opjhrmiecqVar == opjhrmiecq.DismissedToStart && opjhrmiecqVar2 == opjhrmiecqVar3) {
            return sflfametgt.EndToStart;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x012f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0136  */
    /* JADX WARN: Code duplicated, block: B:94:0x0142  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void eablkybsjg(final bfopjjpdmp bfopjjpdmpVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, Set set, tg.draadjrbmk draadjrbmkVar, final tg.vdvldrhtss vdvldrhtssVar, final tg.vdvldrhtss vdvldrhtssVar2, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        Set set2;
        int i17;
        int i18;
        tg.draadjrbmk draadjrbmkVar3;
        int i19;
        int i23;
        int i24;
        boolean z13;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final Set set3;
        final tg.draadjrbmk draadjrbmkVar4;
        androidx.compose.runtime.a0 a0VarWflxmlrfwp;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        Set setDxjokdxxww;
        tg.draadjrbmk draadjrbmkVar5;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-9746411);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(bfopjjpdmpVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    set2 = set;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(set2)) {
                        i17 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    } else {
                        i17 = UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        draadjrbmkVar3 = draadjrbmkVar;
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                            i19 = 2048;
                        } else {
                            i19 = UserVerificationMethods.USER_VERIFY_ALL;
                        }
                        i15 |= i19;
                    }
                    if ((i14 & 16) != 0) {
                        i15 |= 24576;
                    } else if ((i13 & 24576) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar)) {
                            i23 = 16384;
                        } else {
                            i23 = 8192;
                        }
                        i15 |= i23;
                    }
                    if ((i14 & 32) != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 196608) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar2)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    if ((74899 & i15) != 74898) {
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
                        if (i16 != 0) {
                            setDxjokdxxww = hg.ikoacuggdj.dxjokdxxww(sflfametgt.EndToStart, sflfametgt.StartToEnd);
                        } else {
                            setDxjokdxxww = set2;
                        }
                        if (i18 != 0) {
                            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt = new tg.draadjrbmk() { // from class: igdgnonuha.e4
                                    @Override // tg.draadjrbmk
                                    public final Object invoke(Object obj) {
                                        return i4.gxszxtbevo((sflfametgt) obj);
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                            }
                            draadjrbmkVar5 = (tg.draadjrbmk) objYadqdtsiqt;
                        } else {
                            draadjrbmkVar5 = draadjrbmkVar3;
                        }
                        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-9746411, i15, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                        }
                        czzsidtyhn.btonecajqb.ppxfxbqfkf(wkgbmnqykcVar4, null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1281726977, true, new iobyxmoadg(setDxjokdxxww, draadjrbmkVar5, bfopjjpdmpVar, vdvldrhtssVar, vdvldrhtssVar2), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 3072, 6);
                        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                        }
                        wkgbmnqykcVar3 = wkgbmnqykcVar4;
                        set3 = setDxjokdxxww;
                        draadjrbmkVar4 = draadjrbmkVar5;
                    } else {
                        draadjrbmkVarBtonecajqb.hkdspvbjdz();
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        set3 = set2;
                        draadjrbmkVar4 = draadjrbmkVar3;
                    }
                    a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                    if (a0VarWflxmlrfwp != null) {
                        a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.f4
                            @Override // tg.rgvfuqvkyq
                            public final Object invoke(Object obj, Object obj2) {
                                return i4.lqeggnwhkg(bfopjjpdmpVar, wkgbmnqykcVar3, set3, draadjrbmkVar4, vdvldrhtssVar, vdvldrhtssVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 3072;
                draadjrbmkVar3 = draadjrbmkVar;
                if ((i14 & 16) != 0) {
                    i15 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar)) {
                        i23 = 16384;
                    } else {
                        i23 = 8192;
                    }
                    i15 |= i23;
                }
                if ((i14 & 32) != 0) {
                    i15 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar2)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                if ((74899 & i15) != 74898) {
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
                    if (i16 != 0) {
                        setDxjokdxxww = hg.ikoacuggdj.dxjokdxxww(sflfametgt.EndToStart, sflfametgt.StartToEnd);
                    } else {
                        setDxjokdxxww = set2;
                    }
                    if (i18 != 0) {
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: igdgnonuha.e4
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return i4.gxszxtbevo((sflfametgt) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVar5 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        draadjrbmkVar5 = draadjrbmkVar3;
                    }
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-9746411, i15, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    czzsidtyhn.btonecajqb.ppxfxbqfkf(wkgbmnqykcVar4, null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1281726977, true, new iobyxmoadg(setDxjokdxxww, draadjrbmkVar5, bfopjjpdmpVar, vdvldrhtssVar, vdvldrhtssVar2), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar3 = wkgbmnqykcVar4;
                    set3 = setDxjokdxxww;
                    draadjrbmkVar4 = draadjrbmkVar5;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    set3 = set2;
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.f4
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return i4.lqeggnwhkg(bfopjjpdmpVar, wkgbmnqykcVar3, set3, draadjrbmkVar4, vdvldrhtssVar, vdvldrhtssVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 384;
            set2 = set;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    draadjrbmkVar3 = draadjrbmkVar;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                        i19 = 2048;
                    } else {
                        i19 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i15 |= i19;
                }
                if ((i14 & 16) != 0) {
                    i15 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar)) {
                        i23 = 16384;
                    } else {
                        i23 = 8192;
                    }
                    i15 |= i23;
                }
                if ((i14 & 32) != 0) {
                    i15 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar2)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                if ((74899 & i15) != 74898) {
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
                    if (i16 != 0) {
                        setDxjokdxxww = hg.ikoacuggdj.dxjokdxxww(sflfametgt.EndToStart, sflfametgt.StartToEnd);
                    } else {
                        setDxjokdxxww = set2;
                    }
                    if (i18 != 0) {
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: igdgnonuha.e4
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return i4.gxszxtbevo((sflfametgt) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVar5 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        draadjrbmkVar5 = draadjrbmkVar3;
                    }
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-9746411, i15, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    czzsidtyhn.btonecajqb.ppxfxbqfkf(wkgbmnqykcVar4, null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1281726977, true, new iobyxmoadg(setDxjokdxxww, draadjrbmkVar5, bfopjjpdmpVar, vdvldrhtssVar, vdvldrhtssVar2), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar3 = wkgbmnqykcVar4;
                    set3 = setDxjokdxxww;
                    draadjrbmkVar4 = draadjrbmkVar5;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    set3 = set2;
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.f4
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return i4.lqeggnwhkg(bfopjjpdmpVar, wkgbmnqykcVar3, set3, draadjrbmkVar4, vdvldrhtssVar, vdvldrhtssVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            draadjrbmkVar3 = draadjrbmkVar;
            if ((i14 & 16) != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar)) {
                    i23 = 16384;
                } else {
                    i23 = 8192;
                }
                i15 |= i23;
            }
            if ((i14 & 32) != 0) {
                i15 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar2)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            if ((74899 & i15) != 74898) {
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
                if (i16 != 0) {
                    setDxjokdxxww = hg.ikoacuggdj.dxjokdxxww(sflfametgt.EndToStart, sflfametgt.StartToEnd);
                } else {
                    setDxjokdxxww = set2;
                }
                if (i18 != 0) {
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: igdgnonuha.e4
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return i4.gxszxtbevo((sflfametgt) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVar5 = (tg.draadjrbmk) objYadqdtsiqt;
                } else {
                    draadjrbmkVar5 = draadjrbmkVar3;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-9746411, i15, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                }
                czzsidtyhn.btonecajqb.ppxfxbqfkf(wkgbmnqykcVar4, null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1281726977, true, new iobyxmoadg(setDxjokdxxww, draadjrbmkVar5, bfopjjpdmpVar, vdvldrhtssVar, vdvldrhtssVar2), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 3072, 6);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar4;
                set3 = setDxjokdxxww;
                draadjrbmkVar4 = draadjrbmkVar5;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                set3 = set2;
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.f4
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return i4.lqeggnwhkg(bfopjjpdmpVar, wkgbmnqykcVar3, set3, draadjrbmkVar4, vdvldrhtssVar, vdvldrhtssVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                set2 = set;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(set2)) {
                    i17 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    draadjrbmkVar3 = draadjrbmkVar;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                        i19 = 2048;
                    } else {
                        i19 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i15 |= i19;
                }
                if ((i14 & 16) != 0) {
                    i15 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar)) {
                        i23 = 16384;
                    } else {
                        i23 = 8192;
                    }
                    i15 |= i23;
                }
                if ((i14 & 32) != 0) {
                    i15 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar2)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                if ((74899 & i15) != 74898) {
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
                    if (i16 != 0) {
                        setDxjokdxxww = hg.ikoacuggdj.dxjokdxxww(sflfametgt.EndToStart, sflfametgt.StartToEnd);
                    } else {
                        setDxjokdxxww = set2;
                    }
                    if (i18 != 0) {
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: igdgnonuha.e4
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return i4.gxszxtbevo((sflfametgt) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVar5 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        draadjrbmkVar5 = draadjrbmkVar3;
                    }
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-9746411, i15, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                    }
                    czzsidtyhn.btonecajqb.ppxfxbqfkf(wkgbmnqykcVar4, null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1281726977, true, new iobyxmoadg(setDxjokdxxww, draadjrbmkVar5, bfopjjpdmpVar, vdvldrhtssVar, vdvldrhtssVar2), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 3072, 6);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar3 = wkgbmnqykcVar4;
                    set3 = setDxjokdxxww;
                    draadjrbmkVar4 = draadjrbmkVar5;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    set3 = set2;
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.f4
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return i4.lqeggnwhkg(bfopjjpdmpVar, wkgbmnqykcVar3, set3, draadjrbmkVar4, vdvldrhtssVar, vdvldrhtssVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            draadjrbmkVar3 = draadjrbmkVar;
            if ((i14 & 16) != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar)) {
                    i23 = 16384;
                } else {
                    i23 = 8192;
                }
                i15 |= i23;
            }
            if ((i14 & 32) != 0) {
                i15 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar2)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            if ((74899 & i15) != 74898) {
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
                if (i16 != 0) {
                    setDxjokdxxww = hg.ikoacuggdj.dxjokdxxww(sflfametgt.EndToStart, sflfametgt.StartToEnd);
                } else {
                    setDxjokdxxww = set2;
                }
                if (i18 != 0) {
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: igdgnonuha.e4
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return i4.gxszxtbevo((sflfametgt) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVar5 = (tg.draadjrbmk) objYadqdtsiqt;
                } else {
                    draadjrbmkVar5 = draadjrbmkVar3;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-9746411, i15, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                }
                czzsidtyhn.btonecajqb.ppxfxbqfkf(wkgbmnqykcVar4, null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1281726977, true, new iobyxmoadg(setDxjokdxxww, draadjrbmkVar5, bfopjjpdmpVar, vdvldrhtssVar, vdvldrhtssVar2), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 3072, 6);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar4;
                set3 = setDxjokdxxww;
                draadjrbmkVar4 = draadjrbmkVar5;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                set3 = set2;
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.f4
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return i4.lqeggnwhkg(bfopjjpdmpVar, wkgbmnqykcVar3, set3, draadjrbmkVar4, vdvldrhtssVar, vdvldrhtssVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        set2 = set;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                draadjrbmkVar3 = draadjrbmkVar;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                    i19 = 2048;
                } else {
                    i19 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i19;
            }
            if ((i14 & 16) != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar)) {
                    i23 = 16384;
                } else {
                    i23 = 8192;
                }
                i15 |= i23;
            }
            if ((i14 & 32) != 0) {
                i15 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar2)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            if ((74899 & i15) != 74898) {
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
                if (i16 != 0) {
                    setDxjokdxxww = hg.ikoacuggdj.dxjokdxxww(sflfametgt.EndToStart, sflfametgt.StartToEnd);
                } else {
                    setDxjokdxxww = set2;
                }
                if (i18 != 0) {
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: igdgnonuha.e4
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return i4.gxszxtbevo((sflfametgt) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVar5 = (tg.draadjrbmk) objYadqdtsiqt;
                } else {
                    draadjrbmkVar5 = draadjrbmkVar3;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-9746411, i15, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                }
                czzsidtyhn.btonecajqb.ppxfxbqfkf(wkgbmnqykcVar4, null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1281726977, true, new iobyxmoadg(setDxjokdxxww, draadjrbmkVar5, bfopjjpdmpVar, vdvldrhtssVar, vdvldrhtssVar2), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 3072, 6);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar4;
                set3 = setDxjokdxxww;
                draadjrbmkVar4 = draadjrbmkVar5;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                set3 = set2;
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.f4
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return i4.lqeggnwhkg(bfopjjpdmpVar, wkgbmnqykcVar3, set3, draadjrbmkVar4, vdvldrhtssVar, vdvldrhtssVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        draadjrbmkVar3 = draadjrbmkVar;
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar)) {
                i23 = 16384;
            } else {
                i23 = 8192;
            }
            i15 |= i23;
        }
        if ((i14 & 32) != 0) {
            i15 |= 196608;
        } else if ((i13 & 196608) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar2)) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i15 |= i24;
        }
        if ((74899 & i15) != 74898) {
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
            if (i16 != 0) {
                setDxjokdxxww = hg.ikoacuggdj.dxjokdxxww(sflfametgt.EndToStart, sflfametgt.StartToEnd);
            } else {
                setDxjokdxxww = set2;
            }
            if (i18 != 0) {
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: igdgnonuha.e4
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return i4.gxszxtbevo((sflfametgt) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar5 = (tg.draadjrbmk) objYadqdtsiqt;
            } else {
                draadjrbmkVar5 = draadjrbmkVar3;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-9746411, i15, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
            }
            czzsidtyhn.btonecajqb.ppxfxbqfkf(wkgbmnqykcVar4, null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1281726977, true, new iobyxmoadg(setDxjokdxxww, draadjrbmkVar5, bfopjjpdmpVar, vdvldrhtssVar, vdvldrhtssVar2), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 3072, 6);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar4;
            set3 = setDxjokdxxww;
            draadjrbmkVar4 = draadjrbmkVar5;
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            set3 = set2;
            draadjrbmkVar4 = draadjrbmkVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.f4
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return i4.lqeggnwhkg(bfopjjpdmpVar, wkgbmnqykcVar3, set3, draadjrbmkVar4, vdvldrhtssVar, vdvldrhtssVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gtknphoqwx(opjhrmiecq opjhrmiecqVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h gxszxtbevo(sflfametgt sflfametgtVar) {
        return new h(f43061iobyxmoadg, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(bfopjjpdmp bfopjjpdmpVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, Set set, tg.draadjrbmk draadjrbmkVar, tg.vdvldrhtss vdvldrhtssVar, tg.vdvldrhtss vdvldrhtssVar2, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        eablkybsjg(bfopjjpdmpVar, wkgbmnqykcVar, set, draadjrbmkVar, vdvldrhtssVar, vdvldrhtssVar2, draadjrbmkVar2, androidx.compose.runtime.f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
