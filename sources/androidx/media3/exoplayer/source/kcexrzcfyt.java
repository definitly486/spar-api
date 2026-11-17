package androidx.media3.exoplayer.source;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public interface kcexrzcfyt {

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f11242iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final CopyOnWriteArrayList f11243ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final oxmwwwfdhm.zoijcleaow f11244zoijcleaow;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.source.kcexrzcfyt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static final class C0168iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public Handler f11245iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            public kcexrzcfyt f11246zoijcleaow;

            public C0168iobyxmoadg(Handler handler, kcexrzcfyt kcexrzcfytVar) {
                this.f11245iobyxmoadg = handler;
                this.f11246zoijcleaow = kcexrzcfytVar;
            }
        }

        public iobyxmoadg() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void agtfadlqog(m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, kcexrzcfyt kcexrzcfytVar) {
            kcexrzcfytVar.ikoacuggdj(this.f11242iobyxmoadg, this.f11244zoijcleaow, dxjokdxxwwVar, btonecajqbVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void draadjrbmk(m3.btonecajqb btonecajqbVar, kcexrzcfyt kcexrzcfytVar) {
            kcexrzcfytVar.hkdspvbjdz(this.f11242iobyxmoadg, this.f11244zoijcleaow, btonecajqbVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ojitshcjhn(m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, IOException iOException, boolean z13, kcexrzcfyt kcexrzcfytVar) {
            kcexrzcfytVar.stevsuqkhv(this.f11242iobyxmoadg, this.f11244zoijcleaow, dxjokdxxwwVar, btonecajqbVar, iOException, z13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void rgvfuqvkyq(m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, int i13, kcexrzcfyt kcexrzcfytVar) {
            kcexrzcfytVar.dsvhmnatus(this.f11242iobyxmoadg, this.f11244zoijcleaow, dxjokdxxwwVar, btonecajqbVar, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wflxmlrfwp(m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, kcexrzcfyt kcexrzcfytVar) {
            kcexrzcfytVar.ribwqtqdhb(this.f11242iobyxmoadg, this.f11244zoijcleaow, dxjokdxxwwVar, btonecajqbVar);
        }

        public void btonecajqb(final m3.btonecajqb btonecajqbVar) {
            nufgyqmvbu(new y2.wflxmlrfwp() { // from class: m3.gtknphoqwx
                @Override // y2.wflxmlrfwp
                public final void accept(Object obj) {
                    this.f65032iobyxmoadg.draadjrbmk(btonecajqbVar, (androidx.media3.exoplayer.source.kcexrzcfyt) obj);
                }
            });
        }

        public void cqumvgiudr(final m3.dxjokdxxww dxjokdxxwwVar, final m3.btonecajqb btonecajqbVar, final int i13) {
            nufgyqmvbu(new y2.wflxmlrfwp() { // from class: m3.draadjrbmk
                @Override // y2.wflxmlrfwp
                public final void accept(Object obj) {
                    this.f65020iobyxmoadg.rgvfuqvkyq(dxjokdxxwwVar, btonecajqbVar, i13, (androidx.media3.exoplayer.source.kcexrzcfyt) obj);
                }
            });
        }

        public void dxjokdxxww(int i13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i14, Object obj, long j13) {
            btonecajqb(new m3.btonecajqb(1, i13, iobyxmoadgVar, i14, obj, stevsuqkhv.t(j13), -9223372036854775807L));
        }

        public void esjtqupxsv(kcexrzcfyt kcexrzcfytVar) {
            for (C0168iobyxmoadg c0168iobyxmoadg : this.f11243ppxfxbqfkf) {
                if (c0168iobyxmoadg.f11246zoijcleaow == kcexrzcfytVar) {
                    this.f11243ppxfxbqfkf.remove(c0168iobyxmoadg);
                }
            }
        }

        public void iwizpuwonk(m3.dxjokdxxww dxjokdxxwwVar, int i13, int i14, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i15, Object obj, long j13, long j14, int i16) {
            cqumvgiudr(dxjokdxxwwVar, new m3.btonecajqb(i13, i14, iobyxmoadgVar, i15, obj, stevsuqkhv.t(j13), stevsuqkhv.t(j14)), i16);
        }

        public void jyumaefscl(final m3.dxjokdxxww dxjokdxxwwVar, final m3.btonecajqb btonecajqbVar, final IOException iOException, final boolean z13) {
            nufgyqmvbu(new y2.wflxmlrfwp() { // from class: m3.agtfadlqog
                @Override // y2.wflxmlrfwp
                public final void accept(Object obj) {
                    this.f65009iobyxmoadg.ojitshcjhn(dxjokdxxwwVar, btonecajqbVar, iOException, z13, (androidx.media3.exoplayer.source.kcexrzcfyt) obj);
                }
            });
        }

        public void kcexrzcfyt(m3.dxjokdxxww dxjokdxxwwVar, int i13, int i14, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i15, Object obj, long j13, long j14) {
            zdlpuopuiu(dxjokdxxwwVar, new m3.btonecajqb(i13, i14, iobyxmoadgVar, i15, obj, stevsuqkhv.t(j13), stevsuqkhv.t(j14)));
        }

        public iobyxmoadg lereixgezr(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            return new iobyxmoadg(this.f11243ppxfxbqfkf, i13, zoijcleaowVar);
        }

        public void lqeggnwhkg(Handler handler, kcexrzcfyt kcexrzcfytVar) {
            y2.iobyxmoadg.eablkybsjg(handler);
            y2.iobyxmoadg.eablkybsjg(kcexrzcfytVar);
            this.f11243ppxfxbqfkf.add(new C0168iobyxmoadg(handler, kcexrzcfytVar));
        }

        public void nufgyqmvbu(final y2.wflxmlrfwp wflxmlrfwpVar) {
            for (C0168iobyxmoadg c0168iobyxmoadg : this.f11243ppxfxbqfkf) {
                final kcexrzcfyt kcexrzcfytVar = c0168iobyxmoadg.f11246zoijcleaow;
                stevsuqkhv.krqnebusok(c0168iobyxmoadg.f11245iobyxmoadg, new Runnable() { // from class: m3.rgvfuqvkyq
                    @Override // java.lang.Runnable
                    public final void run() {
                        wflxmlrfwpVar.accept(kcexrzcfytVar);
                    }
                });
            }
        }

        public void oxmwwwfdhm(final m3.dxjokdxxww dxjokdxxwwVar, final m3.btonecajqb btonecajqbVar) {
            nufgyqmvbu(new y2.wflxmlrfwp() { // from class: m3.ojitshcjhn
                @Override // y2.wflxmlrfwp
                public final void accept(Object obj) {
                    this.f65044iobyxmoadg.wflxmlrfwp(dxjokdxxwwVar, btonecajqbVar, (androidx.media3.exoplayer.source.kcexrzcfyt) obj);
                }
            });
        }

        public void vdvldrhtss(m3.dxjokdxxww dxjokdxxwwVar, int i13, int i14, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i15, Object obj, long j13, long j14) {
            oxmwwwfdhm(dxjokdxxwwVar, new m3.btonecajqb(i13, i14, iobyxmoadgVar, i15, obj, stevsuqkhv.t(j13), stevsuqkhv.t(j14)));
        }

        public void yggfygwlhe(m3.dxjokdxxww dxjokdxxwwVar, int i13, int i14, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i15, Object obj, long j13, long j14, IOException iOException, boolean z13) {
            jyumaefscl(dxjokdxxwwVar, new m3.btonecajqb(i13, i14, iobyxmoadgVar, i15, obj, stevsuqkhv.t(j13), stevsuqkhv.t(j14)), iOException, z13);
        }

        public void zdlpuopuiu(final m3.dxjokdxxww dxjokdxxwwVar, final m3.btonecajqb btonecajqbVar) {
            nufgyqmvbu(new y2.wflxmlrfwp() { // from class: m3.wflxmlrfwp
                @Override // y2.wflxmlrfwp
                public final void accept(Object obj) {
                    this.f65052iobyxmoadg.agtfadlqog(dxjokdxxwwVar, btonecajqbVar, (androidx.media3.exoplayer.source.kcexrzcfyt) obj);
                }
            });
        }

        private iobyxmoadg(CopyOnWriteArrayList copyOnWriteArrayList, int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            this.f11243ppxfxbqfkf = copyOnWriteArrayList;
            this.f11242iobyxmoadg = i13;
            this.f11244zoijcleaow = zoijcleaowVar;
        }
    }

    void dsvhmnatus(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, int i14);

    void hkdspvbjdz(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar, m3.btonecajqb btonecajqbVar);

    void ikoacuggdj(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar);

    void ribwqtqdhb(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar);

    void stevsuqkhv(int i13, oxmwwwfdhm.zoijcleaow zoijcleaowVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, IOException iOException, boolean z13);
}
