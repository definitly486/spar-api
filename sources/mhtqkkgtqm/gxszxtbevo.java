package mhtqkkgtqm;

import androidx.compose.runtime.fmlbqenlif;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo extends ppxfxbqfkf implements grlcpdaxtj.eablkybsjg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f67217cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f67218iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object[] f67219jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object[] f67220yggfygwlhe;

    public gxszxtbevo(Object[] objArr, Object[] objArr2, int i13, int i14) {
        this.f67220yggfygwlhe = objArr;
        this.f67219jyumaefscl = objArr2;
        this.f67218iwizpuwonk = i13;
        this.f67217cqumvgiudr = i14;
        if (!(size() > 32)) {
            fmlbqenlif.iobyxmoadg("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        fmlbqenlif.iobyxmoadg.iobyxmoadg(size() - agtfadlqog.wkgbmnqykc(size()) <= zg.gtknphoqwx.btonecajqb(objArr2.length, 32));
    }

    private final Object[] agtfadlqog(int i13) {
        if (zynmafqrjb() <= i13) {
            return this.f67219jyumaefscl;
        }
        Object[] objArr = this.f67220yggfygwlhe;
        for (int i14 = this.f67217cqumvgiudr; i14 > 0; i14 -= 5) {
            Object[] objArr2 = objArr[agtfadlqog.iobyxmoadg(i13, i14)];
            zdlpuopuiu.nufgyqmvbu(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    private final Object[] cqumvgiudr(Object[] objArr, int i13, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iIobyxmoadg = agtfadlqog.iobyxmoadg(size() - 1, i13);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i13 == 5) {
            objArrCopyOf[iIobyxmoadg] = objArr2;
        } else {
            objArrCopyOf[iIobyxmoadg] = cqumvgiudr((Object[]) objArrCopyOf[iIobyxmoadg], i13 - 5, objArr2);
        }
        return objArrCopyOf;
    }

    private final Object[] istkbnxepw(Object[] objArr, int i13, int i14, Object obj) {
        int iIobyxmoadg = agtfadlqog.iobyxmoadg(i14, i13);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        if (i13 == 0) {
            objArrCopyOf[iIobyxmoadg] = obj;
        } else {
            Object obj2 = objArrCopyOf[iIobyxmoadg];
            zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[iIobyxmoadg] = istkbnxepw((Object[]) obj2, i13 - 5, i14, obj);
        }
        return objArrCopyOf;
    }

    private final gxszxtbevo jyumaefscl(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i13 = this.f67217cqumvgiudr;
        if (size <= (1 << i13)) {
            return new gxszxtbevo(cqumvgiudr(objArr, i13, objArr2), objArr3, size() + 1, this.f67217cqumvgiudr);
        }
        Object[] objArrPpxfxbqfkf = agtfadlqog.ppxfxbqfkf(objArr);
        int i14 = this.f67217cqumvgiudr + 5;
        return new gxszxtbevo(cqumvgiudr(objArrPpxfxbqfkf, i14, objArr2), objArr3, size() + 1, i14);
    }

    private final Object[] kcexrzcfyt(Object[] objArr, int i13, int i14, eablkybsjg eablkybsjgVar) {
        Object[] objArrKcexrzcfyt;
        int iIobyxmoadg = agtfadlqog.iobyxmoadg(i14, i13);
        if (i13 == 5) {
            eablkybsjgVar.zoijcleaow(objArr[iIobyxmoadg]);
            objArrKcexrzcfyt = null;
        } else {
            Object obj = objArr[iIobyxmoadg];
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrKcexrzcfyt = kcexrzcfyt((Object[]) obj, i13 - 5, i14, eablkybsjgVar);
        }
        if (objArrKcexrzcfyt == null && iIobyxmoadg == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iIobyxmoadg] = objArrKcexrzcfyt;
        return objArrCopyOf;
    }

    private final Object[] lereixgezr(Object[] objArr, int i13, int i14, eablkybsjg eablkybsjgVar) {
        Object[] objArrCopyOf;
        int iIobyxmoadg = agtfadlqog.iobyxmoadg(i14, i13);
        if (i13 == 0) {
            if (iIobyxmoadg == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
            }
            hg.agtfadlqog.agtfadlqog(objArr, objArrCopyOf, iIobyxmoadg, iIobyxmoadg + 1, 32);
            objArrCopyOf[31] = eablkybsjgVar.iobyxmoadg();
            eablkybsjgVar.zoijcleaow(objArr[iIobyxmoadg]);
            return objArrCopyOf;
        }
        int iIobyxmoadg2 = objArr[31] == null ? agtfadlqog.iobyxmoadg(zynmafqrjb() - 1, i13) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf2, "copyOf(...)");
        int i15 = i13 - 5;
        int i16 = iIobyxmoadg + 1;
        if (i16 <= iIobyxmoadg2) {
            while (true) {
                Object obj = objArrCopyOf2[iIobyxmoadg2];
                zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iIobyxmoadg2] = lereixgezr((Object[]) obj, i15, 0, eablkybsjgVar);
                if (iIobyxmoadg2 == i16) {
                    break;
                }
                iIobyxmoadg2--;
            }
        }
        Object obj2 = objArrCopyOf2[iIobyxmoadg];
        zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iIobyxmoadg] = lereixgezr((Object[]) obj2, i15, i14, eablkybsjgVar);
        return objArrCopyOf2;
    }

    private final grlcpdaxtj.eablkybsjg pmvmpeiblj(Object[] objArr, int i13, int i14, int i15) {
        int size = size() - i13;
        fmlbqenlif.iobyxmoadg.iobyxmoadg(i15 < size);
        if (size == 1) {
            return zdlpuopuiu(objArr, i13, i14);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f67219jyumaefscl, 32);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        int i16 = size - 1;
        if (i15 < i16) {
            hg.agtfadlqog.agtfadlqog(this.f67219jyumaefscl, objArrCopyOf, i15, i15 + 1, size);
        }
        objArrCopyOf[i16] = null;
        return new gxszxtbevo(objArr, objArrCopyOf, (i13 + size) - 1, i14);
    }

    private final Object[] rgvfuqvkyq(Object[] objArr, int i13, int i14, Object obj, eablkybsjg eablkybsjgVar) {
        Object[] objArrCopyOf;
        int iIobyxmoadg = agtfadlqog.iobyxmoadg(i14, i13);
        if (i13 == 0) {
            if (iIobyxmoadg == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
            }
            hg.agtfadlqog.agtfadlqog(objArr, objArrCopyOf, iIobyxmoadg + 1, iIobyxmoadg, 31);
            eablkybsjgVar.zoijcleaow(objArr[31]);
            objArrCopyOf[iIobyxmoadg] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf2, "copyOf(...)");
        int i15 = i13 - 5;
        Object obj2 = objArr[iIobyxmoadg];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iIobyxmoadg] = rgvfuqvkyq((Object[]) obj2, i15, i14, obj, eablkybsjgVar);
        int i16 = iIobyxmoadg + 1;
        while (i16 < 32 && objArrCopyOf2[i16] != null) {
            Object obj3 = objArr[i16];
            zdlpuopuiu.nufgyqmvbu(obj3, str);
            Object[] objArr2 = objArrCopyOf2;
            objArr2[i16] = rgvfuqvkyq((Object[]) obj3, i15, 0, eablkybsjgVar.iobyxmoadg(), eablkybsjgVar);
            i16++;
            objArrCopyOf2 = objArr2;
            str = str;
        }
        return objArrCopyOf2;
    }

    private final gxszxtbevo vdvldrhtss(Object[] objArr, int i13, Object obj) {
        int size = size() - zynmafqrjb();
        Object[] objArrCopyOf = Arrays.copyOf(this.f67219jyumaefscl, 32);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        if (size < 32) {
            hg.agtfadlqog.agtfadlqog(this.f67219jyumaefscl, objArrCopyOf, i13 + 1, i13, size);
            objArrCopyOf[i13] = obj;
            return new gxszxtbevo(objArr, objArrCopyOf, size() + 1, this.f67217cqumvgiudr);
        }
        Object[] objArr2 = this.f67219jyumaefscl;
        Object obj2 = objArr2[31];
        hg.agtfadlqog.agtfadlqog(objArr2, objArrCopyOf, i13 + 1, i13, size - 1);
        objArrCopyOf[i13] = obj;
        return jyumaefscl(objArr, objArrCopyOf, agtfadlqog.ppxfxbqfkf(obj2));
    }

    private final grlcpdaxtj.eablkybsjg zdlpuopuiu(Object[] objArr, int i13, int i14) {
        if (i14 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                zdlpuopuiu.dxjokdxxww(objArr, "copyOf(...)");
            }
            return new draadjrbmk(objArr);
        }
        eablkybsjg eablkybsjgVar = new eablkybsjg(null);
        Object[] objArrKcexrzcfyt = kcexrzcfyt(objArr, i14, i13 - 1, eablkybsjgVar);
        zdlpuopuiu.lqeggnwhkg(objArrKcexrzcfyt);
        Object objIobyxmoadg = eablkybsjgVar.iobyxmoadg();
        zdlpuopuiu.nufgyqmvbu(objIobyxmoadg, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objIobyxmoadg;
        if (objArrKcexrzcfyt[1] != null) {
            return new gxszxtbevo(objArrKcexrzcfyt, objArr2, i13, i14);
        }
        Object obj = objArrKcexrzcfyt[0];
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new gxszxtbevo((Object[]) obj, objArr2, i13, i14 - 5);
    }

    private final int zynmafqrjb() {
        return agtfadlqog.wkgbmnqykc(size());
    }

    @Override // java.util.Collection, java.util.List, grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg add(Object obj) {
        int size = size() - zynmafqrjb();
        if (size >= 32) {
            return jyumaefscl(this.f67220yggfygwlhe, this.f67219jyumaefscl, agtfadlqog.ppxfxbqfkf(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f67219jyumaefscl, 32);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size] = obj;
        return new gxszxtbevo(this.f67220yggfygwlhe, objArrCopyOf, size() + 1, this.f67217cqumvgiudr);
    }

    @Override // grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg e0(tg.draadjrbmk draadjrbmkVar) {
        nufgyqmvbu nufgyqmvbuVarNufgyqmvbu = nufgyqmvbu();
        nufgyqmvbuVarNufgyqmvbu.mbcevpiqjq(draadjrbmkVar);
        return nufgyqmvbuVarNufgyqmvbu.build();
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public Object get(int i13) {
        fmlbqenlif.wkgbmnqykc.iobyxmoadg(i13, size());
        return agtfadlqog(i13)[i13 & 31];
    }

    @Override // grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg jlmebxxoox(int i13) {
        fmlbqenlif.wkgbmnqykc.iobyxmoadg(i13, size());
        int iZynmafqrjb = zynmafqrjb();
        return i13 >= iZynmafqrjb ? pmvmpeiblj(this.f67220yggfygwlhe, iZynmafqrjb, this.f67217cqumvgiudr, i13 - iZynmafqrjb) : pmvmpeiblj(lereixgezr(this.f67220yggfygwlhe, this.f67217cqumvgiudr, i13, new eablkybsjg(this.f67219jyumaefscl[0])), iZynmafqrjb, this.f67217cqumvgiudr, 0);
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public ListIterator listIterator(int i13) {
        fmlbqenlif.wkgbmnqykc.zoijcleaow(i13, size());
        return new dxjokdxxww(this.f67220yggfygwlhe, this.f67219jyumaefscl, i13, size(), (this.f67217cqumvgiudr / 5) + 1);
    }

    @Override // grlcpdaxtj.eablkybsjg
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public nufgyqmvbu nufgyqmvbu() {
        return new nufgyqmvbu(this, this.f67220yggfygwlhe, this.f67219jyumaefscl, this.f67217cqumvgiudr);
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public grlcpdaxtj.eablkybsjg set(int i13, Object obj) {
        fmlbqenlif.wkgbmnqykc.iobyxmoadg(i13, size());
        if (zynmafqrjb() > i13) {
            return new gxszxtbevo(istkbnxepw(this.f67220yggfygwlhe, this.f67217cqumvgiudr, i13, obj), this.f67219jyumaefscl, size(), this.f67217cqumvgiudr);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f67219jyumaefscl, 32);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i13 & 31] = obj;
        return new gxszxtbevo(this.f67220yggfygwlhe, objArrCopyOf, size(), this.f67217cqumvgiudr);
    }

    @Override // hg.zoijcleaow
    public int wkgbmnqykc() {
        return this.f67218iwizpuwonk;
    }

    @Override // java.util.List, grlcpdaxtj.eablkybsjg
    public grlcpdaxtj.eablkybsjg add(int i13, Object obj) {
        fmlbqenlif.wkgbmnqykc.zoijcleaow(i13, size());
        if (i13 == size()) {
            return add(obj);
        }
        int iZynmafqrjb = zynmafqrjb();
        if (i13 >= iZynmafqrjb) {
            return vdvldrhtss(this.f67220yggfygwlhe, i13 - iZynmafqrjb, obj);
        }
        eablkybsjg eablkybsjgVar = new eablkybsjg(null);
        return vdvldrhtss(rgvfuqvkyq(this.f67220yggfygwlhe, this.f67217cqumvgiudr, i13, obj, eablkybsjgVar), 0, eablkybsjgVar.iobyxmoadg());
    }
}
