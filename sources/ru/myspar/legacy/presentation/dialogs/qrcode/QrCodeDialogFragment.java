package ru.myspar.legacy.presentation.dialogs.qrcode;

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
import m60.btonecajqb;
import ru.myspar.domain.feature.qrcode.store.QrCodeArgs;
import ru.myspar.legacy.presentation.dialogs.qrcode.QrCodeDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 +2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001,B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/myspar/legacy/presentation/dialogs/qrcode/QrCodeDialogFragment;", "Lru/myspar/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Leb0/nufgyqmvbu;", "Lru/myspar/legacy/presentation/dialogs/qrcode/zoijcleaow;", "Lru/myspar/legacy/presentation/dialogs/qrcode/ppxfxbqfkf;", "<init>", "()V", "Lgg/wwaezpbzkn;", "opjhrmiecq", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "uiLabel", "oipsdeybqn", "(Lru/myspar/legacy/presentation/dialogs/qrcode/ppxfxbqfkf;)V", "Lee0/ppxfxbqfkf;", "yadqdtsiqt", "Lee0/ppxfxbqfkf;", "sflfametgt", "()Lee0/ppxfxbqfkf;", "setImageUtils", "(Lee0/ppxfxbqfkf;)V", "imageUtils", "Lru/myspar/legacy/presentation/dialogs/qrcode/iobyxmoadg;", "iozdgvuglv", "Lgg/gtknphoqwx;", "yfnezrywwk", "()Lru/myspar/legacy/presentation/dialogs/qrcode/iobyxmoadg;", "binder", "Lru/myspar/legacy/presentation/dialogs/qrcode/wkgbmnqykc;", "lmojexxdyd", "Lzs/ppxfxbqfkf;", "zfvoamnweg", "()Lru/myspar/legacy/presentation/dialogs/qrcode/wkgbmnqykc;", "viewImpl", "Lm60/btonecajqb;", "wwaezpbzkn", "Lys/ppxfxbqfkf;", "ydmasvzmpa", "()Lm60/btonecajqb;", "binding", "ylkuphrtab", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QrCodeDialogFragment extends Hilt_QrCodeDialogFragment<eb0.nufgyqmvbu, ru.myspar.legacy.presentation.dialogs.qrcode.zoijcleaow, ru.myspar.legacy.presentation.dialogs.qrcode.ppxfxbqfkf> {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public ee0.ppxfxbqfkf imageUtils;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f88647pkzmftpjix = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(QrCodeDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/legacy/presentation/dialogs/qrcode/QrCodeDialogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(QrCodeDialogFragment.class, "binding", "getBinding()Lru/myspar/databinding/DialogFragmentQrCodeBinding;", 0))};

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final int f88646hcddaimhww = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f88653zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88653zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f88653zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f88654yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f88655zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88655zdlpuopuiu = iobyxmoadgVar;
            this.f88654yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f88655zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f88654yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.dialogs.qrcode.QrCodeDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final QrCodeDialogFragment iobyxmoadg(QrCodeArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (QrCodeDialogFragment) b40.iobyxmoadg.zoijcleaow(new QrCodeDialogFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f88656yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f88657zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88657zdlpuopuiu = fragment;
            this.f88656yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f88656yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f88657zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f88658zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f88658zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f88658zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f88659zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f88659zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f88659zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f88660zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, btonecajqb.class, "bind", "bind(Landroid/view/View;)Lru/myspar/databinding/DialogFragmentQrCodeBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final btonecajqb invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return btonecajqb.iobyxmoadg(p13);
        }
    }

    public QrCodeDialogFragment() {
        super(pm.gxszxtbevo.dialog_fragment_qr_code);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: eb0.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return QrCodeDialogFragment.iyctptxqzt(this.f31064zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f88660zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bfopjjpdmp(com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar, DialogInterface dialogInterface) {
        View viewFindViewById = ppxfxbqfkfVar.findViewById(da.gxszxtbevo.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(s40.gxszxtbevo.bottom_sheet_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.legacy.presentation.dialogs.qrcode.wkgbmnqykc iyctptxqzt(QrCodeDialogFragment qrCodeDialogFragment) {
        return new ru.myspar.legacy.presentation.dialogs.qrcode.wkgbmnqykc(qrCodeDialogFragment.sflfametgt(), new istkbnxepw(qrCodeDialogFragment) { // from class: ru.myspar.legacy.presentation.dialogs.qrcode.QrCodeDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((QrCodeDialogFragment) this.receiver).ydmasvzmpa();
            }
        });
    }

    private final void opjhrmiecq() {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final btonecajqb ydmasvzmpa() {
        return (btonecajqb) this.binding.iobyxmoadg(this, f88647pkzmftpjix[1]);
    }

    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.legacy.presentation.dialogs.qrcode.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.legacy.presentation.dialogs.qrcode.ppxfxbqfkf.iobyxmoadg.f88668iobyxmoadg)) {
            dismiss();
        } else {
            if (!(uiLabel instanceof ru.myspar.legacy.presentation.dialogs.qrcode.ppxfxbqfkf.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            opjhrmiecq();
        }
    }

    @Override // ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: eb0.wkgbmnqykc
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                QrCodeDialogFragment.bfopjjpdmp(ppxfxbqfkfVar, dialogInterface);
            }
        });
        ppxfxbqfkfVar.setCanceledOnTouchOutside(false);
        return ppxfxbqfkfVar;
    }

    public final ee0.ppxfxbqfkf sflfametgt() {
        ee0.ppxfxbqfkf ppxfxbqfkfVar = this.imageUtils;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        zdlpuopuiu.pmvmpeiblj("imageUtils");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ribwqtqdhb() {
        return (iobyxmoadg) this.binder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public ru.myspar.legacy.presentation.dialogs.qrcode.wkgbmnqykc vipkmwdibw() {
        return (ru.myspar.legacy.presentation.dialogs.qrcode.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f88647pkzmftpjix[0]);
    }
}
