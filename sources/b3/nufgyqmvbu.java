package b3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f15073iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Map f15074zoijcleaow;

    public synchronized Map iobyxmoadg() {
        try {
            if (this.f15074zoijcleaow == null) {
                this.f15074zoijcleaow = Collections.unmodifiableMap(new HashMap(this.f15073iobyxmoadg));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f15074zoijcleaow;
    }
}
