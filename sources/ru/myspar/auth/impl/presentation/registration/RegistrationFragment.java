package ru.myspar.auth.impl.presentation.registration;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import com.google.android.gms.common.Scopes;
import com.google.android.material.textfield.TextInputLayout;
import ge0.iwizpuwonk;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import rp.gtknphoqwx;
import ru.myspar.auth.api.model.RegistrationArgs;
import ru.myspar.auth.impl.presentation.registration.RegistrationFragment;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.domain.feature.emailverify.store.EmailVerifyDialogArgs;
import ru.myspar.legacy.presentation.dialogs.emailverify.EmailVerifyDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 _2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001`B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001a\u0010\u0007J\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0007J\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001b\u0010M\u001a\u00020H8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001b\u0010S\u001a\u00020N8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001b\u0010Y\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010J\u001a\u0004\b\\\u0010]¨\u0006a"}, d2 = {"Lru/myspar/auth/impl/presentation/registration/RegistrationFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lrp/gtknphoqwx;", "Lru/myspar/auth/impl/presentation/registration/ppxfxbqfkf;", "Lru/myspar/auth/impl/presentation/registration/wkgbmnqykc;", "Lp42/iobyxmoadg;", "<init>", "()V", "", Scopes.EMAIL, "Lgg/wwaezpbzkn;", "rlfsiqarku", "(Ljava/lang/String;)V", "message", "zfvoamnweg", "metgxyhuhe", "uwvvkdfqfp", "ydmasvzmpa", "Ljava/util/Date;", "selectedDate", "czzsidtyhn", "(Ljava/util/Date;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onStop", "msg", "dxjokdxxww", "uiLabel", "xrmfcynszj", "(Lru/myspar/auth/impl/presentation/registration/wkgbmnqykc;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lp42/zoijcleaow;", "esjtqupxsv", "Lp42/zoijcleaow;", "ikoacuggdj", "()Lp42/zoijcleaow;", "setSmsRetrievedUtils", "(Lp42/zoijcleaow;)V", "smsRetrievedUtils", "Ldt/zoijcleaow;", "lereixgezr", "Ldt/zoijcleaow;", "ribwqtqdhb", "()Ldt/zoijcleaow;", "setDateUtils", "(Ldt/zoijcleaow;)V", "dateUtils", "Lf70/iobyxmoadg;", "pmvmpeiblj", "Lf70/iobyxmoadg;", "vipkmwdibw", "()Lf70/iobyxmoadg;", "setDialogManager", "(Lf70/iobyxmoadg;)V", "dialogManager", "Lq40/iobyxmoadg;", "zynmafqrjb", "Lq40/iobyxmoadg;", "okpsazkaxt", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/auth/impl/presentation/registration/iobyxmoadg;", "istkbnxepw", "Lgg/gtknphoqwx;", "crxdokpmqz", "()Lru/myspar/auth/impl/presentation/registration/iobyxmoadg;", "binder", "Lru/myspar/auth/impl/presentation/registration/eablkybsjg;", "cdpycssgdh", "Lzs/ppxfxbqfkf;", "jztzpxfvev", "()Lru/myspar/auth/impl/presentation/registration/eablkybsjg;", "viewImpl", "Lyo/ppxfxbqfkf;", "yadqdtsiqt", "Lys/ppxfxbqfkf;", "jlmebxxoox", "()Lyo/ppxfxbqfkf;", "binding", "Lp42/ppxfxbqfkf;", "iozdgvuglv", "jhduphickx", "()Lp42/ppxfxbqfkf;", "smsReceiver", "lmojexxdyd", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegistrationFragment extends Hilt_RegistrationFragment<gtknphoqwx, ru.myspar.auth.impl.presentation.registration.ppxfxbqfkf, ru.myspar.auth.impl.presentation.registration.wkgbmnqykc> implements p42.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public p42.zoijcleaow smsRetrievedUtils;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx smsReceiver;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx binder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public dt.zoijcleaow dateUtils;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public f70.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f84650wwaezpbzkn = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(RegistrationFragment.class, "viewImpl", "getViewImpl()Lru/myspar/auth/impl/presentation/registration/RegistrationViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(RegistrationFragment.class, "binding", "getBinding()Lru/myspar/auth/impl/databinding/FragmentRegistrationBinding;", 0))};

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final int f84651ylkuphrtab = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f84660zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f84660zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f84660zdlpuopuiu.invoke();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f84661zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f84661zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f84661zdlpuopuiu).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.auth.impl.presentation.registration.RegistrationFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final RegistrationFragment iobyxmoadg(RegistrationArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (RegistrationFragment) b40.iobyxmoadg.zoijcleaow(new RegistrationFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f84662yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f84663zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f84663zdlpuopuiu = iobyxmoadgVar;
            this.f84662yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f84663zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f84662yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f84664yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f84665zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Fragment fragment, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f84665zdlpuopuiu = fragment;
            this.f84664yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f84664yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f84665zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* synthetic */ class ppxfxbqfkf extends vdvldrhtss implements draadjrbmk {
        ppxfxbqfkf(Object obj) {
            super(1, obj, ru.myspar.auth.impl.presentation.registration.eablkybsjg.class, "onDateSet", "onDateSet(Ljava/util/Date;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Date) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Date p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((ru.myspar.auth.impl.presentation.registration.eablkybsjg) this.receiver).hkdspvbjdz(p13);
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f84666zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment) {
            super(0);
            this.f84666zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f84666zdlpuopuiu;
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f84667zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, yo.ppxfxbqfkf.class, "bind", "bind(Landroid/view/View;)Lru/myspar/auth/impl/databinding/FragmentRegistrationBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final yo.ppxfxbqfkf invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return yo.ppxfxbqfkf.iobyxmoadg(p13);
        }
    }

    public RegistrationFragment() {
        super(uo.ppxfxbqfkf.fragment_registration);
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new eablkybsjg(new wkgbmnqykc(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new gxszxtbevo(gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(null, gtknphoqwxVarIobyxmoadg), new nufgyqmvbu(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: rp.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return RegistrationFragment.bfopjjpdmp(this.f83288zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f84667zdlpuopuiu);
        this.smsReceiver = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: rp.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return RegistrationFragment.oipsdeybqn(this.f83252zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.auth.impl.presentation.registration.eablkybsjg bfopjjpdmp(RegistrationFragment registrationFragment) {
        return new ru.myspar.auth.impl.presentation.registration.eablkybsjg(new istkbnxepw(registrationFragment) { // from class: ru.myspar.auth.impl.presentation.registration.RegistrationFragment.dxjokdxxww
            @Override // ah.draadjrbmk
            public Object get() {
                return ((RegistrationFragment) this.receiver).jlmebxxoox();
            }
        });
    }

    private final void czzsidtyhn(Date selectedDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(selectedDate);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(ribwqtqdhb().wkgbmnqykc());
        if (calendar.getTimeInMillis() < ribwqtqdhb().lqeggnwhkg().getTime() || calendar.getTimeInMillis() > ribwqtqdhb().wkgbmnqykc().getTime()) {
            calendar = calendar2;
        }
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new xa0.vdvldrhtss(contextRequireContext, Boolean.TRUE, null, new ppxfxbqfkf(hcddaimhww()), getString(uo.wkgbmnqykc.birth_date), calendar.getTime(), ribwqtqdhb().lqeggnwhkg(), ribwqtqdhb().wkgbmnqykc(), 4, null).show();
    }

    private final p42.ppxfxbqfkf jhduphickx() {
        return (p42.ppxfxbqfkf) this.smsReceiver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yo.ppxfxbqfkf jlmebxxoox() {
        return (yo.ppxfxbqfkf) this.binding.iobyxmoadg(this, f84650wwaezpbzkn[1]);
    }

    private final void metgxyhuhe() {
        jlmebxxoox().f125984esjtqupxsv.setErrorEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p42.ppxfxbqfkf oipsdeybqn(RegistrationFragment registrationFragment) {
        return new p42.ppxfxbqfkf(registrationFragment.ikoacuggdj(), new WeakReference(registrationFragment));
    }

    private final void rlfsiqarku(String email) {
        f70.zoijcleaow.ppxfxbqfkf(EmailVerifyDialogFragment.INSTANCE.iobyxmoadg(new EmailVerifyDialogArgs(email)), vipkmwdibw(), new g70.wkgbmnqykc.iobyxmoadg(null, 1, null));
        d40.iobyxmoadg.f26931iobyxmoadg.yadqdtsiqt(MainTab.MY_SPAR, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn sflfametgt(RegistrationFragment registrationFragment, String gender) {
        zdlpuopuiu.btonecajqb(gender, "gender");
        registrationFragment.pkzmftpjix().jyumaefscl(new ru.myspar.auth.impl.presentation.registration.ppxfxbqfkf.dxjokdxxww(gender));
        registrationFragment.jlmebxxoox().f126002wflxmlrfwp.setText(gender);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void uwvvkdfqfp() {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        rx.nufgyqmvbu.iobyxmoadg.gtknphoqwx(new rx.nufgyqmvbu.iobyxmoadg(contextRequireContext, Boolean.FALSE, null, 4, null).agtfadlqog(uo.wkgbmnqykc.error).lqeggnwhkg(uo.wkgbmnqykc.error_on_auth_message), uo.wkgbmnqykc.cancel, null, 2, null).draadjrbmk(uo.wkgbmnqykc.call_caption, new tg.iobyxmoadg() { // from class: rp.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return RegistrationFragment.yfnezrywwk(this.f83282zdlpuopuiu);
            }
        }).zoijcleaow().show();
    }

    private final void ydmasvzmpa() {
        iwizpuwonk iwizpuwonkVar = new iwizpuwonk();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        iwizpuwonkVar.ppxfxbqfkf(oxmwwwfdhmVarRequireActivity, new draadjrbmk() { // from class: rp.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return RegistrationFragment.sflfametgt(this.f83277zdlpuopuiu, (String) obj);
            }
        }).showAsDropDown(jlmebxxoox().f126002wflxmlrfwp, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yfnezrywwk(RegistrationFragment registrationFragment) {
        registrationFragment.pkzmftpjix().jyumaefscl(ru.myspar.auth.impl.presentation.registration.ppxfxbqfkf.eablkybsjg.f84683iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void zfvoamnweg(String message) {
        TextInputLayout textInputLayout = jlmebxxoox().f125984esjtqupxsv;
        if (message == null) {
            message = getString(uo.wkgbmnqykc.error_promo_not_valid);
            zdlpuopuiu.dxjokdxxww(message, "getString(...)");
        }
        textInputLayout.setError(message);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // p42.iobyxmoadg
    public void dxjokdxxww(String msg) {
        zdlpuopuiu.btonecajqb(msg, "msg");
        pkzmftpjix().jyumaefscl(new ru.myspar.auth.impl.presentation.registration.ppxfxbqfkf.oxmwwwfdhm(msg));
    }

    public final p42.zoijcleaow ikoacuggdj() {
        p42.zoijcleaow zoijcleaowVar = this.smsRetrievedUtils;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zdlpuopuiu.pmvmpeiblj("smsRetrievedUtils");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public ru.myspar.auth.impl.presentation.registration.eablkybsjg hcddaimhww() {
        return (ru.myspar.auth.impl.presentation.registration.eablkybsjg) this.viewImpl.iobyxmoadg(this, f84650wwaezpbzkn[0]);
    }

    public final q40.iobyxmoadg okpsazkaxt() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2 && resultCode == -1 && data != null) {
            pkzmftpjix().jyumaefscl(new ru.myspar.auth.impl.presentation.registration.ppxfxbqfkf.oxmwwwfdhm(ikoacuggdj().ppxfxbqfkf(data)));
        }
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        p42.zoijcleaow zoijcleaowVarIkoacuggdj = ikoacuggdj();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        zoijcleaowVarIkoacuggdj.wkgbmnqykc(oxmwwwfdhmVarRequireActivity);
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        if (Build.VERSION.SDK_INT >= 33) {
            oxmwwwfdhmVarRequireActivity.registerReceiver(jhduphickx(), ikoacuggdj().eablkybsjg(), 2);
        } else {
            oxmwwwfdhmVarRequireActivity.registerReceiver(jhduphickx(), ikoacuggdj().eablkybsjg());
        }
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        requireActivity().unregisterReceiver(jhduphickx());
        super.onStop();
    }

    public final dt.zoijcleaow ribwqtqdhb() {
        dt.zoijcleaow zoijcleaowVar = this.dateUtils;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zdlpuopuiu.pmvmpeiblj("dateUtils");
        return null;
    }

    public final f70.iobyxmoadg vipkmwdibw() {
        f70.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.auth.impl.presentation.registration.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.nufgyqmvbu) {
            r40.iobyxmoadg.gxszxtbevo(okpsazkaxt(), String.valueOf(((ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.nufgyqmvbu) uiLabel).iobyxmoadg()));
            return;
        }
        if (uiLabel instanceof ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.gxszxtbevo) {
            lmojexxdyd(((ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.gxszxtbevo) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.iobyxmoadg.f84701iobyxmoadg)) {
            metgxyhuhe();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.lqeggnwhkg.f84702iobyxmoadg)) {
            uwvvkdfqfp();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.dxjokdxxww.f84698iobyxmoadg)) {
            r40.iobyxmoadg.ppxfxbqfkf(okpsazkaxt(), uo.wkgbmnqykc.policy_accept_needed, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.btonecajqb) {
            zfvoamnweg(((ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.btonecajqb) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.ppxfxbqfkf) {
            czzsidtyhn(((ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.C1917wkgbmnqykc.f84704iobyxmoadg)) {
            ydmasvzmpa();
        } else if (uiLabel instanceof ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.eablkybsjg) {
            hcddaimhww().wypolnanlu(jlmebxxoox(), ((ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.eablkybsjg) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            rlfsiqarku(((ru.myspar.auth.impl.presentation.registration.wkgbmnqykc.zoijcleaow) uiLabel).iobyxmoadg());
        }
    }
}
