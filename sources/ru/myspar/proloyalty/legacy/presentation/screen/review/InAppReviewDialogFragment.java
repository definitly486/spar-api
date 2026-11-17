package ru.myspar.proloyalty.legacy.presentation.screen.review;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import com.google.android.material.textview.MaterialTextView;
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
import ru.myspar.proloyalty.domain.feature.review.store.InAppReviewDialogArgs;
import ru.myspar.proloyalty.legacy.presentation.screen.review.InAppReviewDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 A2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002BCB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u00002\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/screen/review/InAppReviewDialogFragment;", "Lru/myspar/proloyalty/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Lcb1/btonecajqb;", "Lru/myspar/proloyalty/legacy/presentation/screen/review/zoijcleaow;", "Lru/myspar/proloyalty/legacy/presentation/screen/review/ppxfxbqfkf;", "<init>", "()V", "", "isPositiveRate", "Lgg/wwaezpbzkn;", "bfopjjpdmp", "(Z)V", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lkotlin/Function1;", "action", "iyctptxqzt", "(Ltg/draadjrbmk;)Lru/myspar/proloyalty/legacy/presentation/screen/review/InAppReviewDialogFragment;", "uiLabel", "opjhrmiecq", "(Lru/myspar/proloyalty/legacy/presentation/screen/review/ppxfxbqfkf;)V", "Lac1/iobyxmoadg;", "yadqdtsiqt", "Lac1/iobyxmoadg;", "ydmasvzmpa", "()Lac1/iobyxmoadg;", "setAnimationUtils", "(Lac1/iobyxmoadg;)V", "animationUtils", "Lru/myspar/proloyalty/legacy/presentation/screen/review/iobyxmoadg;", "iozdgvuglv", "Lgg/gtknphoqwx;", "sflfametgt", "()Lru/myspar/proloyalty/legacy/presentation/screen/review/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/legacy/presentation/screen/review/wkgbmnqykc;", "lmojexxdyd", "Ltr0/ppxfxbqfkf;", "oipsdeybqn", "()Lru/myspar/proloyalty/legacy/presentation/screen/review/wkgbmnqykc;", "viewImpl", "Lz41/eablkybsjg;", "wwaezpbzkn", "Lsr0/ppxfxbqfkf;", "zfvoamnweg", "()Lz41/eablkybsjg;", "binding", "ylkuphrtab", "Ltg/draadjrbmk;", "positiveAction", "Lkotlin/Function0;", "pkzmftpjix", "Ltg/iobyxmoadg;", "cancelAction", "Landroid/os/Handler;", "hcddaimhww", "Landroid/os/Handler;", "handler", "Lru/myspar/proloyalty/legacy/presentation/screen/review/InAppReviewDialogFragment$zoijcleaow;", "jpowsppfya", "Lru/myspar/proloyalty/legacy/presentation/screen/review/InAppReviewDialogFragment$zoijcleaow;", "reviewState", "hkdspvbjdz", "zoijcleaow", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InAppReviewDialogFragment extends Hilt_InAppReviewDialogFragment<cb1.btonecajqb, ru.myspar.proloyalty.legacy.presentation.screen.review.zoijcleaow, ru.myspar.proloyalty.legacy.presentation.screen.review.ppxfxbqfkf> {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata */
    private zoijcleaow reviewState;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg cancelAction;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public ac1.iobyxmoadg animationUtils;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk positiveAction;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f97198cllcsxoeiz = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(InAppReviewDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/legacy/presentation/screen/review/InAppReviewDialogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(InAppReviewDialogFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/databinding/DialogFragmentInAppReviewProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    public static final int f97199dsvhmnatus = 8;

    public static final class dxjokdxxww extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f97209yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f97210zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97210zdlpuopuiu = fragment;
            this.f97209yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f97209yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f97210zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f97211zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(Fragment fragment) {
            super(0);
            this.f97211zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f97211zdlpuopuiu;
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f97212zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f97212zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f97212zdlpuopuiu.invoke();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.review.InAppReviewDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final InAppReviewDialogFragment iobyxmoadg(InAppReviewDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (InAppReviewDialogFragment) g21.iobyxmoadg.zoijcleaow(new InAppReviewDialogFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f97213zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97213zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f97213zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f97214yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f97215zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97215zdlpuopuiu = iobyxmoadgVar;
            this.f97214yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f97215zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f97214yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* synthetic */ class ppxfxbqfkf extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f97216zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1, z41.eablkybsjg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/databinding/DialogFragmentInAppReviewProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final z41.eablkybsjg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return z41.eablkybsjg.iobyxmoadg(p13);
        }
    }

    public static final class wkgbmnqykc implements Animation.AnimationListener {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ boolean f97218zoijcleaow;

        wkgbmnqykc(boolean z13) {
            this.f97218zoijcleaow = z13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void eablkybsjg(final InAppReviewDialogFragment inAppReviewDialogFragment, final boolean z13) {
            p41.wkgbmnqykc.iobyxmoadg(inAppReviewDialogFragment, new tg.iobyxmoadg() { // from class: cb1.lqeggnwhkg
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return InAppReviewDialogFragment.wkgbmnqykc.gxszxtbevo(inAppReviewDialogFragment, z13);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn gxszxtbevo(InAppReviewDialogFragment inAppReviewDialogFragment, boolean z13) {
            inAppReviewDialogFragment.dismissAllowingStateLoss();
            draadjrbmk draadjrbmkVar = inAppReviewDialogFragment.positiveAction;
            if (draadjrbmkVar != null) {
                draadjrbmkVar.invoke(Boolean.valueOf(z13));
            }
            inAppReviewDialogFragment.ribwqtqdhb().jyumaefscl(ru.myspar.proloyalty.legacy.presentation.screen.review.zoijcleaow.iobyxmoadg.f97267iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn wkgbmnqykc(final InAppReviewDialogFragment inAppReviewDialogFragment, final boolean z13) {
            inAppReviewDialogFragment.handler.postDelayed(new Runnable() { // from class: cb1.gxszxtbevo
                @Override // java.lang.Runnable
                public final void run() {
                    InAppReviewDialogFragment.wkgbmnqykc.eablkybsjg(inAppReviewDialogFragment, z13);
                }
            }, 1500L);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            final InAppReviewDialogFragment inAppReviewDialogFragment = InAppReviewDialogFragment.this;
            final boolean z13 = this.f97218zoijcleaow;
            p41.wkgbmnqykc.iobyxmoadg(inAppReviewDialogFragment, new tg.iobyxmoadg() { // from class: cb1.eablkybsjg
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return InAppReviewDialogFragment.wkgbmnqykc.wkgbmnqykc(inAppReviewDialogFragment, z13);
                }
            });
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public enum zoijcleaow {
        SUBMIT,
        EDIT;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f97219iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public InAppReviewDialogFragment() {
        super(vk0.eablkybsjg.dialog_fragment_in_app_review_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new gxszxtbevo(new eablkybsjg(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new lqeggnwhkg(gtknphoqwxVarIobyxmoadg), new nufgyqmvbu(null, gtknphoqwxVarIobyxmoadg), new dxjokdxxww(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: cb1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return InAppReviewDialogFragment.weqkydbzbr(this.f19540zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.ppxfxbqfkf(this, ppxfxbqfkf.f97216zdlpuopuiu);
        this.handler = new Handler(Looper.getMainLooper());
        this.reviewState = zoijcleaow.EDIT;
    }

    private final void bfopjjpdmp(boolean isPositiveRate) {
        this.reviewState = zoijcleaow.SUBMIT;
        zfvoamnweg().f127946draadjrbmk.setText(getString(isPositiveRate ? vk0.lqeggnwhkg.proloyalty_msg_thank_review : vk0.lqeggnwhkg.proloyalty_msg_thank_review_feedback));
        AlphaAnimation alphaAnimationIobyxmoadg = ydmasvzmpa().iobyxmoadg();
        alphaAnimationIobyxmoadg.setAnimationListener(new wkgbmnqykc(isPositiveRate));
        MaterialTextView materialTextView = zfvoamnweg().f127946draadjrbmk;
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
        materialTextView.startAnimation(alphaAnimationIobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.legacy.presentation.screen.review.wkgbmnqykc weqkydbzbr(InAppReviewDialogFragment inAppReviewDialogFragment) {
        return new ru.myspar.proloyalty.legacy.presentation.screen.review.wkgbmnqykc(new istkbnxepw(inAppReviewDialogFragment) { // from class: ru.myspar.proloyalty.legacy.presentation.screen.review.InAppReviewDialogFragment.btonecajqb
            @Override // ah.draadjrbmk
            public Object get() {
                return ((InAppReviewDialogFragment) this.receiver).zfvoamnweg();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z41.eablkybsjg zfvoamnweg() {
        return (z41.eablkybsjg) this.binding.iobyxmoadg(this, f97198cllcsxoeiz[1]);
    }

    public final InAppReviewDialogFragment iyctptxqzt(draadjrbmk action) {
        this.positiveAction = action;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.legacy.presentation.screen.review.wkgbmnqykc vipkmwdibw() {
        return (ru.myspar.proloyalty.legacy.presentation.screen.review.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f97198cllcsxoeiz[0]);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.handler.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        tg.iobyxmoadg iobyxmoadgVar;
        zdlpuopuiu.btonecajqb(dialog, "dialog");
        if (this.reviewState != zoijcleaow.SUBMIT && (iobyxmoadgVar = this.cancelAction) != null) {
            iobyxmoadgVar.invoke();
        }
        super.onDismiss(dialog);
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: opjhrmiecq, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.proloyalty.legacy.presentation.screen.review.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.review.ppxfxbqfkf.C2294ppxfxbqfkf) {
            sopmlzcsov(((ru.myspar.proloyalty.legacy.presentation.screen.review.ppxfxbqfkf.C2294ppxfxbqfkf) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.review.ppxfxbqfkf.zoijcleaow) {
            dismiss();
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.review.ppxfxbqfkf.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            bfopjjpdmp(((ru.myspar.proloyalty.legacy.presentation.screen.review.ppxfxbqfkf.iobyxmoadg) uiLabel).iobyxmoadg());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ribwqtqdhb() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final ac1.iobyxmoadg ydmasvzmpa() {
        ac1.iobyxmoadg iobyxmoadgVar = this.animationUtils;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("animationUtils");
        return null;
    }
}
