package org.xbill.DNS;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class c3 extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private byte[] f74269lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f74270pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int[] f74271zynmafqrjb;

    c3() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(gxszxtbevo.btonecajqb(this.f74269lereixgezr));
        sb3.append(" ");
        sb3.append(this.f74270pmvmpeiblj);
        for (int i13 : this.f74271zynmafqrjb) {
            sb3.append(" ");
            sb3.append(i13);
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.gxszxtbevo(this.f74269lereixgezr);
        jyumaefsclVar.draadjrbmk(this.f74270pmvmpeiblj);
        int[] iArr = this.f74271zynmafqrjb;
        byte[] bArr = new byte[(iArr[iArr.length - 1] / 8) + 1];
        for (int i13 : iArr) {
            int i14 = i13 / 8;
            bArr[i14] = (byte) ((1 << (7 - (i13 % 8))) | bArr[i14]);
        }
        jyumaefsclVar.gxszxtbevo(bArr);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74269lereixgezr = zdlpuopuiuVar.gxszxtbevo(4);
        this.f74270pmvmpeiblj = zdlpuopuiuVar.btonecajqb();
        byte[] bArrEablkybsjg = zdlpuopuiuVar.eablkybsjg();
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < bArrEablkybsjg.length; i13++) {
            for (int i14 = 0; i14 < 8; i14++) {
                if ((bArrEablkybsjg[i13] & 255 & (1 << (7 - i14))) != 0) {
                    arrayList.add(Integer.valueOf((i13 * 8) + i14));
                }
            }
        }
        this.f74271zynmafqrjb = new int[arrayList.size()];
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            this.f74271zynmafqrjb[i15] = ((Integer) arrayList.get(i15)).intValue();
        }
    }
}
