package ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
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
import ru.myspar.proloyalty.purchases.impl.list_actions_with_section.domain.store.PurchasesListActionsWithSectionDialogArgs;
import ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.PurchasesListActionsWithSectionDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 -2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001.B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b\u0015\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)¨\u0006/"}, d2 = {"Lru/myspar/proloyalty/purchases/impl/list_actions_with_section/presentation/PurchasesListActionsWithSectionDialogFragment;", "Lru/myspar/proloyalty/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Lij1/lqeggnwhkg;", "Lru/myspar/proloyalty/purchases/impl/list_actions_with_section/presentation/zoijcleaow;", "Lru/myspar/proloyalty/purchases/impl/list_actions_with_section/presentation/ppxfxbqfkf;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "uiLabel", "Lgg/wwaezpbzkn;", "zfvoamnweg", "(Lru/myspar/proloyalty/purchases/impl/list_actions_with_section/presentation/ppxfxbqfkf;)V", "Lkotlin/Function1;", "Lgk1/iobyxmoadg;", "action", "opjhrmiecq", "(Ltg/draadjrbmk;)Lru/myspar/proloyalty/purchases/impl/list_actions_with_section/presentation/PurchasesListActionsWithSectionDialogFragment;", "bfopjjpdmp", "Lru/myspar/proloyalty/purchases/impl/list_actions_with_section/presentation/iobyxmoadg;", "yadqdtsiqt", "Lgg/gtknphoqwx;", "yfnezrywwk", "()Lru/myspar/proloyalty/purchases/impl/list_actions_with_section/presentation/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/purchases/impl/list_actions_with_section/presentation/wkgbmnqykc;", "iozdgvuglv", "Ltr0/ppxfxbqfkf;", "sflfametgt", "()Lru/myspar/proloyalty/purchases/impl/list_actions_with_section/presentation/wkgbmnqykc;", "viewImpl", "Lyi1/iobyxmoadg;", "lmojexxdyd", "Lsr0/ppxfxbqfkf;", "ydmasvzmpa", "()Lyi1/iobyxmoadg;", "binding", "wwaezpbzkn", "Ltg/draadjrbmk;", "onMoveProductsListener", "ylkuphrtab", "onDeleteProductsListener", "pkzmftpjix", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchasesListActionsWithSectionDialogFragment extends Hilt_PurchasesListActionsWithSectionDialogFragment<ij1.lqeggnwhkg, ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.zoijcleaow, ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onMoveProductsListener;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onDeleteProductsListener;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f99632hcddaimhww = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(PurchasesListActionsWithSectionDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/purchases/impl/list_actions_with_section/presentation/PurchasesListActionsWithSectionDialogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(PurchasesListActionsWithSectionDialogFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/purchases/impl/databinding/DialogFragmentPurchaseListActionsWithSectionProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    public static final int f99633jpowsppfya = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99640zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99640zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f99640zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99641yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99642zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99642zdlpuopuiu = iobyxmoadgVar;
            this.f99641yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f99642zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99641yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.PurchasesListActionsWithSectionDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final PurchasesListActionsWithSectionDialogFragment iobyxmoadg(PurchasesListActionsWithSectionDialogArgs arguments) {
            zdlpuopuiu.btonecajqb(arguments, "arguments");
            PurchasesListActionsWithSectionDialogFragment purchasesListActionsWithSectionDialogFragment = (PurchasesListActionsWithSectionDialogFragment) g21.iobyxmoadg.zoijcleaow(new PurchasesListActionsWithSectionDialogFragment(), arguments, false, 2, null);
            purchasesListActionsWithSectionDialogFragment.setCancelable(true);
            return purchasesListActionsWithSectionDialogFragment;
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99643yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f99644zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99644zdlpuopuiu = fragment;
            this.f99643yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99643yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f99644zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f99645zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f99645zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f99645zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99646zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f99646zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f99646zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f99647zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, yi1.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/purchases/impl/databinding/DialogFragmentPurchaseListActionsWithSectionProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final yi1.iobyxmoadg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return yi1.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public PurchasesListActionsWithSectionDialogFragment() {
        super(ti1.gxszxtbevo.dialog_fragment_purchase_list_actions_with_section_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: ij1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PurchasesListActionsWithSectionDialogFragment.iyctptxqzt(this.f44589zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f99647zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.wkgbmnqykc iyctptxqzt(PurchasesListActionsWithSectionDialogFragment purchasesListActionsWithSectionDialogFragment) {
        return new ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.wkgbmnqykc(new istkbnxepw(purchasesListActionsWithSectionDialogFragment) { // from class: ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.PurchasesListActionsWithSectionDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((PurchasesListActionsWithSectionDialogFragment) this.receiver).ydmasvzmpa();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oipsdeybqn(com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar, DialogInterface dialogInterface) {
        View viewFindViewById = ppxfxbqfkfVar.findViewById(da.gxszxtbevo.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(b31.gxszxtbevo.bottom_sheet_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yi1.iobyxmoadg ydmasvzmpa() {
        return (yi1.iobyxmoadg) this.binding.iobyxmoadg(this, f99632hcddaimhww[1]);
    }

    public final PurchasesListActionsWithSectionDialogFragment bfopjjpdmp(draadjrbmk action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.onDeleteProductsListener = action;
        return this;
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ij1.eablkybsjg
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PurchasesListActionsWithSectionDialogFragment.oipsdeybqn(ppxfxbqfkfVar, dialogInterface);
            }
        });
        return ppxfxbqfkfVar;
    }

    public final PurchasesListActionsWithSectionDialogFragment opjhrmiecq(draadjrbmk action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.onMoveProductsListener = action;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.wkgbmnqykc vipkmwdibw() {
        return (ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f99632hcddaimhww[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ribwqtqdhb() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.ppxfxbqfkf.zoijcleaow) {
            draadjrbmk draadjrbmkVar = this.onMoveProductsListener;
            if (draadjrbmkVar != null) {
                draadjrbmkVar.invoke(((ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.ppxfxbqfkf.zoijcleaow) uiLabel).iobyxmoadg());
            }
            dismiss();
            return;
        }
        if (!(uiLabel instanceof ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.ppxfxbqfkf.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        draadjrbmk draadjrbmkVar2 = this.onDeleteProductsListener;
        if (draadjrbmkVar2 != null) {
            draadjrbmkVar2.invoke(((ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.ppxfxbqfkf.iobyxmoadg) uiLabel).iobyxmoadg());
        }
        dismiss();
    }
}
