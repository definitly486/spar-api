package q4;

import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import t3.dsvhmnatus;
import t3.ylkuphrtab;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public class agtfadlqog implements t3.rgvfuqvkyq {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private long[] f77804btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f77805dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f77807gtknphoqwx;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f77809iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private dsvhmnatus f77810lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f77811nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.media3.common.iobyxmoadg f77812ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f77813wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f77814zoijcleaow = new wkgbmnqykc();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private byte[] f77808gxszxtbevo = stevsuqkhv.f123601gxszxtbevo;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yadqdtsiqt f77806eablkybsjg = new yadqdtsiqt();

    private static class zoijcleaow implements Comparable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final byte[] f77815yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final long f77816zdlpuopuiu;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public int compareTo(zoijcleaow zoijcleaowVar) {
            return Long.compare(this.f77816zdlpuopuiu, zoijcleaowVar.f77816zdlpuopuiu);
        }

        private zoijcleaow(long j13, byte[] bArr) {
            this.f77816zdlpuopuiu = j13;
            this.f77815yggfygwlhe = bArr;
        }
    }

    public agtfadlqog(oxmwwwfdhm oxmwwwfdhmVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        this.f77809iobyxmoadg = oxmwwwfdhmVar;
        this.f77812ppxfxbqfkf = iobyxmoadgVar != null ? iobyxmoadgVar.zoijcleaow().zeieaojujs("application/x-media3-cues").tzroggbefp(iobyxmoadgVar.f9769ojitshcjhn).sopmlzcsov(oxmwwwfdhmVar.wkgbmnqykc()).cllcsxoeiz() : null;
        this.f77813wkgbmnqykc = new ArrayList();
        this.f77805dxjokdxxww = 0;
        this.f77804btonecajqb = stevsuqkhv.f123603lqeggnwhkg;
        this.f77807gtknphoqwx = -9223372036854775807L;
    }

    private boolean btonecajqb(t3.vdvldrhtss vdvldrhtssVar) {
        return vdvldrhtssVar.btonecajqb((vdvldrhtssVar.getLength() > (-1L) ? 1 : (vdvldrhtssVar.getLength() == (-1L) ? 0 : -1)) != 0 ? com.google.common.primitives.gxszxtbevo.wkgbmnqykc(vdvldrhtssVar.getLength()) : UserVerificationMethods.USER_VERIFY_ALL) == -1;
    }

    private void gtknphoqwx() {
        long j13 = this.f77807gtknphoqwx;
        for (int iLqeggnwhkg = j13 == -9223372036854775807L ? 0 : stevsuqkhv.lqeggnwhkg(this.f77804btonecajqb, j13, true, true); iLqeggnwhkg < this.f77813wkgbmnqykc.size(); iLqeggnwhkg++) {
            wflxmlrfwp((zoijcleaow) this.f77813wkgbmnqykc.get(iLqeggnwhkg));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gxszxtbevo(eablkybsjg eablkybsjgVar) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(eablkybsjgVar.f77822zoijcleaow, this.f77814zoijcleaow.iobyxmoadg(eablkybsjgVar.f77819iobyxmoadg, eablkybsjgVar.f77820ppxfxbqfkf));
        this.f77813wkgbmnqykc.add(zoijcleaowVar);
        long j13 = this.f77807gtknphoqwx;
        if (j13 == -9223372036854775807L || eablkybsjgVar.f77822zoijcleaow >= j13) {
            wflxmlrfwp(zoijcleaowVar);
        }
    }

    private void lqeggnwhkg() throws ParserException {
        try {
            long j13 = this.f77807gtknphoqwx;
            this.f77809iobyxmoadg.ppxfxbqfkf(this.f77808gxszxtbevo, 0, this.f77811nufgyqmvbu, j13 != -9223372036854775807L ? oxmwwwfdhm.zoijcleaow.ppxfxbqfkf(j13) : oxmwwwfdhm.zoijcleaow.zoijcleaow(), new y2.wflxmlrfwp() { // from class: q4.wflxmlrfwp
                @Override // y2.wflxmlrfwp
                public final void accept(Object obj) {
                    this.f77838iobyxmoadg.gxszxtbevo((eablkybsjg) obj);
                }
            });
            Collections.sort(this.f77813wkgbmnqykc);
            this.f77804btonecajqb = new long[this.f77813wkgbmnqykc.size()];
            for (int i13 = 0; i13 < this.f77813wkgbmnqykc.size(); i13++) {
                this.f77804btonecajqb[i13] = ((zoijcleaow) this.f77813wkgbmnqykc.get(i13)).f77816zdlpuopuiu;
            }
            this.f77808gxszxtbevo = stevsuqkhv.f123601gxszxtbevo;
        } catch (RuntimeException e13) {
            throw ParserException.iobyxmoadg("SubtitleParser failed.", e13);
        }
    }

    private boolean nufgyqmvbu(t3.vdvldrhtss vdvldrhtssVar) {
        byte[] bArr = this.f77808gxszxtbevo;
        if (bArr.length == this.f77811nufgyqmvbu) {
            this.f77808gxszxtbevo = Arrays.copyOf(bArr, bArr.length + UserVerificationMethods.USER_VERIFY_ALL);
        }
        byte[] bArr2 = this.f77808gxszxtbevo;
        int i13 = this.f77811nufgyqmvbu;
        int iZoijcleaow = vdvldrhtssVar.zoijcleaow(bArr2, i13, bArr2.length - i13);
        if (iZoijcleaow != -1) {
            this.f77811nufgyqmvbu += iZoijcleaow;
        }
        long length = vdvldrhtssVar.getLength();
        return (length != -1 && ((long) this.f77811nufgyqmvbu) == length) || iZoijcleaow == -1;
    }

    private void wflxmlrfwp(zoijcleaow zoijcleaowVar) {
        y2.iobyxmoadg.dxjokdxxww(this.f77810lqeggnwhkg);
        int length = zoijcleaowVar.f77815yggfygwlhe.length;
        this.f77806eablkybsjg.mbcevpiqjq(zoijcleaowVar.f77815yggfygwlhe);
        this.f77810lqeggnwhkg.lqeggnwhkg(this.f77806eablkybsjg, length);
        this.f77810lqeggnwhkg.zoijcleaow(zoijcleaowVar.f77816zdlpuopuiu, 1, length, 0, null);
    }

    @Override // t3.rgvfuqvkyq
    public boolean draadjrbmk(t3.vdvldrhtss vdvldrhtssVar) {
        return true;
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        int i13 = this.f77805dxjokdxxww;
        y2.iobyxmoadg.lqeggnwhkg((i13 == 0 || i13 == 5) ? false : true);
        this.f77807gtknphoqwx = j14;
        if (this.f77805dxjokdxxww == 2) {
            this.f77805dxjokdxxww = 1;
        }
        if (this.f77805dxjokdxxww == 4) {
            this.f77805dxjokdxxww = 3;
        }
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(t3.oxmwwwfdhm oxmwwwfdhmVar) {
        y2.iobyxmoadg.lqeggnwhkg(this.f77805dxjokdxxww == 0);
        dsvhmnatus dsvhmnatusVarKcexrzcfyt = oxmwwwfdhmVar.kcexrzcfyt(0, 3);
        this.f77810lqeggnwhkg = dsvhmnatusVarKcexrzcfyt;
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = this.f77812ppxfxbqfkf;
        if (iobyxmoadgVar != null) {
            dsvhmnatusVarKcexrzcfyt.iobyxmoadg(iobyxmoadgVar);
            oxmwwwfdhmVar.agtfadlqog();
            oxmwwwfdhmVar.gxszxtbevo(new t3.yadqdtsiqt(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f77805dxjokdxxww = 1;
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
        if (this.f77805dxjokdxxww == 5) {
            return;
        }
        this.f77809iobyxmoadg.zoijcleaow();
        this.f77805dxjokdxxww = 5;
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(t3.vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) throws ParserException {
        int i13 = this.f77805dxjokdxxww;
        y2.iobyxmoadg.lqeggnwhkg((i13 == 0 || i13 == 5) ? false : true);
        if (this.f77805dxjokdxxww == 1) {
            int iWkgbmnqykc = vdvldrhtssVar.getLength() != -1 ? com.google.common.primitives.gxszxtbevo.wkgbmnqykc(vdvldrhtssVar.getLength()) : UserVerificationMethods.USER_VERIFY_ALL;
            if (iWkgbmnqykc > this.f77808gxszxtbevo.length) {
                this.f77808gxszxtbevo = new byte[iWkgbmnqykc];
            }
            this.f77811nufgyqmvbu = 0;
            this.f77805dxjokdxxww = 2;
        }
        if (this.f77805dxjokdxxww == 2 && nufgyqmvbu(vdvldrhtssVar)) {
            lqeggnwhkg();
            this.f77805dxjokdxxww = 4;
        }
        if (this.f77805dxjokdxxww == 3 && btonecajqb(vdvldrhtssVar)) {
            gtknphoqwx();
            this.f77805dxjokdxxww = 4;
        }
        return this.f77805dxjokdxxww == 4 ? -1 : 0;
    }
}
