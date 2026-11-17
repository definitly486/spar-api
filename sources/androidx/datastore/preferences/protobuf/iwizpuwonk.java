package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class iwizpuwonk extends ppxfxbqfkf implements cqumvgiudr, RandomAccess {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final cqumvgiudr f8669iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final iwizpuwonk f8670jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f8671yggfygwlhe;

    static {
        iwizpuwonk iwizpuwonkVar = new iwizpuwonk();
        f8670jyumaefscl = iwizpuwonkVar;
        iwizpuwonkVar.makeImmutable();
        f8669iwizpuwonk = iwizpuwonkVar;
    }

    public iwizpuwonk() {
        this(10);
    }

    private static String ppxfxbqfkf(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof gxszxtbevo ? ((gxszxtbevo) obj).cdpycssgdh() : zdlpuopuiu.btonecajqb((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.ppxfxbqfkf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        iobyxmoadg();
        this.f8671yggfygwlhe.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public String set(int i13, String str) {
        iobyxmoadg();
        return ppxfxbqfkf(this.f8671yggfygwlhe.set(i13, str));
    }

    @Override // androidx.datastore.preferences.protobuf.zdlpuopuiu.zoijcleaow
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public iwizpuwonk mutableCopyWithCapacity(int i13) {
        if (i13 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i13);
        arrayList.addAll(this.f8671yggfygwlhe);
        return new iwizpuwonk(arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.cqumvgiudr
    public Object getRaw(int i13) {
        return this.f8671yggfygwlhe.get(i13);
    }

    @Override // androidx.datastore.preferences.protobuf.cqumvgiudr
    public List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f8671yggfygwlhe);
    }

    @Override // androidx.datastore.preferences.protobuf.cqumvgiudr
    public cqumvgiudr getUnmodifiableView() {
        return isModifiable() ? new xrmfcynszj(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public String remove(int i13) {
        iobyxmoadg();
        Object objRemove = this.f8671yggfygwlhe.remove(i13);
        ((AbstractList) this).modCount++;
        return ppxfxbqfkf(objRemove);
    }

    @Override // androidx.datastore.preferences.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.ppxfxbqfkf, androidx.datastore.preferences.protobuf.zdlpuopuiu.zoijcleaow
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // androidx.datastore.preferences.protobuf.cqumvgiudr
    public void r(gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg();
        this.f8671yggfygwlhe.add(gxszxtbevoVar);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.ppxfxbqfkf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.ppxfxbqfkf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8671yggfygwlhe.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public String get(int i13) {
        Object obj = this.f8671yggfygwlhe.get(i13);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof gxszxtbevo) {
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            String strCdpycssgdh = gxszxtbevoVar.cdpycssgdh();
            if (gxszxtbevoVar.kcexrzcfyt()) {
                this.f8671yggfygwlhe.set(i13, strCdpycssgdh);
            }
            return strCdpycssgdh;
        }
        byte[] bArr = (byte[]) obj;
        String strBtonecajqb = zdlpuopuiu.btonecajqb(bArr);
        if (zdlpuopuiu.lqeggnwhkg(bArr)) {
            this.f8671yggfygwlhe.set(i13, strBtonecajqb);
        }
        return strBtonecajqb;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public void add(int i13, String str) {
        iobyxmoadg();
        this.f8671yggfygwlhe.add(i13, str);
        ((AbstractList) this).modCount++;
    }

    public iwizpuwonk(int i13) {
        this(new ArrayList(i13));
    }

    @Override // androidx.datastore.preferences.protobuf.ppxfxbqfkf, java.util.AbstractList, java.util.List
    public boolean addAll(int i13, Collection collection) {
        iobyxmoadg();
        if (collection instanceof cqumvgiudr) {
            collection = ((cqumvgiudr) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f8671yggfygwlhe.addAll(i13, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.ppxfxbqfkf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private iwizpuwonk(ArrayList arrayList) {
        this.f8671yggfygwlhe = arrayList;
    }
}
