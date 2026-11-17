package mhtqkkgtqm;

import androidx.compose.runtime.fmlbqenlif;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu extends hg.nufgyqmvbu implements grlcpdaxtj.eablkybsjg.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private fmlbqenlif.eablkybsjg f67224cqumvgiudr = new fmlbqenlif.eablkybsjg();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Object[] f67225esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f67226iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Object[] f67227jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Object[] f67228lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f67229pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object[] f67230yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private grlcpdaxtj.eablkybsjg f67231zdlpuopuiu;

    public nufgyqmvbu(grlcpdaxtj.eablkybsjg eablkybsjgVar, Object[] objArr, Object[] objArr2, int i13) {
        this.f67231zdlpuopuiu = eablkybsjgVar;
        this.f67230yggfygwlhe = objArr;
        this.f67227jyumaefscl = objArr2;
        this.f67226iwizpuwonk = i13;
        this.f67225esjtqupxsv = this.f67230yggfygwlhe;
        this.f67228lereixgezr = this.f67227jyumaefscl;
        this.f67229pmvmpeiblj = this.f67231zdlpuopuiu.size();
    }

    private final Object[] btonecajqb(int i13) {
        if (ribwqtqdhb() <= i13) {
            return this.f67228lereixgezr;
        }
        Object[] objArr = this.f67225esjtqupxsv;
        zdlpuopuiu.lqeggnwhkg(objArr);
        for (int i14 = this.f67226iwizpuwonk; i14 > 0; i14 -= 5) {
            Object[] objArr2 = objArr[agtfadlqog.iobyxmoadg(i13, i14)];
            zdlpuopuiu.nufgyqmvbu(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] cdpycssgdh(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f67224cqumvgiudr;
        return objArr;
    }

    private final Object[] cllcsxoeiz(Object[] objArr, Object[] objArr2, int i13) {
        int iIobyxmoadg = agtfadlqog.iobyxmoadg(size() - 1, i13);
        Object[] objArrPmvmpeiblj = pmvmpeiblj(objArr);
        if (i13 == 5) {
            objArrPmvmpeiblj[iIobyxmoadg] = objArr2;
        } else {
            objArrPmvmpeiblj[iIobyxmoadg] = cllcsxoeiz((Object[]) objArrPmvmpeiblj[iIobyxmoadg], objArr2, i13 - 5);
        }
        return objArrPmvmpeiblj;
    }

    private final boolean cqumvgiudr(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f67224cqumvgiudr;
    }

    private final Object[] draadjrbmk(Object[] objArr, int i13, Iterator it) {
        while (i13 < 32 && it.hasNext()) {
            objArr[i13] = it.next();
            i13++;
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int dsvhmnatus(tg.draadjrbmk draadjrbmkVar, Object[] objArr, int i13, int i14, eablkybsjg eablkybsjgVar, List list, List list2) {
        if (cqumvgiudr(objArr)) {
            list.add(objArr);
        }
        Object objIobyxmoadg = eablkybsjgVar.iobyxmoadg();
        zdlpuopuiu.nufgyqmvbu(objIobyxmoadg, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objIobyxmoadg;
        Object[] objArrIstkbnxepw = objArr2;
        for (int i15 = 0; i15 < i13; i15++) {
            Object obj = objArr[i15];
            if (!((Boolean) draadjrbmkVar.invoke(obj)).booleanValue()) {
                if (i14 == 32) {
                    objArrIstkbnxepw = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : istkbnxepw();
                    i14 = 0;
                }
                objArrIstkbnxepw[i14] = obj;
                i14++;
            }
        }
        eablkybsjgVar.zoijcleaow(objArrIstkbnxepw);
        if (objArr2 != eablkybsjgVar.iobyxmoadg()) {
            list2.add(objArr2);
        }
        return i14;
    }

    private final Object[] hcddaimhww(Object[] objArr, int i13, int i14, Iterator it) {
        if (!it.hasNext()) {
            fmlbqenlif.iobyxmoadg("invalid buffersIterator");
        }
        if (!(i14 >= 0)) {
            fmlbqenlif.iobyxmoadg("negative shift");
        }
        if (i14 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrPmvmpeiblj = pmvmpeiblj(objArr);
        int iIobyxmoadg = agtfadlqog.iobyxmoadg(i13, i14);
        int i15 = i14 - 5;
        objArrPmvmpeiblj[iIobyxmoadg] = hcddaimhww((Object[]) objArrPmvmpeiblj[iIobyxmoadg], i13, i15, it);
        while (true) {
            iIobyxmoadg++;
            if (iIobyxmoadg >= 32 || !it.hasNext()) {
                break;
            }
            objArrPmvmpeiblj[iIobyxmoadg] = hcddaimhww((Object[]) objArrPmvmpeiblj[iIobyxmoadg], 0, i15, it);
        }
        return objArrPmvmpeiblj;
    }

    private final void hkdspvbjdz(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i13 = this.f67226iwizpuwonk;
        if (size > (1 << i13)) {
            this.f67225esjtqupxsv = cllcsxoeiz(cdpycssgdh(objArr), objArr2, this.f67226iwizpuwonk + 5);
            this.f67228lereixgezr = objArr3;
            this.f67226iwizpuwonk += 5;
            this.f67229pmvmpeiblj = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f67225esjtqupxsv = objArr2;
            this.f67228lereixgezr = objArr3;
            this.f67229pmvmpeiblj = size() + 1;
        } else {
            this.f67225esjtqupxsv = cllcsxoeiz(objArr, objArr2, i13);
            this.f67228lereixgezr = objArr3;
            this.f67229pmvmpeiblj = size() + 1;
        }
    }

    private final void ikoacuggdj(Collection collection, int i13, Object[] objArr, int i14, Object[][] objArr2, int i15, Object[] objArr3) {
        Object[] objArrIstkbnxepw;
        if (!(i15 >= 1)) {
            fmlbqenlif.iobyxmoadg("requires at least one nullBuffer");
        }
        Object[] objArrPmvmpeiblj = pmvmpeiblj(objArr);
        objArr2[0] = objArrPmvmpeiblj;
        int i16 = i13 & 31;
        int size = ((i13 + collection.size()) - 1) & 31;
        int i17 = (i14 - i16) + size;
        if (i17 < 32) {
            hg.agtfadlqog.agtfadlqog(objArrPmvmpeiblj, objArr3, size + 1, i16, i14);
        } else {
            int i18 = i17 - 31;
            if (i15 == 1) {
                objArrIstkbnxepw = objArrPmvmpeiblj;
            } else {
                objArrIstkbnxepw = istkbnxepw();
                i15--;
                objArr2[i15] = objArrIstkbnxepw;
            }
            int i19 = i14 - i18;
            hg.agtfadlqog.agtfadlqog(objArrPmvmpeiblj, objArr3, 0, i19, i14);
            hg.agtfadlqog.agtfadlqog(objArrPmvmpeiblj, objArrIstkbnxepw, size + 1, i16, i19);
            objArr3 = objArrIstkbnxepw;
        }
        Iterator it = collection.iterator();
        draadjrbmk(objArrPmvmpeiblj, i16, it);
        for (int i23 = 1; i23 < i15; i23++) {
            objArr2[i23] = draadjrbmk(istkbnxepw(), 0, it);
        }
        draadjrbmk(objArr3, 0, it);
    }

    private final Object[] istkbnxepw() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f67224cqumvgiudr;
        return objArr;
    }

    private final Object[] jhduphickx(int i13, int i14, Object[][] objArr, int i15, Object[] objArr2) {
        if (this.f67225esjtqupxsv == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator listIteratorLereixgezr = lereixgezr(ribwqtqdhb() >> 5);
        while (listIteratorLereixgezr.previousIndex() != i13) {
            Object[] objArr3 = (Object[]) listIteratorLereixgezr.previous();
            hg.agtfadlqog.agtfadlqog(objArr3, objArr2, 0, 32 - i14, 32);
            objArr2 = zynmafqrjb(objArr3, i14);
            i15--;
            objArr[i15] = objArr2;
        }
        return (Object[]) listIteratorLereixgezr.previous();
    }

    private final Object[] jpowsppfya(Object[] objArr, int i13, Object[][] objArr2) {
        Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(objArr2);
        int i14 = i13 >> 5;
        int i15 = this.f67226iwizpuwonk;
        Object[] objArrHcddaimhww = i14 < (1 << i15) ? hcddaimhww(objArr, i13, i15, itIobyxmoadg) : pmvmpeiblj(objArr);
        while (itIobyxmoadg.hasNext()) {
            this.f67226iwizpuwonk += 5;
            objArrHcddaimhww = cdpycssgdh(objArrHcddaimhww);
            int i16 = this.f67226iwizpuwonk;
            hcddaimhww(objArrHcddaimhww, 1 << i16, i16, itIobyxmoadg);
        }
        return objArrHcddaimhww;
    }

    private final void jyumaefscl(Object[] objArr, int i13, Object obj) {
        int iOkpsazkaxt = okpsazkaxt();
        Object[] objArrPmvmpeiblj = pmvmpeiblj(this.f67228lereixgezr);
        if (iOkpsazkaxt < 32) {
            hg.agtfadlqog.agtfadlqog(this.f67228lereixgezr, objArrPmvmpeiblj, i13 + 1, i13, iOkpsazkaxt);
            objArrPmvmpeiblj[i13] = obj;
            this.f67225esjtqupxsv = objArr;
            this.f67228lereixgezr = objArrPmvmpeiblj;
            this.f67229pmvmpeiblj = size() + 1;
            return;
        }
        Object[] objArr2 = this.f67228lereixgezr;
        Object obj2 = objArr2[31];
        hg.agtfadlqog.agtfadlqog(objArr2, objArrPmvmpeiblj, i13 + 1, i13, 31);
        objArrPmvmpeiblj[i13] = obj;
        hkdspvbjdz(objArr, objArrPmvmpeiblj, cdpycssgdh(obj2));
    }

    private final int jztzpxfvev(int i13) {
        return i13 <= 32 ? i13 : i13 - agtfadlqog.wkgbmnqykc(i13);
    }

    private final void kcexrzcfyt(Collection collection, int i13, int i14, Object[][] objArr, int i15, Object[] objArr2) {
        if (this.f67225esjtqupxsv == null) {
            throw new IllegalStateException("root is null");
        }
        int i16 = i13 >> 5;
        Object[] objArrJhduphickx = jhduphickx(i16, i14, objArr, i15, objArr2);
        int iRibwqtqdhb = i15 - (((ribwqtqdhb() >> 5) - 1) - i16);
        if (iRibwqtqdhb < i15) {
            objArr2 = objArr[iRibwqtqdhb];
            zdlpuopuiu.lqeggnwhkg(objArr2);
        }
        ikoacuggdj(collection, i13, objArrJhduphickx, 32, objArr, iRibwqtqdhb, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean kegysxyocb(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    private final ListIterator lereixgezr(int i13) {
        Object[] objArr = this.f67225esjtqupxsv;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iRibwqtqdhb = ribwqtqdhb() >> 5;
        fmlbqenlif.wkgbmnqykc.zoijcleaow(i13, iRibwqtqdhb);
        int i14 = this.f67226iwizpuwonk;
        return i14 == 0 ? new gtknphoqwx(objArr, i13) : new wflxmlrfwp(objArr, i13, iRibwqtqdhb, i14 / 5);
    }

    private final Object[] lmojexxdyd(Object[] objArr, int i13, int i14) {
        if (!(i14 >= 0)) {
            fmlbqenlif.iobyxmoadg("shift should be positive");
        }
        if (i14 == 0) {
            return objArr;
        }
        int iIobyxmoadg = agtfadlqog.iobyxmoadg(i13, i14);
        Object obj = objArr[iIobyxmoadg];
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objLmojexxdyd = lmojexxdyd((Object[]) obj, i13, i14 - 5);
        if (iIobyxmoadg < 31) {
            int i15 = iIobyxmoadg + 1;
            if (objArr[i15] != null) {
                if (cqumvgiudr(objArr)) {
                    hg.agtfadlqog.lereixgezr(objArr, null, i15, 32);
                }
                objArr = hg.agtfadlqog.agtfadlqog(objArr, istkbnxepw(), 0, 0, i15);
            }
        }
        if (objLmojexxdyd == objArr[iIobyxmoadg]) {
            return objArr;
        }
        Object[] objArrPmvmpeiblj = pmvmpeiblj(objArr);
        objArrPmvmpeiblj[iIobyxmoadg] = objLmojexxdyd;
        return objArrPmvmpeiblj;
    }

    private final Object[] ntlheqmsrt(Object[] objArr, int i13, int i14, eablkybsjg eablkybsjgVar) {
        int iIobyxmoadg = agtfadlqog.iobyxmoadg(i14, i13);
        if (i13 == 0) {
            Object obj = objArr[iIobyxmoadg];
            Object[] objArrAgtfadlqog = hg.agtfadlqog.agtfadlqog(objArr, pmvmpeiblj(objArr), iIobyxmoadg, iIobyxmoadg + 1, 32);
            objArrAgtfadlqog[31] = eablkybsjgVar.iobyxmoadg();
            eablkybsjgVar.zoijcleaow(obj);
            return objArrAgtfadlqog;
        }
        int iIobyxmoadg2 = objArr[31] == null ? agtfadlqog.iobyxmoadg(ribwqtqdhb() - 1, i13) : 31;
        Object[] objArrPmvmpeiblj = pmvmpeiblj(objArr);
        int i15 = i13 - 5;
        int i16 = iIobyxmoadg + 1;
        if (i16 <= iIobyxmoadg2) {
            while (true) {
                Object obj2 = objArrPmvmpeiblj[iIobyxmoadg2];
                zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrPmvmpeiblj[iIobyxmoadg2] = ntlheqmsrt((Object[]) obj2, i15, 0, eablkybsjgVar);
                if (iIobyxmoadg2 == i16) {
                    break;
                }
                iIobyxmoadg2--;
            }
        }
        Object obj3 = objArrPmvmpeiblj[iIobyxmoadg];
        zdlpuopuiu.nufgyqmvbu(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrPmvmpeiblj[iIobyxmoadg] = ntlheqmsrt((Object[]) obj3, i15, i14, eablkybsjgVar);
        return objArrPmvmpeiblj;
    }

    private final int okpsazkaxt() {
        return jztzpxfvev(size());
    }

    private final Object[] pmvmpeiblj(Object[] objArr) {
        if (objArr == null) {
            return istkbnxepw();
        }
        return cqumvgiudr(objArr) ? objArr : hg.agtfadlqog.kcexrzcfyt(objArr, istkbnxepw(), 0, 0, zg.gtknphoqwx.btonecajqb(objArr.length, 32), 6, null);
    }

    private final int ribwqtqdhb() {
        if (size() <= 32) {
            return 0;
        }
        return agtfadlqog.wkgbmnqykc(size());
    }

    private final Object[] sopmlzcsov(Object[] objArr, int i13) {
        if (!((i13 & 31) == 0)) {
            fmlbqenlif.iobyxmoadg("invalid size");
        }
        if (i13 == 0) {
            this.f67226iwizpuwonk = 0;
            return null;
        }
        int i14 = i13 - 1;
        while (true) {
            int i15 = this.f67226iwizpuwonk;
            if ((i14 >> i15) != 0) {
                return lmojexxdyd(objArr, i14, i15);
            }
            this.f67226iwizpuwonk = i15 - 5;
            Object[] objArr2 = objArr[0];
            zdlpuopuiu.nufgyqmvbu(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final boolean stevsuqkhv(tg.draadjrbmk draadjrbmkVar) {
        Object[] objArrHcddaimhww;
        int iOkpsazkaxt = okpsazkaxt();
        eablkybsjg eablkybsjgVar = new eablkybsjg(null);
        if (this.f67225esjtqupxsv == null) {
            return tzroggbefp(draadjrbmkVar, iOkpsazkaxt, eablkybsjgVar) != iOkpsazkaxt;
        }
        ListIterator listIteratorLereixgezr = lereixgezr(0);
        int iWypolnanlu = 32;
        while (iWypolnanlu == 32 && listIteratorLereixgezr.hasNext()) {
            iWypolnanlu = wypolnanlu(draadjrbmkVar, (Object[]) listIteratorLereixgezr.next(), 32, eablkybsjgVar);
        }
        if (iWypolnanlu == 32) {
            fmlbqenlif.iobyxmoadg.iobyxmoadg(!listIteratorLereixgezr.hasNext());
            int iTzroggbefp = tzroggbefp(draadjrbmkVar, iOkpsazkaxt, eablkybsjgVar);
            if (iTzroggbefp == 0) {
                ylkuphrtab(this.f67225esjtqupxsv, size(), this.f67226iwizpuwonk);
            }
            return iTzroggbefp != iOkpsazkaxt;
        }
        int iPreviousIndex = listIteratorLereixgezr.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iDsvhmnatus = iWypolnanlu;
        while (listIteratorLereixgezr.hasNext()) {
            iDsvhmnatus = dsvhmnatus(draadjrbmkVar, (Object[]) listIteratorLereixgezr.next(), 32, iDsvhmnatus, eablkybsjgVar, arrayList2, arrayList);
            iPreviousIndex = iPreviousIndex;
        }
        int i13 = iPreviousIndex;
        int iDsvhmnatus2 = dsvhmnatus(draadjrbmkVar, this.f67228lereixgezr, iOkpsazkaxt, iDsvhmnatus, eablkybsjgVar, arrayList2, arrayList);
        Object objIobyxmoadg = eablkybsjgVar.iobyxmoadg();
        zdlpuopuiu.nufgyqmvbu(objIobyxmoadg, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objIobyxmoadg;
        hg.agtfadlqog.lereixgezr(objArr, null, iDsvhmnatus2, 32);
        if (arrayList.isEmpty()) {
            objArrHcddaimhww = this.f67225esjtqupxsv;
            zdlpuopuiu.lqeggnwhkg(objArrHcddaimhww);
        } else {
            objArrHcddaimhww = hcddaimhww(this.f67225esjtqupxsv, i13, this.f67226iwizpuwonk, arrayList.iterator());
        }
        int size = i13 + (arrayList.size() << 5);
        this.f67225esjtqupxsv = sopmlzcsov(objArrHcddaimhww, size);
        this.f67228lereixgezr = objArr;
        this.f67229pmvmpeiblj = size + iDsvhmnatus2;
        return true;
    }

    private final int tzroggbefp(tg.draadjrbmk draadjrbmkVar, int i13, eablkybsjg eablkybsjgVar) {
        int iWypolnanlu = wypolnanlu(draadjrbmkVar, this.f67228lereixgezr, i13, eablkybsjgVar);
        if (iWypolnanlu == i13) {
            fmlbqenlif.iobyxmoadg.iobyxmoadg(eablkybsjgVar.iobyxmoadg() == this.f67228lereixgezr);
            return i13;
        }
        Object objIobyxmoadg = eablkybsjgVar.iobyxmoadg();
        zdlpuopuiu.nufgyqmvbu(objIobyxmoadg, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objIobyxmoadg;
        hg.agtfadlqog.lereixgezr(objArr, null, iWypolnanlu, i13);
        this.f67228lereixgezr = objArr;
        this.f67229pmvmpeiblj = size() - (i13 - iWypolnanlu);
        return iWypolnanlu;
    }

    private final Object ulzqkzuiru(Object[] objArr, int i13, int i14, int i15) {
        int size = size() - i13;
        fmlbqenlif.iobyxmoadg.iobyxmoadg(i15 < size);
        if (size == 1) {
            Object obj = this.f67228lereixgezr[0];
            ylkuphrtab(objArr, i13, i14);
            return obj;
        }
        Object[] objArr2 = this.f67228lereixgezr;
        Object obj2 = objArr2[i15];
        Object[] objArrAgtfadlqog = hg.agtfadlqog.agtfadlqog(objArr2, pmvmpeiblj(objArr2), i15, i15 + 1, size);
        objArrAgtfadlqog[size - 1] = null;
        this.f67225esjtqupxsv = objArr;
        this.f67228lereixgezr = objArrAgtfadlqog;
        this.f67229pmvmpeiblj = (i13 + size) - 1;
        this.f67226iwizpuwonk = i14;
        return obj2;
    }

    private final Object[] vipkmwdibw(Object[] objArr, int i13, int i14, Object obj, eablkybsjg eablkybsjgVar) {
        int iIobyxmoadg = agtfadlqog.iobyxmoadg(i14, i13);
        Object[] objArrPmvmpeiblj = pmvmpeiblj(objArr);
        if (i13 != 0) {
            Object obj2 = objArrPmvmpeiblj[iIobyxmoadg];
            zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrPmvmpeiblj[iIobyxmoadg] = vipkmwdibw((Object[]) obj2, i13 - 5, i14, obj, eablkybsjgVar);
            return objArrPmvmpeiblj;
        }
        if (objArrPmvmpeiblj != objArr) {
            ((AbstractList) this).modCount++;
        }
        eablkybsjgVar.zoijcleaow(objArrPmvmpeiblj[iIobyxmoadg]);
        objArrPmvmpeiblj[iIobyxmoadg] = obj;
        return objArrPmvmpeiblj;
    }

    private final Object[] wwaezpbzkn(Object[] objArr, int i13, int i14, eablkybsjg eablkybsjgVar) {
        Object[] objArrWwaezpbzkn;
        int iIobyxmoadg = agtfadlqog.iobyxmoadg(i14 - 1, i13);
        if (i13 == 5) {
            eablkybsjgVar.zoijcleaow(objArr[iIobyxmoadg]);
            objArrWwaezpbzkn = null;
        } else {
            Object obj = objArr[iIobyxmoadg];
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrWwaezpbzkn = wwaezpbzkn((Object[]) obj, i13 - 5, i14, eablkybsjgVar);
        }
        if (objArrWwaezpbzkn == null && iIobyxmoadg == 0) {
            return null;
        }
        Object[] objArrPmvmpeiblj = pmvmpeiblj(objArr);
        objArrPmvmpeiblj[iIobyxmoadg] = objArrWwaezpbzkn;
        return objArrPmvmpeiblj;
    }

    private final int wypolnanlu(tg.draadjrbmk draadjrbmkVar, Object[] objArr, int i13, eablkybsjg eablkybsjgVar) {
        Object[] objArrPmvmpeiblj = objArr;
        int i14 = i13;
        boolean z13 = false;
        for (int i15 = 0; i15 < i13; i15++) {
            Object obj = objArr[i15];
            if (((Boolean) draadjrbmkVar.invoke(obj)).booleanValue()) {
                if (!z13) {
                    objArrPmvmpeiblj = pmvmpeiblj(objArr);
                    z13 = true;
                    i14 = i15;
                }
            } else if (z13) {
                objArrPmvmpeiblj[i14] = obj;
                i14++;
            }
        }
        eablkybsjgVar.zoijcleaow(objArrPmvmpeiblj);
        return i14;
    }

    private final void ylkuphrtab(Object[] objArr, int i13, int i14) {
        if (i14 == 0) {
            this.f67225esjtqupxsv = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f67228lereixgezr = objArr;
            this.f67229pmvmpeiblj = i13;
            this.f67226iwizpuwonk = i14;
            return;
        }
        eablkybsjg eablkybsjgVar = new eablkybsjg(null);
        zdlpuopuiu.lqeggnwhkg(objArr);
        Object[] objArrWwaezpbzkn = wwaezpbzkn(objArr, i14, i13, eablkybsjgVar);
        zdlpuopuiu.lqeggnwhkg(objArrWwaezpbzkn);
        Object objIobyxmoadg = eablkybsjgVar.iobyxmoadg();
        zdlpuopuiu.nufgyqmvbu(objIobyxmoadg, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f67228lereixgezr = (Object[]) objIobyxmoadg;
        this.f67229pmvmpeiblj = i13;
        if (objArrWwaezpbzkn[1] == null) {
            this.f67225esjtqupxsv = (Object[]) objArrWwaezpbzkn[0];
            this.f67226iwizpuwonk = i14 - 5;
        } else {
            this.f67225esjtqupxsv = objArrWwaezpbzkn;
            this.f67226iwizpuwonk = i14;
        }
    }

    private final Object[] zdlpuopuiu(Object[] objArr, int i13, int i14, Object obj, eablkybsjg eablkybsjgVar) {
        Object obj2;
        int iIobyxmoadg = agtfadlqog.iobyxmoadg(i14, i13);
        if (i13 == 0) {
            eablkybsjgVar.zoijcleaow(objArr[31]);
            Object[] objArrAgtfadlqog = hg.agtfadlqog.agtfadlqog(objArr, pmvmpeiblj(objArr), iIobyxmoadg + 1, iIobyxmoadg, 31);
            objArrAgtfadlqog[iIobyxmoadg] = obj;
            return objArrAgtfadlqog;
        }
        Object[] objArrPmvmpeiblj = pmvmpeiblj(objArr);
        int i15 = i13 - 5;
        Object obj3 = objArrPmvmpeiblj[iIobyxmoadg];
        zdlpuopuiu.nufgyqmvbu(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrPmvmpeiblj[iIobyxmoadg] = zdlpuopuiu((Object[]) obj3, i15, i14, obj, eablkybsjgVar);
        while (true) {
            iIobyxmoadg++;
            if (iIobyxmoadg >= 32 || (obj2 = objArrPmvmpeiblj[iIobyxmoadg]) == null) {
                break;
            }
            zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrPmvmpeiblj[iIobyxmoadg] = zdlpuopuiu((Object[]) obj2, i15, 0, eablkybsjgVar.iobyxmoadg(), eablkybsjgVar);
        }
        return objArrPmvmpeiblj;
    }

    private final Object[] zynmafqrjb(Object[] objArr, int i13) {
        return cqumvgiudr(objArr) ? hg.agtfadlqog.agtfadlqog(objArr, objArr, i13, 0, 32 - i13) : hg.agtfadlqog.agtfadlqog(objArr, istkbnxepw(), i13, 0, 32 - i13);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iOkpsazkaxt = okpsazkaxt();
        if (iOkpsazkaxt < 32) {
            Object[] objArrPmvmpeiblj = pmvmpeiblj(this.f67228lereixgezr);
            objArrPmvmpeiblj[iOkpsazkaxt] = obj;
            this.f67228lereixgezr = objArrPmvmpeiblj;
            this.f67229pmvmpeiblj = size() + 1;
        } else {
            hkdspvbjdz(this.f67225esjtqupxsv, this.f67228lereixgezr, cdpycssgdh(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iOkpsazkaxt = okpsazkaxt();
        Iterator it = collection.iterator();
        if (32 - iOkpsazkaxt >= collection.size()) {
            this.f67228lereixgezr = draadjrbmk(pmvmpeiblj(this.f67228lereixgezr), iOkpsazkaxt, it);
            this.f67229pmvmpeiblj = size() + collection.size();
        } else {
            int size = ((collection.size() + iOkpsazkaxt) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = draadjrbmk(pmvmpeiblj(this.f67228lereixgezr), iOkpsazkaxt, it);
            for (int i13 = 1; i13 < size; i13++) {
                objArr[i13] = draadjrbmk(istkbnxepw(), 0, it);
            }
            this.f67225esjtqupxsv = jpowsppfya(this.f67225esjtqupxsv, ribwqtqdhb(), objArr);
            this.f67228lereixgezr = draadjrbmk(istkbnxepw(), 0, it);
            this.f67229pmvmpeiblj = size() + collection.size();
        }
        return true;
    }

    public final int agtfadlqog() {
        return ((AbstractList) this).modCount;
    }

    @Override // grlcpdaxtj.eablkybsjg.iobyxmoadg
    public grlcpdaxtj.eablkybsjg build() {
        grlcpdaxtj.eablkybsjg gxszxtbevoVar;
        if (this.f67225esjtqupxsv == this.f67230yggfygwlhe && this.f67228lereixgezr == this.f67227jyumaefscl) {
            gxszxtbevoVar = this.f67231zdlpuopuiu;
        } else {
            this.f67224cqumvgiudr = new fmlbqenlif.eablkybsjg();
            Object[] objArr = this.f67225esjtqupxsv;
            this.f67230yggfygwlhe = objArr;
            Object[] objArr2 = this.f67228lereixgezr;
            this.f67227jyumaefscl = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f67225esjtqupxsv;
                zdlpuopuiu.lqeggnwhkg(objArr3);
                gxszxtbevoVar = new gxszxtbevo(objArr3, this.f67228lereixgezr, size(), this.f67226iwizpuwonk);
            } else if (objArr2.length == 0) {
                gxszxtbevoVar = agtfadlqog.zoijcleaow();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.f67228lereixgezr, size());
                zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
                gxszxtbevoVar = new draadjrbmk(objArrCopyOf);
            }
        }
        this.f67231zdlpuopuiu = gxszxtbevoVar;
        return gxszxtbevoVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i13) {
        fmlbqenlif.wkgbmnqykc.iobyxmoadg(i13, size());
        return btonecajqb(i13)[i13 & 31];
    }

    @Override // hg.nufgyqmvbu
    public int iobyxmoadg() {
        return this.f67229pmvmpeiblj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final boolean mbcevpiqjq(tg.draadjrbmk draadjrbmkVar) {
        boolean zStevsuqkhv = stevsuqkhv(draadjrbmkVar);
        if (zStevsuqkhv) {
            ((AbstractList) this).modCount++;
        }
        return zStevsuqkhv;
    }

    public final Object[] ojitshcjhn() {
        return this.f67225esjtqupxsv;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection collection) {
        return mbcevpiqjq(new tg.draadjrbmk() { // from class: mhtqkkgtqm.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(nufgyqmvbu.kegysxyocb(collection, obj));
            }
        });
    }

    public final int rgvfuqvkyq() {
        return this.f67226iwizpuwonk;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i13, Object obj) {
        fmlbqenlif.wkgbmnqykc.iobyxmoadg(i13, size());
        if (ribwqtqdhb() > i13) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(null);
            Object[] objArr = this.f67225esjtqupxsv;
            zdlpuopuiu.lqeggnwhkg(objArr);
            this.f67225esjtqupxsv = vipkmwdibw(objArr, this.f67226iwizpuwonk, i13, obj, eablkybsjgVar);
            return eablkybsjgVar.iobyxmoadg();
        }
        Object[] objArrPmvmpeiblj = pmvmpeiblj(this.f67228lereixgezr);
        if (objArrPmvmpeiblj != this.f67228lereixgezr) {
            ((AbstractList) this).modCount++;
        }
        int i14 = i13 & 31;
        Object obj2 = objArrPmvmpeiblj[i14];
        objArrPmvmpeiblj[i14] = obj;
        this.f67228lereixgezr = objArrPmvmpeiblj;
        return obj2;
    }

    public final Object[] vdvldrhtss() {
        return this.f67228lereixgezr;
    }

    @Override // hg.nufgyqmvbu
    public Object wkgbmnqykc(int i13) {
        fmlbqenlif.wkgbmnqykc.iobyxmoadg(i13, size());
        ((AbstractList) this).modCount++;
        int iRibwqtqdhb = ribwqtqdhb();
        if (i13 >= iRibwqtqdhb) {
            return ulzqkzuiru(this.f67225esjtqupxsv, iRibwqtqdhb, this.f67226iwizpuwonk, i13 - iRibwqtqdhb);
        }
        eablkybsjg eablkybsjgVar = new eablkybsjg(this.f67228lereixgezr[0]);
        Object[] objArr = this.f67225esjtqupxsv;
        zdlpuopuiu.lqeggnwhkg(objArr);
        ulzqkzuiru(ntlheqmsrt(objArr, this.f67226iwizpuwonk, i13, eablkybsjgVar), iRibwqtqdhb, this.f67226iwizpuwonk, 0);
        return eablkybsjgVar.iobyxmoadg();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i13) {
        fmlbqenlif.wkgbmnqykc.zoijcleaow(i13, size());
        return new btonecajqb(this, i13);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i13, Object obj) {
        fmlbqenlif.wkgbmnqykc.zoijcleaow(i13, size());
        if (i13 == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iRibwqtqdhb = ribwqtqdhb();
        if (i13 >= iRibwqtqdhb) {
            jyumaefscl(this.f67225esjtqupxsv, i13 - iRibwqtqdhb, obj);
            return;
        }
        eablkybsjg eablkybsjgVar = new eablkybsjg(null);
        Object[] objArr = this.f67225esjtqupxsv;
        zdlpuopuiu.lqeggnwhkg(objArr);
        jyumaefscl(zdlpuopuiu(objArr, this.f67226iwizpuwonk, i13, obj, eablkybsjgVar), 0, eablkybsjgVar.iobyxmoadg());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i13, Collection collection) {
        Object[] objArrAgtfadlqog;
        fmlbqenlif.wkgbmnqykc.zoijcleaow(i13, size());
        if (i13 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i14 = (i13 >> 5) << 5;
        int size = (((size() - i14) + collection.size()) - 1) / 32;
        if (size == 0) {
            fmlbqenlif.iobyxmoadg.iobyxmoadg(i13 >= ribwqtqdhb());
            int i15 = i13 & 31;
            int size2 = ((i13 + collection.size()) - 1) & 31;
            Object[] objArr = this.f67228lereixgezr;
            Object[] objArrAgtfadlqog2 = hg.agtfadlqog.agtfadlqog(objArr, pmvmpeiblj(objArr), size2 + 1, i15, okpsazkaxt());
            draadjrbmk(objArrAgtfadlqog2, i15, collection.iterator());
            this.f67228lereixgezr = objArrAgtfadlqog2;
            this.f67229pmvmpeiblj = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iOkpsazkaxt = okpsazkaxt();
        int iJztzpxfvev = jztzpxfvev(size() + collection.size());
        if (i13 >= ribwqtqdhb()) {
            objArrAgtfadlqog = istkbnxepw();
            ikoacuggdj(collection, i13, this.f67228lereixgezr, iOkpsazkaxt, objArr2, size, objArrAgtfadlqog);
        } else if (iJztzpxfvev > iOkpsazkaxt) {
            int i16 = iJztzpxfvev - iOkpsazkaxt;
            objArrAgtfadlqog = zynmafqrjb(this.f67228lereixgezr, i16);
            kcexrzcfyt(collection, i13, i16, objArr2, size, objArrAgtfadlqog);
        } else {
            int i17 = iOkpsazkaxt - iJztzpxfvev;
            objArrAgtfadlqog = hg.agtfadlqog.agtfadlqog(this.f67228lereixgezr, istkbnxepw(), 0, i17, iOkpsazkaxt);
            int i18 = 32 - i17;
            Object[] objArrZynmafqrjb = zynmafqrjb(this.f67228lereixgezr, i18);
            int i19 = size - 1;
            objArr2[i19] = objArrZynmafqrjb;
            kcexrzcfyt(collection, i13, i18, objArr2, i19, objArrZynmafqrjb);
        }
        this.f67225esjtqupxsv = jpowsppfya(this.f67225esjtqupxsv, i14, objArr2);
        this.f67228lereixgezr = objArrAgtfadlqog;
        this.f67229pmvmpeiblj = size() + collection.size();
        return true;
    }
}
