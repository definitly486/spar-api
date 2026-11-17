package ru.myspar.proloyalty.ads.impl.presentation.dialog.productday;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.ads.api.model.ProductDayPopupDialogArgs;
import ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.ProductDayPopupDialogFragment;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 .2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001/B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lru/myspar/proloyalty/ads/impl/presentation/dialog/productday/ProductDayPopupDialogFragment;", "Lru/myspar/proloyalty/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Lqm0/lqeggnwhkg;", "Lru/myspar/proloyalty/ads/impl/presentation/dialog/productday/zoijcleaow;", "Lru/myspar/proloyalty/ads/impl/presentation/dialog/productday/ppxfxbqfkf;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/google/android/material/bottomsheet/ppxfxbqfkf;", "oipsdeybqn", "(Landroid/os/Bundle;)Lcom/google/android/material/bottomsheet/ppxfxbqfkf;", "uiLabel", "Lgg/wwaezpbzkn;", "zfvoamnweg", "(Lru/myspar/proloyalty/ads/impl/presentation/dialog/productday/ppxfxbqfkf;)V", "Lz21/iobyxmoadg;", "yadqdtsiqt", "Lz21/iobyxmoadg;", "getSnackbarManager", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lkotlin/Function0;", "iozdgvuglv", "Ltg/iobyxmoadg;", "clickListener", "Lru/myspar/proloyalty/ads/impl/presentation/dialog/productday/iobyxmoadg;", "lmojexxdyd", "Lgg/gtknphoqwx;", "yfnezrywwk", "()Lru/myspar/proloyalty/ads/impl/presentation/dialog/productday/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/ads/impl/presentation/dialog/productday/wkgbmnqykc;", "wwaezpbzkn", "Ltr0/ppxfxbqfkf;", "sflfametgt", "()Lru/myspar/proloyalty/ads/impl/presentation/dialog/productday/wkgbmnqykc;", "viewImpl", "Lkm0/zoijcleaow;", "ylkuphrtab", "Lsr0/ppxfxbqfkf;", "ydmasvzmpa", "()Lkm0/zoijcleaow;", "binding", "pkzmftpjix", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductDayPopupDialogFragment extends Hilt_ProductDayPopupDialogFragment<qm0.lqeggnwhkg, ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.zoijcleaow, ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.ppxfxbqfkf> {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg clickListener;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f92154hcddaimhww = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ProductDayPopupDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/ads/impl/presentation/dialog/productday/ProductDayPopupDialogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ProductDayPopupDialogFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/ads/impl/databinding/DialogFragmentProductOfTheDayPopupProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    public static final int f92155jpowsppfya = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92162zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92162zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f92162zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92163yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f92164zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92164zdlpuopuiu = iobyxmoadgVar;
            this.f92163yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f92164zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f92163yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.ProductDayPopupDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ProductDayPopupDialogFragment iobyxmoadg(ProductDayPopupDialogArgs args, tg.iobyxmoadg iobyxmoadgVar) {
            zdlpuopuiu.btonecajqb(args, "args");
            ProductDayPopupDialogFragment productDayPopupDialogFragment = (ProductDayPopupDialogFragment) g21.iobyxmoadg.zoijcleaow(new ProductDayPopupDialogFragment(), args, false, 2, null);
            productDayPopupDialogFragment.clickListener = iobyxmoadgVar;
            return productDayPopupDialogFragment;
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92165yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f92166zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92166zdlpuopuiu = fragment;
            this.f92165yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f92165yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f92166zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f92167zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f92167zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f92167zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f92168zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f92168zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f92168zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f92169zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, km0.zoijcleaow.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/ads/impl/databinding/DialogFragmentProductOfTheDayPopupProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final km0.zoijcleaow invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return km0.zoijcleaow.iobyxmoadg(p13);
        }
    }

    public ProductDayPopupDialogFragment() {
        super(jm0.ppxfxbqfkf.dialog_fragment_product_of_the_day_popup_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: qm0.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductDayPopupDialogFragment.bfopjjpdmp(this.f79189zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f92169zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.wkgbmnqykc bfopjjpdmp(ProductDayPopupDialogFragment productDayPopupDialogFragment) {
        return new ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.wkgbmnqykc(new istkbnxepw(productDayPopupDialogFragment) { // from class: ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.ProductDayPopupDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((ProductDayPopupDialogFragment) this.receiver).ydmasvzmpa();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final km0.zoijcleaow ydmasvzmpa() {
        return (km0.zoijcleaow) this.binding.iobyxmoadg(this, f92154hcddaimhww[1]);
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.bottomsheet.ppxfxbqfkf onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.ojitshcjhn().c(3);
        return ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.wkgbmnqykc vipkmwdibw() {
        return (ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f92154hcddaimhww[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ribwqtqdhb() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.ppxfxbqfkf.iobyxmoadg) {
            tg.iobyxmoadg iobyxmoadgVar = this.clickListener;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
            dismiss();
            return;
        }
        if (!(uiLabel instanceof ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.ppxfxbqfkf.zoijcleaow)) {
            if (!(uiLabel instanceof ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.ppxfxbqfkf.C2146ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            sopmlzcsov(((ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.ppxfxbqfkf.C2146ppxfxbqfkf) uiLabel).iobyxmoadg());
        } else {
            ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.ppxfxbqfkf.zoijcleaow zoijcleaowVar = (ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.ppxfxbqfkf.zoijcleaow) uiLabel;
            HintUiModel hintUiModelZoijcleaow = zoijcleaowVar.zoijcleaow();
            HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            ms0.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
        }
    }
}
