package ru.myspar.auth.impl.presentation.registrationverification;

import ah.gtknphoqwx;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
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
import ru.myspar.auth.api.model.RegistrationVerificationArgs;
import ru.myspar.auth.impl.presentation.registrationverification.RegistrationVerificationFragment;
import sp.dxjokdxxww;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001%B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lru/myspar/auth/impl/presentation/registrationverification/RegistrationVerificationFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lsp/dxjokdxxww;", "Lru/myspar/auth/impl/presentation/registrationverification/ppxfxbqfkf;", "Lru/myspar/auth/impl/presentation/registrationverification/wkgbmnqykc;", "<init>", "()V", "Lgg/wwaezpbzkn;", "vipkmwdibw", "ikoacuggdj", "onDestroyView", "uiLabel", "ribwqtqdhb", "(Lru/myspar/auth/impl/presentation/registrationverification/wkgbmnqykc;)V", "Lru/myspar/auth/impl/presentation/registrationverification/iobyxmoadg;", "esjtqupxsv", "Lgg/gtknphoqwx;", "sopmlzcsov", "()Lru/myspar/auth/impl/presentation/registrationverification/iobyxmoadg;", "binder", "Lru/myspar/auth/impl/presentation/registrationverification/eablkybsjg;", "lereixgezr", "Lzs/ppxfxbqfkf;", "jlmebxxoox", "()Lru/myspar/auth/impl/presentation/registrationverification/eablkybsjg;", "viewImpl", "Lyo/wkgbmnqykc;", "pmvmpeiblj", "Lys/ppxfxbqfkf;", "crxdokpmqz", "()Lyo/wkgbmnqykc;", "binding", "Landroid/app/Dialog;", "zynmafqrjb", "Landroid/app/Dialog;", "existingUserDialog", "istkbnxepw", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegistrationVerificationFragment extends Hilt_RegistrationVerificationFragment<dxjokdxxww, ru.myspar.auth.impl.presentation.registrationverification.ppxfxbqfkf, ru.myspar.auth.impl.presentation.registrationverification.wkgbmnqykc> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    static final /* synthetic */ gtknphoqwx[] f84711cdpycssgdh = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(RegistrationVerificationFragment.class, "viewImpl", "getViewImpl()Lru/myspar/auth/impl/presentation/registrationverification/RegistrationVerificationViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(RegistrationVerificationFragment.class, "binding", "getBinding()Lru/myspar/auth/impl/databinding/FragmentRegistrationVerificationBinding;", 0))};

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f84713yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx binder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private Dialog existingUserDialog;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f84718zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f84718zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f84718zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f84719yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f84720zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f84720zdlpuopuiu = iobyxmoadgVar;
            this.f84719yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f84720zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f84719yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.auth.impl.presentation.registrationverification.RegistrationVerificationFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final RegistrationVerificationFragment iobyxmoadg(RegistrationVerificationArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (RegistrationVerificationFragment) b40.iobyxmoadg.zoijcleaow(new RegistrationVerificationFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f84721yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f84722zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f84722zdlpuopuiu = fragment;
            this.f84721yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f84721yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f84722zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f84723zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f84723zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f84723zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f84724zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f84724zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f84724zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f84725zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, yo.wkgbmnqykc.class, "bind", "bind(Landroid/view/View;)Lru/myspar/auth/impl/databinding/FragmentRegistrationVerificationBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final yo.wkgbmnqykc invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return yo.wkgbmnqykc.iobyxmoadg(p13);
        }
    }

    public RegistrationVerificationFragment() {
        super(uo.ppxfxbqfkf.fragment_registration_verification);
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: sp.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return RegistrationVerificationFragment.jztzpxfvev(this.f107799zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f84725zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yo.wkgbmnqykc crxdokpmqz() {
        return (yo.wkgbmnqykc) this.binding.iobyxmoadg(this, f84711cdpycssgdh[1]);
    }

    private final void ikoacuggdj() {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        rx.nufgyqmvbu.iobyxmoadg.gtknphoqwx(new rx.nufgyqmvbu.iobyxmoadg(contextRequireContext, Boolean.FALSE, null, 4, null).agtfadlqog(uo.wkgbmnqykc.error).lqeggnwhkg(uo.wkgbmnqykc.error_on_registration_message), uo.wkgbmnqykc.cancel, null, 2, null).draadjrbmk(uo.wkgbmnqykc.call_caption, new tg.iobyxmoadg() { // from class: sp.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return RegistrationVerificationFragment.okpsazkaxt(this.f107801zdlpuopuiu);
            }
        }).zoijcleaow().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jhduphickx(RegistrationVerificationFragment registrationVerificationFragment) {
        registrationVerificationFragment.pkzmftpjix().jyumaefscl(ru.myspar.auth.impl.presentation.registrationverification.ppxfxbqfkf.eablkybsjg.f84737iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.auth.impl.presentation.registrationverification.eablkybsjg jztzpxfvev(RegistrationVerificationFragment registrationVerificationFragment) {
        return new ru.myspar.auth.impl.presentation.registrationverification.eablkybsjg(new istkbnxepw(registrationVerificationFragment) { // from class: ru.myspar.auth.impl.presentation.registrationverification.RegistrationVerificationFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((RegistrationVerificationFragment) this.receiver).crxdokpmqz();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn okpsazkaxt(RegistrationVerificationFragment registrationVerificationFragment) {
        registrationVerificationFragment.pkzmftpjix().jyumaefscl(ru.myspar.auth.impl.presentation.registrationverification.ppxfxbqfkf.zoijcleaow.f84742iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void vipkmwdibw() {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        rx.nufgyqmvbu.iobyxmoadg iobyxmoadgVar = new rx.nufgyqmvbu.iobyxmoadg(contextRequireContext, Boolean.FALSE, null, 4, null);
        String string = getString(uo.wkgbmnqykc.existing_user_dialog_caption);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        rx.nufgyqmvbu nufgyqmvbuVarZoijcleaow = iobyxmoadgVar.ojitshcjhn(string).lqeggnwhkg(uo.wkgbmnqykc.existing_user_dialog_message).btonecajqb(uo.wkgbmnqykc.f114054ok, new tg.iobyxmoadg() { // from class: sp.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return RegistrationVerificationFragment.jhduphickx(this.f107807zdlpuopuiu);
            }
        }).zoijcleaow();
        this.existingUserDialog = nufgyqmvbuVarZoijcleaow;
        nufgyqmvbuVarZoijcleaow.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jlmebxxoox, reason: merged with bridge method [inline-methods] */
    public ru.myspar.auth.impl.presentation.registrationverification.eablkybsjg hcddaimhww() {
        return (ru.myspar.auth.impl.presentation.registrationverification.eablkybsjg) this.viewImpl.iobyxmoadg(this, f84711cdpycssgdh[0]);
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = this.existingUserDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        super.onDestroyView();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.auth.impl.presentation.registrationverification.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.auth.impl.presentation.registrationverification.wkgbmnqykc.iobyxmoadg) {
            lmojexxdyd(((ru.myspar.auth.impl.presentation.registrationverification.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg());
        } else if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.auth.impl.presentation.registrationverification.wkgbmnqykc.zoijcleaow.f84745iobyxmoadg)) {
            vipkmwdibw();
        } else {
            if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.auth.impl.presentation.registrationverification.wkgbmnqykc.ppxfxbqfkf.f84744iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ikoacuggdj();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }
}
