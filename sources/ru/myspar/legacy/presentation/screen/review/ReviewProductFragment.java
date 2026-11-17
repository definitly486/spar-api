package ru.myspar.legacy.presentation.screen.review;

import ah.gtknphoqwx;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import fd0.zdlpuopuiu;
import gg.ojitshcjhn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import m60.pkzmftpjix;
import ru.myspar.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;
import ru.myspar.domain.feature.review.store.ReviewProductArgs;
import ru.myspar.legacy.presentation.screen.review.ReviewProductFragment;
import ru.myspar.rate.rate_product.api.model.RateProductArgs;
import ru.myspar.rate.rate_product.api.model.RateType;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001+B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lru/myspar/legacy/presentation/screen/review/ReviewProductFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lfd0/zdlpuopuiu;", "Lru/myspar/legacy/presentation/screen/review/lqeggnwhkg;", "Lru/myspar/legacy/presentation/screen/review/nufgyqmvbu;", "<init>", "()V", "", "productArticle", "productName", "Lgg/wwaezpbzkn;", "ribwqtqdhb", "(Ljava/lang/String;Ljava/lang/String;)V", "uiLabel", "jlmebxxoox", "(Lru/myspar/legacy/presentation/screen/review/nufgyqmvbu;)V", "Lk02/iobyxmoadg;", "esjtqupxsv", "Lk02/iobyxmoadg;", "sopmlzcsov", "()Lk02/iobyxmoadg;", "setRateProductFeatureApi", "(Lk02/iobyxmoadg;)V", "rateProductFeatureApi", "Lru/myspar/legacy/presentation/screen/review/eablkybsjg;", "lereixgezr", "Lgg/gtknphoqwx;", "ntlheqmsrt", "()Lru/myspar/legacy/presentation/screen/review/eablkybsjg;", "binder", "Lru/myspar/legacy/presentation/screen/review/dxjokdxxww;", "pmvmpeiblj", "Lzs/ppxfxbqfkf;", "crxdokpmqz", "()Lru/myspar/legacy/presentation/screen/review/dxjokdxxww;", "viewImpl", "Lm60/pkzmftpjix;", "zynmafqrjb", "Lys/ppxfxbqfkf;", "ulzqkzuiru", "()Lm60/pkzmftpjix;", "binding", "istkbnxepw", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReviewProductFragment extends Hilt_ReviewProductFragment<zdlpuopuiu, ru.myspar.legacy.presentation.screen.review.lqeggnwhkg, ru.myspar.legacy.presentation.screen.review.nufgyqmvbu> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    static final /* synthetic */ gtknphoqwx[] f89544cdpycssgdh = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ReviewProductFragment.class, "viewImpl", "getViewImpl()Lru/myspar/legacy/presentation/screen/review/ReviewProductViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ReviewProductFragment.class, "binding", "getBinding()Lru/myspar/databinding/FragmentReviewBinding;", 0))};

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f89546yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public k02.iobyxmoadg rateProductFeatureApi;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx binder;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f89551zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f89551zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f89551zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f89552yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f89553zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f89553zdlpuopuiu = iobyxmoadgVar;
            this.f89552yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f89553zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f89552yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.review.ReviewProductFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ReviewProductFragment iobyxmoadg(ReviewProductArgs args) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
            return (ReviewProductFragment) b40.iobyxmoadg.zoijcleaow(new ReviewProductFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f89554yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f89555zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f89555zdlpuopuiu = fragment;
            this.f89554yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f89554yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f89555zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f89556zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f89556zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f89556zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f89557zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f89557zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f89557zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f89558zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, pkzmftpjix.class, "bind", "bind(Landroid/view/View;)Lru/myspar/databinding/FragmentReviewBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final pkzmftpjix invoke(View p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return pkzmftpjix.iobyxmoadg(p13);
        }
    }

    public ReviewProductFragment() {
        super(pm.gxszxtbevo.fragment_review);
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.legacy.presentation.screen.review.eablkybsjg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: fd0.rgvfuqvkyq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ReviewProductFragment.vipkmwdibw(this.f33444zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f89558zdlpuopuiu);
    }

    private final void ribwqtqdhb(String productArticle, String productName) {
        BaseBottomSheetDialogFragment baseBottomSheetDialogFragmentZoijcleaow = k02.iobyxmoadg.zoijcleaow(sopmlzcsov(), new RateProductArgs(new RateType.Single("reviews_list", productArticle, productName, null, 8, null)), null, 2, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseBottomSheetDialogFragmentZoijcleaow.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pkzmftpjix ulzqkzuiru() {
        return (pkzmftpjix) this.binding.iobyxmoadg(this, f89544cdpycssgdh[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww vipkmwdibw(ReviewProductFragment reviewProductFragment) {
        return new dxjokdxxww(new istkbnxepw(reviewProductFragment) { // from class: ru.myspar.legacy.presentation.screen.review.ReviewProductFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((ReviewProductFragment) this.receiver).ulzqkzuiru();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww hcddaimhww() {
        return (dxjokdxxww) this.viewImpl.iobyxmoadg(this, f89544cdpycssgdh[0]);
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jlmebxxoox, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.legacy.presentation.screen.review.nufgyqmvbu uiLabel) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.legacy.presentation.screen.review.nufgyqmvbu.iobyxmoadg) {
            lmojexxdyd(((ru.myspar.legacy.presentation.screen.review.nufgyqmvbu.iobyxmoadg) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.legacy.presentation.screen.review.nufgyqmvbu.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.legacy.presentation.screen.review.nufgyqmvbu.zoijcleaow zoijcleaowVar = (ru.myspar.legacy.presentation.screen.review.nufgyqmvbu.zoijcleaow) uiLabel;
            ribwqtqdhb(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public ru.myspar.legacy.presentation.screen.review.eablkybsjg pkzmftpjix() {
        return (ru.myspar.legacy.presentation.screen.review.eablkybsjg) this.binder.getValue();
    }

    public final k02.iobyxmoadg sopmlzcsov() {
        k02.iobyxmoadg iobyxmoadgVar = this.rateProductFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("rateProductFeatureApi");
        return null;
    }
}
