package ru.myspar.auth.impl.presentation.authbysms;

import android.content.Intent;
import android.os.Build;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import hp.dxjokdxxww;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.AuthBySmsArgs;
import ru.myspar.auth.impl.presentation.authbysms.AuthBySmsFragment;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 02\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00011B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0007J)\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lru/myspar/auth/impl/presentation/authbysms/AuthBySmsFragment;", "Lru/myspar/core/base/mvi/fragment/BaseComposeMviFragment;", "Lhp/dxjokdxxww;", "Lru/myspar/auth/impl/presentation/authbysms/ppxfxbqfkf;", "Lru/myspar/auth/impl/presentation/authbysms/wkgbmnqykc;", "Lp42/iobyxmoadg;", "<init>", "()V", "Lgg/wwaezpbzkn;", "jlmebxxoox", "onStart", CommonUrlParts.MODEL, "kegysxyocb", "(Lhp/dxjokdxxww;Landroidx/compose/runtime/draadjrbmk;I)V", "onStop", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "msg", "dxjokdxxww", "(Ljava/lang/String;)V", "uiLabel", "sopmlzcsov", "(Lru/myspar/auth/impl/presentation/authbysms/wkgbmnqykc;)V", "Lp42/zoijcleaow;", "esjtqupxsv", "Lp42/zoijcleaow;", "ulzqkzuiru", "()Lp42/zoijcleaow;", "setSmsRetrievedUtils", "(Lp42/zoijcleaow;)V", "smsRetrievedUtils", "Lru/myspar/auth/impl/presentation/authbysms/iobyxmoadg;", "lereixgezr", "Lgg/gtknphoqwx;", "mbcevpiqjq", "()Lru/myspar/auth/impl/presentation/authbysms/iobyxmoadg;", "binder", "Lp42/ppxfxbqfkf;", "pmvmpeiblj", "ntlheqmsrt", "()Lp42/ppxfxbqfkf;", "smsReceiver", "zynmafqrjb", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthBySmsFragment extends Hilt_AuthBySmsFragment<dxjokdxxww, ru.myspar.auth.impl.presentation.authbysms.ppxfxbqfkf, ru.myspar.auth.impl.presentation.authbysms.wkgbmnqykc> implements p42.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public p42.zoijcleaow smsRetrievedUtils;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx smsReceiver;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f84510istkbnxepw = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f84515zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f84515zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f84515zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f84516yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f84517zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f84517zdlpuopuiu = iobyxmoadgVar;
            this.f84516yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f84517zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f84516yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.auth.impl.presentation.authbysms.AuthBySmsFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final AuthBySmsFragment iobyxmoadg(AuthBySmsArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (AuthBySmsFragment) b40.iobyxmoadg.zoijcleaow(new AuthBySmsFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f84518yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f84519zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f84519zdlpuopuiu = fragment;
            this.f84518yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f84518yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f84519zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f84520zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f84520zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f84520zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f84521zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f84521zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f84521zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, AuthBySmsFragment.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ru.myspar.auth.impl.presentation.authbysms.ppxfxbqfkf) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ru.myspar.auth.impl.presentation.authbysms.ppxfxbqfkf p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((AuthBySmsFragment) this.receiver).ylkuphrtab(p13);
        }
    }

    public AuthBySmsFragment() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.smsReceiver = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: hp.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return AuthBySmsFragment.crxdokpmqz(this.f40854zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p42.ppxfxbqfkf crxdokpmqz(AuthBySmsFragment authBySmsFragment) {
        return new p42.ppxfxbqfkf(authBySmsFragment.ulzqkzuiru(), new WeakReference(authBySmsFragment));
    }

    private final void jlmebxxoox() {
        if (xx.iobyxmoadg.f123319iobyxmoadg.dsvhmnatus()) {
            return;
        }
        p42.zoijcleaow zoijcleaowVarUlzqkzuiru = ulzqkzuiru();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        zoijcleaowVarUlzqkzuiru.wkgbmnqykc(oxmwwwfdhmVarRequireActivity);
    }

    private final p42.ppxfxbqfkf ntlheqmsrt() {
        return (p42.ppxfxbqfkf) this.smsReceiver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn tzroggbefp(AuthBySmsFragment authBySmsFragment, dxjokdxxww dxjokdxxwwVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        authBySmsFragment.wwaezpbzkn(dxjokdxxwwVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // p42.iobyxmoadg
    public void dxjokdxxww(String msg) {
        zdlpuopuiu.btonecajqb(msg, "msg");
        ylkuphrtab(new ru.myspar.auth.impl.presentation.authbysms.ppxfxbqfkf.eablkybsjg(msg));
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: kegysxyocb, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(final dxjokdxxww model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-606566584);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(this) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-606566584, i14, -1, "ru.myspar.auth.impl.presentation.authbysms.AuthBySmsFragment.Render (AuthBySmsFragment.kt:58)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1846920987);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new zoijcleaow(this);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ip.wkgbmnqykc.ppxfxbqfkf(model, (draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVarBtonecajqb, i14 & 14, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: hp.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return AuthBySmsFragment.tzroggbefp(this.f40852zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: mbcevpiqjq, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2 && resultCode == -1 && data != null) {
            ylkuphrtab(new ru.myspar.auth.impl.presentation.authbysms.ppxfxbqfkf.eablkybsjg(ulzqkzuiru().ppxfxbqfkf(data)));
        }
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        if (Build.VERSION.SDK_INT >= 33) {
            oxmwwwfdhmVarRequireActivity.registerReceiver(ntlheqmsrt(), ulzqkzuiru().eablkybsjg(), 2);
        } else {
            oxmwwwfdhmVarRequireActivity.registerReceiver(ntlheqmsrt(), ulzqkzuiru().eablkybsjg());
        }
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        requireActivity().unregisterReceiver(ntlheqmsrt());
        super.onStop();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public void hcddaimhww(ru.myspar.auth.impl.presentation.authbysms.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.auth.impl.presentation.authbysms.wkgbmnqykc.iobyxmoadg) {
            lmojexxdyd(((ru.myspar.auth.impl.presentation.authbysms.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.auth.impl.presentation.authbysms.wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            jlmebxxoox();
        }
    }

    public final p42.zoijcleaow ulzqkzuiru() {
        p42.zoijcleaow zoijcleaowVar = this.smsRetrievedUtils;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zdlpuopuiu.pmvmpeiblj("smsRetrievedUtils");
        return null;
    }
}
