package r6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import pj.iyctptxqzt;
import pj.pkzmftpjix;
import q6.yadqdtsiqt;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f81826iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final Handler f81827ppxfxbqfkf = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Executor f81828wkgbmnqykc = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pkzmftpjix f81829zoijcleaow;

    class iobyxmoadg implements Executor {
        iobyxmoadg() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            ppxfxbqfkf.this.f81827ppxfxbqfkf.post(runnable);
        }
    }

    public ppxfxbqfkf(Executor executor) {
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(executor);
        this.f81826iobyxmoadg = yadqdtsiqtVar;
        this.f81829zoijcleaow = iyctptxqzt.zoijcleaow(yadqdtsiqtVar);
    }

    @Override // r6.zoijcleaow
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public yadqdtsiqt ppxfxbqfkf() {
        return this.f81826iobyxmoadg;
    }

    @Override // r6.zoijcleaow
    public Executor iobyxmoadg() {
        return this.f81828wkgbmnqykc;
    }

    @Override // r6.zoijcleaow
    public pkzmftpjix zoijcleaow() {
        return this.f81829zoijcleaow;
    }
}
