package androidx.media3.exoplayer;

import android.util.Pair;
import g3.h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class dvvnrvtcbc {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private b3.wflxmlrfwp f10490draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final y2.ojitshcjhn f10491dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final wkgbmnqykc f10492eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f10493gtknphoqwx;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final h0 f10495iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final g3.iobyxmoadg f10497nufgyqmvbu;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private m3.kcexrzcfyt f10489btonecajqb = new m3.kcexrzcfyt.iobyxmoadg(0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final IdentityHashMap f10498ppxfxbqfkf = new IdentityHashMap();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f10499wkgbmnqykc = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f10500zoijcleaow = new ArrayList();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final HashMap f10494gxszxtbevo = new HashMap();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Set f10496lqeggnwhkg = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    final class iobyxmoadg implements androidx.media3.exoplayer.source.kcexrzcfyt, androidx.media3.exoplayer.drm.nufgyqmvbu {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ppxfxbqfkf f10502zdlpuopuiu;

        public iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f10502zdlpuopuiu = ppxfxbqfkfVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void cllcsxoeiz(Pair pair) {
            dvvnrvtcbc.this.f10497nufgyqmvbu.jztzpxfvev(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void hcddaimhww(Pair pair) {
            dvvnrvtcbc.this.f10497nufgyqmvbu.pkzmftpjix(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void jhduphickx(Pair pair, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, int i13) {
            dvvnrvtcbc.this.f10497nufgyqmvbu.dsvhmnatus(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pair.second, dxjokdxxwwVar, btonecajqbVar, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void jlmebxxoox(Pair pair, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar) {
            dvvnrvtcbc.this.f10497nufgyqmvbu.ikoacuggdj(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pair.second, dxjokdxxwwVar, btonecajqbVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void jpowsppfya(Pair pair) {
            dvvnrvtcbc.this.f10497nufgyqmvbu.sopmlzcsov(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void kegysxyocb(Pair pair, Exception exc) {
            dvvnrvtcbc.this.f10497nufgyqmvbu.crxdokpmqz(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pair.second, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ntlheqmsrt(Pair pair) {
            dvvnrvtcbc.this.f10497nufgyqmvbu.sflfametgt(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ulzqkzuiru(Pair pair, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar) {
            dvvnrvtcbc.this.f10497nufgyqmvbu.ribwqtqdhb(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pair.second, dxjokdxxwwVar, btonecajqbVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void vipkmwdibw(Pair pair, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, IOException iOException, boolean z13) {
            dvvnrvtcbc.this.f10497nufgyqmvbu.stevsuqkhv(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pair.second, dxjokdxxwwVar, btonecajqbVar, iOException, z13);
        }

        private Pair wwaezpbzkn(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2 = null;
            if (zoijcleaowVar != null) {
                androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVarAgtfadlqog = dvvnrvtcbc.agtfadlqog(this.f10502zdlpuopuiu, zoijcleaowVar);
                if (zoijcleaowVarAgtfadlqog == null) {
                    return null;
                }
                zoijcleaowVar2 = zoijcleaowVarAgtfadlqog;
            }
            return Pair.create(Integer.valueOf(dvvnrvtcbc.kcexrzcfyt(this.f10502zdlpuopuiu, i13)), zoijcleaowVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wypolnanlu(Pair pair, int i13) {
            dvvnrvtcbc.this.f10497nufgyqmvbu.mbcevpiqjq(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pair.second, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ylkuphrtab(Pair pair, m3.btonecajqb btonecajqbVar) {
            dvvnrvtcbc.this.f10497nufgyqmvbu.hkdspvbjdz(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pair.second, btonecajqbVar);
        }

        @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
        public void crxdokpmqz(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final Exception exc) {
            final Pair pairWwaezpbzkn = wwaezpbzkn(i13, zoijcleaowVar);
            if (pairWwaezpbzkn != null) {
                dvvnrvtcbc.this.f10491dxjokdxxww.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.tbqsvytpvh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11415zdlpuopuiu.kegysxyocb(pairWwaezpbzkn, exc);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.kcexrzcfyt
        public void dsvhmnatus(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final m3.dxjokdxxww dxjokdxxwwVar, final m3.btonecajqb btonecajqbVar, final int i14) {
            final Pair pairWwaezpbzkn = wwaezpbzkn(i13, zoijcleaowVar);
            if (pairWwaezpbzkn != null) {
                dvvnrvtcbc.this.f10491dxjokdxxww.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.zeieaojujs
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11662zdlpuopuiu.jhduphickx(pairWwaezpbzkn, dxjokdxxwwVar, btonecajqbVar, i14);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.kcexrzcfyt
        public void hkdspvbjdz(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final m3.btonecajqb btonecajqbVar) {
            final Pair pairWwaezpbzkn = wwaezpbzkn(i13, zoijcleaowVar);
            if (pairWwaezpbzkn != null) {
                dvvnrvtcbc.this.f10491dxjokdxxww.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.weqkydbzbr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11611zdlpuopuiu.ylkuphrtab(pairWwaezpbzkn, btonecajqbVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.kcexrzcfyt
        public void ikoacuggdj(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final m3.dxjokdxxww dxjokdxxwwVar, final m3.btonecajqb btonecajqbVar) {
            final Pair pairWwaezpbzkn = wwaezpbzkn(i13, zoijcleaowVar);
            if (pairWwaezpbzkn != null) {
                dvvnrvtcbc.this.f10491dxjokdxxww.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.lrnfpwlwnk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10620zdlpuopuiu.jlmebxxoox(pairWwaezpbzkn, dxjokdxxwwVar, btonecajqbVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
        public void jztzpxfvev(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            final Pair pairWwaezpbzkn = wwaezpbzkn(i13, zoijcleaowVar);
            if (pairWwaezpbzkn != null) {
                dvvnrvtcbc.this.f10491dxjokdxxww.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.iwxlajgraz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10585zdlpuopuiu.cllcsxoeiz(pairWwaezpbzkn);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
        public void mbcevpiqjq(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final int i14) {
            final Pair pairWwaezpbzkn = wwaezpbzkn(i13, zoijcleaowVar);
            if (pairWwaezpbzkn != null) {
                dvvnrvtcbc.this.f10491dxjokdxxww.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.uawqvzlxes
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11419zdlpuopuiu.wypolnanlu(pairWwaezpbzkn, i14);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
        public void pkzmftpjix(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            final Pair pairWwaezpbzkn = wwaezpbzkn(i13, zoijcleaowVar);
            if (pairWwaezpbzkn != null) {
                dvvnrvtcbc.this.f10491dxjokdxxww.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.iyctptxqzt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10588zdlpuopuiu.hcddaimhww(pairWwaezpbzkn);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.kcexrzcfyt
        public void ribwqtqdhb(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final m3.dxjokdxxww dxjokdxxwwVar, final m3.btonecajqb btonecajqbVar) {
            final Pair pairWwaezpbzkn = wwaezpbzkn(i13, zoijcleaowVar);
            if (pairWwaezpbzkn != null) {
                dvvnrvtcbc.this.f10491dxjokdxxww.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.opjhrmiecq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10933zdlpuopuiu.ulzqkzuiru(pairWwaezpbzkn, dxjokdxxwwVar, btonecajqbVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
        public void sflfametgt(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            final Pair pairWwaezpbzkn = wwaezpbzkn(i13, zoijcleaowVar);
            if (pairWwaezpbzkn != null) {
                dvvnrvtcbc.this.f10491dxjokdxxww.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.roivzttewh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11028zdlpuopuiu.ntlheqmsrt(pairWwaezpbzkn);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
        public void sopmlzcsov(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            final Pair pairWwaezpbzkn = wwaezpbzkn(i13, zoijcleaowVar);
            if (pairWwaezpbzkn != null) {
                dvvnrvtcbc.this.f10491dxjokdxxww.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.auzgnhcxok
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10330zdlpuopuiu.jpowsppfya(pairWwaezpbzkn);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.kcexrzcfyt
        public void stevsuqkhv(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final m3.dxjokdxxww dxjokdxxwwVar, final m3.btonecajqb btonecajqbVar, final IOException iOException, final boolean z13) {
            final Pair pairWwaezpbzkn = wwaezpbzkn(i13, zoijcleaowVar);
            if (pairWwaezpbzkn != null) {
                dvvnrvtcbc.this.f10491dxjokdxxww.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.nuxfzjnpeb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10916zdlpuopuiu.vipkmwdibw(pairWwaezpbzkn, dxjokdxxwwVar, btonecajqbVar, iOException, z13);
                    }
                });
            }
        }
    }

    static final class ppxfxbqfkf implements oipsdeybqn {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public boolean f10503eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.rgvfuqvkyq f10504iobyxmoadg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public int f10506wkgbmnqykc;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final List f10505ppxfxbqfkf = new ArrayList();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final Object f10507zoijcleaow = new Object();

        public ppxfxbqfkf(androidx.media3.exoplayer.source.oxmwwwfdhm oxmwwwfdhmVar, boolean z13) {
            this.f10504iobyxmoadg = new androidx.media3.exoplayer.source.rgvfuqvkyq(oxmwwwfdhmVar, z13);
        }

        @Override // androidx.media3.exoplayer.oipsdeybqn
        public Object iobyxmoadg() {
            return this.f10507zoijcleaow;
        }

        public void ppxfxbqfkf(int i13) {
            this.f10506wkgbmnqykc = i13;
            this.f10503eablkybsjg = false;
            this.f10505ppxfxbqfkf.clear();
        }

        @Override // androidx.media3.exoplayer.oipsdeybqn
        public v2.cdpycssgdh zoijcleaow() {
            return this.f10504iobyxmoadg.ulzqkzuiru();
        }
    }

    public interface wkgbmnqykc {
        void ppxfxbqfkf();
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.oxmwwwfdhm f10508iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final iobyxmoadg f10509ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.oxmwwwfdhm.ppxfxbqfkf f10510zoijcleaow;

        public zoijcleaow(androidx.media3.exoplayer.source.oxmwwwfdhm oxmwwwfdhmVar, androidx.media3.exoplayer.source.oxmwwwfdhm.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar) {
            this.f10508iobyxmoadg = oxmwwwfdhmVar;
            this.f10510zoijcleaow = ppxfxbqfkfVar;
            this.f10509ppxfxbqfkf = iobyxmoadgVar;
        }
    }

    public dvvnrvtcbc(wkgbmnqykc wkgbmnqykcVar, g3.iobyxmoadg iobyxmoadgVar, y2.ojitshcjhn ojitshcjhnVar, h0 h0Var) {
        this.f10495iobyxmoadg = h0Var;
        this.f10492eablkybsjg = wkgbmnqykcVar;
        this.f10497nufgyqmvbu = iobyxmoadgVar;
        this.f10491dxjokdxxww = ojitshcjhnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow agtfadlqog(ppxfxbqfkf ppxfxbqfkfVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        for (int i13 = 0; i13 < ppxfxbqfkfVar.f10505ppxfxbqfkf.size(); i13++) {
            if (((androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) ppxfxbqfkfVar.f10505ppxfxbqfkf.get(i13)).f11264wkgbmnqykc == zoijcleaowVar.f11264wkgbmnqykc) {
                return zoijcleaowVar.iobyxmoadg(rgvfuqvkyq(ppxfxbqfkfVar, zoijcleaowVar.f11262iobyxmoadg));
            }
        }
        return null;
    }

    private void btonecajqb(ppxfxbqfkf ppxfxbqfkfVar) {
        zoijcleaow zoijcleaowVar = (zoijcleaow) this.f10494gxszxtbevo.get(ppxfxbqfkfVar);
        if (zoijcleaowVar != null) {
            zoijcleaowVar.f10508iobyxmoadg.draadjrbmk(zoijcleaowVar.f10510zoijcleaow);
        }
    }

    private void cqumvgiudr(ppxfxbqfkf ppxfxbqfkfVar) {
        androidx.media3.exoplayer.source.rgvfuqvkyq rgvfuqvkyqVar = ppxfxbqfkfVar.f10504iobyxmoadg;
        androidx.media3.exoplayer.source.oxmwwwfdhm.ppxfxbqfkf ppxfxbqfkfVar2 = new androidx.media3.exoplayer.source.oxmwwwfdhm.ppxfxbqfkf() { // from class: androidx.media3.exoplayer.bfopjjpdmp
            @Override // androidx.media3.exoplayer.source.oxmwwwfdhm.ppxfxbqfkf
            public final void iobyxmoadg(androidx.media3.exoplayer.source.oxmwwwfdhm oxmwwwfdhmVar, v2.cdpycssgdh cdpycssgdhVar) {
                this.f10331iobyxmoadg.yggfygwlhe(oxmwwwfdhmVar, cdpycssgdhVar);
            }
        };
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(ppxfxbqfkfVar);
        this.f10494gxszxtbevo.put(ppxfxbqfkfVar, new zoijcleaow(rgvfuqvkyqVar, ppxfxbqfkfVar2, iobyxmoadgVar));
        rgvfuqvkyqVar.iobyxmoadg(y2.stevsuqkhv.zynmafqrjb(), iobyxmoadgVar);
        rgvfuqvkyqVar.eablkybsjg(y2.stevsuqkhv.zynmafqrjb(), iobyxmoadgVar);
        rgvfuqvkyqVar.nufgyqmvbu(ppxfxbqfkfVar2, this.f10490draadjrbmk, this.f10495iobyxmoadg);
    }

    private void draadjrbmk(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f10496lqeggnwhkg.add(ppxfxbqfkfVar);
        zoijcleaow zoijcleaowVar = (zoijcleaow) this.f10494gxszxtbevo.get(ppxfxbqfkfVar);
        if (zoijcleaowVar != null) {
            zoijcleaowVar.f10508iobyxmoadg.dxjokdxxww(zoijcleaowVar.f10510zoijcleaow);
        }
    }

    private void gtknphoqwx() {
        Iterator it = this.f10496lqeggnwhkg.iterator();
        while (it.hasNext()) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) it.next();
            if (ppxfxbqfkfVar.f10505ppxfxbqfkf.isEmpty()) {
                btonecajqb(ppxfxbqfkfVar);
                it.remove();
            }
        }
    }

    private void jyumaefscl(ppxfxbqfkf ppxfxbqfkfVar) {
        if (ppxfxbqfkfVar.f10503eablkybsjg && ppxfxbqfkfVar.f10505ppxfxbqfkf.isEmpty()) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) y2.iobyxmoadg.eablkybsjg((zoijcleaow) this.f10494gxszxtbevo.remove(ppxfxbqfkfVar));
            zoijcleaowVar.f10508iobyxmoadg.gtknphoqwx(zoijcleaowVar.f10510zoijcleaow);
            zoijcleaowVar.f10508iobyxmoadg.zoijcleaow(zoijcleaowVar.f10509ppxfxbqfkf);
            zoijcleaowVar.f10508iobyxmoadg.gxszxtbevo(zoijcleaowVar.f10509ppxfxbqfkf);
            this.f10496lqeggnwhkg.remove(ppxfxbqfkfVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int kcexrzcfyt(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        return i13 + ppxfxbqfkfVar.f10506wkgbmnqykc;
    }

    private void lqeggnwhkg(int i13, int i14) {
        while (i13 < this.f10500zoijcleaow.size()) {
            ((ppxfxbqfkf) this.f10500zoijcleaow.get(i13)).f10506wkgbmnqykc += i14;
            i13++;
        }
    }

    private static Object ojitshcjhn(Object obj) {
        return f3.iobyxmoadg.iwizpuwonk(obj);
    }

    private static Object rgvfuqvkyq(ppxfxbqfkf ppxfxbqfkfVar, Object obj) {
        return f3.iobyxmoadg.esjtqupxsv(ppxfxbqfkfVar.f10507zoijcleaow, obj);
    }

    private static Object wflxmlrfwp(Object obj) {
        return f3.iobyxmoadg.jyumaefscl(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yggfygwlhe(androidx.media3.exoplayer.source.oxmwwwfdhm oxmwwwfdhmVar, v2.cdpycssgdh cdpycssgdhVar) {
        this.f10492eablkybsjg.ppxfxbqfkf();
    }

    private void zynmafqrjb(int i13, int i14) {
        for (int i15 = i14 - 1; i15 >= i13; i15--) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f10500zoijcleaow.remove(i15);
            this.f10499wkgbmnqykc.remove(ppxfxbqfkfVar.f10507zoijcleaow);
            lqeggnwhkg(i15, -ppxfxbqfkfVar.f10504iobyxmoadg.ulzqkzuiru().rgvfuqvkyq());
            ppxfxbqfkfVar.f10503eablkybsjg = true;
            if (this.f10493gtknphoqwx) {
                jyumaefscl(ppxfxbqfkfVar);
            }
        }
    }

    public v2.cdpycssgdh cdpycssgdh(m3.kcexrzcfyt kcexrzcfytVar) {
        int iOxmwwwfdhm = oxmwwwfdhm();
        if (kcexrzcfytVar.getLength() != iOxmwwwfdhm) {
            kcexrzcfytVar = kcexrzcfytVar.eablkybsjg().lqeggnwhkg(0, iOxmwwwfdhm);
        }
        this.f10489btonecajqb = kcexrzcfytVar;
        return dxjokdxxww();
    }

    public v2.cdpycssgdh dxjokdxxww() {
        if (this.f10500zoijcleaow.isEmpty()) {
            return v2.cdpycssgdh.f115259iobyxmoadg;
        }
        int iRgvfuqvkyq = 0;
        for (int i13 = 0; i13 < this.f10500zoijcleaow.size(); i13++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f10500zoijcleaow.get(i13);
            ppxfxbqfkfVar.f10506wkgbmnqykc = iRgvfuqvkyq;
            iRgvfuqvkyq += ppxfxbqfkfVar.f10504iobyxmoadg.ulzqkzuiru().rgvfuqvkyq();
        }
        return new lxfrhoxuzk(this.f10500zoijcleaow, this.f10489btonecajqb);
    }

    public void esjtqupxsv() {
        for (zoijcleaow zoijcleaowVar : this.f10494gxszxtbevo.values()) {
            try {
                zoijcleaowVar.f10508iobyxmoadg.gtknphoqwx(zoijcleaowVar.f10510zoijcleaow);
            } catch (RuntimeException e13) {
                y2.kcexrzcfyt.wkgbmnqykc("MediaSourceList", "Failed to release child source.", e13);
            }
            zoijcleaowVar.f10508iobyxmoadg.zoijcleaow(zoijcleaowVar.f10509ppxfxbqfkf);
            zoijcleaowVar.f10508iobyxmoadg.gxszxtbevo(zoijcleaowVar.f10509ppxfxbqfkf);
        }
        this.f10494gxszxtbevo.clear();
        this.f10496lqeggnwhkg.clear();
        this.f10493gtknphoqwx = false;
    }

    public v2.cdpycssgdh gxszxtbevo(int i13, List list, m3.kcexrzcfyt kcexrzcfytVar) {
        if (!list.isEmpty()) {
            this.f10489btonecajqb = kcexrzcfytVar;
            for (int i14 = i13; i14 < list.size() + i13; i14++) {
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) list.get(i14 - i13);
                if (i14 > 0) {
                    ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f10500zoijcleaow.get(i14 - 1);
                    ppxfxbqfkfVar.ppxfxbqfkf(ppxfxbqfkfVar2.f10506wkgbmnqykc + ppxfxbqfkfVar2.f10504iobyxmoadg.ulzqkzuiru().rgvfuqvkyq());
                } else {
                    ppxfxbqfkfVar.ppxfxbqfkf(0);
                }
                lqeggnwhkg(i14, ppxfxbqfkfVar.f10504iobyxmoadg.ulzqkzuiru().rgvfuqvkyq());
                this.f10500zoijcleaow.add(i14, ppxfxbqfkfVar);
                this.f10499wkgbmnqykc.put(ppxfxbqfkfVar.f10507zoijcleaow, ppxfxbqfkfVar);
                if (this.f10493gtknphoqwx) {
                    cqumvgiudr(ppxfxbqfkfVar);
                    if (this.f10498ppxfxbqfkf.isEmpty()) {
                        this.f10496lqeggnwhkg.add(ppxfxbqfkfVar);
                    } else {
                        btonecajqb(ppxfxbqfkfVar);
                    }
                }
            }
        }
        return dxjokdxxww();
    }

    public v2.cdpycssgdh istkbnxepw(List list, m3.kcexrzcfyt kcexrzcfytVar) {
        zynmafqrjb(0, this.f10500zoijcleaow.size());
        return gxszxtbevo(this.f10500zoijcleaow.size(), list, kcexrzcfytVar);
    }

    public void iwizpuwonk(b3.wflxmlrfwp wflxmlrfwpVar) {
        y2.iobyxmoadg.lqeggnwhkg(!this.f10493gtknphoqwx);
        this.f10490draadjrbmk = wflxmlrfwpVar;
        for (int i13 = 0; i13 < this.f10500zoijcleaow.size(); i13++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f10500zoijcleaow.get(i13);
            cqumvgiudr(ppxfxbqfkfVar);
            this.f10496lqeggnwhkg.add(ppxfxbqfkfVar);
        }
        this.f10493gtknphoqwx = true;
    }

    public void lereixgezr(androidx.media3.exoplayer.source.vdvldrhtss vdvldrhtssVar) {
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg((ppxfxbqfkf) this.f10498ppxfxbqfkf.remove(vdvldrhtssVar));
        ppxfxbqfkfVar.f10504iobyxmoadg.lqeggnwhkg(vdvldrhtssVar);
        ppxfxbqfkfVar.f10505ppxfxbqfkf.remove(((androidx.media3.exoplayer.source.ojitshcjhn) vdvldrhtssVar).f11258zdlpuopuiu);
        if (!this.f10498ppxfxbqfkf.isEmpty()) {
            gtknphoqwx();
        }
        jyumaefscl(ppxfxbqfkfVar);
    }

    public androidx.media3.exoplayer.source.vdvldrhtss nufgyqmvbu(androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, p3.zoijcleaow zoijcleaowVar2, long j13) {
        Object objOjitshcjhn = ojitshcjhn(zoijcleaowVar.f11262iobyxmoadg);
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVarIobyxmoadg = zoijcleaowVar.iobyxmoadg(wflxmlrfwp(zoijcleaowVar.f11262iobyxmoadg));
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg((ppxfxbqfkf) this.f10499wkgbmnqykc.get(objOjitshcjhn));
        draadjrbmk(ppxfxbqfkfVar);
        ppxfxbqfkfVar.f10505ppxfxbqfkf.add(zoijcleaowVarIobyxmoadg);
        androidx.media3.exoplayer.source.ojitshcjhn ojitshcjhnVarRgvfuqvkyq = ppxfxbqfkfVar.f10504iobyxmoadg.rgvfuqvkyq(zoijcleaowVarIobyxmoadg, zoijcleaowVar2, j13);
        this.f10498ppxfxbqfkf.put(ojitshcjhnVarRgvfuqvkyq, ppxfxbqfkfVar);
        gtknphoqwx();
        return ojitshcjhnVarRgvfuqvkyq;
    }

    public int oxmwwwfdhm() {
        return this.f10500zoijcleaow.size();
    }

    public v2.cdpycssgdh pmvmpeiblj(int i13, int i14, m3.kcexrzcfyt kcexrzcfytVar) {
        y2.iobyxmoadg.iobyxmoadg(i13 >= 0 && i13 <= i14 && i14 <= oxmwwwfdhm());
        this.f10489btonecajqb = kcexrzcfytVar;
        zynmafqrjb(i13, i14);
        return dxjokdxxww();
    }

    public m3.kcexrzcfyt vdvldrhtss() {
        return this.f10489btonecajqb;
    }

    public v2.cdpycssgdh yadqdtsiqt(int i13, int i14, List list) {
        y2.iobyxmoadg.iobyxmoadg(i13 >= 0 && i13 <= i14 && i14 <= oxmwwwfdhm());
        y2.iobyxmoadg.iobyxmoadg(list.size() == i14 - i13);
        for (int i15 = i13; i15 < i14; i15++) {
            ((ppxfxbqfkf) this.f10500zoijcleaow.get(i15)).f10504iobyxmoadg.btonecajqb((v2.kcexrzcfyt) list.get(i15 - i13));
        }
        return dxjokdxxww();
    }

    public boolean zdlpuopuiu() {
        return this.f10493gtknphoqwx;
    }
}
