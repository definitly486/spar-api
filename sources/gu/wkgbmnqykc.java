package gu;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.v0;
import androidx.recyclerview.widget.RecyclerView;
import gg.wwaezpbzkn;
import java.util.List;
import ku.yadqdtsiqt;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof CartProductUiModel);
        }
    }

    static final class ppxfxbqfkf implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f38564cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ boolean f38565cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ boolean f38566esjtqupxsv;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f38567iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f38568istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ boolean f38569iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f38570jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ qt.zoijcleaow f38571lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f38572lmojexxdyd;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ int f38573pmvmpeiblj;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f38574yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ i1 f38575yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f38576zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f38577zynmafqrjb;

        ppxfxbqfkf(ef.iobyxmoadg iobyxmoadgVar, i1 i1Var, boolean z13, boolean z14, boolean z15, boolean z16, qt.zoijcleaow zoijcleaowVar, int i13, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.rgvfuqvkyq rgvfuqvkyqVar2, tg.draadjrbmk draadjrbmkVar2, tg.draadjrbmk draadjrbmkVar3, tg.draadjrbmk draadjrbmkVar4) {
            this.f38576zdlpuopuiu = iobyxmoadgVar;
            this.f38575yggfygwlhe = i1Var;
            this.f38570jyumaefscl = z13;
            this.f38569iwizpuwonk = z14;
            this.f38565cqumvgiudr = z15;
            this.f38566esjtqupxsv = z16;
            this.f38571lereixgezr = zoijcleaowVar;
            this.f38573pmvmpeiblj = i13;
            this.f38577zynmafqrjb = draadjrbmkVar;
            this.f38568istkbnxepw = rgvfuqvkyqVar;
            this.f38564cdpycssgdh = rgvfuqvkyqVar2;
            this.f38574yadqdtsiqt = draadjrbmkVar2;
            this.f38567iozdgvuglv = draadjrbmkVar3;
            this.f38572lmojexxdyd = draadjrbmkVar4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean agtfadlqog(ef.iobyxmoadg iobyxmoadgVar) {
            int bindingAdapterPosition = iobyxmoadgVar.getBindingAdapterPosition();
            RecyclerView.nufgyqmvbu bindingAdapter = iobyxmoadgVar.getBindingAdapter();
            return bindingAdapterPosition == (bindingAdapter != null ? bindingAdapter.getItemCount() : 0) - 1;
        }

        private static final boolean cqumvgiudr(i1 i1Var) {
            return ((Boolean) i1Var.getValue()).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn iwizpuwonk(tg.rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar, ProductCardEvent it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            rgvfuqvkyqVar.invoke(iobyxmoadgVar.eablkybsjg(), it);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn jyumaefscl(tg.rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar, HintUiModel it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            rgvfuqvkyqVar.invoke(it, iobyxmoadgVar.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn kcexrzcfyt(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ojitshcjhn(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn oxmwwwfdhm(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn yggfygwlhe(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn zdlpuopuiu() {
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            wflxmlrfwp((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void wflxmlrfwp(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-58119694, i13, -1, "ru.myspar.common.view.product.compose.list.adapters.productCartCardHorizontalAdapterDelegate.<anonymous>.<anonymous>.<anonymous> (ProductCartCardHorizontalAdapterDelegate.kt:39)");
            }
            int bindingAdapterPosition = this.f38576zdlpuopuiu.getBindingAdapterPosition();
            RecyclerView.nufgyqmvbu bindingAdapter = this.f38576zdlpuopuiu.getBindingAdapter();
            Object objValueOf = bindingAdapter != null ? Integer.valueOf(bindingAdapter.getItemCount()) : null;
            draadjrbmkVar.sopmlzcsov(2076741315);
            boolean zPpxfxbqfkf = draadjrbmkVar.ppxfxbqfkf(bindingAdapterPosition) | draadjrbmkVar.ulzqkzuiru(objValueOf);
            final ef.iobyxmoadg iobyxmoadgVar = this.f38576zdlpuopuiu;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zPpxfxbqfkf || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: gu.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Boolean.valueOf(wkgbmnqykc.ppxfxbqfkf.agtfadlqog(iobyxmoadgVar));
                    }
                });
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            i1 i1Var = (i1) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
            final ef.iobyxmoadg iobyxmoadgVar2 = this.f38576zdlpuopuiu;
            i1 i1Var2 = this.f38575yggfygwlhe;
            boolean z13 = this.f38570jyumaefscl;
            boolean z14 = this.f38569iwizpuwonk;
            boolean z15 = this.f38565cqumvgiudr;
            boolean z16 = this.f38566esjtqupxsv;
            qt.zoijcleaow zoijcleaowVar = this.f38571lereixgezr;
            int i14 = this.f38573pmvmpeiblj;
            final tg.draadjrbmk draadjrbmkVar2 = this.f38577zynmafqrjb;
            final tg.rgvfuqvkyq rgvfuqvkyqVar = this.f38568istkbnxepw;
            final tg.rgvfuqvkyq rgvfuqvkyqVar2 = this.f38564cdpycssgdh;
            final tg.draadjrbmk draadjrbmkVar3 = this.f38574yadqdtsiqt;
            final tg.draadjrbmk draadjrbmkVar4 = this.f38567iozdgvuglv;
            final tg.draadjrbmk draadjrbmkVar5 = this.f38572lmojexxdyd;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVar, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, iobyxmoadgVar3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar4 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
            if (draadjrbmkVar.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar.pkzmftpjix();
            if (draadjrbmkVar.lqeggnwhkg()) {
                draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVar.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar4.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar4.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar4.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            ku.oxmwwwfdhm.zoijcleaow(null, draadjrbmkVar, 0, 1);
            pu.wkgbmnqykc wkgbmnqykcVarZoijcleaow = ou.iobyxmoadg.zoijcleaow((CartProductUiModel) iobyxmoadgVar2.eablkybsjg());
            boolean zBooleanValue = ((Boolean) i1Var2.getValue()).booleanValue();
            draadjrbmkVar.sopmlzcsov(216308139);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(draadjrbmkVar2) | draadjrbmkVar.lmojexxdyd(iobyxmoadgVar2);
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: gu.gxszxtbevo
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wkgbmnqykc.ppxfxbqfkf.yggfygwlhe(draadjrbmkVar2, iobyxmoadgVar2);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            tg.iobyxmoadg iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt2;
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.sopmlzcsov(216310124);
            boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(rgvfuqvkyqVar) | draadjrbmkVar.lmojexxdyd(iobyxmoadgVar2);
            Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: gu.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return wkgbmnqykc.ppxfxbqfkf.jyumaefscl(rgvfuqvkyqVar, iobyxmoadgVar2, (HintUiModel) obj);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
            }
            tg.draadjrbmk draadjrbmkVar6 = (tg.draadjrbmk) objYadqdtsiqt3;
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.sopmlzcsov(216314895);
            boolean zUlzqkzuiru3 = draadjrbmkVar.ulzqkzuiru(rgvfuqvkyqVar2) | draadjrbmkVar.lmojexxdyd(iobyxmoadgVar2);
            Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru3 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: gu.nufgyqmvbu
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return wkgbmnqykc.ppxfxbqfkf.iwizpuwonk(rgvfuqvkyqVar2, iobyxmoadgVar2, (ProductCardEvent) obj);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
            }
            tg.draadjrbmk draadjrbmkVar7 = (tg.draadjrbmk) objYadqdtsiqt4;
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.sopmlzcsov(216312437);
            boolean zUlzqkzuiru4 = draadjrbmkVar.ulzqkzuiru(draadjrbmkVar3) | draadjrbmkVar.lmojexxdyd(iobyxmoadgVar2);
            Object objYadqdtsiqt5 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru4 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: gu.dxjokdxxww
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wkgbmnqykc.ppxfxbqfkf.ojitshcjhn(draadjrbmkVar3, iobyxmoadgVar2);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt5);
            }
            tg.iobyxmoadg iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt5;
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.sopmlzcsov(216320714);
            boolean zUlzqkzuiru5 = draadjrbmkVar.ulzqkzuiru(draadjrbmkVar4) | draadjrbmkVar.lmojexxdyd(iobyxmoadgVar2);
            Object objYadqdtsiqt6 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru5 || objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: gu.btonecajqb
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wkgbmnqykc.ppxfxbqfkf.oxmwwwfdhm(draadjrbmkVar4, iobyxmoadgVar2);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt6);
            }
            tg.iobyxmoadg iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt6;
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.sopmlzcsov(216317137);
            boolean zUlzqkzuiru6 = draadjrbmkVar.ulzqkzuiru(draadjrbmkVar5) | draadjrbmkVar.lmojexxdyd(iobyxmoadgVar2);
            Object objYadqdtsiqt7 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru6 || objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: gu.gtknphoqwx
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wkgbmnqykc.ppxfxbqfkf.kcexrzcfyt(draadjrbmkVar5, iobyxmoadgVar2);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt7);
            }
            tg.iobyxmoadg iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt7;
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.sopmlzcsov(216319380);
            Object objYadqdtsiqt8 = draadjrbmkVar.yadqdtsiqt();
            if (objYadqdtsiqt8 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt8 = new tg.iobyxmoadg() { // from class: gu.draadjrbmk
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wkgbmnqykc.ppxfxbqfkf.zdlpuopuiu();
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt8);
            }
            draadjrbmkVar.stevsuqkhv();
            yadqdtsiqt.dxjokdxxww(wkgbmnqykcVarZoijcleaow, z13, z14, z15, false, false, z16, zoijcleaowVar, null, zBooleanValue, i14, null, iobyxmoadgVar5, draadjrbmkVar6, draadjrbmkVar7, iobyxmoadgVar6, iobyxmoadgVar7, iobyxmoadgVar8, (tg.iobyxmoadg) objYadqdtsiqt8, draadjrbmkVar, 221184, 100663296, 2304);
            draadjrbmkVar.sopmlzcsov(216322691);
            if (cqumvgiudr(i1Var)) {
                ku.oxmwwwfdhm.zoijcleaow(null, draadjrbmkVar, 0, 1);
            }
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f38578zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b60.iobyxmoadg gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        b60.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = b60.iobyxmoadg.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        return iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final i1 i1Var, final boolean z13, final boolean z14, final boolean z15, final boolean z16, final qt.zoijcleaow zoijcleaowVar, final int i13, final tg.draadjrbmk draadjrbmkVar, final tg.rgvfuqvkyq rgvfuqvkyqVar, final tg.rgvfuqvkyq rgvfuqvkyqVar2, final tg.draadjrbmk draadjrbmkVar2, final tg.draadjrbmk draadjrbmkVar3, final tg.draadjrbmk draadjrbmkVar4, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: gu.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.nufgyqmvbu(adapterDelegateViewBinding, i1Var, z13, z14, z15, z16, zoijcleaowVar, i13, draadjrbmkVar, rgvfuqvkyqVar, rgvfuqvkyqVar2, draadjrbmkVar2, draadjrbmkVar3, draadjrbmkVar4, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar, i1 i1Var, boolean z13, boolean z14, boolean z15, boolean z16, qt.zoijcleaow zoijcleaowVar, int i13, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.rgvfuqvkyq rgvfuqvkyqVar2, tg.draadjrbmk draadjrbmkVar2, tg.draadjrbmk draadjrbmkVar3, tg.draadjrbmk draadjrbmkVar4, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ((b60.iobyxmoadg) iobyxmoadgVar.ppxfxbqfkf()).f15357zoijcleaow.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-58119694, true, new ppxfxbqfkf(iobyxmoadgVar, i1Var, z13, z14, z15, z16, zoijcleaowVar, i13, draadjrbmkVar, rgvfuqvkyqVar, rgvfuqvkyqVar2, draadjrbmkVar2, draadjrbmkVar3, draadjrbmkVar4)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.draadjrbmk onProductClicked, final tg.rgvfuqvkyq onHintClicked, final tg.draadjrbmk onAddToPurchaseListClicked, final tg.draadjrbmk onAddToFavoriteClicked, final tg.draadjrbmk onRemoveClicked, final tg.rgvfuqvkyq onProductChanged, final boolean z13, final boolean z14, final boolean z15, final i1 isRemoveLoading, final boolean z16, final int i13, final qt.zoijcleaow counterStyle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onHintClicked, "onHintClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAddToPurchaseListClicked, "onAddToPurchaseListClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAddToFavoriteClicked, "onAddToFavoriteClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onRemoveClicked, "onRemoveClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductChanged, "onProductChanged");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isRemoveLoading, "isRemoveLoading");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(counterStyle, "counterStyle");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: gu.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: gu.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.lqeggnwhkg(isRemoveLoading, z13, z15, z14, z16, counterStyle, i13, onProductClicked, onHintClicked, onProductChanged, onAddToPurchaseListClicked, onRemoveClicked, onAddToFavoriteClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f38578zdlpuopuiu);
    }
}
