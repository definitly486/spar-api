package ru.myspar.purchases.impl.list_details.presentation;

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
import gg.wwaezpbzkn;
import gy1.btonecajqb;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.legacy.presentation.model.AddProductParams;
import ru.myspar.purchases.api.model.PurchasesListDetailsArgs;
import ru.myspar.purchases.impl.list_actions_with_section.domain.store.PurchasesListActionsWithSectionDialogArgs;
import ru.myspar.purchases.impl.list_actions_with_section.presentation.PurchasesListActionsWithSectionDialogFragment;
import ru.myspar.purchases.impl.list_details.presentation.PurchasesListDetailsFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 :2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001;B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lru/myspar/purchases/impl/list_details/presentation/PurchasesListDetailsFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lgy1/btonecajqb;", "Lru/myspar/purchases/impl/list_details/presentation/zoijcleaow;", "Lru/myspar/purchases/impl/list_details/presentation/ppxfxbqfkf;", "<init>", "()V", "", "productId", "Laz1/iobyxmoadg;", "section", "Lgg/wwaezpbzkn;", "uwvvkdfqfp", "(Ljava/lang/String;Laz1/iobyxmoadg;)V", "metgxyhuhe", "(Laz1/iobyxmoadg;)V", "Lru/myspar/legacy/presentation/model/AddProductParams;", "params", "message", "jztzpxfvev", "(Lru/myspar/legacy/presentation/model/AddProductParams;Ljava/lang/String;)V", "uiLabel", "okpsazkaxt", "(Lru/myspar/purchases/impl/list_details/presentation/ppxfxbqfkf;)V", "Lf70/iobyxmoadg;", "esjtqupxsv", "Lf70/iobyxmoadg;", "vipkmwdibw", "()Lf70/iobyxmoadg;", "setDialogManager", "(Lf70/iobyxmoadg;)V", "dialogManager", "Lq40/iobyxmoadg;", "lereixgezr", "Lq40/iobyxmoadg;", "jhduphickx", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/purchases/impl/list_details/presentation/iobyxmoadg;", "pmvmpeiblj", "Lgg/gtknphoqwx;", "jlmebxxoox", "()Lru/myspar/purchases/impl/list_details/presentation/iobyxmoadg;", "binder", "Lru/myspar/purchases/impl/list_details/presentation/wkgbmnqykc;", "zynmafqrjb", "Lzs/ppxfxbqfkf;", "ikoacuggdj", "()Lru/myspar/purchases/impl/list_details/presentation/wkgbmnqykc;", "viewImpl", "Lsx1/wkgbmnqykc;", "istkbnxepw", "Lys/ppxfxbqfkf;", "ribwqtqdhb", "()Lsx1/wkgbmnqykc;", "binding", "cdpycssgdh", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchasesListDetailsFragment extends Hilt_PurchasesListDetailsFragment<btonecajqb, ru.myspar.purchases.impl.list_details.presentation.zoijcleaow, ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public f70.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f102422yadqdtsiqt = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(PurchasesListDetailsFragment.class, "viewImpl", "getViewImpl()Lru/myspar/purchases/impl/list_details/presentation/PurchasesListDetailsViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(PurchasesListDetailsFragment.class, "binding", "getBinding()Lru/myspar/purchases/impl/databinding/FragmentPurchasesListDetailsBinding;", 0))};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final int f102421iozdgvuglv = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f102428zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102428zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f102428zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f102429yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f102430zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102430zdlpuopuiu = iobyxmoadgVar;
            this.f102429yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f102430zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f102429yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.list_details.presentation.PurchasesListDetailsFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final PurchasesListDetailsFragment iobyxmoadg(PurchasesListDetailsArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (PurchasesListDetailsFragment) b40.iobyxmoadg.zoijcleaow(new PurchasesListDetailsFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f102431yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f102432zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102432zdlpuopuiu = fragment;
            this.f102431yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f102431yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f102432zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f102433zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f102433zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f102433zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f102434zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f102434zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f102434zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f102435zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, sx1.wkgbmnqykc.class, "bind", "bind(Landroid/view/View;)Lru/myspar/purchases/impl/databinding/FragmentPurchasesListDetailsBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final sx1.wkgbmnqykc invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return sx1.wkgbmnqykc.iobyxmoadg(p13);
        }
    }

    public PurchasesListDetailsFragment() {
        super(nx1.gxszxtbevo.fragment_purchases_list_details);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: gy1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PurchasesListDetailsFragment.ydmasvzmpa(this.f38809zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f102435zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn czzsidtyhn(PurchasesListDetailsFragment purchasesListDetailsFragment, az1.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        purchasesListDetailsFragment.uwvvkdfqfp(null, it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void jztzpxfvev(final AddProductParams params, String message) {
        ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        f70.zoijcleaow.zoijcleaow(zoijcleaowVar.ppxfxbqfkf(oxmwwwfdhmVarRequireActivity, message, new tg.iobyxmoadg() { // from class: gy1.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PurchasesListDetailsFragment.xrmfcynszj(this.f38808zdlpuopuiu, params);
            }
        }, null), vipkmwdibw(), g70.eablkybsjg.iobyxmoadg("PURCHASE_LIST_DETAILS_SCREEN_KEY"));
    }

    private final void metgxyhuhe(az1.iobyxmoadg section) {
        f70.zoijcleaow.ppxfxbqfkf(PurchasesListActionsWithSectionDialogFragment.INSTANCE.iobyxmoadg(new PurchasesListActionsWithSectionDialogArgs(section)).opjhrmiecq(new draadjrbmk() { // from class: gy1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return PurchasesListDetailsFragment.rlfsiqarku(this.f38814zdlpuopuiu, (az1.iobyxmoadg) obj);
            }
        }).bfopjjpdmp(new draadjrbmk() { // from class: gy1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return PurchasesListDetailsFragment.czzsidtyhn(this.f38805zdlpuopuiu, (az1.iobyxmoadg) obj);
            }
        }), vipkmwdibw(), g70.eablkybsjg.iobyxmoadg("PURCHASE_LIST_DETAILS_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sx1.wkgbmnqykc ribwqtqdhb() {
        return (sx1.wkgbmnqykc) this.binding.iobyxmoadg(this, f102422yadqdtsiqt[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(PurchasesListDetailsFragment purchasesListDetailsFragment, az1.iobyxmoadg sectionMovedTo) {
        zdlpuopuiu.btonecajqb(sectionMovedTo, "sectionMovedTo");
        purchasesListDetailsFragment.pkzmftpjix().jyumaefscl(new ru.myspar.purchases.impl.list_details.presentation.zoijcleaow.vdvldrhtss(null, sectionMovedTo));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void uwvvkdfqfp(final String productId, final az1.iobyxmoadg section) {
        int i13 = (productId == null || kcexrzcfyt.zfvoamnweg(productId)) ? nx1.nufgyqmvbu.are_you_sure_you_want_to_delete_any_products : nx1.nufgyqmvbu.are_you_sure_you_want_to_delete_the_product;
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        f70.zoijcleaow.zoijcleaow(new rx.nufgyqmvbu.iobyxmoadg(oxmwwwfdhmVarRequireActivity, Boolean.TRUE, null, 4, null).agtfadlqog(i13).iobyxmoadg(new rx.iobyxmoadg(rx.zoijcleaow.PRIMARY, Integer.valueOf(nx1.nufgyqmvbu.action_delete), null, new tg.iobyxmoadg() { // from class: gy1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PurchasesListDetailsFragment.yfnezrywwk(this.f38812zdlpuopuiu, productId, section);
            }
        }, 4, null)).iobyxmoadg(new rx.iobyxmoadg(rx.zoijcleaow.SECONDARY, Integer.valueOf(nx1.nufgyqmvbu.action_close), null, null, 12, null)).ppxfxbqfkf(rx.ppxfxbqfkf.VERTICAL).zoijcleaow(), vipkmwdibw(), g70.eablkybsjg.iobyxmoadg("PURCHASE_LIST_DETAILS_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn xrmfcynszj(PurchasesListDetailsFragment purchasesListDetailsFragment, AddProductParams addProductParams) {
        purchasesListDetailsFragment.pkzmftpjix().jyumaefscl(new ru.myspar.purchases.impl.list_details.presentation.zoijcleaow.C2476zoijcleaow(addProductParams));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.purchases.impl.list_details.presentation.wkgbmnqykc ydmasvzmpa(PurchasesListDetailsFragment purchasesListDetailsFragment) {
        return new ru.myspar.purchases.impl.list_details.presentation.wkgbmnqykc(new istkbnxepw(purchasesListDetailsFragment) { // from class: ru.myspar.purchases.impl.list_details.presentation.PurchasesListDetailsFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((PurchasesListDetailsFragment) this.receiver).ribwqtqdhb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yfnezrywwk(PurchasesListDetailsFragment purchasesListDetailsFragment, String str, az1.iobyxmoadg iobyxmoadgVar) {
        purchasesListDetailsFragment.pkzmftpjix().jyumaefscl(new ru.myspar.purchases.impl.list_details.presentation.zoijcleaow.draadjrbmk(str, iobyxmoadgVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public ru.myspar.purchases.impl.list_details.presentation.wkgbmnqykc hcddaimhww() {
        return (ru.myspar.purchases.impl.list_details.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f102422yadqdtsiqt[0]);
    }

    public final q40.iobyxmoadg jhduphickx() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jlmebxxoox, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.eablkybsjg) {
            lmojexxdyd(((ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.eablkybsjg) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.lqeggnwhkg.f102448iobyxmoadg)) {
            r40.iobyxmoadg.ppxfxbqfkf(jhduphickx(), nx1.nufgyqmvbu.product_not_available_in_chosen_shop, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.gxszxtbevo) {
            r40.iobyxmoadg.btonecajqb(jhduphickx(), ((ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.gxszxtbevo) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.nufgyqmvbu.f102449iobyxmoadg)) {
            r40.iobyxmoadg.eablkybsjg(jhduphickx(), nx1.nufgyqmvbu.msg_product_adding_to_cart);
            return;
        }
        if (uiLabel instanceof ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.wkgbmnqykc) {
            ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.wkgbmnqykc wkgbmnqykcVar = (ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.wkgbmnqykc) uiLabel;
            uwvvkdfqfp(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow());
            return;
        }
        if (uiLabel instanceof ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.C2474ppxfxbqfkf) {
            metgxyhuhe(((ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.C2474ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.zoijcleaow) {
            ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.zoijcleaow zoijcleaowVar = (ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.zoijcleaow) uiLabel;
            jztzpxfvev(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = (ru.myspar.purchases.impl.list_details.presentation.ppxfxbqfkf.iobyxmoadg) uiLabel;
            HintUiModel hintUiModelZoijcleaow = iobyxmoadgVar.zoijcleaow();
            HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            st.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
        }
    }

    public final f70.iobyxmoadg vipkmwdibw() {
        f70.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }
}
