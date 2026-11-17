package na;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f69401iobyxmoadg = iobyxmoadg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final View f69402ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final na.zoijcleaow f69403zoijcleaow;

    /* JADX INFO: renamed from: na.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private static class C1491ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: na.ppxfxbqfkf$ppxfxbqfkf$iobyxmoadg */
        class iobyxmoadg implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ na.zoijcleaow f69404iobyxmoadg;

            iobyxmoadg(na.zoijcleaow zoijcleaowVar) {
                this.f69404iobyxmoadg = zoijcleaowVar;
            }

            public void onBackCancelled() {
                if (C1491ppxfxbqfkf.this.wkgbmnqykc()) {
                    this.f69404iobyxmoadg.iobyxmoadg();
                }
            }

            public void onBackInvoked() {
                this.f69404iobyxmoadg.wkgbmnqykc();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C1491ppxfxbqfkf.this.wkgbmnqykc()) {
                    this.f69404iobyxmoadg.ppxfxbqfkf(new androidx.activity.zoijcleaow(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C1491ppxfxbqfkf.this.wkgbmnqykc()) {
                    this.f69404iobyxmoadg.zoijcleaow(new androidx.activity.zoijcleaow(backEvent));
                }
            }
        }

        private C1491ppxfxbqfkf() {
            super();
        }

        @Override // na.ppxfxbqfkf.zoijcleaow
        OnBackInvokedCallback ppxfxbqfkf(na.zoijcleaow zoijcleaowVar) {
            return new iobyxmoadg(zoijcleaowVar);
        }
    }

    private interface wkgbmnqykc {
        void iobyxmoadg(View view);

        void zoijcleaow(na.zoijcleaow zoijcleaowVar, View view, boolean z13);
    }

    private static class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private OnBackInvokedCallback f69406iobyxmoadg;

        private zoijcleaow() {
        }

        @Override // na.ppxfxbqfkf.wkgbmnqykc
        public void iobyxmoadg(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f69406iobyxmoadg);
            this.f69406iobyxmoadg = null;
        }

        OnBackInvokedCallback ppxfxbqfkf(final na.zoijcleaow zoijcleaowVar) {
            Objects.requireNonNull(zoijcleaowVar);
            return new OnBackInvokedCallback() { // from class: na.eablkybsjg
                public final void onBackInvoked() {
                    zoijcleaowVar.wkgbmnqykc();
                }
            };
        }

        boolean wkgbmnqykc() {
            return this.f69406iobyxmoadg != null;
        }

        @Override // na.ppxfxbqfkf.wkgbmnqykc
        public void zoijcleaow(na.zoijcleaow zoijcleaowVar, View view, boolean z13) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f69406iobyxmoadg == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackPpxfxbqfkf = ppxfxbqfkf(zoijcleaowVar);
                this.f69406iobyxmoadg = onBackInvokedCallbackPpxfxbqfkf;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z13 ? 1000000 : 0, onBackInvokedCallbackPpxfxbqfkf);
            }
        }
    }

    public ppxfxbqfkf(na.zoijcleaow zoijcleaowVar, View view) {
        this.f69403zoijcleaow = zoijcleaowVar;
        this.f69402ppxfxbqfkf = view;
    }

    private static wkgbmnqykc iobyxmoadg() {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            return new C1491ppxfxbqfkf();
        }
        if (i13 >= 33) {
            return new zoijcleaow();
        }
        return null;
    }

    private void ppxfxbqfkf(boolean z13) {
        wkgbmnqykc wkgbmnqykcVar = this.f69401iobyxmoadg;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.zoijcleaow(this.f69403zoijcleaow, this.f69402ppxfxbqfkf, z13);
        }
    }

    public void wkgbmnqykc() {
        wkgbmnqykc wkgbmnqykcVar = this.f69401iobyxmoadg;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.iobyxmoadg(this.f69402ppxfxbqfkf);
        }
    }

    public void zoijcleaow() {
        ppxfxbqfkf(false);
    }
}
