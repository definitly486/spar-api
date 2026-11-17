package ag;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class iobyxmoadg implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f1712iobyxmoadg;

    /* JADX INFO: renamed from: ag.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static abstract class AbstractC0036iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final LinkedHashMap f1713iobyxmoadg;

        AbstractC0036iobyxmoadg(int i13) {
            this.f1713iobyxmoadg = zoijcleaow.zoijcleaow(i13);
        }

        AbstractC0036iobyxmoadg iobyxmoadg(Object obj, btonecajqb btonecajqbVar) {
            this.f1713iobyxmoadg.put(dxjokdxxww.ppxfxbqfkf(obj, "key"), dxjokdxxww.ppxfxbqfkf(btonecajqbVar, "provider"));
            return this;
        }
    }

    iobyxmoadg(Map map) {
        this.f1712iobyxmoadg = Collections.unmodifiableMap(map);
    }

    final Map iobyxmoadg() {
        return this.f1712iobyxmoadg;
    }
}
