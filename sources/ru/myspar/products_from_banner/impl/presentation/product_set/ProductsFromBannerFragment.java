package ru.myspar.products_from_banner.impl.presentation.product_set;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.products_from_banner.api.models.ProductsFromBannerScreenArgs;
import ru.myspar.products_from_banner.impl.domain.product_set_counter.args.ProductSetCounterArgs;
import ru.myspar.products_from_banner.impl.presentation.product_set.ProductsFromBannerFragment;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 B2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001CB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lru/myspar/products_from_banner/impl/presentation/product_set/ProductsFromBannerFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Llk0/dxjokdxxww;", "Lru/myspar/products_from_banner/impl/presentation/product_set/ppxfxbqfkf;", "Lru/myspar/products_from_banner/impl/presentation/product_set/wkgbmnqykc;", "<init>", "()V", "Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs;", "args", "Lgg/wwaezpbzkn;", "metgxyhuhe", "(Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs;)V", "", "titleRes", "messageRes", "yfnezrywwk", "(ILjava/lang/Integer;)V", "jztzpxfvev", "Lru/myspar/products_from_banner/impl/domain/product_set_counter/args/ProductSetCounterArgs;", "czzsidtyhn", "(Lru/myspar/products_from_banner/impl/domain/product_set_counter/args/ProductSetCounterArgs;)V", "uiLabel", "okpsazkaxt", "(Lru/myspar/products_from_banner/impl/presentation/product_set/wkgbmnqykc;)V", "Lf70/iobyxmoadg;", "esjtqupxsv", "Lf70/iobyxmoadg;", "ribwqtqdhb", "()Lf70/iobyxmoadg;", "setDialogManager", "(Lf70/iobyxmoadg;)V", "dialogManager", "Llx1/iobyxmoadg;", "lereixgezr", "Llx1/iobyxmoadg;", "vipkmwdibw", "()Llx1/iobyxmoadg;", "setPurchasesFeatureApi", "(Llx1/iobyxmoadg;)V", "purchasesFeatureApi", "Lq40/iobyxmoadg;", "pmvmpeiblj", "Lq40/iobyxmoadg;", "jhduphickx", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/products_from_banner/impl/presentation/product_set/zoijcleaow;", "zynmafqrjb", "Lgg/gtknphoqwx;", "crxdokpmqz", "()Lru/myspar/products_from_banner/impl/presentation/product_set/zoijcleaow;", "binder", "Lru/myspar/products_from_banner/impl/presentation/product_set/gxszxtbevo;", "istkbnxepw", "Lzs/ppxfxbqfkf;", "ikoacuggdj", "()Lru/myspar/products_from_banner/impl/presentation/product_set/gxszxtbevo;", "viewImpl", "Lfk0/iobyxmoadg;", "cdpycssgdh", "Lys/ppxfxbqfkf;", "jlmebxxoox", "()Lfk0/iobyxmoadg;", "binding", "yadqdtsiqt", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductsFromBannerFragment extends iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public f70.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public lx1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f91616iozdgvuglv = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ProductsFromBannerFragment.class, "viewImpl", "getViewImpl()Lru/myspar/products_from_banner/impl/presentation/product_set/ProductsFromBannerViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ProductsFromBannerFragment.class, "binding", "getBinding()Lru/myspar/products_from_banner/impl/databinding/ProductsFromBannerFragmentBinding;", 0))};

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final int f91617lmojexxdyd = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f91625zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f91625zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f91625zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f91626yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f91627zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f91627zdlpuopuiu = iobyxmoadgVar;
            this.f91626yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f91627zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f91626yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.products_from_banner.impl.presentation.product_set.ProductsFromBannerFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ProductsFromBannerFragment iobyxmoadg(ProductsFromBannerScreenArgs argument) {
            zdlpuopuiu.btonecajqb(argument, "argument");
            return (ProductsFromBannerFragment) b40.iobyxmoadg.zoijcleaow(new ProductsFromBannerFragment(), argument, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f91628yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f91629zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f91629zdlpuopuiu = fragment;
            this.f91628yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f91628yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f91629zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f91630zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f91630zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f91630zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f91631zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f91631zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f91631zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f91632zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, fk0.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/products_from_banner/impl/databinding/ProductsFromBannerFragmentBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final fk0.iobyxmoadg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return fk0.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public ProductsFromBannerFragment() {
        super(ak0.wkgbmnqykc.products_from_banner_fragment);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.products_from_banner.impl.presentation.product_set.zoijcleaow.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: lk0.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductsFromBannerFragment.ydmasvzmpa(this.f63295zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f91632zdlpuopuiu);
    }

    private final void czzsidtyhn(ProductSetCounterArgs args) {
        f70.zoijcleaow.ppxfxbqfkf(pk0.zoijcleaow.zoijcleaow(args, new draadjrbmk() { // from class: lk0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ProductsFromBannerFragment.uwvvkdfqfp(this.f63285zdlpuopuiu, ((Integer) obj).intValue());
            }
        }), ribwqtqdhb(), g70.eablkybsjg.iobyxmoadg("PRODUCTS_FROM_BANNER_FRAGMENT_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fk0.iobyxmoadg jlmebxxoox() {
        return (fk0.iobyxmoadg) this.binding.iobyxmoadg(this, f91616iozdgvuglv[1]);
    }

    private final void jztzpxfvev() {
        ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        String string = getString(pm.dxjokdxxww.available_only_for_pickup_product);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        f70.zoijcleaow.zoijcleaow(zoijcleaowVar.ppxfxbqfkf(oxmwwwfdhmVarRequireActivity, string, new tg.iobyxmoadg() { // from class: lk0.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductsFromBannerFragment.xrmfcynszj(this.f63287zdlpuopuiu);
            }
        }, null), ribwqtqdhb(), g70.eablkybsjg.iobyxmoadg("PRODUCTS_FROM_BANNER_FRAGMENT_KEY"));
    }

    private final void metgxyhuhe(final PurchaseListAddProductDialogArgs args) {
        BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragmentNufgyqmvbu = vipkmwdibw().nufgyqmvbu(args, new tg.iobyxmoadg() { // from class: lk0.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductsFromBannerFragment.rlfsiqarku(args, this);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseComposeMviBottomSheetDialogFragmentNufgyqmvbu.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(PurchaseListAddProductDialogArgs purchaseListAddProductDialogArgs, ProductsFromBannerFragment productsFromBannerFragment) {
        int i13;
        if (purchaseListAddProductDialogArgs instanceof PurchaseListAddProductDialogArgs.SingleProduct) {
            i13 = pm.dxjokdxxww.purchases_list_product_added_to_the_list;
        } else {
            if (!(purchaseListAddProductDialogArgs instanceof PurchaseListAddProductDialogArgs.ProductsListFromBanner)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = pm.dxjokdxxww.purchases_list_product_list_added_to_the_list;
        }
        r40.iobyxmoadg.eablkybsjg(productsFromBannerFragment.jhduphickx(), i13);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn uwvvkdfqfp(ProductsFromBannerFragment productsFromBannerFragment, int i13) {
        productsFromBannerFragment.hcddaimhww().vdvldrhtss(i13);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn xrmfcynszj(ProductsFromBannerFragment productsFromBannerFragment) {
        productsFromBannerFragment.hcddaimhww().zdlpuopuiu();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo ydmasvzmpa(ProductsFromBannerFragment productsFromBannerFragment) {
        return new ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo(new istkbnxepw(productsFromBannerFragment) { // from class: ru.myspar.products_from_banner.impl.presentation.product_set.ProductsFromBannerFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((ProductsFromBannerFragment) this.receiver).jlmebxxoox();
            }
        });
    }

    private final void yfnezrywwk(int titleRes, Integer messageRes) {
        rx.iobyxmoadg iobyxmoadgVar = new rx.iobyxmoadg(rx.zoijcleaow.PRIMARY, Integer.valueOf(pm.dxjokdxxww.f76951ok), null, null, 12, null);
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        rx.nufgyqmvbu.iobyxmoadg iobyxmoadgVarAgtfadlqog = new rx.nufgyqmvbu.iobyxmoadg(oxmwwwfdhmVarRequireActivity, null, null, 6, null).ppxfxbqfkf(rx.ppxfxbqfkf.VERTICAL).agtfadlqog(titleRes);
        if (messageRes != null) {
            iobyxmoadgVarAgtfadlqog.lqeggnwhkg(messageRes.intValue());
        }
        f70.zoijcleaow.zoijcleaow(iobyxmoadgVarAgtfadlqog.iobyxmoadg(iobyxmoadgVar).rgvfuqvkyq(8388611).dxjokdxxww(8388611).wkgbmnqykc(true).zoijcleaow(), ribwqtqdhb(), g70.eablkybsjg.iobyxmoadg("PRODUCTS_FROM_BANNER_FRAGMENT_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public ru.myspar.products_from_banner.impl.presentation.product_set.zoijcleaow pkzmftpjix() {
        return (ru.myspar.products_from_banner.impl.presentation.product_set.zoijcleaow) this.binder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo hcddaimhww() {
        return (ru.myspar.products_from_banner.impl.presentation.product_set.gxszxtbevo) this.viewImpl.iobyxmoadg(this, f91616iozdgvuglv[0]);
    }

    public final q40.iobyxmoadg jhduphickx() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.nufgyqmvbu) {
            ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.nufgyqmvbu nufgyqmvbuVar = (ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.nufgyqmvbu) uiLabel;
            yfnezrywwk(nufgyqmvbuVar.zoijcleaow(), nufgyqmvbuVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.C2128wkgbmnqykc) {
            lmojexxdyd(((ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.C2128wkgbmnqykc) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.iobyxmoadg) {
            metgxyhuhe(((ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.zoijcleaow) {
            jztzpxfvev();
            return;
        }
        if (uiLabel instanceof ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.ppxfxbqfkf) {
            czzsidtyhn(((ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.gxszxtbevo.f91661iobyxmoadg)) {
            r40.iobyxmoadg.ppxfxbqfkf(jhduphickx(), pm.dxjokdxxww.product_not_available, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.lqeggnwhkg) {
            r40.iobyxmoadg.eablkybsjg(jhduphickx(), ((ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.lqeggnwhkg) uiLabel).iobyxmoadg());
            return;
        }
        if (!(uiLabel instanceof ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.eablkybsjg)) {
            throw new NoWhenBranchMatchedException();
        }
        ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.eablkybsjg eablkybsjgVar = (ru.myspar.products_from_banner.impl.presentation.product_set.wkgbmnqykc.eablkybsjg) uiLabel;
        HintUiModel hintUiModelZoijcleaow = eablkybsjgVar.zoijcleaow();
        HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = eablkybsjgVar.iobyxmoadg();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        st.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
    }

    public final f70.iobyxmoadg ribwqtqdhb() {
        f70.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    public final lx1.iobyxmoadg vipkmwdibw() {
        lx1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }
}
