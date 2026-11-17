package g3;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final h0 f35976wkgbmnqykc = new h0("");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f35977iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f35978ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f35979zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public LogSessionId f35980iobyxmoadg = LogSessionId.LOG_SESSION_ID_NONE;

        public void iobyxmoadg(LogSessionId logSessionId) {
            y2.iobyxmoadg.lqeggnwhkg(this.f35980iobyxmoadg.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f35980iobyxmoadg = logSessionId;
        }
    }

    public h0(String str) {
        this.f35977iobyxmoadg = str;
        this.f35979zoijcleaow = y2.stevsuqkhv.f123602iobyxmoadg >= 31 ? new iobyxmoadg() : null;
        this.f35978ppxfxbqfkf = new Object();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Objects.equals(this.f35977iobyxmoadg, h0Var.f35977iobyxmoadg) && Objects.equals(this.f35979zoijcleaow, h0Var.f35979zoijcleaow) && Objects.equals(this.f35978ppxfxbqfkf, h0Var.f35978ppxfxbqfkf);
    }

    public int hashCode() {
        return Objects.hash(this.f35977iobyxmoadg, this.f35979zoijcleaow, this.f35978ppxfxbqfkf);
    }

    public synchronized LogSessionId iobyxmoadg() {
        return ((iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f35979zoijcleaow)).f35980iobyxmoadg;
    }

    public synchronized void zoijcleaow(LogSessionId logSessionId) {
        ((iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f35979zoijcleaow)).iobyxmoadg(logSessionId);
    }
}
