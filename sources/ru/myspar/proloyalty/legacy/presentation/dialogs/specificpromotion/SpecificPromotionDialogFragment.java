package ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion;

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
import ru.myspar.proloyalty.domain.feature.specificpromotion.store.SpecificPromotionDialogArgs;
import ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.SpecificPromotionDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 32\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00014B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/dialogs/specificpromotion/SpecificPromotionDialogFragment;", "Lru/myspar/proloyalty/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Lg91/nufgyqmvbu;", "Lru/myspar/proloyalty/legacy/presentation/dialogs/specificpromotion/zoijcleaow;", "Lru/myspar/proloyalty/legacy/presentation/dialogs/specificpromotion/ppxfxbqfkf;", "<init>", "()V", "Lgg/wwaezpbzkn;", "iyctptxqzt", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "uiLabel", "bfopjjpdmp", "(Lru/myspar/proloyalty/legacy/presentation/dialogs/specificpromotion/ppxfxbqfkf;)V", "Lac1/ppxfxbqfkf;", "yadqdtsiqt", "Lac1/ppxfxbqfkf;", "sflfametgt", "()Lac1/ppxfxbqfkf;", "setImageUtils", "(Lac1/ppxfxbqfkf;)V", "imageUtils", "Lz21/iobyxmoadg;", "iozdgvuglv", "Lz21/iobyxmoadg;", "zfvoamnweg", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/legacy/presentation/dialogs/specificpromotion/iobyxmoadg;", "lmojexxdyd", "Lgg/gtknphoqwx;", "yfnezrywwk", "()Lru/myspar/proloyalty/legacy/presentation/dialogs/specificpromotion/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/legacy/presentation/dialogs/specificpromotion/wkgbmnqykc;", "wwaezpbzkn", "Ltr0/ppxfxbqfkf;", "oipsdeybqn", "()Lru/myspar/proloyalty/legacy/presentation/dialogs/specificpromotion/wkgbmnqykc;", "viewImpl", "Lz41/dxjokdxxww;", "ylkuphrtab", "Lsr0/ppxfxbqfkf;", "ydmasvzmpa", "()Lz41/dxjokdxxww;", "binding", "pkzmftpjix", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpecificPromotionDialogFragment extends Hilt_SpecificPromotionDialogFragment<g91.nufgyqmvbu, ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.zoijcleaow, ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf> {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public ac1.ppxfxbqfkf imageUtils;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f96521hcddaimhww = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SpecificPromotionDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/legacy/presentation/dialogs/specificpromotion/SpecificPromotionDialogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SpecificPromotionDialogFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/databinding/DialogFragmentSpecificPromotionProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    public static final int f96522jpowsppfya = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f96529zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f96529zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f96529zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f96530yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f96531zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f96531zdlpuopuiu = iobyxmoadgVar;
            this.f96530yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f96531zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f96530yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.SpecificPromotionDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SpecificPromotionDialogFragment iobyxmoadg(SpecificPromotionDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (SpecificPromotionDialogFragment) g21.iobyxmoadg.zoijcleaow(new SpecificPromotionDialogFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f96532yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f96533zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f96533zdlpuopuiu = fragment;
            this.f96532yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f96532yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f96533zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f96534zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f96534zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f96534zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f96535zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f96535zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f96535zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f96536zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, z41.dxjokdxxww.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/databinding/DialogFragmentSpecificPromotionProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final z41.dxjokdxxww invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return z41.dxjokdxxww.iobyxmoadg(p13);
        }
    }

    public SpecificPromotionDialogFragment() {
        super(vk0.eablkybsjg.dialog_fragment_specific_promotion_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: g91.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificPromotionDialogFragment.weqkydbzbr(this.f36716zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f96536zdlpuopuiu);
    }

    private final void iyctptxqzt() {
        zfvoamnweg().iobyxmoadg(lr0.eablkybsjg.zoijcleaow.ppxfxbqfkf(lr0.eablkybsjg.f63889zoijcleaow, vk0.lqeggnwhkg.proloyalty_product_not_found, null, new lr0.eablkybsjg.nufgyqmvbu.iobyxmoadg(vk0.lqeggnwhkg.proloyalty_error), lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void opjhrmiecq(SpecificPromotionDialogFragment specificPromotionDialogFragment, DialogInterface dialogInterface) {
        zdlpuopuiu.nufgyqmvbu(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        ((com.google.android.material.bottomsheet.ppxfxbqfkf) dialogInterface).ojitshcjhn().yzdjzghtvl(specificPromotionDialogFragment.ydmasvzmpa().f127930gtknphoqwx.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.wkgbmnqykc weqkydbzbr(SpecificPromotionDialogFragment specificPromotionDialogFragment) {
        return new ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.wkgbmnqykc(new istkbnxepw(specificPromotionDialogFragment) { // from class: ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.SpecificPromotionDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((SpecificPromotionDialogFragment) this.receiver).ydmasvzmpa();
            }
        }, specificPromotionDialogFragment.sflfametgt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z41.dxjokdxxww ydmasvzmpa() {
        return (z41.dxjokdxxww) this.binding.iobyxmoadg(this, f96521hcddaimhww[1]);
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: bfopjjpdmp, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf.zoijcleaow) {
            sopmlzcsov(((ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf.zoijcleaow) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf.iobyxmoadg) {
            dismiss();
        } else {
            if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf.C2281ppxfxbqfkf.f96541iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            iyctptxqzt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.wkgbmnqykc vipkmwdibw() {
        return (ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f96521hcddaimhww[0]);
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: g91.eablkybsjg
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SpecificPromotionDialogFragment.opjhrmiecq(this.f36711iobyxmoadg, dialogInterface);
            }
        });
        return ppxfxbqfkfVar;
    }

    public final ac1.ppxfxbqfkf sflfametgt() {
        ac1.ppxfxbqfkf ppxfxbqfkfVar = this.imageUtils;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        zdlpuopuiu.pmvmpeiblj("imageUtils");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ribwqtqdhb() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final z21.iobyxmoadg zfvoamnweg() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
