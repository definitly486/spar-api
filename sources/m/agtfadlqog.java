package m;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class agtfadlqog extends rgvfuqvkyq implements Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final float f64604cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final float f64605esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final List f64606istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final float f64607iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final float f64608jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final float f64609lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final float f64610pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final float f64611yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f64612zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final List f64613zynmafqrjb;

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Iterator f64614zdlpuopuiu;

        iobyxmoadg(agtfadlqog agtfadlqogVar) {
            this.f64614zdlpuopuiu = agtfadlqogVar.f64606istkbnxepw.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64614zdlpuopuiu.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public rgvfuqvkyq next() {
            return (rgvfuqvkyq) this.f64614zdlpuopuiu.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public agtfadlqog(String str, float f13, float f14, float f15, float f16, float f17, float f18, float f19, List list, List list2) {
        super(null);
        this.f64612zdlpuopuiu = str;
        this.f64611yggfygwlhe = f13;
        this.f64608jyumaefscl = f14;
        this.f64607iwizpuwonk = f15;
        this.f64604cqumvgiudr = f16;
        this.f64605esjtqupxsv = f17;
        this.f64609lereixgezr = f18;
        this.f64610pmvmpeiblj = f19;
        this.f64613zynmafqrjb = list;
        this.f64606istkbnxepw = list2;
    }

    public final float agtfadlqog() {
        return this.f64610pmvmpeiblj;
    }

    public final float btonecajqb() {
        return this.f64604cqumvgiudr;
    }

    public final int draadjrbmk() {
        return this.f64606istkbnxepw.size();
    }

    public final float dxjokdxxww() {
        return this.f64611yggfygwlhe;
    }

    public final float eablkybsjg() {
        return this.f64608jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof agtfadlqog)) {
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return zdlpuopuiu.eablkybsjg(this.f64612zdlpuopuiu, agtfadlqogVar.f64612zdlpuopuiu) && this.f64611yggfygwlhe == agtfadlqogVar.f64611yggfygwlhe && this.f64608jyumaefscl == agtfadlqogVar.f64608jyumaefscl && this.f64607iwizpuwonk == agtfadlqogVar.f64607iwizpuwonk && this.f64604cqumvgiudr == agtfadlqogVar.f64604cqumvgiudr && this.f64605esjtqupxsv == agtfadlqogVar.f64605esjtqupxsv && this.f64609lereixgezr == agtfadlqogVar.f64609lereixgezr && this.f64610pmvmpeiblj == agtfadlqogVar.f64610pmvmpeiblj && zdlpuopuiu.eablkybsjg(this.f64613zynmafqrjb, agtfadlqogVar.f64613zynmafqrjb) && zdlpuopuiu.eablkybsjg(this.f64606istkbnxepw, agtfadlqogVar.f64606istkbnxepw);
        }
        return false;
    }

    public final float gtknphoqwx() {
        return this.f64605esjtqupxsv;
    }

    public final float gxszxtbevo() {
        return this.f64607iwizpuwonk;
    }

    public int hashCode() {
        return (((((((((((((((((this.f64612zdlpuopuiu.hashCode() * 31) + Float.hashCode(this.f64611yggfygwlhe)) * 31) + Float.hashCode(this.f64608jyumaefscl)) * 31) + Float.hashCode(this.f64607iwizpuwonk)) * 31) + Float.hashCode(this.f64604cqumvgiudr)) * 31) + Float.hashCode(this.f64605esjtqupxsv)) * 31) + Float.hashCode(this.f64609lereixgezr)) * 31) + Float.hashCode(this.f64610pmvmpeiblj)) * 31) + this.f64613zynmafqrjb.hashCode()) * 31) + this.f64606istkbnxepw.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new iobyxmoadg(this);
    }

    public final List ppxfxbqfkf() {
        return this.f64613zynmafqrjb;
    }

    public final float wflxmlrfwp() {
        return this.f64609lereixgezr;
    }

    public final String wkgbmnqykc() {
        return this.f64612zdlpuopuiu;
    }

    public final rgvfuqvkyq zoijcleaow(int i13) {
        return (rgvfuqvkyq) this.f64606istkbnxepw.get(i13);
    }
}
