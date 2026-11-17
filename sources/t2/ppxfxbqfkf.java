package t2;

import androidx.lifecycle.crxdokpmqz;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f109321iobyxmoadg = new LinkedHashMap();

    public final void iobyxmoadg(ah.wkgbmnqykc clazz, draadjrbmk initializer) {
        zdlpuopuiu.btonecajqb(clazz, "clazz");
        zdlpuopuiu.btonecajqb(initializer, "initializer");
        if (!this.f109321iobyxmoadg.containsKey(clazz)) {
            this.f109321iobyxmoadg.put(clazz, new gxszxtbevo(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + u2.iobyxmoadg.iobyxmoadg(clazz) + '.').toString());
    }

    public final crxdokpmqz.ppxfxbqfkf zoijcleaow() {
        return u2.nufgyqmvbu.f112511iobyxmoadg.iobyxmoadg(this.f109321iobyxmoadg.values());
    }
}
