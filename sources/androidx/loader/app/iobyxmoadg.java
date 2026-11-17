package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.ribwqtqdhb;
import androidx.lifecycle.vdvldrhtss;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: androidx.loader.app.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC0153iobyxmoadg {
        androidx.loader.content.zoijcleaow onCreateLoader(int i13, Bundle bundle);

        void onLoadFinished(androidx.loader.content.zoijcleaow zoijcleaowVar, Object obj);

        void onLoaderReset(androidx.loader.content.zoijcleaow zoijcleaowVar);
    }

    public static iobyxmoadg zoijcleaow(vdvldrhtss vdvldrhtssVar) {
        return new zoijcleaow(vdvldrhtssVar, ((ribwqtqdhb) vdvldrhtssVar).getViewModelStore());
    }

    public abstract void iobyxmoadg(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract androidx.loader.content.zoijcleaow ppxfxbqfkf(int i13, Bundle bundle, InterfaceC0153iobyxmoadg interfaceC0153iobyxmoadg);

    public abstract void wkgbmnqykc();
}
