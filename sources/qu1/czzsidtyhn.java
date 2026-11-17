package qu1;

import android.content.res.Configuration;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.zeieaojujs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.GeofenceStatusCodes;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import igdgnonuha.k2;
import igdgnonuha.q;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.h;
import j0.i;
import j0.n;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class czzsidtyhn {

    public static final class eablkybsjg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f80691yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f80692zdlpuopuiu;

        public eablkybsjg(tg.draadjrbmk draadjrbmkVar, List list) {
            this.f80692zdlpuopuiu = draadjrbmkVar;
            this.f80691yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f80692zdlpuopuiu.invoke(this.f80691yggfygwlhe.get(i13));
        }
    }

    public static final class gxszxtbevo implements tg.oxmwwwfdhm {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f80693jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ float f80694yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f80695zdlpuopuiu;

        public gxszxtbevo(List list, float f13, tg.draadjrbmk draadjrbmkVar) {
            this.f80695zdlpuopuiu = list;
            this.f80694yggfygwlhe = f13;
            this.f80693jyumaefscl = draadjrbmkVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((yfnezrywwk.eablkybsjg) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(yfnezrywwk.eablkybsjg eablkybsjgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
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
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(802480018, i15, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            tu1.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = (tu1.ppxfxbqfkf.iobyxmoadg) this.f80695zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(-863833841);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarYggfygwlhe = androidx.compose.foundation.layout.cdpycssgdh.yggfygwlhe(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, this.f80694yggfygwlhe);
            draadjrbmkVar.sopmlzcsov(-166408738);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f80693jyumaefscl) | draadjrbmkVar.ulzqkzuiru(iobyxmoadgVar);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new zoijcleaow(this.f80693jyumaefscl, iobyxmoadgVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            czzsidtyhn.zynmafqrjb(wkgbmnqykcVarYggfygwlhe, iobyxmoadgVar, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, 0, 0);
            draadjrbmkVar.stevsuqkhv();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ yfnezrywwk.mbcevpiqjq f80696jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f80697yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f80698zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(int i13, yfnezrywwk.mbcevpiqjq mbcevpiqjqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f80697yggfygwlhe = i13;
            this.f80696jyumaefscl = mbcevpiqjqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f80697yggfygwlhe, this.f80696jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f80698zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            this.f80698zdlpuopuiu = 1;
            if (pj.crxdokpmqz.zoijcleaow(200L, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            int i14 = this.f80697yggfygwlhe;
            if (i14 > 0) {
                yfnezrywwk.mbcevpiqjq mbcevpiqjqVar = this.f80696jyumaefscl;
                this.f80698zdlpuopuiu = 2;
                if (yfnezrywwk.mbcevpiqjq.oxmwwwfdhm(mbcevpiqjqVar, i14, 0, this, 2, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f80699zdlpuopuiu = new ppxfxbqfkf();

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static final class wkgbmnqykc implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f80700yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f80701zdlpuopuiu;

        public wkgbmnqykc(tg.draadjrbmk draadjrbmkVar, List list) {
            this.f80701zdlpuopuiu = draadjrbmkVar;
            this.f80700yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f80701zdlpuopuiu.invoke(this.f80700yggfygwlhe.get(i13));
        }
    }

    static final class zoijcleaow implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tu1.ppxfxbqfkf.iobyxmoadg f80702yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f80703zdlpuopuiu;

        zoijcleaow(tg.draadjrbmk draadjrbmkVar, tu1.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
            this.f80703zdlpuopuiu = draadjrbmkVar;
            this.f80702yggfygwlhe = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f80703zdlpuopuiu.invoke(this.f80702yggfygwlhe.zoijcleaow());
        }
    }

    private static final void agtfadlqog(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final String str, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(55434974);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2);
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(55434974, i15, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.Description (SubscriptionDetailSettingsBlock.kt:86)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
            z zVar = z.f44180iobyxmoadg;
            int i17 = z.f44181zoijcleaow;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(str, wkgbmnqykcVarRgvfuqvkyq, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).cqumvgiudr(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).zoijcleaow().ojitshcjhn(), draadjrbmkVar2, (i15 >> 3) & 14, 0, 65528);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar4;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: qu1.okpsazkaxt
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return czzsidtyhn.ojitshcjhn(wkgbmnqykcVar2, str, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void cqumvgiudr(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final tu1.zoijcleaow.nufgyqmvbu model, final tg.rgvfuqvkyq onSettingItemClick, final tg.draadjrbmk onSettingItemAdditionalInfoClick, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onSettingItemClick, "onSettingItemClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onSettingItemAdditionalInfoClick, "onSettingItemAdditionalInfoClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1598193580);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onSettingItemClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onSettingItemAdditionalInfoClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i15 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        } else {
            wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1598193580, i15, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.SubscriptionDetailSettingsBlock (SubscriptionDetailSettingsBlock.kt:56)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null);
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(16), draadjrbmkVarBtonecajqb, 6);
            lereixgezr(null, model.ppxfxbqfkf(), draadjrbmkVarBtonecajqb, 0, 1);
            t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVarBtonecajqb, 6);
            agtfadlqog(null, model.iobyxmoadg(), draadjrbmkVarBtonecajqb, 0, 1);
            t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(8), draadjrbmkVarBtonecajqb, 6);
            zdlpuopuiu(null, model.zoijcleaow(), onSettingItemClick, onSettingItemAdditionalInfoClick, draadjrbmkVarBtonecajqb, i15 & 8064, 1);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: qu1.crxdokpmqz
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return czzsidtyhn.esjtqupxsv(wkgbmnqykcVar3, model, onSettingItemClick, onSettingItemAdditionalInfoClick, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void draadjrbmk(final tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1858682558);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1858682558, i14, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.AdditionalInfoIcon (SubscriptionDetailSettingsBlock.kt:173)");
            }
            q.zoijcleaow(iobyxmoadgVar, androidx.compose.foundation.layout.cdpycssgdh.vdvldrhtss(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(24)), false, null, qu1.wkgbmnqykc.f80834iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, (i14 & 14) | 24624, 12);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: qu1.rlfsiqarku
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return czzsidtyhn.wflxmlrfwp(iobyxmoadgVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn esjtqupxsv(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tu1.zoijcleaow.nufgyqmvbu nufgyqmvbuVar, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        cqumvgiudr(wkgbmnqykcVar, nufgyqmvbuVar, rgvfuqvkyqVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final tu1.zoijcleaow.nufgyqmvbu iozdgvuglv() {
        return new tu1.zoijcleaow.nufgyqmvbu("Выберите свой абонемент", "Настройте параметры под ваши привычки и ритм жизни", hg.jyumaefscl.rgvfuqvkyq(new tu1.ppxfxbqfkf("1", "Длительность (дни)", hg.jyumaefscl.rgvfuqvkyq(new tu1.ppxfxbqfkf.iobyxmoadg("7", "7", true), new tu1.ppxfxbqfkf.iobyxmoadg("14", "14", false), new tu1.ppxfxbqfkf.iobyxmoadg("28", "28", false), new tu1.ppxfxbqfkf.iobyxmoadg("30", "30", false)), false), new tu1.ppxfxbqfkf("2", "Количество чашек в день", hg.jyumaefscl.rgvfuqvkyq(new tu1.ppxfxbqfkf.iobyxmoadg("1", "1", false), new tu1.ppxfxbqfkf.iobyxmoadg("2", "2", true)), false), new tu1.ppxfxbqfkf("3", "Объем стакана", hg.jyumaefscl.rgvfuqvkyq(new tu1.ppxfxbqfkf.iobyxmoadg("1", "стандартный", true), new tu1.ppxfxbqfkf.iobyxmoadg("2", "двойной", false), new tu1.ppxfxbqfkf.iobyxmoadg("3", "тройной", false)), true)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn istkbnxepw(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tu1.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        zynmafqrjb(wkgbmnqykcVar, iobyxmoadgVar, iobyxmoadgVar2, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn iwizpuwonk(tg.draadjrbmk draadjrbmkVar, tu1.ppxfxbqfkf ppxfxbqfkfVar) {
        draadjrbmkVar.invoke(ppxfxbqfkfVar.iobyxmoadg());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn jyumaefscl(tg.rgvfuqvkyq rgvfuqvkyqVar, tu1.ppxfxbqfkf ppxfxbqfkfVar, String variantValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(variantValue, "variantValue");
        rgvfuqvkyqVar.invoke(ppxfxbqfkfVar.iobyxmoadg(), variantValue);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn kcexrzcfyt(tu1.ppxfxbqfkf ppxfxbqfkfVar, tg.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        rgvfuqvkyq(ppxfxbqfkfVar, draadjrbmkVar, iobyxmoadgVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void lereixgezr(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final String str, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(340116666);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2);
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(340116666, i15, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.Title (SubscriptionDetailSettingsBlock.kt:72)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
            z zVar = z.f44180iobyxmoadg;
            int i17 = z.f44181zoijcleaow;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
            w6.btonecajqb(str, wkgbmnqykcVarRgvfuqvkyq, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).zoijcleaow().gtknphoqwx(), draadjrbmkVar2, (i15 >> 3) & 14, 3120, 55288);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar4;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: qu1.ikoacuggdj
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return czzsidtyhn.pmvmpeiblj(wkgbmnqykcVar2, str, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ojitshcjhn(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, String str, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        agtfadlqog(wkgbmnqykcVar, str, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object oxmwwwfdhm(tu1.ppxfxbqfkf.iobyxmoadg item) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        return item.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn pmvmpeiblj(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, String str, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        lereixgezr(wkgbmnqykcVar, str, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void rgvfuqvkyq(final tu1.ppxfxbqfkf ppxfxbqfkfVar, final tg.draadjrbmk draadjrbmkVar, final tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar3;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-2005836566);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(ppxfxbqfkfVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i15 = i14;
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-2005836566, i15, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.SettingBlock (SubscriptionDetailSettingsBlock.kt:129)");
            }
            a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = a.eablkybsjg.f20iobyxmoadg.dxjokdxxww();
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            x.zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), ppxfxbqfkfVarDxjokdxxww, draadjrbmkVarBtonecajqb, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, iobyxmoadgVar2);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            float f13 = 16;
            t31.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
            String strZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
            z zVar = z.f44180iobyxmoadg;
            int i16 = z.f44181zoijcleaow;
            w6.btonecajqb(strZoijcleaow, null, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i16).zoijcleaow().draadjrbmk(), draadjrbmkVarBtonecajqb, 0, 3120, 55290);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-923206164);
            if (ppxfxbqfkfVar.wkgbmnqykc()) {
                t31.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(8), draadjrbmkVarBtonecajqb, 6);
                draadjrbmk(iobyxmoadgVar, draadjrbmkVarBtonecajqb, (i15 >> 6) & 14);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            t31.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
            final float fYadqdtsiqt = yadqdtsiqt(ppxfxbqfkfVar.ppxfxbqfkf(), draadjrbmkVarBtonecajqb, 0);
            yfnezrywwk.mbcevpiqjq mbcevpiqjqVarPpxfxbqfkf = yfnezrywwk.sopmlzcsov.ppxfxbqfkf(0, 0, draadjrbmkVarBtonecajqb, 0, 3);
            List listPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
            draadjrbmkVarBtonecajqb.sopmlzcsov(856798483);
            boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(listPpxfxbqfkf);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                Iterator it = ppxfxbqfkfVar.ppxfxbqfkf().iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else if (((tu1.ppxfxbqfkf.iobyxmoadg) it.next()).ppxfxbqfkf()) {
                        break;
                    } else {
                        i17++;
                    }
                }
                objYadqdtsiqt = Integer.valueOf(i17);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            int iIntValue = ((Number) objYadqdtsiqt).intValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            Integer numValueOf = Integer.valueOf(iIntValue);
            draadjrbmkVarBtonecajqb.sopmlzcsov(856802321);
            boolean zPpxfxbqfkf = draadjrbmkVarBtonecajqb.ppxfxbqfkf(iIntValue) | draadjrbmkVarBtonecajqb.ulzqkzuiru(mbcevpiqjqVarPpxfxbqfkf);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zPpxfxbqfkf || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new iobyxmoadg(iIntValue, mbcevpiqjqVarPpxfxbqfkf, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.runtime.jlmebxxoox.eablkybsjg(numValueOf, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(8));
            czzsidtyhn.ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = androidx.compose.foundation.layout.esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(4), 0.0f, 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(856811898);
            boolean zLmojexxdyd = ((i15 & 112) == 32) | draadjrbmkVarBtonecajqb.lmojexxdyd(ppxfxbqfkfVar) | draadjrbmkVarBtonecajqb.zoijcleaow(fYadqdtsiqt);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: qu1.jztzpxfvev
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return czzsidtyhn.vdvldrhtss(ppxfxbqfkfVar, fYadqdtsiqt, draadjrbmkVar, (yfnezrywwk.jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
            yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVarNufgyqmvbu, mbcevpiqjqVarPpxfxbqfkf, ydmasvzmpaVarLqeggnwhkg, false, gxszxtbevoVarRgvfuqvkyq, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar3, 24966, 488);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: qu1.xrmfcynszj
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return czzsidtyhn.kcexrzcfyt(ppxfxbqfkfVar, draadjrbmkVar, iobyxmoadgVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn vdvldrhtss(tu1.ppxfxbqfkf ppxfxbqfkfVar, float f13, tg.draadjrbmk draadjrbmkVar, yfnezrywwk.jpowsppfya LazyRow) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(LazyRow, "$this$LazyRow");
        List listPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        LazyRow.nufgyqmvbu(listPpxfxbqfkf.size(), new wkgbmnqykc(new tg.draadjrbmk() { // from class: qu1.metgxyhuhe
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return czzsidtyhn.oxmwwwfdhm((tu1.ppxfxbqfkf.iobyxmoadg) obj);
            }
        }, listPpxfxbqfkf), new eablkybsjg(ppxfxbqfkf.f80699zdlpuopuiu, listPpxfxbqfkf), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(802480018, true, new gxszxtbevo(listPpxfxbqfkf, f13, draadjrbmkVar)));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wflxmlrfwp(tg.iobyxmoadg iobyxmoadgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        draadjrbmk(iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final float yadqdtsiqt(List list, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        Object next;
        draadjrbmkVar.sopmlzcsov(-1199524617);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1199524617, i13, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.calculateVariantWidth (SubscriptionDetailSettingsBlock.kt:226)");
        }
        float fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(((Configuration) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.gxszxtbevo())).screenWidthDp) - w0.nufgyqmvbu.lqeggnwhkg(75)) / 3);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = ((tu1.ppxfxbqfkf.iobyxmoadg) next).zoijcleaow().length();
                do {
                    Object next2 = it.next();
                    int length2 = ((tu1.ppxfxbqfkf.iobyxmoadg) next2).zoijcleaow().length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        tu1.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = (tu1.ppxfxbqfkf.iobyxmoadg) next;
        if (iobyxmoadgVar != null) {
            tu1.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar.zoijcleaow().length() > 4 ? iobyxmoadgVar : null;
            if (iobyxmoadgVar2 != null) {
                h hVarIobyxmoadg = i.iobyxmoadg(0, draadjrbmkVar, 0, 1);
                float fLqeggnwhkg2 = w0.nufgyqmvbu.lqeggnwhkg(((w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(zeieaojujs.gxszxtbevo())).x((int) (hVarIobyxmoadg.iobyxmoadg(iobyxmoadgVar2.zoijcleaow(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : l41.ppxfxbqfkf.zoijcleaow(z.f44180iobyxmoadg, draadjrbmkVar, z.f44181zoijcleaow).zoijcleaow().draadjrbmk(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVarIobyxmoadg.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVarIobyxmoadg.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVarIobyxmoadg.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32)) + w0.nufgyqmvbu.lqeggnwhkg(44));
                if (fLqeggnwhkg <= fLqeggnwhkg2) {
                    fLqeggnwhkg = fLqeggnwhkg2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                draadjrbmkVar.stevsuqkhv();
                return fLqeggnwhkg;
            }
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return fLqeggnwhkg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn yggfygwlhe(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, List list, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        zdlpuopuiu(wkgbmnqykcVar, list, rgvfuqvkyqVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0208  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0101  */
    /* JADX WARN: Code duplicated, block: B:61:0x010d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0111  */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0166  */
    /* JADX WARN: Code duplicated, block: B:73:0x016e  */
    /* JADX WARN: Code duplicated, block: B:76:0x017b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0185  */
    /* JADX WARN: Code duplicated, block: B:80:0x0195  */
    /* JADX WARN: Code duplicated, block: B:81:0x0197  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01db  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fd  */
    private static final void zdlpuopuiu(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final List list, final tg.rgvfuqvkyq rgvfuqvkyqVar, final tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        int i16;
        int i17;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        int i18;
        final tu1.ppxfxbqfkf ppxfxbqfkfVar;
        boolean z13;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt;
        boolean z14;
        boolean zLmojexxdyd2;
        Object objYadqdtsiqt2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        a0 a0VarWflxmlrfwp;
        int i19 = 8;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(410969598);
        int i23 = i14 & 1;
        if (i23 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) == 0) {
            if ((i13 & 48) == 0) {
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(list) ? 32 : 16;
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
            if ((i14 & 8) != 0) {
                i15 |= 3072;
            } else if ((i13 & 3072) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar)) {
                    i17 = 2048;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i23 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(410969598, i15, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.SettingsColumnBlock (SubscriptionDetailSettingsBlock.kt:103)");
                }
                float f13 = 4;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(wkgbmnqykcVar2, w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zdlpuopuiu(), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(16))), w0.nufgyqmvbu.lqeggnwhkg(f13), w0.nufgyqmvbu.lqeggnwhkg(12));
                x.zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn);
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
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
                czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(936508378);
                i18 = 0;
                for (Object obj : list) {
                    int i24 = i18 + 1;
                    if (i18 < 0) {
                        hg.jyumaefscl.iwizpuwonk();
                    }
                    ppxfxbqfkfVar = (tu1.ppxfxbqfkf) obj;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(936509467);
                    if (i18 != 0) {
                        t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(i19), draadjrbmkVarBtonecajqb, 6);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(189663283);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zLmojexxdyd = z13 | draadjrbmkVarBtonecajqb.lmojexxdyd(ppxfxbqfkfVar);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: qu1.ribwqtqdhb
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj2) {
                                return czzsidtyhn.jyumaefscl(rgvfuqvkyqVar, ppxfxbqfkfVar, (String) obj2);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(189666787);
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zLmojexxdyd2 = z14 | draadjrbmkVarBtonecajqb.lmojexxdyd(ppxfxbqfkfVar);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: qu1.vipkmwdibw
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return czzsidtyhn.iwizpuwonk(draadjrbmkVar, ppxfxbqfkfVar);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    rgvfuqvkyq(ppxfxbqfkfVar, draadjrbmkVar3, (tg.iobyxmoadg) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                    i18 = i24;
                    i19 = 8;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: qu1.jhduphickx
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj2, Object obj3) {
                        return czzsidtyhn.yggfygwlhe(wkgbmnqykcVar3, list, rgvfuqvkyqVar, draadjrbmkVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= 48;
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
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar)) {
                i17 = 2048;
            } else {
                i17 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i15 |= i17;
        }
        if ((i15 & 1171) == 1170) {
            if (i23 != 0) {
                wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(410969598, i15, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.SettingsColumnBlock (SubscriptionDetailSettingsBlock.kt:103)");
            }
            float f14 = 4;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn2 = androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(wkgbmnqykcVar2, w0.nufgyqmvbu.lqeggnwhkg(f14), 0.0f, 2, null), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zdlpuopuiu(), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(16))), w0.nufgyqmvbu.lqeggnwhkg(f14), w0.nufgyqmvbu.lqeggnwhkg(12));
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn2);
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
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar2 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(936508378);
            i18 = 0;
            while (r1.hasNext()) {
                int i25 = i18 + 1;
                if (i18 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                ppxfxbqfkfVar = (tu1.ppxfxbqfkf) obj;
                draadjrbmkVarBtonecajqb.sopmlzcsov(936509467);
                if (i18 != 0) {
                    t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(i19), draadjrbmkVarBtonecajqb, 6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(189663283);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zLmojexxdyd = z13 | draadjrbmkVarBtonecajqb.lmojexxdyd(ppxfxbqfkfVar);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: qu1.ribwqtqdhb
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj2) {
                            return czzsidtyhn.jyumaefscl(rgvfuqvkyqVar, ppxfxbqfkfVar, (String) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: qu1.ribwqtqdhb
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj2) {
                            return czzsidtyhn.jyumaefscl(rgvfuqvkyqVar, ppxfxbqfkfVar, (String) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.draadjrbmk draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(189666787);
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zLmojexxdyd2 = z14 | draadjrbmkVarBtonecajqb.lmojexxdyd(ppxfxbqfkfVar);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd2) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: qu1.vipkmwdibw
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return czzsidtyhn.iwizpuwonk(draadjrbmkVar, ppxfxbqfkfVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: qu1.vipkmwdibw
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return czzsidtyhn.iwizpuwonk(draadjrbmkVar, ppxfxbqfkfVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                rgvfuqvkyq(ppxfxbqfkfVar, draadjrbmkVar4, (tg.iobyxmoadg) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                i18 = i25;
                i19 = 8;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            if (i23 != 0) {
                wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(410969598, i15, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.SettingsColumnBlock (SubscriptionDetailSettingsBlock.kt:103)");
            }
            float f15 = 4;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn3 = androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(wkgbmnqykcVar2, w0.nufgyqmvbu.lqeggnwhkg(f15), 0.0f, 2, null), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zdlpuopuiu(), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(16))), w0.nufgyqmvbu.lqeggnwhkg(f15), w0.nufgyqmvbu.lqeggnwhkg(12));
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg3 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar3.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar3 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(936508378);
            i18 = 0;
            while (r1.hasNext()) {
                int i26 = i18 + 1;
                if (i18 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                ppxfxbqfkfVar = (tu1.ppxfxbqfkf) obj;
                draadjrbmkVarBtonecajqb.sopmlzcsov(936509467);
                if (i18 != 0) {
                    t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(i19), draadjrbmkVarBtonecajqb, 6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(189663283);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zLmojexxdyd = z13 | draadjrbmkVarBtonecajqb.lmojexxdyd(ppxfxbqfkfVar);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: qu1.ribwqtqdhb
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj2) {
                            return czzsidtyhn.jyumaefscl(rgvfuqvkyqVar, ppxfxbqfkfVar, (String) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: qu1.ribwqtqdhb
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj2) {
                            return czzsidtyhn.jyumaefscl(rgvfuqvkyqVar, ppxfxbqfkfVar, (String) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.draadjrbmk draadjrbmkVar5 = (tg.draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(189666787);
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zLmojexxdyd2 = z14 | draadjrbmkVarBtonecajqb.lmojexxdyd(ppxfxbqfkfVar);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd2) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: qu1.vipkmwdibw
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return czzsidtyhn.iwizpuwonk(draadjrbmkVar, ppxfxbqfkfVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: qu1.vipkmwdibw
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return czzsidtyhn.iwizpuwonk(draadjrbmkVar, ppxfxbqfkfVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                rgvfuqvkyq(ppxfxbqfkfVar, draadjrbmkVar5, (tg.iobyxmoadg) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                i18 = i26;
                i19 = 8;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        wkgbmnqykcVar3 = wkgbmnqykcVar2;
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: qu1.jhduphickx
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return czzsidtyhn.yggfygwlhe(wkgbmnqykcVar3, list, rgvfuqvkyqVar, draadjrbmkVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:59:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x017a  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void zynmafqrjb(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final tu1.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, final tg.iobyxmoadg iobyxmoadgVar2, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        bfopjjpdmp.gxszxtbevo gxszxtbevoVarPpxfxbqfkf;
        z zVar;
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu;
        Object objYadqdtsiqt;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-392415924);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(iobyxmoadgVar) ? 32 : 16;
        }
        if ((i14 & 4) == 0) {
            if ((i13 & 384) == 0) {
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i15 & 147) == 146 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-392415924, i15, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.VariantItem (SubscriptionDetailSettingsBlock.kt:192)");
                }
                gxszxtbevoVarPpxfxbqfkf = bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(28));
                draadjrbmkVarBtonecajqb.sopmlzcsov(388244706);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = e.eablkybsjg.iobyxmoadg(wkgbmnqykcVar3, gxszxtbevoVarPpxfxbqfkf);
                zVar = z.f44180iobyxmoadg;
                i16 = z.f44181zoijcleaow;
                wkgbmnqykcVarWkgbmnqykc = androidx.compose.foundation.zoijcleaow.wkgbmnqykc(wkgbmnqykcVarIobyxmoadg, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).wflxmlrfwp(), null, 2, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(388245374);
                if (iobyxmoadgVar.ppxfxbqfkf()) {
                    wkgbmnqykcVarNufgyqmvbu = ikoacuggdj.btonecajqb.nufgyqmvbu(wkgbmnqykcVarWkgbmnqykc, w0.nufgyqmvbu.lqeggnwhkg(2), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).eablkybsjg(), gxszxtbevoVarPpxfxbqfkf);
                } else {
                    wkgbmnqykcVarNufgyqmvbu = wkgbmnqykcVarWkgbmnqykc;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(388253827);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarNufgyqmvbu, (metgxyhuhe.draadjrbmk) objYadqdtsiqt, k2.nufgyqmvbu(true, 0.0f, 0L, 6, null), false, null, g0.nufgyqmvbu.btonecajqb(g0.nufgyqmvbu.f35737zoijcleaow.iobyxmoadg()), iobyxmoadgVar2, 12, null);
                x.zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar3.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                w6.btonecajqb(iobyxmoadgVar.zoijcleaow(), androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(22), w0.nufgyqmvbu.lqeggnwhkg(18)), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).eablkybsjg(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i16).zoijcleaow().draadjrbmk(), draadjrbmkVarBtonecajqb, 48, 3120, 55288);
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: qu1.jlmebxxoox
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return czzsidtyhn.istkbnxepw(wkgbmnqykcVar4, iobyxmoadgVar, iobyxmoadgVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        if ((i15 & 147) == 146) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-392415924, i15, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.VariantItem (SubscriptionDetailSettingsBlock.kt:192)");
            }
            gxszxtbevoVarPpxfxbqfkf = bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(28));
            draadjrbmkVarBtonecajqb.sopmlzcsov(388244706);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg2 = e.eablkybsjg.iobyxmoadg(wkgbmnqykcVar3, gxszxtbevoVarPpxfxbqfkf);
            zVar = z.f44180iobyxmoadg;
            i16 = z.f44181zoijcleaow;
            wkgbmnqykcVarWkgbmnqykc = androidx.compose.foundation.zoijcleaow.wkgbmnqykc(wkgbmnqykcVarIobyxmoadg2, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).wflxmlrfwp(), null, 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(388245374);
            if (iobyxmoadgVar.ppxfxbqfkf()) {
                wkgbmnqykcVarNufgyqmvbu = ikoacuggdj.btonecajqb.nufgyqmvbu(wkgbmnqykcVarWkgbmnqykc, w0.nufgyqmvbu.lqeggnwhkg(2), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).eablkybsjg(), gxszxtbevoVarPpxfxbqfkf);
            } else {
                wkgbmnqykcVarNufgyqmvbu = wkgbmnqykcVarWkgbmnqykc;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(388253827);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarNufgyqmvbu, (metgxyhuhe.draadjrbmk) objYadqdtsiqt, k2.nufgyqmvbu(true, 0.0f, 0L, 6, null), false, null, g0.nufgyqmvbu.btonecajqb(g0.nufgyqmvbu.f35737zoijcleaow.iobyxmoadg()), iobyxmoadgVar2, 12, null);
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo2);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar4 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar4.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar4.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar4.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar2 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            w6.btonecajqb(iobyxmoadgVar.zoijcleaow(), androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(22), w0.nufgyqmvbu.lqeggnwhkg(18)), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).eablkybsjg(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i16).zoijcleaow().draadjrbmk(), draadjrbmkVarBtonecajqb, 48, 3120, 55288);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-392415924, i15, -1, "ru.myspar.proloyalty.subscription.impl.detail.presentation.compose.VariantItem (SubscriptionDetailSettingsBlock.kt:192)");
            }
            gxszxtbevoVarPpxfxbqfkf = bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(28));
            draadjrbmkVarBtonecajqb.sopmlzcsov(388244706);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg3 = e.eablkybsjg.iobyxmoadg(wkgbmnqykcVar3, gxszxtbevoVarPpxfxbqfkf);
            zVar = z.f44180iobyxmoadg;
            i16 = z.f44181zoijcleaow;
            wkgbmnqykcVarWkgbmnqykc = androidx.compose.foundation.zoijcleaow.wkgbmnqykc(wkgbmnqykcVarIobyxmoadg3, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).wflxmlrfwp(), null, 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(388245374);
            if (iobyxmoadgVar.ppxfxbqfkf()) {
                wkgbmnqykcVarNufgyqmvbu = ikoacuggdj.btonecajqb.nufgyqmvbu(wkgbmnqykcVarWkgbmnqykc, w0.nufgyqmvbu.lqeggnwhkg(2), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).eablkybsjg(), gxszxtbevoVarPpxfxbqfkf);
            } else {
                wkgbmnqykcVarNufgyqmvbu = wkgbmnqykcVarWkgbmnqykc;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(388253827);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo3 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarNufgyqmvbu, (metgxyhuhe.draadjrbmk) objYadqdtsiqt, k2.nufgyqmvbu(true, 0.0f, 0L, 6, null), false, null, g0.nufgyqmvbu.btonecajqb(g0.nufgyqmvbu.f35737zoijcleaow.iobyxmoadg()), iobyxmoadgVar2, 12, null);
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar5 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar5.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar5.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar5.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar5.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar5.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar3 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            w6.btonecajqb(iobyxmoadgVar.zoijcleaow(), androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(22), w0.nufgyqmvbu.lqeggnwhkg(18)), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).eablkybsjg(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i16).zoijcleaow().draadjrbmk(), draadjrbmkVarBtonecajqb, 48, 3120, 55288);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: qu1.jlmebxxoox
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return czzsidtyhn.istkbnxepw(wkgbmnqykcVar4, iobyxmoadgVar, iobyxmoadgVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
