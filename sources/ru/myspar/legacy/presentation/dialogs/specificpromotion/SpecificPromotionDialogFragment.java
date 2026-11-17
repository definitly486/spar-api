package ru.myspar.legacy.presentation.dialogs.specificpromotion;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import hb0.dxjokdxxww;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.domain.feature.specificpromotion.store.SpecificPromotionDialogArgs;
import ru.myspar.legacy.presentation.dialogs.specificpromotion.SpecificPromotionDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 +2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001,B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/myspar/legacy/presentation/dialogs/specificpromotion/SpecificPromotionDialogFragment;", "Lru/myspar/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Lhb0/dxjokdxxww;", "Lru/myspar/legacy/presentation/dialogs/specificpromotion/zoijcleaow;", "Lru/myspar/legacy/presentation/dialogs/specificpromotion/ppxfxbqfkf;", "<init>", "()V", "Lgg/wwaezpbzkn;", "iyctptxqzt", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "uiLabel", "bfopjjpdmp", "(Lru/myspar/legacy/presentation/dialogs/specificpromotion/ppxfxbqfkf;)V", "Lee0/ppxfxbqfkf;", "yadqdtsiqt", "Lee0/ppxfxbqfkf;", "zfvoamnweg", "()Lee0/ppxfxbqfkf;", "setImageUtils", "(Lee0/ppxfxbqfkf;)V", "imageUtils", "Lru/myspar/legacy/presentation/dialogs/specificpromotion/iobyxmoadg;", "iozdgvuglv", "Lgg/gtknphoqwx;", "ydmasvzmpa", "()Lru/myspar/legacy/presentation/dialogs/specificpromotion/iobyxmoadg;", "binder", "Lru/myspar/legacy/presentation/dialogs/specificpromotion/wkgbmnqykc;", "lmojexxdyd", "Lzs/ppxfxbqfkf;", "oipsdeybqn", "()Lru/myspar/legacy/presentation/dialogs/specificpromotion/wkgbmnqykc;", "viewImpl", "Lm60/draadjrbmk;", "wwaezpbzkn", "Lys/ppxfxbqfkf;", "sflfametgt", "()Lm60/draadjrbmk;", "binding", "ylkuphrtab", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpecificPromotionDialogFragment extends Hilt_SpecificPromotionDialogFragment<dxjokdxxww, ru.myspar.legacy.presentation.dialogs.specificpromotion.zoijcleaow, ru.myspar.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf> {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public ee0.ppxfxbqfkf imageUtils;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f88738pkzmftpjix = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SpecificPromotionDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/legacy/presentation/dialogs/specificpromotion/SpecificPromotionDialogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SpecificPromotionDialogFragment.class, "binding", "getBinding()Lru/myspar/databinding/DialogFragmentSpecificPromotionBinding;", 0))};

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final int f88737hcddaimhww = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f88744zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88744zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f88744zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f88745yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f88746zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88746zdlpuopuiu = iobyxmoadgVar;
            this.f88745yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f88746zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f88745yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.dialogs.specificpromotion.SpecificPromotionDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SpecificPromotionDialogFragment iobyxmoadg(SpecificPromotionDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (SpecificPromotionDialogFragment) b40.iobyxmoadg.zoijcleaow(new SpecificPromotionDialogFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f88747yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f88748zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88748zdlpuopuiu = fragment;
            this.f88747yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f88747yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f88748zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f88749zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f88749zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f88749zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f88750zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f88750zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f88750zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f88751zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, m60.draadjrbmk.class, "bind", "bind(Landroid/view/View;)Lru/myspar/databinding/DialogFragmentSpecificPromotionBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final m60.draadjrbmk invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return m60.draadjrbmk.iobyxmoadg(p13);
        }
    }

    public SpecificPromotionDialogFragment() {
        super(pm.gxszxtbevo.dialog_fragment_specific_promotion);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: hb0.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificPromotionDialogFragment.lrnfpwlwnk(this.f40007zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f88751zdlpuopuiu);
    }

    private final void iyctptxqzt() {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new rx.nufgyqmvbu.iobyxmoadg(contextRequireContext, null, null, 6, null).agtfadlqog(pm.dxjokdxxww.error).lqeggnwhkg(pm.dxjokdxxww.product_not_found).draadjrbmk(pm.dxjokdxxww.f76951ok, new tg.iobyxmoadg() { // from class: hb0.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificPromotionDialogFragment.weqkydbzbr(this.f40009zdlpuopuiu);
            }
        }).zoijcleaow().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.legacy.presentation.dialogs.specificpromotion.wkgbmnqykc lrnfpwlwnk(SpecificPromotionDialogFragment specificPromotionDialogFragment) {
        return new ru.myspar.legacy.presentation.dialogs.specificpromotion.wkgbmnqykc(new istkbnxepw(specificPromotionDialogFragment) { // from class: ru.myspar.legacy.presentation.dialogs.specificpromotion.SpecificPromotionDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((SpecificPromotionDialogFragment) this.receiver).sflfametgt();
            }
        }, specificPromotionDialogFragment.zfvoamnweg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void opjhrmiecq(SpecificPromotionDialogFragment specificPromotionDialogFragment, DialogInterface dialogInterface) {
        zdlpuopuiu.nufgyqmvbu(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        ((com.google.android.material.bottomsheet.ppxfxbqfkf) dialogInterface).ojitshcjhn().yzdjzghtvl(specificPromotionDialogFragment.sflfametgt().f65436gtknphoqwx.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m60.draadjrbmk sflfametgt() {
        return (m60.draadjrbmk) this.binding.iobyxmoadg(this, f88738pkzmftpjix[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn weqkydbzbr(SpecificPromotionDialogFragment specificPromotionDialogFragment) {
        specificPromotionDialogFragment.ribwqtqdhb().jyumaefscl(ru.myspar.legacy.presentation.dialogs.specificpromotion.zoijcleaow.iobyxmoadg.f88760iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: bfopjjpdmp, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf.zoijcleaow) {
            sopmlzcsov(((ru.myspar.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf.zoijcleaow) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf.iobyxmoadg) {
            dismiss();
        } else {
            if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.legacy.presentation.dialogs.specificpromotion.ppxfxbqfkf.C2036ppxfxbqfkf.f88756iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            iyctptxqzt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
    public ru.myspar.legacy.presentation.dialogs.specificpromotion.wkgbmnqykc vipkmwdibw() {
        return (ru.myspar.legacy.presentation.dialogs.specificpromotion.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f88738pkzmftpjix[0]);
    }

    @Override // ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: hb0.eablkybsjg
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SpecificPromotionDialogFragment.opjhrmiecq(this.f40006iobyxmoadg, dialogInterface);
            }
        });
        return ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ribwqtqdhb() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final ee0.ppxfxbqfkf zfvoamnweg() {
        ee0.ppxfxbqfkf ppxfxbqfkfVar = this.imageUtils;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        zdlpuopuiu.pmvmpeiblj("imageUtils");
        return null;
    }
}
