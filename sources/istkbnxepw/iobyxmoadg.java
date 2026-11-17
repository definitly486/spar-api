package istkbnxepw;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends istkbnxepw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Executor f49335iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Handler f49336zoijcleaow;

    iobyxmoadg(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f49335iobyxmoadg = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f49336zoijcleaow = handler;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof istkbnxepw)) {
            return false;
        }
        istkbnxepw istkbnxepwVar = (istkbnxepw) obj;
        return this.f49335iobyxmoadg.equals(istkbnxepwVar.zoijcleaow()) && this.f49336zoijcleaow.equals(istkbnxepwVar.ppxfxbqfkf());
    }

    public int hashCode() {
        return ((this.f49335iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f49336zoijcleaow.hashCode();
    }

    @Override // istkbnxepw.istkbnxepw
    public Handler ppxfxbqfkf() {
        return this.f49336zoijcleaow;
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f49335iobyxmoadg + ", schedulerHandler=" + this.f49336zoijcleaow + "}";
    }

    @Override // istkbnxepw.istkbnxepw
    public Executor zoijcleaow() {
        return this.f49335iobyxmoadg;
    }
}
