package hg;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu extends AbstractList implements List, ug.wkgbmnqykc {
    protected nufgyqmvbu() {
    }

    public abstract int iobyxmoadg();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i13) {
        return wkgbmnqykc(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return iobyxmoadg();
    }

    public abstract Object wkgbmnqykc(int i13);
}
