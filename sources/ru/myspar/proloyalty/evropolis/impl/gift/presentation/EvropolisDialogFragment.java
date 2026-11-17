package ru.myspar.proloyalty.evropolis.impl.gift.presentation;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import g81.btonecajqb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGiftArgs;
import ru.myspar.proloyalty.evropolis.impl.gift.presentation.EvropolisDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 92\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u001b\u00108\u001a\u0002038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lru/myspar/proloyalty/evropolis/impl/gift/presentation/EvropolisDialogFragment;", "Lru/myspar/proloyalty/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Lg81/btonecajqb;", "Lru/myspar/proloyalty/evropolis/impl/gift/presentation/zoijcleaow;", "Lru/myspar/proloyalty/evropolis/impl/gift/presentation/ppxfxbqfkf;", "<init>", "()V", "Lgg/wwaezpbzkn;", "nuxfzjnpeb", "zeieaojujs", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "label", "weqkydbzbr", "(Lru/myspar/proloyalty/evropolis/impl/gift/presentation/ppxfxbqfkf;)V", "Lz21/iobyxmoadg;", "yadqdtsiqt", "Lz21/iobyxmoadg;", "opjhrmiecq", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lac1/ppxfxbqfkf;", "iozdgvuglv", "Lac1/ppxfxbqfkf;", "bfopjjpdmp", "()Lac1/ppxfxbqfkf;", "setImageUtils", "(Lac1/ppxfxbqfkf;)V", "imageUtils", "Lc81/iobyxmoadg;", "lmojexxdyd", "Lsr0/ppxfxbqfkf;", "oipsdeybqn", "()Lc81/iobyxmoadg;", "binding", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGiftArgs;", "wwaezpbzkn", "Lgg/gtknphoqwx;", "sflfametgt", "()Lru/myspar/proloyalty/evropolis/api/model/EvropolisGiftArgs;", "args", "Lru/myspar/proloyalty/evropolis/impl/gift/presentation/iobyxmoadg;", "ylkuphrtab", "zfvoamnweg", "()Lru/myspar/proloyalty/evropolis/impl/gift/presentation/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/evropolis/impl/gift/presentation/wkgbmnqykc;", "pkzmftpjix", "Ltr0/ppxfxbqfkf;", "iyctptxqzt", "()Lru/myspar/proloyalty/evropolis/impl/gift/presentation/wkgbmnqykc;", "viewImpl", "hcddaimhww", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EvropolisDialogFragment extends Hilt_EvropolisDialogFragment<btonecajqb, ru.myspar.proloyalty.evropolis.impl.gift.presentation.zoijcleaow, ru.myspar.proloyalty.evropolis.impl.gift.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    public ac1.ppxfxbqfkf imageUtils;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx args;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f96126jpowsppfya = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(EvropolisDialogFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/evropolis/impl/databinding/DialogFragmentEvropolisProductProloyaltyBinding;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(EvropolisDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/evropolis/impl/gift/presentation/EvropolisDialogViewImpl;", 0))};

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f96133zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f96133zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f96133zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f96134yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f96135zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f96135zdlpuopuiu = iobyxmoadgVar;
            this.f96134yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f96135zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f96134yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.evropolis.impl.gift.presentation.EvropolisDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EvropolisDialogFragment iobyxmoadg(EvropolisGiftArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (EvropolisDialogFragment) g21.iobyxmoadg.zoijcleaow(new EvropolisDialogFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f96136yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f96137zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f96137zdlpuopuiu = fragment;
            this.f96136yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f96136yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f96137zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f96138zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f96138zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f96138zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f96139zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f96139zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f96139zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f96140zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, c81.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/evropolis/impl/databinding/DialogFragmentEvropolisProductProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final c81.iobyxmoadg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return c81.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public EvropolisDialogFragment() {
        super(u71.eablkybsjg.dialog_fragment_evropolis_product_proloyalty);
        this.binding = sr0.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f96140zdlpuopuiu);
        this.args = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: g81.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EvropolisDialogFragment.ydmasvzmpa(this.f36659zdlpuopuiu);
            }
        });
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: g81.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EvropolisDialogFragment.tbqsvytpvh(this.f36652zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lrnfpwlwnk(com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar, EvropolisDialogFragment evropolisDialogFragment, DialogInterface dialogInterface) {
        View viewFindViewById = ppxfxbqfkfVar.findViewById(da.gxszxtbevo.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(b31.gxszxtbevo.bottom_sheet_background);
            List tabs = evropolisDialogFragment.sflfametgt().getGift().getTabs();
            if (tabs == null || tabs.isEmpty()) {
                return;
            }
            evropolisDialogFragment.mbcevpiqjq(viewFindViewById);
        }
    }

    private final void nuxfzjnpeb() {
        a31.iobyxmoadg.eablkybsjg(opjhrmiecq(), vk0.lqeggnwhkg.proloyalty_msg_product_adding_to_cart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c81.iobyxmoadg oipsdeybqn() {
        return (c81.iobyxmoadg) this.binding.iobyxmoadg(this, f96126jpowsppfya[0]);
    }

    private final EvropolisGiftArgs sflfametgt() {
        return (EvropolisGiftArgs) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.evropolis.impl.gift.presentation.wkgbmnqykc tbqsvytpvh(EvropolisDialogFragment evropolisDialogFragment) {
        return new ru.myspar.proloyalty.evropolis.impl.gift.presentation.wkgbmnqykc(new istkbnxepw(evropolisDialogFragment) { // from class: ru.myspar.proloyalty.evropolis.impl.gift.presentation.EvropolisDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((EvropolisDialogFragment) this.receiver).oipsdeybqn();
            }
        }, evropolisDialogFragment.bfopjjpdmp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvropolisGiftArgs ydmasvzmpa(EvropolisDialogFragment evropolisDialogFragment) {
        return (EvropolisGiftArgs) jr0.zoijcleaow.wkgbmnqykc(evropolisDialogFragment, cllcsxoeiz.zoijcleaow(EvropolisGiftArgs.class));
    }

    private final void zeieaojujs() {
        a31.iobyxmoadg.eablkybsjg(opjhrmiecq(), vk0.lqeggnwhkg.proloyalty_product_not_available);
    }

    public final ac1.ppxfxbqfkf bfopjjpdmp() {
        ac1.ppxfxbqfkf ppxfxbqfkfVar = this.imageUtils;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        zdlpuopuiu.pmvmpeiblj("imageUtils");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: iyctptxqzt, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.evropolis.impl.gift.presentation.wkgbmnqykc vipkmwdibw() {
        return (ru.myspar.proloyalty.evropolis.impl.gift.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f96126jpowsppfya[1]);
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: g81.ppxfxbqfkf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                EvropolisDialogFragment.lrnfpwlwnk(ppxfxbqfkfVar, this, dialogInterface);
            }
        });
        return ppxfxbqfkfVar;
    }

    public final z21.iobyxmoadg opjhrmiecq() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: weqkydbzbr, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.proloyalty.evropolis.impl.gift.presentation.ppxfxbqfkf label) {
        zdlpuopuiu.btonecajqb(label, "label");
        if (label instanceof ru.myspar.proloyalty.evropolis.impl.gift.presentation.ppxfxbqfkf.iobyxmoadg) {
            Context contextRequireContext = requireContext();
            zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
            p41.ppxfxbqfkf.zoijcleaow(contextRequireContext, null, ((ru.myspar.proloyalty.evropolis.impl.gift.presentation.ppxfxbqfkf.iobyxmoadg) label).iobyxmoadg(), 1, null);
            return;
        }
        if (label instanceof ru.myspar.proloyalty.evropolis.impl.gift.presentation.ppxfxbqfkf.zoijcleaow) {
            dismiss();
            return;
        }
        if (label instanceof ru.myspar.proloyalty.evropolis.impl.gift.presentation.ppxfxbqfkf.C2269ppxfxbqfkf) {
            sopmlzcsov(((ru.myspar.proloyalty.evropolis.impl.gift.presentation.ppxfxbqfkf.C2269ppxfxbqfkf) label).iobyxmoadg());
            return;
        }
        if (label instanceof ru.myspar.proloyalty.evropolis.impl.gift.presentation.ppxfxbqfkf.wkgbmnqykc) {
            a31.iobyxmoadg.wkgbmnqykc(opjhrmiecq(), ((ru.myspar.proloyalty.evropolis.impl.gift.presentation.ppxfxbqfkf.wkgbmnqykc) label).iobyxmoadg(), null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
        } else if (zdlpuopuiu.eablkybsjg(label, ru.myspar.proloyalty.evropolis.impl.gift.presentation.ppxfxbqfkf.eablkybsjg.f96150iobyxmoadg)) {
            zeieaojujs();
        } else {
            if (!zdlpuopuiu.eablkybsjg(label, ru.myspar.proloyalty.evropolis.impl.gift.presentation.ppxfxbqfkf.gxszxtbevo.f96151iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            nuxfzjnpeb();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ribwqtqdhb() {
        return (iobyxmoadg) this.binder.getValue();
    }
}
