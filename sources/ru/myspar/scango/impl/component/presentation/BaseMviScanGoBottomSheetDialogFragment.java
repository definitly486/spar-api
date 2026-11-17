package ru.myspar.scango.impl.component.presentation;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.ppxfxbqfkf;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import l22.zoijcleaow;
import modern.payments.ecomAndroid.util.analytics.EcomMetricKey;
import ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import ru.myspar.scango.impl.component.presentation.BaseMviScanGoBottomSheetDialogFragment;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0011\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/myspar/scango/impl/component/presentation/BaseMviScanGoBottomSheetDialogFragment;", "", "Model", EcomMetricKey.ACTION_TYPE, "UiLabel", "Lru/myspar/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "", "layoutId", "<init>", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/google/android/material/bottomsheet/ppxfxbqfkf;", "metgxyhuhe", "(Landroid/os/Bundle;)Lcom/google/android/material/bottomsheet/ppxfxbqfkf;", "Lgg/wwaezpbzkn;", "onDestroy", "()V", "Ll22/zoijcleaow;", "lereixgezr", "Lgg/gtknphoqwx;", "getLoadingDialog", "()Ll22/zoijcleaow;", "loadingDialog", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseMviScanGoBottomSheetDialogFragment<Model, Event, UiLabel> extends BaseMviBottomSheetDialogFragment<Model, Event, UiLabel> {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx loadingDialog;

    public BaseMviScanGoBottomSheetDialogFragment(int i13) {
        super(i13);
        this.loadingDialog = draadjrbmk.zoijcleaow(new iobyxmoadg() { // from class: j22.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return BaseMviScanGoBottomSheetDialogFragment.xrmfcynszj(this.f50571zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zoijcleaow xrmfcynszj(BaseMviScanGoBottomSheetDialogFragment baseMviScanGoBottomSheetDialogFragment) {
        Context contextRequireContext = baseMviScanGoBottomSheetDialogFragment.requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        return new zoijcleaow(contextRequireContext);
    }

    @Override // ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.ojitshcjhn().ikoacuggdj(getCallback());
        return ppxfxbqfkfVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        BottomSheetBehavior bottomSheetBehaviorOjitshcjhn;
        Dialog dialog = getDialog();
        ppxfxbqfkf ppxfxbqfkfVar = dialog instanceof ppxfxbqfkf ? (ppxfxbqfkf) dialog : null;
        if (ppxfxbqfkfVar != null && (bottomSheetBehaviorOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn()) != null) {
            bottomSheetBehaviorOjitshcjhn.wizcaqwiak(getCallback());
        }
        super.onDestroy();
    }
}
