package zg;

import hg.stevsuqkhv;

/* JADX INFO: loaded from: classes3.dex */
public class nufgyqmvbu implements Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f129931iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f129932jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f129933yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f129934zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final nufgyqmvbu iobyxmoadg(int i13, int i14, int i15) {
            return new nufgyqmvbu(i13, i14, i15);
        }

        private iobyxmoadg() {
        }
    }

    public nufgyqmvbu(int i13, int i14, int i15) {
        if (i15 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i15 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f129934zdlpuopuiu = i13;
        this.f129933yggfygwlhe = og.ppxfxbqfkf.zoijcleaow(i13, i14, i15);
        this.f129932jyumaefscl = i15;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public stevsuqkhv iterator() {
        return new dxjokdxxww(this.f129934zdlpuopuiu, this.f129933yggfygwlhe, this.f129932jyumaefscl);
    }

    public final int eablkybsjg() {
        return this.f129933yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (obj instanceof nufgyqmvbu) {
            if (!isEmpty() || !((nufgyqmvbu) obj).isEmpty()) {
                nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
                if (this.f129934zdlpuopuiu != nufgyqmvbuVar.f129934zdlpuopuiu || this.f129933yggfygwlhe != nufgyqmvbuVar.f129933yggfygwlhe || this.f129932jyumaefscl != nufgyqmvbuVar.f129932jyumaefscl) {
                }
            }
            return true;
        }
        return false;
    }

    public final int gxszxtbevo() {
        return this.f129932jyumaefscl;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f129934zdlpuopuiu * 31) + this.f129933yggfygwlhe) * 31) + this.f129932jyumaefscl;
    }

    public boolean isEmpty() {
        if (this.f129932jyumaefscl > 0) {
            if (this.f129934zdlpuopuiu <= this.f129933yggfygwlhe) {
                return false;
            }
        } else if (this.f129934zdlpuopuiu >= this.f129933yggfygwlhe) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb3;
        int i13;
        if (this.f129932jyumaefscl > 0) {
            sb3 = new StringBuilder();
            sb3.append(this.f129934zdlpuopuiu);
            sb3.append("..");
            sb3.append(this.f129933yggfygwlhe);
            sb3.append(" step ");
            i13 = this.f129932jyumaefscl;
        } else {
            sb3 = new StringBuilder();
            sb3.append(this.f129934zdlpuopuiu);
            sb3.append(" downTo ");
            sb3.append(this.f129933yggfygwlhe);
            sb3.append(" step ");
            i13 = -this.f129932jyumaefscl;
        }
        sb3.append(i13);
        return sb3.toString();
    }

    public final int wkgbmnqykc() {
        return this.f129934zdlpuopuiu;
    }
}
