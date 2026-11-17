package ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
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
import ru.myspar.proloyalty.scango.api.model.ScanGoAmountProductDialogArgs;
import ru.myspar.proloyalty.scango.impl.component.domain.model.ScanExciseStickerDialogArgs;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ScanGoAmountProductDialogFragment;
import ru.myspar.proloyalty.scango.impl.screens.excisesticker.presentation.ScanExciseStickerDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001*B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lru/myspar/proloyalty/scango/impl/screens/amountproduct/dialog/presentation/ScanGoAmountProductDialogFragment;", "Lru/myspar/proloyalty/scango/impl/component/presentation/BaseMviScanGoBottomSheetDialogFragment;", "Lno1/lqeggnwhkg;", "Lru/myspar/proloyalty/scango/impl/screens/amountproduct/dialog/presentation/zoijcleaow;", "Lru/myspar/proloyalty/scango/impl/screens/amountproduct/dialog/presentation/ppxfxbqfkf;", "<init>", "()V", "Lru/myspar/proloyalty/scango/impl/component/domain/model/ScanExciseStickerDialogArgs;", "args", "Lgg/wwaezpbzkn;", "iyctptxqzt", "(Lru/myspar/proloyalty/scango/impl/component/domain/model/ScanExciseStickerDialogArgs;)V", "uiLabel", "opjhrmiecq", "(Lru/myspar/proloyalty/scango/impl/screens/amountproduct/dialog/presentation/ppxfxbqfkf;)V", "Lz21/iobyxmoadg;", "iozdgvuglv", "Lz21/iobyxmoadg;", "oipsdeybqn", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/scango/impl/screens/amountproduct/dialog/presentation/iobyxmoadg;", "lmojexxdyd", "Lgg/gtknphoqwx;", "sflfametgt", "()Lru/myspar/proloyalty/scango/impl/screens/amountproduct/dialog/presentation/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/scango/impl/screens/amountproduct/dialog/presentation/wkgbmnqykc;", "wwaezpbzkn", "Ltr0/ppxfxbqfkf;", "bfopjjpdmp", "()Lru/myspar/proloyalty/scango/impl/screens/amountproduct/dialog/presentation/wkgbmnqykc;", "viewImpl", "Lgo1/iobyxmoadg;", "ylkuphrtab", "Lsr0/ppxfxbqfkf;", "zfvoamnweg", "()Lgo1/iobyxmoadg;", "binding", "pkzmftpjix", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanGoAmountProductDialogFragment extends Hilt_ScanGoAmountProductDialogFragment<no1.lqeggnwhkg, ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.zoijcleaow, ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f100488hcddaimhww = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanGoAmountProductDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/scango/impl/screens/amountproduct/dialog/presentation/ScanGoAmountProductDialogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanGoAmountProductDialogFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/scango/impl/databinding/DialogFragmentAmountProductProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    public static final int f100489jpowsppfya = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f100495zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f100495zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f100495zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f100496yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f100497zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f100497zdlpuopuiu = iobyxmoadgVar;
            this.f100496yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f100497zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f100496yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ScanGoAmountProductDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ScanGoAmountProductDialogFragment iobyxmoadg(ScanGoAmountProductDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (ScanGoAmountProductDialogFragment) g21.iobyxmoadg.zoijcleaow(new ScanGoAmountProductDialogFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f100498yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f100499zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f100499zdlpuopuiu = fragment;
            this.f100498yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f100498yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f100499zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f100500zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f100500zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f100500zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f100501zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f100501zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f100501zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f100502zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, go1.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/scango/impl/databinding/DialogFragmentAmountProductProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final go1.iobyxmoadg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return go1.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public ScanGoAmountProductDialogFragment() {
        super(on1.ppxfxbqfkf.dialog_fragment_amount_product_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: no1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoAmountProductDialogFragment.weqkydbzbr(this.f70475zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f100502zdlpuopuiu);
    }

    private final void iyctptxqzt(ScanExciseStickerDialogArgs args) {
        ScanExciseStickerDialogFragment scanExciseStickerDialogFragmentIobyxmoadg = ScanExciseStickerDialogFragment.INSTANCE.iobyxmoadg(args);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        zdlpuopuiu.dxjokdxxww(parentFragmentManager, "getParentFragmentManager(...)");
        scanExciseStickerDialogFragmentIobyxmoadg.wwaezpbzkn(parentFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.wkgbmnqykc weqkydbzbr(ScanGoAmountProductDialogFragment scanGoAmountProductDialogFragment) {
        return new ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.wkgbmnqykc(new istkbnxepw(scanGoAmountProductDialogFragment) { // from class: ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ScanGoAmountProductDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((ScanGoAmountProductDialogFragment) this.receiver).zfvoamnweg();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final go1.iobyxmoadg zfvoamnweg() {
        return (go1.iobyxmoadg) this.binding.iobyxmoadg(this, f100488hcddaimhww[1]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: bfopjjpdmp, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.wkgbmnqykc vipkmwdibw() {
        return (ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f100488hcddaimhww[0]);
    }

    public final z21.iobyxmoadg oipsdeybqn() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: opjhrmiecq, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ppxfxbqfkf.iobyxmoadg.f100507iobyxmoadg)) {
            dismiss();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ppxfxbqfkf.wkgbmnqykc) {
            iyctptxqzt(((ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ppxfxbqfkf.wkgbmnqykc) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ppxfxbqfkf.C2416ppxfxbqfkf) {
            a31.iobyxmoadg.gxszxtbevo(oipsdeybqn(), String.valueOf(((ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ppxfxbqfkf.C2416ppxfxbqfkf) uiLabel).iobyxmoadg()));
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ppxfxbqfkf.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            sopmlzcsov(((ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.ppxfxbqfkf.zoijcleaow) uiLabel).iobyxmoadg());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ribwqtqdhb() {
        return (iobyxmoadg) this.binder.getValue();
    }
}
