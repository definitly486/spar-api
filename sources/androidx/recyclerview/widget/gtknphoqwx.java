package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class gtknphoqwx implements Runnable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    static final ThreadLocal f12987cqumvgiudr = new ThreadLocal();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    static Comparator f12988esjtqupxsv = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    long f12990jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    long f12991yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    ArrayList f12992zdlpuopuiu = new ArrayList();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ArrayList f12989iwizpuwonk = new ArrayList();

    class iobyxmoadg implements Comparator {
        iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
            RecyclerView recyclerView = ppxfxbqfkfVar.f12996wkgbmnqykc;
            if ((recyclerView == null) != (ppxfxbqfkfVar2.f12996wkgbmnqykc == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z13 = ppxfxbqfkfVar.f12994iobyxmoadg;
            if (z13 != ppxfxbqfkfVar2.f12994iobyxmoadg) {
                return z13 ? -1 : 1;
            }
            int i13 = ppxfxbqfkfVar2.f12997zoijcleaow - ppxfxbqfkfVar.f12997zoijcleaow;
            if (i13 != 0) {
                return i13;
            }
            int i14 = ppxfxbqfkfVar.f12995ppxfxbqfkf - ppxfxbqfkfVar2.f12995ppxfxbqfkf;
            if (i14 != 0) {
                return i14;
            }
            return 0;
        }
    }

    static class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public int f12993eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public boolean f12994iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f12995ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public RecyclerView f12996wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f12997zoijcleaow;

        ppxfxbqfkf() {
        }

        public void iobyxmoadg() {
            this.f12994iobyxmoadg = false;
            this.f12997zoijcleaow = 0;
            this.f12995ppxfxbqfkf = 0;
            this.f12996wkgbmnqykc = null;
            this.f12993eablkybsjg = 0;
        }
    }

    static class zoijcleaow implements RecyclerView.rgvfuqvkyq.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f12998iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int[] f12999ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f13000wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f13001zoijcleaow;

        zoijcleaow() {
        }

        void eablkybsjg(int i13, int i14) {
            this.f12998iobyxmoadg = i13;
            this.f13001zoijcleaow = i14;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq.ppxfxbqfkf
        public void iobyxmoadg(int i13, int i14) {
            if (i13 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i14 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i15 = this.f13000wkgbmnqykc;
            int i16 = i15 * 2;
            int[] iArr = this.f12999ppxfxbqfkf;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f12999ppxfxbqfkf = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i16 >= iArr.length) {
                int[] iArr3 = new int[i15 * 4];
                this.f12999ppxfxbqfkf = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f12999ppxfxbqfkf;
            iArr4[i16] = i13;
            iArr4[i16 + 1] = i14;
            this.f13000wkgbmnqykc++;
        }

        void ppxfxbqfkf(RecyclerView recyclerView, boolean z13) {
            this.f13000wkgbmnqykc = 0;
            int[] iArr = this.f12999ppxfxbqfkf;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.rgvfuqvkyq rgvfuqvkyqVar = recyclerView.f12686lmojexxdyd;
            if (recyclerView.f12671iozdgvuglv == null || rgvfuqvkyqVar == null || !rgvfuqvkyqVar.hszhottldk()) {
                return;
            }
            if (z13) {
                if (!recyclerView.f12655cqumvgiudr.rgvfuqvkyq()) {
                    rgvfuqvkyqVar.iozdgvuglv(recyclerView.f12671iozdgvuglv.getItemCount(), this);
                }
            } else if (!recyclerView.nuxfzjnpeb()) {
                rgvfuqvkyqVar.yadqdtsiqt(this.f12998iobyxmoadg, this.f13001zoijcleaow, recyclerView.f12709uawqvzlxes, this);
            }
            int i13 = this.f13000wkgbmnqykc;
            if (i13 > rgvfuqvkyqVar.f12764iozdgvuglv) {
                rgvfuqvkyqVar.f12764iozdgvuglv = i13;
                rgvfuqvkyqVar.f12769lmojexxdyd = z13;
                recyclerView.f12682jyumaefscl.wypolnanlu();
            }
        }

        boolean wkgbmnqykc(int i13) {
            if (this.f12999ppxfxbqfkf != null) {
                int i14 = this.f13000wkgbmnqykc * 2;
                for (int i15 = 0; i15 < i14; i15 += 2) {
                    if (this.f12999ppxfxbqfkf[i15] == i13) {
                        return true;
                    }
                }
            }
            return false;
        }

        void zoijcleaow() {
            int[] iArr = this.f12999ppxfxbqfkf;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f13000wkgbmnqykc = 0;
        }
    }

    gtknphoqwx() {
    }

    private RecyclerView.iozdgvuglv dxjokdxxww(RecyclerView recyclerView, int i13, long j13) {
        if (eablkybsjg(recyclerView, i13)) {
            return null;
        }
        RecyclerView.iwizpuwonk iwizpuwonkVar = recyclerView.f12682jyumaefscl;
        try {
            recyclerView.rhgxfdycjh();
            RecyclerView.iozdgvuglv iozdgvuglvVarCllcsxoeiz = iwizpuwonkVar.cllcsxoeiz(i13, false, j13);
            if (iozdgvuglvVarCllcsxoeiz != null) {
                if (!iozdgvuglvVarCllcsxoeiz.isBound() || iozdgvuglvVarCllcsxoeiz.isInvalid()) {
                    iwizpuwonkVar.iobyxmoadg(iozdgvuglvVarCllcsxoeiz, false);
                } else {
                    iwizpuwonkVar.lmojexxdyd(iozdgvuglvVarCllcsxoeiz.itemView);
                }
            }
            return iozdgvuglvVarCllcsxoeiz;
        } finally {
            recyclerView.eslsurpljm(false);
        }
    }

    static boolean eablkybsjg(RecyclerView recyclerView, int i13) {
        int iBtonecajqb = recyclerView.f12660esjtqupxsv.btonecajqb();
        for (int i14 = 0; i14 < iBtonecajqb; i14++) {
            RecyclerView.iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(recyclerView.f12660esjtqupxsv.dxjokdxxww(i14));
            if (iozdgvuglvVarZfvoamnweg.mPosition == i13 && !iozdgvuglvVarZfvoamnweg.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void nufgyqmvbu(RecyclerView recyclerView, long j13) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f12656crxdokpmqz && recyclerView.f12660esjtqupxsv.btonecajqb() != 0) {
            recyclerView.m();
        }
        zoijcleaow zoijcleaowVar = recyclerView.f12702roivzttewh;
        zoijcleaowVar.ppxfxbqfkf(recyclerView, true);
        if (zoijcleaowVar.f13000wkgbmnqykc != 0) {
            try {
                q1.gtknphoqwx.iobyxmoadg("RV Nested Prefetch");
                recyclerView.f12709uawqvzlxes.gxszxtbevo(recyclerView.f12671iozdgvuglv);
                for (int i13 = 0; i13 < zoijcleaowVar.f13000wkgbmnqykc * 2; i13 += 2) {
                    dxjokdxxww(recyclerView, zoijcleaowVar.f12999ppxfxbqfkf[i13], j13);
                }
                q1.gtknphoqwx.zoijcleaow();
            } catch (Throwable th2) {
                q1.gtknphoqwx.zoijcleaow();
                throw th2;
            }
        }
    }

    private void ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar, long j13) {
        RecyclerView.iozdgvuglv iozdgvuglvVarDxjokdxxww = dxjokdxxww(ppxfxbqfkfVar.f12996wkgbmnqykc, ppxfxbqfkfVar.f12993eablkybsjg, ppxfxbqfkfVar.f12994iobyxmoadg ? Long.MAX_VALUE : j13);
        if (iozdgvuglvVarDxjokdxxww == null || iozdgvuglvVarDxjokdxxww.mNestedRecyclerView == null || !iozdgvuglvVarDxjokdxxww.isBound() || iozdgvuglvVarDxjokdxxww.isInvalid()) {
            return;
        }
        nufgyqmvbu(iozdgvuglvVarDxjokdxxww.mNestedRecyclerView.get(), j13);
    }

    private void wkgbmnqykc(long j13) {
        for (int i13 = 0; i13 < this.f12989iwizpuwonk.size(); i13++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f12989iwizpuwonk.get(i13);
            if (ppxfxbqfkfVar.f12996wkgbmnqykc == null) {
                return;
            }
            ppxfxbqfkf(ppxfxbqfkfVar, j13);
            ppxfxbqfkfVar.iobyxmoadg();
        }
    }

    private void zoijcleaow() {
        ppxfxbqfkf ppxfxbqfkfVar;
        int size = this.f12992zdlpuopuiu.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView recyclerView = (RecyclerView) this.f12992zdlpuopuiu.get(i14);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f12702roivzttewh.ppxfxbqfkf(recyclerView, false);
                i13 += recyclerView.f12702roivzttewh.f13000wkgbmnqykc;
            }
        }
        this.f12989iwizpuwonk.ensureCapacity(i13);
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f12992zdlpuopuiu.get(i16);
            if (recyclerView2.getWindowVisibility() == 0) {
                zoijcleaow zoijcleaowVar = recyclerView2.f12702roivzttewh;
                int iAbs = Math.abs(zoijcleaowVar.f12998iobyxmoadg) + Math.abs(zoijcleaowVar.f13001zoijcleaow);
                for (int i17 = 0; i17 < zoijcleaowVar.f13000wkgbmnqykc * 2; i17 += 2) {
                    if (i15 >= this.f12989iwizpuwonk.size()) {
                        ppxfxbqfkfVar = new ppxfxbqfkf();
                        this.f12989iwizpuwonk.add(ppxfxbqfkfVar);
                    } else {
                        ppxfxbqfkfVar = (ppxfxbqfkf) this.f12989iwizpuwonk.get(i15);
                    }
                    int[] iArr = zoijcleaowVar.f12999ppxfxbqfkf;
                    int i18 = iArr[i17 + 1];
                    ppxfxbqfkfVar.f12994iobyxmoadg = i18 <= iAbs;
                    ppxfxbqfkfVar.f12997zoijcleaow = iAbs;
                    ppxfxbqfkfVar.f12995ppxfxbqfkf = i18;
                    ppxfxbqfkfVar.f12996wkgbmnqykc = recyclerView2;
                    ppxfxbqfkfVar.f12993eablkybsjg = iArr[i17];
                    i15++;
                }
            }
        }
        Collections.sort(this.f12989iwizpuwonk, f12988esjtqupxsv);
    }

    public void btonecajqb(RecyclerView recyclerView) {
        boolean zRemove = this.f12992zdlpuopuiu.remove(recyclerView);
        if (RecyclerView.f12649yzdjzghtvl && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    void gxszxtbevo(RecyclerView recyclerView, int i13, int i14) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f12649yzdjzghtvl && !this.f12992zdlpuopuiu.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f12991yggfygwlhe == 0) {
                this.f12991yggfygwlhe = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f12702roivzttewh.eablkybsjg(i13, i14);
    }

    public void iobyxmoadg(RecyclerView recyclerView) {
        if (RecyclerView.f12649yzdjzghtvl && this.f12992zdlpuopuiu.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f12992zdlpuopuiu.add(recyclerView);
    }

    void lqeggnwhkg(long j13) {
        zoijcleaow();
        wkgbmnqykc(j13);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            q1.gtknphoqwx.iobyxmoadg("RV Prefetch");
            if (!this.f12992zdlpuopuiu.isEmpty()) {
                int size = this.f12992zdlpuopuiu.size();
                long jMax = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    RecyclerView recyclerView = (RecyclerView) this.f12992zdlpuopuiu.get(i13);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    lqeggnwhkg(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f12990jyumaefscl);
                }
            }
        } finally {
            this.f12991yggfygwlhe = 0L;
            q1.gtknphoqwx.zoijcleaow();
        }
    }
}
