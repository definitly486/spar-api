package ru.myspar.proloyalty.scan.impl.scan_screen.presentation;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ln1.kcexrzcfyt;
import ru.myspar.proloyalty.legacy.presentation.view.ScanWindowView;
import ru.myspar.proloyalty.scan.api.model.ScanScreenPayload;
import ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ScanScreenFragment;
import tg.draadjrbmk;
import wp1.ojitshcjhn;
import wp1.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Q2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001RB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lru/myspar/proloyalty/scan/impl/scan_screen/presentation/ScanScreenFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lln1/kcexrzcfyt;", "Lru/myspar/proloyalty/scan/impl/scan_screen/presentation/zoijcleaow;", "Lru/myspar/proloyalty/scan/impl/scan_screen/presentation/ppxfxbqfkf;", "<init>", "()V", "Lwp1/rgvfuqvkyq;", "scanBindingArea", "Lwp1/ojitshcjhn;", "czzsidtyhn", "(Lwp1/rgvfuqvkyq;)Lwp1/ojitshcjhn;", "", "withResume", "Lgg/wwaezpbzkn;", "hszhottldk", "(Z)V", "dvvnrvtcbc", "iwxlajgraz", "wizcaqwiak", "rlfsiqarku", "()Lwp1/rgvfuqvkyq;", "igdgnonuha", "skhdrjzrfn", "lxfrhoxuzk", "ageimvtcrz", "()Lgg/wwaezpbzkn;", "onStart", "isHidden", "onHiddenChanged", "onStop", "onDestroy", "uiLabel", "auzgnhcxok", "(Lru/myspar/proloyalty/scan/impl/scan_screen/presentation/ppxfxbqfkf;)V", "Lru/myspar/proloyalty/scan/api/model/ScanScreenPayload;", "esjtqupxsv", "Lgg/gtknphoqwx;", "lrnfpwlwnk", "()Lru/myspar/proloyalty/scan/api/model/ScanScreenPayload;", "args", "Lru/myspar/proloyalty/scan/impl/scan_screen/presentation/iobyxmoadg;", "lereixgezr", "nuxfzjnpeb", "()Lru/myspar/proloyalty/scan/impl/scan_screen/presentation/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/scan/impl/scan_screen/presentation/wkgbmnqykc;", "pmvmpeiblj", "Ltr0/ppxfxbqfkf;", "uawqvzlxes", "()Lru/myspar/proloyalty/scan/impl/scan_screen/presentation/wkgbmnqykc;", "viewImpl", "Lwp1/zoijcleaow;", "zynmafqrjb", "Lwp1/zoijcleaow;", "zeieaojujs", "()Lwp1/zoijcleaow;", "setBarcodeAnalyzerFactory", "(Lwp1/zoijcleaow;)V", "barcodeAnalyzerFactory", "Lz21/iobyxmoadg;", "istkbnxepw", "Lz21/iobyxmoadg;", "roivzttewh", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lz41/yadqdtsiqt;", "cdpycssgdh", "Lsr0/ppxfxbqfkf;", "tbqsvytpvh", "()Lz41/yadqdtsiqt;", "binding", "yadqdtsiqt", "Lwp1/ojitshcjhn;", "scanSession", "Landroid/os/Handler;", "iozdgvuglv", "Landroid/os/Handler;", "handler", "lmojexxdyd", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanScreenFragment extends Hilt_ScanScreenFragment<kcexrzcfyt, ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow, ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx args;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private ojitshcjhn scanSession;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public wp1.zoijcleaow barcodeAnalyzerFactory;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f100391wwaezpbzkn = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanScreenFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/scan/impl/scan_screen/presentation/ScanScreenViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanScreenFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/databinding/FragmentScanProductProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final int f100392ylkuphrtab = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f100401zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f100401zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f100401zdlpuopuiu.invoke();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f100402zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f100402zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f100402zdlpuopuiu).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ScanScreenFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ScanScreenFragment iobyxmoadg(ScanScreenPayload args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (ScanScreenFragment) g21.iobyxmoadg.zoijcleaow(new ScanScreenFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f100403yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f100404zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f100404zdlpuopuiu = iobyxmoadgVar;
            this.f100403yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f100404zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f100403yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f100405yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f100406zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f100406zdlpuopuiu = fragment;
            this.f100405yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f100405yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f100406zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* synthetic */ class ppxfxbqfkf extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f100407zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1, z41.yadqdtsiqt.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/databinding/FragmentScanProductProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final z41.yadqdtsiqt invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return z41.yadqdtsiqt.iobyxmoadg(p13);
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f100408zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment) {
            super(0);
            this.f100408zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f100408zdlpuopuiu;
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f100409iobyxmoadg;

        static {
            int[] iArr = new int[in1.iobyxmoadg.values().length];
            try {
                iArr[in1.iobyxmoadg.Product.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[in1.iobyxmoadg.ActivationCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100409iobyxmoadg = iArr;
        }
    }

    public ScanScreenFragment() {
        super(vk0.eablkybsjg.fragment_scan_product_proloyalty);
        this.args = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ln1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanScreenFragment.metgxyhuhe(this.f63697zdlpuopuiu);
            }
        });
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new eablkybsjg(new wkgbmnqykc(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new gxszxtbevo(gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(null, gtknphoqwxVarIobyxmoadg), new nufgyqmvbu(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: ln1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanScreenFragment.fyldjkxazc(this.f63693zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, ppxfxbqfkf.f100407zdlpuopuiu);
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final wwaezpbzkn ageimvtcrz() {
        ojitshcjhn ojitshcjhnVar = this.scanSession;
        if (ojitshcjhnVar == null) {
            return null;
        }
        ojitshcjhnVar.cllcsxoeiz();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn bfopjjpdmp(final ScanScreenFragment scanScreenFragment) {
        p41.wkgbmnqykc.iobyxmoadg(scanScreenFragment, new tg.iobyxmoadg() { // from class: ln1.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanScreenFragment.opjhrmiecq(this.f63694zdlpuopuiu);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final ojitshcjhn czzsidtyhn(rgvfuqvkyq scanBindingArea) {
        wp1.wkgbmnqykc wkgbmnqykcVar;
        PreviewView previewView = tbqsvytpvh().f128485eablkybsjg;
        zdlpuopuiu.dxjokdxxww(previewView, "previewView");
        wp1.zoijcleaow zoijcleaowVarZeieaojujs = zeieaojujs();
        int i13 = zoijcleaow.f100409iobyxmoadg[lrnfpwlwnk().getType().ordinal()];
        if (i13 == 1) {
            wkgbmnqykcVar = wp1.wkgbmnqykc.iobyxmoadg.C3025iobyxmoadg.f120436iobyxmoadg;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            wkgbmnqykcVar = wp1.wkgbmnqykc.zoijcleaow.f120439iobyxmoadg;
        }
        return new ojitshcjhn(previewView, this, zoijcleaowVarZeieaojujs, scanBindingArea, null, wkgbmnqykcVar, new draadjrbmk() { // from class: ln1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanScreenFragment.ydmasvzmpa(this.f63677zdlpuopuiu, (String) obj);
            }
        }, new tg.iobyxmoadg() { // from class: ln1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanScreenFragment.zfvoamnweg(this.f63683zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: ln1.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanScreenFragment.bfopjjpdmp(this.f63678zdlpuopuiu);
            }
        }, new draadjrbmk() { // from class: ln1.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanScreenFragment.iyctptxqzt(this.f63696zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, new draadjrbmk() { // from class: ln1.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanScreenFragment.uwvvkdfqfp(this.f63676zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, 16, null);
    }

    private final void dvvnrvtcbc() {
        ojitshcjhn ojitshcjhnVar = this.scanSession;
        if (ojitshcjhnVar != null) {
            ojitshcjhnVar.ylkuphrtab(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fiwbwshyhd(ScanScreenFragment scanScreenFragment, boolean z13) {
        ojitshcjhn ojitshcjhnVarCzzsidtyhn = scanScreenFragment.czzsidtyhn(scanScreenFragment.rlfsiqarku());
        ojitshcjhnVarCzzsidtyhn.jpowsppfya();
        if (z13) {
            ojitshcjhnVarCzzsidtyhn.ylkuphrtab(false);
        }
        scanScreenFragment.scanSession = ojitshcjhnVarCzzsidtyhn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.scan.impl.scan_screen.presentation.wkgbmnqykc fyldjkxazc(ScanScreenFragment scanScreenFragment) {
        return new ru.myspar.proloyalty.scan.impl.scan_screen.presentation.wkgbmnqykc(new istkbnxepw(scanScreenFragment) { // from class: ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ScanScreenFragment.dxjokdxxww
            @Override // ah.draadjrbmk
            public Object get() {
                return ((ScanScreenFragment) this.receiver).tbqsvytpvh();
            }
        });
    }

    private final void hszhottldk(final boolean withResume) {
        this.handler.post(new Runnable() { // from class: ln1.dxjokdxxww
            @Override // java.lang.Runnable
            public final void run() {
                ScanScreenFragment.fiwbwshyhd(this.f63680zdlpuopuiu, withResume);
            }
        });
    }

    private final void igdgnonuha() {
        a31.iobyxmoadg.ppxfxbqfkf(roivzttewh(), vk0.lqeggnwhkg.proloyalty_camera_not_found, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    private final void iwxlajgraz() {
        ojitshcjhn ojitshcjhnVar = this.scanSession;
        if (ojitshcjhnVar != null) {
            ojitshcjhnVar.lmojexxdyd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iyctptxqzt(final ScanScreenFragment scanScreenFragment, final boolean z13) {
        p41.wkgbmnqykc.iobyxmoadg(scanScreenFragment, new tg.iobyxmoadg() { // from class: ln1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanScreenFragment.weqkydbzbr(this.f63692zdlpuopuiu, z13);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final ScanScreenPayload lrnfpwlwnk() {
        return (ScanScreenPayload) this.args.getValue();
    }

    private final void lxfrhoxuzk() {
        a31.iobyxmoadg.ppxfxbqfkf(roivzttewh(), vk0.lqeggnwhkg.proloyalty_camera_permission_denied, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanScreenPayload metgxyhuhe(ScanScreenFragment scanScreenFragment) {
        return (ScanScreenPayload) jr0.zoijcleaow.wkgbmnqykc(scanScreenFragment, cllcsxoeiz.zoijcleaow(ScanScreenPayload.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oipsdeybqn(ScanScreenFragment scanScreenFragment) {
        scanScreenFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.eablkybsjg.f100430iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn opjhrmiecq(ScanScreenFragment scanScreenFragment) {
        scanScreenFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.wkgbmnqykc.f100435iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final rgvfuqvkyq rlfsiqarku() {
        ScanWindowView scanWindowView = tbqsvytpvh().f128486gxszxtbevo;
        zdlpuopuiu.lqeggnwhkg(scanWindowView);
        return new rgvfuqvkyq(p41.dxjokdxxww.ppxfxbqfkf(scanWindowView), scanWindowView.getWidth(), scanWindowView.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn sflfametgt(ScanScreenFragment scanScreenFragment, String str) {
        scanScreenFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.C2415zoijcleaow(str));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void skhdrjzrfn() {
        a31.iobyxmoadg.ppxfxbqfkf(roivzttewh(), vk0.lqeggnwhkg.proloyalty_camera_initialization_error, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z41.yadqdtsiqt tbqsvytpvh() {
        return (z41.yadqdtsiqt) this.binding.iobyxmoadg(this, f100391wwaezpbzkn[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn uwvvkdfqfp(final ScanScreenFragment scanScreenFragment, final boolean z13) {
        p41.wkgbmnqykc.iobyxmoadg(scanScreenFragment, new tg.iobyxmoadg() { // from class: ln1.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanScreenFragment.yfnezrywwk(this.f63682zdlpuopuiu, z13);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn weqkydbzbr(ScanScreenFragment scanScreenFragment, boolean z13) {
        scanScreenFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.ppxfxbqfkf(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void wizcaqwiak() {
        ojitshcjhn ojitshcjhnVar = this.scanSession;
        if (ojitshcjhnVar != null) {
            ojitshcjhnVar.hcddaimhww();
        }
        this.scanSession = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ydmasvzmpa(final ScanScreenFragment scanScreenFragment, final String rawBarcode) {
        zdlpuopuiu.btonecajqb(rawBarcode, "rawBarcode");
        p41.wkgbmnqykc.iobyxmoadg(scanScreenFragment, new tg.iobyxmoadg() { // from class: ln1.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanScreenFragment.sflfametgt(this.f63685zdlpuopuiu, rawBarcode);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yfnezrywwk(ScanScreenFragment scanScreenFragment, boolean z13) {
        scanScreenFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.scan.impl.scan_screen.presentation.zoijcleaow.gxszxtbevo(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zfvoamnweg(final ScanScreenFragment scanScreenFragment) {
        p41.wkgbmnqykc.iobyxmoadg(scanScreenFragment, new tg.iobyxmoadg() { // from class: ln1.rgvfuqvkyq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanScreenFragment.oipsdeybqn(this.f63695zdlpuopuiu);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: auzgnhcxok, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.gxszxtbevo) {
            hszhottldk(((ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.gxszxtbevo) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.zoijcleaow.f100428iobyxmoadg)) {
            dvvnrvtcbc();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.iobyxmoadg.f100424iobyxmoadg)) {
            iwxlajgraz();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.wkgbmnqykc.f100427iobyxmoadg)) {
            igdgnonuha();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.C2414ppxfxbqfkf.f100426iobyxmoadg)) {
            skhdrjzrfn();
        } else if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.eablkybsjg.f100422iobyxmoadg)) {
            lxfrhoxuzk();
        } else {
            if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.scan.impl.scan_screen.presentation.ppxfxbqfkf.lqeggnwhkg.f100425iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ageimvtcrz();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: nuxfzjnpeb, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        wizcaqwiak();
        this.handler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        pkzmftpjix().crxdokpmqz(isHidden);
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        pkzmftpjix().jlmebxxoox(true);
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        pkzmftpjix().jlmebxxoox(false);
        super.onStop();
    }

    public final z21.iobyxmoadg roivzttewh() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: uawqvzlxes, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.scan.impl.scan_screen.presentation.wkgbmnqykc hcddaimhww() {
        return (ru.myspar.proloyalty.scan.impl.scan_screen.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f100391wwaezpbzkn[0]);
    }

    public final wp1.zoijcleaow zeieaojujs() {
        wp1.zoijcleaow zoijcleaowVar = this.barcodeAnalyzerFactory;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zdlpuopuiu.pmvmpeiblj("barcodeAnalyzerFactory");
        return null;
    }
}
