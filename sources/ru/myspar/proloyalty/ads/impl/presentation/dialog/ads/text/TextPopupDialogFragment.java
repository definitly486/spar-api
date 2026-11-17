package ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text;

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
import ru.myspar.proloyalty.ads.api.model.TextPopupDialogArgs;
import ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.TextPopupDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lru/myspar/proloyalty/ads/impl/presentation/dialog/ads/text/TextPopupDialogFragment;", "Lru/myspar/proloyalty/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Lpm0/lqeggnwhkg;", "Lru/myspar/proloyalty/ads/impl/presentation/dialog/ads/text/zoijcleaow;", "Lru/myspar/proloyalty/ads/impl/presentation/dialog/ads/text/ppxfxbqfkf;", "<init>", "()V", "Lgg/wwaezpbzkn;", "oipsdeybqn", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/google/android/material/bottomsheet/ppxfxbqfkf;", "opjhrmiecq", "(Landroid/os/Bundle;)Lcom/google/android/material/bottomsheet/ppxfxbqfkf;", "uiLabel", "bfopjjpdmp", "(Lru/myspar/proloyalty/ads/impl/presentation/dialog/ads/text/ppxfxbqfkf;)V", "Lkotlin/Function0;", "yadqdtsiqt", "Ltg/iobyxmoadg;", "clickListener", "Lru/myspar/proloyalty/ads/impl/presentation/dialog/ads/text/iobyxmoadg;", "iozdgvuglv", "Lgg/gtknphoqwx;", "ydmasvzmpa", "()Lru/myspar/proloyalty/ads/impl/presentation/dialog/ads/text/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/ads/impl/presentation/dialog/ads/text/wkgbmnqykc;", "lmojexxdyd", "Ltr0/ppxfxbqfkf;", "zfvoamnweg", "()Lru/myspar/proloyalty/ads/impl/presentation/dialog/ads/text/wkgbmnqykc;", "viewImpl", "Lkm0/wkgbmnqykc;", "wwaezpbzkn", "Lsr0/ppxfxbqfkf;", "sflfametgt", "()Lkm0/wkgbmnqykc;", "binding", "ylkuphrtab", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextPopupDialogFragment extends Hilt_TextPopupDialogFragment<pm0.lqeggnwhkg, ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.zoijcleaow, ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.ppxfxbqfkf> {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg clickListener;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f92129pkzmftpjix = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(TextPopupDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/ads/impl/presentation/dialog/ads/text/TextPopupDialogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(TextPopupDialogFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/ads/impl/databinding/DialogFragmentTextPopupProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final int f92128hcddaimhww = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92135zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92135zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f92135zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92136yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f92137zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92137zdlpuopuiu = iobyxmoadgVar;
            this.f92136yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f92137zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f92136yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.TextPopupDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final TextPopupDialogFragment iobyxmoadg(TextPopupDialogArgs args, tg.iobyxmoadg iobyxmoadgVar) {
            zdlpuopuiu.btonecajqb(args, "args");
            TextPopupDialogFragment textPopupDialogFragment = (TextPopupDialogFragment) g21.iobyxmoadg.zoijcleaow(new TextPopupDialogFragment(), args, false, 2, null);
            textPopupDialogFragment.clickListener = iobyxmoadgVar;
            return textPopupDialogFragment;
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92138yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f92139zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92139zdlpuopuiu = fragment;
            this.f92138yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f92138yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f92139zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f92140zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f92140zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f92140zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f92141zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f92141zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f92141zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f92142zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, km0.wkgbmnqykc.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/ads/impl/databinding/DialogFragmentTextPopupProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final km0.wkgbmnqykc invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return km0.wkgbmnqykc.iobyxmoadg(p13);
        }
    }

    public TextPopupDialogFragment() {
        super(jm0.ppxfxbqfkf.dialog_fragment_text_popup_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: pm0.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return TextPopupDialogFragment.weqkydbzbr(this.f76994zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f92142zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iyctptxqzt(com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar, DialogInterface dialogInterface) {
        View viewFindViewById = ppxfxbqfkfVar.findViewById(da.gxszxtbevo.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(b31.gxszxtbevo.bottom_sheet_background);
        }
    }

    private final void oipsdeybqn() {
        tg.iobyxmoadg iobyxmoadgVar = this.clickListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final km0.wkgbmnqykc sflfametgt() {
        return (km0.wkgbmnqykc) this.binding.iobyxmoadg(this, f92129pkzmftpjix[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.wkgbmnqykc weqkydbzbr(TextPopupDialogFragment textPopupDialogFragment) {
        return new ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.wkgbmnqykc(new istkbnxepw(textPopupDialogFragment) { // from class: ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.TextPopupDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((TextPopupDialogFragment) this.receiver).sflfametgt();
            }
        });
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: bfopjjpdmp, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.ppxfxbqfkf.C2143ppxfxbqfkf) {
            sopmlzcsov(((ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.ppxfxbqfkf.C2143ppxfxbqfkf) uiLabel).iobyxmoadg());
        } else if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.ppxfxbqfkf.zoijcleaow.f92146iobyxmoadg)) {
            oipsdeybqn();
        } else {
            if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.ppxfxbqfkf.iobyxmoadg.f92145iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            dismiss();
        }
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    /* JADX INFO: renamed from: opjhrmiecq, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.bottomsheet.ppxfxbqfkf onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.ojitshcjhn().c(3);
        ppxfxbqfkfVar.ojitshcjhn().oipsdeybqn();
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: pm0.eablkybsjg
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                TextPopupDialogFragment.iyctptxqzt(ppxfxbqfkfVar, dialogInterface);
            }
        });
        return ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ribwqtqdhb() {
        return (iobyxmoadg) this.binder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.wkgbmnqykc vipkmwdibw() {
        return (ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f92129pkzmftpjix[0]);
    }
}
