package dj;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends ArrayList implements gtknphoqwx {
    public iobyxmoadg(int i13) {
        super(i13);
    }

    public /* bridge */ int agtfadlqog(draadjrbmk draadjrbmkVar) {
        return super.lastIndexOf(draadjrbmkVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof draadjrbmk) {
            return iobyxmoadg((draadjrbmk) obj);
        }
        return false;
    }

    public /* bridge */ int draadjrbmk(draadjrbmk draadjrbmkVar) {
        return super.indexOf(draadjrbmkVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof draadjrbmk) {
            return draadjrbmk((draadjrbmk) obj);
        }
        return -1;
    }

    public /* bridge */ boolean iobyxmoadg(draadjrbmk draadjrbmkVar) {
        return super.contains(draadjrbmkVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof draadjrbmk) {
            return agtfadlqog((draadjrbmk) obj);
        }
        return -1;
    }

    public /* bridge */ boolean ojitshcjhn(draadjrbmk draadjrbmkVar) {
        return super.remove(draadjrbmkVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof draadjrbmk) {
            return ojitshcjhn((draadjrbmk) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return wkgbmnqykc();
    }

    public /* bridge */ int wkgbmnqykc() {
        return super.size();
    }
}
