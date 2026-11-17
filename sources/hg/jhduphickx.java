package hg;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class jhduphickx extends wkgbmnqykc implements RandomAccess {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f40234cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f40235iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f40236jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object[] f40237yggfygwlhe;

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f40239iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f40240jyumaefscl;

        iobyxmoadg() {
            this.f40240jyumaefscl = jhduphickx.this.size();
            this.f40239iwizpuwonk = jhduphickx.this.f40235iwizpuwonk;
        }

        @Override // hg.ppxfxbqfkf
        protected void iobyxmoadg() {
            if (this.f40240jyumaefscl == 0) {
                zoijcleaow();
                return;
            }
            ppxfxbqfkf(jhduphickx.this.f40237yggfygwlhe[this.f40239iwizpuwonk]);
            this.f40239iwizpuwonk = (this.f40239iwizpuwonk + 1) % jhduphickx.this.f40236jyumaefscl;
            this.f40240jyumaefscl--;
        }
    }

    public jhduphickx(Object[] buffer, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(buffer, "buffer");
        this.f40237yggfygwlhe = buffer;
        if (i13 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i13).toString());
        }
        if (i13 <= buffer.length) {
            this.f40236jyumaefscl = buffer.length;
            this.f40234cqumvgiudr = i13;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i13 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public Object get(int i13) {
        wkgbmnqykc.f40274zdlpuopuiu.zoijcleaow(i13, size());
        return this.f40237yggfygwlhe[(this.f40235iwizpuwonk + i13) % this.f40236jyumaefscl];
    }

    @Override // hg.wkgbmnqykc, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new iobyxmoadg();
    }

    public final void kcexrzcfyt(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i13).toString());
        }
        if (i13 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i13 + ", size = " + size()).toString());
        }
        if (i13 > 0) {
            int i14 = this.f40235iwizpuwonk;
            int i15 = (i14 + i13) % this.f40236jyumaefscl;
            if (i14 > i15) {
                agtfadlqog.lereixgezr(this.f40237yggfygwlhe, null, i14, this.f40236jyumaefscl);
                agtfadlqog.lereixgezr(this.f40237yggfygwlhe, null, 0, i15);
            } else {
                agtfadlqog.lereixgezr(this.f40237yggfygwlhe, null, i14, i15);
            }
            this.f40235iwizpuwonk = i15;
            this.f40234cqumvgiudr = size() - i13;
        }
    }

    public final void ojitshcjhn(Object obj) {
        if (vdvldrhtss()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f40237yggfygwlhe[(this.f40235iwizpuwonk + size()) % this.f40236jyumaefscl] = obj;
        this.f40234cqumvgiudr = size() + 1;
    }

    public final jhduphickx rgvfuqvkyq(int i13) {
        Object[] array;
        int i14 = this.f40236jyumaefscl;
        int iBtonecajqb = zg.gtknphoqwx.btonecajqb(i14 + (i14 >> 1) + 1, i13);
        if (this.f40235iwizpuwonk == 0) {
            array = Arrays.copyOf(this.f40237yggfygwlhe, iBtonecajqb);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iBtonecajqb]);
        }
        return new jhduphickx(array, size());
    }

    @Override // hg.zoijcleaow, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(array, "copyOf(...)");
        }
        int size = size();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = this.f40235iwizpuwonk; i14 < size && i15 < this.f40236jyumaefscl; i15++) {
            array[i14] = this.f40237yggfygwlhe[i15];
            i14++;
        }
        while (i14 < size) {
            array[i14] = this.f40237yggfygwlhe[i13];
            i14++;
            i13++;
        }
        return jyumaefscl.gxszxtbevo(size, array);
    }

    public final boolean vdvldrhtss() {
        return size() == this.f40236jyumaefscl;
    }

    @Override // hg.zoijcleaow
    public int wkgbmnqykc() {
        return this.f40234cqumvgiudr;
    }

    public jhduphickx(int i13) {
        this(new Object[i13], 0);
    }

    @Override // hg.zoijcleaow, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
