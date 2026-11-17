package ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set;

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
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.proloyalty.products_from_banner.api.models.ProductsFromBannerScreenArgs;
import ru.myspar.proloyalty.products_from_banner.impl.domain.product_set_counter.args.ProductSetCounterArgs;
import ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.ProductsFromBannerFragment;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 A2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001BB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u0010:\u001a\u0002058TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set/ProductsFromBannerFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lbi1/nufgyqmvbu;", "Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set/ppxfxbqfkf;", "Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set/wkgbmnqykc;", "<init>", "()V", "Lru/myspar/proloyalty/purchases/api/model/PurchaseListAddProductDialogArgs;", "args", "Lgg/wwaezpbzkn;", "okpsazkaxt", "(Lru/myspar/proloyalty/purchases/api/model/PurchaseListAddProductDialogArgs;)V", "", "titleRes", "messageRes", "rlfsiqarku", "(ILjava/lang/Integer;)V", "Lru/myspar/proloyalty/products_from_banner/impl/domain/product_set_counter/args/ProductSetCounterArgs;", "xrmfcynszj", "(Lru/myspar/proloyalty/products_from_banner/impl/domain/product_set_counter/args/ProductSetCounterArgs;)V", "uiLabel", "ikoacuggdj", "(Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set/wkgbmnqykc;)V", "Lu51/iobyxmoadg;", "esjtqupxsv", "Lu51/iobyxmoadg;", "jlmebxxoox", "()Lu51/iobyxmoadg;", "setDialogManager", "(Lu51/iobyxmoadg;)V", "dialogManager", "Lri1/iobyxmoadg;", "lereixgezr", "Lri1/iobyxmoadg;", "ribwqtqdhb", "()Lri1/iobyxmoadg;", "setPurchasesFeatureApi", "(Lri1/iobyxmoadg;)V", "purchasesFeatureApi", "Lz21/iobyxmoadg;", "pmvmpeiblj", "Lz21/iobyxmoadg;", "vipkmwdibw", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set/zoijcleaow;", "zynmafqrjb", "Lgg/gtknphoqwx;", "sopmlzcsov", "()Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set/zoijcleaow;", "binder", "Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set/gxszxtbevo;", "istkbnxepw", "Ltr0/ppxfxbqfkf;", "jhduphickx", "()Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set/gxszxtbevo;", "viewImpl", "Lvh1/iobyxmoadg;", "cdpycssgdh", "Lsr0/ppxfxbqfkf;", "crxdokpmqz", "()Lvh1/iobyxmoadg;", "binding", "yadqdtsiqt", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductsFromBannerFragment extends iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public u51.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public ri1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f99314iozdgvuglv = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ProductsFromBannerFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set/ProductsFromBannerViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ProductsFromBannerFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/products_from_banner/impl/databinding/ProductsFromBannerFragmentProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final int f99315lmojexxdyd = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99323zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99323zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f99323zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99324yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99325zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99325zdlpuopuiu = iobyxmoadgVar;
            this.f99324yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f99325zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99324yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.ProductsFromBannerFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ProductsFromBannerFragment iobyxmoadg(ProductsFromBannerScreenArgs argument) {
            zdlpuopuiu.btonecajqb(argument, "argument");
            return (ProductsFromBannerFragment) g21.iobyxmoadg.zoijcleaow(new ProductsFromBannerFragment(), argument, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99326yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f99327zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99327zdlpuopuiu = fragment;
            this.f99326yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99326yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f99327zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f99328zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f99328zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f99328zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99329zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f99329zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f99329zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f99330zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, vh1.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/products_from_banner/impl/databinding/ProductsFromBannerFragmentProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final vh1.iobyxmoadg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return vh1.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public ProductsFromBannerFragment() {
        super(qh1.wkgbmnqykc.products_from_banner_fragment_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.zoijcleaow.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: bi1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductsFromBannerFragment.czzsidtyhn(this.f16403zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f99330zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vh1.iobyxmoadg crxdokpmqz() {
        return (vh1.iobyxmoadg) this.binding.iobyxmoadg(this, f99314iozdgvuglv[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo czzsidtyhn(ProductsFromBannerFragment productsFromBannerFragment) {
        return new ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo(new istkbnxepw(productsFromBannerFragment) { // from class: ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.ProductsFromBannerFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((ProductsFromBannerFragment) this.receiver).crxdokpmqz();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jztzpxfvev(PurchaseListAddProductDialogArgs purchaseListAddProductDialogArgs, ProductsFromBannerFragment productsFromBannerFragment) {
        int i13;
        if (purchaseListAddProductDialogArgs instanceof PurchaseListAddProductDialogArgs.SingleProduct) {
            i13 = vk0.lqeggnwhkg.proloyalty_purchases_list_product_added_to_the_list;
        } else {
            if (!(purchaseListAddProductDialogArgs instanceof PurchaseListAddProductDialogArgs.ProductsListFromBanner)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = vk0.lqeggnwhkg.proloyalty_purchases_list_product_list_added_to_the_list;
        }
        a31.iobyxmoadg.eablkybsjg(productsFromBannerFragment.vipkmwdibw(), i13);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn metgxyhuhe(ProductsFromBannerFragment productsFromBannerFragment, int i13) {
        productsFromBannerFragment.hcddaimhww().vdvldrhtss(i13);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void okpsazkaxt(final PurchaseListAddProductDialogArgs args) {
        BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragmentDxjokdxxww = ribwqtqdhb().dxjokdxxww(args, new tg.iobyxmoadg() { // from class: bi1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductsFromBannerFragment.jztzpxfvev(args, this);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseComposeMviBottomSheetDialogFragmentDxjokdxxww.ntlheqmsrt(childFragmentManager);
    }

    private final void rlfsiqarku(int titleRes, Integer messageRes) {
        ow0.iobyxmoadg iobyxmoadgVar = new ow0.iobyxmoadg(ow0.zoijcleaow.PRIMARY, Integer.valueOf(vk0.lqeggnwhkg.proloyalty_ok), null, null, 12, null);
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        ow0.nufgyqmvbu.iobyxmoadg iobyxmoadgVarAgtfadlqog = new ow0.nufgyqmvbu.iobyxmoadg(oxmwwwfdhmVarRequireActivity, null, null, 6, null).ppxfxbqfkf(ow0.ppxfxbqfkf.VERTICAL).agtfadlqog(titleRes);
        if (messageRes != null) {
            iobyxmoadgVarAgtfadlqog.lqeggnwhkg(messageRes.intValue());
        }
        u51.zoijcleaow.wkgbmnqykc(iobyxmoadgVarAgtfadlqog.iobyxmoadg(iobyxmoadgVar).rgvfuqvkyq(8388611).dxjokdxxww(8388611).wkgbmnqykc(true).zoijcleaow(), jlmebxxoox(), v51.eablkybsjg.iobyxmoadg("PRODUCTS_FROM_BANNER_FRAGMENT_KEY"));
    }

    private final void xrmfcynszj(ProductSetCounterArgs args) {
        u51.zoijcleaow.zoijcleaow(fi1.zoijcleaow.zoijcleaow(args, new draadjrbmk() { // from class: bi1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ProductsFromBannerFragment.metgxyhuhe(this.f16382zdlpuopuiu, ((Integer) obj).intValue());
            }
        }), jlmebxxoox(), v51.eablkybsjg.iobyxmoadg("PRODUCTS_FROM_BANNER_FRAGMENT_KEY"));
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.lqeggnwhkg) {
            ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.lqeggnwhkg lqeggnwhkgVar = (ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.lqeggnwhkg) uiLabel;
            rlfsiqarku(lqeggnwhkgVar.zoijcleaow(), lqeggnwhkgVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.ppxfxbqfkf) {
            lmojexxdyd(((ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.iobyxmoadg) {
            okpsazkaxt(((ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.zoijcleaow) {
            xrmfcynszj(((ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.eablkybsjg.f99355iobyxmoadg)) {
            a31.iobyxmoadg.ppxfxbqfkf(vipkmwdibw(), vk0.lqeggnwhkg.proloyalty_product_not_available, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.gxszxtbevo) {
            a31.iobyxmoadg.eablkybsjg(vipkmwdibw(), ((ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.gxszxtbevo) uiLabel).iobyxmoadg());
            return;
        }
        if (!(uiLabel instanceof ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.C2375wkgbmnqykc)) {
            throw new NoWhenBranchMatchedException();
        }
        ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.C2375wkgbmnqykc c2375wkgbmnqykc = (ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.wkgbmnqykc.C2375wkgbmnqykc) uiLabel;
        HintUiModel hintUiModelZoijcleaow = c2375wkgbmnqykc.zoijcleaow();
        HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = c2375wkgbmnqykc.iobyxmoadg();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        ms0.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo hcddaimhww() {
        return (ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.gxszxtbevo) this.viewImpl.iobyxmoadg(this, f99314iozdgvuglv[0]);
    }

    public final u51.iobyxmoadg jlmebxxoox() {
        u51.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    public final ri1.iobyxmoadg ribwqtqdhb() {
        ri1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.zoijcleaow pkzmftpjix() {
        return (ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set.zoijcleaow) this.binder.getValue();
    }

    public final z21.iobyxmoadg vipkmwdibw() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
