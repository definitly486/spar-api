package iwxlajgraz;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.w;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final eablkybsjg f49845iobyxmoadg = new eablkybsjg();

    private eablkybsjg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(IntConsumer intConsumer, int i13) {
        intConsumer.accept(i13);
    }

    public final boolean wkgbmnqykc(opjhrmiecq.igdgnonuha igdgnonuhaVar, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (igdgnonuhaVar != null) {
            return roivzttewh.f49927iobyxmoadg.oxmwwwfdhm(igdgnonuhaVar, previewableHandwritingGesture, skhdrjzrfnVar, cancellationSignal);
        }
        return false;
    }

    public final void zoijcleaow(opjhrmiecq.igdgnonuha igdgnonuhaVar, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, HandwritingGesture handwritingGesture, w wVar, Executor executor, final IntConsumer intConsumer, tg.draadjrbmk draadjrbmkVar) {
        final int iLqeggnwhkg = igdgnonuhaVar != null ? roivzttewh.f49927iobyxmoadg.lqeggnwhkg(igdgnonuhaVar, handwritingGesture, skhdrjzrfnVar, wVar, draadjrbmkVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: iwxlajgraz.wkgbmnqykc
                @Override // java.lang.Runnable
                public final void run() {
                    eablkybsjg.ppxfxbqfkf(intConsumer, iLqeggnwhkg);
                }
            });
        } else {
            intConsumer.accept(iLqeggnwhkg);
        }
    }
}
