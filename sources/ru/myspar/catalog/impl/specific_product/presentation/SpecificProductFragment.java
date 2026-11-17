package ru.myspar.catalog.impl.specific_product.presentation;

import android.content.Context;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.lmojexxdyd;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import ezmngbhpjk.nufgyqmvbu;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.catalog.impl.specific_product.presentation.SpecificProductFragment;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.base.api.bottomsheet.GenericTextBottomSheetDialogFragment;
import ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.BuildYourComboDialogFragment;
import ru.myspar.rate.rate_product.api.model.RateProductArgs;
import ru.myspar.rate.rate_product.api.model.RateType;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tr.metgxyhuhe;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 :2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001;B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001b\u00109\u001a\u0002048TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lru/myspar/catalog/impl/specific_product/presentation/SpecificProductFragment;", "Lru/myspar/core/base/mvi/fragment/BaseComposeMviFragment;", "Lru/myspar/catalog/impl/specific_product/presentation/zoijcleaow;", "Lru/myspar/catalog/impl/specific_product/presentation/iobyxmoadg;", "Lru/myspar/catalog/impl/specific_product/presentation/wkgbmnqykc;", "<init>", "()V", "Lgg/wwaezpbzkn;", "onStart", "onStop", "", "isHidden", "onHiddenChanged", "(Z)V", "uiLabel", "ribwqtqdhb", "(Lru/myspar/catalog/impl/specific_product/presentation/wkgbmnqykc;)V", CommonUrlParts.MODEL, "tzroggbefp", "(Lru/myspar/catalog/impl/specific_product/presentation/zoijcleaow;Landroidx/compose/runtime/draadjrbmk;I)V", "Llx1/iobyxmoadg;", "esjtqupxsv", "Llx1/iobyxmoadg;", "sopmlzcsov", "()Llx1/iobyxmoadg;", "setPurchasesFeatureApi", "(Llx1/iobyxmoadg;)V", "purchasesFeatureApi", "Lk02/iobyxmoadg;", "lereixgezr", "Lk02/iobyxmoadg;", "crxdokpmqz", "()Lk02/iobyxmoadg;", "setRateProductFeatureApi", "(Lk02/iobyxmoadg;)V", "rateProductFeatureApi", "Lf70/iobyxmoadg;", "pmvmpeiblj", "Lf70/iobyxmoadg;", "ulzqkzuiru", "()Lf70/iobyxmoadg;", "setDialogManager", "(Lf70/iobyxmoadg;)V", "dialogManager", "Lq40/iobyxmoadg;", "zynmafqrjb", "Lq40/iobyxmoadg;", "jlmebxxoox", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/catalog/impl/specific_product/presentation/ppxfxbqfkf;", "istkbnxepw", "Lgg/gtknphoqwx;", "ntlheqmsrt", "()Lru/myspar/catalog/impl/specific_product/presentation/ppxfxbqfkf;", "binder", "cdpycssgdh", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpecificProductFragment extends Hilt_SpecificProductFragment<ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow, iobyxmoadg, ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f85910yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public lx1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public k02.iobyxmoadg rateProductFeatureApi;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public f70.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f85916zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f85916zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f85916zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f85917yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f85918zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f85918zdlpuopuiu = iobyxmoadgVar;
            this.f85917yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f85918zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f85917yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.presentation.SpecificProductFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SpecificProductFragment iobyxmoadg(ProductPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            return (SpecificProductFragment) b40.iobyxmoadg.zoijcleaow(new SpecificProductFragment(), payload, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f85919yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f85920zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f85920zdlpuopuiu = fragment;
            this.f85919yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f85919yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f85920zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f85921zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f85921zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f85921zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f85922zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f85922zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f85922zdlpuopuiu.invoke();
        }
    }

    static final class zoijcleaow implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ SpecificProductFragment f85923yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow f85924zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends vdvldrhtss implements draadjrbmk {
            iobyxmoadg(Object obj) {
                super(1, obj, SpecificProductFragment.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((ru.myspar.catalog.impl.specific_product.presentation.iobyxmoadg) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(ru.myspar.catalog.impl.specific_product.presentation.iobyxmoadg p13) {
                zdlpuopuiu.btonecajqb(p13, "p0");
                ((SpecificProductFragment) this.receiver).ylkuphrtab(p13);
            }
        }

        zoijcleaow(ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow zoijcleaowVar, SpecificProductFragment specificProductFragment) {
            this.f85924zdlpuopuiu = zoijcleaowVar;
            this.f85923yggfygwlhe = specificProductFragment;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1103861921, i13, -1, "ru.myspar.catalog.impl.specific_product.presentation.SpecificProductFragment.Render.<anonymous> (SpecificProductFragment.kt:155)");
            }
            ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow zoijcleaowVar = this.f85924zdlpuopuiu;
            SpecificProductFragment specificProductFragment = this.f85923yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(390457816);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(specificProductFragment);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(specificProductFragment);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            metgxyhuhe.zoijcleaow(zoijcleaowVar, (draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVar, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public SpecificProductFragment() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.catalog.impl.specific_product.presentation.ppxfxbqfkf.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jhduphickx(SpecificProductFragment specificProductFragment, ComboSetProduct productFirst, ComboSetProduct productSecond) {
        zdlpuopuiu.btonecajqb(productFirst, "productFirst");
        zdlpuopuiu.btonecajqb(productSecond, "productSecond");
        specificProductFragment.ylkuphrtab(new iobyxmoadg.ppxfxbqfkf(productFirst, productSecond));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn mbcevpiqjq(SpecificProductFragment specificProductFragment, ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow zoijcleaowVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        specificProductFragment.wwaezpbzkn(zoijcleaowVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vipkmwdibw(SpecificProductFragment specificProductFragment) {
        r40.iobyxmoadg.eablkybsjg(specificProductFragment.jlmebxxoox(), pm.dxjokdxxww.purchases_list_product_added_to_the_list);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final k02.iobyxmoadg crxdokpmqz() {
        k02.iobyxmoadg iobyxmoadgVar = this.rateProductFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("rateProductFeatureApi");
        return null;
    }

    public final q40.iobyxmoadg jlmebxxoox() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public ru.myspar.catalog.impl.specific_product.presentation.ppxfxbqfkf pkzmftpjix() {
        return (ru.myspar.catalog.impl.specific_product.presentation.ppxfxbqfkf) this.binder.getValue();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        ylkuphrtab(new iobyxmoadg.nufgyqmvbu(isHidden));
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ylkuphrtab(new iobyxmoadg.jyumaefscl(true));
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        ylkuphrtab(new iobyxmoadg.jyumaefscl(false));
        super.onStop();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void hcddaimhww(ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.zoijcleaow) {
            BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragmentNufgyqmvbu = sopmlzcsov().nufgyqmvbu(((ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.zoijcleaow) uiLabel).iobyxmoadg(), new tg.iobyxmoadg() { // from class: sr.eablkybsjg
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SpecificProductFragment.vipkmwdibw(this.f108430zdlpuopuiu);
                }
            });
            FragmentManager childFragmentManager = getChildFragmentManager();
            zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
            baseComposeMviBottomSheetDialogFragmentNufgyqmvbu.ntlheqmsrt(childFragmentManager);
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.nufgyqmvbu) {
            ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.nufgyqmvbu nufgyqmvbuVar = (ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.nufgyqmvbu) uiLabel;
            f70.zoijcleaow.ppxfxbqfkf(k02.iobyxmoadg.zoijcleaow(crxdokpmqz(), new RateProductArgs(new RateType.Single("product_card", nufgyqmvbuVar.iobyxmoadg(), nufgyqmvbuVar.zoijcleaow(), null, 8, null)), null, 2, null), ulzqkzuiru(), g70.eablkybsjg.iobyxmoadg("SPECIFIC_PRODUCT_SCREEN_KEY"));
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.dxjokdxxww) {
            ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.dxjokdxxww dxjokdxxwwVar = (ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.dxjokdxxww) uiLabel;
            f70.zoijcleaow.ppxfxbqfkf(GenericTextBottomSheetDialogFragment.INSTANCE.iobyxmoadg(new GenericTextBottomSheetDialogFragment.GenericTextBottomSheetArgs(dxjokdxxwwVar.iobyxmoadg().getHeader(), dxjokdxxwwVar.iobyxmoadg().getDescription())), ulzqkzuiru(), g70.eablkybsjg.iobyxmoadg("SPECIFIC_PRODUCT_SCREEN_KEY"));
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.lqeggnwhkg) {
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            f70.zoijcleaow.zoijcleaow(new xa0.gxszxtbevo(oxmwwwfdhmVarRequireActivity, ((ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.lqeggnwhkg) uiLabel).iobyxmoadg()), ulzqkzuiru(), g70.eablkybsjg.iobyxmoadg("SPECIFIC_PRODUCT_SCREEN_KEY"));
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.iobyxmoadg) {
            f70.zoijcleaow.ppxfxbqfkf(BuildYourComboDialogFragment.INSTANCE.iobyxmoadg(((ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg()).bfopjjpdmp(new rgvfuqvkyq() { // from class: sr.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return SpecificProductFragment.jhduphickx(this.f108431zdlpuopuiu, (ComboSetProduct) obj, (ComboSetProduct) obj2);
                }
            }), ulzqkzuiru(), g70.eablkybsjg.iobyxmoadg("SPECIFIC_PRODUCT_SCREEN_KEY"));
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.ppxfxbqfkf) {
            lmojexxdyd(((ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.C1972wkgbmnqykc) {
            r40.iobyxmoadg.wkgbmnqykc(jlmebxxoox(), ((ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.C1972wkgbmnqykc) uiLabel).iobyxmoadg(), null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.btonecajqb) {
            r40.iobyxmoadg.btonecajqb(jlmebxxoox(), ((ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.btonecajqb) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (!(uiLabel instanceof ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.eablkybsjg)) {
            if (!(uiLabel instanceof ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.gxszxtbevo)) {
                throw new NoWhenBranchMatchedException();
            }
            r40.iobyxmoadg.gxszxtbevo(jlmebxxoox(), ((ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.gxszxtbevo) uiLabel).iobyxmoadg());
        } else {
            ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.eablkybsjg eablkybsjgVar = (ru.myspar.catalog.impl.specific_product.presentation.wkgbmnqykc.eablkybsjg) uiLabel;
            HintUiModel hintUiModelZoijcleaow = ru.myspar.common.view.hint.model.iobyxmoadg.zoijcleaow(eablkybsjgVar.zoijcleaow(), HintUiModel.iobyxmoadg.BIG);
            HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = eablkybsjgVar.iobyxmoadg();
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity2 = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity2, "requireActivity(...)");
            st.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity2);
        }
    }

    public final lx1.iobyxmoadg sopmlzcsov() {
        lx1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: tzroggbefp, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(final ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1397245281);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(this) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1397245281, i14, -1, "ru.myspar.catalog.impl.specific_product.presentation.SpecificProductFragment.Render (SpecificProductFragment.kt:145)");
            }
            Context context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            ru.myspar.catalog.impl.specific_product.presentation.zoijcleaow.iobyxmoadg iobyxmoadgVarIobyxmoadg = model.iobyxmoadg();
            ColorsUiModel colorsUiModelZoijcleaow = iobyxmoadgVarIobyxmoadg != null ? iobyxmoadgVarIobyxmoadg.zoijcleaow() : null;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1758055412);
            boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsUiModelZoijcleaow);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                oipsdeybqn oipsdeybqnVarDxjokdxxww = colorsUiModelZoijcleaow != null ? oipsdeybqn.dxjokdxxww(bfopjjpdmp.zoijcleaow(colorsUiModelZoijcleaow.wypolnanlu(context, ColorsUiModel.iobyxmoadg.PRIMARY))) : null;
                draadjrbmkVarBtonecajqb.jyumaefscl(oipsdeybqnVarDxjokdxxww);
                objYadqdtsiqt = oipsdeybqnVarDxjokdxxww;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            lmojexxdyd.ppxfxbqfkf(sr.lqeggnwhkg.iobyxmoadg().wkgbmnqykc((oipsdeybqn) objYadqdtsiqt), nufgyqmvbu.eablkybsjg(1103861921, true, new zoijcleaow(model, this), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, b.f5523dxjokdxxww | 48);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: sr.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return SpecificProductFragment.mbcevpiqjq(this.f108437zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final f70.iobyxmoadg ulzqkzuiru() {
        f70.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }
}
