package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
class oxmwwwfdhm extends kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final int[] f60149pmvmpeiblj;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f60150cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final int f60151esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f60152iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc f60153jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f60154lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f60155yggfygwlhe;

    private static class ppxfxbqfkf implements Iterator {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private wflxmlrfwp f60156yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Stack f60157zdlpuopuiu;

        private wflxmlrfwp iobyxmoadg(kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar) {
            while (wkgbmnqykcVar instanceof oxmwwwfdhm) {
                oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) wkgbmnqykcVar;
                this.f60157zdlpuopuiu.push(oxmwwwfdhmVar);
                wkgbmnqykcVar = oxmwwwfdhmVar.f60153jyumaefscl;
            }
            return (wflxmlrfwp) wkgbmnqykcVar;
        }

        private wflxmlrfwp zoijcleaow() {
            while (!this.f60157zdlpuopuiu.isEmpty()) {
                wflxmlrfwp wflxmlrfwpVarIobyxmoadg = iobyxmoadg(((oxmwwwfdhm) this.f60157zdlpuopuiu.pop()).f60152iwizpuwonk);
                if (!wflxmlrfwpVarIobyxmoadg.isEmpty()) {
                    return wflxmlrfwpVarIobyxmoadg;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60156yggfygwlhe != null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public wflxmlrfwp next() {
            wflxmlrfwp wflxmlrfwpVar = this.f60156yggfygwlhe;
            if (wflxmlrfwpVar == null) {
                throw new NoSuchElementException();
            }
            this.f60156yggfygwlhe = zoijcleaow();
            return wflxmlrfwpVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private ppxfxbqfkf(kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar) {
            this.f60157zdlpuopuiu = new Stack();
            this.f60156yggfygwlhe = iobyxmoadg(wkgbmnqykcVar);
        }
    }

    private class wkgbmnqykc implements kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f60159jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.iobyxmoadg f60160yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ppxfxbqfkf f60161zdlpuopuiu;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60159jyumaefscl > 0;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.iobyxmoadg
        public byte nextByte() {
            if (!this.f60160yggfygwlhe.hasNext()) {
                this.f60160yggfygwlhe = this.f60161zdlpuopuiu.next().iterator();
            }
            this.f60159jyumaefscl--;
            return this.f60160yggfygwlhe.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private wkgbmnqykc() {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(oxmwwwfdhm.this);
            this.f60161zdlpuopuiu = ppxfxbqfkfVar;
            this.f60160yggfygwlhe = ppxfxbqfkfVar.next().iterator();
            this.f60159jyumaefscl = oxmwwwfdhm.this.size();
        }
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Stack f60162iobyxmoadg;

        private zoijcleaow() {
            this.f60162iobyxmoadg = new Stack();
        }

        private void eablkybsjg(kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar) {
            int iWkgbmnqykc = wkgbmnqykc(wkgbmnqykcVar.size());
            int i13 = oxmwwwfdhm.f60149pmvmpeiblj[iWkgbmnqykc + 1];
            if (this.f60162iobyxmoadg.isEmpty() || ((kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc) this.f60162iobyxmoadg.peek()).size() >= i13) {
                this.f60162iobyxmoadg.push(wkgbmnqykcVar);
                return;
            }
            int i14 = oxmwwwfdhm.f60149pmvmpeiblj[iWkgbmnqykc];
            kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc oxmwwwfdhmVar = (kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc) this.f60162iobyxmoadg.pop();
            while (true) {
                if (this.f60162iobyxmoadg.isEmpty() || ((kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc) this.f60162iobyxmoadg.peek()).size() >= i14) {
                    break;
                } else {
                    oxmwwwfdhmVar = new oxmwwwfdhm((kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc) this.f60162iobyxmoadg.pop(), oxmwwwfdhmVar);
                }
            }
            oxmwwwfdhm oxmwwwfdhmVar2 = new oxmwwwfdhm(oxmwwwfdhmVar, wkgbmnqykcVar);
            while (!this.f60162iobyxmoadg.isEmpty()) {
                if (((kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc) this.f60162iobyxmoadg.peek()).size() >= oxmwwwfdhm.f60149pmvmpeiblj[wkgbmnqykc(oxmwwwfdhmVar2.size()) + 1]) {
                    break;
                } else {
                    oxmwwwfdhmVar2 = new oxmwwwfdhm((kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc) this.f60162iobyxmoadg.pop(), oxmwwwfdhmVar2);
                }
            }
            this.f60162iobyxmoadg.push(oxmwwwfdhmVar2);
        }

        private void ppxfxbqfkf(kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar) {
            if (wkgbmnqykcVar.draadjrbmk()) {
                eablkybsjg(wkgbmnqykcVar);
                return;
            }
            if (wkgbmnqykcVar instanceof oxmwwwfdhm) {
                oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) wkgbmnqykcVar;
                ppxfxbqfkf(oxmwwwfdhmVar.f60153jyumaefscl);
                ppxfxbqfkf(oxmwwwfdhmVar.f60152iwizpuwonk);
            } else {
                String strValueOf = String.valueOf(wkgbmnqykcVar.getClass());
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 49);
                sb3.append("Has a new type of ByteString been created? Found ");
                sb3.append(strValueOf);
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        private int wkgbmnqykc(int i13) {
            int iBinarySearch = Arrays.binarySearch(oxmwwwfdhm.f60149pmvmpeiblj, i13);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc zoijcleaow(kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar, kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar2) {
            ppxfxbqfkf(wkgbmnqykcVar);
            ppxfxbqfkf(wkgbmnqykcVar2);
            kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc oxmwwwfdhmVar = (kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc) this.f60162iobyxmoadg.pop();
            while (!this.f60162iobyxmoadg.isEmpty()) {
                oxmwwwfdhmVar = new oxmwwwfdhm((kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc) this.f60162iobyxmoadg.pop(), oxmwwwfdhmVar);
            }
            return oxmwwwfdhmVar;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i13 = 1;
        int i14 = 1;
        while (i13 > 0) {
            arrayList.add(Integer.valueOf(i13));
            int i15 = i14 + i13;
            i14 = i13;
            i13 = i15;
        }
        arrayList.add(Integer.MAX_VALUE);
        f60149pmvmpeiblj = new int[arrayList.size()];
        int i16 = 0;
        while (true) {
            int[] iArr = f60149pmvmpeiblj;
            if (i16 >= iArr.length) {
                return;
            }
            iArr[i16] = ((Integer) arrayList.get(i16)).intValue();
            i16++;
        }
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc lereixgezr(kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar, kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar2) {
        oxmwwwfdhm oxmwwwfdhmVar = wkgbmnqykcVar instanceof oxmwwwfdhm ? (oxmwwwfdhm) wkgbmnqykcVar : null;
        if (wkgbmnqykcVar2.size() == 0) {
            return wkgbmnqykcVar;
        }
        if (wkgbmnqykcVar.size() != 0) {
            int size = wkgbmnqykcVar.size() + wkgbmnqykcVar2.size();
            if (size < 128) {
                return pmvmpeiblj(wkgbmnqykcVar, wkgbmnqykcVar2);
            }
            if (oxmwwwfdhmVar != null && oxmwwwfdhmVar.f60152iwizpuwonk.size() + wkgbmnqykcVar2.size() < 128) {
                wkgbmnqykcVar2 = new oxmwwwfdhm(oxmwwwfdhmVar.f60153jyumaefscl, pmvmpeiblj(oxmwwwfdhmVar.f60152iwizpuwonk, wkgbmnqykcVar2));
            } else {
                if (oxmwwwfdhmVar == null || oxmwwwfdhmVar.f60153jyumaefscl.gtknphoqwx() <= oxmwwwfdhmVar.f60152iwizpuwonk.gtknphoqwx() || oxmwwwfdhmVar.gtknphoqwx() <= wkgbmnqykcVar2.gtknphoqwx()) {
                    return size >= f60149pmvmpeiblj[Math.max(wkgbmnqykcVar.gtknphoqwx(), wkgbmnqykcVar2.gtknphoqwx()) + 1] ? new oxmwwwfdhm(wkgbmnqykcVar, wkgbmnqykcVar2) : new zoijcleaow().zoijcleaow(wkgbmnqykcVar, wkgbmnqykcVar2);
                }
                wkgbmnqykcVar2 = new oxmwwwfdhm(oxmwwwfdhmVar.f60153jyumaefscl, new oxmwwwfdhm(oxmwwwfdhmVar.f60152iwizpuwonk, wkgbmnqykcVar2));
            }
        }
        return wkgbmnqykcVar2;
    }

    private static wflxmlrfwp pmvmpeiblj(kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar, kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar2) {
        int size = wkgbmnqykcVar.size();
        int size2 = wkgbmnqykcVar2.size();
        byte[] bArr = new byte[size + size2];
        wkgbmnqykcVar.dxjokdxxww(bArr, 0, 0, size);
        wkgbmnqykcVar2.dxjokdxxww(bArr, 0, size, size2);
        return new wflxmlrfwp(bArr);
    }

    private boolean zynmafqrjb(kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar) {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this);
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) ppxfxbqfkfVar.next();
        ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf(wkgbmnqykcVar);
        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) ppxfxbqfkfVar2.next();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int size = wflxmlrfwpVar.size() - i13;
            int size2 = wflxmlrfwpVar2.size() - i14;
            int iMin = Math.min(size, size2);
            if (!(i13 == 0 ? wflxmlrfwpVar.iwizpuwonk(wflxmlrfwpVar2, i14, iMin) : wflxmlrfwpVar2.iwizpuwonk(wflxmlrfwpVar, i13, iMin))) {
                return false;
            }
            i15 += iMin;
            int i16 = this.f60155yggfygwlhe;
            if (i15 >= i16) {
                if (i15 == i16) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                wflxmlrfwpVar = (wflxmlrfwp) ppxfxbqfkfVar.next();
                i13 = 0;
            } else {
                i13 += iMin;
            }
            if (iMin == size2) {
                wflxmlrfwpVar2 = (wflxmlrfwp) ppxfxbqfkfVar2.next();
                i14 = 0;
            } else {
                i14 += iMin;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected void btonecajqb(byte[] bArr, int i13, int i14, int i15) {
        int i16 = i13 + i15;
        int i17 = this.f60150cqumvgiudr;
        if (i16 <= i17) {
            this.f60153jyumaefscl.btonecajqb(bArr, i13, i14, i15);
        } else {
            if (i13 >= i17) {
                this.f60152iwizpuwonk.btonecajqb(bArr, i13 - i17, i14, i15);
                return;
            }
            int i18 = i17 - i13;
            this.f60153jyumaefscl.btonecajqb(bArr, i13, i14, i18);
            this.f60152iwizpuwonk.btonecajqb(bArr, 0, i14 + i18, i15 - i18);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected boolean draadjrbmk() {
        return this.f60155yggfygwlhe >= f60149pmvmpeiblj[this.f60151esjtqupxsv];
    }

    public boolean equals(Object obj) {
        int iVdvldrhtss;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar = (kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc) obj;
        if (this.f60155yggfygwlhe != wkgbmnqykcVar.size()) {
            return false;
        }
        if (this.f60155yggfygwlhe == 0) {
            return true;
        }
        if (this.f60154lereixgezr == 0 || (iVdvldrhtss = wkgbmnqykcVar.vdvldrhtss()) == 0 || this.f60154lereixgezr == iVdvldrhtss) {
            return zynmafqrjb(wkgbmnqykcVar);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected int gtknphoqwx() {
        return this.f60151esjtqupxsv;
    }

    public int hashCode() {
        int iOjitshcjhn = this.f60154lereixgezr;
        if (iOjitshcjhn == 0) {
            int i13 = this.f60155yggfygwlhe;
            iOjitshcjhn = ojitshcjhn(i13, 0, i13);
            if (iOjitshcjhn == 0) {
                iOjitshcjhn = 1;
            }
            this.f60154lereixgezr = iOjitshcjhn;
        }
        return iOjitshcjhn;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: istkbnxepw, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.iobyxmoadg iterator() {
        return new wkgbmnqykc();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    void jyumaefscl(OutputStream outputStream, int i13, int i14) {
        int i15 = i13 + i14;
        int i16 = this.f60150cqumvgiudr;
        if (i15 <= i16) {
            this.f60153jyumaefscl.jyumaefscl(outputStream, i13, i14);
        } else {
            if (i13 >= i16) {
                this.f60152iwizpuwonk.jyumaefscl(outputStream, i13 - i16, i14);
                return;
            }
            int i17 = i16 - i13;
            this.f60153jyumaefscl.jyumaefscl(outputStream, i13, i17);
            this.f60152iwizpuwonk.jyumaefscl(outputStream, 0, i14 - i17);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    public String kcexrzcfyt(String str) {
        return new String(oxmwwwfdhm(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected int ojitshcjhn(int i13, int i14, int i15) {
        int i16 = i14 + i15;
        int i17 = this.f60150cqumvgiudr;
        if (i16 <= i17) {
            return this.f60153jyumaefscl.ojitshcjhn(i13, i14, i15);
        }
        if (i14 >= i17) {
            return this.f60152iwizpuwonk.ojitshcjhn(i13, i14 - i17, i15);
        }
        int i18 = i17 - i14;
        return this.f60152iwizpuwonk.ojitshcjhn(this.f60153jyumaefscl.ojitshcjhn(i13, i14, i18), 0, i15 - i18);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected int rgvfuqvkyq(int i13, int i14, int i15) {
        int i16 = i14 + i15;
        int i17 = this.f60150cqumvgiudr;
        if (i16 <= i17) {
            return this.f60153jyumaefscl.rgvfuqvkyq(i13, i14, i15);
        }
        if (i14 >= i17) {
            return this.f60152iwizpuwonk.rgvfuqvkyq(i13, i14 - i17, i15);
        }
        int i18 = i17 - i14;
        return this.f60152iwizpuwonk.rgvfuqvkyq(this.f60153jyumaefscl.rgvfuqvkyq(i13, i14, i18), 0, i15 - i18);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    public int size() {
        return this.f60155yggfygwlhe;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected int vdvldrhtss() {
        return this.f60154lereixgezr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    public boolean wflxmlrfwp() {
        int iRgvfuqvkyq = this.f60153jyumaefscl.rgvfuqvkyq(0, 0, this.f60150cqumvgiudr);
        kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar = this.f60152iwizpuwonk;
        return wkgbmnqykcVar.rgvfuqvkyq(iRgvfuqvkyq, 0, wkgbmnqykcVar.size()) == 0;
    }

    private oxmwwwfdhm(kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar, kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc wkgbmnqykcVar2) {
        this.f60154lereixgezr = 0;
        this.f60153jyumaefscl = wkgbmnqykcVar;
        this.f60152iwizpuwonk = wkgbmnqykcVar2;
        int size = wkgbmnqykcVar.size();
        this.f60150cqumvgiudr = size;
        this.f60155yggfygwlhe = size + wkgbmnqykcVar2.size();
        this.f60151esjtqupxsv = Math.max(wkgbmnqykcVar.gtknphoqwx(), wkgbmnqykcVar2.gtknphoqwx()) + 1;
    }
}
