package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg implements zdlpuopuiu.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    Runnable f13009eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    final boolean f13010gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private u1.eablkybsjg f13011iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    final zdlpuopuiu f13012lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f13013nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final ArrayList f13014ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final InterfaceC0181iobyxmoadg f13015wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final ArrayList f13016zoijcleaow;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    interface InterfaceC0181iobyxmoadg {
        void eablkybsjg(int i13, int i14, Object obj);

        RecyclerView.iozdgvuglv gxszxtbevo(int i13);

        void iobyxmoadg(int i13, int i14);

        void lqeggnwhkg(int i13, int i14);

        void nufgyqmvbu(int i13, int i14);

        void ppxfxbqfkf(zoijcleaow zoijcleaowVar);

        void wkgbmnqykc(int i13, int i14);

        void zoijcleaow(zoijcleaow zoijcleaowVar);
    }

    static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f13017iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        Object f13018ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f13019wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f13020zoijcleaow;

        zoijcleaow(int i13, int i14, int i15, Object obj) {
            this.f13017iobyxmoadg = i13;
            this.f13020zoijcleaow = i14;
            this.f13019wkgbmnqykc = i15;
            this.f13018ppxfxbqfkf = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            int i13 = this.f13017iobyxmoadg;
            if (i13 != zoijcleaowVar.f13017iobyxmoadg) {
                return false;
            }
            if (i13 == 8 && Math.abs(this.f13019wkgbmnqykc - this.f13020zoijcleaow) == 1 && this.f13019wkgbmnqykc == zoijcleaowVar.f13020zoijcleaow && this.f13020zoijcleaow == zoijcleaowVar.f13019wkgbmnqykc) {
                return true;
            }
            if (this.f13019wkgbmnqykc != zoijcleaowVar.f13019wkgbmnqykc || this.f13020zoijcleaow != zoijcleaowVar.f13020zoijcleaow) {
                return false;
            }
            Object obj2 = this.f13018ppxfxbqfkf;
            if (obj2 != null) {
                if (!obj2.equals(zoijcleaowVar.f13018ppxfxbqfkf)) {
                    return false;
                }
            } else if (zoijcleaowVar.f13018ppxfxbqfkf != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f13017iobyxmoadg * 31) + this.f13020zoijcleaow) * 31) + this.f13019wkgbmnqykc;
        }

        String iobyxmoadg() {
            int i13 = this.f13017iobyxmoadg;
            if (i13 == 1) {
                return "add";
            }
            if (i13 == 2) {
                return "rm";
            }
            if (i13 != 4) {
                return i13 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + iobyxmoadg() + ",s:" + this.f13020zoijcleaow + "c:" + this.f13019wkgbmnqykc + ",p:" + this.f13018ppxfxbqfkf + "]";
        }
    }

    iobyxmoadg(InterfaceC0181iobyxmoadg interfaceC0181iobyxmoadg) {
        this(interfaceC0181iobyxmoadg, false);
    }

    private void gtknphoqwx(zoijcleaow zoijcleaowVar) {
        int i13;
        int i14 = zoijcleaowVar.f13017iobyxmoadg;
        if (i14 == 1 || i14 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iLereixgezr = lereixgezr(zoijcleaowVar.f13020zoijcleaow, i14);
        int i15 = zoijcleaowVar.f13020zoijcleaow;
        int i16 = zoijcleaowVar.f13017iobyxmoadg;
        if (i16 == 2) {
            i13 = 0;
        } else {
            if (i16 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + zoijcleaowVar);
            }
            i13 = 1;
        }
        int i17 = 1;
        for (int i18 = 1; i18 < zoijcleaowVar.f13019wkgbmnqykc; i18++) {
            int iLereixgezr2 = lereixgezr(zoijcleaowVar.f13020zoijcleaow + (i13 * i18), zoijcleaowVar.f13017iobyxmoadg);
            int i19 = zoijcleaowVar.f13017iobyxmoadg;
            if (i19 == 2 ? iLereixgezr2 != iLereixgezr : !(i19 == 4 && iLereixgezr2 == iLereixgezr + 1)) {
                zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadg(i19, iLereixgezr, i17, zoijcleaowVar.f13018ppxfxbqfkf);
                draadjrbmk(zoijcleaowVarIobyxmoadg, i15);
                zoijcleaow(zoijcleaowVarIobyxmoadg);
                if (zoijcleaowVar.f13017iobyxmoadg == 4) {
                    i15 += i17;
                }
                i17 = 1;
                iLereixgezr = iLereixgezr2;
            } else {
                i17++;
            }
        }
        Object obj = zoijcleaowVar.f13018ppxfxbqfkf;
        zoijcleaow(zoijcleaowVar);
        if (i17 > 0) {
            zoijcleaow zoijcleaowVarIobyxmoadg2 = iobyxmoadg(zoijcleaowVar.f13017iobyxmoadg, iLereixgezr, i17, obj);
            draadjrbmk(zoijcleaowVarIobyxmoadg2, i15);
            zoijcleaow(zoijcleaowVarIobyxmoadg2);
        }
    }

    private void gxszxtbevo(zoijcleaow zoijcleaowVar) {
        boolean z13;
        byte b13;
        int i13 = zoijcleaowVar.f13020zoijcleaow;
        int i14 = zoijcleaowVar.f13019wkgbmnqykc + i13;
        byte b14 = -1;
        int i15 = i13;
        int i16 = 0;
        while (i15 < i14) {
            if (this.f13015wkgbmnqykc.gxszxtbevo(i15) != null || nufgyqmvbu(i15)) {
                if (b14 == 0) {
                    gtknphoqwx(iobyxmoadg(2, i13, i16, null));
                    z13 = true;
                } else {
                    z13 = false;
                }
                b13 = 1;
            } else {
                if (b14 == 1) {
                    jyumaefscl(iobyxmoadg(2, i13, i16, null));
                    z13 = true;
                } else {
                    z13 = false;
                }
                b13 = 0;
            }
            if (z13) {
                i15 -= i16;
                i14 -= i16;
                i16 = 1;
            } else {
                i16++;
            }
            i15++;
            b14 = b13;
        }
        if (i16 != zoijcleaowVar.f13019wkgbmnqykc) {
            zoijcleaow(zoijcleaowVar);
            zoijcleaowVar = iobyxmoadg(2, i13, i16, null);
        }
        if (b14 == 0) {
            gtknphoqwx(zoijcleaowVar);
        } else {
            jyumaefscl(zoijcleaowVar);
        }
    }

    private void jyumaefscl(zoijcleaow zoijcleaowVar) {
        this.f13014ppxfxbqfkf.add(zoijcleaowVar);
        int i13 = zoijcleaowVar.f13017iobyxmoadg;
        if (i13 == 1) {
            this.f13015wkgbmnqykc.lqeggnwhkg(zoijcleaowVar.f13020zoijcleaow, zoijcleaowVar.f13019wkgbmnqykc);
            return;
        }
        if (i13 == 2) {
            this.f13015wkgbmnqykc.wkgbmnqykc(zoijcleaowVar.f13020zoijcleaow, zoijcleaowVar.f13019wkgbmnqykc);
            return;
        }
        if (i13 == 4) {
            this.f13015wkgbmnqykc.eablkybsjg(zoijcleaowVar.f13020zoijcleaow, zoijcleaowVar.f13019wkgbmnqykc, zoijcleaowVar.f13018ppxfxbqfkf);
        } else {
            if (i13 == 8) {
                this.f13015wkgbmnqykc.iobyxmoadg(zoijcleaowVar.f13020zoijcleaow, zoijcleaowVar.f13019wkgbmnqykc);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + zoijcleaowVar);
        }
    }

    private int lereixgezr(int i13, int i14) {
        int i15;
        int i16;
        for (int size = this.f13014ppxfxbqfkf.size() - 1; size >= 0; size--) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f13014ppxfxbqfkf.get(size);
            int i17 = zoijcleaowVar.f13017iobyxmoadg;
            if (i17 == 8) {
                int i18 = zoijcleaowVar.f13020zoijcleaow;
                int i19 = zoijcleaowVar.f13019wkgbmnqykc;
                if (i18 < i19) {
                    i16 = i18;
                    i15 = i19;
                } else {
                    i15 = i18;
                    i16 = i19;
                }
                if (i13 < i16 || i13 > i15) {
                    if (i13 < i18) {
                        if (i14 == 1) {
                            zoijcleaowVar.f13020zoijcleaow = i18 + 1;
                            zoijcleaowVar.f13019wkgbmnqykc = i19 + 1;
                        } else if (i14 == 2) {
                            zoijcleaowVar.f13020zoijcleaow = i18 - 1;
                            zoijcleaowVar.f13019wkgbmnqykc = i19 - 1;
                        }
                    }
                } else if (i16 == i18) {
                    if (i14 == 1) {
                        zoijcleaowVar.f13019wkgbmnqykc = i19 + 1;
                    } else if (i14 == 2) {
                        zoijcleaowVar.f13019wkgbmnqykc = i19 - 1;
                    }
                    i13++;
                } else {
                    if (i14 == 1) {
                        zoijcleaowVar.f13020zoijcleaow = i18 + 1;
                    } else if (i14 == 2) {
                        zoijcleaowVar.f13020zoijcleaow = i18 - 1;
                    }
                    i13--;
                }
            } else {
                int i23 = zoijcleaowVar.f13020zoijcleaow;
                if (i23 <= i13) {
                    if (i17 == 1) {
                        i13 -= zoijcleaowVar.f13019wkgbmnqykc;
                    } else if (i17 == 2) {
                        i13 += zoijcleaowVar.f13019wkgbmnqykc;
                    }
                } else if (i14 == 1) {
                    zoijcleaowVar.f13020zoijcleaow = i23 + 1;
                } else if (i14 == 2) {
                    zoijcleaowVar.f13020zoijcleaow = i23 - 1;
                }
            }
        }
        for (int size2 = this.f13014ppxfxbqfkf.size() - 1; size2 >= 0; size2--) {
            zoijcleaow zoijcleaowVar2 = (zoijcleaow) this.f13014ppxfxbqfkf.get(size2);
            if (zoijcleaowVar2.f13017iobyxmoadg == 8) {
                int i24 = zoijcleaowVar2.f13019wkgbmnqykc;
                if (i24 == zoijcleaowVar2.f13020zoijcleaow || i24 < 0) {
                    this.f13014ppxfxbqfkf.remove(size2);
                    zoijcleaow(zoijcleaowVar2);
                }
            } else if (zoijcleaowVar2.f13019wkgbmnqykc <= 0) {
                this.f13014ppxfxbqfkf.remove(size2);
                zoijcleaow(zoijcleaowVar2);
            }
        }
        return i13;
    }

    private void lqeggnwhkg(zoijcleaow zoijcleaowVar) {
        int i13 = zoijcleaowVar.f13020zoijcleaow;
        int i14 = zoijcleaowVar.f13019wkgbmnqykc + i13;
        int i15 = 0;
        byte b13 = -1;
        int i16 = i13;
        while (i13 < i14) {
            if (this.f13015wkgbmnqykc.gxszxtbevo(i13) != null || nufgyqmvbu(i13)) {
                if (b13 == 0) {
                    gtknphoqwx(iobyxmoadg(4, i16, i15, zoijcleaowVar.f13018ppxfxbqfkf));
                    i16 = i13;
                    i15 = 0;
                }
                b13 = 1;
            } else {
                if (b13 == 1) {
                    jyumaefscl(iobyxmoadg(4, i16, i15, zoijcleaowVar.f13018ppxfxbqfkf));
                    i16 = i13;
                    i15 = 0;
                }
                b13 = 0;
            }
            i15++;
            i13++;
        }
        if (i15 != zoijcleaowVar.f13019wkgbmnqykc) {
            Object obj = zoijcleaowVar.f13018ppxfxbqfkf;
            zoijcleaow(zoijcleaowVar);
            zoijcleaowVar = iobyxmoadg(4, i16, i15, obj);
        }
        if (b13 == 0) {
            gtknphoqwx(zoijcleaowVar);
        } else {
            jyumaefscl(zoijcleaowVar);
        }
    }

    private boolean nufgyqmvbu(int i13) {
        int size = this.f13014ppxfxbqfkf.size();
        for (int i14 = 0; i14 < size; i14++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f13014ppxfxbqfkf.get(i14);
            int i15 = zoijcleaowVar.f13017iobyxmoadg;
            if (i15 == 8) {
                if (agtfadlqog(zoijcleaowVar.f13019wkgbmnqykc, i14 + 1) == i13) {
                    return true;
                }
            } else if (i15 == 1) {
                int i16 = zoijcleaowVar.f13020zoijcleaow;
                int i17 = zoijcleaowVar.f13019wkgbmnqykc + i16;
                while (i16 < i17) {
                    if (agtfadlqog(i16, i14 + 1) == i13) {
                        return true;
                    }
                    i16++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
        jyumaefscl(zoijcleaowVar);
    }

    private void wkgbmnqykc(zoijcleaow zoijcleaowVar) {
        jyumaefscl(zoijcleaowVar);
    }

    int agtfadlqog(int i13, int i14) {
        int size = this.f13014ppxfxbqfkf.size();
        while (i14 < size) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f13014ppxfxbqfkf.get(i14);
            int i15 = zoijcleaowVar.f13017iobyxmoadg;
            if (i15 == 8) {
                int i16 = zoijcleaowVar.f13020zoijcleaow;
                if (i16 == i13) {
                    i13 = zoijcleaowVar.f13019wkgbmnqykc;
                } else {
                    if (i16 < i13) {
                        i13--;
                    }
                    if (zoijcleaowVar.f13019wkgbmnqykc <= i13) {
                        i13++;
                    }
                }
            } else {
                int i17 = zoijcleaowVar.f13020zoijcleaow;
                if (i17 > i13) {
                    continue;
                } else if (i15 == 2) {
                    int i18 = zoijcleaowVar.f13019wkgbmnqykc;
                    if (i13 < i17 + i18) {
                        return -1;
                    }
                    i13 -= i18;
                } else if (i15 == 1) {
                    i13 += zoijcleaowVar.f13019wkgbmnqykc;
                }
            }
            i14++;
        }
        return i13;
    }

    void btonecajqb() {
        dxjokdxxww();
        int size = this.f13016zoijcleaow.size();
        for (int i13 = 0; i13 < size; i13++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f13016zoijcleaow.get(i13);
            int i14 = zoijcleaowVar.f13017iobyxmoadg;
            if (i14 == 1) {
                this.f13015wkgbmnqykc.ppxfxbqfkf(zoijcleaowVar);
                this.f13015wkgbmnqykc.lqeggnwhkg(zoijcleaowVar.f13020zoijcleaow, zoijcleaowVar.f13019wkgbmnqykc);
            } else if (i14 == 2) {
                this.f13015wkgbmnqykc.ppxfxbqfkf(zoijcleaowVar);
                this.f13015wkgbmnqykc.nufgyqmvbu(zoijcleaowVar.f13020zoijcleaow, zoijcleaowVar.f13019wkgbmnqykc);
            } else if (i14 == 4) {
                this.f13015wkgbmnqykc.ppxfxbqfkf(zoijcleaowVar);
                this.f13015wkgbmnqykc.eablkybsjg(zoijcleaowVar.f13020zoijcleaow, zoijcleaowVar.f13019wkgbmnqykc, zoijcleaowVar.f13018ppxfxbqfkf);
            } else if (i14 == 8) {
                this.f13015wkgbmnqykc.ppxfxbqfkf(zoijcleaowVar);
                this.f13015wkgbmnqykc.iobyxmoadg(zoijcleaowVar.f13020zoijcleaow, zoijcleaowVar.f13019wkgbmnqykc);
            }
            Runnable runnable = this.f13009eablkybsjg;
            if (runnable != null) {
                runnable.run();
            }
        }
        cqumvgiudr(this.f13016zoijcleaow);
        this.f13013nufgyqmvbu = 0;
    }

    void cqumvgiudr(List list) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            zoijcleaow((zoijcleaow) list.get(i13));
        }
        list.clear();
    }

    void draadjrbmk(zoijcleaow zoijcleaowVar, int i13) {
        this.f13015wkgbmnqykc.zoijcleaow(zoijcleaowVar);
        int i14 = zoijcleaowVar.f13017iobyxmoadg;
        if (i14 == 2) {
            this.f13015wkgbmnqykc.nufgyqmvbu(i13, zoijcleaowVar.f13019wkgbmnqykc);
        } else {
            if (i14 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f13015wkgbmnqykc.eablkybsjg(i13, zoijcleaowVar.f13019wkgbmnqykc, zoijcleaowVar.f13018ppxfxbqfkf);
        }
    }

    void dxjokdxxww() {
        int size = this.f13014ppxfxbqfkf.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f13015wkgbmnqykc.ppxfxbqfkf((zoijcleaow) this.f13014ppxfxbqfkf.get(i13));
        }
        cqumvgiudr(this.f13014ppxfxbqfkf);
        this.f13013nufgyqmvbu = 0;
    }

    public int eablkybsjg(int i13) {
        int size = this.f13016zoijcleaow.size();
        for (int i14 = 0; i14 < size; i14++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f13016zoijcleaow.get(i14);
            int i15 = zoijcleaowVar.f13017iobyxmoadg;
            if (i15 != 1) {
                if (i15 == 2) {
                    int i16 = zoijcleaowVar.f13020zoijcleaow;
                    if (i16 <= i13) {
                        int i17 = zoijcleaowVar.f13019wkgbmnqykc;
                        if (i16 + i17 > i13) {
                            return -1;
                        }
                        i13 -= i17;
                    } else {
                        continue;
                    }
                } else if (i15 == 8) {
                    int i18 = zoijcleaowVar.f13020zoijcleaow;
                    if (i18 == i13) {
                        i13 = zoijcleaowVar.f13019wkgbmnqykc;
                    } else {
                        if (i18 < i13) {
                            i13--;
                        }
                        if (zoijcleaowVar.f13019wkgbmnqykc <= i13) {
                            i13++;
                        }
                    }
                }
            } else if (zoijcleaowVar.f13020zoijcleaow <= i13) {
                i13 += zoijcleaowVar.f13019wkgbmnqykc;
            }
        }
        return i13;
    }

    void esjtqupxsv() {
        cqumvgiudr(this.f13016zoijcleaow);
        cqumvgiudr(this.f13014ppxfxbqfkf);
        this.f13013nufgyqmvbu = 0;
    }

    @Override // androidx.recyclerview.widget.zdlpuopuiu.iobyxmoadg
    public zoijcleaow iobyxmoadg(int i13, int i14, int i15, Object obj) {
        zoijcleaow zoijcleaowVar = (zoijcleaow) this.f13011iobyxmoadg.zoijcleaow();
        if (zoijcleaowVar == null) {
            return new zoijcleaow(i13, i14, i15, obj);
        }
        zoijcleaowVar.f13017iobyxmoadg = i13;
        zoijcleaowVar.f13020zoijcleaow = i14;
        zoijcleaowVar.f13019wkgbmnqykc = i15;
        zoijcleaowVar.f13018ppxfxbqfkf = obj;
        return zoijcleaowVar;
    }

    void iwizpuwonk() {
        this.f13012lqeggnwhkg.zoijcleaow(this.f13016zoijcleaow);
        int size = this.f13016zoijcleaow.size();
        for (int i13 = 0; i13 < size; i13++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f13016zoijcleaow.get(i13);
            int i14 = zoijcleaowVar.f13017iobyxmoadg;
            if (i14 == 1) {
                ppxfxbqfkf(zoijcleaowVar);
            } else if (i14 == 2) {
                gxszxtbevo(zoijcleaowVar);
            } else if (i14 == 4) {
                lqeggnwhkg(zoijcleaowVar);
            } else if (i14 == 8) {
                wkgbmnqykc(zoijcleaowVar);
            }
            Runnable runnable = this.f13009eablkybsjg;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f13016zoijcleaow.clear();
    }

    boolean kcexrzcfyt(int i13, int i14) {
        if (i14 < 1) {
            return false;
        }
        this.f13016zoijcleaow.add(iobyxmoadg(1, i13, i14, null));
        this.f13013nufgyqmvbu |= 1;
        return this.f13016zoijcleaow.size() == 1;
    }

    boolean ojitshcjhn(int i13) {
        return (i13 & this.f13013nufgyqmvbu) != 0;
    }

    boolean oxmwwwfdhm(int i13, int i14, Object obj) {
        if (i14 < 1) {
            return false;
        }
        this.f13016zoijcleaow.add(iobyxmoadg(4, i13, i14, obj));
        this.f13013nufgyqmvbu |= 4;
        return this.f13016zoijcleaow.size() == 1;
    }

    boolean rgvfuqvkyq() {
        return this.f13016zoijcleaow.size() > 0;
    }

    boolean vdvldrhtss() {
        return (this.f13014ppxfxbqfkf.isEmpty() || this.f13016zoijcleaow.isEmpty()) ? false : true;
    }

    int wflxmlrfwp(int i13) {
        return agtfadlqog(i13, 0);
    }

    boolean yggfygwlhe(int i13, int i14) {
        if (i14 < 1) {
            return false;
        }
        this.f13016zoijcleaow.add(iobyxmoadg(2, i13, i14, null));
        this.f13013nufgyqmvbu |= 2;
        return this.f13016zoijcleaow.size() == 1;
    }

    boolean zdlpuopuiu(int i13, int i14, int i15) {
        if (i13 == i14) {
            return false;
        }
        if (i15 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f13016zoijcleaow.add(iobyxmoadg(8, i13, i14, null));
        this.f13013nufgyqmvbu |= 8;
        return this.f13016zoijcleaow.size() == 1;
    }

    @Override // androidx.recyclerview.widget.zdlpuopuiu.iobyxmoadg
    public void zoijcleaow(zoijcleaow zoijcleaowVar) {
        if (this.f13010gxszxtbevo) {
            return;
        }
        zoijcleaowVar.f13018ppxfxbqfkf = null;
        this.f13011iobyxmoadg.iobyxmoadg(zoijcleaowVar);
    }

    iobyxmoadg(InterfaceC0181iobyxmoadg interfaceC0181iobyxmoadg, boolean z13) {
        this.f13011iobyxmoadg = new u1.gxszxtbevo(30);
        this.f13016zoijcleaow = new ArrayList();
        this.f13014ppxfxbqfkf = new ArrayList();
        this.f13013nufgyqmvbu = 0;
        this.f13015wkgbmnqykc = interfaceC0181iobyxmoadg;
        this.f13010gxszxtbevo = z13;
        this.f13012lqeggnwhkg = new zdlpuopuiu(this);
    }
}
