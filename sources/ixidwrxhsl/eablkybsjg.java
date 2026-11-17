package ixidwrxhsl;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f49982jyumaefscl = true;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f49983yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final yggfygwlhe[] f49984zdlpuopuiu;

    public eablkybsjg(zdlpuopuiu zdlpuopuiuVar, yggfygwlhe[] yggfygwlheVarArr) {
        this.f49984zdlpuopuiu = yggfygwlheVarArr;
        yggfygwlheVarArr[0].gtknphoqwx(zdlpuopuiuVar.rgvfuqvkyq(), zdlpuopuiuVar.wflxmlrfwp() * 2);
        this.f49983yggfygwlhe = 0;
        ppxfxbqfkf();
    }

    private final int eablkybsjg(int i13) {
        if (this.f49984zdlpuopuiu[i13].eablkybsjg()) {
            return i13;
        }
        if (!this.f49984zdlpuopuiu[i13].gxszxtbevo()) {
            return -1;
        }
        zdlpuopuiu zdlpuopuiuVarZoijcleaow = this.f49984zdlpuopuiu[i13].zoijcleaow();
        if (i13 == 6) {
            this.f49984zdlpuopuiu[i13 + 1].gtknphoqwx(zdlpuopuiuVarZoijcleaow.rgvfuqvkyq(), zdlpuopuiuVarZoijcleaow.rgvfuqvkyq().length);
        } else {
            this.f49984zdlpuopuiu[i13 + 1].gtknphoqwx(zdlpuopuiuVarZoijcleaow.rgvfuqvkyq(), zdlpuopuiuVarZoijcleaow.wflxmlrfwp() * 2);
        }
        return eablkybsjg(i13 + 1);
    }

    private final void iobyxmoadg() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void ppxfxbqfkf() {
        if (this.f49984zdlpuopuiu[this.f49983yggfygwlhe].eablkybsjg()) {
            return;
        }
        for (int i13 = this.f49983yggfygwlhe; -1 < i13; i13--) {
            int iEablkybsjg = eablkybsjg(i13);
            if (iEablkybsjg == -1 && this.f49984zdlpuopuiu[i13].gxszxtbevo()) {
                this.f49984zdlpuopuiu[i13].btonecajqb();
                iEablkybsjg = eablkybsjg(i13);
            }
            if (iEablkybsjg != -1) {
                this.f49983yggfygwlhe = iEablkybsjg;
                return;
            }
            if (i13 > 0) {
                this.f49984zdlpuopuiu[i13 - 1].btonecajqb();
            }
            this.f49984zdlpuopuiu[i13].gtknphoqwx(zdlpuopuiu.f50009eablkybsjg.iobyxmoadg().rgvfuqvkyq(), 0);
        }
        this.f49982jyumaefscl = false;
    }

    protected final void gxszxtbevo(int i13) {
        this.f49983yggfygwlhe = i13;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f49982jyumaefscl;
    }

    @Override // java.util.Iterator
    public Object next() {
        iobyxmoadg();
        Object next = this.f49984zdlpuopuiu[this.f49983yggfygwlhe].next();
        ppxfxbqfkf();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected final yggfygwlhe[] wkgbmnqykc() {
        return this.f49984zdlpuopuiu;
    }

    protected final Object zoijcleaow() {
        iobyxmoadg();
        return this.f49984zdlpuopuiu[this.f49983yggfygwlhe].iobyxmoadg();
    }
}
