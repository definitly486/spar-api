package n2;

import android.content.Context;
import androidx.work.WorkerParameters;
import g6.stevsuqkhv;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends stevsuqkhv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f68440iobyxmoadg;

    iobyxmoadg(Map map) {
        this.f68440iobyxmoadg = map;
    }

    @Override // g6.stevsuqkhv
    public androidx.work.ppxfxbqfkf iobyxmoadg(Context context, String str, WorkerParameters workerParameters) {
        fg.iobyxmoadg iobyxmoadgVar = (fg.iobyxmoadg) this.f68440iobyxmoadg.get(str);
        if (iobyxmoadgVar == null) {
            return null;
        }
        return ((zoijcleaow) iobyxmoadgVar.get()).iobyxmoadg(context, workerParameters);
    }
}
