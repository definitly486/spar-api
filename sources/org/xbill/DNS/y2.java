package org.xbill.DNS;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
final class y2 implements Serializable {
    private static final long serialVersionUID = -125354057735389003L;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final TreeSet f74594zdlpuopuiu;

    private y2() {
        this.f74594zdlpuopuiu = new TreeSet();
    }

    private static void wkgbmnqykc(jyumaefscl jyumaefsclVar, TreeSet treeSet, int i13) {
        int iIntValue = ((((Integer) treeSet.last()).intValue() & KotlinVersion.MAX_COMPONENT_VALUE) / 8) + 1;
        int[] iArr = new int[iIntValue];
        jyumaefsclVar.draadjrbmk(i13);
        jyumaefsclVar.draadjrbmk(iIntValue);
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Integer) it.next()).intValue();
            int i14 = (iIntValue2 & KotlinVersion.MAX_COMPONENT_VALUE) / 8;
            iArr[i14] = (1 << (7 - (iIntValue2 % 8))) | iArr[i14];
        }
        for (int i15 = 0; i15 < iIntValue; i15++) {
            jyumaefsclVar.draadjrbmk(iArr[i15]);
        }
    }

    public boolean iobyxmoadg() {
        return this.f74594zdlpuopuiu.isEmpty();
    }

    public void lqeggnwhkg(jyumaefscl jyumaefsclVar) {
        if (this.f74594zdlpuopuiu.size() == 0) {
            return;
        }
        TreeSet treeSet = new TreeSet();
        int i13 = -1;
        for (Integer num : this.f74594zdlpuopuiu) {
            int iIntValue = num.intValue() >> 8;
            if (iIntValue != i13) {
                if (treeSet.size() > 0) {
                    wkgbmnqykc(jyumaefsclVar, treeSet, i13);
                    treeSet.clear();
                }
                i13 = iIntValue;
            }
            treeSet.add(num);
        }
        wkgbmnqykc(jyumaefsclVar, treeSet, i13);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        Iterator it = this.f74594zdlpuopuiu.iterator();
        while (it.hasNext()) {
            sb3.append(x2.wkgbmnqykc(((Integer) it.next()).intValue()));
            if (it.hasNext()) {
                sb3.append(' ');
            }
        }
        return sb3.toString();
    }

    public y2(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        this();
        while (zdlpuopuiuVar.gtknphoqwx() > 0) {
            if (zdlpuopuiuVar.gtknphoqwx() >= 2) {
                int iBtonecajqb = zdlpuopuiuVar.btonecajqb();
                if (iBtonecajqb >= -1) {
                    int iBtonecajqb2 = zdlpuopuiuVar.btonecajqb();
                    if (iBtonecajqb2 > zdlpuopuiuVar.gtknphoqwx()) {
                        throw new WireParseException("invalid bitmap");
                    }
                    for (int i13 = 0; i13 < iBtonecajqb2; i13++) {
                        int iBtonecajqb3 = zdlpuopuiuVar.btonecajqb();
                        if (iBtonecajqb3 != 0) {
                            for (int i14 = 0; i14 < 8; i14++) {
                                if (((1 << (7 - i14)) & iBtonecajqb3) != 0) {
                                    this.f74594zdlpuopuiu.add(Integer.valueOf((iBtonecajqb * UserVerificationMethods.USER_VERIFY_HANDPRINT) + (i13 * 8) + i14));
                                }
                            }
                        }
                    }
                } else {
                    throw new WireParseException("invalid ordering");
                }
            } else {
                throw new WireParseException("invalid bitmap descriptor");
            }
        }
    }
}
