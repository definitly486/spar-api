package org.xbill.DNS;

import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class uawqvzlxes extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private auzgnhcxok f74520lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private BitSet f74521pmvmpeiblj;

    uawqvzlxes() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74520lereixgezr);
        int length = this.f74521pmvmpeiblj.length();
        for (short s13 = 0; s13 < length; s13 = (short) (s13 + 1)) {
            if (this.f74521pmvmpeiblj.get(s13)) {
                sb3.append(" ");
                sb3.append(x2.wkgbmnqykc(s13));
            }
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        this.f74520lereixgezr.lmojexxdyd(jyumaefsclVar, null, z13);
        int length = this.f74521pmvmpeiblj.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            i13 |= this.f74521pmvmpeiblj.get(i14) ? 1 << (7 - (i14 % 8)) : 0;
            if (i14 % 8 == 7 || i14 == length - 1) {
                jyumaefsclVar.draadjrbmk(i13);
                i13 = 0;
            }
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        this.f74520lereixgezr = new auzgnhcxok(zdlpuopuiuVar);
        this.f74521pmvmpeiblj = new BitSet();
        int iGtknphoqwx = zdlpuopuiuVar.gtknphoqwx();
        for (int i13 = 0; i13 < iGtknphoqwx; i13++) {
            int iBtonecajqb = zdlpuopuiuVar.btonecajqb();
            for (int i14 = 0; i14 < 8; i14++) {
                if (((1 << (7 - i14)) & iBtonecajqb) != 0) {
                    this.f74521pmvmpeiblj.set((i13 * 8) + i14);
                }
            }
        }
    }
}
