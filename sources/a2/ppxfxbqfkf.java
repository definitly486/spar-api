package a2;

import hg.jyumaefscl;
import java.util.ArrayList;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ArrayList f278iobyxmoadg = new ArrayList();

    public final void iobyxmoadg(zoijcleaow listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f278iobyxmoadg.add(listener);
    }

    public final void ppxfxbqfkf(zoijcleaow listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f278iobyxmoadg.remove(listener);
    }

    public final void zoijcleaow() {
        for (int iOjitshcjhn = jyumaefscl.ojitshcjhn(this.f278iobyxmoadg); -1 < iOjitshcjhn; iOjitshcjhn--) {
            ((zoijcleaow) this.f278iobyxmoadg.get(iOjitshcjhn)).zoijcleaow();
        }
    }
}
