package ai;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class czzsidtyhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f1922iobyxmoadg;

    public czzsidtyhn(Map map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "map");
        this.f1922iobyxmoadg = map;
    }

    public final czzsidtyhn iobyxmoadg() {
        Map map = this.f1922iobyxmoadg;
        LinkedHashMap linkedHashMap = new LinkedHashMap(hg.tzroggbefp.eablkybsjg(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), nufgyqmvbu.ppxfxbqfkf((nufgyqmvbu) entry.getValue(), null, null, false, true, 7, null));
        }
        return new czzsidtyhn(linkedHashMap);
    }

    public final Map zoijcleaow() {
        return this.f1922iobyxmoadg;
    }
}
