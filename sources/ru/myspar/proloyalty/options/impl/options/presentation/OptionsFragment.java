package ru.myspar.proloyalty.options.impl.options.presentation;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
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
import ru.myspar.proloyalty.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;
import ru.myspar.proloyalty.options.impl.options.presentation.OptionsFragment;
import ru.myspar.proloyalty.options.impl.themeswitch.domain.store.ThemeSwitchDialogArgs;
import ru.myspar.proloyalty.options.impl.themeswitch.presentation.ThemeSwitchDialogFragment;
import ru.myspar.proloyalty.subscription.api.model.SubscriptionSurveyDialogArgs;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 =2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001>B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lru/myspar/proloyalty/options/impl/options/presentation/OptionsFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lqf1/lqeggnwhkg;", "Lof1/wkgbmnqykc;", "Lru/myspar/proloyalty/options/impl/options/presentation/zoijcleaow;", "<init>", "()V", "Lgg/wwaezpbzkn;", "okpsazkaxt", "", "message", "ikoacuggdj", "(Ljava/lang/String;)V", "metgxyhuhe", "surveyUrl", "xrmfcynszj", "uiLabel", "jhduphickx", "(Lru/myspar/proloyalty/options/impl/options/presentation/zoijcleaow;)V", "Lan0/iobyxmoadg;", "esjtqupxsv", "Lan0/iobyxmoadg;", "ulzqkzuiru", "()Lan0/iobyxmoadg;", "setAuthFeatureApi", "(Lan0/iobyxmoadg;)V", "authFeatureApi", "Lbu1/iobyxmoadg;", "lereixgezr", "Lbu1/iobyxmoadg;", "ribwqtqdhb", "()Lbu1/iobyxmoadg;", "setSubscriptionFeatureApi", "(Lbu1/iobyxmoadg;)V", "subscriptionFeatureApi", "Lz21/iobyxmoadg;", "pmvmpeiblj", "Lz21/iobyxmoadg;", "jlmebxxoox", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/options/impl/options/presentation/iobyxmoadg;", "zynmafqrjb", "Lgg/gtknphoqwx;", "sopmlzcsov", "()Lru/myspar/proloyalty/options/impl/options/presentation/iobyxmoadg;", "binder", "Lqf1/vdvldrhtss;", "istkbnxepw", "Ltr0/ppxfxbqfkf;", "vipkmwdibw", "()Lqf1/vdvldrhtss;", "viewImpl", "Lnf1/zoijcleaow;", "cdpycssgdh", "Lsr0/ppxfxbqfkf;", "crxdokpmqz", "()Lnf1/zoijcleaow;", "binding", "yadqdtsiqt", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OptionsFragment extends Hilt_OptionsFragment<qf1.lqeggnwhkg, of1.wkgbmnqykc, ru.myspar.proloyalty.options.impl.options.presentation.zoijcleaow> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public an0.iobyxmoadg authFeatureApi;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public bu1.iobyxmoadg subscriptionFeatureApi;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f98570iozdgvuglv = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(OptionsFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/options/impl/options/presentation/OptionsViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(OptionsFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/options/impl/databinding/FragmentOptionsProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final int f98571lmojexxdyd = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f98579zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f98579zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f98579zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f98580yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f98581zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f98581zdlpuopuiu = iobyxmoadgVar;
            this.f98580yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f98581zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f98580yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.options.impl.options.presentation.OptionsFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final OptionsFragment iobyxmoadg() {
            return new OptionsFragment();
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f98582yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f98583zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f98583zdlpuopuiu = fragment;
            this.f98582yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f98582yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f98583zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f98584zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f98584zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f98584zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f98585zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f98585zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f98585zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f98586zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, nf1.zoijcleaow.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/options/impl/databinding/FragmentOptionsProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final nf1.zoijcleaow invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return nf1.zoijcleaow.iobyxmoadg(p13);
        }
    }

    public OptionsFragment() {
        super(mf1.wkgbmnqykc.fragment_options_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: qf1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return OptionsFragment.rlfsiqarku(this.f78753zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f98586zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nf1.zoijcleaow crxdokpmqz() {
        return (nf1.zoijcleaow) this.binding.iobyxmoadg(this, f98570iozdgvuglv[1]);
    }

    private final void ikoacuggdj(String message) {
        a31.iobyxmoadg.btonecajqb(jlmebxxoox(), message, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jztzpxfvev(OptionsFragment optionsFragment) {
        optionsFragment.pkzmftpjix().jyumaefscl(of1.wkgbmnqykc.eablkybsjg.f72817iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void metgxyhuhe() {
        ThemeSwitchDialogFragment themeSwitchDialogFragmentIobyxmoadg = ThemeSwitchDialogFragment.INSTANCE.iobyxmoadg(new ThemeSwitchDialogArgs(null, 1, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        themeSwitchDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    private final void okpsazkaxt() {
        an0.iobyxmoadg iobyxmoadgVarUlzqkzuiru = ulzqkzuiru();
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        iobyxmoadgVarUlzqkzuiru.zoijcleaow(contextRequireContext, new tg.iobyxmoadg() { // from class: qf1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return OptionsFragment.jztzpxfvev(this.f78763zdlpuopuiu);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qf1.vdvldrhtss rlfsiqarku(OptionsFragment optionsFragment) {
        return new qf1.vdvldrhtss(new istkbnxepw(optionsFragment) { // from class: ru.myspar.proloyalty.options.impl.options.presentation.OptionsFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((OptionsFragment) this.receiver).crxdokpmqz();
            }
        });
    }

    private final void xrmfcynszj(String surveyUrl) {
        BaseBottomSheetDialogFragment baseBottomSheetDialogFragmentIobyxmoadg = ribwqtqdhb().iobyxmoadg(new SubscriptionSurveyDialogArgs(surveyUrl));
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseBottomSheetDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.options.impl.options.presentation.zoijcleaow uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.options.impl.options.presentation.zoijcleaow.ppxfxbqfkf) {
            lmojexxdyd(((ru.myspar.proloyalty.options.impl.options.presentation.zoijcleaow.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.options.impl.options.presentation.zoijcleaow.eablkybsjg.f98594iobyxmoadg)) {
            metgxyhuhe();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.options.impl.options.presentation.zoijcleaow.C2357zoijcleaow) {
            okpsazkaxt();
        } else if (uiLabel instanceof ru.myspar.proloyalty.options.impl.options.presentation.zoijcleaow.iobyxmoadg) {
            ikoacuggdj(((ru.myspar.proloyalty.options.impl.options.presentation.zoijcleaow.iobyxmoadg) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.options.impl.options.presentation.zoijcleaow.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            xrmfcynszj(((ru.myspar.proloyalty.options.impl.options.presentation.zoijcleaow.wkgbmnqykc) uiLabel).iobyxmoadg());
        }
    }

    public final z21.iobyxmoadg jlmebxxoox() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    public final bu1.iobyxmoadg ribwqtqdhb() {
        bu1.iobyxmoadg iobyxmoadgVar = this.subscriptionFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("subscriptionFeatureApi");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final an0.iobyxmoadg ulzqkzuiru() {
        an0.iobyxmoadg iobyxmoadgVar = this.authFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("authFeatureApi");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public qf1.vdvldrhtss hcddaimhww() {
        return (qf1.vdvldrhtss) this.viewImpl.iobyxmoadg(this, f98570iozdgvuglv[0]);
    }
}
