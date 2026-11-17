package modern.payments.ecomAndroid.presentation.base;

import a6.iobyxmoadg;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.oxmwwwfdhm;
import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.presentation.base.BaseFragmentWithKeyboardListenerViewModel;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\b\b\u0002\u0010\u0005*\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/AbstractFragmentWithKeyboardListener;", "ActionEvent", "Lmodern/payments/ecomAndroid/presentation/base/BaseFragmentWithKeyboardListenerViewModel;", "VM", "La6/iobyxmoadg;", "B", "Lmodern/payments/ecomAndroid/presentation/base/BaseFragment;", "<init>", "()V", "Lgg/wwaezpbzkn;", "keyboardStateListener", "Landroidx/constraintlayout/widget/ConstraintLayout;", "frameLayout", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayoutListener", "(Landroidx/constraintlayout/widget/ConstraintLayout;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "setUpViews", "onDestroyView", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractFragmentWithKeyboardListener<ActionEvent, VM extends BaseFragmentWithKeyboardListenerViewModel<ActionEvent>, B extends a6.iobyxmoadg> extends BaseFragment<ActionEvent, VM, B> {
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;

    private final void keyboardStateListener() {
        FragmentManager supportFragmentManager;
        List listIgdgnonuha;
        Fragment fragment;
        View view;
        ConstraintLayout constraintLayout;
        oxmwwwfdhm activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (listIgdgnonuha = supportFragmentManager.igdgnonuha()) == null || (fragment = (Fragment) jyumaefscl.weqkydbzbr(listIgdgnonuha)) == null || (view = fragment.getView()) == null || (constraintLayout = (ConstraintLayout) view.findViewById(R.id.elbs_cc_container)) == null) {
            return;
        }
        this.onGlobalLayoutListener = onGlobalLayoutListener(constraintLayout);
        ViewTreeObserver viewTreeObserver = constraintLayout.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.onGlobalLayoutListener);
        }
    }

    private final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener(final ConstraintLayout frameLayout) {
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: modern.payments.ecomAndroid.presentation.base.iobyxmoadg
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AbstractFragmentWithKeyboardListener.onGlobalLayoutListener$lambda$1(frameLayout, this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onGlobalLayoutListener$lambda$1(ConstraintLayout frameLayout, AbstractFragmentWithKeyboardListener this$0) {
        zdlpuopuiu.btonecajqb(frameLayout, "$frameLayout");
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        Rect rect = new Rect();
        frameLayout.getWindowVisibleDisplayFrame(rect);
        int height = frameLayout.getRootView().getHeight();
        int i13 = height - rect.bottom;
        int height2 = frameLayout.getRootView().getHeight() - (rect.bottom - rect.top);
        if (height2 < 0) {
            return;
        }
        try {
            KeyboardState keyboardState = (KeyboardState) ((BaseFragmentWithKeyboardListenerViewModel) this$0.getViewModel()).getIsKeyboardVisible().getValue();
            boolean z13 = ((double) i13) > ((double) height) * 0.15d;
            if (keyboardState.getIsVisible() != z13) {
                ((BaseFragmentWithKeyboardListenerViewModel) this$0.getViewModel()).setKeyboardVisibility(new KeyboardState(z13, height2));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        oxmwwwfdhm activity;
        FrameLayout frameLayout;
        ViewTreeObserver viewTreeObserver;
        if (this.onGlobalLayoutListener != null && (activity = getActivity()) != null && (frameLayout = (FrameLayout) activity.findViewById(R.id.elbs_cc_container)) != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        }
        super.onDestroyView();
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseFragment
    public void setUpViews() {
        super.setUpViews();
        keyboardStateListener();
    }
}
