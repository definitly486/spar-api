package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final iobyxmoadg f13154iobyxmoadg;

    interface iobyxmoadg {
        androidx.recyclerview.widget.iobyxmoadg.zoijcleaow iobyxmoadg(int i13, int i14, int i15, Object obj);

        void zoijcleaow(androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVar);
    }

    zdlpuopuiu(iobyxmoadg iobyxmoadgVar) {
        this.f13154iobyxmoadg = iobyxmoadgVar;
    }

    private int iobyxmoadg(List list) {
        boolean z13 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((androidx.recyclerview.widget.iobyxmoadg.zoijcleaow) list.get(size)).f13017iobyxmoadg != 8) {
                z13 = true;
            } else if (z13) {
                return size;
            }
        }
        return -1;
    }

    private void ppxfxbqfkf(List list, int i13, androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVar, int i14, androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVar2) {
        int i15 = zoijcleaowVar.f13019wkgbmnqykc;
        int i16 = zoijcleaowVar2.f13020zoijcleaow;
        int i17 = i15 < i16 ? -1 : 0;
        int i18 = zoijcleaowVar.f13020zoijcleaow;
        if (i18 < i16) {
            i17++;
        }
        if (i16 <= i18) {
            zoijcleaowVar.f13020zoijcleaow = i18 + zoijcleaowVar2.f13019wkgbmnqykc;
        }
        int i19 = zoijcleaowVar2.f13020zoijcleaow;
        if (i19 <= i15) {
            zoijcleaowVar.f13019wkgbmnqykc = i15 + zoijcleaowVar2.f13019wkgbmnqykc;
        }
        zoijcleaowVar2.f13020zoijcleaow = i19 + i17;
        list.set(i13, zoijcleaowVar2);
        list.set(i14, zoijcleaowVar);
    }

    private void wkgbmnqykc(List list, int i13, int i14) {
        androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVar = (androidx.recyclerview.widget.iobyxmoadg.zoijcleaow) list.get(i13);
        androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVar2 = (androidx.recyclerview.widget.iobyxmoadg.zoijcleaow) list.get(i14);
        int i15 = zoijcleaowVar2.f13017iobyxmoadg;
        if (i15 == 1) {
            ppxfxbqfkf(list, i13, zoijcleaowVar, i14, zoijcleaowVar2);
        } else if (i15 == 2) {
            eablkybsjg(list, i13, zoijcleaowVar, i14, zoijcleaowVar2);
        } else {
            if (i15 != 4) {
                return;
            }
            gxszxtbevo(list, i13, zoijcleaowVar, i14, zoijcleaowVar2);
        }
    }

    void eablkybsjg(List list, int i13, androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVar, int i14, androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVar2) {
        boolean z13;
        int i15 = zoijcleaowVar.f13020zoijcleaow;
        int i16 = zoijcleaowVar.f13019wkgbmnqykc;
        boolean z14 = false;
        if (i15 < i16) {
            if (zoijcleaowVar2.f13020zoijcleaow == i15 && zoijcleaowVar2.f13019wkgbmnqykc == i16 - i15) {
                z13 = false;
                z14 = true;
            } else {
                z13 = false;
            }
        } else if (zoijcleaowVar2.f13020zoijcleaow == i16 + 1 && zoijcleaowVar2.f13019wkgbmnqykc == i15 - i16) {
            z13 = true;
            z14 = true;
        } else {
            z13 = true;
        }
        int i17 = zoijcleaowVar2.f13020zoijcleaow;
        if (i16 < i17) {
            zoijcleaowVar2.f13020zoijcleaow = i17 - 1;
        } else {
            int i18 = zoijcleaowVar2.f13019wkgbmnqykc;
            if (i16 < i17 + i18) {
                zoijcleaowVar2.f13019wkgbmnqykc = i18 - 1;
                zoijcleaowVar.f13017iobyxmoadg = 2;
                zoijcleaowVar.f13019wkgbmnqykc = 1;
                if (zoijcleaowVar2.f13019wkgbmnqykc == 0) {
                    list.remove(i14);
                    this.f13154iobyxmoadg.zoijcleaow(zoijcleaowVar2);
                    return;
                }
                return;
            }
        }
        int i19 = zoijcleaowVar.f13020zoijcleaow;
        int i23 = zoijcleaowVar2.f13020zoijcleaow;
        androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVarIobyxmoadg = null;
        if (i19 <= i23) {
            zoijcleaowVar2.f13020zoijcleaow = i23 + 1;
        } else {
            int i24 = zoijcleaowVar2.f13019wkgbmnqykc;
            if (i19 < i23 + i24) {
                zoijcleaowVarIobyxmoadg = this.f13154iobyxmoadg.iobyxmoadg(2, i19 + 1, (i23 + i24) - i19, null);
                zoijcleaowVar2.f13019wkgbmnqykc = zoijcleaowVar.f13020zoijcleaow - zoijcleaowVar2.f13020zoijcleaow;
            }
        }
        if (z14) {
            list.set(i13, zoijcleaowVar2);
            list.remove(i14);
            this.f13154iobyxmoadg.zoijcleaow(zoijcleaowVar);
            return;
        }
        if (z13) {
            if (zoijcleaowVarIobyxmoadg != null) {
                int i25 = zoijcleaowVar.f13020zoijcleaow;
                if (i25 > zoijcleaowVarIobyxmoadg.f13020zoijcleaow) {
                    zoijcleaowVar.f13020zoijcleaow = i25 - zoijcleaowVarIobyxmoadg.f13019wkgbmnqykc;
                }
                int i26 = zoijcleaowVar.f13019wkgbmnqykc;
                if (i26 > zoijcleaowVarIobyxmoadg.f13020zoijcleaow) {
                    zoijcleaowVar.f13019wkgbmnqykc = i26 - zoijcleaowVarIobyxmoadg.f13019wkgbmnqykc;
                }
            }
            int i27 = zoijcleaowVar.f13020zoijcleaow;
            if (i27 > zoijcleaowVar2.f13020zoijcleaow) {
                zoijcleaowVar.f13020zoijcleaow = i27 - zoijcleaowVar2.f13019wkgbmnqykc;
            }
            int i28 = zoijcleaowVar.f13019wkgbmnqykc;
            if (i28 > zoijcleaowVar2.f13020zoijcleaow) {
                zoijcleaowVar.f13019wkgbmnqykc = i28 - zoijcleaowVar2.f13019wkgbmnqykc;
            }
        } else {
            if (zoijcleaowVarIobyxmoadg != null) {
                int i29 = zoijcleaowVar.f13020zoijcleaow;
                if (i29 >= zoijcleaowVarIobyxmoadg.f13020zoijcleaow) {
                    zoijcleaowVar.f13020zoijcleaow = i29 - zoijcleaowVarIobyxmoadg.f13019wkgbmnqykc;
                }
                int i33 = zoijcleaowVar.f13019wkgbmnqykc;
                if (i33 >= zoijcleaowVarIobyxmoadg.f13020zoijcleaow) {
                    zoijcleaowVar.f13019wkgbmnqykc = i33 - zoijcleaowVarIobyxmoadg.f13019wkgbmnqykc;
                }
            }
            int i34 = zoijcleaowVar.f13020zoijcleaow;
            if (i34 >= zoijcleaowVar2.f13020zoijcleaow) {
                zoijcleaowVar.f13020zoijcleaow = i34 - zoijcleaowVar2.f13019wkgbmnqykc;
            }
            int i35 = zoijcleaowVar.f13019wkgbmnqykc;
            if (i35 >= zoijcleaowVar2.f13020zoijcleaow) {
                zoijcleaowVar.f13019wkgbmnqykc = i35 - zoijcleaowVar2.f13019wkgbmnqykc;
            }
        }
        list.set(i13, zoijcleaowVar2);
        if (zoijcleaowVar.f13020zoijcleaow != zoijcleaowVar.f13019wkgbmnqykc) {
            list.set(i14, zoijcleaowVar);
        } else {
            list.remove(i14);
        }
        if (zoijcleaowVarIobyxmoadg != null) {
            list.add(i13, zoijcleaowVarIobyxmoadg);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    void gxszxtbevo(List list, int i13, androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVar, int i14, androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVar2) {
        androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVarIobyxmoadg;
        int i15;
        int i16;
        int i17;
        int i18 = zoijcleaowVar.f13019wkgbmnqykc;
        int i19 = zoijcleaowVar2.f13020zoijcleaow;
        androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVarIobyxmoadg2 = null;
        if (i18 >= i19) {
            int i23 = zoijcleaowVar2.f13019wkgbmnqykc;
            if (i18 < i19 + i23) {
                zoijcleaowVar2.f13019wkgbmnqykc = i23 - 1;
                zoijcleaowVarIobyxmoadg = this.f13154iobyxmoadg.iobyxmoadg(4, zoijcleaowVar.f13020zoijcleaow, 1, zoijcleaowVar2.f13018ppxfxbqfkf);
            }
            i15 = zoijcleaowVar.f13020zoijcleaow;
            i16 = zoijcleaowVar2.f13020zoijcleaow;
            if (i15 <= i16) {
                zoijcleaowVar2.f13020zoijcleaow = i16 + 1;
            } else {
                i17 = zoijcleaowVar2.f13019wkgbmnqykc;
                if (i15 < i16 + i17) {
                    int i24 = (i16 + i17) - i15;
                    zoijcleaowVarIobyxmoadg2 = this.f13154iobyxmoadg.iobyxmoadg(4, i15 + 1, i24, zoijcleaowVar2.f13018ppxfxbqfkf);
                    zoijcleaowVar2.f13019wkgbmnqykc -= i24;
                }
            }
            list.set(i14, zoijcleaowVar);
            if (zoijcleaowVar2.f13019wkgbmnqykc > 0) {
                list.set(i13, zoijcleaowVar2);
            } else {
                list.remove(i13);
                this.f13154iobyxmoadg.zoijcleaow(zoijcleaowVar2);
            }
            if (zoijcleaowVarIobyxmoadg != null) {
                list.add(i13, zoijcleaowVarIobyxmoadg);
            }
            if (zoijcleaowVarIobyxmoadg2 != null) {
                list.add(i13, zoijcleaowVarIobyxmoadg2);
            }
        }
        zoijcleaowVar2.f13020zoijcleaow = i19 - 1;
        zoijcleaowVarIobyxmoadg = null;
        i15 = zoijcleaowVar.f13020zoijcleaow;
        i16 = zoijcleaowVar2.f13020zoijcleaow;
        if (i15 <= i16) {
            zoijcleaowVar2.f13020zoijcleaow = i16 + 1;
        } else {
            i17 = zoijcleaowVar2.f13019wkgbmnqykc;
            if (i15 < i16 + i17) {
                int i25 = (i16 + i17) - i15;
                zoijcleaowVarIobyxmoadg2 = this.f13154iobyxmoadg.iobyxmoadg(4, i15 + 1, i25, zoijcleaowVar2.f13018ppxfxbqfkf);
                zoijcleaowVar2.f13019wkgbmnqykc -= i25;
            }
        }
        list.set(i14, zoijcleaowVar);
        if (zoijcleaowVar2.f13019wkgbmnqykc > 0) {
            list.set(i13, zoijcleaowVar2);
        } else {
            list.remove(i13);
            this.f13154iobyxmoadg.zoijcleaow(zoijcleaowVar2);
        }
        if (zoijcleaowVarIobyxmoadg != null) {
            list.add(i13, zoijcleaowVarIobyxmoadg);
        }
        if (zoijcleaowVarIobyxmoadg2 != null) {
            list.add(i13, zoijcleaowVarIobyxmoadg2);
        }
    }

    void zoijcleaow(List list) {
        while (true) {
            int iIobyxmoadg = iobyxmoadg(list);
            if (iIobyxmoadg == -1) {
                return;
            } else {
                wkgbmnqykc(list, iIobyxmoadg, iIobyxmoadg + 1);
            }
        }
    }
}
