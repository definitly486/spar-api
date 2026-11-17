package ru.myspar.legacy.presentation.dialogs.rateorder;

import android.app.Dialog;
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
import ru.myspar.core.domain.models.payload.MySparScreenPayload;
import ru.myspar.domain.feature.rateorder.model.RateOrderDialogArgs;
import ru.myspar.legacy.presentation.dialogs.rateorder.RateOrderDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 52\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00016B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u00002\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lru/myspar/legacy/presentation/dialogs/rateorder/RateOrderDialogFragment;", "Lru/myspar/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Lfb0/lqeggnwhkg;", "Lru/myspar/legacy/presentation/dialogs/rateorder/zoijcleaow;", "Lru/myspar/legacy/presentation/dialogs/rateorder/ppxfxbqfkf;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/google/android/material/bottomsheet/ppxfxbqfkf;", "opjhrmiecq", "(Landroid/os/Bundle;)Lcom/google/android/material/bottomsheet/ppxfxbqfkf;", "uiLabel", "Lgg/wwaezpbzkn;", "bfopjjpdmp", "(Lru/myspar/legacy/presentation/dialogs/rateorder/ppxfxbqfkf;)V", "Lkotlin/Function0;", "action", "weqkydbzbr", "(Ltg/iobyxmoadg;)Lru/myspar/legacy/presentation/dialogs/rateorder/RateOrderDialogFragment;", "Lkotlin/Function1;", "Lru/myspar/core/domain/models/payload/MySparScreenPayload;", "iyctptxqzt", "(Ltg/draadjrbmk;)Lru/myspar/legacy/presentation/dialogs/rateorder/RateOrderDialogFragment;", "yadqdtsiqt", "Ltg/draadjrbmk;", "arrowClickListener", "iozdgvuglv", "Ltg/iobyxmoadg;", "saveRateClickListener", "Lru/myspar/legacy/presentation/dialogs/rateorder/iobyxmoadg;", "lmojexxdyd", "Lgg/gtknphoqwx;", "sflfametgt", "()Lru/myspar/legacy/presentation/dialogs/rateorder/iobyxmoadg;", "binder", "Lru/myspar/legacy/presentation/dialogs/rateorder/wkgbmnqykc;", "wwaezpbzkn", "Lzs/ppxfxbqfkf;", "oipsdeybqn", "()Lru/myspar/legacy/presentation/dialogs/rateorder/wkgbmnqykc;", "viewImpl", "Lm60/gtknphoqwx;", "ylkuphrtab", "Lys/ppxfxbqfkf;", "zfvoamnweg", "()Lm60/gtknphoqwx;", "binding", "Lru/myspar/domain/feature/rateorder/model/RateOrderDialogArgs;", "pkzmftpjix", "ydmasvzmpa", "()Lru/myspar/domain/feature/rateorder/model/RateOrderDialogArgs;", "args", "hcddaimhww", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RateOrderDialogFragment extends Hilt_RateOrderDialogFragment<fb0.lqeggnwhkg, ru.myspar.legacy.presentation.dialogs.rateorder.zoijcleaow, ru.myspar.legacy.presentation.dialogs.rateorder.ppxfxbqfkf> {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg saveRateClickListener;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx args;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk arrowClickListener;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f88681jpowsppfya = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(RateOrderDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/legacy/presentation/dialogs/rateorder/RateOrderDialogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(RateOrderDialogFragment.class, "binding", "getBinding()Lru/myspar/databinding/DialogFragmentRateOrderBinding;", 0))};

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    public static final int f88680hkdspvbjdz = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f88688zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88688zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f88688zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f88689yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f88690zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88690zdlpuopuiu = iobyxmoadgVar;
            this.f88689yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f88690zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f88689yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.dialogs.rateorder.RateOrderDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final RateOrderDialogFragment iobyxmoadg(RateOrderDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (RateOrderDialogFragment) b40.iobyxmoadg.zoijcleaow(new RateOrderDialogFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f88691yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f88692zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88692zdlpuopuiu = fragment;
            this.f88691yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f88691yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f88692zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f88693zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f88693zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f88693zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f88694zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f88694zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f88694zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f88695zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, m60.gtknphoqwx.class, "bind", "bind(Landroid/view/View;)Lru/myspar/databinding/DialogFragmentRateOrderBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final m60.gtknphoqwx invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return m60.gtknphoqwx.iobyxmoadg(p13);
        }
    }

    public RateOrderDialogFragment() {
        super(pm.gxszxtbevo.dialog_fragment_rate_order);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: fb0.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return RateOrderDialogFragment.lrnfpwlwnk(this.f33388zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f88695zdlpuopuiu);
        this.args = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: fb0.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return RateOrderDialogFragment.yfnezrywwk(this.f33380zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.legacy.presentation.dialogs.rateorder.wkgbmnqykc lrnfpwlwnk(RateOrderDialogFragment rateOrderDialogFragment) {
        return new ru.myspar.legacy.presentation.dialogs.rateorder.wkgbmnqykc(new istkbnxepw(rateOrderDialogFragment) { // from class: ru.myspar.legacy.presentation.dialogs.rateorder.RateOrderDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((RateOrderDialogFragment) this.receiver).zfvoamnweg();
            }
        }, rateOrderDialogFragment.ydmasvzmpa());
    }

    private final RateOrderDialogArgs ydmasvzmpa() {
        return (RateOrderDialogArgs) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RateOrderDialogArgs yfnezrywwk(RateOrderDialogFragment rateOrderDialogFragment) {
        return (RateOrderDialogArgs) qs.ppxfxbqfkf.wkgbmnqykc(rateOrderDialogFragment, cllcsxoeiz.zoijcleaow(RateOrderDialogArgs.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m60.gtknphoqwx zfvoamnweg() {
        return (m60.gtknphoqwx) this.binding.iobyxmoadg(this, f88681jpowsppfya[1]);
    }

    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: bfopjjpdmp, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.legacy.presentation.dialogs.rateorder.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.legacy.presentation.dialogs.rateorder.ppxfxbqfkf.zoijcleaow) {
            sopmlzcsov(((ru.myspar.legacy.presentation.dialogs.rateorder.ppxfxbqfkf.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.legacy.presentation.dialogs.rateorder.ppxfxbqfkf.C2034ppxfxbqfkf) {
            tg.iobyxmoadg iobyxmoadgVar = this.saveRateClickListener;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
            dismiss();
            return;
        }
        if (!(uiLabel instanceof ru.myspar.legacy.presentation.dialogs.rateorder.ppxfxbqfkf.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        draadjrbmk draadjrbmkVar = this.arrowClickListener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(new MySparScreenPayload(MySparScreenPayload.zoijcleaow.ORDER, ((ru.myspar.legacy.presentation.dialogs.rateorder.ppxfxbqfkf.iobyxmoadg) uiLabel).iobyxmoadg(), null, null, 12, null));
        }
        dismiss();
    }

    public final RateOrderDialogFragment iyctptxqzt(draadjrbmk action) {
        this.arrowClickListener = action;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
    public ru.myspar.legacy.presentation.dialogs.rateorder.wkgbmnqykc vipkmwdibw() {
        return (ru.myspar.legacy.presentation.dialogs.rateorder.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f88681jpowsppfya[0]);
    }

    @Override // ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    /* JADX INFO: renamed from: opjhrmiecq, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.bottomsheet.ppxfxbqfkf onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.ojitshcjhn().c(3);
        ppxfxbqfkfVar.ojitshcjhn().b(true);
        ppxfxbqfkfVar.ojitshcjhn().ipoelvxyzq(true);
        return ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ribwqtqdhb() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final RateOrderDialogFragment weqkydbzbr(tg.iobyxmoadg action) {
        this.saveRateClickListener = action;
        return this;
    }
}
