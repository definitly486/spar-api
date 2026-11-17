package qk;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.iozdgvuglv;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f79054iobyxmoadg = new LinkedHashSet();

    public final synchronized void iobyxmoadg(iozdgvuglv route) {
        zdlpuopuiu.btonecajqb(route, "route");
        this.f79054iobyxmoadg.remove(route);
    }

    public final synchronized boolean ppxfxbqfkf(iozdgvuglv route) {
        zdlpuopuiu.btonecajqb(route, "route");
        return this.f79054iobyxmoadg.contains(route);
    }

    public final synchronized void zoijcleaow(iozdgvuglv failedRoute) {
        zdlpuopuiu.btonecajqb(failedRoute, "failedRoute");
        this.f79054iobyxmoadg.add(failedRoute);
    }
}
