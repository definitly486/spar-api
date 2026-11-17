package ru.myspar.legacy.presentation.screen.personaldata;

import ah.gtknphoqwx;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import com.google.android.gms.common.Scopes;
import ge0.iwizpuwonk;
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
import qc0.dxjokdxxww;
import ru.myspar.domain.feature.emailverify.store.EmailVerifyDialogArgs;
import ru.myspar.legacy.presentation.dialogs.emailverify.EmailVerifyDialogFragment;
import ru.myspar.legacy.presentation.screen.personaldata.PersonalDataFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ,2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001-B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lru/myspar/legacy/presentation/screen/personaldata/PersonalDataFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lqc0/dxjokdxxww;", "Lru/myspar/legacy/presentation/screen/personaldata/ppxfxbqfkf;", "Lru/myspar/legacy/presentation/screen/personaldata/wkgbmnqykc;", "<init>", "()V", "", Scopes.EMAIL, "Lgg/wwaezpbzkn;", "jhduphickx", "(Ljava/lang/String;)V", "error", "vipkmwdibw", "ikoacuggdj", "uiLabel", "ribwqtqdhb", "(Lru/myspar/legacy/presentation/screen/personaldata/wkgbmnqykc;)V", "Lq40/iobyxmoadg;", "esjtqupxsv", "Lq40/iobyxmoadg;", "crxdokpmqz", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/legacy/presentation/screen/personaldata/iobyxmoadg;", "lereixgezr", "Lgg/gtknphoqwx;", "ulzqkzuiru", "()Lru/myspar/legacy/presentation/screen/personaldata/iobyxmoadg;", "binder", "Lru/myspar/legacy/presentation/screen/personaldata/eablkybsjg;", "pmvmpeiblj", "Lzs/ppxfxbqfkf;", "jlmebxxoox", "()Lru/myspar/legacy/presentation/screen/personaldata/eablkybsjg;", "viewImpl", "Lm60/yadqdtsiqt;", "zynmafqrjb", "Lys/ppxfxbqfkf;", "sopmlzcsov", "()Lm60/yadqdtsiqt;", "binding", "istkbnxepw", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PersonalDataFragment extends Hilt_PersonalDataFragment<dxjokdxxww, ru.myspar.legacy.presentation.screen.personaldata.ppxfxbqfkf, ru.myspar.legacy.presentation.screen.personaldata.wkgbmnqykc> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    static final /* synthetic */ gtknphoqwx[] f89346cdpycssgdh = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(PersonalDataFragment.class, "viewImpl", "getViewImpl()Lru/myspar/legacy/presentation/screen/personaldata/PersonalDataViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(PersonalDataFragment.class, "binding", "getBinding()Lru/myspar/databinding/FragmentPersonalDataBinding;", 0))};

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f89348yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx binder;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f89353zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f89353zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f89353zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f89354yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f89355zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f89355zdlpuopuiu = iobyxmoadgVar;
            this.f89354yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f89355zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f89354yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.personaldata.PersonalDataFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final PersonalDataFragment iobyxmoadg() {
            return new PersonalDataFragment();
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f89356yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f89357zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f89357zdlpuopuiu = fragment;
            this.f89356yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f89356yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f89357zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f89358zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f89358zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f89358zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f89359zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f89359zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f89359zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f89360zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, m60.yadqdtsiqt.class, "bind", "bind(Landroid/view/View;)Lru/myspar/databinding/FragmentPersonalDataBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final m60.yadqdtsiqt invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return m60.yadqdtsiqt.iobyxmoadg(p13);
        }
    }

    public PersonalDataFragment() {
        super(pm.gxszxtbevo.fragment_personal_data);
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: qc0.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PersonalDataFragment.jztzpxfvev(this.f78503zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f89360zdlpuopuiu);
    }

    private final void ikoacuggdj() {
        iwizpuwonk iwizpuwonkVar = new iwizpuwonk();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        iwizpuwonkVar.ppxfxbqfkf(oxmwwwfdhmVarRequireActivity, new draadjrbmk() { // from class: qc0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return PersonalDataFragment.okpsazkaxt(this.f78496zdlpuopuiu, (String) obj);
            }
        }).showAsDropDown(sopmlzcsov().f66113btonecajqb, 0, 0);
    }

    private final void jhduphickx(String email) {
        EmailVerifyDialogFragment emailVerifyDialogFragmentIobyxmoadg = EmailVerifyDialogFragment.INSTANCE.iobyxmoadg(new EmailVerifyDialogArgs(email));
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        emailVerifyDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.legacy.presentation.screen.personaldata.eablkybsjg jztzpxfvev(PersonalDataFragment personalDataFragment) {
        return new ru.myspar.legacy.presentation.screen.personaldata.eablkybsjg(new istkbnxepw(personalDataFragment) { // from class: ru.myspar.legacy.presentation.screen.personaldata.PersonalDataFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((PersonalDataFragment) this.receiver).sopmlzcsov();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn okpsazkaxt(PersonalDataFragment personalDataFragment, String gender) {
        zdlpuopuiu.btonecajqb(gender, "gender");
        personalDataFragment.pkzmftpjix().jyumaefscl(new ru.myspar.legacy.presentation.screen.personaldata.ppxfxbqfkf.eablkybsjg(gender));
        personalDataFragment.sopmlzcsov().f66113btonecajqb.setText(gender);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m60.yadqdtsiqt sopmlzcsov() {
        return (m60.yadqdtsiqt) this.binding.iobyxmoadg(this, f89346cdpycssgdh[1]);
    }

    private final void vipkmwdibw(String error) {
        if (error != null) {
            r40.iobyxmoadg.wkgbmnqykc(crxdokpmqz(), error, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
        } else {
            r40.iobyxmoadg.ppxfxbqfkf(crxdokpmqz(), pm.dxjokdxxww.error_email_taken, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
        }
    }

    public final q40.iobyxmoadg crxdokpmqz() {
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
    public ru.myspar.legacy.presentation.screen.personaldata.eablkybsjg hcddaimhww() {
        return (ru.myspar.legacy.presentation.screen.personaldata.eablkybsjg) this.viewImpl.iobyxmoadg(this, f89346cdpycssgdh[0]);
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.legacy.presentation.screen.personaldata.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.legacy.presentation.screen.personaldata.wkgbmnqykc.ppxfxbqfkf) {
            lmojexxdyd(((ru.myspar.legacy.presentation.screen.personaldata.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.legacy.presentation.screen.personaldata.wkgbmnqykc.zoijcleaow) {
            jhduphickx(((ru.myspar.legacy.presentation.screen.personaldata.wkgbmnqykc.zoijcleaow) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.legacy.presentation.screen.personaldata.wkgbmnqykc.iobyxmoadg) {
            vipkmwdibw(((ru.myspar.legacy.presentation.screen.personaldata.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg());
        } else {
            if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.legacy.presentation.screen.personaldata.wkgbmnqykc.C2047wkgbmnqykc.f89378iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ikoacuggdj();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }
}
