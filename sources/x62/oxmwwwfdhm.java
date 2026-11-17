package x62;

import android.content.Context;
import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.tbqsvytpvh;
import czzsidtyhn.uawqvzlxes;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import igdgnonuha.k2;
import igdgnonuha.t;
import igdgnonuha.w6;
import igdgnonuha.yggfygwlhe;
import igdgnonuha.z;
import igdgnonuha.z1;
import ikoacuggdj.tzroggbefp;
import j0.n;
import java.util.Iterator;
import java.util.List;
import mj.kcexrzcfyt;
import pj.cllcsxoeiz;
import ru.myspar.components.promo_collection.api.models.PromoCollectionItem;
import ru.myspar.core.domain.models.ColorsUiModel;
import x.zynmafqrjb;
import yfnezrywwk.cqumvgiudr;
import yfnezrywwk.jpowsppfya;
import yfnezrywwk.mbcevpiqjq;
import yfnezrywwk.sopmlzcsov;

/* JADX INFO: loaded from: classes6.dex */
public abstract class oxmwwwfdhm {

    public static final class eablkybsjg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f121357yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f121358zdlpuopuiu;

        public eablkybsjg(tg.draadjrbmk draadjrbmkVar, List list) {
            this.f121358zdlpuopuiu = draadjrbmkVar;
            this.f121357yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f121358zdlpuopuiu.invoke(this.f121357yggfygwlhe.get(i13));
        }
    }

    public static final class gxszxtbevo implements tg.oxmwwwfdhm {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f121359jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ z62.iobyxmoadg f121360yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f121361zdlpuopuiu;

        public gxszxtbevo(List list, z62.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f121361zdlpuopuiu = list;
            this.f121360yggfygwlhe = iobyxmoadgVar;
            this.f121359jyumaefscl = rgvfuqvkyqVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((yfnezrywwk.eablkybsjg) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
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
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(802480018, i15, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            PromoCollectionItem promoCollectionItem = (PromoCollectionItem) this.f121361zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(-1900941332);
            boolean zBtonecajqb = this.f121360yggfygwlhe.btonecajqb();
            ColorsUiModel colorsUiModelLqeggnwhkg = this.f121360yggfygwlhe.lqeggnwhkg();
            draadjrbmkVar.sopmlzcsov(-892598410);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f121359jyumaefscl) | draadjrbmkVar.lmojexxdyd(this.f121360yggfygwlhe);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new zoijcleaow(this.f121359jyumaefscl, this.f121360yggfygwlhe);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            oxmwwwfdhm.agtfadlqog(zBtonecajqb, colorsUiModelLqeggnwhkg, promoCollectionItem, (tg.draadjrbmk) objYadqdtsiqt, null, draadjrbmkVar, 0, 16);
            draadjrbmkVar.stevsuqkhv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ i1 f121362cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f121363iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ mbcevpiqjq f121364jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ z62.iobyxmoadg f121365yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f121366zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(z62.iobyxmoadg iobyxmoadgVar, mbcevpiqjq mbcevpiqjqVar, tg.draadjrbmk draadjrbmkVar, i1 i1Var, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f121365yggfygwlhe = iobyxmoadgVar;
            this.f121364jyumaefscl = mbcevpiqjqVar;
            this.f121363iwizpuwonk = draadjrbmkVar;
            this.f121362cqumvgiudr = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f121365yggfygwlhe, this.f121364jyumaefscl, this.f121363iwizpuwonk, this.f121362cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f121366zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (oxmwwwfdhm.istkbnxepw(this.f121362cqumvgiudr) >= 0 && !this.f121365yggfygwlhe.draadjrbmk()) {
                    mbcevpiqjq mbcevpiqjqVar = this.f121364jyumaefscl;
                    int iIstkbnxepw = oxmwwwfdhm.istkbnxepw(this.f121362cqumvgiudr);
                    this.f121366zdlpuopuiu = 1;
                    if (oxmwwwfdhm.pkzmftpjix(mbcevpiqjqVar, iIstkbnxepw, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            this.f121363iwizpuwonk.invoke(this.f121365yggfygwlhe.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f121367iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f121368jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f121369yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f121370zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f121368jyumaefscl = obj;
            this.f121367iwizpuwonk |= Integer.MIN_VALUE;
            return oxmwwwfdhm.pkzmftpjix(null, 0, this);
        }
    }

    public static final class ppxfxbqfkf implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f121371zdlpuopuiu = new ppxfxbqfkf();

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static final class wkgbmnqykc implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f121372yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f121373zdlpuopuiu;

        public wkgbmnqykc(tg.draadjrbmk draadjrbmkVar, List list) {
            this.f121373zdlpuopuiu = draadjrbmkVar;
            this.f121372yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f121373zdlpuopuiu.invoke(this.f121372yggfygwlhe.get(i13));
        }
    }

    static final class zoijcleaow implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ z62.iobyxmoadg f121374yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f121375zdlpuopuiu;

        zoijcleaow(tg.rgvfuqvkyq rgvfuqvkyqVar, z62.iobyxmoadg iobyxmoadgVar) {
            this.f121375zdlpuopuiu = rgvfuqvkyqVar;
            this.f121374yggfygwlhe = iobyxmoadgVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((String) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(String itemId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
            this.f121375zdlpuopuiu.invoke(this.f121374yggfygwlhe.eablkybsjg(), itemId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x031e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0329  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:78:0x0122  */
    /* JADX WARN: Code duplicated, block: B:81:0x012e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x018a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0196  */
    /* JADX WARN: Code duplicated, block: B:90:0x019a  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a9  */
    public static final void agtfadlqog(final boolean z13, final ColorsUiModel colorsUiModel, final PromoCollectionItem promoCollectionItem, final tg.draadjrbmk draadjrbmkVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        boolean z14;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar;
        boolean z15;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt2;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        float f13;
        a0 a0VarWflxmlrfwp;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(337761297);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(colorsUiModel) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(promoCollectionItem) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i17 = i14 & 16;
        if (i17 == 0) {
            if ((i13 & 24576) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 16384 : 8192;
            }
            i16 = i15;
            if ((i16 & 9363) == 9362 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(337761297, i16, -1, "ru.myspar.specialbanner.impl.presentation.promo_collection.compose.PromoItem (SpecialBannerPromoCollectionCompose.kt:143)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarYggfygwlhe = cdpycssgdh.yggfygwlhe(wkgbmnqykcVar3, w0.nufgyqmvbu.lqeggnwhkg(196));
                z zVar = z.f44180iobyxmoadg;
                int i18 = z.f44181zoijcleaow;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(wkgbmnqykcVarYggfygwlhe, zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i18).agtfadlqog(), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(24)));
                if ((promoCollectionItem.getCurrentStatus() instanceof PromoCollectionItem.Status.Opened) || z13) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(91080421);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                metgxyhuhe.draadjrbmk draadjrbmkVar3 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tzroggbefp tzroggbefpVarNufgyqmvbu = k2.nufgyqmvbu(true, 0.0f, 0L, 6, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(91084254);
                if ((i16 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zLmojexxdyd = z15 | draadjrbmkVarBtonecajqb.lmojexxdyd(promoCollectionItem);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: x62.ojitshcjhn
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return oxmwwwfdhm.ojitshcjhn(draadjrbmkVar, promoCollectionItem);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                float f14 = 8;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = esjtqupxsv.ojitshcjhn(androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarPpxfxbqfkf, draadjrbmkVar3, tzroggbefpVarNufgyqmvbu, z14, null, null, (tg.iobyxmoadg) objYadqdtsiqt2, 24, null), w0.nufgyqmvbu.lqeggnwhkg(f14), w0.nufgyqmvbu.lqeggnwhkg(f14));
                czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww();
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww, iobyxmoadgVar2.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn);
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar3.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
                czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                int i19 = (i16 >> 6) & 14;
                yggfygwlhe(promoCollectionItem, draadjrbmkVarBtonecajqb, i19);
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar4, w0.nufgyqmvbu.lqeggnwhkg(f14)), draadjrbmkVarBtonecajqb, 6);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = vdvldrhtssVar.zoijcleaow(esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar4, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f14), 0.0f, 2, null), iobyxmoadgVar2.lqeggnwhkg());
                String name = promoCollectionItem.getName();
                n nVarOjitshcjhn = y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i18).zoijcleaow().ojitshcjhn();
                long jIwizpuwonk = y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk();
                v0.jyumaefscl.iobyxmoadg iobyxmoadgVar5 = v0.jyumaefscl.f114986iobyxmoadg;
                int iZoijcleaow = iobyxmoadgVar5.zoijcleaow();
                v0.btonecajqb.iobyxmoadg iobyxmoadgVar6 = v0.btonecajqb.f114934zoijcleaow;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
                w6.btonecajqb(name, wkgbmnqykcVarZoijcleaow, jIwizpuwonk, 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(iobyxmoadgVar6.iobyxmoadg()), 0L, iZoijcleaow, false, 1, 0, null, nVarOjitshcjhn, draadjrbmkVarBtonecajqb, 0, 3120, 54776);
                uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar4, w0.nufgyqmvbu.lqeggnwhkg(f14)), draadjrbmkVarBtonecajqb, 6);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow2 = vdvldrhtssVar.zoijcleaow(esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar4, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg((float) 2.5d), 0.0f, 2, null), iobyxmoadgVar2.lqeggnwhkg());
                if (kcexrzcfyt.zfvoamnweg(promoCollectionItem.draadjrbmk())) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                w6.btonecajqb(promoCollectionItem.draadjrbmk(), e.iobyxmoadg.iobyxmoadg(wkgbmnqykcVarZoijcleaow2, f13), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).cqumvgiudr(), 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(iobyxmoadgVar6.iobyxmoadg()), 0L, iobyxmoadgVar5.zoijcleaow(), false, 1, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i18).zoijcleaow().wkgbmnqykc(), draadjrbmkVarBtonecajqb, 0, 3120, 54776);
                uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar4, w0.nufgyqmvbu.lqeggnwhkg(16)), draadjrbmkVarBtonecajqb, 6);
                vdvldrhtss(promoCollectionItem, colorsUiModel, draadjrbmkVar, draadjrbmkVarBtonecajqb, (i16 & 112) | i19 | ((i16 >> 3) & 896));
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar4;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar2;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: x62.rgvfuqvkyq
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return oxmwwwfdhm.rgvfuqvkyq(z13, colorsUiModel, promoCollectionItem, draadjrbmkVar, wkgbmnqykcVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i15;
        if ((i16 & 9363) == 9362) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(337761297, i16, -1, "ru.myspar.specialbanner.impl.presentation.promo_collection.compose.PromoItem (SpecialBannerPromoCollectionCompose.kt:143)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarYggfygwlhe2 = cdpycssgdh.yggfygwlhe(wkgbmnqykcVar3, w0.nufgyqmvbu.lqeggnwhkg(196));
            z zVar2 = z.f44180iobyxmoadg;
            int i110 = z.f44181zoijcleaow;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf2 = androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(wkgbmnqykcVarYggfygwlhe2, zVar2.iobyxmoadg(draadjrbmkVarBtonecajqb, i110).agtfadlqog(), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(24)));
            if (promoCollectionItem.getCurrentStatus() instanceof PromoCollectionItem.Status.Opened) {
                z14 = false;
            } else {
                z14 = false;
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(91080421);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            metgxyhuhe.draadjrbmk draadjrbmkVar4 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tzroggbefp tzroggbefpVarNufgyqmvbu2 = k2.nufgyqmvbu(true, 0.0f, 0L, 6, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(91084254);
            if ((i16 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            zLmojexxdyd = z15 | draadjrbmkVarBtonecajqb.lmojexxdyd(promoCollectionItem);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: x62.ojitshcjhn
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return oxmwwwfdhm.ojitshcjhn(draadjrbmkVar, promoCollectionItem);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: x62.ojitshcjhn
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return oxmwwwfdhm.ojitshcjhn(draadjrbmkVar, promoCollectionItem);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            float f15 = 8;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn2 = esjtqupxsv.ojitshcjhn(androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarPpxfxbqfkf2, draadjrbmkVar4, tzroggbefpVarNufgyqmvbu2, z14, null, null, (tg.iobyxmoadg) objYadqdtsiqt2, 24, null), w0.nufgyqmvbu.lqeggnwhkg(f15), w0.nufgyqmvbu.lqeggnwhkg(f15));
            czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww2 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar7 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww2, iobyxmoadgVar7.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn2);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar8 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar8.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar8.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar8.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar8.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar8.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar2 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            int i111 = (i16 >> 6) & 14;
            yggfygwlhe(promoCollectionItem, draadjrbmkVarBtonecajqb, i111);
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar9 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar9, w0.nufgyqmvbu.lqeggnwhkg(f15)), draadjrbmkVarBtonecajqb, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow3 = vdvldrhtssVar2.zoijcleaow(esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar9, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f15), 0.0f, 2, null), iobyxmoadgVar7.lqeggnwhkg());
            String name2 = promoCollectionItem.getName();
            n nVarOjitshcjhn2 = y50.ppxfxbqfkf.zoijcleaow(zVar2, draadjrbmkVarBtonecajqb, i110).zoijcleaow().ojitshcjhn();
            long jIwizpuwonk2 = y50.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i110).iwizpuwonk();
            v0.jyumaefscl.iobyxmoadg iobyxmoadgVar10 = v0.jyumaefscl.f114986iobyxmoadg;
            int iZoijcleaow2 = iobyxmoadgVar10.zoijcleaow();
            v0.btonecajqb.iobyxmoadg iobyxmoadgVar11 = v0.btonecajqb.f114934zoijcleaow;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
            w6.btonecajqb(name2, wkgbmnqykcVarZoijcleaow3, jIwizpuwonk2, 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(iobyxmoadgVar11.iobyxmoadg()), 0L, iZoijcleaow2, false, 1, 0, null, nVarOjitshcjhn2, draadjrbmkVarBtonecajqb, 0, 3120, 54776);
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar9, w0.nufgyqmvbu.lqeggnwhkg(f15)), draadjrbmkVarBtonecajqb, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow4 = vdvldrhtssVar2.zoijcleaow(esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar9, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg((float) 2.5d), 0.0f, 2, null), iobyxmoadgVar7.lqeggnwhkg());
            if (kcexrzcfyt.zfvoamnweg(promoCollectionItem.draadjrbmk())) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            w6.btonecajqb(promoCollectionItem.draadjrbmk(), e.iobyxmoadg.iobyxmoadg(wkgbmnqykcVarZoijcleaow4, f13), y50.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i110).cqumvgiudr(), 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(iobyxmoadgVar11.iobyxmoadg()), 0L, iobyxmoadgVar10.zoijcleaow(), false, 1, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar2, draadjrbmkVarBtonecajqb, i110).zoijcleaow().wkgbmnqykc(), draadjrbmkVarBtonecajqb, 0, 3120, 54776);
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar9, w0.nufgyqmvbu.lqeggnwhkg(16)), draadjrbmkVarBtonecajqb, 6);
            vdvldrhtss(promoCollectionItem, colorsUiModel, draadjrbmkVar, draadjrbmkVarBtonecajqb, (i16 & 112) | i111 | ((i16 >> 3) & 896));
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar6;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(337761297, i16, -1, "ru.myspar.specialbanner.impl.presentation.promo_collection.compose.PromoItem (SpecialBannerPromoCollectionCompose.kt:143)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarYggfygwlhe3 = cdpycssgdh.yggfygwlhe(wkgbmnqykcVar3, w0.nufgyqmvbu.lqeggnwhkg(196));
            z zVar3 = z.f44180iobyxmoadg;
            int i112 = z.f44181zoijcleaow;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf3 = androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(wkgbmnqykcVarYggfygwlhe3, zVar3.iobyxmoadg(draadjrbmkVarBtonecajqb, i112).agtfadlqog(), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(24)));
            if (promoCollectionItem.getCurrentStatus() instanceof PromoCollectionItem.Status.Opened) {
                z14 = false;
            } else {
                z14 = false;
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(91080421);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            metgxyhuhe.draadjrbmk draadjrbmkVar5 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tzroggbefp tzroggbefpVarNufgyqmvbu3 = k2.nufgyqmvbu(true, 0.0f, 0L, 6, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(91084254);
            if ((i16 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            zLmojexxdyd = z15 | draadjrbmkVarBtonecajqb.lmojexxdyd(promoCollectionItem);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: x62.ojitshcjhn
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return oxmwwwfdhm.ojitshcjhn(draadjrbmkVar, promoCollectionItem);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: x62.ojitshcjhn
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return oxmwwwfdhm.ojitshcjhn(draadjrbmkVar, promoCollectionItem);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            float f16 = 8;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn3 = esjtqupxsv.ojitshcjhn(androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarPpxfxbqfkf3, draadjrbmkVar5, tzroggbefpVarNufgyqmvbu3, z14, null, null, (tg.iobyxmoadg) objYadqdtsiqt2, 24, null), w0.nufgyqmvbu.lqeggnwhkg(f16), w0.nufgyqmvbu.lqeggnwhkg(f16));
            czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww3 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar12 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg3 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww3, iobyxmoadgVar12.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar13 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar13.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar13.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar13.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar13.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar13.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar3 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            int i113 = (i16 >> 6) & 14;
            yggfygwlhe(promoCollectionItem, draadjrbmkVarBtonecajqb, i113);
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar14 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar14, w0.nufgyqmvbu.lqeggnwhkg(f16)), draadjrbmkVarBtonecajqb, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow5 = vdvldrhtssVar3.zoijcleaow(esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar14, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f16), 0.0f, 2, null), iobyxmoadgVar12.lqeggnwhkg());
            String name3 = promoCollectionItem.getName();
            n nVarOjitshcjhn3 = y50.ppxfxbqfkf.zoijcleaow(zVar3, draadjrbmkVarBtonecajqb, i112).zoijcleaow().ojitshcjhn();
            long jIwizpuwonk3 = y50.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i112).iwizpuwonk();
            v0.jyumaefscl.iobyxmoadg iobyxmoadgVar15 = v0.jyumaefscl.f114986iobyxmoadg;
            int iZoijcleaow3 = iobyxmoadgVar15.zoijcleaow();
            v0.btonecajqb.iobyxmoadg iobyxmoadgVar16 = v0.btonecajqb.f114934zoijcleaow;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar3;
            w6.btonecajqb(name3, wkgbmnqykcVarZoijcleaow5, jIwizpuwonk3, 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(iobyxmoadgVar16.iobyxmoadg()), 0L, iZoijcleaow3, false, 1, 0, null, nVarOjitshcjhn3, draadjrbmkVarBtonecajqb, 0, 3120, 54776);
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar14, w0.nufgyqmvbu.lqeggnwhkg(f16)), draadjrbmkVarBtonecajqb, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow6 = vdvldrhtssVar3.zoijcleaow(esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar14, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg((float) 2.5d), 0.0f, 2, null), iobyxmoadgVar12.lqeggnwhkg());
            if (kcexrzcfyt.zfvoamnweg(promoCollectionItem.draadjrbmk())) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            w6.btonecajqb(promoCollectionItem.draadjrbmk(), e.iobyxmoadg.iobyxmoadg(wkgbmnqykcVarZoijcleaow6, f13), y50.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i112).cqumvgiudr(), 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(iobyxmoadgVar16.iobyxmoadg()), 0L, iobyxmoadgVar15.zoijcleaow(), false, 1, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar3, draadjrbmkVarBtonecajqb, i112).zoijcleaow().wkgbmnqykc(), draadjrbmkVarBtonecajqb, 0, 3120, 54776);
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar14, w0.nufgyqmvbu.lqeggnwhkg(16)), draadjrbmkVarBtonecajqb, 6);
            vdvldrhtss(promoCollectionItem, colorsUiModel, draadjrbmkVar, draadjrbmkVarBtonecajqb, (i16 & 112) | i113 | ((i16 >> 3) & 896));
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar7;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar8 = wkgbmnqykcVar2;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: x62.rgvfuqvkyq
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return oxmwwwfdhm.rgvfuqvkyq(z13, colorsUiModel, promoCollectionItem, draadjrbmkVar, wkgbmnqykcVar8, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void cdpycssgdh(final boolean z13, final String str, final oipsdeybqn oipsdeybqnVar, final tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(430149019);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(oipsdeybqnVar) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(430149019, i14, -1, "ru.myspar.specialbanner.impl.presentation.promo_collection.compose.TitleWithBtnMore (SpecialBannerPromoCollectionCompose.kt:273)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar2, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
            boolean z14 = !z13;
            draadjrbmkVarBtonecajqb.sopmlzcsov(64468126);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar3 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar3.iobyxmoadg()) {
                objYadqdtsiqt = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            metgxyhuhe.draadjrbmk draadjrbmkVar2 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tzroggbefp tzroggbefpVarNufgyqmvbu = k2.nufgyqmvbu(true, 0.0f, 0L, 6, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(64471954);
            boolean z15 = (i14 & 7168) == 2048;
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15 || objYadqdtsiqt2 == iobyxmoadgVar3.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: x62.draadjrbmk
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return oxmwwwfdhm.yadqdtsiqt(iobyxmoadgVar);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarRgvfuqvkyq, draadjrbmkVar2, tzroggbefpVarNufgyqmvbu, z14, null, null, (tg.iobyxmoadg) objYadqdtsiqt2, 24, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww(), draadjrbmkVarBtonecajqb, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar4 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar4.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar4.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar4.wkgbmnqykc());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = tbqsvytpvh.zoijcleaow(roivzttewh.f26469iobyxmoadg, iobyxmoadgVar2, 1.0f, false, 2, null);
            z zVar = z.f44180iobyxmoadg;
            int i15 = z.f44181zoijcleaow;
            n nVarGxszxtbevo = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i15).gxszxtbevo();
            draadjrbmkVarBtonecajqb.sopmlzcsov(2059835470);
            long jYadqdtsiqt = oipsdeybqnVar == null ? y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).yadqdtsiqt() : oipsdeybqnVar.iwizpuwonk();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            w6.btonecajqb(str, wkgbmnqykcVarZoijcleaow, jYadqdtsiqt, 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, nVarGxszxtbevo, draadjrbmkVarBtonecajqb, (i14 >> 3) & 14, 3120, 55288);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarAgtfadlqog = esjtqupxsv.agtfadlqog(cdpycssgdh.vdvldrhtss(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(32)), w0.nufgyqmvbu.lqeggnwhkg(4));
            l.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_arrow_right_grey, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(2059847726);
            long jYadqdtsiqt2 = oipsdeybqnVar == null ? y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i15).yadqdtsiqt() : oipsdeybqnVar.iwizpuwonk();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            t.ppxfxbqfkf(ppxfxbqfkfVarPpxfxbqfkf, null, wkgbmnqykcVarAgtfadlqog, jYadqdtsiqt2, draadjrbmkVarBtonecajqb, 432, 0);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: x62.wflxmlrfwp
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return oxmwwwfdhm.iozdgvuglv(z13, str, oipsdeybqnVar, iobyxmoadgVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cqumvgiudr(z62.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, jpowsppfya LazyRow) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(LazyRow, "$this$LazyRow");
        List listNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu();
        LazyRow.nufgyqmvbu(listNufgyqmvbu.size(), new wkgbmnqykc(new tg.draadjrbmk() { // from class: x62.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return oxmwwwfdhm.esjtqupxsv((PromoCollectionItem) obj);
            }
        }, listNufgyqmvbu), new eablkybsjg(ppxfxbqfkf.f121371zdlpuopuiu, listNufgyqmvbu), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(802480018, true, new gxszxtbevo(listNufgyqmvbu, iobyxmoadgVar, rgvfuqvkyqVar)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object esjtqupxsv(PromoCollectionItem it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.getId();
    }

    private static final long hcddaimhww(ColorsUiModel colorsUiModel, Context context) {
        return bfopjjpdmp.zoijcleaow(colorsUiModel.wypolnanlu(context, ColorsUiModel.iobyxmoadg.ON_PRIMARY));
    }

    private static final Integer hkdspvbjdz(cqumvgiudr cqumvgiudrVar, int i13) {
        Object next;
        Iterator it = cqumvgiudrVar.nufgyqmvbu().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((yfnezrywwk.agtfadlqog) next).getIndex() != i13);
        yfnezrywwk.agtfadlqog agtfadlqogVar = (yfnezrywwk.agtfadlqog) next;
        if (agtfadlqogVar == null) {
            return null;
        }
        return Integer.valueOf((-(((((int) (cqumvgiudrVar.iobyxmoadg() >> 32)) - cqumvgiudrVar.wkgbmnqykc()) - cqumvgiudrVar.zoijcleaow()) - agtfadlqogVar.getSize())) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iozdgvuglv(boolean z13, String str, oipsdeybqn oipsdeybqnVar, tg.iobyxmoadg iobyxmoadgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        cdpycssgdh(z13, str, oipsdeybqnVar, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int istkbnxepw(i1 i1Var) {
        return ((Number) i1Var.getValue()).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0220  */
    /* JADX WARN: Code duplicated, block: B:103:0x0241  */
    /* JADX WARN: Code duplicated, block: B:105:0x024f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0274  */
    /* JADX WARN: Code duplicated, block: B:111:0x027b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0284  */
    /* JADX WARN: Code duplicated, block: B:115:0x0286  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:124:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:128:0x0319  */
    /* JADX WARN: Code duplicated, block: B:131:0x0321  */
    /* JADX WARN: Code duplicated, block: B:133:0x0329  */
    /* JADX WARN: Code duplicated, block: B:136:0x035e  */
    /* JADX WARN: Code duplicated, block: B:139:0x038d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0397  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x0121  */
    /* JADX WARN: Code duplicated, block: B:74:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x012b  */
    /* JADX WARN: Code duplicated, block: B:81:0x013a  */
    /* JADX WARN: Code duplicated, block: B:84:0x018b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0197  */
    /* JADX WARN: Code duplicated, block: B:88:0x019b  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x0210  */
    /* JADX WARN: Code duplicated, block: B:99:0x021c  */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    public static final void iwizpuwonk(final z62.iobyxmoadg model, final tg.rgvfuqvkyq onBtnMoreClick, final tg.rgvfuqvkyq onPromoItemClick, final tg.draadjrbmk onPromoItemScrollComplete, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        mbcevpiqjq mbcevpiqjqVarPpxfxbqfkf;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt;
        i1 i1Var;
        Integer numValueOf;
        boolean z13;
        boolean z14;
        Object objYadqdtsiqt2;
        Integer num;
        ?? r13;
        a.eablkybsjg.iobyxmoadg iobyxmoadgVar;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar;
        androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2;
        int iHashCode2;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2;
        ColorsUiModel colorsUiModelLqeggnwhkg;
        oipsdeybqn oipsdeybqnVarDxjokdxxww;
        boolean z15;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt3;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        boolean zLmojexxdyd2;
        Object objYadqdtsiqt4;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBtnMoreClick, "onBtnMoreClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onPromoItemClick, "onPromoItemClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onPromoItemScrollComplete, "onPromoItemScrollComplete");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(454443957);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onBtnMoreClick) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onPromoItemClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onPromoItemScrollComplete) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 16384 : 8192;
            }
            if ((i15 & 9363) == 9362 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(454443957, i15, -1, "ru.myspar.specialbanner.impl.presentation.promo_collection.compose.SpecialBannerPromoCollectionCompose (SpecialBannerPromoCollectionCompose.kt:83)");
                }
                mbcevpiqjqVarPpxfxbqfkf = sopmlzcsov.ppxfxbqfkf(0, 0, draadjrbmkVarBtonecajqb, 0, 3);
                List listNufgyqmvbu = model.nufgyqmvbu();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1819461194);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(listNufgyqmvbu);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: x62.eablkybsjg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Integer.valueOf(oxmwwwfdhm.zynmafqrjb(model));
                        }
                    });
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                i1Var = (i1) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                numValueOf = Integer.valueOf(istkbnxepw(i1Var));
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1819455069);
                boolean zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1Var) | draadjrbmkVarBtonecajqb.lmojexxdyd(model) | draadjrbmkVarBtonecajqb.ulzqkzuiru(mbcevpiqjqVarPpxfxbqfkf);
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zUlzqkzuiru2;
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (!z14 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    num = numValueOf;
                    r13 = 0;
                    iobyxmoadg iobyxmoadgVar3 = new iobyxmoadg(model, mbcevpiqjqVarPpxfxbqfkf, onPromoItemScrollComplete, i1Var, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(iobyxmoadgVar3);
                    objYadqdtsiqt2 = iobyxmoadgVar3;
                } else {
                    num = numValueOf;
                    r13 = 0;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(num, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, r13);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null);
                iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar.ojitshcjhn(), r13);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, r13));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar4.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar4.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar4.wkgbmnqykc());
                wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu2 = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar2, 0.0f, 1, null);
                czzsidtyhn.eablkybsjg eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
                zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar.dxjokdxxww(), iobyxmoadgVar.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu2);
                iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar4.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar4.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar4.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar4.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar4.wkgbmnqykc());
                czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                boolean zBtonecajqb = model.btonecajqb();
                String strDxjokdxxww = model.dxjokdxxww();
                colorsUiModelLqeggnwhkg = model.lqeggnwhkg();
                if (colorsUiModelLqeggnwhkg != null || !model.gtknphoqwx()) {
                    colorsUiModelLqeggnwhkg = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-421567883);
                if (colorsUiModelLqeggnwhkg == null) {
                    oipsdeybqnVarDxjokdxxww = null;
                } else {
                    oipsdeybqnVarDxjokdxxww = oipsdeybqn.dxjokdxxww(hcddaimhww(colorsUiModelLqeggnwhkg, (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg())));
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-421565185);
                if ((i15 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zLmojexxdyd = z15 | draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: x62.dxjokdxxww
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return oxmwwwfdhm.lereixgezr(onBtnMoreClick, model);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                cdpycssgdh(zBtonecajqb, strDxjokdxxww, oipsdeybqnVarDxjokdxxww, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(27)), draadjrbmkVar2, 6);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu3 = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar2, 0.0f, 1, null);
                ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
                czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq = eablkybsjgVar.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(12));
                draadjrbmkVar2.sopmlzcsov(-421551800);
                zLmojexxdyd2 = draadjrbmkVar2.lmojexxdyd(model) | ((i15 & 896) == 256);
                objYadqdtsiqt4 = draadjrbmkVar2.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: x62.btonecajqb
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return oxmwwwfdhm.cqumvgiudr(model, onPromoItemClick, (jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVar2.stevsuqkhv();
                yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVarNufgyqmvbu3, mbcevpiqjqVarPpxfxbqfkf, ydmasvzmpaVarLqeggnwhkg, false, gxszxtbevoVarRgvfuqvkyq, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVar2, 24966, 488);
                draadjrbmkVar2.cqumvgiudr();
                draadjrbmkVar2.sopmlzcsov(506674325);
                if (model.btonecajqb()) {
                    z1.btonecajqb(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar2, iobyxmoadgVar.eablkybsjg()), y50.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVar2, z.f44181zoijcleaow).btonecajqb(), 0.0f, 0L, 0, draadjrbmkVar2, 0, 28);
                }
                draadjrbmkVar2.stevsuqkhv();
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar5;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: x62.gtknphoqwx
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return oxmwwwfdhm.pmvmpeiblj(model, onBtnMoreClick, onPromoItemClick, onPromoItemScrollComplete, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 9363) == 9362) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(454443957, i15, -1, "ru.myspar.specialbanner.impl.presentation.promo_collection.compose.SpecialBannerPromoCollectionCompose (SpecialBannerPromoCollectionCompose.kt:83)");
            }
            mbcevpiqjqVarPpxfxbqfkf = sopmlzcsov.ppxfxbqfkf(0, 0, draadjrbmkVarBtonecajqb, 0, 3);
            List listNufgyqmvbu2 = model.nufgyqmvbu();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1819461194);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(listNufgyqmvbu2);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: x62.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Integer.valueOf(oxmwwwfdhm.zynmafqrjb(model));
                    }
                });
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: x62.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Integer.valueOf(oxmwwwfdhm.zynmafqrjb(model));
                    }
                });
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            i1Var = (i1) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            numValueOf = Integer.valueOf(istkbnxepw(i1Var));
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1819455069);
            boolean zUlzqkzuiru3 = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1Var) | draadjrbmkVarBtonecajqb.lmojexxdyd(model) | draadjrbmkVarBtonecajqb.ulzqkzuiru(mbcevpiqjqVarPpxfxbqfkf);
            if ((i15 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | zUlzqkzuiru3;
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                num = numValueOf;
                r13 = 0;
                iobyxmoadg iobyxmoadgVar5 = new iobyxmoadg(model, mbcevpiqjqVarPpxfxbqfkf, onPromoItemScrollComplete, i1Var, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(iobyxmoadgVar5);
                objYadqdtsiqt2 = iobyxmoadgVar5;
            } else {
                num = numValueOf;
                r13 = 0;
                iobyxmoadg iobyxmoadgVar6 = new iobyxmoadg(model, mbcevpiqjqVarPpxfxbqfkf, onPromoItemScrollComplete, i1Var, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(iobyxmoadgVar6);
                objYadqdtsiqt2 = iobyxmoadgVar6;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(num, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, r13);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu4 = cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null);
            iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar.ojitshcjhn(), r13);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, r13));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu4);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar7 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar7.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar7.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar7.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar7.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar7.wkgbmnqykc());
            wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu5 = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar2, 0.0f, 1, null);
            czzsidtyhn.eablkybsjg eablkybsjgVar2 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar2.dxjokdxxww(), iobyxmoadgVar.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt4 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg4 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu5);
            iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar7.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar7.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt4, iobyxmoadgVar7.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar7.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg4, iobyxmoadgVar7.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar2 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            boolean zBtonecajqb2 = model.btonecajqb();
            String strDxjokdxxww2 = model.dxjokdxxww();
            colorsUiModelLqeggnwhkg = model.lqeggnwhkg();
            if (colorsUiModelLqeggnwhkg != null) {
                colorsUiModelLqeggnwhkg = null;
            } else {
                colorsUiModelLqeggnwhkg = null;
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-421567883);
            if (colorsUiModelLqeggnwhkg == null) {
                oipsdeybqnVarDxjokdxxww = null;
            } else {
                oipsdeybqnVarDxjokdxxww = oipsdeybqn.dxjokdxxww(hcddaimhww(colorsUiModelLqeggnwhkg, (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg())));
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-421565185);
            if ((i15 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zLmojexxdyd = z15 | draadjrbmkVarBtonecajqb.lmojexxdyd(model);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: x62.dxjokdxxww
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return oxmwwwfdhm.lereixgezr(onBtnMoreClick, model);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: x62.dxjokdxxww
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return oxmwwwfdhm.lereixgezr(onBtnMoreClick, model);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            cdpycssgdh(zBtonecajqb2, strDxjokdxxww2, oipsdeybqnVarDxjokdxxww, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(27)), draadjrbmkVar2, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu6 = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar2, 0.0f, 1, null);
            ydmasvzmpa ydmasvzmpaVarLqeggnwhkg2 = esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq2 = eablkybsjgVar2.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(12));
            draadjrbmkVar2.sopmlzcsov(-421551800);
            zLmojexxdyd2 = draadjrbmkVar2.lmojexxdyd(model) | ((i15 & 896) == 256);
            objYadqdtsiqt4 = draadjrbmkVar2.yadqdtsiqt();
            if (zLmojexxdyd2) {
                objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: x62.btonecajqb
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return oxmwwwfdhm.cqumvgiudr(model, onPromoItemClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
            } else {
                objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: x62.btonecajqb
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return oxmwwwfdhm.cqumvgiudr(model, onPromoItemClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVar2.stevsuqkhv();
            yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVarNufgyqmvbu6, mbcevpiqjqVarPpxfxbqfkf, ydmasvzmpaVarLqeggnwhkg2, false, gxszxtbevoVarRgvfuqvkyq2, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVar2, 24966, 488);
            draadjrbmkVar2.cqumvgiudr();
            draadjrbmkVar2.sopmlzcsov(506674325);
            if (model.btonecajqb()) {
                z1.btonecajqb(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar2, iobyxmoadgVar.eablkybsjg()), y50.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVar2, z.f44181zoijcleaow).btonecajqb(), 0.0f, 0L, 0, draadjrbmkVar2, 0, 28);
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar6;
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(454443957, i15, -1, "ru.myspar.specialbanner.impl.presentation.promo_collection.compose.SpecialBannerPromoCollectionCompose (SpecialBannerPromoCollectionCompose.kt:83)");
            }
            mbcevpiqjqVarPpxfxbqfkf = sopmlzcsov.ppxfxbqfkf(0, 0, draadjrbmkVarBtonecajqb, 0, 3);
            List listNufgyqmvbu3 = model.nufgyqmvbu();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1819461194);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(listNufgyqmvbu3);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: x62.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Integer.valueOf(oxmwwwfdhm.zynmafqrjb(model));
                    }
                });
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: x62.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Integer.valueOf(oxmwwwfdhm.zynmafqrjb(model));
                    }
                });
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            i1Var = (i1) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            numValueOf = Integer.valueOf(istkbnxepw(i1Var));
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1819455069);
            boolean zUlzqkzuiru4 = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1Var) | draadjrbmkVarBtonecajqb.lmojexxdyd(model) | draadjrbmkVarBtonecajqb.ulzqkzuiru(mbcevpiqjqVarPpxfxbqfkf);
            if ((i15 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | zUlzqkzuiru4;
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                num = numValueOf;
                r13 = 0;
                iobyxmoadg iobyxmoadgVar8 = new iobyxmoadg(model, mbcevpiqjqVarPpxfxbqfkf, onPromoItemScrollComplete, i1Var, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(iobyxmoadgVar8);
                objYadqdtsiqt2 = iobyxmoadgVar8;
            } else {
                num = numValueOf;
                r13 = 0;
                iobyxmoadg iobyxmoadgVar9 = new iobyxmoadg(model, mbcevpiqjqVarPpxfxbqfkf, onPromoItemScrollComplete, i1Var, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(iobyxmoadgVar9);
                objYadqdtsiqt2 = iobyxmoadgVar9;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(num, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, r13);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu7 = cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null);
            iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar.ojitshcjhn(), r13);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, r13));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt5 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg5 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu7);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar10 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar10.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar10.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt5, iobyxmoadgVar10.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar10.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg5, iobyxmoadgVar10.wkgbmnqykc());
            wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu8 = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar2, 0.0f, 1, null);
            czzsidtyhn.eablkybsjg eablkybsjgVar3 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg3 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar3.dxjokdxxww(), iobyxmoadgVar.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt6 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg6 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu8);
            iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar10.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar3;
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar10.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt6, iobyxmoadgVar10.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar10.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg6, iobyxmoadgVar10.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar3 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            boolean zBtonecajqb3 = model.btonecajqb();
            String strDxjokdxxww3 = model.dxjokdxxww();
            colorsUiModelLqeggnwhkg = model.lqeggnwhkg();
            if (colorsUiModelLqeggnwhkg != null) {
                colorsUiModelLqeggnwhkg = null;
            } else {
                colorsUiModelLqeggnwhkg = null;
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-421567883);
            if (colorsUiModelLqeggnwhkg == null) {
                oipsdeybqnVarDxjokdxxww = null;
            } else {
                oipsdeybqnVarDxjokdxxww = oipsdeybqn.dxjokdxxww(hcddaimhww(colorsUiModelLqeggnwhkg, (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg())));
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-421565185);
            if ((i15 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zLmojexxdyd = z15 | draadjrbmkVarBtonecajqb.lmojexxdyd(model);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: x62.dxjokdxxww
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return oxmwwwfdhm.lereixgezr(onBtnMoreClick, model);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: x62.dxjokdxxww
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return oxmwwwfdhm.lereixgezr(onBtnMoreClick, model);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            cdpycssgdh(zBtonecajqb3, strDxjokdxxww3, oipsdeybqnVarDxjokdxxww, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            uawqvzlxes.iobyxmoadg(cdpycssgdh.dxjokdxxww(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(27)), draadjrbmkVar2, 6);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu9 = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar2, 0.0f, 1, null);
            ydmasvzmpa ydmasvzmpaVarLqeggnwhkg3 = esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq3 = eablkybsjgVar3.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(12));
            draadjrbmkVar2.sopmlzcsov(-421551800);
            zLmojexxdyd2 = draadjrbmkVar2.lmojexxdyd(model) | ((i15 & 896) == 256);
            objYadqdtsiqt4 = draadjrbmkVar2.yadqdtsiqt();
            if (zLmojexxdyd2) {
                objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: x62.btonecajqb
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return oxmwwwfdhm.cqumvgiudr(model, onPromoItemClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
            } else {
                objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: x62.btonecajqb
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return oxmwwwfdhm.cqumvgiudr(model, onPromoItemClick, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVar2.stevsuqkhv();
            yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVarNufgyqmvbu9, mbcevpiqjqVarPpxfxbqfkf, ydmasvzmpaVarLqeggnwhkg3, false, gxszxtbevoVarRgvfuqvkyq3, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVar2, 24966, 488);
            draadjrbmkVar2.cqumvgiudr();
            draadjrbmkVar2.sopmlzcsov(506674325);
            if (model.btonecajqb()) {
                z1.btonecajqb(wflxmlrfwpVar.wkgbmnqykc(iobyxmoadgVar2, iobyxmoadgVar.eablkybsjg()), y50.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVar2, z.f44181zoijcleaow).btonecajqb(), 0.0f, 0L, 0, draadjrbmkVar2, 0, 28);
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar7;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: x62.gtknphoqwx
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return oxmwwwfdhm.pmvmpeiblj(model, onBtnMoreClick, onPromoItemClick, onPromoItemScrollComplete, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long jpowsppfya(ColorsUiModel colorsUiModel, Context context) {
        return bfopjjpdmp.zoijcleaow(colorsUiModel.wypolnanlu(context, ColorsUiModel.iobyxmoadg.PRIMARY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jyumaefscl(PromoCollectionItem promoCollectionItem, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        yggfygwlhe(promoCollectionItem, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(tg.draadjrbmk draadjrbmkVar, PromoCollectionItem promoCollectionItem) {
        draadjrbmkVar.invoke(promoCollectionItem.getId());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lereixgezr(tg.rgvfuqvkyq rgvfuqvkyqVar, z62.iobyxmoadg iobyxmoadgVar) {
        rgvfuqvkyqVar.invoke(iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.getItemId());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(tg.draadjrbmk draadjrbmkVar, PromoCollectionItem promoCollectionItem) {
        draadjrbmkVar.invoke(promoCollectionItem.getId());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(tg.draadjrbmk draadjrbmkVar, PromoCollectionItem promoCollectionItem) {
        draadjrbmkVar.invoke(promoCollectionItem.getId());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object pkzmftpjix(mbcevpiqjq mbcevpiqjqVar, int i13, lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        Integer numHkdspvbjdz;
        int iIntValue;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i14 = lqeggnwhkgVar.f121367iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f121367iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object obj = lqeggnwhkgVar.f121368jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = lqeggnwhkgVar.f121367iwizpuwonk;
        if (i15 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Integer numHkdspvbjdz2 = hkdspvbjdz(mbcevpiqjqVar.cdpycssgdh(), i13);
            if (numHkdspvbjdz2 != null) {
                int iIntValue2 = numHkdspvbjdz2.intValue();
                lqeggnwhkgVar.f121367iwizpuwonk = 1;
                if (mbcevpiqjqVar.vdvldrhtss(i13, iIntValue2, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            lqeggnwhkgVar.f121370zdlpuopuiu = mbcevpiqjqVar;
            lqeggnwhkgVar.f121369yggfygwlhe = i13;
            lqeggnwhkgVar.f121367iwizpuwonk = 2;
            if (mbcevpiqjq.kegysxyocb(mbcevpiqjqVar, i13, 0, lqeggnwhkgVar, 2, null) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            numHkdspvbjdz = hkdspvbjdz(mbcevpiqjqVar.cdpycssgdh(), i13);
            if (numHkdspvbjdz != null) {
                iIntValue = numHkdspvbjdz.intValue();
                lqeggnwhkgVar.f121370zdlpuopuiu = null;
                lqeggnwhkgVar.f121367iwizpuwonk = 3;
                if (mbcevpiqjqVar.vdvldrhtss(i13, iIntValue, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
        } else {
            if (i15 == 1) {
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i15 == 2) {
                i13 = lqeggnwhkgVar.f121369yggfygwlhe;
                mbcevpiqjqVar = (mbcevpiqjq) lqeggnwhkgVar.f121370zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                numHkdspvbjdz = hkdspvbjdz(mbcevpiqjqVar.cdpycssgdh(), i13);
                if (numHkdspvbjdz != null) {
                    iIntValue = numHkdspvbjdz.intValue();
                    lqeggnwhkgVar.f121370zdlpuopuiu = null;
                    lqeggnwhkgVar.f121367iwizpuwonk = 3;
                    if (mbcevpiqjqVar.vdvldrhtss(i13, iIntValue, lqeggnwhkgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn pmvmpeiblj(z62.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.rgvfuqvkyq rgvfuqvkyqVar2, tg.draadjrbmk draadjrbmkVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        iwizpuwonk(iobyxmoadgVar, rgvfuqvkyqVar, rgvfuqvkyqVar2, draadjrbmkVar, wkgbmnqykcVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(boolean z13, ColorsUiModel colorsUiModel, PromoCollectionItem promoCollectionItem, tg.draadjrbmk draadjrbmkVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        agtfadlqog(z13, colorsUiModel, promoCollectionItem, draadjrbmkVar, wkgbmnqykcVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void vdvldrhtss(final PromoCollectionItem promoCollectionItem, final ColorsUiModel colorsUiModel, final tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13) {
        int i14;
        yggfygwlhe yggfygwlheVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar3;
        yggfygwlhe yggfygwlheVarNufgyqmvbu;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-57564480);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(promoCollectionItem) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(colorsUiModel) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i15 = i14;
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-57564480, i15, -1, "ru.myspar.specialbanner.impl.presentation.promo_collection.compose.PromoItemButton (SpecialBannerPromoCollectionCompose.kt:228)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = cdpycssgdh.zoijcleaow(cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(40), 1, null);
            if (promoCollectionItem.getCurrentStatus() instanceof PromoCollectionItem.Status.Opened) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-904999167);
                String strIstkbnxepw = promoCollectionItem.istkbnxepw();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1553208456);
                if (colorsUiModel == null) {
                    yggfygwlheVarNufgyqmvbu = null;
                } else {
                    long jJpowsppfya = jpowsppfya(colorsUiModel, (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg()));
                    yggfygwlheVarNufgyqmvbu = igdgnonuha.jyumaefscl.f43186iobyxmoadg.nufgyqmvbu(oipsdeybqn.f38945zoijcleaow.gxszxtbevo(), jJpowsppfya, jJpowsppfya, draadjrbmkVarBtonecajqb, (igdgnonuha.jyumaefscl.f43181draadjrbmk << 9) | 6, 0);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1553210896);
                boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(promoCollectionItem) | ((i15 & 896) == 256);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: x62.gxszxtbevo
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return oxmwwwfdhm.oxmwwwfdhm(draadjrbmkVar, promoCollectionItem);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                a50.lqeggnwhkg.wkgbmnqykc(iobyxmoadgVar, strIstkbnxepw, wkgbmnqykcVarZoijcleaow, false, null, yggfygwlheVarNufgyqmvbu, null, null, draadjrbmkVarBtonecajqb, 384, 216);
                draadjrbmkVar3.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-904461224);
                String strIstkbnxepw2 = promoCollectionItem.istkbnxepw();
                boolean z13 = promoCollectionItem.getCurrentStatus() instanceof PromoCollectionItem.Status.ReadyToOpen;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1553189119);
                if (colorsUiModel == null) {
                    yggfygwlheVarIobyxmoadg = null;
                } else {
                    long jJpowsppfya2 = jpowsppfya(colorsUiModel, (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg()));
                    long jHcddaimhww = hcddaimhww(colorsUiModel, (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg()));
                    yggfygwlheVarIobyxmoadg = igdgnonuha.jyumaefscl.f43186iobyxmoadg.iobyxmoadg(jJpowsppfya2, jHcddaimhww, oipsdeybqn.wflxmlrfwp(jJpowsppfya2, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), oipsdeybqn.wflxmlrfwp(jHcddaimhww, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), draadjrbmkVarBtonecajqb, igdgnonuha.jyumaefscl.f43181draadjrbmk << 12, 0);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1553193840);
                boolean zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(promoCollectionItem) | ((i15 & 896) == 256);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: x62.lqeggnwhkg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return oxmwwwfdhm.kcexrzcfyt(draadjrbmkVar, promoCollectionItem);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                tg.iobyxmoadg iobyxmoadgVar2 = (tg.iobyxmoadg) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                a50.wkgbmnqykc.wkgbmnqykc(strIstkbnxepw2, iobyxmoadgVar2, wkgbmnqykcVarZoijcleaow, null, z13, null, yggfygwlheVarIobyxmoadg, false, draadjrbmkVarBtonecajqb, 384, 168);
                draadjrbmkVar3.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: x62.nufgyqmvbu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return oxmwwwfdhm.zdlpuopuiu(promoCollectionItem, colorsUiModel, draadjrbmkVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yadqdtsiqt(tg.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.invoke();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void yggfygwlhe(final PromoCollectionItem promoCollectionItem, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-541318885);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(promoCollectionItem) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-541318885, i14, -1, "ru.myspar.specialbanner.impl.presentation.promo_collection.compose.PromoItemImage (SpecialBannerPromoCollectionCompose.kt:194)");
            }
            com.bumptech.glide.integration.compose.zoijcleaow.zoijcleaow(promoCollectionItem.ojitshcjhn(), e.eablkybsjg.iobyxmoadg(cdpycssgdh.vdvldrhtss(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(180)), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(16))), null, x62.iobyxmoadg.f121344iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, 3072, 4);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: x62.vdvldrhtss
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return oxmwwwfdhm.jyumaefscl(promoCollectionItem, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zdlpuopuiu(PromoCollectionItem promoCollectionItem, ColorsUiModel colorsUiModel, tg.draadjrbmk draadjrbmkVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        vdvldrhtss(promoCollectionItem, colorsUiModel, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zynmafqrjb(z62.iobyxmoadg iobyxmoadgVar) {
        Iterator it = iobyxmoadgVar.nufgyqmvbu().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (((PromoCollectionItem) it.next()).getCurrentStatus() instanceof PromoCollectionItem.Status.ReadyToOpen) {
                return i13;
            }
            i13++;
        }
        return -1;
    }
}
