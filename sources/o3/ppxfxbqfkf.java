package o3;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf implements esjtqupxsv {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.media3.common.iobyxmoadg[] f71891eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long[] f71892gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final v2.yadqdtsiqt f71893iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f71894lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f71895nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    protected final int[] f71896ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f71897wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected final int f71898zoijcleaow;

    public ppxfxbqfkf(v2.yadqdtsiqt yadqdtsiqtVar, int[] iArr, int i13) {
        y2.iobyxmoadg.lqeggnwhkg(iArr.length > 0);
        this.f71897wkgbmnqykc = i13;
        this.f71893iobyxmoadg = (v2.yadqdtsiqt) y2.iobyxmoadg.eablkybsjg(yadqdtsiqtVar);
        int length = iArr.length;
        this.f71898zoijcleaow = length;
        this.f71891eablkybsjg = new androidx.media3.common.iobyxmoadg[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            this.f71891eablkybsjg[i14] = yadqdtsiqtVar.iobyxmoadg(iArr[i14]);
        }
        Arrays.sort(this.f71891eablkybsjg, new Comparator() { // from class: o3.zoijcleaow
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ppxfxbqfkf.ojitshcjhn((androidx.media3.common.iobyxmoadg) obj, (androidx.media3.common.iobyxmoadg) obj2);
            }
        });
        this.f71896ppxfxbqfkf = new int[this.f71898zoijcleaow];
        int i15 = 0;
        while (true) {
            int i16 = this.f71898zoijcleaow;
            if (i15 >= i16) {
                this.f71892gxszxtbevo = new long[i16];
                this.f71895nufgyqmvbu = false;
                return;
            } else {
                this.f71896ppxfxbqfkf[i15] = yadqdtsiqtVar.zoijcleaow(this.f71891eablkybsjg[i15]);
                i15++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int ojitshcjhn(androidx.media3.common.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2) {
        return iobyxmoadgVar2.f9745btonecajqb - iobyxmoadgVar.f9745btonecajqb;
    }

    @Override // o3.esjtqupxsv
    public void btonecajqb() {
    }

    @Override // o3.esjtqupxsv
    public final androidx.media3.common.iobyxmoadg draadjrbmk() {
        return this.f71891eablkybsjg[iobyxmoadg()];
    }

    @Override // o3.esjtqupxsv
    public void dxjokdxxww(boolean z13) {
        this.f71895nufgyqmvbu = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f71893iobyxmoadg.equals(ppxfxbqfkfVar.f71893iobyxmoadg) && Arrays.equals(this.f71896ppxfxbqfkf, ppxfxbqfkfVar.f71896ppxfxbqfkf);
    }

    @Override // o3.esjtqupxsv
    public final int gtknphoqwx() {
        return this.f71896ppxfxbqfkf[iobyxmoadg()];
    }

    @Override // o3.esjtqupxsv
    public void gxszxtbevo() {
    }

    public int hashCode() {
        if (this.f71894lqeggnwhkg == 0) {
            this.f71894lqeggnwhkg = (System.identityHashCode(this.f71893iobyxmoadg) * 31) + Arrays.hashCode(this.f71896ppxfxbqfkf);
        }
        return this.f71894lqeggnwhkg;
    }

    @Override // o3.zynmafqrjb
    public final int length() {
        return this.f71896ppxfxbqfkf.length;
    }

    @Override // o3.zynmafqrjb
    public final int lqeggnwhkg(int i13) {
        for (int i14 = 0; i14 < this.f71898zoijcleaow; i14++) {
            if (this.f71896ppxfxbqfkf[i14] == i13) {
                return i14;
            }
        }
        return -1;
    }

    @Override // o3.zynmafqrjb
    public final v2.yadqdtsiqt nufgyqmvbu() {
        return this.f71893iobyxmoadg;
    }

    @Override // o3.zynmafqrjb
    public final int ppxfxbqfkf(int i13) {
        return this.f71896ppxfxbqfkf[i13];
    }

    @Override // o3.esjtqupxsv
    public void wkgbmnqykc(float f13) {
    }

    @Override // o3.zynmafqrjb
    public final androidx.media3.common.iobyxmoadg zoijcleaow(int i13) {
        return this.f71891eablkybsjg[i13];
    }
}
