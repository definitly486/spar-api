package bb;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import nb.istkbnxepw;
import nb.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
public final class jyumaefscl {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f15647eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConcurrentMap f15648iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Class f15649ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lb.iobyxmoadg f15650wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ppxfxbqfkf f15651zoijcleaow;

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final ylkuphrtab f15652eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final int f15653gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f15654iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final String f15655lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final lqeggnwhkg f15656nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final byte[] f15657ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final nb.lereixgezr f15658wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Object f15659zoijcleaow;

        ppxfxbqfkf(Object obj, Object obj2, byte[] bArr, nb.lereixgezr lereixgezrVar, ylkuphrtab ylkuphrtabVar, int i13, String str, lqeggnwhkg lqeggnwhkgVar) {
            this.f15654iobyxmoadg = obj;
            this.f15659zoijcleaow = obj2;
            this.f15657ppxfxbqfkf = Arrays.copyOf(bArr, bArr.length);
            this.f15658wkgbmnqykc = lereixgezrVar;
            this.f15652eablkybsjg = ylkuphrtabVar;
            this.f15653gxszxtbevo = i13;
            this.f15655lqeggnwhkg = str;
            this.f15656nufgyqmvbu = lqeggnwhkgVar;
        }

        public String eablkybsjg() {
            return this.f15655lqeggnwhkg;
        }

        public ylkuphrtab gxszxtbevo() {
            return this.f15652eablkybsjg;
        }

        public Object iobyxmoadg() {
            return this.f15654iobyxmoadg;
        }

        public Object lqeggnwhkg() {
            return this.f15659zoijcleaow;
        }

        public nb.lereixgezr nufgyqmvbu() {
            return this.f15658wkgbmnqykc;
        }

        public lqeggnwhkg ppxfxbqfkf() {
            return this.f15656nufgyqmvbu;
        }

        public int wkgbmnqykc() {
            return this.f15653gxszxtbevo;
        }

