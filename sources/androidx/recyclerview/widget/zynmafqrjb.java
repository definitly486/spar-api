package androidx.recyclerview.widget;

import androidx.collection.jztzpxfvev;

/* JADX INFO: loaded from: classes2.dex */
class zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final jztzpxfvev f13156iobyxmoadg = new jztzpxfvev();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final androidx.collection.esjtqupxsv f13157zoijcleaow = new androidx.collection.esjtqupxsv();

    static class iobyxmoadg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        static u1.eablkybsjg f13158wkgbmnqykc = new u1.gxszxtbevo(20);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f13159iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        RecyclerView.wflxmlrfwp.ppxfxbqfkf f13160ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        RecyclerView.wflxmlrfwp.ppxfxbqfkf f13161zoijcleaow;

        private iobyxmoadg() {
        }

        static void iobyxmoadg() {
            while (f13158wkgbmnqykc.zoijcleaow() != null) {
            }
        }

        static void ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
            iobyxmoadgVar.f13159iobyxmoadg = 0;
            iobyxmoadgVar.f13161zoijcleaow = null;
            iobyxmoadgVar.f13160ppxfxbqfkf = null;
            f13158wkgbmnqykc.iobyxmoadg(iobyxmoadgVar);
        }

        static iobyxmoadg zoijcleaow() {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) f13158wkgbmnqykc.zoijcleaow();
            return iobyxmoadgVar == null ? new iobyxmoadg() : iobyxmoadgVar;
        }
    }

    interface zoijcleaow {
        void iobyxmoadg(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2);

        void ppxfxbqfkf(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2);

        void wkgbmnqykc(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2);

        void zoijcleaow(RecyclerView.iozdgvuglv iozdgvuglvVar);
    }

    zynmafqrjb() {
    }

    private RecyclerView.wflxmlrfwp.ppxfxbqfkf draadjrbmk(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13) {
        iobyxmoadg iobyxmoadgVar;
        RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar;
        int iWkgbmnqykc = this.f13156iobyxmoadg.wkgbmnqykc(iozdgvuglvVar);
        if (iWkgbmnqykc >= 0 && (iobyxmoadgVar = (iobyxmoadg) this.f13156iobyxmoadg.gtknphoqwx(iWkgbmnqykc)) != null) {
            int i14 = iobyxmoadgVar.f13159iobyxmoadg;
            if ((i14 & i13) != 0) {
                int i15 = (~i13) & i14;
                iobyxmoadgVar.f13159iobyxmoadg = i15;
                if (i13 == 4) {
                    ppxfxbqfkfVar = iobyxmoadgVar.f13161zoijcleaow;
                } else {
                    if (i13 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    ppxfxbqfkfVar = iobyxmoadgVar.f13160ppxfxbqfkf;
                }
                if ((i15 & 12) == 0) {
                    this.f13156iobyxmoadg.dxjokdxxww(iWkgbmnqykc);
                    iobyxmoadg.ppxfxbqfkf(iobyxmoadgVar);
                }
                return ppxfxbqfkfVar;
            }
        }
        return null;
    }

    RecyclerView.wflxmlrfwp.ppxfxbqfkf agtfadlqog(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        return draadjrbmk(iozdgvuglvVar, 4);
    }

    void btonecajqb() {
        iobyxmoadg.iobyxmoadg();
    }

    boolean dxjokdxxww(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f13156iobyxmoadg.get(iozdgvuglvVar);
        return (iobyxmoadgVar == null || (iobyxmoadgVar.f13159iobyxmoadg & 4) == 0) ? false : true;
    }

    void eablkybsjg(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar) {
        iobyxmoadg iobyxmoadgVarZoijcleaow = (iobyxmoadg) this.f13156iobyxmoadg.get(iozdgvuglvVar);
        if (iobyxmoadgVarZoijcleaow == null) {
            iobyxmoadgVarZoijcleaow = iobyxmoadg.zoijcleaow();
            this.f13156iobyxmoadg.put(iozdgvuglvVar, iobyxmoadgVarZoijcleaow);
        }
        iobyxmoadgVarZoijcleaow.f13161zoijcleaow = ppxfxbqfkfVar;
        iobyxmoadgVarZoijcleaow.f13159iobyxmoadg |= 4;
    }

    public void gtknphoqwx(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        rgvfuqvkyq(iozdgvuglvVar);
    }

    void gxszxtbevo() {
        this.f13156iobyxmoadg.clear();
        this.f13157zoijcleaow.iobyxmoadg();
    }

    void iobyxmoadg(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar) {
        iobyxmoadg iobyxmoadgVarZoijcleaow = (iobyxmoadg) this.f13156iobyxmoadg.get(iozdgvuglvVar);
        if (iobyxmoadgVarZoijcleaow == null) {
            iobyxmoadgVarZoijcleaow = iobyxmoadg.zoijcleaow();
            this.f13156iobyxmoadg.put(iozdgvuglvVar, iobyxmoadgVarZoijcleaow);
        }
        iobyxmoadgVarZoijcleaow.f13159iobyxmoadg |= 2;
        iobyxmoadgVarZoijcleaow.f13161zoijcleaow = ppxfxbqfkfVar;
    }

    RecyclerView.iozdgvuglv lqeggnwhkg(long j13) {
        return (RecyclerView.iozdgvuglv) this.f13157zoijcleaow.wkgbmnqykc(j13);
    }

    boolean nufgyqmvbu(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f13156iobyxmoadg.get(iozdgvuglvVar);
        return (iobyxmoadgVar == null || (iobyxmoadgVar.f13159iobyxmoadg & 1) == 0) ? false : true;
    }

    void ojitshcjhn(zoijcleaow zoijcleaowVar) {
        for (int size = this.f13156iobyxmoadg.size() - 1; size >= 0; size--) {
            RecyclerView.iozdgvuglv iozdgvuglvVar = (RecyclerView.iozdgvuglv) this.f13156iobyxmoadg.gxszxtbevo(size);
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f13156iobyxmoadg.dxjokdxxww(size);
            int i13 = iobyxmoadgVar.f13159iobyxmoadg;
            if ((i13 & 3) == 3) {
                zoijcleaowVar.zoijcleaow(iozdgvuglvVar);
            } else if ((i13 & 1) != 0) {
                RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar.f13161zoijcleaow;
                if (ppxfxbqfkfVar == null) {
                    zoijcleaowVar.zoijcleaow(iozdgvuglvVar);
                } else {
                    zoijcleaowVar.ppxfxbqfkf(iozdgvuglvVar, ppxfxbqfkfVar, iobyxmoadgVar.f13160ppxfxbqfkf);
                }
            } else if ((i13 & 14) == 14) {
                zoijcleaowVar.iobyxmoadg(iozdgvuglvVar, iobyxmoadgVar.f13161zoijcleaow, iobyxmoadgVar.f13160ppxfxbqfkf);
            } else if ((i13 & 12) == 12) {
                zoijcleaowVar.wkgbmnqykc(iozdgvuglvVar, iobyxmoadgVar.f13161zoijcleaow, iobyxmoadgVar.f13160ppxfxbqfkf);
            } else if ((i13 & 4) != 0) {
                zoijcleaowVar.ppxfxbqfkf(iozdgvuglvVar, iobyxmoadgVar.f13161zoijcleaow, null);
            } else if ((i13 & 8) != 0) {
                zoijcleaowVar.iobyxmoadg(iozdgvuglvVar, iobyxmoadgVar.f13161zoijcleaow, iobyxmoadgVar.f13160ppxfxbqfkf);
            }
            iobyxmoadg.ppxfxbqfkf(iobyxmoadgVar);
        }
    }

    void ppxfxbqfkf(long j13, RecyclerView.iozdgvuglv iozdgvuglvVar) {
        this.f13157zoijcleaow.nufgyqmvbu(j13, iozdgvuglvVar);
    }

    void rgvfuqvkyq(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f13156iobyxmoadg.get(iozdgvuglvVar);
        if (iobyxmoadgVar == null) {
            return;
        }
        iobyxmoadgVar.f13159iobyxmoadg &= -2;
    }

    void vdvldrhtss(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        for (int iWflxmlrfwp = this.f13157zoijcleaow.wflxmlrfwp() - 1; iWflxmlrfwp >= 0; iWflxmlrfwp--) {
            if (iozdgvuglvVar == this.f13157zoijcleaow.agtfadlqog(iWflxmlrfwp)) {
                this.f13157zoijcleaow.draadjrbmk(iWflxmlrfwp);
                break;
            }
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f13156iobyxmoadg.remove(iozdgvuglvVar);
        if (iobyxmoadgVar != null) {
            iobyxmoadg.ppxfxbqfkf(iobyxmoadgVar);
        }
    }

    RecyclerView.wflxmlrfwp.ppxfxbqfkf wflxmlrfwp(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        return draadjrbmk(iozdgvuglvVar, 8);
    }

    void wkgbmnqykc(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar) {
        iobyxmoadg iobyxmoadgVarZoijcleaow = (iobyxmoadg) this.f13156iobyxmoadg.get(iozdgvuglvVar);
        if (iobyxmoadgVarZoijcleaow == null) {
            iobyxmoadgVarZoijcleaow = iobyxmoadg.zoijcleaow();
            this.f13156iobyxmoadg.put(iozdgvuglvVar, iobyxmoadgVarZoijcleaow);
        }
        iobyxmoadgVarZoijcleaow.f13160ppxfxbqfkf = ppxfxbqfkfVar;
        iobyxmoadgVarZoijcleaow.f13159iobyxmoadg |= 8;
    }

    void zoijcleaow(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        iobyxmoadg iobyxmoadgVarZoijcleaow = (iobyxmoadg) this.f13156iobyxmoadg.get(iozdgvuglvVar);
        if (iobyxmoadgVarZoijcleaow == null) {
            iobyxmoadgVarZoijcleaow = iobyxmoadg.zoijcleaow();
            this.f13156iobyxmoadg.put(iozdgvuglvVar, iobyxmoadgVarZoijcleaow);
        }
        iobyxmoadgVarZoijcleaow.f13159iobyxmoadg |= 1;
    }
}
