package ru.myspar.proloyalty.common.view.bottomsheet.additional_info;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.foundation.layout.wflxmlrfwp;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.zeieaojujs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.GeofenceStatusCodes;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.vdvldrhtss;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.h;
import j0.i;
import j0.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoUiModel;
import tg.draadjrbmk;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import w0.iwizpuwonk;
import w0.nufgyqmvbu;
import x.gxszxtbevo;
import x.zynmafqrjb;
import yfnezrywwk.eablkybsjg;
import yfnezrywwk.jpowsppfya;
import z.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: ru.myspar.proloyalty.common.view.bottomsheet.additional_info.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2214iobyxmoadg implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final C2214iobyxmoadg f93845zdlpuopuiu = new C2214iobyxmoadg();

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f93846yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f93847zdlpuopuiu;

        public ppxfxbqfkf(draadjrbmk draadjrbmkVar, List list) {
            this.f93847zdlpuopuiu = draadjrbmkVar;
            this.f93846yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f93847zdlpuopuiu.invoke(this.f93846yggfygwlhe.get(i13));
        }
    }

    public static final class wkgbmnqykc implements oxmwwwfdhm {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ int f93848iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ long f93849jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ n f93850yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f93851zdlpuopuiu;

        public wkgbmnqykc(List list, n nVar, long j13, int i13) {
            this.f93851zdlpuopuiu = list;
            this.f93850yggfygwlhe = nVar;
            this.f93849jyumaefscl = j13;
            this.f93848iwizpuwonk = i13;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((eablkybsjg) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(eablkybsjg eablkybsjgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (draadjrbmkVar.ulzqkzuiru(eablkybsjgVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= draadjrbmkVar.ppxfxbqfkf(i13) ? 32 : 16;
            }
            if (!draadjrbmkVar.vdvldrhtss((i15 & 147) != 146, i15 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(802480018, i15, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            AdditionalInfoUiModel.Item item = (AdditionalInfoUiModel.Item) this.f93851zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(1821594286);
            iobyxmoadg.btonecajqb(item, this.f93850yggfygwlhe, this.f93849jyumaefscl, this.f93848iwizpuwonk, draadjrbmkVar, 0);
            draadjrbmkVar.stevsuqkhv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class zoijcleaow implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f93852yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f93853zdlpuopuiu;

        public zoijcleaow(draadjrbmk draadjrbmkVar, List list) {
            this.f93853zdlpuopuiu = draadjrbmkVar;
            this.f93852yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f93853zdlpuopuiu.invoke(this.f93852yggfygwlhe.get(i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object agtfadlqog(AdditionalInfoUiModel.Item item) {
        zdlpuopuiu.btonecajqb(item, "item");
        return item.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(final AdditionalInfoUiModel.Item item, final n nVar, final long j13, final int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14) {
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1852639419);
        int i15 = (i14 & 6) == 0 ? (draadjrbmkVarBtonecajqb.lmojexxdyd(item) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(nVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.wkgbmnqykc(j13) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i16 = i15;
        if ((i16 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1852639419, i16, -1, "ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoItem (AdditionalInfoBottomSheetContent.kt:187)");
            }
            float f13 = 16;
            t31.wkgbmnqykc.zoijcleaow(nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, iobyxmoadgVar);
            lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarVdvldrhtss = cdpycssgdh.vdvldrhtss(iobyxmoadgVar, nufgyqmvbu.lqeggnwhkg(f13));
            String imageUrl = item.getImageUrl();
            gxszxtbevo gxszxtbevoVarIobyxmoadg = gxszxtbevo.f120816iobyxmoadg.iobyxmoadg();
            androidx.compose.ui.graphics.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.graphics.wkgbmnqykc.f6377zoijcleaow;
            z zVar = z.f44180iobyxmoadg;
            int i17 = z.f44181zoijcleaow;
            int i18 = i16;
            com.bumptech.glide.integration.compose.zoijcleaow.iobyxmoadg(imageUrl, null, wkgbmnqykcVarVdvldrhtss, null, gxszxtbevoVarIobyxmoadg, 0.0f, androidx.compose.ui.graphics.wkgbmnqykc.iobyxmoadg.zoijcleaow(iobyxmoadgVar3, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).iwizpuwonk(), 0, 2, null), null, null, null, null, draadjrbmkVarBtonecajqb, 25008, 0, 1960);
            t31.zoijcleaow.zoijcleaow(nufgyqmvbu.lqeggnwhkg(10), draadjrbmkVarBtonecajqb, 6);
            w6.btonecajqb(item.getTitle(), null, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).zoijcleaow().rgvfuqvkyq(), draadjrbmkVarBtonecajqb, 0, 0, 65530);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            int i19 = 0;
            for (Object obj : item.getMessages()) {
                int i23 = i19 + 1;
                if (i19 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                String str = (String) obj;
                t31.wkgbmnqykc.zoijcleaow(i19 == 0 ? nufgyqmvbu.lqeggnwhkg(4) : nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVarBtonecajqb, 0);
                int i24 = i18;
                w6.btonecajqb(str, null, l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).cqumvgiudr(), j13, null, null, null, 0L, null, null, 0L, 0, false, i13, 0, null, nVar, draadjrbmkVarBtonecajqb, (i24 << 3) & 7168, (i24 & 7168) | ((i24 << 15) & 3670016), 57330);
                i19 = i23;
                i18 = i24;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: cs0.lqeggnwhkg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return ru.myspar.proloyalty.common.view.bottomsheet.additional_info.iobyxmoadg.gtknphoqwx(item, nVar, j13, i13, i14, (androidx.compose.runtime.draadjrbmk) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final void draadjrbmk(final List list, final ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow zoijcleaowVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        final long jNufgyqmvbu;
        int iZoijcleaow;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar3;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1127323671);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVar) : draadjrbmkVarBtonecajqb.lmojexxdyd(zoijcleaowVar) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1127323671, i14, -1, "ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoItems (AdditionalInfoBottomSheetContent.kt:146)");
            }
            final n nVarZoijcleaow = l41.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zoijcleaow().zoijcleaow();
            h hVarIobyxmoadg = i.iobyxmoadg(0, draadjrbmkVarBtonecajqb, 0, 1);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1705296151);
            boolean z13 = zoijcleaowVar instanceof ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow.iobyxmoadg;
            if (z13) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hg.jyumaefscl.istkbnxepw(arrayList, ((AdditionalInfoUiModel.Item) it.next()).getMessages());
                }
                jNufgyqmvbu = yggfygwlhe(hVarIobyxmoadg, nVarZoijcleaow, arrayList, ((ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg(), nufgyqmvbu.lqeggnwhkg(32), draadjrbmkVarBtonecajqb, 24576);
            } else {
                if (!(zoijcleaowVar instanceof ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow.C2215zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                jNufgyqmvbu = iwizpuwonk.nufgyqmvbu(((ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow.C2215zoijcleaow) zoijcleaowVar).iobyxmoadg());
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (z13) {
                iZoijcleaow = 1;
            } else {
                if (!(zoijcleaowVar instanceof ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow.C2215zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                iZoijcleaow = ((ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow.C2215zoijcleaow) zoijcleaowVar).zoijcleaow();
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1705314462);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(list) | draadjrbmkVarBtonecajqb.ulzqkzuiru(nVarZoijcleaow) | draadjrbmkVarBtonecajqb.wkgbmnqykc(jNufgyqmvbu) | draadjrbmkVarBtonecajqb.ppxfxbqfkf(iZoijcleaow);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                final int i15 = iZoijcleaow;
                draadjrbmk draadjrbmkVar4 = new draadjrbmk() { // from class: cs0.zoijcleaow
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ru.myspar.proloyalty.common.view.bottomsheet.additional_info.iobyxmoadg.wflxmlrfwp(list, nVarZoijcleaow, jNufgyqmvbu, i15, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVar2.jyumaefscl(draadjrbmkVar4);
                objYadqdtsiqt = draadjrbmkVar4;
            } else {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar3 = draadjrbmkVar2;
            yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVarNufgyqmvbu, null, null, false, null, null, null, false, null, (draadjrbmk) objYadqdtsiqt, draadjrbmkVar3, 6, 510);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: cs0.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ru.myspar.proloyalty.common.view.bottomsheet.additional_info.iobyxmoadg.ojitshcjhn(list, zoijcleaowVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(AdditionalInfoUiModel additionalInfoUiModel, ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow zoijcleaowVar, tg.iobyxmoadg iobyxmoadgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        nufgyqmvbu(additionalInfoUiModel, zoijcleaowVar, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(AdditionalInfoUiModel.Item item, n nVar, long j13, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        btonecajqb(item, nVar, j13, i13, draadjrbmkVar, f.iobyxmoadg(i14 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(String str, String str2, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        oxmwwwfdhm(str, str2, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void nufgyqmvbu(final AdditionalInfoUiModel model, final ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow style, final tg.iobyxmoadg onDismiss, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(style, "style");
        zdlpuopuiu.btonecajqb(onDismiss, "onDismiss");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1498031956);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(style) : draadjrbmkVarBtonecajqb.lmojexxdyd(style) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onDismiss) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1498031956, i14, -1, "ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoBottomSheetContent (AdditionalInfoBottomSheetContent.kt:56)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            float f13 = 16;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null), nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar2.ojitshcjhn(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarRgvfuqvkyq);
            lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
            wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f4892iobyxmoadg;
            i31.nufgyqmvbu nufgyqmvbuVar = i31.nufgyqmvbu.MEDIUM;
            float fLqeggnwhkg = nufgyqmvbu.lqeggnwhkg(8);
            float fLqeggnwhkg2 = nufgyqmvbu.lqeggnwhkg(f13);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = esjtqupxsv.oxmwwwfdhm(iobyxmoadgVar, 0.0f, 0.0f, 0.0f, nufgyqmvbu.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(nufgyqmvbuVar.wkgbmnqykc() + fLqeggnwhkg) + fLqeggnwhkg2), 7, null);
            zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), iobyxmoadgVar2.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm);
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar3.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
            oxmwwwfdhm(model.getTitle(), model.getHint(), draadjrbmkVarBtonecajqb, 0);
            String strWkgbmnqykc = dxjokdxxww.wkgbmnqykc(model.getSubTitle());
            draadjrbmkVarBtonecajqb.sopmlzcsov(400346031);
            if (strWkgbmnqykc != null) {
                rgvfuqvkyq(strWkgbmnqykc, draadjrbmkVarBtonecajqb, 0);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            List listIobyxmoadg = q11.zoijcleaow.iobyxmoadg(model.getItems());
            draadjrbmkVarBtonecajqb.sopmlzcsov(400349773);
            if (listIobyxmoadg != null) {
                draadjrbmk(listIobyxmoadg, style, draadjrbmkVarBtonecajqb, i14 & 112);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            i31.wkgbmnqykc.wkgbmnqykc(e0.gxszxtbevo.ppxfxbqfkf(br0.wkgbmnqykc.proloyalty_good, draadjrbmkVarBtonecajqb, 0), onDismiss, wflxmlrfwpVar.wkgbmnqykc(esjtqupxsv.oxmwwwfdhm(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null), 0.0f, fLqeggnwhkg, 0.0f, fLqeggnwhkg2, 5, null), iobyxmoadgVar2.zoijcleaow()), nufgyqmvbuVar, false, null, null, false, draadjrbmkVarBtonecajqb, ((i14 >> 3) & 112) | 3072, 240);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: cs0.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ru.myspar.proloyalty.common.view.bottomsheet.additional_info.iobyxmoadg.dxjokdxxww(model, style, onDismiss, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(List list, ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow zoijcleaowVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        draadjrbmk(list, zoijcleaowVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void oxmwwwfdhm(final String str, final String str2, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1915294085);
        if ((i13 & 6) == 0) {
            i14 = i13 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str2) ? 32 : 16;
        }
        int i15 = i14;
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1915294085, i15, -1, "ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoTitle (AdditionalInfoBottomSheetContent.kt:101)");
            }
            a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = a.eablkybsjg.f20iobyxmoadg.dxjokdxxww();
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), ppxfxbqfkfVarDxjokdxxww, draadjrbmkVarBtonecajqb, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, iobyxmoadgVar);
            lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = roivzttewh.f26469iobyxmoadg.iobyxmoadg(iobyxmoadgVar, 1.0f, false);
            z zVar = z.f44180iobyxmoadg;
            int i16 = z.f44181zoijcleaow;
            w6.btonecajqb(str, wkgbmnqykcVarIobyxmoadg, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i16).zoijcleaow().btonecajqb(), draadjrbmkVarBtonecajqb, i15 & 14, 3120, 55288);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-119491082);
            if (kcexrzcfyt.zfvoamnweg(str2)) {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            } else {
                t31.zoijcleaow.zoijcleaow(nufgyqmvbu.lqeggnwhkg(10), draadjrbmkVarBtonecajqb, 6);
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(str2, esjtqupxsv.ojitshcjhn(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).zoijcleaow(), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(nufgyqmvbu.lqeggnwhkg(24))), nufgyqmvbu.lqeggnwhkg(8), nufgyqmvbu.lqeggnwhkg(2)), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).pmvmpeiblj(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i16).zoijcleaow().draadjrbmk(), draadjrbmkVar2, (i15 >> 3) & 14, 0, 65528);
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: cs0.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ru.myspar.proloyalty.common.view.bottomsheet.additional_info.iobyxmoadg.kcexrzcfyt(str, str2, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void rgvfuqvkyq(final String str, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(997997632);
        if ((i13 & 6) == 0) {
            i14 = i13 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(997997632, i14, -1, "ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoSubTitle (AdditionalInfoBottomSheetContent.kt:131)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = esjtqupxsv.oxmwwwfdhm(androidx.compose.foundation.zoijcleaow.wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, oipsdeybqn.f38945zoijcleaow.lqeggnwhkg(), null, 2, null), 0.0f, nufgyqmvbu.lqeggnwhkg(16), 0.0f, nufgyqmvbu.lqeggnwhkg(8), 5, null);
            z zVar = z.f44180iobyxmoadg;
            int i15 = z.f44181zoijcleaow;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            x31.gxszxtbevo.ppxfxbqfkf(str, wkgbmnqykcVarOxmwwwfdhm, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0, 0L, false, 0, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i15).zoijcleaow().iobyxmoadg(), draadjrbmkVar2, (i14 & 14) | 48, 0, 65528);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: cs0.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ru.myspar.proloyalty.common.view.bottomsheet.additional_info.iobyxmoadg.vdvldrhtss(str, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(String str, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        rgvfuqvkyq(str, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(List list, n nVar, long j13, int i13, jpowsppfya LazyColumn) {
        zdlpuopuiu.btonecajqb(LazyColumn, "$this$LazyColumn");
        LazyColumn.nufgyqmvbu(list.size(), new zoijcleaow(new draadjrbmk() { // from class: cs0.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.common.view.bottomsheet.additional_info.iobyxmoadg.agtfadlqog((AdditionalInfoUiModel.Item) obj);
            }
        }, list), new ppxfxbqfkf(C2214iobyxmoadg.f93845zdlpuopuiu, list), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(802480018, true, new wkgbmnqykc(list, nVar, j13, i13)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final long yggfygwlhe(h hVar, n nVar, List list, float f13, float f14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        draadjrbmkVar.sopmlzcsov(-1122600584);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-1122600584, i13, -1, "ru.myspar.proloyalty.common.view.bottomsheet.additional_info.getMaxFontSize (AdditionalInfoBottomSheetContent.kt:223)");
        }
        long jDraadjrbmk = nVar.draadjrbmk();
        if (list.isEmpty()) {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar.stevsuqkhv();
            return jDraadjrbmk;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int length = ((String) next).length();
            do {
                Object next2 = it.next();
                int length2 = ((String) next2).length();
                if (length < length2) {
                    next = next2;
                    length = length2;
                }
            } while (it.hasNext());
        }
        String str = (String) next;
        float fLqeggnwhkg = nufgyqmvbu.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(((Configuration) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.gxszxtbevo())).screenWidthDp) - f14);
        for (float fNufgyqmvbu = w0.jyumaefscl.nufgyqmvbu(jDraadjrbmk); f13 < fNufgyqmvbu; fNufgyqmvbu -= 0.5f) {
            if (nufgyqmvbu.gxszxtbevo(((w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(zeieaojujs.gxszxtbevo())).x((int) (hVar.iobyxmoadg(str, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : nVar.zoijcleaow((16777183 & 1) != 0 ? nVar.f50294iobyxmoadg.lqeggnwhkg() : 0L, (16777183 & 2) != 0 ? nVar.f50294iobyxmoadg.gtknphoqwx() : iwizpuwonk.nufgyqmvbu(fNufgyqmvbu), (16777183 & 4) != 0 ? nVar.f50294iobyxmoadg.agtfadlqog() : null, (16777183 & 8) != 0 ? nVar.f50294iobyxmoadg.draadjrbmk() : null, (16777183 & 16) != 0 ? nVar.f50294iobyxmoadg.wflxmlrfwp() : null, (16777183 & 32) != 0 ? nVar.f50294iobyxmoadg.dxjokdxxww() : null, (16777183 & 64) != 0 ? nVar.f50294iobyxmoadg.btonecajqb() : null, (16777183 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nVar.f50294iobyxmoadg.ojitshcjhn() : 0L, (16777183 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nVar.f50294iobyxmoadg.eablkybsjg() : null, (16777183 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? nVar.f50294iobyxmoadg.yggfygwlhe() : null, (16777183 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? nVar.f50294iobyxmoadg.rgvfuqvkyq() : null, (16777183 & 2048) != 0 ? nVar.f50294iobyxmoadg.wkgbmnqykc() : 0L, (16777183 & 4096) != 0 ? nVar.f50294iobyxmoadg.kcexrzcfyt() : null, (16777183 & 8192) != 0 ? nVar.f50294iobyxmoadg.oxmwwwfdhm() : null, (16777183 & 16384) != 0 ? nVar.f50294iobyxmoadg.nufgyqmvbu() : null, (16777183 & 32768) != 0 ? nVar.f50296zoijcleaow.nufgyqmvbu() : 0, (16777183 & 65536) != 0 ? nVar.f50296zoijcleaow.dxjokdxxww() : 0, (16777183 & 131072) != 0 ? nVar.f50296zoijcleaow.eablkybsjg() : 0L, (16777183 & 262144) != 0 ? nVar.f50296zoijcleaow.btonecajqb() : null, (16777183 & 524288) != 0 ? nVar.f50295ppxfxbqfkf : null, (16777183 & 1048576) != 0 ? nVar.f50296zoijcleaow.gxszxtbevo() : null, (16777183 & 2097152) != 0 ? nVar.f50296zoijcleaow.wkgbmnqykc() : 0, (16777183 & 4194304) != 0 ? nVar.f50296zoijcleaow.ppxfxbqfkf() : 0, (16777183 & 8388608) != 0 ? nVar.f50296zoijcleaow.gtknphoqwx() : null), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVar.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVar.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVar.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32)), fLqeggnwhkg) <= 0) {
                long jNufgyqmvbu = iwizpuwonk.nufgyqmvbu(fNufgyqmvbu);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                draadjrbmkVar.stevsuqkhv();
                return jNufgyqmvbu;
            }
        }
        long jNufgyqmvbu2 = iwizpuwonk.nufgyqmvbu(f13);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return jNufgyqmvbu2;
    }
}
