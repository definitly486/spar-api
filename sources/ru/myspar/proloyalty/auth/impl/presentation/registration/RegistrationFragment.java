package ru.myspar.proloyalty.auth.impl.presentation.registration;

import android.content.Context;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.auth.api.model.RegistrationArgs;
import ru.myspar.proloyalty.auth.impl.presentation.registration.RegistrationFragment;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tn0.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ,2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001-B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lru/myspar/proloyalty/auth/impl/presentation/registration/RegistrationFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseComposeMviFragment;", "Ltn0/dxjokdxxww;", "Lru/myspar/proloyalty/auth/impl/presentation/registration/ppxfxbqfkf;", "Lru/myspar/proloyalty/auth/impl/presentation/registration/wkgbmnqykc;", "Lj21/iobyxmoadg;", "<init>", "()V", "Ljava/util/Date;", "selectedDate", "Lgg/wwaezpbzkn;", "crxdokpmqz", "(Ljava/util/Date;)V", "", "gxszxtbevo", "()Z", CommonUrlParts.MODEL, "kegysxyocb", "(Ltn0/dxjokdxxww;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "sopmlzcsov", "(Lru/myspar/proloyalty/auth/impl/presentation/registration/wkgbmnqykc;)V", "Lxr0/zoijcleaow;", "esjtqupxsv", "Lxr0/zoijcleaow;", "ntlheqmsrt", "()Lxr0/zoijcleaow;", "setDateUtils", "(Lxr0/zoijcleaow;)V", "dateUtils", "Lz21/iobyxmoadg;", "lereixgezr", "Lz21/iobyxmoadg;", "ulzqkzuiru", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/auth/impl/presentation/registration/iobyxmoadg;", "pmvmpeiblj", "Lgg/gtknphoqwx;", "mbcevpiqjq", "()Lru/myspar/proloyalty/auth/impl/presentation/registration/iobyxmoadg;", "binder", "zynmafqrjb", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegistrationFragment extends Hilt_RegistrationFragment<dxjokdxxww, ru.myspar.proloyalty.auth.impl.presentation.registration.ppxfxbqfkf, ru.myspar.proloyalty.auth.impl.presentation.registration.wkgbmnqykc> implements j21.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public xr0.zoijcleaow dateUtils;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f92639istkbnxepw = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92644zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92644zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f92644zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92645yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f92646zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92646zdlpuopuiu = iobyxmoadgVar;
            this.f92645yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f92646zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f92645yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.presentation.registration.RegistrationFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final RegistrationFragment iobyxmoadg(RegistrationArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (RegistrationFragment) g21.iobyxmoadg.zoijcleaow(new RegistrationFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92647yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f92648zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92648zdlpuopuiu = fragment;
            this.f92647yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f92647yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f92648zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f92649zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f92649zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f92649zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f92650zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f92650zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f92650zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, RegistrationFragment.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ru.myspar.proloyalty.auth.impl.presentation.registration.ppxfxbqfkf) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ru.myspar.proloyalty.auth.impl.presentation.registration.ppxfxbqfkf p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((RegistrationFragment) this.receiver).ylkuphrtab(p13);
        }
    }

    public RegistrationFragment() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
    }

    private final void crxdokpmqz(Date selectedDate) {
        Calendar calendar = Calendar.getInstance();
        if (selectedDate == null) {
            selectedDate = new Date();
        }
        calendar.setTime(selectedDate);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(ntlheqmsrt().wkgbmnqykc());
        if (calendar.getTimeInMillis() < ntlheqmsrt().lqeggnwhkg().getTime() || calendar.getTimeInMillis() > ntlheqmsrt().wkgbmnqykc().getTime()) {
            calendar = calendar2;
        }
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new ls0.wkgbmnqykc(contextRequireContext, Boolean.TRUE, null, new draadjrbmk() { // from class: tn0.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return RegistrationFragment.jlmebxxoox(this.f111087zdlpuopuiu, (Date) obj);
            }
        }, getString(bn0.eablkybsjg.proloyalty_birth_date), calendar.getTime(), ntlheqmsrt().lqeggnwhkg(), ntlheqmsrt().wkgbmnqykc(), 4, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jlmebxxoox(RegistrationFragment registrationFragment, Date it) {
        zdlpuopuiu.btonecajqb(it, "it");
        registrationFragment.ylkuphrtab(new ru.myspar.proloyalty.auth.impl.presentation.registration.ppxfxbqfkf.C2157ppxfxbqfkf(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn tzroggbefp(RegistrationFragment registrationFragment, dxjokdxxww dxjokdxxwwVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        registrationFragment.wwaezpbzkn(dxjokdxxwwVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // j21.iobyxmoadg
    public boolean gxszxtbevo() {
        ylkuphrtab(ru.myspar.proloyalty.auth.impl.presentation.registration.ppxfxbqfkf.wkgbmnqykc.f92664iobyxmoadg);
        return true;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: kegysxyocb, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(final dxjokdxxww model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1941485096);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1941485096, i14, -1, "ru.myspar.proloyalty.auth.impl.presentation.registration.RegistrationFragment.Render (RegistrationFragment.kt:39)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(769341008);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new zoijcleaow(this);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            un0.wkgbmnqykc.ppxfxbqfkf(model, (draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVarBtonecajqb, i14 & 14, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: tn0.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return RegistrationFragment.tzroggbefp(this.f111090zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: mbcevpiqjq, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final xr0.zoijcleaow ntlheqmsrt() {
        xr0.zoijcleaow zoijcleaowVar = this.dateUtils;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zdlpuopuiu.pmvmpeiblj("dateUtils");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public void hcddaimhww(ru.myspar.proloyalty.auth.impl.presentation.registration.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.auth.impl.presentation.registration.wkgbmnqykc.iobyxmoadg) {
            crxdokpmqz(((ru.myspar.proloyalty.auth.impl.presentation.registration.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.proloyalty.auth.impl.presentation.registration.wkgbmnqykc.ppxfxbqfkf) {
            a31.iobyxmoadg.gxszxtbevo(ulzqkzuiru(), String.valueOf(((ru.myspar.proloyalty.auth.impl.presentation.registration.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg()));
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.auth.impl.presentation.registration.wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            lmojexxdyd(((ru.myspar.proloyalty.auth.impl.presentation.registration.wkgbmnqykc.zoijcleaow) uiLabel).iobyxmoadg());
        }
    }

    public final z21.iobyxmoadg ulzqkzuiru() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
