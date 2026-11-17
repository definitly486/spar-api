package xl;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class yggfygwlhe implements Iterator {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private zdlpuopuiu f122734cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Class f122735esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private zdlpuopuiu f122736iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private zdlpuopuiu f122737jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private zdlpuopuiu f122738yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private zdlpuopuiu f122739zdlpuopuiu;

    public yggfygwlhe(zdlpuopuiu zdlpuopuiuVar, Class cls) {
        vl.zoijcleaow.btonecajqb(zdlpuopuiuVar);
        vl.zoijcleaow.btonecajqb(cls);
        this.f122735esjtqupxsv = cls;
        wkgbmnqykc(zdlpuopuiuVar);
    }

    private zdlpuopuiu iobyxmoadg() {
        zdlpuopuiu zdlpuopuiuVarHkdspvbjdz = this.f122737jyumaefscl;
        do {
            if (zdlpuopuiuVarHkdspvbjdz.wflxmlrfwp() > 0) {
                zdlpuopuiuVarHkdspvbjdz = zdlpuopuiuVarHkdspvbjdz.draadjrbmk(0);
            } else if (this.f122739zdlpuopuiu.equals(zdlpuopuiuVarHkdspvbjdz)) {
                zdlpuopuiuVarHkdspvbjdz = null;
            } else if (zdlpuopuiuVarHkdspvbjdz.zynmafqrjb() != null) {
                zdlpuopuiuVarHkdspvbjdz = zdlpuopuiuVarHkdspvbjdz.zynmafqrjb();
            } else {
                do {
                    zdlpuopuiuVarHkdspvbjdz = zdlpuopuiuVarHkdspvbjdz.hkdspvbjdz();
                    if (zdlpuopuiuVarHkdspvbjdz == null || this.f122739zdlpuopuiu.equals(zdlpuopuiuVarHkdspvbjdz)) {
                        return null;
                    }
                } while (zdlpuopuiuVarHkdspvbjdz.zynmafqrjb() == null);
                zdlpuopuiuVarHkdspvbjdz = zdlpuopuiuVarHkdspvbjdz.zynmafqrjb();
            }
            if (zdlpuopuiuVarHkdspvbjdz == null) {
                return null;
            }
        } while (!this.f122735esjtqupxsv.isInstance(zdlpuopuiuVarHkdspvbjdz));
        return zdlpuopuiuVarHkdspvbjdz;
    }

    private void zoijcleaow() {
        if (this.f122738yggfygwlhe != null) {
            return;
        }
        if (this.f122734cqumvgiudr != null && !this.f122737jyumaefscl.cqumvgiudr()) {
            this.f122737jyumaefscl = this.f122736iwizpuwonk;
        }
        this.f122738yggfygwlhe = iobyxmoadg();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        zoijcleaow();
        return this.f122738yggfygwlhe != null;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public zdlpuopuiu next() {
        zoijcleaow();
        zdlpuopuiu zdlpuopuiuVar = this.f122738yggfygwlhe;
        if (zdlpuopuiuVar == null) {
            throw new NoSuchElementException();
        }
        this.f122736iwizpuwonk = this.f122737jyumaefscl;
        this.f122737jyumaefscl = zdlpuopuiuVar;
        this.f122734cqumvgiudr = zdlpuopuiuVar.hkdspvbjdz();
        this.f122738yggfygwlhe = null;
        return zdlpuopuiuVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f122737jyumaefscl.mbcevpiqjq();
    }

    public void wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar) {
        if (this.f122735esjtqupxsv.isInstance(zdlpuopuiuVar)) {
            this.f122738yggfygwlhe = zdlpuopuiuVar;
        }
        this.f122737jyumaefscl = zdlpuopuiuVar;
        this.f122736iwizpuwonk = zdlpuopuiuVar;
        this.f122739zdlpuopuiu = zdlpuopuiuVar;
        this.f122734cqumvgiudr = zdlpuopuiuVar.hkdspvbjdz();
    }
}
