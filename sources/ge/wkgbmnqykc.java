package ge;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tc.zoijcleaow f36966iobyxmoadg;

    public wkgbmnqykc(tc.zoijcleaow zoijcleaowVar) {
        this.f36966iobyxmoadg = zoijcleaowVar;
    }

    public Executor iobyxmoadg(Executor executor) {
        return executor != null ? executor : (Executor) this.f36966iobyxmoadg.get();
    }
}
