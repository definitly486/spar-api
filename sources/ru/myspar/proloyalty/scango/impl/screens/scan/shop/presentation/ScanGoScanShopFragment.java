package ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import np1.cdpycssgdh;
import ru.myspar.proloyalty.legacy.presentation.view.ScanWindowView;
import ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ScanGoScanShopFragment;
import tg.draadjrbmk;
import wp1.ojitshcjhn;
import wp1.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001dB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u0006J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\nH\u0016¢\u0006\u0004\b.\u0010\u0006R\u001b\u00104\u001a\u00020/8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u0010:\u001a\u0002058TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00070A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u00101\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u00101\u001a\u0004\b\\\u0010]R\u001b\u0010b\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b_\u0010\t*\u0004\b`\u0010a¨\u0006e"}, d2 = {"Lru/myspar/proloyalty/scango/impl/screens/scan/shop/presentation/ScanGoScanShopFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lnp1/cdpycssgdh;", "Lru/myspar/proloyalty/scango/impl/screens/scan/shop/presentation/ppxfxbqfkf;", "Lru/myspar/proloyalty/scango/impl/screens/scan/shop/presentation/wkgbmnqykc;", "<init>", "()V", "Lwp1/ojitshcjhn;", "wizcaqwiak", "()Lwp1/ojitshcjhn;", "Lgg/wwaezpbzkn;", "q", "eslsurpljm", "ezmngbhpjk", "e", "d", "f", "n", "", "message", "l", "(Ljava/lang/String;)V", "value", "g", "", "permissions", "rhgxfdycjh", "([Ljava/lang/String;)V", "nuxfzjnpeb", "p", "k", "j", "iyctptxqzt", "s", "", "a", "(Ljava/lang/CharSequence;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "uiLabel", "lxfrhoxuzk", "(Lru/myspar/proloyalty/scango/impl/screens/scan/shop/presentation/wkgbmnqykc;)V", "onDestroyView", "Lru/myspar/proloyalty/scango/impl/screens/scan/shop/presentation/iobyxmoadg;", "esjtqupxsv", "Lgg/gtknphoqwx;", "roivzttewh", "()Lru/myspar/proloyalty/scango/impl/screens/scan/shop/presentation/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/scango/impl/screens/scan/shop/presentation/eablkybsjg;", "lereixgezr", "Ltr0/ppxfxbqfkf;", "igdgnonuha", "()Lru/myspar/proloyalty/scango/impl/screens/scan/shop/presentation/eablkybsjg;", "viewImpl", "Lgo1/eablkybsjg;", "pmvmpeiblj", "Lsr0/ppxfxbqfkf;", "uawqvzlxes", "()Lgo1/eablkybsjg;", "binding", "Lac1/wkgbmnqykc;", "zynmafqrjb", "Lac1/wkgbmnqykc;", "scanSessionDelegate", "Lwp1/zoijcleaow;", "istkbnxepw", "Lwp1/zoijcleaow;", "tbqsvytpvh", "()Lwp1/zoijcleaow;", "setBarcodeAnalyzerFactory", "(Lwp1/zoijcleaow;)V", "barcodeAnalyzerFactory", "Lz21/iobyxmoadg;", "cdpycssgdh", "Lz21/iobyxmoadg;", "skhdrjzrfn", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lwp1/rgvfuqvkyq;", "yadqdtsiqt", "iwxlajgraz", "()Lwp1/rgvfuqvkyq;", "scanBindingArea", "Lxr0/iobyxmoadg;", "iozdgvuglv", "auzgnhcxok", "()Lxr0/iobyxmoadg;", "enableWifiPopup", "dvvnrvtcbc", "getScanSession$delegate", "(Lru/myspar/proloyalty/scango/impl/screens/scan/shop/presentation/ScanGoScanShopFragment;)Ljava/lang/Object;", "scanSession", "lmojexxdyd", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanGoScanShopFragment extends Hilt_ScanGoScanShopFragment<cdpycssgdh, ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf, ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx enableWifiPopup;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public wp1.zoijcleaow barcodeAnalyzerFactory;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx scanBindingArea;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final ac1.wkgbmnqykc scanSessionDelegate;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f101026wwaezpbzkn = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanGoScanShopFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/scango/impl/screens/scan/shop/presentation/ScanGoScanShopViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanGoScanShopFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/scango/impl/databinding/FragmentScanAndGoScanShopProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final int f101027ylkuphrtab = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f101036zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f101036zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f101036zdlpuopuiu.invoke();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f101037zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f101037zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f101037zdlpuopuiu).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ScanGoScanShopFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ScanGoScanShopFragment iobyxmoadg() {
            return new ScanGoScanShopFragment();
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f101038yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f101039zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f101039zdlpuopuiu = iobyxmoadgVar;
            this.f101038yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f101039zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f101038yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f101040yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f101041zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f101041zdlpuopuiu = fragment;
            this.f101040yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f101040yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f101041zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* synthetic */ class ppxfxbqfkf extends vdvldrhtss implements tg.iobyxmoadg {
        ppxfxbqfkf(Object obj) {
            super(0, obj, ScanGoScanShopFragment.class, "initScanSession", "initScanSession()Lru/myspar/proloyalty/services/barcode_analyzer/api/ScanSession;", 0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ojitshcjhn invoke() {
            return ((ScanGoScanShopFragment) this.receiver).wizcaqwiak();
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f101042zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment) {
            super(0);
            this.f101042zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f101042zdlpuopuiu;
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f101043zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, go1.eablkybsjg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/scango/impl/databinding/FragmentScanAndGoScanShopProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final go1.eablkybsjg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return go1.eablkybsjg.iobyxmoadg(p13);
        }
    }

    public ScanGoScanShopFragment() {
        super(on1.ppxfxbqfkf.fragment_scan_and_go_scan_shop_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new eablkybsjg(new wkgbmnqykc(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new gxszxtbevo(gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(null, gtknphoqwxVarIobyxmoadg), new nufgyqmvbu(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: np1.jyumaefscl
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.t(this.f70519zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f101043zdlpuopuiu);
        this.scanSessionDelegate = ac1.wkgbmnqykc.f1543jyumaefscl.iobyxmoadg(new ppxfxbqfkf(this));
        this.scanBindingArea = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: np1.iwizpuwonk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.krqnebusok(this.f70518zdlpuopuiu);
            }
        });
        this.enableWifiPopup = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: np1.cqumvgiudr
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.weqkydbzbr(this.f70510zdlpuopuiu);
            }
        });
    }

    private final void a(CharSequence message) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new io1.lqeggnwhkg.iobyxmoadg(contextRequireContext).dxjokdxxww(on1.wkgbmnqykc.proloyalty_scan_ang_go_welcome).btonecajqb(0).eablkybsjg(message).iobyxmoadg(on1.wkgbmnqykc.proloyalty_scan_and_go_alright, new tg.iobyxmoadg() { // from class: np1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.b(this.f70532zdlpuopuiu);
            }
        }).gxszxtbevo(on1.wkgbmnqykc.proloyalty_scan_and_go_this_is_not_true, new tg.iobyxmoadg() { // from class: np1.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.c(this.f70524zdlpuopuiu);
            }
        }).lqeggnwhkg(b31.gxszxtbevo.bg_rounded_corners_12dp).ppxfxbqfkf().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ageimvtcrz(final ScanGoScanShopFragment scanGoScanShopFragment, final String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        p41.wkgbmnqykc.iobyxmoadg(scanGoScanShopFragment, new tg.iobyxmoadg() { // from class: np1.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.fyldjkxazc(this.f70531zdlpuopuiu, it);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final xr0.iobyxmoadg auzgnhcxok() {
        return (xr0.iobyxmoadg) this.enableWifiPopup.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn b(ScanGoScanShopFragment scanGoScanShopFragment) {
        scanGoScanShopFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.dxjokdxxww.f101052iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn c(ScanGoScanShopFragment scanGoScanShopFragment) {
        scanGoScanShopFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.draadjrbmk.f101051iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void d() {
        a31.iobyxmoadg.ppxfxbqfkf(skhdrjzrfn(), on1.wkgbmnqykc.proloyalty_camera_initialization_error, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    private final ojitshcjhn dvvnrvtcbc() {
        return (ojitshcjhn) this.scanSessionDelegate.getValue();
    }

    private final void e() {
        a31.iobyxmoadg.ppxfxbqfkf(skhdrjzrfn(), on1.wkgbmnqykc.proloyalty_camera_not_found, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    private final void eslsurpljm() {
        ojitshcjhn.pkzmftpjix(dvvnrvtcbc(), false, 1, null);
    }

    private final void ezmngbhpjk() {
        dvvnrvtcbc().lmojexxdyd();
    }

    private final void f() {
        a31.iobyxmoadg.ppxfxbqfkf(skhdrjzrfn(), on1.wkgbmnqykc.proloyalty_camera_permission_denied, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn fiwbwshyhd(ScanGoScanShopFragment scanGoScanShopFragment, boolean z13) {
        scanGoScanShopFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.gtknphoqwx(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn fmlbqenlif(ScanGoScanShopFragment scanGoScanShopFragment, boolean z13) {
        scanGoScanShopFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.wkgbmnqykc(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn fyldjkxazc(ScanGoScanShopFragment scanGoScanShopFragment, String str) {
        scanGoScanShopFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.C2435ppxfxbqfkf(str));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void g(String value) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        io1.lqeggnwhkg.iobyxmoadg iobyxmoadgVarDxjokdxxww = new io1.lqeggnwhkg.iobyxmoadg(contextRequireContext).dxjokdxxww(on1.wkgbmnqykc.proloyalty_scan_ang_go_welcome);
        String string = getString(on1.wkgbmnqykc.proloyalty_check_location_shop, value);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        iobyxmoadgVarDxjokdxxww.eablkybsjg(string).iobyxmoadg(on1.wkgbmnqykc.proloyalty_scan_and_go_alright, new tg.iobyxmoadg() { // from class: np1.zdlpuopuiu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.h(this.f70536zdlpuopuiu);
            }
        }).gxszxtbevo(on1.wkgbmnqykc.proloyalty_scan_and_go_this_is_not_true, new tg.iobyxmoadg() { // from class: np1.yggfygwlhe
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.i(this.f70535zdlpuopuiu);
            }
        }).ppxfxbqfkf().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn grlcpdaxtj(ScanGoScanShopFragment scanGoScanShopFragment) {
        scanGoScanShopFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.gxszxtbevo.f101055iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn h(ScanGoScanShopFragment scanGoScanShopFragment) {
        scanGoScanShopFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.dxjokdxxww.f101052iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn hszhottldk(final ScanGoScanShopFragment scanGoScanShopFragment, final boolean z13) {
        p41.wkgbmnqykc.iobyxmoadg(scanGoScanShopFragment, new tg.iobyxmoadg() { // from class: np1.vdvldrhtss
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.fiwbwshyhd(this.f70529zdlpuopuiu, z13);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn i(ScanGoScanShopFragment scanGoScanShopFragment) {
        scanGoScanShopFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.rgvfuqvkyq.f101061iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ipoelvxyzq(final ScanGoScanShopFragment scanGoScanShopFragment) {
        p41.wkgbmnqykc.iobyxmoadg(scanGoScanShopFragment, new tg.iobyxmoadg() { // from class: np1.rgvfuqvkyq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.grlcpdaxtj(this.f70527zdlpuopuiu);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final rgvfuqvkyq iwxlajgraz() {
        return (rgvfuqvkyq) this.scanBindingArea.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ixidwrxhsl(ScanGoScanShopFragment scanGoScanShopFragment) {
        scanGoScanShopFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.eablkybsjg.f101053iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void iyctptxqzt() {
        auzgnhcxok().dismiss();
    }

    private final void j() {
        auzgnhcxok().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jrbgnlbqoe(final ScanGoScanShopFragment scanGoScanShopFragment, final boolean z13) {
        p41.wkgbmnqykc.iobyxmoadg(scanGoScanShopFragment, new tg.iobyxmoadg() { // from class: np1.oxmwwwfdhm
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.fmlbqenlif(this.f70526zdlpuopuiu, z13);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void k() {
        String string = getString(on1.wkgbmnqykc.proloyalty_scan_and_go_error_on_request);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        l(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rgvfuqvkyq krqnebusok(ScanGoScanShopFragment scanGoScanShopFragment) {
        ScanWindowView scanWindowView = scanGoScanShopFragment.uawqvzlxes().f38026eablkybsjg.f38048zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(scanWindowView);
        return new rgvfuqvkyq(p41.dxjokdxxww.ppxfxbqfkf(scanWindowView), scanWindowView.getWidth(), scanWindowView.getHeight());
    }

    private final void l(String message) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new io1.lqeggnwhkg.iobyxmoadg(contextRequireContext).dxjokdxxww(on1.wkgbmnqykc.proloyalty_scan_and_go_popup_warning_title).eablkybsjg(message).iobyxmoadg(on1.wkgbmnqykc.proloyalty_scan_and_go_popup_positive_button_text, new tg.iobyxmoadg() { // from class: np1.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.m(this.f70513zdlpuopuiu);
            }
        }).ppxfxbqfkf().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lrnfpwlwnk(ScanGoScanShopFragment scanGoScanShopFragment) {
        scanGoScanShopFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.btonecajqb.f101050iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn m(ScanGoScanShopFragment scanGoScanShopFragment) {
        scanGoScanShopFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.draadjrbmk.f101051iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn mhtqkkgtqm(final ScanGoScanShopFragment scanGoScanShopFragment) {
        p41.wkgbmnqykc.iobyxmoadg(scanGoScanShopFragment, new tg.iobyxmoadg() { // from class: np1.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.ixidwrxhsl(this.f70505zdlpuopuiu);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void n() {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new io1.lqeggnwhkg.iobyxmoadg(contextRequireContext).dxjokdxxww(on1.wkgbmnqykc.proloyalty_scan_and_go_wrong_shop_message).iobyxmoadg(on1.wkgbmnqykc.proloyalty_ok, new tg.iobyxmoadg() { // from class: np1.esjtqupxsv
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.o(this.f70514zdlpuopuiu);
            }
        }).ppxfxbqfkf().show();
    }

    private final void nuxfzjnpeb() {
        pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.iobyxmoadg.f101056iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn o(ScanGoScanShopFragment scanGoScanShopFragment) {
        scanGoScanShopFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.draadjrbmk.f101051iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void p() {
        if (this.scanSessionDelegate.isInitialized()) {
            dvvnrvtcbc().hcddaimhww();
            this.scanSessionDelegate.iobyxmoadg();
        }
    }

    private final void q() {
        uawqvzlxes().getRoot().post(new Runnable() { // from class: np1.kcexrzcfyt
            @Override // java.lang.Runnable
            public final void run() {
                ScanGoScanShopFragment.r(this.f70520zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(ScanGoScanShopFragment scanGoScanShopFragment) {
        if (scanGoScanShopFragment.getView() != null) {
            scanGoScanShopFragment.dvvnrvtcbc().jpowsppfya();
        }
    }

    private final void rhgxfdycjh(String[] permissions) {
        ArrayList arrayList = new ArrayList();
        if (cdpycssgdh("android.permission.CAMERA")) {
            pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.nufgyqmvbu.f101058iobyxmoadg);
        } else {
            arrayList.add("android.permission.CAMERA");
        }
        if (yadqdtsiqt(permissions)) {
            nuxfzjnpeb();
        } else {
            hg.jyumaefscl.cdpycssgdh(arrayList, permissions);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        eablkybsjg.ppxfxbqfkf activityResultRegistry = requireActivity().getActivityResultRegistry();
        zdlpuopuiu.dxjokdxxww(activityResultRegistry, "<get-activityResultRegistry>(...)");
        new d31.wkgbmnqykc(activityResultRegistry, new draadjrbmk() { // from class: np1.lereixgezr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanShopFragment.yzdjzghtvl(this.f70521zdlpuopuiu, (Map) obj);
            }
        }).zoijcleaow((String[]) arrayList.toArray(new String[0]));
    }

    private final void s() {
        dvvnrvtcbc().cllcsxoeiz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.eablkybsjg t(ScanGoScanShopFragment scanGoScanShopFragment) {
        return new ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.eablkybsjg(new istkbnxepw(scanGoScanShopFragment) { // from class: ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ScanGoScanShopFragment.dxjokdxxww
            @Override // ah.draadjrbmk
            public Object get() {
                return ((ScanGoScanShopFragment) this.receiver).uawqvzlxes();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final go1.eablkybsjg uawqvzlxes() {
        return (go1.eablkybsjg) this.binding.iobyxmoadg(this, f101026wwaezpbzkn[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xr0.iobyxmoadg weqkydbzbr(final ScanGoScanShopFragment scanGoScanShopFragment) {
        Context contextRequireContext = scanGoScanShopFragment.requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        return new io1.lqeggnwhkg.iobyxmoadg(contextRequireContext).dxjokdxxww(on1.wkgbmnqykc.proloyalty_attention).wkgbmnqykc(on1.wkgbmnqykc.proloyalty_scan_and_go_enable_wifi_dialog_message).iobyxmoadg(on1.wkgbmnqykc.proloyalty_scan_and_go_enable_wifi_dialog_positive_button_text, new tg.iobyxmoadg() { // from class: np1.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.lrnfpwlwnk(this.f70516zdlpuopuiu);
            }
        }).gxszxtbevo(on1.wkgbmnqykc.proloyalty_scan_and_go_enable_wifi_dialog_negative_button_text, new tg.iobyxmoadg() { // from class: np1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.zeieaojujs();
            }
        }).ppxfxbqfkf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ojitshcjhn wizcaqwiak() {
        PreviewView previewView = uawqvzlxes().f38028ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(previewView, "previewView");
        return new ojitshcjhn(previewView, this, tbqsvytpvh(), iwxlajgraz(), null, wp1.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.f120437iobyxmoadg, new draadjrbmk() { // from class: np1.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanShopFragment.ageimvtcrz(this.f70523zdlpuopuiu, (String) obj);
            }
        }, new tg.iobyxmoadg() { // from class: np1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.ipoelvxyzq(this.f70512zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: np1.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanShopFragment.mhtqkkgtqm(this.f70506zdlpuopuiu);
            }
        }, new draadjrbmk() { // from class: np1.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanShopFragment.jrbgnlbqoe(this.f70515zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, new draadjrbmk() { // from class: np1.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanShopFragment.hszhottldk(this.f70511zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yzdjzghtvl(ScanGoScanShopFragment scanGoScanShopFragment, Map permissionsResult) {
        zdlpuopuiu.btonecajqb(permissionsResult, "permissionsResult");
        Boolean bool = (Boolean) permissionsResult.get("android.permission.CAMERA");
        if (bool != null) {
            scanGoScanShopFragment.pkzmftpjix().jyumaefscl(bool.booleanValue() ? ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.nufgyqmvbu.f101058iobyxmoadg : ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.lqeggnwhkg.f101057iobyxmoadg);
        }
        if (zdlpuopuiu.eablkybsjg(permissionsResult.get("android.permission.ACCESS_COARSE_LOCATION"), Boolean.TRUE)) {
            scanGoScanShopFragment.nuxfzjnpeb();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zeieaojujs() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: igdgnonuha, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.eablkybsjg hcddaimhww() {
        return (ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.eablkybsjg) this.viewImpl.iobyxmoadg(this, f101026wwaezpbzkn[0]);
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: lxfrhoxuzk, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.gtknphoqwx) {
            lmojexxdyd(((ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.gtknphoqwx) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.wflxmlrfwp) {
            l(((ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.wflxmlrfwp) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.eablkybsjg) {
            a(((ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.eablkybsjg) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.C2436wkgbmnqykc) {
            eslsurpljm();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.lqeggnwhkg) {
            e();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.gxszxtbevo) {
            d();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.agtfadlqog) {
            n();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.nufgyqmvbu) {
            f();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.btonecajqb) {
            j();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.iobyxmoadg) {
            iyctptxqzt();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.draadjrbmk) {
            k();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.ppxfxbqfkf) {
            rhgxfdycjh(((ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.ojitshcjhn) {
            q();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.rgvfuqvkyq) {
            s();
        } else if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.zoijcleaow) {
            ezmngbhpjk();
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.dxjokdxxww)) {
                throw new NoWhenBranchMatchedException();
            }
            g(((ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.wkgbmnqykc.dxjokdxxww) uiLabel).iobyxmoadg());
        }
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        p();
        super.onDestroyView();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.scanSessionDelegate.isInitialized()) {
            return;
        }
        pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf.vdvldrhtss.f101062iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: roivzttewh, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final z21.iobyxmoadg skhdrjzrfn() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    public final wp1.zoijcleaow tbqsvytpvh() {
        wp1.zoijcleaow zoijcleaowVar = this.barcodeAnalyzerFactory;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zdlpuopuiu.pmvmpeiblj("barcodeAnalyzerFactory");
        return null;
    }
}
