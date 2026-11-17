package ru.myspar.proloyalty.rate.feedback.impl.presentation;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
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
import ml1.btonecajqb;
import ru.myspar.proloyalty.rate.feedback.api.models.FeedbackArgs;
import ru.myspar.proloyalty.rate.feedback.impl.presentation.FeedbackFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 .2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001/B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0010*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lru/myspar/proloyalty/rate/feedback/impl/presentation/FeedbackFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lml1/btonecajqb;", "Lru/myspar/proloyalty/rate/feedback/impl/presentation/zoijcleaow;", "Lru/myspar/proloyalty/rate/feedback/impl/presentation/ppxfxbqfkf;", "<init>", "()V", "Lgg/wwaezpbzkn;", "jztzpxfvev", "okpsazkaxt", "uiLabel", "jhduphickx", "(Lru/myspar/proloyalty/rate/feedback/impl/presentation/ppxfxbqfkf;)V", "Leablkybsjg/zoijcleaow;", "", "", "kotlin.jvm.PlatformType", "esjtqupxsv", "Leablkybsjg/zoijcleaow;", "openDocumentLauncher", "Lru/myspar/proloyalty/rate/feedback/impl/presentation/iobyxmoadg;", "lereixgezr", "Lgg/gtknphoqwx;", "crxdokpmqz", "()Lru/myspar/proloyalty/rate/feedback/impl/presentation/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/rate/feedback/impl/presentation/wkgbmnqykc;", "pmvmpeiblj", "Ltr0/ppxfxbqfkf;", "vipkmwdibw", "()Lru/myspar/proloyalty/rate/feedback/impl/presentation/wkgbmnqykc;", "viewImpl", "Lkl1/iobyxmoadg;", "zynmafqrjb", "Lsr0/ppxfxbqfkf;", "jlmebxxoox", "()Lkl1/iobyxmoadg;", "binding", "Lz21/iobyxmoadg;", "istkbnxepw", "Lz21/iobyxmoadg;", "ribwqtqdhb", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "cdpycssgdh", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedbackFragment extends Hilt_FeedbackFragment<btonecajqb, ru.myspar.proloyalty.rate.feedback.impl.presentation.zoijcleaow, ru.myspar.proloyalty.rate.feedback.impl.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final eablkybsjg.zoijcleaow openDocumentLauncher;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f99992yadqdtsiqt = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(FeedbackFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/rate/feedback/impl/presentation/FeedbackViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(FeedbackFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/rate/feedback/impl/databinding/FragmentFeedbackProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final int f99991iozdgvuglv = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99998zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99998zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f99998zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99999yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f100000zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f100000zdlpuopuiu = iobyxmoadgVar;
            this.f99999yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f100000zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99999yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.rate.feedback.impl.presentation.FeedbackFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final FeedbackFragment iobyxmoadg(FeedbackArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (FeedbackFragment) g21.iobyxmoadg.zoijcleaow(new FeedbackFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f100001yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f100002zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f100002zdlpuopuiu = fragment;
            this.f100001yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f100001yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f100002zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f100003zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f100003zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f100003zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f100004zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f100004zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f100004zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f100005zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, kl1.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/rate/feedback/impl/databinding/FragmentFeedbackProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final kl1.iobyxmoadg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return kl1.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public FeedbackFragment() {
        super(jl1.wkgbmnqykc.fragment_feedback_proloyalty);
        eablkybsjg.zoijcleaow zoijcleaowVarRegisterForActivityResult = registerForActivityResult(new gxszxtbevo.ppxfxbqfkf(), new eablkybsjg.iobyxmoadg() { // from class: ml1.wkgbmnqykc
            @Override // eablkybsjg.iobyxmoadg
            public final void iobyxmoadg(Object obj) {
                FeedbackFragment.ikoacuggdj(this.f67469iobyxmoadg, (Uri) obj);
            }
        });
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.openDocumentLauncher = zoijcleaowVarRegisterForActivityResult;
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: ml1.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return FeedbackFragment.rlfsiqarku(this.f67459zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f100005zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ikoacuggdj(FeedbackFragment feedbackFragment, Uri uri) {
        if (uri != null) {
            iobyxmoadg iobyxmoadgVarPkzmftpjix = feedbackFragment.pkzmftpjix();
            String string = uri.toString();
            zdlpuopuiu.dxjokdxxww(string, "toString(...)");
            iobyxmoadgVarPkzmftpjix.jyumaefscl(new ru.myspar.proloyalty.rate.feedback.impl.presentation.zoijcleaow.eablkybsjg(string));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kl1.iobyxmoadg jlmebxxoox() {
        return (kl1.iobyxmoadg) this.binding.iobyxmoadg(this, f99992yadqdtsiqt[1]);
    }

    private final void jztzpxfvev() {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new ow0.nufgyqmvbu.iobyxmoadg(contextRequireContext, Boolean.TRUE, new tg.iobyxmoadg() { // from class: ml1.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return FeedbackFragment.xrmfcynszj(this.f67461zdlpuopuiu);
            }
        }).agtfadlqog(jl1.eablkybsjg.proloyalty_title_feedback_msg_send).lqeggnwhkg(jl1.eablkybsjg.proloyalty_msg_feedback_thank).btonecajqb(jl1.eablkybsjg.proloyalty_action_close, new tg.iobyxmoadg() { // from class: ml1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return FeedbackFragment.metgxyhuhe(this.f67463zdlpuopuiu);
            }
        }).zoijcleaow().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn metgxyhuhe(FeedbackFragment feedbackFragment) {
        feedbackFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.rate.feedback.impl.presentation.zoijcleaow.btonecajqb.f100021iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void okpsazkaxt() {
        ribwqtqdhb().iobyxmoadg(lr0.eablkybsjg.zoijcleaow.ppxfxbqfkf(lr0.eablkybsjg.f63889zoijcleaow, jl1.eablkybsjg.proloyalty_msg_feedback_size_exceeded, null, new lr0.eablkybsjg.nufgyqmvbu.iobyxmoadg(vk0.lqeggnwhkg.proloyalty_error), lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc rlfsiqarku(FeedbackFragment feedbackFragment) {
        return new ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc(new istkbnxepw(feedbackFragment) { // from class: ru.myspar.proloyalty.rate.feedback.impl.presentation.FeedbackFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((FeedbackFragment) this.receiver).jlmebxxoox();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn xrmfcynszj(FeedbackFragment feedbackFragment) {
        feedbackFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.rate.feedback.impl.presentation.zoijcleaow.btonecajqb.f100021iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.rate.feedback.impl.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.rate.feedback.impl.presentation.ppxfxbqfkf.zoijcleaow) {
            lmojexxdyd(((ru.myspar.proloyalty.rate.feedback.impl.presentation.ppxfxbqfkf.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.rate.feedback.impl.presentation.ppxfxbqfkf.iobyxmoadg.f100014iobyxmoadg)) {
            this.openDocumentLauncher.iobyxmoadg(new String[]{"*/*"});
        } else if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.rate.feedback.impl.presentation.ppxfxbqfkf.C2401ppxfxbqfkf.f100015iobyxmoadg)) {
            okpsazkaxt();
        } else {
            if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.rate.feedback.impl.presentation.ppxfxbqfkf.wkgbmnqykc.f100016iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            jztzpxfvev();
        }
    }

    public final z21.iobyxmoadg ribwqtqdhb() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc hcddaimhww() {
        return (ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f99992yadqdtsiqt[0]);
    }
}
