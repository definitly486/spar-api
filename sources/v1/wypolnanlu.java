package v1;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class wypolnanlu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f115238iobyxmoadg;

    /* JADX INFO: Access modifiers changed from: private */
    static class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final View f115239iobyxmoadg;

        iobyxmoadg(View view) {
            this.f115239iobyxmoadg = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void wkgbmnqykc(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // v1.wypolnanlu.ppxfxbqfkf
        void iobyxmoadg() {
            View view = this.f115239iobyxmoadg;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f115239iobyxmoadg.getWindowToken(), 0);
            }
        }

        @Override // v1.wypolnanlu.ppxfxbqfkf
        void zoijcleaow() {
            final View viewFindViewById = this.f115239iobyxmoadg;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f115239iobyxmoadg.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: v1.dsvhmnatus
                @Override // java.lang.Runnable
                public final void run() {
                    wypolnanlu.iobyxmoadg.wkgbmnqykc(viewFindViewById);
                }
            });
        }
    }

    private static class ppxfxbqfkf {
        ppxfxbqfkf() {
        }

        abstract void iobyxmoadg();

        abstract void zoijcleaow();
    }

    public wypolnanlu(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f115238iobyxmoadg = new zoijcleaow(view);
        } else {
            this.f115238iobyxmoadg = new iobyxmoadg(view);
        }
    }

    public void iobyxmoadg() {
        this.f115238iobyxmoadg.iobyxmoadg();
    }

    public void zoijcleaow() {
        this.f115238iobyxmoadg.zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private WindowInsetsController f115240ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private View f115241zoijcleaow;

        zoijcleaow(View view) {
            super(view);
            this.f115241zoijcleaow = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void gxszxtbevo(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i13) {
            atomicBoolean.set((i13 & 8) != 0);
        }

        @Override // v1.wypolnanlu.iobyxmoadg, v1.wypolnanlu.ppxfxbqfkf
        void iobyxmoadg() {
            View view;
            WindowInsetsController windowInsetsController = this.f115240ppxfxbqfkf;
            if (windowInsetsController == null) {
                View view2 = this.f115241zoijcleaow;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.iobyxmoadg();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: v1.sopmlzcsov
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i13) {
                    wypolnanlu.zoijcleaow.gxszxtbevo(atomicBoolean, windowInsetsController2, i13);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f115241zoijcleaow) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f115241zoijcleaow.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // v1.wypolnanlu.iobyxmoadg, v1.wypolnanlu.ppxfxbqfkf
        void zoijcleaow() {
            View view = this.f115241zoijcleaow;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f115240ppxfxbqfkf;
            if (windowInsetsController == null) {
                View view2 = this.f115241zoijcleaow;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.zoijcleaow();
        }

        zoijcleaow(WindowInsetsController windowInsetsController) {
            super(null);
            this.f115240ppxfxbqfkf = windowInsetsController;
        }
    }

    wypolnanlu(WindowInsetsController windowInsetsController) {
        this.f115238iobyxmoadg = new zoijcleaow(windowInsetsController);
    }
}
