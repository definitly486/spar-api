package ru.myspar.sbp_recurring.impl.presentation;

import ah.gtknphoqwx;
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
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gg.ojitshcjhn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.sbp_recurring.api.model.SbpSelectBankAppDialogArgs;
import ru.myspar.sbp_recurring.impl.presentation.SbpSelectBankAppDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lru/myspar/sbp_recurring/impl/presentation/SbpSelectBankAppDialogFragment;", "Lru/myspar/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Ln12/lqeggnwhkg;", "Lru/myspar/sbp_recurring/impl/presentation/zoijcleaow;", "Lru/myspar/sbp_recurring/impl/presentation/ppxfxbqfkf;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lkotlin/Function1;", "Lj12/iobyxmoadg;", "Lgg/wwaezpbzkn;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bfopjjpdmp", "(Ltg/draadjrbmk;)Lru/myspar/sbp_recurring/impl/presentation/SbpSelectBankAppDialogFragment;", "uiLabel", "zfvoamnweg", "(Lru/myspar/sbp_recurring/impl/presentation/ppxfxbqfkf;)V", "Lru/myspar/sbp_recurring/impl/presentation/iobyxmoadg;", "yadqdtsiqt", "Lgg/gtknphoqwx;", "yfnezrywwk", "()Lru/myspar/sbp_recurring/impl/presentation/iobyxmoadg;", "binder", "Lru/myspar/sbp_recurring/impl/presentation/wkgbmnqykc;", "iozdgvuglv", "Lzs/ppxfxbqfkf;", "sflfametgt", "()Lru/myspar/sbp_recurring/impl/presentation/wkgbmnqykc;", "viewImpl", "Ll12/zoijcleaow;", "lmojexxdyd", "Lys/ppxfxbqfkf;", "ydmasvzmpa", "()Ll12/zoijcleaow;", "binding", "wwaezpbzkn", "Ltg/draadjrbmk;", "onSelectBankingAppListener", "ylkuphrtab", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SbpSelectBankAppDialogFragment extends Hilt_SbpSelectBankAppDialogFragment<n12.lqeggnwhkg, ru.myspar.sbp_recurring.impl.presentation.zoijcleaow, ru.myspar.sbp_recurring.impl.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    static final /* synthetic */ gtknphoqwx[] f103071pkzmftpjix = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SbpSelectBankAppDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/sbp_recurring/impl/presentation/SbpSelectBankAppDialogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SbpSelectBankAppDialogFragment.class, "binding", "getBinding()Lru/myspar/sbp_recurring/impl/databinding/DialogSbpSelectBankAppBinding;", 0))};

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onSelectBankingAppListener;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx binder;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f103077zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103077zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f103077zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f103078yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f103079zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103079zdlpuopuiu = iobyxmoadgVar;
            this.f103078yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f103079zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f103078yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.sbp_recurring.impl.presentation.SbpSelectBankAppDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SbpSelectBankAppDialogFragment iobyxmoadg(SbpSelectBankAppDialogArgs arguments) {
            zdlpuopuiu.btonecajqb(arguments, "arguments");
            return (SbpSelectBankAppDialogFragment) b40.iobyxmoadg.zoijcleaow(new SbpSelectBankAppDialogFragment(), arguments, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f103080yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f103081zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103081zdlpuopuiu = fragment;
            this.f103080yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f103080yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f103081zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f103082zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f103082zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f103082zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f103083zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f103083zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f103083zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f103084zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, l12.zoijcleaow.class, "bind", "bind(Landroid/view/View;)Lru/myspar/sbp_recurring/impl/databinding/DialogSbpSelectBankAppBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final l12.zoijcleaow invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return l12.zoijcleaow.iobyxmoadg(p13);
        }
    }

    public SbpSelectBankAppDialogFragment() {
        super(k12.zoijcleaow.dialog_sbp_select_bank_app);
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: n12.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SbpSelectBankAppDialogFragment.opjhrmiecq(this.f68434zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f103084zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oipsdeybqn(com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar, DialogInterface dialogInterface) {
        View viewFindViewById = ppxfxbqfkfVar.findViewById(da.gxszxtbevo.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(s40.gxszxtbevo.bottom_sheet_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.sbp_recurring.impl.presentation.wkgbmnqykc opjhrmiecq(SbpSelectBankAppDialogFragment sbpSelectBankAppDialogFragment) {
        return new ru.myspar.sbp_recurring.impl.presentation.wkgbmnqykc(new istkbnxepw(sbpSelectBankAppDialogFragment) { // from class: ru.myspar.sbp_recurring.impl.presentation.SbpSelectBankAppDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((SbpSelectBankAppDialogFragment) this.receiver).ydmasvzmpa();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l12.zoijcleaow ydmasvzmpa() {
        return (l12.zoijcleaow) this.binding.iobyxmoadg(this, f103071pkzmftpjix[1]);
    }

    public final SbpSelectBankAppDialogFragment bfopjjpdmp(draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.onSelectBankingAppListener = listener;
        return this;
    }

    @Override // ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: n12.wkgbmnqykc
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SbpSelectBankAppDialogFragment.oipsdeybqn(ppxfxbqfkfVar, dialogInterface);
            }
        });
        return ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public ru.myspar.sbp_recurring.impl.presentation.wkgbmnqykc vipkmwdibw() {
        return (ru.myspar.sbp_recurring.impl.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f103071pkzmftpjix[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ribwqtqdhb() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.sbp_recurring.impl.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.sbp_recurring.impl.presentation.ppxfxbqfkf.iobyxmoadg) {
            dismiss();
        } else {
            if (!(uiLabel instanceof ru.myspar.sbp_recurring.impl.presentation.ppxfxbqfkf.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            draadjrbmk draadjrbmkVar = this.onSelectBankingAppListener;
            if (draadjrbmkVar != null) {
                draadjrbmkVar.invoke(((ru.myspar.sbp_recurring.impl.presentation.ppxfxbqfkf.zoijcleaow) uiLabel).iobyxmoadg());
            }
            dismiss();
        }
    }
}
