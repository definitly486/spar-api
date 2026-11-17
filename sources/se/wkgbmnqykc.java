package se;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final int[][] f106042eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[][] f106044wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f106046iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final String[] f106045zoijcleaow = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final int[][] f106043ppxfxbqfkf = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    class iobyxmoadg implements Comparator {
        iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(gxszxtbevo gxszxtbevoVar, gxszxtbevo gxszxtbevoVar2) {
            return gxszxtbevoVar.eablkybsjg() - gxszxtbevoVar2.eablkybsjg();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, UserVerificationMethods.USER_VERIFY_HANDPRINT);
        f106044wkgbmnqykc = iArr;
        iArr[0][32] = 1;
        for (int i13 = 65; i13 <= 90; i13++) {
            f106044wkgbmnqykc[0][i13] = i13 - 63;
        }
        f106044wkgbmnqykc[1][32] = 1;
        for (int i14 = 97; i14 <= 122; i14++) {
            f106044wkgbmnqykc[1][i14] = i14 - 95;
        }
        f106044wkgbmnqykc[2][32] = 1;
        for (int i15 = 48; i15 <= 57; i15++) {
            f106044wkgbmnqykc[2][i15] = i15 - 46;
        }
        int[] iArr2 = f106044wkgbmnqykc[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i16 = 0; i16 < 28; i16++) {
            f106044wkgbmnqykc[3][iArr3[i16]] = i16;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i17 = 0; i17 < 31; i17++) {
            int i18 = iArr4[i17];
            if (i18 > 0) {
                f106044wkgbmnqykc[4][i18] = i17;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f106042eablkybsjg = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f106042eablkybsjg;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public wkgbmnqykc(byte[] bArr) {
        this.f106046iobyxmoadg = bArr;
    }

    private Collection eablkybsjg(Iterable iterable, int i13) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ppxfxbqfkf((gxszxtbevo) it.next(), i13, linkedList);
        }
        return zoijcleaow(linkedList);
    }

    private static Collection gxszxtbevo(Iterable iterable, int i13, int i14) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            wkgbmnqykc((gxszxtbevo) it.next(), i13, i14, linkedList);
        }
        return zoijcleaow(linkedList);
    }

    private void ppxfxbqfkf(gxszxtbevo gxszxtbevoVar, int i13, Collection collection) {
        char c13 = (char) (this.f106046iobyxmoadg[i13] & 255);
        boolean z13 = f106044wkgbmnqykc[gxszxtbevoVar.gxszxtbevo()][c13] > 0;
        gxszxtbevo gxszxtbevoVarPpxfxbqfkf = null;
        for (int i14 = 0; i14 <= 4; i14++) {
            int i15 = f106044wkgbmnqykc[i14][c13];
            if (i15 > 0) {
                if (gxszxtbevoVarPpxfxbqfkf == null) {
                    gxszxtbevoVarPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf(i13);
                }
                if (!z13 || i14 == gxszxtbevoVar.gxszxtbevo() || i14 == 2) {
                    collection.add(gxszxtbevoVarPpxfxbqfkf.nufgyqmvbu(i14, i15));
                }
                if (!z13 && f106042eablkybsjg[gxszxtbevoVar.gxszxtbevo()][i14] >= 0) {
                    collection.add(gxszxtbevoVarPpxfxbqfkf.dxjokdxxww(i14, i15));
                }
            }
        }
        if (gxszxtbevoVar.wkgbmnqykc() > 0 || f106044wkgbmnqykc[gxszxtbevoVar.gxszxtbevo()][c13] == 0) {
            collection.add(gxszxtbevoVar.iobyxmoadg(i13));
        }
    }

    private static void wkgbmnqykc(gxszxtbevo gxszxtbevoVar, int i13, int i14, Collection collection) {
        gxszxtbevo gxszxtbevoVarPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf(i13);
        collection.add(gxszxtbevoVarPpxfxbqfkf.nufgyqmvbu(4, i14));
        if (gxszxtbevoVar.gxszxtbevo() != 4) {
            collection.add(gxszxtbevoVarPpxfxbqfkf.dxjokdxxww(4, i14));
        }
        if (i14 == 3 || i14 == 4) {
            collection.add(gxszxtbevoVarPpxfxbqfkf.nufgyqmvbu(2, 16 - i14).nufgyqmvbu(2, 1));
        }
        if (gxszxtbevoVar.wkgbmnqykc() > 0) {
            collection.add(gxszxtbevoVar.iobyxmoadg(i13).iobyxmoadg(i13 + 1));
        }
    }

    private static Collection zoijcleaow(Iterable iterable) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) it.next();
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList.add(gxszxtbevoVar);
                    break;
                }
                gxszxtbevo gxszxtbevoVar2 = (gxszxtbevo) it2.next();
                if (gxszxtbevoVar2.lqeggnwhkg(gxszxtbevoVar)) {
                    break;
                }
                if (gxszxtbevoVar.lqeggnwhkg(gxszxtbevoVar2)) {
                    it2.remove();
                }
            }
        }
        return linkedList;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public te.iobyxmoadg iobyxmoadg() {
        int i13;
        Collection collectionSingletonList = Collections.singletonList(gxszxtbevo.f106029eablkybsjg);
        int i14 = 0;
        while (true) {
            byte[] bArr = this.f106046iobyxmoadg;
            if (i14 >= bArr.length) {
                return ((gxszxtbevo) Collections.min(collectionSingletonList, new iobyxmoadg())).btonecajqb(this.f106046iobyxmoadg);
            }
            int i15 = i14 + 1;
            byte b13 = i15 < bArr.length ? bArr[i15] : (byte) 0;
            byte b14 = bArr[i14];
            if (b14 != 13) {
                if (b14 != 44) {
                    if (b14 != 46) {
                        if (b14 == 58 && b13 == 32) {
                            i13 = 5;
                        } else {
                            i13 = 0;
                        }
                    } else if (b13 == 32) {
                        i13 = 3;
                    } else {
                        i13 = 0;
                    }
                } else if (b13 == 32) {
                    i13 = 4;
                } else {
                    i13 = 0;
                }
            } else if (b13 == 10) {
                i13 = 2;
            } else {
                i13 = 0;
            }
            if (i13 > 0) {
                collectionSingletonList = gxszxtbevo(collectionSingletonList, i14, i13);
                i14 = i15;
            } else {
                collectionSingletonList = eablkybsjg(collectionSingletonList, i14);
            }
            i14++;
        }
    }
}
