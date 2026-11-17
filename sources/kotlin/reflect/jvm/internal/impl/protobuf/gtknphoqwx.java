package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class gtknphoqwx extends AbstractList implements RandomAccess, draadjrbmk {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final draadjrbmk f60064yggfygwlhe = new gtknphoqwx().getUnmodifiableView();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f60065zdlpuopuiu;

    public gtknphoqwx() {
        this.f60065zdlpuopuiu = new ArrayList();
    }

    private static String ppxfxbqfkf(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof wkgbmnqykc ? ((wkgbmnqykc) obj).zdlpuopuiu() : dxjokdxxww.zoijcleaow((byte[]) obj);
    }

    private static wkgbmnqykc zoijcleaow(Object obj) {
        if (obj instanceof wkgbmnqykc) {
            return (wkgbmnqykc) obj;
        }
        return obj instanceof String ? wkgbmnqykc.gxszxtbevo((String) obj) : wkgbmnqykc.wkgbmnqykc((byte[]) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f60065zdlpuopuiu.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public String remove(int i13) {
        Object objRemove = this.f60065zdlpuopuiu.remove(i13);
        ((AbstractList) this).modCount++;
        return ppxfxbqfkf(objRemove);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.draadjrbmk
    public wkgbmnqykc getByteString(int i13) {
        Object obj = this.f60065zdlpuopuiu.get(i13);
        wkgbmnqykc wkgbmnqykcVarZoijcleaow = zoijcleaow(obj);
        if (wkgbmnqykcVarZoijcleaow != obj) {
            this.f60065zdlpuopuiu.set(i13, wkgbmnqykcVarZoijcleaow);
        }
        return wkgbmnqykcVarZoijcleaow;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.draadjrbmk
    public List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f60065zdlpuopuiu);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.draadjrbmk
    public draadjrbmk getUnmodifiableView() {
        return new zdlpuopuiu(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public String set(int i13, String str) {
        return ppxfxbqfkf(this.f60065zdlpuopuiu.set(i13, str));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public void add(int i13, String str) {
        this.f60065zdlpuopuiu.add(i13, str);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.draadjrbmk
    public void mhtqkkgtqm(wkgbmnqykc wkgbmnqykcVar) {
        this.f60065zdlpuopuiu.add(wkgbmnqykcVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f60065zdlpuopuiu.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public String get(int i13) {
        Object obj = this.f60065zdlpuopuiu.get(i13);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof wkgbmnqykc) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            String strZdlpuopuiu = wkgbmnqykcVar.zdlpuopuiu();
            if (wkgbmnqykcVar.wflxmlrfwp()) {
                this.f60065zdlpuopuiu.set(i13, strZdlpuopuiu);
            }
            return strZdlpuopuiu;
        }
        byte[] bArr = (byte[]) obj;
        String strZoijcleaow = dxjokdxxww.zoijcleaow(bArr);
        if (dxjokdxxww.iobyxmoadg(bArr)) {
            this.f60065zdlpuopuiu.set(i13, strZoijcleaow);
        }
        return strZoijcleaow;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i13, Collection collection) {
        if (collection instanceof draadjrbmk) {
            collection = ((draadjrbmk) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f60065zdlpuopuiu.addAll(i13, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public gtknphoqwx(draadjrbmk draadjrbmkVar) {
        this.f60065zdlpuopuiu = new ArrayList(draadjrbmkVar.size());
        addAll(draadjrbmkVar);
    }
}
