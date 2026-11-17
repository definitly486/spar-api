package ru.myspar.legacy.presentation.screen.scanproduct;

import a42.ojitshcjhn;
import a42.rgvfuqvkyq;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
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
import m60.jpowsppfya;
import md0.kcexrzcfyt;
import ru.myspar.legacy.presentation.screen.scanproduct.ScanProductFragment;
import ru.myspar.legacy.presentation.view.ScanWindowView;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 L2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001MB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lru/myspar/legacy/presentation/screen/scanproduct/ScanProductFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lmd0/kcexrzcfyt;", "Lru/myspar/legacy/presentation/screen/scanproduct/ppxfxbqfkf;", "Lru/myspar/legacy/presentation/screen/scanproduct/wkgbmnqykc;", "<init>", "()V", "La42/rgvfuqvkyq;", "scanBindingArea", "La42/ojitshcjhn;", "metgxyhuhe", "(La42/rgvfuqvkyq;)La42/ojitshcjhn;", "", "withResume", "Lgg/wwaezpbzkn;", "igdgnonuha", "(Z)V", "uawqvzlxes", "roivzttewh", "skhdrjzrfn", "xrmfcynszj", "()La42/rgvfuqvkyq;", "iwxlajgraz", "auzgnhcxok", "dvvnrvtcbc", "wizcaqwiak", "()Lgg/wwaezpbzkn;", "onStart", "isHidden", "onHiddenChanged", "onStop", "onDestroy", "uiLabel", "tbqsvytpvh", "(Lru/myspar/legacy/presentation/screen/scanproduct/wkgbmnqykc;)V", "Lru/myspar/legacy/presentation/screen/scanproduct/iobyxmoadg;", "esjtqupxsv", "Lgg/gtknphoqwx;", "weqkydbzbr", "()Lru/myspar/legacy/presentation/screen/scanproduct/iobyxmoadg;", "binder", "Lru/myspar/legacy/presentation/screen/scanproduct/eablkybsjg;", "lereixgezr", "Lzs/ppxfxbqfkf;", "nuxfzjnpeb", "()Lru/myspar/legacy/presentation/screen/scanproduct/eablkybsjg;", "viewImpl", "La42/zoijcleaow;", "pmvmpeiblj", "La42/zoijcleaow;", "iyctptxqzt", "()La42/zoijcleaow;", "setBarcodeAnalyzerFactory", "(La42/zoijcleaow;)V", "barcodeAnalyzerFactory", "Lq40/iobyxmoadg;", "zynmafqrjb", "Lq40/iobyxmoadg;", "zeieaojujs", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lm60/jpowsppfya;", "istkbnxepw", "Lys/ppxfxbqfkf;", "lrnfpwlwnk", "()Lm60/jpowsppfya;", "binding", "cdpycssgdh", "La42/ojitshcjhn;", "scanSession", "Landroid/os/Handler;", "yadqdtsiqt", "Landroid/os/Handler;", "handler", "iozdgvuglv", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanProductFragment extends Hilt_ScanProductFragment<kcexrzcfyt, ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf, ru.myspar.legacy.presentation.screen.scanproduct.wkgbmnqykc> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private ojitshcjhn scanSession;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public a42.zoijcleaow barcodeAnalyzerFactory;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f89628lmojexxdyd = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanProductFragment.class, "viewImpl", "getViewImpl()Lru/myspar/legacy/presentation/screen/scanproduct/ScanProductViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanProductFragment.class, "binding", "getBinding()Lru/myspar/databinding/FragmentScanProductBinding;", 0))};

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static final int f89629wwaezpbzkn = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f89637zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f89637zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f89637zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f89638yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f89639zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f89639zdlpuopuiu = iobyxmoadgVar;
            this.f89638yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f89639zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f89638yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.scanproduct.ScanProductFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ScanProductFragment iobyxmoadg() {
            return new ScanProductFragment();
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f89640yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f89641zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f89641zdlpuopuiu = fragment;
            this.f89640yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f89640yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f89641zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f89642zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f89642zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f89642zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f89643zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f89643zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f89643zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f89644zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, jpowsppfya.class, "bind", "bind(Landroid/view/View;)Lru/myspar/databinding/FragmentScanProductBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jpowsppfya invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return jpowsppfya.iobyxmoadg(p13);
        }
    }

    public ScanProductFragment() {
        super(pm.gxszxtbevo.fragment_scan_product);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: md0.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanProductFragment.hszhottldk(this.f66862zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f89644zdlpuopuiu);
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final void auzgnhcxok() {
        r40.iobyxmoadg.ppxfxbqfkf(zeieaojujs(), pm.dxjokdxxww.camera_initialization_error, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn bfopjjpdmp(final ScanProductFragment scanProductFragment, final boolean z13) {
        c60.ppxfxbqfkf.iobyxmoadg(scanProductFragment, new tg.iobyxmoadg() { // from class: md0.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanProductFragment.opjhrmiecq(this.f66861zdlpuopuiu, z13);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn czzsidtyhn(ScanProductFragment scanProductFragment, boolean z13) {
        scanProductFragment.pkzmftpjix().jyumaefscl(new ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.gxszxtbevo(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void dvvnrvtcbc() {
        r40.iobyxmoadg.ppxfxbqfkf(zeieaojujs(), pm.dxjokdxxww.camera_permission_denied, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.legacy.presentation.screen.scanproduct.eablkybsjg hszhottldk(ScanProductFragment scanProductFragment) {
        return new ru.myspar.legacy.presentation.screen.scanproduct.eablkybsjg(new istkbnxepw(scanProductFragment) { // from class: ru.myspar.legacy.presentation.screen.scanproduct.ScanProductFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((ScanProductFragment) this.receiver).lrnfpwlwnk();
            }
        });
    }

    private final void igdgnonuha(final boolean withResume) {
        this.handler.post(new Runnable() { // from class: md0.lqeggnwhkg
            @Override // java.lang.Runnable
            public final void run() {
                ScanProductFragment.lxfrhoxuzk(this.f66857zdlpuopuiu, withResume);
            }
        });
    }

    private final void iwxlajgraz() {
        r40.iobyxmoadg.ppxfxbqfkf(zeieaojujs(), pm.dxjokdxxww.camera_not_found, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jpowsppfya lrnfpwlwnk() {
        return (jpowsppfya) this.binding.iobyxmoadg(this, f89628lmojexxdyd[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lxfrhoxuzk(ScanProductFragment scanProductFragment, boolean z13) {
        ojitshcjhn ojitshcjhnVarMetgxyhuhe = scanProductFragment.metgxyhuhe(scanProductFragment.xrmfcynszj());
        ojitshcjhnVarMetgxyhuhe.jpowsppfya();
        if (z13) {
            ojitshcjhnVarMetgxyhuhe.ylkuphrtab(false);
        }
        scanProductFragment.scanSession = ojitshcjhnVarMetgxyhuhe;
    }

    private final ojitshcjhn metgxyhuhe(rgvfuqvkyq scanBindingArea) {
        PreviewView previewView = lrnfpwlwnk().f65655eablkybsjg;
        zdlpuopuiu.dxjokdxxww(previewView, "previewView");
        return new ojitshcjhn(previewView, this, iyctptxqzt(), scanBindingArea, null, a42.ppxfxbqfkf.CODE, new draadjrbmk() { // from class: md0.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanProductFragment.uwvvkdfqfp(this.f66858zdlpuopuiu, (String) obj);
            }
        }, new tg.iobyxmoadg() { // from class: md0.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanProductFragment.ydmasvzmpa(this.f66846zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: md0.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanProductFragment.zfvoamnweg(this.f66844zdlpuopuiu);
            }
        }, new draadjrbmk() { // from class: md0.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanProductFragment.bfopjjpdmp(this.f66849zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, new draadjrbmk() { // from class: md0.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanProductFragment.rlfsiqarku(this.f66845zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oipsdeybqn(ScanProductFragment scanProductFragment) {
        scanProductFragment.pkzmftpjix().jyumaefscl(ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.wkgbmnqykc.f89662iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn opjhrmiecq(ScanProductFragment scanProductFragment, boolean z13) {
        scanProductFragment.pkzmftpjix().jyumaefscl(new ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.C2055ppxfxbqfkf(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(final ScanProductFragment scanProductFragment, final boolean z13) {
        c60.ppxfxbqfkf.iobyxmoadg(scanProductFragment, new tg.iobyxmoadg() { // from class: md0.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanProductFragment.czzsidtyhn(this.f66851zdlpuopuiu, z13);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void roivzttewh() {
        ojitshcjhn ojitshcjhnVar = this.scanSession;
        if (ojitshcjhnVar != null) {
            ojitshcjhnVar.lmojexxdyd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn sflfametgt(ScanProductFragment scanProductFragment) {
        scanProductFragment.pkzmftpjix().jyumaefscl(ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.eablkybsjg.f89657iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void skhdrjzrfn() {
        ojitshcjhn ojitshcjhnVar = this.scanSession;
        if (ojitshcjhnVar != null) {
            ojitshcjhnVar.hcddaimhww();
        }
        this.scanSession = null;
    }

    private final void uawqvzlxes() {
        ojitshcjhn ojitshcjhnVar = this.scanSession;
        if (ojitshcjhnVar != null) {
            ojitshcjhnVar.ylkuphrtab(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn uwvvkdfqfp(final ScanProductFragment scanProductFragment, final String rawBarcode) {
        zdlpuopuiu.btonecajqb(rawBarcode, "rawBarcode");
        c60.ppxfxbqfkf.iobyxmoadg(scanProductFragment, new tg.iobyxmoadg() { // from class: md0.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanProductFragment.yfnezrywwk(this.f66848zdlpuopuiu, rawBarcode);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final wwaezpbzkn wizcaqwiak() {
        ojitshcjhn ojitshcjhnVar = this.scanSession;
        if (ojitshcjhnVar == null) {
            return null;
        }
        ojitshcjhnVar.cllcsxoeiz();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final rgvfuqvkyq xrmfcynszj() {
        ScanWindowView scanWindowView = lrnfpwlwnk().f65656gxszxtbevo;
        zdlpuopuiu.lqeggnwhkg(scanWindowView);
        return new rgvfuqvkyq(c60.nufgyqmvbu.ppxfxbqfkf(scanWindowView), scanWindowView.getWidth(), scanWindowView.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ydmasvzmpa(final ScanProductFragment scanProductFragment) {
        c60.ppxfxbqfkf.iobyxmoadg(scanProductFragment, new tg.iobyxmoadg() { // from class: md0.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanProductFragment.sflfametgt(this.f66843zdlpuopuiu);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yfnezrywwk(ScanProductFragment scanProductFragment, String str) {
        scanProductFragment.pkzmftpjix().jyumaefscl(new ru.myspar.legacy.presentation.screen.scanproduct.ppxfxbqfkf.zoijcleaow(str));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zfvoamnweg(final ScanProductFragment scanProductFragment) {
        c60.ppxfxbqfkf.iobyxmoadg(scanProductFragment, new tg.iobyxmoadg() { // from class: md0.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanProductFragment.oipsdeybqn(this.f66859zdlpuopuiu);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final a42.zoijcleaow iyctptxqzt() {
        a42.zoijcleaow zoijcleaowVar = this.barcodeAnalyzerFactory;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zdlpuopuiu.pmvmpeiblj("barcodeAnalyzerFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: nuxfzjnpeb, reason: merged with bridge method [inline-methods] */
    public ru.myspar.legacy.presentation.screen.scanproduct.eablkybsjg hcddaimhww() {
        return (ru.myspar.legacy.presentation.screen.scanproduct.eablkybsjg) this.viewImpl.iobyxmoadg(this, f89628lmojexxdyd[0]);
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        skhdrjzrfn();
        this.handler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        pkzmftpjix().crxdokpmqz(isHidden);
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        pkzmftpjix().jlmebxxoox(true);
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        pkzmftpjix().jlmebxxoox(false);
        super.onStop();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: tbqsvytpvh, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.legacy.presentation.screen.scanproduct.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.legacy.presentation.screen.scanproduct.wkgbmnqykc.gxszxtbevo) {
            igdgnonuha(((ru.myspar.legacy.presentation.screen.scanproduct.wkgbmnqykc.gxszxtbevo) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.legacy.presentation.screen.scanproduct.wkgbmnqykc.zoijcleaow.f89670iobyxmoadg)) {
            uawqvzlxes();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.legacy.presentation.screen.scanproduct.wkgbmnqykc.iobyxmoadg.f89666iobyxmoadg)) {
            roivzttewh();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.legacy.presentation.screen.scanproduct.wkgbmnqykc.C2056wkgbmnqykc.f89669iobyxmoadg)) {
            iwxlajgraz();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.legacy.presentation.screen.scanproduct.wkgbmnqykc.ppxfxbqfkf.f89668iobyxmoadg)) {
            auzgnhcxok();
        } else if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.legacy.presentation.screen.scanproduct.wkgbmnqykc.eablkybsjg.f89664iobyxmoadg)) {
            dvvnrvtcbc();
        } else {
            if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.legacy.presentation.screen.scanproduct.wkgbmnqykc.lqeggnwhkg.f89667iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            wizcaqwiak();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: weqkydbzbr, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final q40.iobyxmoadg zeieaojujs() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
