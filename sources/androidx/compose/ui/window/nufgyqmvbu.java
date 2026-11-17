package androidx.compose.ui.window;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final nufgyqmvbu f7388iobyxmoadg = new nufgyqmvbu();

    private nufgyqmvbu() {
    }

    public static final void eablkybsjg(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    public static final void wkgbmnqykc(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final OnBackInvokedCallback zoijcleaow(final tg.iobyxmoadg iobyxmoadgVar) {
        return new OnBackInvokedCallback() { // from class: androidx.compose.ui.window.lqeggnwhkg
            public final void onBackInvoked() {
                nufgyqmvbu.ppxfxbqfkf(iobyxmoadgVar);
            }
        };
    }
}
