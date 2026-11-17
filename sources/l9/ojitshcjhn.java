package l9;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f61920iobyxmoadg = new LinkedHashMap();

    public final void iobyxmoadg(String key, Object data) {
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(data, "data");
        draadjrbmk draadjrbmkVar = (draadjrbmk) this.f61920iobyxmoadg.remove(key);
        if (draadjrbmkVar == null) {
            return;
        }
        draadjrbmkVar.iobyxmoadg(data);
    }

    public final wflxmlrfwp zoijcleaow(final String key, draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f61920iobyxmoadg.put(key, listener);
        return new wflxmlrfwp() { // from class: l9.agtfadlqog
        };
    }
}
