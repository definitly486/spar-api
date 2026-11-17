package g2;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f35831iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicBoolean f35832zoijcleaow;

    /* JADX INFO: renamed from: g2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0811iobyxmoadg extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final C0811iobyxmoadg f35833zdlpuopuiu = new C0811iobyxmoadg();

        C0811iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            zdlpuopuiu.btonecajqb(entry, "entry");
            return "  " + ((wkgbmnqykc.iobyxmoadg) entry.getKey()).iobyxmoadg() + " = " + entry.getValue();
        }
    }

    public /* synthetic */ iobyxmoadg(Map map, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new LinkedHashMap() : map, (i13 & 2) != 0 ? true : z13);
    }

    public final void btonecajqb(wkgbmnqykc.iobyxmoadg key, Object obj) {
        zdlpuopuiu.btonecajqb(key, "key");
        eablkybsjg();
        if (obj == null) {
            nufgyqmvbu(key);
            return;
        }
        if (!(obj instanceof Set)) {
            this.f35831iobyxmoadg.put(key, obj);
            return;
        }
        Map map = this.f35831iobyxmoadg;
        Set setUnmodifiableSet = Collections.unmodifiableSet(hg.jyumaefscl.r((Iterable) obj));
        zdlpuopuiu.dxjokdxxww(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(key, setUnmodifiableSet);
    }

    public final void dxjokdxxww(wkgbmnqykc.iobyxmoadg key, Object obj) {
        zdlpuopuiu.btonecajqb(key, "key");
        btonecajqb(key, obj);
    }

    public final void eablkybsjg() {
        if (this.f35832zoijcleaow.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof iobyxmoadg) {
            return zdlpuopuiu.eablkybsjg(this.f35831iobyxmoadg, ((iobyxmoadg) obj).f35831iobyxmoadg);
        }
        return false;
    }

    public final void gxszxtbevo() {
        this.f35832zoijcleaow.set(true);
    }

    public int hashCode() {
        return this.f35831iobyxmoadg.hashCode();
    }

    @Override // g2.wkgbmnqykc
    public Map iobyxmoadg() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f35831iobyxmoadg);
        zdlpuopuiu.dxjokdxxww(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    public final void lqeggnwhkg(wkgbmnqykc.zoijcleaow... pairs) {
        zdlpuopuiu.btonecajqb(pairs, "pairs");
        eablkybsjg();
        if (pairs.length <= 0) {
            return;
        }
        wkgbmnqykc.zoijcleaow zoijcleaowVar = pairs[0];
        throw null;
    }

    public final Object nufgyqmvbu(wkgbmnqykc.iobyxmoadg key) {
        zdlpuopuiu.btonecajqb(key, "key");
        eablkybsjg();
        return this.f35831iobyxmoadg.remove(key);
    }

    public String toString() {
        return hg.jyumaefscl.iwxlajgraz(this.f35831iobyxmoadg.entrySet(), ",\n", "{\n", "\n}", 0, null, C0811iobyxmoadg.f35833zdlpuopuiu, 24, null);
    }

    @Override // g2.wkgbmnqykc
    public Object zoijcleaow(wkgbmnqykc.iobyxmoadg key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return this.f35831iobyxmoadg.get(key);
    }

    public iobyxmoadg(Map preferencesMap, boolean z13) {
        zdlpuopuiu.btonecajqb(preferencesMap, "preferencesMap");
        this.f35831iobyxmoadg = preferencesMap;
        this.f35832zoijcleaow = new AtomicBoolean(z13);
    }
}
