package androidx.media3.exoplayer.source;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
final class pkzmftpjix {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y2.wflxmlrfwp f11267ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final SparseArray f11268zoijcleaow = new SparseArray();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f11266iobyxmoadg = -1;

    public pkzmftpjix(y2.wflxmlrfwp wflxmlrfwpVar) {
        this.f11267ppxfxbqfkf = wflxmlrfwpVar;
    }

    public Object eablkybsjg(int i13) {
        if (this.f11266iobyxmoadg == -1) {
            this.f11266iobyxmoadg = 0;
        }
        while (true) {
            int i14 = this.f11266iobyxmoadg;
            if (i14 <= 0 || i13 >= this.f11268zoijcleaow.keyAt(i14)) {
                break;
            }
            this.f11266iobyxmoadg--;
        }
        while (this.f11266iobyxmoadg < this.f11268zoijcleaow.size() - 1 && i13 >= this.f11268zoijcleaow.keyAt(this.f11266iobyxmoadg + 1)) {
            this.f11266iobyxmoadg++;
        }
        return this.f11268zoijcleaow.valueAt(this.f11266iobyxmoadg);
    }

    public Object gxszxtbevo() {
        SparseArray sparseArray = this.f11268zoijcleaow;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public void iobyxmoadg(int i13, Object obj) {
        if (this.f11266iobyxmoadg == -1) {
            y2.iobyxmoadg.lqeggnwhkg(this.f11268zoijcleaow.size() == 0);
            this.f11266iobyxmoadg = 0;
        }
        if (this.f11268zoijcleaow.size() > 0) {
            SparseArray sparseArray = this.f11268zoijcleaow;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            y2.iobyxmoadg.iobyxmoadg(i13 >= iKeyAt);
            if (iKeyAt == i13) {
                y2.wflxmlrfwp wflxmlrfwpVar = this.f11267ppxfxbqfkf;
                SparseArray sparseArray2 = this.f11268zoijcleaow;
                wflxmlrfwpVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f11268zoijcleaow.append(i13, obj);
    }

    public boolean lqeggnwhkg() {
        return this.f11268zoijcleaow.size() == 0;
    }

    public void ppxfxbqfkf(int i13) {
        for (int size = this.f11268zoijcleaow.size() - 1; size >= 0 && i13 < this.f11268zoijcleaow.keyAt(size); size--) {
            this.f11267ppxfxbqfkf.accept(this.f11268zoijcleaow.valueAt(size));
            this.f11268zoijcleaow.removeAt(size);
        }
        this.f11266iobyxmoadg = this.f11268zoijcleaow.size() > 0 ? Math.min(this.f11266iobyxmoadg, this.f11268zoijcleaow.size() - 1) : -1;
    }

    public void wkgbmnqykc(int i13) {
        int i14 = 0;
        while (i14 < this.f11268zoijcleaow.size() - 1) {
            int i15 = i14 + 1;
            if (i13 < this.f11268zoijcleaow.keyAt(i15)) {
                return;
            }
            this.f11267ppxfxbqfkf.accept(this.f11268zoijcleaow.valueAt(i14));
            this.f11268zoijcleaow.removeAt(i14);
            int i16 = this.f11266iobyxmoadg;
            if (i16 > 0) {
                this.f11266iobyxmoadg = i16 - 1;
            }
            i14 = i15;
        }
    }

    public void zoijcleaow() {
        for (int i13 = 0; i13 < this.f11268zoijcleaow.size(); i13++) {
            this.f11267ppxfxbqfkf.accept(this.f11268zoijcleaow.valueAt(i13));
        }
        this.f11266iobyxmoadg = -1;
        this.f11268zoijcleaow.clear();
    }
}
