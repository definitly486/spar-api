package y3;

import java.util.Objects;
import t3.eablkybsjg;
import t3.esjtqupxsv;
import t3.jyumaefscl;
import t3.vdvldrhtss;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends eablkybsjg {

    /* JADX INFO: renamed from: y3.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private static final class C3124zoijcleaow implements eablkybsjg.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final esjtqupxsv f123673iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final jyumaefscl.iobyxmoadg f123674ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f123675zoijcleaow;

        private long ppxfxbqfkf(vdvldrhtss vdvldrhtssVar) {
            while (vdvldrhtssVar.nufgyqmvbu() < vdvldrhtssVar.getLength() - 6 && !jyumaefscl.nufgyqmvbu(vdvldrhtssVar, this.f123673iobyxmoadg, this.f123675zoijcleaow, this.f123674ppxfxbqfkf)) {
                vdvldrhtssVar.dxjokdxxww(1);
            }
            if (vdvldrhtssVar.nufgyqmvbu() < vdvldrhtssVar.getLength() - 6) {
                return this.f123674ppxfxbqfkf.f109478iobyxmoadg;
            }
            vdvldrhtssVar.dxjokdxxww((int) (vdvldrhtssVar.getLength() - vdvldrhtssVar.nufgyqmvbu()));
            return this.f123673iobyxmoadg.f109417btonecajqb;
        }

        @Override // t3.eablkybsjg.gxszxtbevo
        public eablkybsjg.C2687eablkybsjg iobyxmoadg(vdvldrhtss vdvldrhtssVar, long j13) {
            long position = vdvldrhtssVar.getPosition();
            long jPpxfxbqfkf = ppxfxbqfkf(vdvldrhtssVar);
            long jNufgyqmvbu = vdvldrhtssVar.nufgyqmvbu();
            vdvldrhtssVar.dxjokdxxww(Math.max(6, this.f123673iobyxmoadg.f109426ppxfxbqfkf));
            long jPpxfxbqfkf2 = ppxfxbqfkf(vdvldrhtssVar);
            long jNufgyqmvbu2 = vdvldrhtssVar.nufgyqmvbu();
            if (jPpxfxbqfkf > j13 || jPpxfxbqfkf2 <= j13) {
                return jPpxfxbqfkf2 <= j13 ? eablkybsjg.C2687eablkybsjg.gxszxtbevo(jPpxfxbqfkf2, jNufgyqmvbu2) : eablkybsjg.C2687eablkybsjg.wkgbmnqykc(jPpxfxbqfkf, position);
            }
            return eablkybsjg.C2687eablkybsjg.eablkybsjg(jNufgyqmvbu);
        }

        private C3124zoijcleaow(esjtqupxsv esjtqupxsvVar, int i13) {
            this.f123673iobyxmoadg = esjtqupxsvVar;
            this.f123675zoijcleaow = i13;
            this.f123674ppxfxbqfkf = new jyumaefscl.iobyxmoadg();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(final esjtqupxsv esjtqupxsvVar, int i13, long j13, long j14) {
        super(new eablkybsjg.wkgbmnqykc() { // from class: y3.iobyxmoadg
            @Override // t3.eablkybsjg.wkgbmnqykc
            public final long iobyxmoadg(long j15) {
                return esjtqupxsvVar.dxjokdxxww(j15);
            }
        }, new C3124zoijcleaow(esjtqupxsvVar, i13), esjtqupxsvVar.gxszxtbevo(), 0L, esjtqupxsvVar.f109417btonecajqb, j13, j14, esjtqupxsvVar.wkgbmnqykc(), Math.max(6, esjtqupxsvVar.f109426ppxfxbqfkf));
        Objects.requireNonNull(esjtqupxsvVar);
    }
}
