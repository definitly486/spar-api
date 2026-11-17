package androidx.window.layout;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public interface agtfadlqog {

    public interface iobyxmoadg {
        void onWindowLayoutChanged(Activity activity, iwizpuwonk iwizpuwonkVar);
    }

    void onWindowLayoutChangeListenerAdded(Activity activity);

    void onWindowLayoutChangeListenerRemoved(Activity activity);

    void setExtensionCallback(iobyxmoadg iobyxmoadgVar);
}
