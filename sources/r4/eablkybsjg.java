package r4;

import java.util.ArrayDeque;
import q4.draadjrbmk;
import q4.gtknphoqwx;
import q4.ojitshcjhn;
import q4.rgvfuqvkyq;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
abstract class eablkybsjg implements draadjrbmk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f81607eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f81608gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ArrayDeque f81609iobyxmoadg = new ArrayDeque();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f81610lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ArrayDeque f81611ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private zoijcleaow f81612wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ArrayDeque f81613zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    static final class ppxfxbqfkf extends rgvfuqvkyq {

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private e3.eablkybsjg.iobyxmoadg f81614lereixgezr;

        public ppxfxbqfkf(e3.eablkybsjg.iobyxmoadg iobyxmoadgVar) {
            this.f81614lereixgezr = iobyxmoadgVar;
        }

        @Override // e3.eablkybsjg
        public final void ojitshcjhn() {
            this.f81614lereixgezr.iobyxmoadg(this);
        }
    }

    private static final class zoijcleaow extends ojitshcjhn implements Comparable {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private long f81615cdpycssgdh;

        private zoijcleaow() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
        public int compareTo(zoijcleaow zoijcleaowVar) {
            if (dxjokdxxww() != zoijcleaowVar.dxjokdxxww()) {
                return dxjokdxxww() ? 1 : -1;
            }
            long j13 = this.f10020esjtqupxsv - zoijcleaowVar.f10020esjtqupxsv;
            if (j13 == 0) {
                j13 = this.f81615cdpycssgdh - zoijcleaowVar.f81615cdpycssgdh;
                if (j13 == 0) {
                    return 0;
                }
            }
            return j13 > 0 ? 1 : -1;
        }
    }

    public eablkybsjg() {
        for (int i13 = 0; i13 < 10; i13++) {
            this.f81609iobyxmoadg.add(new zoijcleaow());
        }
        this.f81613zoijcleaow = new ArrayDeque();
        for (int i14 = 0; i14 < 2; i14++) {
            this.f81613zoijcleaow.add(new ppxfxbqfkf(new e3.eablkybsjg.iobyxmoadg() { // from class: r4.wkgbmnqykc
                @Override // e3.eablkybsjg.iobyxmoadg
                public final void iobyxmoadg(e3.eablkybsjg eablkybsjgVar) {
                    this.f81704iobyxmoadg.rgvfuqvkyq((eablkybsjg.ppxfxbqfkf) eablkybsjgVar);
                }
            }));
        }
        this.f81611ppxfxbqfkf = new ArrayDeque();
        this.f81610lqeggnwhkg = -9223372036854775807L;
    }

    private void ojitshcjhn(zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.gxszxtbevo();
        this.f81609iobyxmoadg.add(zoijcleaowVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    @Override // e3.wkgbmnqykc
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void ppxfxbqfkf(ojitshcjhn ojitshcjhnVar) {
        y2.iobyxmoadg.iobyxmoadg(ojitshcjhnVar == this.f81612wkgbmnqykc);
        zoijcleaow zoijcleaowVar = (zoijcleaow) ojitshcjhnVar;
        if (zoijcleaowVar.dxjokdxxww()) {
            long j13 = this.f81608gxszxtbevo;
            this.f81608gxszxtbevo = 1 + j13;
            zoijcleaowVar.f81615cdpycssgdh = j13;
            this.f81611ppxfxbqfkf.add(zoijcleaowVar);
        } else {
            long j14 = zoijcleaowVar.f10020esjtqupxsv;
            if (j14 != Long.MIN_VALUE) {
                long j15 = this.f81610lqeggnwhkg;
                if (j15 == -9223372036854775807L || j14 >= j15) {
                    long j16 = this.f81608gxszxtbevo;
                    this.f81608gxszxtbevo = 1 + j16;
                    zoijcleaowVar.f81615cdpycssgdh = j16;
                    this.f81611ppxfxbqfkf.add(zoijcleaowVar);
                } else {
                    ojitshcjhn(zoijcleaowVar);
                }
            } else {
                long j17 = this.f81608gxszxtbevo;
                this.f81608gxszxtbevo = 1 + j17;
                zoijcleaowVar.f81615cdpycssgdh = j17;
                this.f81611ppxfxbqfkf.add(zoijcleaowVar);
            }
        }
        this.f81612wkgbmnqykc = null;
    }

    @Override // e3.wkgbmnqykc
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public rgvfuqvkyq iobyxmoadg() {
        if (this.f81613zoijcleaow.isEmpty()) {
            return null;
        }
        while (!this.f81611ppxfxbqfkf.isEmpty() && ((zoijcleaow) stevsuqkhv.nufgyqmvbu((zoijcleaow) this.f81611ppxfxbqfkf.peek())).f10020esjtqupxsv <= this.f81607eablkybsjg) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) stevsuqkhv.nufgyqmvbu((zoijcleaow) this.f81611ppxfxbqfkf.poll());
            if (zoijcleaowVar.dxjokdxxww()) {
                rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) stevsuqkhv.nufgyqmvbu((rgvfuqvkyq) this.f81613zoijcleaow.pollFirst());
                rgvfuqvkyqVar.eablkybsjg(4);
                ojitshcjhn(zoijcleaowVar);
                return rgvfuqvkyqVar;
            }
            nufgyqmvbu(zoijcleaowVar);
            if (wflxmlrfwp()) {
                gtknphoqwx gtknphoqwxVarLqeggnwhkg = lqeggnwhkg();
                rgvfuqvkyq rgvfuqvkyqVar2 = (rgvfuqvkyq) stevsuqkhv.nufgyqmvbu((rgvfuqvkyq) this.f81613zoijcleaow.pollFirst());
                rgvfuqvkyqVar2.rgvfuqvkyq(zoijcleaowVar.f10020esjtqupxsv, gtknphoqwxVarLqeggnwhkg, Long.MAX_VALUE);
                ojitshcjhn(zoijcleaowVar);
                return rgvfuqvkyqVar2;
            }
            ojitshcjhn(zoijcleaowVar);
        }
        return null;
    }

    protected final long draadjrbmk() {
        return this.f81607eablkybsjg;
    }

    @Override // e3.wkgbmnqykc
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public ojitshcjhn eablkybsjg() {
        y2.iobyxmoadg.lqeggnwhkg(this.f81612wkgbmnqykc == null);
        if (this.f81609iobyxmoadg.isEmpty()) {
            return null;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) this.f81609iobyxmoadg.pollFirst();
        this.f81612wkgbmnqykc = zoijcleaowVar;
        return zoijcleaowVar;
    }

    @Override // e3.wkgbmnqykc
    public void flush() {
        this.f81608gxszxtbevo = 0L;
        this.f81607eablkybsjg = 0L;
        while (!this.f81611ppxfxbqfkf.isEmpty()) {
            ojitshcjhn((zoijcleaow) stevsuqkhv.nufgyqmvbu((zoijcleaow) this.f81611ppxfxbqfkf.poll()));
        }
        zoijcleaow zoijcleaowVar = this.f81612wkgbmnqykc;
        if (zoijcleaowVar != null) {
            ojitshcjhn(zoijcleaowVar);
            this.f81612wkgbmnqykc = null;
        }
    }

    protected final rgvfuqvkyq gtknphoqwx() {
        return (rgvfuqvkyq) this.f81613zoijcleaow.pollFirst();
    }

    protected abstract gtknphoqwx lqeggnwhkg();

    protected abstract void nufgyqmvbu(ojitshcjhn ojitshcjhnVar);

    @Override // e3.wkgbmnqykc
    public void release() {
    }

    protected void rgvfuqvkyq(rgvfuqvkyq rgvfuqvkyqVar) {
        rgvfuqvkyqVar.gxszxtbevo();
        this.f81613zoijcleaow.add(rgvfuqvkyqVar);
    }

    protected abstract boolean wflxmlrfwp();

    @Override // e3.wkgbmnqykc
    public final void wkgbmnqykc(long j13) {
        this.f81610lqeggnwhkg = j13;
    }

    @Override // q4.draadjrbmk
    public void zoijcleaow(long j13) {
        this.f81607eablkybsjg = j13;
    }
}
