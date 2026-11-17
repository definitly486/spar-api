package ru.myspar.options.impl.options.presentation;

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
import ru.myspar.options.impl.options.presentation.OptionsFragment;
import ru.myspar.options.impl.themeswitch.domain.store.ThemeSwitchDialogArgs;
import ru.myspar.options.impl.themeswitch.presentation.ThemeSwitchDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 82\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00019B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u0006J!\u0010\u0011\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lru/myspar/options/impl/options/presentation/OptionsFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lqi0/lqeggnwhkg;", "Loi0/wkgbmnqykc;", "Lru/myspar/options/impl/options/presentation/zoijcleaow;", "<init>", "()V", "Lgg/wwaezpbzkn;", "ikoacuggdj", "", "message", "jhduphickx", "(Ljava/lang/String;)V", "xrmfcynszj", "subscriptionName", "", "isChecked", "jztzpxfvev", "(Ljava/lang/String;Z)V", "uiLabel", "vipkmwdibw", "(Lru/myspar/options/impl/options/presentation/zoijcleaow;)V", "Lro/iobyxmoadg;", "esjtqupxsv", "Lro/iobyxmoadg;", "ulzqkzuiru", "()Lro/iobyxmoadg;", "setAuthFeatureApi", "(Lro/iobyxmoadg;)V", "authFeatureApi", "Lq40/iobyxmoadg;", "lereixgezr", "Lq40/iobyxmoadg;", "jlmebxxoox", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/options/impl/options/presentation/iobyxmoadg;", "pmvmpeiblj", "Lgg/gtknphoqwx;", "sopmlzcsov", "()Lru/myspar/options/impl/options/presentation/iobyxmoadg;", "binder", "Lqi0/vdvldrhtss;", "zynmafqrjb", "Lzs/ppxfxbqfkf;", "ribwqtqdhb", "()Lqi0/vdvldrhtss;", "viewImpl", "Lni0/zoijcleaow;", "istkbnxepw", "Lys/ppxfxbqfkf;", "crxdokpmqz", "()Lni0/zoijcleaow;", "binding", "cdpycssgdh", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OptionsFragment extends Hilt_OptionsFragment<qi0.lqeggnwhkg, oi0.wkgbmnqykc, ru.myspar.options.impl.options.presentation.zoijcleaow> {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public ro.iobyxmoadg authFeatureApi;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f90919yadqdtsiqt = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(OptionsFragment.class, "viewImpl", "getViewImpl()Lru/myspar/options/impl/options/presentation/OptionsViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(OptionsFragment.class, "binding", "getBinding()Lru/myspar/options/impl/databinding/FragmentOptionsBinding;", 0))};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final int f90918iozdgvuglv = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f90925zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f90925zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f90925zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f90926yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f90927zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f90927zdlpuopuiu = iobyxmoadgVar;
            this.f90926yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f90927zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f90926yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.options.impl.options.presentation.OptionsFragment$iobyxmoadg, reason: from kotlin metadata */
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
        final /* synthetic */ gtknphoqwx f90928yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f90929zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f90929zdlpuopuiu = fragment;
            this.f90928yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f90928yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f90929zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f90930zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f90930zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f90930zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f90931zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f90931zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f90931zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f90932zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, ni0.zoijcleaow.class, "bind", "bind(Landroid/view/View;)Lru/myspar/options/impl/databinding/FragmentOptionsBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ni0.zoijcleaow invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return ni0.zoijcleaow.iobyxmoadg(p13);
        }
    }

    public OptionsFragment() {
        super(mi0.wkgbmnqykc.fragment_options);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: qi0.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return OptionsFragment.metgxyhuhe(this.f78902zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f90932zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ni0.zoijcleaow crxdokpmqz() {
        return (ni0.zoijcleaow) this.binding.iobyxmoadg(this, f90919yadqdtsiqt[1]);
    }

    private final void ikoacuggdj() {
        ro.iobyxmoadg iobyxmoadgVarUlzqkzuiru = ulzqkzuiru();
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        iobyxmoadgVarUlzqkzuiru.zoijcleaow(contextRequireContext, new tg.iobyxmoadg() { // from class: qi0.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return OptionsFragment.okpsazkaxt(this.f78892zdlpuopuiu);
            }
        }).show();
    }

    private final void jhduphickx(String message) {
        r40.iobyxmoadg.btonecajqb(jlmebxxoox(), message, null, null, 6, null);
    }

    private final void jztzpxfvev(String subscriptionName, boolean isChecked) {
        String string;
        if (!isChecked) {
            string = getString(mi0.eablkybsjg.auto_renewal_unchecked);
            zdlpuopuiu.lqeggnwhkg(string);
        } else if (subscriptionName == null || (string = getString(mi0.eablkybsjg.auto_renewal_checked, subscriptionName)) == null) {
            string = getString(mi0.eablkybsjg.auto_renewal_checked_empty_name);
            zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        }
        r40.iobyxmoadg.gxszxtbevo(jlmebxxoox(), string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qi0.vdvldrhtss metgxyhuhe(OptionsFragment optionsFragment) {
        return new qi0.vdvldrhtss(new istkbnxepw(optionsFragment) { // from class: ru.myspar.options.impl.options.presentation.OptionsFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((OptionsFragment) this.receiver).crxdokpmqz();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn okpsazkaxt(OptionsFragment optionsFragment) {
        optionsFragment.pkzmftpjix().jyumaefscl(oi0.wkgbmnqykc.eablkybsjg.f72956iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void xrmfcynszj() {
        ThemeSwitchDialogFragment themeSwitchDialogFragmentIobyxmoadg = ThemeSwitchDialogFragment.INSTANCE.iobyxmoadg(new ThemeSwitchDialogArgs(null, 1, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        themeSwitchDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
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
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public qi0.vdvldrhtss hcddaimhww() {
        return (qi0.vdvldrhtss) this.viewImpl.iobyxmoadg(this, f90919yadqdtsiqt[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final ro.iobyxmoadg ulzqkzuiru() {
        ro.iobyxmoadg iobyxmoadgVar = this.authFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("authFeatureApi");
        return null;
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.options.impl.options.presentation.zoijcleaow uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.options.impl.options.presentation.zoijcleaow.iobyxmoadg) {
            ru.myspar.options.impl.options.presentation.zoijcleaow.iobyxmoadg iobyxmoadgVar = (ru.myspar.options.impl.options.presentation.zoijcleaow.iobyxmoadg) uiLabel;
            jztzpxfvev(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow());
            return;
        }
        if (uiLabel instanceof ru.myspar.options.impl.options.presentation.zoijcleaow.wkgbmnqykc) {
            lmojexxdyd(((ru.myspar.options.impl.options.presentation.zoijcleaow.wkgbmnqykc) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.options.impl.options.presentation.zoijcleaow.eablkybsjg.f90942iobyxmoadg)) {
            xrmfcynszj();
        } else if (uiLabel instanceof ru.myspar.options.impl.options.presentation.zoijcleaow.ppxfxbqfkf) {
            ikoacuggdj();
        } else {
            if (!(uiLabel instanceof ru.myspar.options.impl.options.presentation.zoijcleaow.C2110zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            jhduphickx(((ru.myspar.options.impl.options.presentation.zoijcleaow.C2110zoijcleaow) uiLabel).iobyxmoadg());
        }
    }
}
