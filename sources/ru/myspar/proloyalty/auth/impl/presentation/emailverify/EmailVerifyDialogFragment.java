package ru.myspar.proloyalty.auth.impl.presentation.emailverify;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.auth.api.model.EmailVerifyDialogArgs;
import ru.myspar.proloyalty.auth.impl.presentation.emailverify.EmailVerifyDialogFragment;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00142\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/myspar/proloyalty/auth/impl/presentation/emailverify/EmailVerifyDialogFragment;", "Lru/myspar/proloyalty/core/base/mvi/bottomsheet/BaseComposeMviBottomSheetDialogFragment;", "Lrn0/gxszxtbevo;", "Lru/myspar/proloyalty/auth/impl/presentation/emailverify/zoijcleaow;", "Lru/myspar/proloyalty/auth/impl/presentation/emailverify/ppxfxbqfkf;", "<init>", "()V", CommonUrlParts.MODEL, "Lgg/wwaezpbzkn;", "czzsidtyhn", "(Lrn0/gxszxtbevo;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "ydmasvzmpa", "(Lru/myspar/proloyalty/auth/impl/presentation/emailverify/ppxfxbqfkf;)V", "Lru/myspar/proloyalty/auth/impl/presentation/emailverify/iobyxmoadg;", "iozdgvuglv", "Lgg/gtknphoqwx;", "yfnezrywwk", "()Lru/myspar/proloyalty/auth/impl/presentation/emailverify/iobyxmoadg;", "binder", "lmojexxdyd", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmailVerifyDialogFragment extends Hilt_EmailVerifyDialogFragment<rn0.gxszxtbevo, ru.myspar.proloyalty.auth.impl.presentation.emailverify.zoijcleaow, ru.myspar.proloyalty.auth.impl.presentation.emailverify.ppxfxbqfkf> {

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static final int f92616wwaezpbzkn = 8;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92618zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92618zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f92618zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92619yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f92620zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92620zdlpuopuiu = iobyxmoadgVar;
            this.f92619yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f92620zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f92619yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.presentation.emailverify.EmailVerifyDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EmailVerifyDialogFragment iobyxmoadg(EmailVerifyDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (EmailVerifyDialogFragment) g21.iobyxmoadg.zoijcleaow(new EmailVerifyDialogFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92621yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f92622zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92622zdlpuopuiu = fragment;
            this.f92621yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f92621yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f92622zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f92623zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f92623zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f92623zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f92624zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f92624zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f92624zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, EmailVerifyDialogFragment.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ru.myspar.proloyalty.auth.impl.presentation.emailverify.zoijcleaow) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ru.myspar.proloyalty.auth.impl.presentation.emailverify.zoijcleaow p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((EmailVerifyDialogFragment) this.receiver).ribwqtqdhb(p13);
        }
    }

    public EmailVerifyDialogFragment() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn uwvvkdfqfp(EmailVerifyDialogFragment emailVerifyDialogFragment, rn0.gxszxtbevo gxszxtbevoVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        emailVerifyDialogFragment.jlmebxxoox(gxszxtbevoVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public void jlmebxxoox(final rn0.gxszxtbevo model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1868045342);
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1868045342, i14, -1, "ru.myspar.proloyalty.auth.impl.presentation.emailverify.EmailVerifyDialogFragment.Render (EmailVerifyDialogFragment.kt:19)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1163695910);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new zoijcleaow(this);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            sn0.wkgbmnqykc.wkgbmnqykc(model, (draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVarBtonecajqb, i14 & 14, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: rn0.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return EmailVerifyDialogFragment.uwvvkdfqfp(this.f83157zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public void ikoacuggdj(ru.myspar.proloyalty.auth.impl.presentation.emailverify.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.auth.impl.presentation.emailverify.ppxfxbqfkf.iobyxmoadg.f92632iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg vipkmwdibw() {
        return (iobyxmoadg) this.binder.getValue();
    }
}
