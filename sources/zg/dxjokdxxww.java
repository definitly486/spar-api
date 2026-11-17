package zg;

import hg.stevsuqkhv;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww extends stevsuqkhv {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f129921iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f129922jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f129923yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f129924zdlpuopuiu;

    public dxjokdxxww(int i13, int i14, int i15) {
        this.f129924zdlpuopuiu = i15;
        this.f129923yggfygwlhe = i14;
        boolean z13 = false;
        if (i15 <= 0 ? i13 >= i14 : i13 <= i14) {
            z13 = true;
        }
        this.f129922jyumaefscl = z13;
        this.f129921iwizpuwonk = z13 ? i13 : i14;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f129922jyumaefscl;
    }

    @Override // hg.stevsuqkhv
    public int iobyxmoadg() {
        int i13 = this.f129921iwizpuwonk;
        if (i13 != this.f129923yggfygwlhe) {
            this.f129921iwizpuwonk = this.f129924zdlpuopuiu + i13;
        } else {
            if (!this.f129922jyumaefscl) {
                throw new NoSuchElementException();
            }
            this.f129922jyumaefscl = false;
        }
        return i13;
    }
}
