package ru.myspar.proloyalty.purchases.impl.list_details.presentation;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
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
import mj.kcexrzcfyt;
import mj1.dxjokdxxww;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.purchases.api.model.PurchasesListDetailsArgs;
import ru.myspar.proloyalty.purchases.impl.list_actions_with_section.domain.store.PurchasesListActionsWithSectionDialogArgs;
import ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.PurchasesListActionsWithSectionDialogFragment;
import ru.myspar.proloyalty.purchases.impl.list_details.presentation.PurchasesListDetailsFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 52\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00016B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lru/myspar/proloyalty/purchases/impl/list_details/presentation/PurchasesListDetailsFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lmj1/dxjokdxxww;", "Lru/myspar/proloyalty/purchases/impl/list_details/presentation/zoijcleaow;", "Lru/myspar/proloyalty/purchases/impl/list_details/presentation/ppxfxbqfkf;", "<init>", "()V", "", "productId", "Lgk1/iobyxmoadg;", "section", "Lgg/wwaezpbzkn;", "metgxyhuhe", "(Ljava/lang/String;Lgk1/iobyxmoadg;)V", "okpsazkaxt", "(Lgk1/iobyxmoadg;)V", "uiLabel", "ikoacuggdj", "(Lru/myspar/proloyalty/purchases/impl/list_details/presentation/ppxfxbqfkf;)V", "Lu51/iobyxmoadg;", "esjtqupxsv", "Lu51/iobyxmoadg;", "ribwqtqdhb", "()Lu51/iobyxmoadg;", "setDialogManager", "(Lu51/iobyxmoadg;)V", "dialogManager", "Lz21/iobyxmoadg;", "lereixgezr", "Lz21/iobyxmoadg;", "vipkmwdibw", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/purchases/impl/list_details/presentation/iobyxmoadg;", "pmvmpeiblj", "Lgg/gtknphoqwx;", "crxdokpmqz", "()Lru/myspar/proloyalty/purchases/impl/list_details/presentation/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/purchases/impl/list_details/presentation/wkgbmnqykc;", "zynmafqrjb", "Ltr0/ppxfxbqfkf;", "jhduphickx", "()Lru/myspar/proloyalty/purchases/impl/list_details/presentation/wkgbmnqykc;", "viewImpl", "Lyi1/wkgbmnqykc;", "istkbnxepw", "Lsr0/ppxfxbqfkf;", "jlmebxxoox", "()Lyi1/wkgbmnqykc;", "binding", "cdpycssgdh", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchasesListDetailsFragment extends Hilt_PurchasesListDetailsFragment<dxjokdxxww, ru.myspar.proloyalty.purchases.impl.list_details.presentation.zoijcleaow, ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public u51.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f99714yadqdtsiqt = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(PurchasesListDetailsFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/purchases/impl/list_details/presentation/PurchasesListDetailsViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(PurchasesListDetailsFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/purchases/impl/databinding/FragmentPurchasesListDetailsProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final int f99713iozdgvuglv = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99720zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99720zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f99720zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99721yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99722zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99722zdlpuopuiu = iobyxmoadgVar;
            this.f99721yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f99722zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99721yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.list_details.presentation.PurchasesListDetailsFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final PurchasesListDetailsFragment iobyxmoadg(PurchasesListDetailsArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (PurchasesListDetailsFragment) g21.iobyxmoadg.zoijcleaow(new PurchasesListDetailsFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99723yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f99724zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99724zdlpuopuiu = fragment;
            this.f99723yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99723yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f99724zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f99725zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f99725zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f99725zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99726zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f99726zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f99726zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f99727zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, yi1.wkgbmnqykc.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/purchases/impl/databinding/FragmentPurchasesListDetailsProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final yi1.wkgbmnqykc invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return yi1.wkgbmnqykc.iobyxmoadg(p13);
        }
    }

    public PurchasesListDetailsFragment() {
        super(ti1.gxszxtbevo.fragment_purchases_list_details_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: mj1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PurchasesListDetailsFragment.czzsidtyhn(this.f67351zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f99727zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.purchases.impl.list_details.presentation.wkgbmnqykc czzsidtyhn(PurchasesListDetailsFragment purchasesListDetailsFragment) {
        return new ru.myspar.proloyalty.purchases.impl.list_details.presentation.wkgbmnqykc(new istkbnxepw(purchasesListDetailsFragment) { // from class: ru.myspar.proloyalty.purchases.impl.list_details.presentation.PurchasesListDetailsFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((PurchasesListDetailsFragment) this.receiver).jlmebxxoox();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yi1.wkgbmnqykc jlmebxxoox() {
        return (yi1.wkgbmnqykc) this.binding.iobyxmoadg(this, f99714yadqdtsiqt[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jztzpxfvev(PurchasesListDetailsFragment purchasesListDetailsFragment, gk1.iobyxmoadg sectionMovedTo) {
        zdlpuopuiu.btonecajqb(sectionMovedTo, "sectionMovedTo");
        purchasesListDetailsFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.purchases.impl.list_details.presentation.zoijcleaow.rgvfuqvkyq(null, sectionMovedTo));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void metgxyhuhe(final String productId, final gk1.iobyxmoadg section) {
        int i13 = (productId == null || kcexrzcfyt.zfvoamnweg(productId)) ? ti1.nufgyqmvbu.proloyalty_are_you_sure_you_want_to_delete_any_products : ti1.nufgyqmvbu.proloyalty_are_you_sure_you_want_to_delete_the_product;
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        u51.zoijcleaow.wkgbmnqykc(new ow0.nufgyqmvbu.iobyxmoadg(oxmwwwfdhmVarRequireActivity, Boolean.TRUE, null, 4, null).agtfadlqog(i13).iobyxmoadg(new ow0.iobyxmoadg(ow0.zoijcleaow.PRIMARY, Integer.valueOf(ti1.nufgyqmvbu.proloyalty_action_delete), null, new tg.iobyxmoadg() { // from class: mj1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PurchasesListDetailsFragment.rlfsiqarku(this.f67354zdlpuopuiu, productId, section);
            }
        }, 4, null)).iobyxmoadg(new ow0.iobyxmoadg(ow0.zoijcleaow.SECONDARY, Integer.valueOf(ti1.nufgyqmvbu.proloyalty_action_close), null, null, 12, null)).ppxfxbqfkf(ow0.ppxfxbqfkf.VERTICAL).zoijcleaow(), ribwqtqdhb(), v51.eablkybsjg.iobyxmoadg("PURCHASE_LIST_DETAILS_SCREEN_KEY"));
    }

    private final void okpsazkaxt(gk1.iobyxmoadg section) {
        u51.zoijcleaow.zoijcleaow(PurchasesListActionsWithSectionDialogFragment.INSTANCE.iobyxmoadg(new PurchasesListActionsWithSectionDialogArgs(section)).opjhrmiecq(new draadjrbmk() { // from class: mj1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return PurchasesListDetailsFragment.jztzpxfvev(this.f67348zdlpuopuiu, (gk1.iobyxmoadg) obj);
            }
        }).bfopjjpdmp(new draadjrbmk() { // from class: mj1.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return PurchasesListDetailsFragment.xrmfcynszj(this.f67350zdlpuopuiu, (gk1.iobyxmoadg) obj);
            }
        }), ribwqtqdhb(), v51.eablkybsjg.iobyxmoadg("PURCHASE_LIST_DETAILS_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(PurchasesListDetailsFragment purchasesListDetailsFragment, String str, gk1.iobyxmoadg iobyxmoadgVar) {
        purchasesListDetailsFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.purchases.impl.list_details.presentation.zoijcleaow.gtknphoqwx(str, iobyxmoadgVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn xrmfcynszj(PurchasesListDetailsFragment purchasesListDetailsFragment, gk1.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        purchasesListDetailsFragment.metgxyhuhe(null, it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.wkgbmnqykc) {
            lmojexxdyd(((ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.wkgbmnqykc) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.gxszxtbevo.f99735iobyxmoadg)) {
            a31.iobyxmoadg.ppxfxbqfkf(vipkmwdibw(), ti1.nufgyqmvbu.proloyalty_product_not_available_in_chosen_shop, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.eablkybsjg) {
            a31.iobyxmoadg.btonecajqb(vipkmwdibw(), ((ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.eablkybsjg) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.lqeggnwhkg.f99739iobyxmoadg)) {
            a31.iobyxmoadg.eablkybsjg(vipkmwdibw(), ti1.nufgyqmvbu.proloyalty_msg_product_adding_to_cart);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.C2392ppxfxbqfkf) {
            ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.C2392ppxfxbqfkf c2392ppxfxbqfkf = (ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.C2392ppxfxbqfkf) uiLabel;
            metgxyhuhe(c2392ppxfxbqfkf.iobyxmoadg(), c2392ppxfxbqfkf.zoijcleaow());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.zoijcleaow) {
            okpsazkaxt(((ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (!(uiLabel instanceof ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = (ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf.iobyxmoadg) uiLabel;
        HintUiModel hintUiModelZoijcleaow = iobyxmoadgVar.zoijcleaow();
        HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        ms0.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.purchases.impl.list_details.presentation.wkgbmnqykc hcddaimhww() {
        return (ru.myspar.proloyalty.purchases.impl.list_details.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f99714yadqdtsiqt[0]);
    }

    public final u51.iobyxmoadg ribwqtqdhb() {
        u51.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
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
