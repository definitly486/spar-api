package ru.myspar.purchases.impl.specific.presentation;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
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
import ru.myspar.purchases.impl.specific.domain.store.SpecificPurchaseArgs;
import ru.myspar.purchases.impl.specific.presentation.SpecificPurchaseFragment;
import ru.myspar.rate.rate_product.api.model.RateProductArgs;
import ru.myspar.rate.rate_product.api.model.RateType;
import ry1.dxjokdxxww;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 C2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001DB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010<\u001a\u0002078TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lru/myspar/purchases/impl/specific/presentation/SpecificPurchaseFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lry1/dxjokdxxww;", "Lru/myspar/purchases/impl/specific/presentation/ppxfxbqfkf;", "Lru/myspar/purchases/impl/specific/presentation/wkgbmnqykc;", "<init>", "()V", "Lqy1/iobyxmoadg;", "params", "Lgg/wwaezpbzkn;", "xrmfcynszj", "(Lqy1/iobyxmoadg;)V", "", "message", "okpsazkaxt", "(Lqy1/iobyxmoadg;Ljava/lang/String;)V", "productArticle", "productName", "Lgg/pmvmpeiblj;", "rating", "rlfsiqarku", "(Ljava/lang/String;Ljava/lang/String;I)V", "uiLabel", "ikoacuggdj", "(Lru/myspar/purchases/impl/specific/presentation/wkgbmnqykc;)V", "Lk02/iobyxmoadg;", "esjtqupxsv", "Lk02/iobyxmoadg;", "ribwqtqdhb", "()Lk02/iobyxmoadg;", "setRateProductFeatureApi", "(Lk02/iobyxmoadg;)V", "rateProductFeatureApi", "Lf70/iobyxmoadg;", "lereixgezr", "Lf70/iobyxmoadg;", "jlmebxxoox", "()Lf70/iobyxmoadg;", "setDialogManager", "(Lf70/iobyxmoadg;)V", "dialogManager", "Lq40/iobyxmoadg;", "pmvmpeiblj", "Lq40/iobyxmoadg;", "vipkmwdibw", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/purchases/impl/specific/presentation/iobyxmoadg;", "zynmafqrjb", "Lgg/gtknphoqwx;", "sopmlzcsov", "()Lru/myspar/purchases/impl/specific/presentation/iobyxmoadg;", "binder", "Lru/myspar/purchases/impl/specific/presentation/eablkybsjg;", "istkbnxepw", "Lzs/ppxfxbqfkf;", "jhduphickx", "()Lru/myspar/purchases/impl/specific/presentation/eablkybsjg;", "viewImpl", "Lsx1/eablkybsjg;", "cdpycssgdh", "Lys/ppxfxbqfkf;", "crxdokpmqz", "()Lsx1/eablkybsjg;", "binding", "yadqdtsiqt", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpecificPurchaseFragment extends Hilt_SpecificPurchaseFragment<dxjokdxxww, ru.myspar.purchases.impl.specific.presentation.ppxfxbqfkf, ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public k02.iobyxmoadg rateProductFeatureApi;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public f70.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f102575iozdgvuglv = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SpecificPurchaseFragment.class, "viewImpl", "getViewImpl()Lru/myspar/purchases/impl/specific/presentation/SpecificPurchaseViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SpecificPurchaseFragment.class, "binding", "getBinding()Lru/myspar/purchases/impl/databinding/FragmentSpecificPurchaseBinding;", 0))};

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final int f102576lmojexxdyd = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f102584zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102584zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f102584zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f102585yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f102586zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102586zdlpuopuiu = iobyxmoadgVar;
            this.f102585yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f102586zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f102585yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.specific.presentation.SpecificPurchaseFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SpecificPurchaseFragment iobyxmoadg(SpecificPurchaseArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (SpecificPurchaseFragment) b40.iobyxmoadg.zoijcleaow(new SpecificPurchaseFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f102587yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f102588zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102588zdlpuopuiu = fragment;
            this.f102587yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f102587yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f102588zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f102589zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f102589zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f102589zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f102590zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f102590zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f102590zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f102591zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, sx1.eablkybsjg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/purchases/impl/databinding/FragmentSpecificPurchaseBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final sx1.eablkybsjg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return sx1.eablkybsjg.iobyxmoadg(p13);
        }
    }

    public SpecificPurchaseFragment() {
        super(nx1.gxszxtbevo.fragment_specific_purchase);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: ry1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificPurchaseFragment.czzsidtyhn(this.f105064zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f102591zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sx1.eablkybsjg crxdokpmqz() {
        return (sx1.eablkybsjg) this.binding.iobyxmoadg(this, f102575iozdgvuglv[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.purchases.impl.specific.presentation.eablkybsjg czzsidtyhn(SpecificPurchaseFragment specificPurchaseFragment) {
        return new ru.myspar.purchases.impl.specific.presentation.eablkybsjg(new istkbnxepw(specificPurchaseFragment) { // from class: ru.myspar.purchases.impl.specific.presentation.SpecificPurchaseFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((SpecificPurchaseFragment) this.receiver).crxdokpmqz();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jztzpxfvev(SpecificPurchaseFragment specificPurchaseFragment, qy1.iobyxmoadg iobyxmoadgVar) {
        specificPurchaseFragment.pkzmftpjix().jyumaefscl(new ru.myspar.purchases.impl.specific.presentation.ppxfxbqfkf.zoijcleaow(iobyxmoadgVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn metgxyhuhe(SpecificPurchaseFragment specificPurchaseFragment, qy1.iobyxmoadg iobyxmoadgVar) {
        specificPurchaseFragment.pkzmftpjix().jyumaefscl(new ru.myspar.purchases.impl.specific.presentation.ppxfxbqfkf.wkgbmnqykc(iobyxmoadgVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void okpsazkaxt(final qy1.iobyxmoadg params, String message) {
        ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        zoijcleaowVar.ppxfxbqfkf(contextRequireContext, message, new tg.iobyxmoadg() { // from class: ry1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificPurchaseFragment.jztzpxfvev(this.f105061zdlpuopuiu, params);
            }
        }, null).show();
    }

    private final void rlfsiqarku(String productArticle, String productName, int rating) {
        f70.zoijcleaow.ppxfxbqfkf(k02.iobyxmoadg.zoijcleaow(ribwqtqdhb(), new RateProductArgs(new RateType.Single("purchase_item", productArticle, productName, pmvmpeiblj.iobyxmoadg(rating), null)), null, 2, null), jlmebxxoox(), g70.eablkybsjg.iobyxmoadg("SPECIFIC_PURCHASE_SCREEN_KEY"));
    }

    private final void xrmfcynszj(final qy1.iobyxmoadg params) {
        ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        ee0.zoijcleaow.eablkybsjg(zoijcleaowVar, contextRequireContext, new tg.iobyxmoadg() { // from class: ry1.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificPurchaseFragment.metgxyhuhe(this.f105056zdlpuopuiu, params);
            }
        }, null, 4, null).show();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc uiLabel) {
        int i13;
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.eablkybsjg) {
            r40.iobyxmoadg.gxszxtbevo(vipkmwdibw(), String.valueOf(((ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.eablkybsjg) uiLabel).iobyxmoadg()));
            return;
        }
        if (uiLabel instanceof ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.ppxfxbqfkf) {
            lmojexxdyd(((ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.C2482wkgbmnqykc) {
            r40.iobyxmoadg.btonecajqb(vipkmwdibw(), ((ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.C2482wkgbmnqykc) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.zoijcleaow) {
            xrmfcynszj(((ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.iobyxmoadg) {
            ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.iobyxmoadg) uiLabel;
            okpsazkaxt(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
            return;
        }
        if (!(uiLabel instanceof ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.gxszxtbevo)) {
            if (!(uiLabel instanceof ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.lqeggnwhkg)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.lqeggnwhkg lqeggnwhkgVar = (ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.lqeggnwhkg) uiLabel;
            rlfsiqarku(lqeggnwhkgVar.iobyxmoadg(), lqeggnwhkgVar.zoijcleaow(), lqeggnwhkgVar.ppxfxbqfkf());
            return;
        }
        qy1.iobyxmoadg iobyxmoadgVarIobyxmoadg = ((ru.myspar.purchases.impl.specific.presentation.wkgbmnqykc.gxszxtbevo) uiLabel).iobyxmoadg();
        if (zdlpuopuiu.eablkybsjg(iobyxmoadgVarIobyxmoadg, qy1.iobyxmoadg.C1804iobyxmoadg.f80995iobyxmoadg)) {
            i13 = nx1.nufgyqmvbu.products_not_available_in_chosen_shop;
        } else {
            if (!(iobyxmoadgVarIobyxmoadg instanceof qy1.iobyxmoadg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = nx1.nufgyqmvbu.product_not_available_in_chosen_shop;
        }
        r40.iobyxmoadg.ppxfxbqfkf(vipkmwdibw(), i13, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public ru.myspar.purchases.impl.specific.presentation.eablkybsjg hcddaimhww() {
        return (ru.myspar.purchases.impl.specific.presentation.eablkybsjg) this.viewImpl.iobyxmoadg(this, f102575iozdgvuglv[0]);
    }

    public final f70.iobyxmoadg jlmebxxoox() {
        f70.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    public final k02.iobyxmoadg ribwqtqdhb() {
        k02.iobyxmoadg iobyxmoadgVar = this.rateProductFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("rateProductFeatureApi");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final q40.iobyxmoadg vipkmwdibw() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
