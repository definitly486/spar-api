package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class kcexrzcfyt implements btonecajqb {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private static final kcexrzcfyt f3832hcddaimhww;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    protected static final Comparator f3833pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    protected final TreeMap f3834ylkuphrtab;

    static {
        Comparator comparator = new Comparator() { // from class: istkbnxepw.crxdokpmqz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return androidx.camera.core.impl.kcexrzcfyt.vipkmwdibw((androidx.camera.core.impl.btonecajqb.iobyxmoadg) obj, (androidx.camera.core.impl.btonecajqb.iobyxmoadg) obj2);
            }
        };
        f3833pkzmftpjix = comparator;
        f3832hcddaimhww = new kcexrzcfyt(new TreeMap(comparator));
    }

    kcexrzcfyt(TreeMap treeMap) {
        this.f3834ylkuphrtab = treeMap;
    }

    public static kcexrzcfyt jlmebxxoox() {
        return f3832hcddaimhww;
    }

    public static kcexrzcfyt ribwqtqdhb(btonecajqb btonecajqbVar) {
        if (kcexrzcfyt.class.equals(btonecajqbVar.getClass())) {
            return (kcexrzcfyt) btonecajqbVar;
        }
        TreeMap treeMap = new TreeMap(f3833pkzmftpjix);
        for (btonecajqb.iobyxmoadg iobyxmoadgVar : btonecajqbVar.eablkybsjg()) {
            Set<btonecajqb.ppxfxbqfkf> setGxszxtbevo = btonecajqbVar.gxszxtbevo(iobyxmoadgVar);
            ArrayMap arrayMap = new ArrayMap();
            for (btonecajqb.ppxfxbqfkf ppxfxbqfkfVar : setGxszxtbevo) {
                arrayMap.put(ppxfxbqfkfVar, btonecajqbVar.wkgbmnqykc(iobyxmoadgVar, ppxfxbqfkfVar));
            }
            treeMap.put(iobyxmoadgVar, arrayMap);
        }
        return new kcexrzcfyt(treeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int vipkmwdibw(btonecajqb.iobyxmoadg iobyxmoadgVar, btonecajqb.iobyxmoadg iobyxmoadgVar2) {
        return iobyxmoadgVar.ppxfxbqfkf().compareTo(iobyxmoadgVar2.ppxfxbqfkf());
    }

    @Override // androidx.camera.core.impl.btonecajqb
    public Set eablkybsjg() {
        return Collections.unmodifiableSet(this.f3834ylkuphrtab.keySet());
    }

    @Override // androidx.camera.core.impl.btonecajqb
    public Set gxszxtbevo(btonecajqb.iobyxmoadg iobyxmoadgVar) {
        Map map = (Map) this.f3834ylkuphrtab.get(iobyxmoadgVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.btonecajqb
    public Object iobyxmoadg(btonecajqb.iobyxmoadg iobyxmoadgVar) {
        Map map = (Map) this.f3834ylkuphrtab.get(iobyxmoadgVar);
        if (map != null) {
            return map.get((btonecajqb.ppxfxbqfkf) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + iobyxmoadgVar);
    }

    @Override // androidx.camera.core.impl.btonecajqb
    public Object lqeggnwhkg(btonecajqb.iobyxmoadg iobyxmoadgVar, Object obj) {
        try {
            return iobyxmoadg(iobyxmoadgVar);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // androidx.camera.core.impl.btonecajqb
    public btonecajqb.ppxfxbqfkf nufgyqmvbu(btonecajqb.iobyxmoadg iobyxmoadgVar) {
        Map map = (Map) this.f3834ylkuphrtab.get(iobyxmoadgVar);
        if (map != null) {
            return (btonecajqb.ppxfxbqfkf) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + iobyxmoadgVar);
    }

    @Override // androidx.camera.core.impl.btonecajqb
    public void ppxfxbqfkf(String str, btonecajqb.zoijcleaow zoijcleaowVar) {
        for (Map.Entry entry : this.f3834ylkuphrtab.tailMap(btonecajqb.iobyxmoadg.iobyxmoadg(str, Void.class)).entrySet()) {
            if (!((btonecajqb.iobyxmoadg) entry.getKey()).ppxfxbqfkf().startsWith(str) || !zoijcleaowVar.iobyxmoadg((btonecajqb.iobyxmoadg) entry.getKey())) {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.btonecajqb
    public Object wkgbmnqykc(btonecajqb.iobyxmoadg iobyxmoadgVar, btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        Map map = (Map) this.f3834ylkuphrtab.get(iobyxmoadgVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + iobyxmoadgVar);
        }
        if (map.containsKey(ppxfxbqfkfVar)) {
            return map.get(ppxfxbqfkfVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + iobyxmoadgVar + " with priority=" + ppxfxbqfkfVar);
    }

    @Override // androidx.camera.core.impl.btonecajqb
    public boolean zoijcleaow(btonecajqb.iobyxmoadg iobyxmoadgVar) {
        return this.f3834ylkuphrtab.containsKey(iobyxmoadgVar);
    }
}
