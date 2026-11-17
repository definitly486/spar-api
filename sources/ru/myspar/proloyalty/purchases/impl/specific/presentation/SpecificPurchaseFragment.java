package ru.myspar.proloyalty.purchases.impl.specific.presentation;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.pmvmpeiblj;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.specific.domain.store.SpecificPurchaseArgs;
import ru.myspar.proloyalty.purchases.impl.specific.presentation.SpecificPurchaseFragment;
import ru.myspar.proloyalty.rate.rate_product.api.model.RateProductArgs;
import ru.myspar.proloyalty.rate.rate_product.api.model.RateType;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 @2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001AB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00109\u001a\u0002048TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lru/myspar/proloyalty/purchases/impl/specific/presentation/SpecificPurchaseFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lxj1/nufgyqmvbu;", "Lru/myspar/proloyalty/purchases/impl/specific/presentation/ppxfxbqfkf;", "Lru/myspar/proloyalty/purchases/impl/specific/presentation/wkgbmnqykc;", "<init>", "()V", "Lwj1/iobyxmoadg;", "params", "Lgg/wwaezpbzkn;", "ikoacuggdj", "(Lwj1/iobyxmoadg;)V", "", "productArticle", "productName", "Lgg/pmvmpeiblj;", "rating", "jztzpxfvev", "(Ljava/lang/String;Ljava/lang/String;I)V", "uiLabel", "jhduphickx", "(Lru/myspar/proloyalty/purchases/impl/specific/presentation/wkgbmnqykc;)V", "Lbm1/iobyxmoadg;", "esjtqupxsv", "Lbm1/iobyxmoadg;", "jlmebxxoox", "()Lbm1/iobyxmoadg;", "setRateProductFeatureApi", "(Lbm1/iobyxmoadg;)V", "rateProductFeatureApi", "Lu51/iobyxmoadg;", "lereixgezr", "Lu51/iobyxmoadg;", "crxdokpmqz", "()Lu51/iobyxmoadg;", "setDialogManager", "(Lu51/iobyxmoadg;)V", "dialogManager", "Lz21/iobyxmoadg;", "pmvmpeiblj", "Lz21/iobyxmoadg;", "ribwqtqdhb", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/purchases/impl/specific/presentation/iobyxmoadg;", "zynmafqrjb", "Lgg/gtknphoqwx;", "ulzqkzuiru", "()Lru/myspar/proloyalty/purchases/impl/specific/presentation/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/purchases/impl/specific/presentation/eablkybsjg;", "istkbnxepw", "Ltr0/ppxfxbqfkf;", "vipkmwdibw", "()Lru/myspar/proloyalty/purchases/impl/specific/presentation/eablkybsjg;", "viewImpl", "Lyi1/eablkybsjg;", "cdpycssgdh", "Lsr0/ppxfxbqfkf;", "sopmlzcsov", "()Lyi1/eablkybsjg;", "binding", "yadqdtsiqt", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpecificPurchaseFragment extends Hilt_SpecificPurchaseFragment<xj1.nufgyqmvbu, ru.myspar.proloyalty.purchases.impl.specific.presentation.ppxfxbqfkf, ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public bm1.iobyxmoadg rateProductFeatureApi;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public u51.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f99861iozdgvuglv = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SpecificPurchaseFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/purchases/impl/specific/presentation/SpecificPurchaseViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SpecificPurchaseFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/purchases/impl/databinding/FragmentSpecificPurchaseProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final int f99862lmojexxdyd = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99870zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99870zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f99870zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99871yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99872zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99872zdlpuopuiu = iobyxmoadgVar;
            this.f99871yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f99872zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99871yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.specific.presentation.SpecificPurchaseFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SpecificPurchaseFragment iobyxmoadg(SpecificPurchaseArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (SpecificPurchaseFragment) g21.iobyxmoadg.zoijcleaow(new SpecificPurchaseFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99873yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f99874zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99874zdlpuopuiu = fragment;
            this.f99873yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99873yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f99874zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f99875zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f99875zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f99875zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99876zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f99876zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f99876zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f99877zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, yi1.eablkybsjg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/purchases/impl/databinding/FragmentSpecificPurchaseProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final yi1.eablkybsjg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return yi1.eablkybsjg.iobyxmoadg(p13);
        }
    }

    public SpecificPurchaseFragment() {
        super(ti1.gxszxtbevo.fragment_specific_purchase_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: xj1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificPurchaseFragment.xrmfcynszj(this.f122645zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f99877zdlpuopuiu);
    }

    private final void ikoacuggdj(final wj1.iobyxmoadg params) {
        ac1.zoijcleaow zoijcleaowVar = ac1.zoijcleaow.f1546iobyxmoadg;
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        ac1.zoijcleaow.wkgbmnqykc(zoijcleaowVar, contextRequireContext, new tg.iobyxmoadg() { // from class: xj1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificPurchaseFragment.okpsazkaxt(this.f122643zdlpuopuiu, params);
            }
        }, null, 4, null).show();
    }

    private final void jztzpxfvev(String productArticle, String productName, int rating) {
        u51.zoijcleaow.zoijcleaow(bm1.iobyxmoadg.zoijcleaow(jlmebxxoox(), new RateProductArgs(new RateType.Single("purchase_item", productArticle, productName, pmvmpeiblj.iobyxmoadg(rating), null)), null, 2, null), crxdokpmqz(), v51.eablkybsjg.iobyxmoadg("SPECIFIC_PURCHASE_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn okpsazkaxt(SpecificPurchaseFragment specificPurchaseFragment, wj1.iobyxmoadg iobyxmoadgVar) {
        specificPurchaseFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.purchases.impl.specific.presentation.ppxfxbqfkf.C2399ppxfxbqfkf(iobyxmoadgVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yi1.eablkybsjg sopmlzcsov() {
        return (yi1.eablkybsjg) this.binding.iobyxmoadg(this, f99861iozdgvuglv[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.purchases.impl.specific.presentation.eablkybsjg xrmfcynszj(SpecificPurchaseFragment specificPurchaseFragment) {
        return new ru.myspar.proloyalty.purchases.impl.specific.presentation.eablkybsjg(new istkbnxepw(specificPurchaseFragment) { // from class: ru.myspar.proloyalty.purchases.impl.specific.presentation.SpecificPurchaseFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((SpecificPurchaseFragment) this.receiver).sopmlzcsov();
            }
        });
    }

    public final u51.iobyxmoadg crxdokpmqz() {
        u51.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc uiLabel) {
        int i13;
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.C2400wkgbmnqykc) {
            a31.iobyxmoadg.gxszxtbevo(ribwqtqdhb(), String.valueOf(((ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.C2400wkgbmnqykc) uiLabel).iobyxmoadg()));
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.zoijcleaow) {
            lmojexxdyd(((ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.ppxfxbqfkf) {
            a31.iobyxmoadg.btonecajqb(ribwqtqdhb(), ((ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.iobyxmoadg) {
            ikoacuggdj(((ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg());
            return;
        }
        if (!(uiLabel instanceof ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.eablkybsjg)) {
            if (!(uiLabel instanceof ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.gxszxtbevo)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.gxszxtbevo gxszxtbevoVar = (ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.gxszxtbevo) uiLabel;
            jztzpxfvev(gxszxtbevoVar.iobyxmoadg(), gxszxtbevoVar.zoijcleaow(), gxszxtbevoVar.ppxfxbqfkf());
            return;
        }
        wj1.iobyxmoadg iobyxmoadgVarIobyxmoadg = ((ru.myspar.proloyalty.purchases.impl.specific.presentation.wkgbmnqykc.eablkybsjg) uiLabel).iobyxmoadg();
        if (zdlpuopuiu.eablkybsjg(iobyxmoadgVarIobyxmoadg, wj1.iobyxmoadg.C3002iobyxmoadg.f120012iobyxmoadg)) {
            i13 = ti1.nufgyqmvbu.proloyalty_products_not_available_in_chosen_shop;
        } else {
            if (!(iobyxmoadgVarIobyxmoadg instanceof wj1.iobyxmoadg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = ti1.nufgyqmvbu.proloyalty_product_not_available_in_chosen_shop;
        }
        a31.iobyxmoadg.ppxfxbqfkf(ribwqtqdhb(), i13, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    public final bm1.iobyxmoadg jlmebxxoox() {
        bm1.iobyxmoadg iobyxmoadgVar = this.rateProductFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("rateProductFeatureApi");
        return null;
    }

    public final z21.iobyxmoadg ribwqtqdhb() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.purchases.impl.specific.presentation.eablkybsjg hcddaimhww() {
        return (ru.myspar.proloyalty.purchases.impl.specific.presentation.eablkybsjg) this.viewImpl.iobyxmoadg(this, f99861iozdgvuglv[0]);
    }
}
