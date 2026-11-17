package ru.myspar.scango.impl.screens.amountproduct.partial.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import com.google.android.material.button.MaterialButton;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.api.model.ScanGoAmountProductPartialArgs;
import ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ScanGoAmountProductPartialFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 52\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00016B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101¨\u00067"}, d2 = {"Lru/myspar/scango/impl/screens/amountproduct/partial/presentation/ScanGoAmountProductPartialFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lt22/nufgyqmvbu;", "Lru/myspar/scango/impl/screens/amountproduct/partial/presentation/zoijcleaow;", "Lru/myspar/scango/impl/screens/amountproduct/partial/presentation/ppxfxbqfkf;", "<init>", "()V", "", "isRemove", "Lgg/wwaezpbzkn;", "okpsazkaxt", "(Z)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "uiLabel", "jhduphickx", "(Lru/myspar/scango/impl/screens/amountproduct/partial/presentation/ppxfxbqfkf;)V", "Lq40/iobyxmoadg;", "esjtqupxsv", "Lq40/iobyxmoadg;", "ribwqtqdhb", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/scango/impl/screens/amountproduct/partial/presentation/iobyxmoadg;", "lereixgezr", "Lgg/gtknphoqwx;", "crxdokpmqz", "()Lru/myspar/scango/impl/screens/amountproduct/partial/presentation/iobyxmoadg;", "binder", "Lru/myspar/scango/impl/screens/amountproduct/partial/presentation/wkgbmnqykc;", "pmvmpeiblj", "Lzs/ppxfxbqfkf;", "vipkmwdibw", "()Lru/myspar/scango/impl/screens/amountproduct/partial/presentation/wkgbmnqykc;", "viewImpl", "Lk22/gxszxtbevo;", "zynmafqrjb", "Lys/ppxfxbqfkf;", "jlmebxxoox", "()Lk22/gxszxtbevo;", "binding", "Lkotlin/Function0;", "istkbnxepw", "Ltg/iobyxmoadg;", "onCartClicked", "cdpycssgdh", "onClearProduct", "yadqdtsiqt", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanGoAmountProductPartialFragment extends Hilt_ScanGoAmountProductPartialFragment<t22.nufgyqmvbu, ru.myspar.scango.impl.screens.amountproduct.partial.presentation.zoijcleaow, ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg onClearProduct;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg onCartClicked;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f103189iozdgvuglv = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanGoAmountProductPartialFragment.class, "viewImpl", "getViewImpl()Lru/myspar/scango/impl/screens/amountproduct/partial/presentation/ScanGoAmountProductPartialViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanGoAmountProductPartialFragment.class, "binding", "getBinding()Lru/myspar/scango/impl/databinding/FragmentScanGoAmountProductPartialBinding;", 0))};

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final int f103190lmojexxdyd = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f103198zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f103198zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f103198zdlpuopuiu.invoke();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f103199zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103199zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f103199zdlpuopuiu).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ScanGoAmountProductPartialFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ScanGoAmountProductPartialFragment iobyxmoadg(ScanGoAmountProductPartialArgs args, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg onClearProduct) {
            zdlpuopuiu.btonecajqb(args, "args");
            zdlpuopuiu.btonecajqb(onClearProduct, "onClearProduct");
            ScanGoAmountProductPartialFragment scanGoAmountProductPartialFragment = (ScanGoAmountProductPartialFragment) b40.iobyxmoadg.zoijcleaow(new ScanGoAmountProductPartialFragment(), args, false, 2, null);
            scanGoAmountProductPartialFragment.onCartClicked = iobyxmoadgVar;
            scanGoAmountProductPartialFragment.onClearProduct = onClearProduct;
            return scanGoAmountProductPartialFragment;
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f103200yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f103201zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103201zdlpuopuiu = iobyxmoadgVar;
            this.f103200yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f103201zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f103200yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f103202yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f103203zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103203zdlpuopuiu = fragment;
            this.f103202yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f103202yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f103203zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf implements c32.wkgbmnqykc.zoijcleaow {
        ppxfxbqfkf() {
        }

        @Override // c32.wkgbmnqykc.zoijcleaow
        public void iobyxmoadg() {
            ScanGoAmountProductPartialFragment.this.pkzmftpjix().jyumaefscl(ru.myspar.scango.impl.screens.amountproduct.partial.presentation.zoijcleaow.iobyxmoadg.f103226iobyxmoadg);
        }

        @Override // c32.wkgbmnqykc.zoijcleaow
        public void zoijcleaow() {
            ScanGoAmountProductPartialFragment.this.pkzmftpjix().jyumaefscl(ru.myspar.scango.impl.screens.amountproduct.partial.presentation.zoijcleaow.C2498zoijcleaow.f103229iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f103205zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment) {
            super(0);
            this.f103205zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f103205zdlpuopuiu;
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f103206zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, k22.gxszxtbevo.class, "bind", "bind(Landroid/view/View;)Lru/myspar/scango/impl/databinding/FragmentScanGoAmountProductPartialBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final k22.gxszxtbevo invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return k22.gxszxtbevo.iobyxmoadg(p13);
        }
    }

    public ScanGoAmountProductPartialFragment() {
        super(s12.ppxfxbqfkf.fragment_scan_go_amount_product_partial);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new eablkybsjg(new wkgbmnqykc(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new gxszxtbevo(gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(null, gtknphoqwxVarIobyxmoadg), new nufgyqmvbu(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: t22.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoAmountProductPartialFragment.jztzpxfvev(this.f109353zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f103206zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ikoacuggdj(ScanGoAmountProductPartialFragment scanGoAmountProductPartialFragment, View view) {
        tg.iobyxmoadg iobyxmoadgVar = scanGoAmountProductPartialFragment.onCartClicked;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k22.gxszxtbevo jlmebxxoox() {
        return (k22.gxszxtbevo) this.binding.iobyxmoadg(this, f103189iozdgvuglv[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.scango.impl.screens.amountproduct.partial.presentation.wkgbmnqykc jztzpxfvev(ScanGoAmountProductPartialFragment scanGoAmountProductPartialFragment) {
        return new ru.myspar.scango.impl.screens.amountproduct.partial.presentation.wkgbmnqykc(new istkbnxepw(scanGoAmountProductPartialFragment) { // from class: ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ScanGoAmountProductPartialFragment.dxjokdxxww
            @Override // ah.draadjrbmk
            public Object get() {
                return ((ScanGoAmountProductPartialFragment) this.receiver).jlmebxxoox();
            }
        });
    }

    private final void okpsazkaxt(boolean isRemove) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new c32.wkgbmnqykc(contextRequireContext, null, new ppxfxbqfkf(), isRemove, 2, null).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ppxfxbqfkf.C2497ppxfxbqfkf) {
            r40.iobyxmoadg.gxszxtbevo(ribwqtqdhb(), String.valueOf(((ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ppxfxbqfkf.C2497ppxfxbqfkf) uiLabel).iobyxmoadg()));
            return;
        }
        if (uiLabel instanceof ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ppxfxbqfkf.zoijcleaow) {
            lmojexxdyd(((ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ppxfxbqfkf.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ppxfxbqfkf.iobyxmoadg.f103221iobyxmoadg)) {
            if (!(uiLabel instanceof ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ppxfxbqfkf.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            okpsazkaxt(((ru.myspar.scango.impl.screens.amountproduct.partial.presentation.ppxfxbqfkf.wkgbmnqykc) uiLabel).iobyxmoadg());
        } else {
            tg.iobyxmoadg iobyxmoadgVar = this.onClearProduct;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
        }
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MaterialButton btnCart = jlmebxxoox().f53571zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnCart, "btnCart");
        btnCart.setVisibility(this.onCartClicked != null ? 0 : 8);
        jlmebxxoox().f53571zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: t22.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ScanGoAmountProductPartialFragment.ikoacuggdj(this.f109337zdlpuopuiu, view2);
            }
        });
    }

    public final q40.iobyxmoadg ribwqtqdhb() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public ru.myspar.scango.impl.screens.amountproduct.partial.presentation.wkgbmnqykc hcddaimhww() {
        return (ru.myspar.scango.impl.screens.amountproduct.partial.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f103189iozdgvuglv[0]);
    }
}
