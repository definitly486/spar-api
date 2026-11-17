package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class oxmwwwfdhm extends kcexrzcfyt implements vdvldrhtss {

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private static final btonecajqb.ppxfxbqfkf f3845jpowsppfya = btonecajqb.ppxfxbqfkf.OPTIONAL;

    private oxmwwwfdhm(TreeMap treeMap) {
        super(treeMap);
    }

    public static oxmwwwfdhm ikoacuggdj(btonecajqb btonecajqbVar) {
        TreeMap treeMap = new TreeMap(kcexrzcfyt.f3833pkzmftpjix);
        for (btonecajqb.iobyxmoadg iobyxmoadgVar : btonecajqbVar.eablkybsjg()) {
            Set<btonecajqb.ppxfxbqfkf> setGxszxtbevo = btonecajqbVar.gxszxtbevo(iobyxmoadgVar);
            ArrayMap arrayMap = new ArrayMap();
            for (btonecajqb.ppxfxbqfkf ppxfxbqfkfVar : setGxszxtbevo) {
                arrayMap.put(ppxfxbqfkfVar, btonecajqbVar.wkgbmnqykc(iobyxmoadgVar, ppxfxbqfkfVar));
            }
            treeMap.put(iobyxmoadgVar, arrayMap);
        }
        return new oxmwwwfdhm(treeMap);
    }

    public static oxmwwwfdhm jhduphickx() {
        return new oxmwwwfdhm(new TreeMap(kcexrzcfyt.f3833pkzmftpjix));
    }

    @Override // androidx.camera.core.impl.vdvldrhtss
    public void ojitshcjhn(btonecajqb.iobyxmoadg iobyxmoadgVar, btonecajqb.ppxfxbqfkf ppxfxbqfkfVar, Object obj) {
        Map map = (Map) this.f3834ylkuphrtab.get(iobyxmoadgVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f3834ylkuphrtab.put(iobyxmoadgVar, arrayMap);
            arrayMap.put(ppxfxbqfkfVar, obj);
            return;
        }
        btonecajqb.ppxfxbqfkf ppxfxbqfkfVar2 = (btonecajqb.ppxfxbqfkf) Collections.min(map.keySet());
        if (Objects.equals(map.get(ppxfxbqfkfVar2), obj) || !btonecajqb.pmvmpeiblj(ppxfxbqfkfVar2, ppxfxbqfkfVar)) {
            map.put(ppxfxbqfkfVar, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + iobyxmoadgVar.ppxfxbqfkf() + ", existing value (" + ppxfxbqfkfVar2 + ")=" + map.get(ppxfxbqfkfVar2) + ", conflicting (" + ppxfxbqfkfVar + ")=" + obj);
    }

    public Object okpsazkaxt(btonecajqb.iobyxmoadg iobyxmoadgVar) {
        return this.f3834ylkuphrtab.remove(iobyxmoadgVar);
    }

    @Override // androidx.camera.core.impl.vdvldrhtss
    public void vdvldrhtss(btonecajqb.iobyxmoadg iobyxmoadgVar, Object obj) {
        ojitshcjhn(iobyxmoadgVar, f3845jpowsppfya, obj);
    }
}
