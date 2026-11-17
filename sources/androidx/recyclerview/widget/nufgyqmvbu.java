package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Comparator f13082iobyxmoadg = new iobyxmoadg();

    static class dxjokdxxww {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public boolean f13083eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public int f13084iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f13085ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public int f13086wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f13087zoijcleaow;

        dxjokdxxww() {
        }

        int iobyxmoadg() {
            return Math.min(this.f13085ppxfxbqfkf - this.f13084iobyxmoadg, this.f13086wkgbmnqykc - this.f13087zoijcleaow);
        }

        boolean ppxfxbqfkf() {
            return this.f13086wkgbmnqykc - this.f13087zoijcleaow > this.f13085ppxfxbqfkf - this.f13084iobyxmoadg;
        }

        wkgbmnqykc wkgbmnqykc() {
            if (!zoijcleaow()) {
                int i13 = this.f13084iobyxmoadg;
                return new wkgbmnqykc(i13, this.f13087zoijcleaow, this.f13085ppxfxbqfkf - i13);
            }
            if (this.f13083eablkybsjg) {
                return new wkgbmnqykc(this.f13084iobyxmoadg, this.f13087zoijcleaow, iobyxmoadg());
            }
            return ppxfxbqfkf() ? new wkgbmnqykc(this.f13084iobyxmoadg, this.f13087zoijcleaow + 1, iobyxmoadg()) : new wkgbmnqykc(this.f13084iobyxmoadg + 1, this.f13087zoijcleaow, iobyxmoadg());
        }

        boolean zoijcleaow() {
            return this.f13086wkgbmnqykc - this.f13087zoijcleaow != this.f13085ppxfxbqfkf - this.f13084iobyxmoadg;
        }
    }

    public static class eablkybsjg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final int f13088eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final int f13089gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f13090iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final boolean f13091lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int[] f13092ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final zoijcleaow f13093wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int[] f13094zoijcleaow;

        eablkybsjg(zoijcleaow zoijcleaowVar, List list, int[] iArr, int[] iArr2, boolean z13) {
            this.f13090iobyxmoadg = list;
            this.f13094zoijcleaow = iArr;
            this.f13092ppxfxbqfkf = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f13093wkgbmnqykc = zoijcleaowVar;
            this.f13088eablkybsjg = zoijcleaowVar.getOldListSize();
            this.f13089gxszxtbevo = zoijcleaowVar.getNewListSize();
            this.f13091lqeggnwhkg = z13;
            iobyxmoadg();
            eablkybsjg();
        }

        private void eablkybsjg() {
            for (wkgbmnqykc wkgbmnqykcVar : this.f13090iobyxmoadg) {
                for (int i13 = 0; i13 < wkgbmnqykcVar.f13105ppxfxbqfkf; i13++) {
                    int i14 = wkgbmnqykcVar.f13104iobyxmoadg + i13;
                    int i15 = wkgbmnqykcVar.f13106zoijcleaow + i13;
                    int i16 = this.f13093wkgbmnqykc.areContentsTheSame(i14, i15) ? 1 : 2;
                    this.f13094zoijcleaow[i14] = (i15 << 4) | i16;
                    this.f13092ppxfxbqfkf[i15] = (i14 << 4) | i16;
                }
            }
            if (this.f13091lqeggnwhkg) {
                gxszxtbevo();
            }
        }

        private void gxszxtbevo() {
            int iIobyxmoadg = 0;
            for (wkgbmnqykc wkgbmnqykcVar : this.f13090iobyxmoadg) {
                while (iIobyxmoadg < wkgbmnqykcVar.f13104iobyxmoadg) {
                    if (this.f13094zoijcleaow[iIobyxmoadg] == 0) {
                        wkgbmnqykc(iIobyxmoadg);
                    }
                    iIobyxmoadg++;
                }
                iIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
            }
        }

        private void iobyxmoadg() {
            wkgbmnqykc wkgbmnqykcVar = this.f13090iobyxmoadg.isEmpty() ? null : (wkgbmnqykc) this.f13090iobyxmoadg.get(0);
            if (wkgbmnqykcVar == null || wkgbmnqykcVar.f13104iobyxmoadg != 0 || wkgbmnqykcVar.f13106zoijcleaow != 0) {
                this.f13090iobyxmoadg.add(0, new wkgbmnqykc(0, 0, 0));
            }
            this.f13090iobyxmoadg.add(new wkgbmnqykc(this.f13088eablkybsjg, this.f13089gxszxtbevo, 0));
        }

        private static lqeggnwhkg lqeggnwhkg(Collection collection, int i13, boolean z13) {
            lqeggnwhkg lqeggnwhkgVar;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    lqeggnwhkgVar = null;
                    break;
                }
                lqeggnwhkgVar = (lqeggnwhkg) it.next();
                if (lqeggnwhkgVar.f13095iobyxmoadg == i13 && lqeggnwhkgVar.f13096ppxfxbqfkf == z13) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                lqeggnwhkg lqeggnwhkgVar2 = (lqeggnwhkg) it.next();
                if (z13) {
                    lqeggnwhkgVar2.f13097zoijcleaow--;
                } else {
                    lqeggnwhkgVar2.f13097zoijcleaow++;
                }
            }
            return lqeggnwhkgVar;
        }

        private void wkgbmnqykc(int i13) {
            int size = this.f13090iobyxmoadg.size();
            int iZoijcleaow = 0;
            for (int i14 = 0; i14 < size; i14++) {
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f13090iobyxmoadg.get(i14);
                while (iZoijcleaow < wkgbmnqykcVar.f13106zoijcleaow) {
                    if (this.f13092ppxfxbqfkf[iZoijcleaow] == 0 && this.f13093wkgbmnqykc.areItemsTheSame(i13, iZoijcleaow)) {
                        int i15 = this.f13093wkgbmnqykc.areContentsTheSame(i13, iZoijcleaow) ? 8 : 4;
                        this.f13094zoijcleaow[i13] = (iZoijcleaow << 4) | i15;
                        this.f13092ppxfxbqfkf[iZoijcleaow] = (i13 << 4) | i15;
                        return;
                    }
                    iZoijcleaow++;
                }
                iZoijcleaow = wkgbmnqykcVar.zoijcleaow();
            }
        }

        public void ppxfxbqfkf(RecyclerView.nufgyqmvbu nufgyqmvbuVar) {
            zoijcleaow(new androidx.recyclerview.widget.zoijcleaow(nufgyqmvbuVar));
        }

        public void zoijcleaow(kcexrzcfyt kcexrzcfytVar) {
            int i13;
            androidx.recyclerview.widget.eablkybsjg eablkybsjgVar = kcexrzcfytVar instanceof androidx.recyclerview.widget.eablkybsjg ? (androidx.recyclerview.widget.eablkybsjg) kcexrzcfytVar : new androidx.recyclerview.widget.eablkybsjg(kcexrzcfytVar);
            int i14 = this.f13088eablkybsjg;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i15 = this.f13088eablkybsjg;
            int i16 = this.f13089gxszxtbevo;
            for (int size = this.f13090iobyxmoadg.size() - 1; size >= 0; size--) {
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f13090iobyxmoadg.get(size);
                int iIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
                int iZoijcleaow = wkgbmnqykcVar.zoijcleaow();
                while (true) {
                    if (i15 <= iIobyxmoadg) {
                        break;
                    }
                    i15--;
                    int i17 = this.f13094zoijcleaow[i15];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        lqeggnwhkg lqeggnwhkgVarLqeggnwhkg = lqeggnwhkg(arrayDeque, i18, false);
                        if (lqeggnwhkgVarLqeggnwhkg != null) {
                            int i19 = (i14 - lqeggnwhkgVarLqeggnwhkg.f13097zoijcleaow) - 1;
                            eablkybsjgVar.wkgbmnqykc(i15, i19);
                            if ((i17 & 4) != 0) {
                                eablkybsjgVar.ppxfxbqfkf(i19, 1, this.f13093wkgbmnqykc.getChangePayload(i15, i18));
                            }
                        } else {
                            arrayDeque.add(new lqeggnwhkg(i15, (i14 - i15) - 1, true));
                        }
                    } else {
                        eablkybsjgVar.zoijcleaow(i15, 1);
                        i14--;
                    }
                }
                while (i16 > iZoijcleaow) {
                    i16--;
                    int i23 = this.f13092ppxfxbqfkf[i16];
                    if ((i23 & 12) != 0) {
                        int i24 = i23 >> 4;
                        lqeggnwhkg lqeggnwhkgVarLqeggnwhkg2 = lqeggnwhkg(arrayDeque, i24, true);
                        if (lqeggnwhkgVarLqeggnwhkg2 == null) {
                            arrayDeque.add(new lqeggnwhkg(i16, i14 - i15, false));
                        } else {
                            eablkybsjgVar.wkgbmnqykc((i14 - lqeggnwhkgVarLqeggnwhkg2.f13097zoijcleaow) - 1, i15);
                            if ((i23 & 4) != 0) {
                                eablkybsjgVar.ppxfxbqfkf(i15, 1, this.f13093wkgbmnqykc.getChangePayload(i24, i16));
                            }
                        }
                    } else {
                        eablkybsjgVar.iobyxmoadg(i15, 1);
                        i14++;
                    }
                }
                int i25 = wkgbmnqykcVar.f13104iobyxmoadg;
                int i26 = wkgbmnqykcVar.f13106zoijcleaow;
                for (i13 = 0; i13 < wkgbmnqykcVar.f13105ppxfxbqfkf; i13++) {
                    if ((this.f13094zoijcleaow[i25] & 15) == 2) {
                        eablkybsjgVar.ppxfxbqfkf(i25, 1, this.f13093wkgbmnqykc.getChangePayload(i25, i26));
                    }
                    i25++;
                    i26++;
                }
                i15 = wkgbmnqykcVar.f13104iobyxmoadg;
                i16 = wkgbmnqykcVar.f13106zoijcleaow;
            }
            eablkybsjgVar.eablkybsjg();
        }
    }

    public static abstract class gxszxtbevo {
        public abstract boolean iobyxmoadg(Object obj, Object obj2);

        public Object ppxfxbqfkf(Object obj, Object obj2) {
            return null;
        }

        public abstract boolean zoijcleaow(Object obj, Object obj2);
    }

    class iobyxmoadg implements Comparator {
        iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(wkgbmnqykc wkgbmnqykcVar, wkgbmnqykc wkgbmnqykcVar2) {
            return wkgbmnqykcVar.f13104iobyxmoadg - wkgbmnqykcVar2.f13104iobyxmoadg;
        }
    }

    private static class lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f13095iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        boolean f13096ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f13097zoijcleaow;

        lqeggnwhkg(int i13, int i14, boolean z13) {
            this.f13095iobyxmoadg = i13;
            this.f13097zoijcleaow = i14;
            this.f13096ppxfxbqfkf = z13;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.nufgyqmvbu$nufgyqmvbu, reason: collision with other inner class name */
    static class C0183nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f13098iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f13099ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f13100wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f13101zoijcleaow;

        public C0183nufgyqmvbu() {
        }

        int iobyxmoadg() {
            return this.f13100wkgbmnqykc - this.f13099ppxfxbqfkf;
        }

        int zoijcleaow() {
            return this.f13101zoijcleaow - this.f13098iobyxmoadg;
        }

        public C0183nufgyqmvbu(int i13, int i14, int i15, int i16) {
            this.f13098iobyxmoadg = i13;
            this.f13101zoijcleaow = i14;
            this.f13099ppxfxbqfkf = i15;
            this.f13100wkgbmnqykc = i16;
        }
    }

    static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int[] f13102iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f13103zoijcleaow;

        ppxfxbqfkf(int i13) {
            int[] iArr = new int[i13];
            this.f13102iobyxmoadg = iArr;
            this.f13103zoijcleaow = iArr.length / 2;
        }

        int[] iobyxmoadg() {
            return this.f13102iobyxmoadg;
        }

        void ppxfxbqfkf(int i13, int i14) {
            this.f13102iobyxmoadg[i13 + this.f13103zoijcleaow] = i14;
        }

        int zoijcleaow(int i13) {
            return this.f13102iobyxmoadg[i13 + this.f13103zoijcleaow];
        }
    }

    static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f13104iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f13105ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f13106zoijcleaow;

        wkgbmnqykc(int i13, int i14, int i15) {
            this.f13104iobyxmoadg = i13;
            this.f13106zoijcleaow = i14;
            this.f13105ppxfxbqfkf = i15;
        }

        int iobyxmoadg() {
            return this.f13104iobyxmoadg + this.f13105ppxfxbqfkf;
        }

        int zoijcleaow() {
            return this.f13106zoijcleaow + this.f13105ppxfxbqfkf;
        }
    }

    public static abstract class zoijcleaow {
        public abstract boolean areContentsTheSame(int i13, int i14);

        public abstract boolean areItemsTheSame(int i13, int i14);

        public Object getChangePayload(int i13, int i14) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    private static dxjokdxxww eablkybsjg(C0183nufgyqmvbu c0183nufgyqmvbu, zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2) {
        if (c0183nufgyqmvbu.zoijcleaow() >= 1 && c0183nufgyqmvbu.iobyxmoadg() >= 1) {
            int iZoijcleaow = ((c0183nufgyqmvbu.zoijcleaow() + c0183nufgyqmvbu.iobyxmoadg()) + 1) / 2;
            ppxfxbqfkfVar.ppxfxbqfkf(1, c0183nufgyqmvbu.f13098iobyxmoadg);
            ppxfxbqfkfVar2.ppxfxbqfkf(1, c0183nufgyqmvbu.f13101zoijcleaow);
            for (int i13 = 0; i13 < iZoijcleaow; i13++) {
                dxjokdxxww dxjokdxxwwVarWkgbmnqykc = wkgbmnqykc(c0183nufgyqmvbu, zoijcleaowVar, ppxfxbqfkfVar, ppxfxbqfkfVar2, i13);
                if (dxjokdxxwwVarWkgbmnqykc != null) {
                    return dxjokdxxwwVarWkgbmnqykc;
                }
                dxjokdxxww dxjokdxxwwVarIobyxmoadg = iobyxmoadg(c0183nufgyqmvbu, zoijcleaowVar, ppxfxbqfkfVar, ppxfxbqfkfVar2, i13);
                if (dxjokdxxwwVarIobyxmoadg != null) {
                    return dxjokdxxwwVarIobyxmoadg;
                }
            }
        }
        return null;
    }

    private static dxjokdxxww iobyxmoadg(C0183nufgyqmvbu c0183nufgyqmvbu, zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2, int i13) {
        int iZoijcleaow;
        int i14;
        int i15;
        boolean z13 = (c0183nufgyqmvbu.zoijcleaow() - c0183nufgyqmvbu.iobyxmoadg()) % 2 == 0;
        int iZoijcleaow2 = c0183nufgyqmvbu.zoijcleaow() - c0183nufgyqmvbu.iobyxmoadg();
        int i16 = -i13;
        for (int i17 = i16; i17 <= i13; i17 += 2) {
            if (i17 == i16 || (i17 != i13 && ppxfxbqfkfVar2.zoijcleaow(i17 + 1) < ppxfxbqfkfVar2.zoijcleaow(i17 - 1))) {
                iZoijcleaow = ppxfxbqfkfVar2.zoijcleaow(i17 + 1);
                i14 = iZoijcleaow;
            } else {
                iZoijcleaow = ppxfxbqfkfVar2.zoijcleaow(i17 - 1);
                i14 = iZoijcleaow - 1;
            }
            int i18 = c0183nufgyqmvbu.f13100wkgbmnqykc - ((c0183nufgyqmvbu.f13101zoijcleaow - i14) - i17);
            int i19 = (i13 == 0 || i14 != iZoijcleaow) ? i18 : i18 + 1;
            while (i14 > c0183nufgyqmvbu.f13098iobyxmoadg && i18 > c0183nufgyqmvbu.f13099ppxfxbqfkf && zoijcleaowVar.areItemsTheSame(i14 - 1, i18 - 1)) {
                i14--;
                i18--;
            }
            ppxfxbqfkfVar2.ppxfxbqfkf(i17, i14);
            if (z13 && (i15 = iZoijcleaow2 - i17) >= i16 && i15 <= i13 && ppxfxbqfkfVar.zoijcleaow(i15) >= i14) {
                dxjokdxxww dxjokdxxwwVar = new dxjokdxxww();
                dxjokdxxwwVar.f13084iobyxmoadg = i14;
                dxjokdxxwwVar.f13087zoijcleaow = i18;
                dxjokdxxwwVar.f13085ppxfxbqfkf = iZoijcleaow;
                dxjokdxxwwVar.f13086wkgbmnqykc = i19;
                dxjokdxxwwVar.f13083eablkybsjg = true;
                return dxjokdxxwwVar;
            }
        }
        return null;
    }

    public static eablkybsjg ppxfxbqfkf(zoijcleaow zoijcleaowVar, boolean z13) {
        int oldListSize = zoijcleaowVar.getOldListSize();
        int newListSize = zoijcleaowVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0183nufgyqmvbu(0, oldListSize, 0, newListSize));
        int i13 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(i13);
        ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf(i13);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0183nufgyqmvbu c0183nufgyqmvbu = (C0183nufgyqmvbu) arrayList2.remove(arrayList2.size() - 1);
            dxjokdxxww dxjokdxxwwVarEablkybsjg = eablkybsjg(c0183nufgyqmvbu, zoijcleaowVar, ppxfxbqfkfVar, ppxfxbqfkfVar2);
            if (dxjokdxxwwVarEablkybsjg != null) {
                if (dxjokdxxwwVarEablkybsjg.iobyxmoadg() > 0) {
                    arrayList.add(dxjokdxxwwVarEablkybsjg.wkgbmnqykc());
                }
                C0183nufgyqmvbu c0183nufgyqmvbu2 = arrayList3.isEmpty() ? new C0183nufgyqmvbu() : (C0183nufgyqmvbu) arrayList3.remove(arrayList3.size() - 1);
                c0183nufgyqmvbu2.f13098iobyxmoadg = c0183nufgyqmvbu.f13098iobyxmoadg;
                c0183nufgyqmvbu2.f13099ppxfxbqfkf = c0183nufgyqmvbu.f13099ppxfxbqfkf;
                c0183nufgyqmvbu2.f13101zoijcleaow = dxjokdxxwwVarEablkybsjg.f13084iobyxmoadg;
                c0183nufgyqmvbu2.f13100wkgbmnqykc = dxjokdxxwwVarEablkybsjg.f13087zoijcleaow;
                arrayList2.add(c0183nufgyqmvbu2);
                c0183nufgyqmvbu.f13101zoijcleaow = c0183nufgyqmvbu.f13101zoijcleaow;
                c0183nufgyqmvbu.f13100wkgbmnqykc = c0183nufgyqmvbu.f13100wkgbmnqykc;
                c0183nufgyqmvbu.f13098iobyxmoadg = dxjokdxxwwVarEablkybsjg.f13085ppxfxbqfkf;
                c0183nufgyqmvbu.f13099ppxfxbqfkf = dxjokdxxwwVarEablkybsjg.f13086wkgbmnqykc;
                arrayList2.add(c0183nufgyqmvbu);
            } else {
                arrayList3.add(c0183nufgyqmvbu);
            }
        }
        Collections.sort(arrayList, f13082iobyxmoadg);
        return new eablkybsjg(zoijcleaowVar, arrayList, ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar2.iobyxmoadg(), z13);
    }

    private static dxjokdxxww wkgbmnqykc(C0183nufgyqmvbu c0183nufgyqmvbu, zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2, int i13) {
        int iZoijcleaow;
        int i14;
        int i15;
        boolean z13 = Math.abs(c0183nufgyqmvbu.zoijcleaow() - c0183nufgyqmvbu.iobyxmoadg()) % 2 == 1;
        int iZoijcleaow2 = c0183nufgyqmvbu.zoijcleaow() - c0183nufgyqmvbu.iobyxmoadg();
        int i16 = -i13;
        for (int i17 = i16; i17 <= i13; i17 += 2) {
            if (i17 == i16 || (i17 != i13 && ppxfxbqfkfVar.zoijcleaow(i17 + 1) > ppxfxbqfkfVar.zoijcleaow(i17 - 1))) {
                iZoijcleaow = ppxfxbqfkfVar.zoijcleaow(i17 + 1);
                i14 = iZoijcleaow;
            } else {
                iZoijcleaow = ppxfxbqfkfVar.zoijcleaow(i17 - 1);
                i14 = iZoijcleaow + 1;
            }
            int i18 = (c0183nufgyqmvbu.f13099ppxfxbqfkf + (i14 - c0183nufgyqmvbu.f13098iobyxmoadg)) - i17;
            int i19 = (i13 == 0 || i14 != iZoijcleaow) ? i18 : i18 - 1;
            while (i14 < c0183nufgyqmvbu.f13101zoijcleaow && i18 < c0183nufgyqmvbu.f13100wkgbmnqykc && zoijcleaowVar.areItemsTheSame(i14, i18)) {
                i14++;
                i18++;
            }
            ppxfxbqfkfVar.ppxfxbqfkf(i17, i14);
            if (z13 && (i15 = iZoijcleaow2 - i17) >= i16 + 1 && i15 <= i13 - 1 && ppxfxbqfkfVar2.zoijcleaow(i15) <= i14) {
                dxjokdxxww dxjokdxxwwVar = new dxjokdxxww();
                dxjokdxxwwVar.f13084iobyxmoadg = iZoijcleaow;
                dxjokdxxwwVar.f13087zoijcleaow = i19;
                dxjokdxxwwVar.f13085ppxfxbqfkf = i14;
                dxjokdxxwwVar.f13086wkgbmnqykc = i18;
                dxjokdxxwwVar.f13083eablkybsjg = false;
                return dxjokdxxwwVar;
            }
        }
        return null;
    }

    public static eablkybsjg zoijcleaow(zoijcleaow zoijcleaowVar) {
        return ppxfxbqfkf(zoijcleaowVar, true);
    }
}