        public final byte[] zoijcleaow() {
            byte[] bArr = this.f15657ppxfxbqfkf;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    private static class wkgbmnqykc implements Comparable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final byte[] f15660zdlpuopuiu;

        public boolean equals(Object obj) {
            if (obj instanceof wkgbmnqykc) {
                return Arrays.equals(this.f15660zdlpuopuiu, ((wkgbmnqykc) obj).f15660zdlpuopuiu);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f15660zdlpuopuiu);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compareTo(wkgbmnqykc wkgbmnqykcVar) {
            byte[] bArr = this.f15660zdlpuopuiu;
            int length = bArr.length;
            byte[] bArr2 = wkgbmnqykcVar.f15660zdlpuopuiu;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i13 = 0;
            while (true) {
                byte[] bArr3 = this.f15660zdlpuopuiu;
                if (i13 >= bArr3.length) {
                    return 0;
                }
                byte b13 = bArr3[i13];
                byte b14 = wkgbmnqykcVar.f15660zdlpuopuiu[i13];
                if (b13 != b14) {
                    return b13 - b14;
                }
                i13++;
            }
        }

        public String toString() {
            return ob.gtknphoqwx.zoijcleaow(this.f15660zdlpuopuiu);
        }

        private wkgbmnqykc(byte[] bArr) {
            this.f15660zdlpuopuiu = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f15661iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private ppxfxbqfkf f15662ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private lb.iobyxmoadg f15663wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private ConcurrentMap f15664zoijcleaow;

        private zoijcleaow ppxfxbqfkf(Object obj, Object obj2, istkbnxepw.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) throws GeneralSecurityException {
            if (this.f15664zoijcleaow == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (ppxfxbqfkfVar.sopmlzcsov() != nb.lereixgezr.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = jyumaefscl.zoijcleaow(obj, obj2, ppxfxbqfkfVar, this.f15664zoijcleaow);
            if (z13) {
                if (this.f15662ppxfxbqfkf != null) {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                this.f15662ppxfxbqfkf = ppxfxbqfkfVarZoijcleaow;
            }
            return this;
        }

        public zoijcleaow eablkybsjg(lb.iobyxmoadg iobyxmoadgVar) {
            if (this.f15664zoijcleaow == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f15663wkgbmnqykc = iobyxmoadgVar;
            return this;
        }

        public zoijcleaow iobyxmoadg(Object obj, Object obj2, istkbnxepw.ppxfxbqfkf ppxfxbqfkfVar) {
            return ppxfxbqfkf(obj, obj2, ppxfxbqfkfVar, false);
        }

        public jyumaefscl wkgbmnqykc() {
            ConcurrentMap concurrentMap = this.f15664zoijcleaow;
            if (concurrentMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            jyumaefscl jyumaefsclVar = new jyumaefscl(concurrentMap, this.f15662ppxfxbqfkf, this.f15663wkgbmnqykc, this.f15661iobyxmoadg);
            this.f15664zoijcleaow = null;
            return jyumaefsclVar;
        }

        public zoijcleaow zoijcleaow(Object obj, Object obj2, istkbnxepw.ppxfxbqfkf ppxfxbqfkfVar) {
            return ppxfxbqfkf(obj, obj2, ppxfxbqfkfVar, true);
        }

        private zoijcleaow(Class cls) {
            this.f15664zoijcleaow = new ConcurrentHashMap();
            this.f15661iobyxmoadg = cls;
            this.f15663wkgbmnqykc = lb.iobyxmoadg.f62024zoijcleaow;
        }
    }

    public static zoijcleaow btonecajqb(Class cls) {
        return new zoijcleaow(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ppxfxbqfkf zoijcleaow(Object obj, Object obj2, istkbnxepw.ppxfxbqfkf ppxfxbqfkfVar, ConcurrentMap concurrentMap) {
        Integer numValueOf = Integer.valueOf(ppxfxbqfkfVar.ntlheqmsrt());
        if (ppxfxbqfkfVar.ulzqkzuiru() == ylkuphrtab.RAW) {
            numValueOf = null;
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf(obj, obj2, bb.wkgbmnqykc.iobyxmoadg(ppxfxbqfkfVar), ppxfxbqfkfVar.sopmlzcsov(), ppxfxbqfkfVar.ulzqkzuiru(), ppxfxbqfkfVar.ntlheqmsrt(), ppxfxbqfkfVar.mbcevpiqjq().ntlheqmsrt(), com.google.crypto.tink.internal.dxjokdxxww.iobyxmoadg().wkgbmnqykc(com.google.crypto.tink.internal.ojitshcjhn.zoijcleaow(ppxfxbqfkfVar.mbcevpiqjq().ntlheqmsrt(), ppxfxbqfkfVar.mbcevpiqjq().ulzqkzuiru(), ppxfxbqfkfVar.mbcevpiqjq().mbcevpiqjq(), ppxfxbqfkfVar.ulzqkzuiru(), numValueOf), gxszxtbevo.iobyxmoadg()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ppxfxbqfkfVar2);
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(ppxfxbqfkfVar2.zoijcleaow());
        List list = (List) concurrentMap.put(wkgbmnqykcVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(ppxfxbqfkfVar2);
            concurrentMap.put(wkgbmnqykcVar, Collections.unmodifiableList(arrayList2));
        }
        return ppxfxbqfkfVar2;
    }

    public boolean dxjokdxxww() {
        return !this.f15650wkgbmnqykc.zoijcleaow().isEmpty();
    }

    public ppxfxbqfkf eablkybsjg() {
        return this.f15651zoijcleaow;
    }

    public List gxszxtbevo(byte[] bArr) {
        List list = (List) this.f15648iobyxmoadg.get(new wkgbmnqykc(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class lqeggnwhkg() {
        return this.f15649ppxfxbqfkf;
    }

    public List nufgyqmvbu() {
        return gxszxtbevo(bb.wkgbmnqykc.f15668iobyxmoadg);
    }

    public Collection ppxfxbqfkf() {
        return this.f15648iobyxmoadg.values();
    }

    public lb.iobyxmoadg wkgbmnqykc() {
        return this.f15650wkgbmnqykc;
    }

    private jyumaefscl(ConcurrentMap concurrentMap, ppxfxbqfkf ppxfxbqfkfVar, lb.iobyxmoadg iobyxmoadgVar, Class cls) {
        this.f15648iobyxmoadg = concurrentMap;
        this.f15651zoijcleaow = ppxfxbqfkfVar;
        this.f15649ppxfxbqfkf = cls;
        this.f15650wkgbmnqykc = iobyxmoadgVar;
        this.f15647eablkybsjg = false;
    }
}
