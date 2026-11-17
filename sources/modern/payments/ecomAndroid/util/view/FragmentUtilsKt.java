package modern.payments.ecomAndroid.util.view;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import da.gxszxtbevo;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0018\u0010\u000b\u001a\u00020\u0001*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "", "topPadding", "Lgg/wwaezpbzkn;", "setupFullscreenWithTopPadding", "(Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;I)V", "setupTopPadding", "FULLSCREEN_TOP_PADDING_DP", "I", "getPx", "(I)I", "px", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = FragmentUtilsKt.FULLSCREEN_TOP_PADDING_DP)
public final class FragmentUtilsKt {
    private static final int FULLSCREEN_TOP_PADDING_DP = 48;

    private static final int getPx(int i13) {
        return (int) (i13 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final void setupFullscreenWithTopPadding(BottomSheetDialogFragment bottomSheetDialogFragment, int i13) {
        FragmentContainerView fragmentContainerView;
        ConstraintLayout constraintLayout;
        zdlpuopuiu.btonecajqb(bottomSheetDialogFragment, "<this>");
        Dialog dialog = bottomSheetDialogFragment.getDialog();
        ViewGroup.LayoutParams layoutParams = null;
        FrameLayout frameLayout = dialog != null ? (FrameLayout) dialog.findViewById(gxszxtbevo.design_bottom_sheet) : null;
        ViewGroup.LayoutParams layoutParams2 = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
        }
        Dialog dialog2 = bottomSheetDialogFragment.getDialog();
        ViewGroup.LayoutParams layoutParams3 = (dialog2 == null || (constraintLayout = (ConstraintLayout) dialog2.findViewById(R.id.elbs_cc_container)) == null) ? null : constraintLayout.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.height = -2;
        }
        Dialog dialog3 = bottomSheetDialogFragment.getDialog();
        if (dialog3 != null && (fragmentContainerView = (FragmentContainerView) dialog3.findViewById(R.id.elbs_fcv_container)) != null) {
            layoutParams = fragmentContainerView.getLayoutParams();
        }
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        setupTopPadding(bottomSheetDialogFragment, i13);
    }

    public static /* synthetic */ void setupFullscreenWithTopPadding$default(BottomSheetDialogFragment bottomSheetDialogFragment, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = FULLSCREEN_TOP_PADDING_DP;
        }
        setupFullscreenWithTopPadding(bottomSheetDialogFragment, i13);
    }

    public static final void setupTopPadding(BottomSheetDialogFragment bottomSheetDialogFragment, int i13) {
        zdlpuopuiu.btonecajqb(bottomSheetDialogFragment, "<this>");
        Dialog dialog = bottomSheetDialogFragment.getDialog();
        FrameLayout frameLayout = dialog != null ? (FrameLayout) dialog.findViewById(gxszxtbevo.design_bottom_sheet) : null;
        ViewParent parent = frameLayout != null ? frameLayout.getParent() : null;
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, getPx(i13), ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
            view.setLayoutParams(layoutParams2);
        }
    }

    public static /* synthetic */ void setupTopPadding$default(BottomSheetDialogFragment bottomSheetDialogFragment, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = FULLSCREEN_TOP_PADDING_DP;
        }
        setupTopPadding(bottomSheetDialogFragment, i13);
    }
}
