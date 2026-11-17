package gj;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc extends ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f37586jyumaefscl = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f37587yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Object[] f37588zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow extends hg.ppxfxbqfkf {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f37590jyumaefscl = -1;

        zoijcleaow() {
        }

        @Override // hg.ppxfxbqfkf
        protected void iobyxmoadg() {
            do {
                int i13 = this.f37590jyumaefscl + 1;
                this.f37590jyumaefscl = i13;
                if (i13 >= wkgbmnqykc.this.f37588zdlpuopuiu.length) {
                    break;
                }
            } while (wkgbmnqykc.this.f37588zdlpuopuiu[this.f37590jyumaefscl] == null);
            if (this.f37590jyumaefscl >= wkgbmnqykc.this.f37588zdlpuopuiu.length) {
                zoijcleaow();
                return;
            }
            Object obj = wkgbmnqykc.this.f37588zdlpuopuiu[this.f37590jyumaefscl];
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            ppxfxbqfkf(obj);
        }
    }

    private wkgbmnqykc(Object[] objArr, int i13) {
        super(null);
        this.f37588zdlpuopuiu = objArr;
        this.f37587yggfygwlhe = i13;
    }

    private final void wkgbmnqykc(int i13) {
        Object[] objArr = this.f37588zdlpuopuiu;
        if (objArr.length > i13) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i13);
        Object[] objArrCopyOf = Arrays.copyOf(this.f37588zdlpuopuiu, length);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        this.f37588zdlpuopuiu = objArrCopyOf;
    }

    @Override // gj.ppxfxbqfkf
    public Object get(int i13) {
        return hg.agtfadlqog.weqkydbzbr(this.f37588zdlpuopuiu, i13);
    }

    @Override // gj.ppxfxbqfkf
    public int iobyxmoadg() {
        return this.f37587yggfygwlhe;
    }

    @Override // gj.ppxfxbqfkf, java.lang.Iterable
    public Iterator iterator() {
        return new zoijcleaow();
    }

    @Override // gj.ppxfxbqfkf
    public void zoijcleaow(int i13, Object value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        wkgbmnqykc(i13);
        if (this.f37588zdlpuopuiu[i13] == null) {
            this.f37587yggfygwlhe = iobyxmoadg() + 1;
        }
        this.f37588zdlpuopuiu[i13] = value;
    }

    public wkgbmnqykc() {
        this(new Object[20], 0);
    }
}
