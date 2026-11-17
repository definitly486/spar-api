package ig;

import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg extends hg.btonecajqb {
    public abstract /* bridge */ boolean btonecajqb(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return wkgbmnqykc((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean dxjokdxxww(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return btonecajqb((Map.Entry) obj);
        }
        return false;
    }

    public final boolean wkgbmnqykc(Map.Entry element) {
        zdlpuopuiu.btonecajqb(element, "element");
        return dxjokdxxww(element);
    }
}
