package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class pmvmpeiblj extends ppxfxbqfkf implements zynmafqrjb, RandomAccess {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final zynmafqrjb f23993iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final pmvmpeiblj f23994jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f23995yggfygwlhe;

    static {
        pmvmpeiblj pmvmpeibljVar = new pmvmpeiblj();
        f23994jyumaefscl = pmvmpeibljVar;
        pmvmpeibljVar.makeImmutable();
        f23993iwizpuwonk = pmvmpeibljVar;
    }

    public pmvmpeiblj() {
        this(10);
    }

    private static String ppxfxbqfkf(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof nufgyqmvbu ? ((nufgyqmvbu) obj).lmojexxdyd() : esjtqupxsv.dxjokdxxww((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zynmafqrjb
    public void T(nufgyqmvbu nufgyqmvbuVar) {
        iobyxmoadg();
        this.f23995yggfygwlhe.add(nufgyqmvbuVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        iobyxmoadg();
        this.f23995yggfygwlhe.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public String set(int i13, String str) {
        iobyxmoadg();
        return ppxfxbqfkf(this.f23995yggfygwlhe.set(i13, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.esjtqupxsv.wkgbmnqykc
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public pmvmpeiblj mutableCopyWithCapacity(int i13) {
        if (i13 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i13);
        arrayList.addAll(this.f23995yggfygwlhe);
        return new pmvmpeiblj(arrayList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zynmafqrjb
    public Object getRaw(int i13) {
        return this.f23995yggfygwlhe.get(i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zynmafqrjb
    public List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f23995yggfygwlhe);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.zynmafqrjb
    public zynmafqrjb getUnmodifiableView() {
        return isModifiable() ? new uwvvkdfqfp(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public String remove(int i13) {
        iobyxmoadg();
        Object objRemove = this.f23995yggfygwlhe.remove(i13);
        ((AbstractList) this).modCount++;
        return ppxfxbqfkf(objRemove);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, com.google.crypto.tink.shaded.protobuf.esjtqupxsv.wkgbmnqykc
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f23995yggfygwlhe.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public String get(int i13) {
        Object obj = this.f23995yggfygwlhe.get(i13);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof nufgyqmvbu) {
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            String strLmojexxdyd = nufgyqmvbuVar.lmojexxdyd();
            if (nufgyqmvbuVar.kcexrzcfyt()) {
                this.f23995yggfygwlhe.set(i13, strLmojexxdyd);
            }
            return strLmojexxdyd;
        }
        byte[] bArr = (byte[]) obj;
        String strDxjokdxxww = esjtqupxsv.dxjokdxxww(bArr);
        if (esjtqupxsv.lqeggnwhkg(bArr)) {
            this.f23995yggfygwlhe.set(i13, strDxjokdxxww);
        }
        return strDxjokdxxww;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public void add(int i13, String str) {
        iobyxmoadg();
        this.f23995yggfygwlhe.add(i13, str);
        ((AbstractList) this).modCount++;
    }

    public pmvmpeiblj(int i13) {
        this(new ArrayList(i13));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.List
    public boolean addAll(int i13, Collection collection) {
        iobyxmoadg();
        if (collection instanceof zynmafqrjb) {
            collection = ((zynmafqrjb) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f23995yggfygwlhe.addAll(i13, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ppxfxbqfkf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private pmvmpeiblj(ArrayList arrayList) {
        this.f23995yggfygwlhe = arrayList;
    }
}
