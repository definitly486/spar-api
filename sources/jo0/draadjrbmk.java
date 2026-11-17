package jo0;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import wo0.agtfadlqog;
import wo0.ojitshcjhn;
import yfnezrywwk.jpowsppfya;
import yfnezrywwk.mbcevpiqjq;
import yfnezrywwk.sopmlzcsov;

/* JADX INFO: loaded from: classes5.dex */
public abstract class draadjrbmk {

    public static final class dxjokdxxww implements oxmwwwfdhm {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51841yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f51842zdlpuopuiu;

        public dxjokdxxww(List list, tg.draadjrbmk draadjrbmkVar) {
            this.f51842zdlpuopuiu = list;
            this.f51841yggfygwlhe = draadjrbmkVar;
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
            wo0.gtknphoqwx gtknphoqwxVar = (wo0.gtknphoqwx) this.f51842zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(-658500489);
            if (gtknphoqwxVar instanceof ojitshcjhn) {
                draadjrbmkVar.sopmlzcsov(-713978795);
                ojitshcjhn ojitshcjhnVar = (ojitshcjhn) gtknphoqwxVar;
                draadjrbmkVar.sopmlzcsov(-713976333);
                boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f51841yggfygwlhe) | draadjrbmkVar.ulzqkzuiru(gtknphoqwxVar);
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new zoijcleaow(this.f51841yggfygwlhe, gtknphoqwxVar);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                oo0.lqeggnwhkg.wkgbmnqykc(null, ojitshcjhnVar, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, 0, 1);
                draadjrbmkVar.stevsuqkhv();
            } else if (zdlpuopuiu.eablkybsjg(gtknphoqwxVar, wo0.ppxfxbqfkf.f120330iobyxmoadg)) {
                draadjrbmkVar.sopmlzcsov(-713973308);
                draadjrbmkVar.sopmlzcsov(-713971280);
                boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(this.f51841yggfygwlhe);
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new ppxfxbqfkf(this.f51841yggfygwlhe);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar.stevsuqkhv();
                jo0.gxszxtbevo.gxszxtbevo(null, (tg.iobyxmoadg) objYadqdtsiqt2, draadjrbmkVar, 0, 1);
                draadjrbmkVar.stevsuqkhv();
            } else if (gtknphoqwxVar instanceof wo0.btonecajqb) {
                draadjrbmkVar.sopmlzcsov(-713966503);
                wo0.btonecajqb btonecajqbVar = (wo0.btonecajqb) gtknphoqwxVar;
                draadjrbmkVar.sopmlzcsov(-713964343);
                boolean zUlzqkzuiru3 = draadjrbmkVar.ulzqkzuiru(gtknphoqwxVar) | draadjrbmkVar.ulzqkzuiru(this.f51841yggfygwlhe);
                Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new wkgbmnqykc(gtknphoqwxVar, this.f51841yggfygwlhe);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
                }
                tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) objYadqdtsiqt3;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(-713947950);
                boolean zUlzqkzuiru4 = draadjrbmkVar.ulzqkzuiru(gtknphoqwxVar) | draadjrbmkVar.ulzqkzuiru(this.f51841yggfygwlhe);
                Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru4 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new eablkybsjg(gtknphoqwxVar, this.f51841yggfygwlhe);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
                }
                rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) objYadqdtsiqt4;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(-713932204);
                boolean zUlzqkzuiru5 = draadjrbmkVar.ulzqkzuiru(gtknphoqwxVar) | draadjrbmkVar.ulzqkzuiru(this.f51841yggfygwlhe);
                Object objYadqdtsiqt5 = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru5 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new gxszxtbevo(gtknphoqwxVar, this.f51841yggfygwlhe);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt5);
                }
                draadjrbmkVar.stevsuqkhv();
                uo0.eablkybsjg.eablkybsjg(btonecajqbVar, draadjrbmkVar2, rgvfuqvkyqVar, (rgvfuqvkyq) objYadqdtsiqt5, draadjrbmkVar, 0);
                draadjrbmkVar.stevsuqkhv();
            } else {
                draadjrbmkVar.sopmlzcsov(-713917742);
                draadjrbmkVar.stevsuqkhv();
            }
            draadjrbmkVar.stevsuqkhv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class eablkybsjg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51843yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ wo0.gtknphoqwx f51844zdlpuopuiu;

        eablkybsjg(wo0.gtknphoqwx gtknphoqwxVar, tg.draadjrbmk draadjrbmkVar) {
            this.f51844zdlpuopuiu = gtknphoqwxVar;
            this.f51843yggfygwlhe = draadjrbmkVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((HintUiModel) obj, (ProductUiModel) obj2);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(HintUiModel hint, ProductUiModel product) {
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(product, "product");
            this.f51843yggfygwlhe.invoke(new ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.draadjrbmk(hint, new AnalyticElement.ProductItemElement(product.getArticle(), product.getName()), new AnalyticsLocation.ItemFeed(null, ((wo0.btonecajqb) this.f51844zdlpuopuiu).zoijcleaow(), 1, null)));
        }
    }

    static final class gxszxtbevo implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51845yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ wo0.gtknphoqwx f51846zdlpuopuiu;

        gxszxtbevo(wo0.gtknphoqwx gtknphoqwxVar, tg.draadjrbmk draadjrbmkVar) {
            this.f51846zdlpuopuiu = gtknphoqwxVar;
            this.f51845yggfygwlhe = draadjrbmkVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((String) obj, (ProductCardEvent) obj2);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(String productId, ProductCardEvent productCardEvent) {
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
            this.f51845yggfygwlhe.invoke(new ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.kcexrzcfyt(new go0.ppxfxbqfkf(productId, productCardEvent, ((wo0.btonecajqb) this.f51846zdlpuopuiu).zoijcleaow())));
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f51847jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList f51848yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f51849zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(SnapshotStateList snapshotStateList, agtfadlqog agtfadlqogVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f51848yggfygwlhe = snapshotStateList;
            this.f51847jyumaefscl = agtfadlqogVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object kcexrzcfyt(wo0.gtknphoqwx gtknphoqwxVar) {
            return gtknphoqwxVar.getId();
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f51848yggfygwlhe, this.f51847jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f51849zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                SnapshotStateList snapshotStateList = this.f51848yggfygwlhe;
                List listIobyxmoadg = this.f51847jyumaefscl.iobyxmoadg();
                tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: jo0.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return draadjrbmk.iobyxmoadg.kcexrzcfyt((wo0.gtknphoqwx) obj2);
                    }
                };
                this.f51849zdlpuopuiu = 1;
                if (f31.zoijcleaow.eablkybsjg(snapshotStateList, listIobyxmoadg, 0L, draadjrbmkVar, this, 2, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class lqeggnwhkg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f51850yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51851zdlpuopuiu;

        public lqeggnwhkg(tg.draadjrbmk draadjrbmkVar, List list) {
            this.f51851zdlpuopuiu = draadjrbmkVar;
            this.f51850yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f51851zdlpuopuiu.invoke(this.f51850yggfygwlhe.get(i13));
        }
    }

    public static final class nufgyqmvbu implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f51852yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51853zdlpuopuiu;

        public nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, List list) {
            this.f51853zdlpuopuiu = draadjrbmkVar;
            this.f51852yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f51853zdlpuopuiu.invoke(this.f51852yggfygwlhe.get(i13));
        }
    }

    static final class ppxfxbqfkf implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51854zdlpuopuiu;

        ppxfxbqfkf(tg.draadjrbmk draadjrbmkVar) {
            this.f51854zdlpuopuiu = draadjrbmkVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f51854zdlpuopuiu.invoke(ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.gxszxtbevo.f92996iobyxmoadg);
        }
    }

    static final class wkgbmnqykc implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51855yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ wo0.gtknphoqwx f51856zdlpuopuiu;

        wkgbmnqykc(wo0.gtknphoqwx gtknphoqwxVar, tg.draadjrbmk draadjrbmkVar) {
            this.f51856zdlpuopuiu = gtknphoqwxVar;
            this.f51855yggfygwlhe = draadjrbmkVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ProductUiModel) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ProductUiModel product) {
            zdlpuopuiu.btonecajqb(product, "product");
            this.f51855yggfygwlhe.invoke(new ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.rgvfuqvkyq(product.getId(), new AnalyticElement.ProductItemElement(product.getArticle(), product.getName()), new AnalyticsLocation.ItemFeed(null, ((wo0.btonecajqb) this.f51856zdlpuopuiu).zoijcleaow(), 1, null)));
        }
    }

    static final class zoijcleaow implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wo0.gtknphoqwx f51857yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f51858zdlpuopuiu;

        zoijcleaow(tg.draadjrbmk draadjrbmkVar, wo0.gtknphoqwx gtknphoqwxVar) {
            this.f51858zdlpuopuiu = draadjrbmkVar;
            this.f51857yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f51858zdlpuopuiu.invoke(new ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow.gtknphoqwx((ojitshcjhn) this.f51857yggfygwlhe));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, agtfadlqog agtfadlqogVar, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        eablkybsjg(wkgbmnqykcVar, agtfadlqogVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final agtfadlqog model, final tg.draadjrbmk dispatch, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(dispatch, "dispatch");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1758436070);
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
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(dispatch) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1758436070, i15, -1, "ru.myspar.proloyalty.cart.impl.presentation.compose.cartempty.CartEmptyContent (CartEmptyContent.kt:41)");
            }
            mbcevpiqjq mbcevpiqjqVarPpxfxbqfkf = sopmlzcsov.ppxfxbqfkf(0, 0, draadjrbmkVarBtonecajqb, 0, 3);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-2021867232);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = v0.vdvldrhtss(f31.zoijcleaow.lqeggnwhkg(model.iobyxmoadg()));
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            List listIobyxmoadg = model.iobyxmoadg();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-2021863566);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = new iobyxmoadg(snapshotStateList, model, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(listIobyxmoadg, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = w31.nufgyqmvbu.ojitshcjhn(esjtqupxsv.rgvfuqvkyq(wkgbmnqykcVar3, w0.nufgyqmvbu.lqeggnwhkg(4), 0.0f, 2, null), "ROOT_CART_LIST", null, null, false, 14, null);
            float f13 = 8;
            ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = esjtqupxsv.lqeggnwhkg(0.0f, w0.nufgyqmvbu.lqeggnwhkg(f13), 1, null);
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(f13));
            draadjrbmkVarBtonecajqb.sopmlzcsov(-2021847850);
            boolean zLmojexxdyd2 = ((i15 & 896) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(model);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: jo0.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return draadjrbmk.gxszxtbevo(model, dispatch, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
            yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVarOjitshcjhn, mbcevpiqjqVarPpxfxbqfkf, ydmasvzmpaVarLqeggnwhkg, false, gxszxtbevoVarRgvfuqvkyq, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 24960, 488);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar4;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar2;
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: jo0.nufgyqmvbu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return draadjrbmk.dxjokdxxww(wkgbmnqykcVar5, model, dispatch, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(agtfadlqog agtfadlqogVar, tg.draadjrbmk draadjrbmkVar, jpowsppfya LazyColumn) {
        zdlpuopuiu.btonecajqb(LazyColumn, "$this$LazyColumn");
        List listIobyxmoadg = agtfadlqogVar.iobyxmoadg();
        LazyColumn.nufgyqmvbu(listIobyxmoadg.size(), new lqeggnwhkg(new tg.draadjrbmk() { // from class: jo0.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.lqeggnwhkg((wo0.gtknphoqwx) obj);
            }
        }, listIobyxmoadg), new nufgyqmvbu(new tg.draadjrbmk() { // from class: jo0.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.nufgyqmvbu((wo0.gtknphoqwx) obj);
            }
        }, listIobyxmoadg), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(802480018, true, new dxjokdxxww(listIobyxmoadg, draadjrbmkVar)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object lqeggnwhkg(wo0.gtknphoqwx it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object nufgyqmvbu(wo0.gtknphoqwx it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return it.getType();
    }
}
