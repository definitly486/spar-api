package ru.myspar.loymaxpopup.impl.presentation;

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
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.loymaxpopup.impl.domain.LoymaxPopupArgs;
import ru.myspar.loymaxpopup.impl.presentation.LoymaxPopupDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lru/myspar/loymaxpopup/impl/presentation/LoymaxPopupDialogFragment;", "Lru/myspar/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Lkf0/lqeggnwhkg;", "Lru/myspar/loymaxpopup/impl/presentation/ppxfxbqfkf;", "Lru/myspar/loymaxpopup/impl/presentation/wkgbmnqykc;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "uiLabel", "Lgg/wwaezpbzkn;", "zfvoamnweg", "(Lru/myspar/loymaxpopup/impl/presentation/wkgbmnqykc;)V", "Lru/myspar/loymaxpopup/impl/presentation/zoijcleaow;", "yadqdtsiqt", "Lgg/gtknphoqwx;", "yfnezrywwk", "()Lru/myspar/loymaxpopup/impl/presentation/zoijcleaow;", "binder", "Lru/myspar/loymaxpopup/impl/presentation/eablkybsjg;", "iozdgvuglv", "Lzs/ppxfxbqfkf;", "sflfametgt", "()Lru/myspar/loymaxpopup/impl/presentation/eablkybsjg;", "viewImpl", "Lff0/iobyxmoadg;", "lmojexxdyd", "Lys/ppxfxbqfkf;", "ydmasvzmpa", "()Lff0/iobyxmoadg;", "binding", "wwaezpbzkn", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoymaxPopupDialogFragment extends iobyxmoadg {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f90127ylkuphrtab = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(LoymaxPopupDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/loymaxpopup/impl/presentation/LoymaxPopupDialogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(LoymaxPopupDialogFragment.class, "binding", "getBinding()Lru/myspar/loymaxpopup/impl/databinding/FragmentLoymaxPopupBinding;", 0))};

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f90131zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f90131zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f90131zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f90132yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f90133zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f90133zdlpuopuiu = iobyxmoadgVar;
            this.f90132yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f90133zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f90132yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.loymaxpopup.impl.presentation.LoymaxPopupDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final LoymaxPopupDialogFragment iobyxmoadg(LoymaxPopupArgs argument) {
            zdlpuopuiu.btonecajqb(argument, "argument");
            return (LoymaxPopupDialogFragment) b40.iobyxmoadg.zoijcleaow(new LoymaxPopupDialogFragment(), argument, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f90134yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f90135zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f90135zdlpuopuiu = fragment;
            this.f90134yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f90134yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f90135zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f90136zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f90136zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f90136zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f90137zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f90137zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f90137zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f90138zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, ff0.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/loymaxpopup/impl/databinding/FragmentLoymaxPopupBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ff0.iobyxmoadg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return ff0.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public LoymaxPopupDialogFragment() {
        super(cf0.ppxfxbqfkf.fragment_loymax_popup);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.loymaxpopup.impl.presentation.zoijcleaow.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: kf0.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return LoymaxPopupDialogFragment.bfopjjpdmp(this.f55364zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f90138zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.loymaxpopup.impl.presentation.eablkybsjg bfopjjpdmp(LoymaxPopupDialogFragment loymaxPopupDialogFragment) {
        return new ru.myspar.loymaxpopup.impl.presentation.eablkybsjg(new istkbnxepw(loymaxPopupDialogFragment) { // from class: ru.myspar.loymaxpopup.impl.presentation.LoymaxPopupDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((LoymaxPopupDialogFragment) this.receiver).ydmasvzmpa();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oipsdeybqn(com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar, DialogInterface dialogInterface) {
        View viewFindViewById = ppxfxbqfkfVar.findViewById(da.gxszxtbevo.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(s40.gxszxtbevo.bottom_sheet_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ff0.iobyxmoadg ydmasvzmpa() {
        return (ff0.iobyxmoadg) this.binding.iobyxmoadg(this, f90127ylkuphrtab[1]);
    }

    @Override // ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: kf0.wkgbmnqykc
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                LoymaxPopupDialogFragment.oipsdeybqn(ppxfxbqfkfVar, dialogInterface);
            }
        });
        return ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public ru.myspar.loymaxpopup.impl.presentation.eablkybsjg vipkmwdibw() {
        return (ru.myspar.loymaxpopup.impl.presentation.eablkybsjg) this.viewImpl.iobyxmoadg(this, f90127ylkuphrtab[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public ru.myspar.loymaxpopup.impl.presentation.zoijcleaow ribwqtqdhb() {
        return (ru.myspar.loymaxpopup.impl.presentation.zoijcleaow) this.binder.getValue();
    }

    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.loymaxpopup.impl.presentation.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (!(uiLabel instanceof ru.myspar.loymaxpopup.impl.presentation.wkgbmnqykc.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        ru.myspar.loymaxpopup.impl.presentation.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (ru.myspar.loymaxpopup.impl.presentation.wkgbmnqykc.iobyxmoadg) uiLabel;
        d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(iobyxmoadgVar.ppxfxbqfkf()), iobyxmoadgVar.iobyxmoadg(), null, null, false, null, new AnalyticsPayload(iobyxmoadgVar.wkgbmnqykc(), new AnalyticsLocation.LoyaltyPopups(iobyxmoadgVar.zoijcleaow()), null, 4, null), false, 188, null));
        dismiss();
    }
}
