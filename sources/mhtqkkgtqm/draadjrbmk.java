package mhtqkkgtqm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk extends ppxfxbqfkf implements grlcpdaxtj.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object[] f67212yggfygwlhe;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f67211jyumaefscl = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f67210iwizpuwonk = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final draadjrbmk f67209cqumvgiudr = new draadjrbmk(new Object[0]);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final draadjrbmk iobyxmoadg() {
            return draadjrbmk.f67209cqumvgiudr;
        }

        private iobyxmoadg() {
        }
    }

    public draadjrbmk(Object[] objArr) {
        this.f67212yggfygwlhe = objArr;
        fmlbqenlif.iobyxmoadg.iobyxmoadg(objArr.length <= 32);
    }

    private final Object[] ojitshcjhn(int i13) {
        return new Object[i13];
    }

    @Override // java.util.Collection, java.util.List, grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg add(Object obj) {
        if (size() >= 32) {
            return new gxszxtbevo(this.f67212yggfygwlhe, agtfadlqog.ppxfxbqfkf(obj), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f67212yggfygwlhe, size() + 1);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size()] = obj;
        return new draadjrbmk(objArrCopyOf);
    }

    @Override // mhtqkkgtqm.ppxfxbqfkf, java.util.Collection, java.util.List, grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg addAll(Collection collection) {
        if (size() + collection.size() > 32) {
            grlcpdaxtj.eablkybsjg.iobyxmoadg iobyxmoadgVarNufgyqmvbu = nufgyqmvbu();
            iobyxmoadgVarNufgyqmvbu.addAll(collection);
            return iobyxmoadgVarNufgyqmvbu.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f67212yggfygwlhe, size() + collection.size());
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new draadjrbmk(objArrCopyOf);
    }

    @Override // grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg e0(tg.draadjrbmk draadjrbmkVar) {
        Object[] objArrCopyOf = this.f67212yggfygwlhe;
        int size = size();
        int size2 = size();
        boolean z13 = false;
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj = this.f67212yggfygwlhe[i13];
            if (((Boolean) draadjrbmkVar.invoke(obj)).booleanValue()) {
                if (!z13) {
                    Object[] objArr = this.f67212yggfygwlhe;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
                    z13 = true;
                    size = i13;
                }
            } else if (z13) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        return size == 0 ? f67209cqumvgiudr : new draadjrbmk(hg.agtfadlqog.yggfygwlhe(objArrCopyOf, 0, size));
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public Object get(int i13) {
        fmlbqenlif.wkgbmnqykc.iobyxmoadg(i13, size());
        return this.f67212yggfygwlhe[i13];
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public int indexOf(Object obj) {
        return hg.agtfadlqog.roivzttewh(this.f67212yggfygwlhe, obj);
    }

    @Override // grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg jlmebxxoox(int i13) {
        fmlbqenlif.wkgbmnqykc.iobyxmoadg(i13, size());
        if (size() == 1) {
            return f67209cqumvgiudr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f67212yggfygwlhe, size() - 1);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        hg.agtfadlqog.agtfadlqog(this.f67212yggfygwlhe, objArrCopyOf, i13, i13 + 1, size());
        return new draadjrbmk(objArrCopyOf);
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public int lastIndexOf(Object obj) {
        return hg.agtfadlqog.ageimvtcrz(this.f67212yggfygwlhe, obj);
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public ListIterator listIterator(int i13) {
        fmlbqenlif.wkgbmnqykc.zoijcleaow(i13, size());
        return new wkgbmnqykc(this.f67212yggfygwlhe, i13, size());
    }

    @Override // grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg.iobyxmoadg nufgyqmvbu() {
        return new nufgyqmvbu(this, null, this.f67212yggfygwlhe, 0);
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public grlcpdaxtj.eablkybsjg set(int i13, Object obj) {
        fmlbqenlif.wkgbmnqykc.iobyxmoadg(i13, size());
        Object[] objArr = this.f67212yggfygwlhe;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i13] = obj;
        return new draadjrbmk(objArrCopyOf);
    }

    @Override // hg.zoijcleaow
    public int wkgbmnqykc() {
        return this.f67212yggfygwlhe.length;
    }

    @Override // java.util.List, grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg add(int i13, Object obj) {
        fmlbqenlif.wkgbmnqykc.zoijcleaow(i13, size());
        if (i13 == size()) {
            return add(obj);
        }
        if (size() < 32) {
            Object[] objArrOjitshcjhn = ojitshcjhn(size() + 1);
            hg.agtfadlqog.kcexrzcfyt(this.f67212yggfygwlhe, objArrOjitshcjhn, 0, 0, i13, 6, null);
            hg.agtfadlqog.agtfadlqog(this.f67212yggfygwlhe, objArrOjitshcjhn, i13 + 1, i13, size());
            objArrOjitshcjhn[i13] = obj;
            return new draadjrbmk(objArrOjitshcjhn);
        }
        Object[] objArr = this.f67212yggfygwlhe;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        hg.agtfadlqog.agtfadlqog(this.f67212yggfygwlhe, objArrCopyOf, i13 + 1, i13, size() - 1);
        objArrCopyOf[i13] = obj;
        return new gxszxtbevo(objArrCopyOf, agtfadlqog.ppxfxbqfkf(this.f67212yggfygwlhe[31]), size() + 1, 0);
    }
}
