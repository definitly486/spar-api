package bz;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class iobyxmoadg extends metgxyhuhe {
    iobyxmoadg() {
        super(kc2.lqeggnwhkg.AgentBootTime);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        return String.valueOf(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()));
    }
}
