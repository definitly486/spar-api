package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class esjtqupxsv extends pmvmpeiblj {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private agtfadlqog.zoijcleaow f9461draadjrbmk = new agtfadlqog.zoijcleaow();

    private static class iobyxmoadg implements zynmafqrjb {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f9462jyumaefscl = -1;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final zynmafqrjb f9463yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final cqumvgiudr f9464zdlpuopuiu;

        iobyxmoadg(cqumvgiudr cqumvgiudrVar, zynmafqrjb zynmafqrjbVar) {
            this.f9464zdlpuopuiu = cqumvgiudrVar;
            this.f9463yggfygwlhe = zynmafqrjbVar;
        }

        @Override // androidx.lifecycle.zynmafqrjb
        public void iobyxmoadg(Object obj) {
            if (this.f9462jyumaefscl != this.f9464zdlpuopuiu.lqeggnwhkg()) {
                this.f9462jyumaefscl = this.f9464zdlpuopuiu.lqeggnwhkg();
                this.f9463yggfygwlhe.iobyxmoadg(obj);
            }
        }

        void ppxfxbqfkf() {
            this.f9464zdlpuopuiu.agtfadlqog(this);
        }

        void zoijcleaow() {
            this.f9464zdlpuopuiu.btonecajqb(this);
        }
    }

    @Override // androidx.lifecycle.cqumvgiudr
    protected void draadjrbmk() {
        Iterator it = this.f9461draadjrbmk.iterator();
        while (it.hasNext()) {
            ((iobyxmoadg) ((Map.Entry) it.next()).getValue()).ppxfxbqfkf();
        }
    }

    @Override // androidx.lifecycle.cqumvgiudr
    protected void gtknphoqwx() {
        Iterator it = this.f9461draadjrbmk.iterator();
        while (it.hasNext()) {
            ((iobyxmoadg) ((Map.Entry) it.next()).getValue()).zoijcleaow();
        }
    }

    public void rgvfuqvkyq(cqumvgiudr cqumvgiudrVar, zynmafqrjb zynmafqrjbVar) {
        if (cqumvgiudrVar == null) {
            throw new NullPointerException("source cannot be null");
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(cqumvgiudrVar, zynmafqrjbVar);
        iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.f9461draadjrbmk.gxszxtbevo(cqumvgiudrVar, iobyxmoadgVar);
        if (iobyxmoadgVar2 != null && iobyxmoadgVar2.f9463yggfygwlhe != zynmafqrjbVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (iobyxmoadgVar2 == null && nufgyqmvbu()) {
            iobyxmoadgVar.zoijcleaow();
        }
    }

    public void vdvldrhtss(cqumvgiudr cqumvgiudrVar) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f9461draadjrbmk.dxjokdxxww(cqumvgiudrVar);
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf();
        }
    }
}
