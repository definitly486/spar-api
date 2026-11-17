package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
final class e1 implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f5593cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f5594esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final f1 f5595iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final jztzpxfvev f5596jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f5597yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final e0 f5598zdlpuopuiu;

    public e1(e0 e0Var, int i13, jztzpxfvev jztzpxfvevVar, f1 f1Var) {
        this.f5598zdlpuopuiu = e0Var;
        this.f5597yggfygwlhe = i13;
        this.f5595iwizpuwonk = f1Var;
        this.f5593cqumvgiudr = e0Var.vdvldrhtss();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList arrayListEablkybsjg = this.f5596jyumaefscl.eablkybsjg();
        return arrayListEablkybsjg != null && this.f5594esjtqupxsv < arrayListEablkybsjg.size();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public krqnebusok.gtknphoqwx next() {
        Object obj;
        ArrayList arrayListEablkybsjg = this.f5596jyumaefscl.eablkybsjg();
        if (arrayListEablkybsjg != null) {
            int i13 = this.f5594esjtqupxsv;
            this.f5594esjtqupxsv = i13 + 1;
            obj = arrayListEablkybsjg.get(i13);
        } else {
            obj = null;
        }
        if (obj instanceof zoijcleaow) {
            return new f0(this.f5598zdlpuopuiu, ((zoijcleaow) obj).iobyxmoadg(), this.f5593cqumvgiudr);
        }
        if (obj instanceof jztzpxfvev) {
            return new g1(this.f5598zdlpuopuiu, this.f5597yggfygwlhe, (jztzpxfvev) obj, new s(this.f5595iwizpuwonk, this.f5594esjtqupxsv - 1));
        }
        jyumaefscl.yggfygwlhe("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
