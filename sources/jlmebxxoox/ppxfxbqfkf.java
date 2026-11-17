package jlmebxxoox;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinkedHashMap f51697iobyxmoadg;

    public ppxfxbqfkf(int i13, float f13) {
        this.f51697iobyxmoadg = new LinkedHashMap(i13, f13, true);
    }

    public final Object eablkybsjg(Object key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return this.f51697iobyxmoadg.remove(key);
    }

    public final Object iobyxmoadg(Object key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return this.f51697iobyxmoadg.get(key);
    }

    public final boolean ppxfxbqfkf() {
        return this.f51697iobyxmoadg.isEmpty();
    }

    public final Object wkgbmnqykc(Object key, Object value) {
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(value, "value");
        return this.f51697iobyxmoadg.put(key, value);
    }

    public final Set zoijcleaow() {
        Set setEntrySet = this.f51697iobyxmoadg.entrySet();
        zdlpuopuiu.dxjokdxxww(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }
}
