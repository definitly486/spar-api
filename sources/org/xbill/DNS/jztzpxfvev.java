package org.xbill.DNS;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes3.dex */
public class jztzpxfvev extends e {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final NumberFormat f74434iozdgvuglv;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final NumberFormat f74435lmojexxdyd;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private long f74436cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private long f74437istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private long f74438lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private long f74439pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private long f74440yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private long f74441zynmafqrjb;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        f74434iozdgvuglv = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(2);
        DecimalFormat decimalFormat2 = new DecimalFormat();
        f74435lmojexxdyd = decimalFormat2;
        decimalFormat2.setMinimumIntegerDigits(3);
    }

    jztzpxfvev() {
    }

    private void crxdokpmqz(StringBuilder sb3, NumberFormat numberFormat, long j13, long j14) {
        sb3.append(j13 / j14);
        long j15 = j13 % j14;
        if (j15 != 0) {
            sb3.append(".");
            sb3.append(numberFormat.format(j15));
        }
    }

    private int jlmebxxoox(long j13) {
        byte b13 = 0;
        while (j13 > 9) {
            b13 = (byte) (b13 + 1);
            j13 /= 10;
        }
        return (int) ((j13 << 4) + ((long) (b13 & 255)));
    }

    private String sopmlzcsov(long j13, char c13, char c14) {
        StringBuilder sb3 = new StringBuilder();
        long j14 = j13 - 2147483648L;
        if (j14 < 0) {
            j14 = -j14;
            c13 = c14;
        }
        sb3.append(j14 / 3600000);
        long j15 = j14 % 3600000;
        sb3.append(" ");
        sb3.append(j15 / 60000);
        sb3.append(" ");
        crxdokpmqz(sb3, f74435lmojexxdyd, j15 % 60000, 1000L);
        sb3.append(" ");
        sb3.append(c13);
        return sb3.toString();
    }

    private static long ulzqkzuiru(int i13) throws WireParseException {
        long j13 = i13 >> 4;
        int i14 = i13 & 15;
        if (j13 > 9 || i14 > 9) {
            throw new WireParseException("Invalid LOC Encoding");
        }
        while (true) {
            int i15 = i14 - 1;
            if (i14 <= 0) {
                return j13;
            }
            j13 *= 10;
            i14 = i15;
        }
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sopmlzcsov(this.f74437istkbnxepw, 'N', 'S'));
        sb3.append(" ");
        sb3.append(sopmlzcsov(this.f74436cdpycssgdh, 'E', 'W'));
        sb3.append(" ");
        NumberFormat numberFormat = f74434iozdgvuglv;
        crxdokpmqz(sb3, numberFormat, this.f74440yadqdtsiqt - 10000000, 100L);
        sb3.append("m ");
        crxdokpmqz(sb3, numberFormat, this.f74438lereixgezr, 100L);
        sb3.append("m ");
        crxdokpmqz(sb3, numberFormat, this.f74439pmvmpeiblj, 100L);
        sb3.append("m ");
        crxdokpmqz(sb3, numberFormat, this.f74441zynmafqrjb, 100L);
        sb3.append("m");
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.draadjrbmk(0);
        jyumaefsclVar.draadjrbmk(jlmebxxoox(this.f74438lereixgezr));
        jyumaefsclVar.draadjrbmk(jlmebxxoox(this.f74439pmvmpeiblj));
        jyumaefsclVar.draadjrbmk(jlmebxxoox(this.f74441zynmafqrjb));
        jyumaefsclVar.gtknphoqwx(this.f74437istkbnxepw);
        jyumaefsclVar.gtknphoqwx(this.f74436cdpycssgdh);
        jyumaefsclVar.gtknphoqwx(this.f74440yadqdtsiqt);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        if (zdlpuopuiuVar.btonecajqb() != 0) {
            throw new WireParseException("Invalid LOC version");
        }
        this.f74438lereixgezr = ulzqkzuiru(zdlpuopuiuVar.btonecajqb());
        this.f74439pmvmpeiblj = ulzqkzuiru(zdlpuopuiuVar.btonecajqb());
        this.f74441zynmafqrjb = ulzqkzuiru(zdlpuopuiuVar.btonecajqb());
        this.f74437istkbnxepw = zdlpuopuiuVar.dxjokdxxww();
        this.f74436cdpycssgdh = zdlpuopuiuVar.dxjokdxxww();
        this.f74440yadqdtsiqt = zdlpuopuiuVar.dxjokdxxww();
    }
}
