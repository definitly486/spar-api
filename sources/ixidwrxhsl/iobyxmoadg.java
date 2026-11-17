package ixidwrxhsl;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg extends hg.btonecajqb {
    public final boolean btonecajqb(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return draadjrbmk(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return wkgbmnqykc((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean draadjrbmk(Map.Entry entry);

    public abstract boolean dxjokdxxww(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return btonecajqb((Map.Entry) obj);
        }
        return false;
    }

    public final boolean wkgbmnqykc(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return dxjokdxxww(entry);
    }
}
