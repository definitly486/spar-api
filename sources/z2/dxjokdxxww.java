package z2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private iobyxmoadg f127600gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f127601iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ArrayDeque f127604zoijcleaow = new ArrayDeque();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ArrayDeque f127602ppxfxbqfkf = new ArrayDeque();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final PriorityQueue f127603wkgbmnqykc = new PriorityQueue();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f127599eablkybsjg = -1;

    private static final class iobyxmoadg implements Comparable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public long f127605yggfygwlhe = -9223372036854775807L;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final List f127606zdlpuopuiu = new ArrayList();

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compareTo(iobyxmoadg iobyxmoadgVar) {
            return Long.compare(this.f127605yggfygwlhe, iobyxmoadgVar.f127605yggfygwlhe);
        }

        public void zoijcleaow(long j13, yadqdtsiqt yadqdtsiqtVar) {
            y2.iobyxmoadg.iobyxmoadg(j13 != -9223372036854775807L);
            y2.iobyxmoadg.lqeggnwhkg(this.f127606zdlpuopuiu.isEmpty());
            this.f127605yggfygwlhe = j13;
            this.f127606zdlpuopuiu.add(yadqdtsiqtVar);
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg(long j13, yadqdtsiqt yadqdtsiqtVar);
    }

    public dxjokdxxww(zoijcleaow zoijcleaowVar) {
        this.f127601iobyxmoadg = zoijcleaowVar;
    }

    private void eablkybsjg(int i13) {
        while (this.f127603wkgbmnqykc.size() > i13) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) stevsuqkhv.nufgyqmvbu((iobyxmoadg) this.f127603wkgbmnqykc.poll());
            for (int i14 = 0; i14 < iobyxmoadgVar.f127606zdlpuopuiu.size(); i14++) {
                this.f127601iobyxmoadg.iobyxmoadg(iobyxmoadgVar.f127605yggfygwlhe, (yadqdtsiqt) iobyxmoadgVar.f127606zdlpuopuiu.get(i14));
                this.f127604zoijcleaow.push((yadqdtsiqt) iobyxmoadgVar.f127606zdlpuopuiu.get(i14));
            }
            iobyxmoadgVar.f127606zdlpuopuiu.clear();
            iobyxmoadg iobyxmoadgVar2 = this.f127600gxszxtbevo;
            if (iobyxmoadgVar2 != null && iobyxmoadgVar2.f127605yggfygwlhe == iobyxmoadgVar.f127605yggfygwlhe) {
                this.f127600gxszxtbevo = null;
            }
            this.f127602ppxfxbqfkf.push(iobyxmoadgVar);
        }
    }

    private yadqdtsiqt ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar) {
        yadqdtsiqt yadqdtsiqtVar2 = this.f127604zoijcleaow.isEmpty() ? new yadqdtsiqt() : (yadqdtsiqt) this.f127604zoijcleaow.pop();
        yadqdtsiqtVar2.tzroggbefp(yadqdtsiqtVar.iobyxmoadg());
        System.arraycopy(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.gxszxtbevo(), yadqdtsiqtVar2.eablkybsjg(), 0, yadqdtsiqtVar2.iobyxmoadg());
        return yadqdtsiqtVar2;
    }

    public int gxszxtbevo() {
        return this.f127599eablkybsjg;
    }

    public void iobyxmoadg(long j13, yadqdtsiqt yadqdtsiqtVar) {
        int i13 = this.f127599eablkybsjg;
        if (i13 == 0 || (i13 != -1 && this.f127603wkgbmnqykc.size() >= this.f127599eablkybsjg && j13 < ((iobyxmoadg) stevsuqkhv.nufgyqmvbu((iobyxmoadg) this.f127603wkgbmnqykc.peek())).f127605yggfygwlhe)) {
            this.f127601iobyxmoadg.iobyxmoadg(j13, yadqdtsiqtVar);
            return;
        }
        yadqdtsiqt yadqdtsiqtVarPpxfxbqfkf = ppxfxbqfkf(yadqdtsiqtVar);
        iobyxmoadg iobyxmoadgVar = this.f127600gxszxtbevo;
        if (iobyxmoadgVar != null && j13 == iobyxmoadgVar.f127605yggfygwlhe) {
            iobyxmoadgVar.f127606zdlpuopuiu.add(yadqdtsiqtVarPpxfxbqfkf);
            return;
        }
        iobyxmoadg iobyxmoadgVar2 = this.f127602ppxfxbqfkf.isEmpty() ? new iobyxmoadg() : (iobyxmoadg) this.f127602ppxfxbqfkf.pop();
        iobyxmoadgVar2.zoijcleaow(j13, yadqdtsiqtVarPpxfxbqfkf);
        this.f127603wkgbmnqykc.add(iobyxmoadgVar2);
        this.f127600gxszxtbevo = iobyxmoadgVar2;
        int i14 = this.f127599eablkybsjg;
        if (i14 != -1) {
            eablkybsjg(i14);
        }
    }

    public void lqeggnwhkg(int i13) {
        y2.iobyxmoadg.lqeggnwhkg(i13 >= 0);
        this.f127599eablkybsjg = i13;
        eablkybsjg(i13);
    }

    public void wkgbmnqykc() {
        eablkybsjg(0);
    }

    public void zoijcleaow() {
        this.f127603wkgbmnqykc.clear();
    }
}
