package zr0;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pkzmftpjix f131080iobyxmoadg;

    public iobyxmoadg(pkzmftpjix coroutineDispatcher) {
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f131080iobyxmoadg = coroutineDispatcher;
    }

    protected abstract lqeggnwhkg iobyxmoadg(Object obj);

    public final lqeggnwhkg zoijcleaow(Object obj) {
        return dxjokdxxww.jpowsppfya(iobyxmoadg(obj), this.f131080iobyxmoadg);
    }
}
