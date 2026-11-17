package n4;

import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import t3.istkbnxepw;
import t3.kegysxyocb;
import t3.wwaezpbzkn;
import t3.zynmafqrjb;
import y2.cdpycssgdh;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final byte[] f68724iobyxmoadg = stevsuqkhv.opjhrmiecq("OpusHead");

    static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f68725eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final yadqdtsiqt f68726iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f68727ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f68728wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f68729zoijcleaow;

        public btonecajqb(z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkf) {
            yadqdtsiqt yadqdtsiqtVar = c3260ppxfxbqfkf.f127708zoijcleaow;
            this.f68726iobyxmoadg = yadqdtsiqtVar;
            yadqdtsiqtVar.sopmlzcsov(12);
            this.f68727ppxfxbqfkf = yadqdtsiqtVar.jpowsppfya() & KotlinVersion.MAX_COMPONENT_VALUE;
            this.f68729zoijcleaow = yadqdtsiqtVar.jpowsppfya();
        }

        @Override // n4.zoijcleaow.gxszxtbevo
        public int iobyxmoadg() {
            int i13 = this.f68727ppxfxbqfkf;
            if (i13 == 8) {
                return this.f68726iobyxmoadg.wwaezpbzkn();
            }
            if (i13 == 16) {
                return this.f68726iobyxmoadg.wypolnanlu();
            }
            int i14 = this.f68728wkgbmnqykc;
            this.f68728wkgbmnqykc = i14 + 1;
            if (i14 % 2 != 0) {
                return this.f68725eablkybsjg & 15;
            }
            int iWwaezpbzkn = this.f68726iobyxmoadg.wwaezpbzkn();
            this.f68725eablkybsjg = iWwaezpbzkn;
            return (iWwaezpbzkn & 240) >> 4;
        }

        @Override // n4.zoijcleaow.gxszxtbevo
        public int ppxfxbqfkf() {
            return this.f68729zoijcleaow;
        }

        @Override // n4.zoijcleaow.gxszxtbevo
        public int zoijcleaow() {
            return -1;
        }
    }

    static final class draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wkgbmnqykc f68730iobyxmoadg;

        public draadjrbmk(wkgbmnqykc wkgbmnqykcVar) {
            this.f68730iobyxmoadg = wkgbmnqykcVar;
        }

        public boolean zoijcleaow() {
            wkgbmnqykc wkgbmnqykcVar = this.f68730iobyxmoadg;
            return wkgbmnqykcVar != null && wkgbmnqykcVar.f68754iobyxmoadg.f68743iobyxmoadg && this.f68730iobyxmoadg.f68754iobyxmoadg.f68745zoijcleaow;
        }
    }

    static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f68731iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final yadqdtsiqt f68732ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f68733zoijcleaow;

        public dxjokdxxww(z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkf, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            yadqdtsiqt yadqdtsiqtVar = c3260ppxfxbqfkf.f127708zoijcleaow;
            this.f68732ppxfxbqfkf = yadqdtsiqtVar;
            yadqdtsiqtVar.sopmlzcsov(12);
            int iJpowsppfya = yadqdtsiqtVar.jpowsppfya();
            if ("audio/raw".equals(iobyxmoadgVar.f9769ojitshcjhn)) {
                int iMetgxyhuhe = stevsuqkhv.metgxyhuhe(iobyxmoadgVar.f9766lmojexxdyd, iobyxmoadgVar.f9779yadqdtsiqt);
                if (iJpowsppfya == 0 || iJpowsppfya % iMetgxyhuhe != 0) {
                    y2.kcexrzcfyt.nufgyqmvbu("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iMetgxyhuhe + ", stsz sample size: " + iJpowsppfya);
                    iJpowsppfya = iMetgxyhuhe;
                }
            }
            this.f68731iobyxmoadg = iJpowsppfya == 0 ? -1 : iJpowsppfya;
            this.f68733zoijcleaow = yadqdtsiqtVar.jpowsppfya();
        }

        @Override // n4.zoijcleaow.gxszxtbevo
        public int iobyxmoadg() {
            int i13 = this.f68731iobyxmoadg;
            return i13 == -1 ? this.f68732ppxfxbqfkf.jpowsppfya() : i13;
        }

        @Override // n4.zoijcleaow.gxszxtbevo
        public int ppxfxbqfkf() {
            return this.f68733zoijcleaow;
        }

        @Override // n4.zoijcleaow.gxszxtbevo
        public int zoijcleaow() {
            return this.f68731iobyxmoadg;
        }
    }

    private static final class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final long f68734iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f68735ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long f68736zoijcleaow;

        public eablkybsjg(long j13, long j14, String str) {
            this.f68734iobyxmoadg = j13;
            this.f68736zoijcleaow = j14;
            this.f68735ppxfxbqfkf = str;
        }
    }

    private static final class gtknphoqwx {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f68737iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f68738ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f68739wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long f68740zoijcleaow;

        public gtknphoqwx(int i13, long j13, int i14, int i15) {
            this.f68737iobyxmoadg = i13;
            this.f68740zoijcleaow = j13;
            this.f68738ppxfxbqfkf = i14;
            this.f68739wkgbmnqykc = i15;
        }
    }

    private interface gxszxtbevo {
        int iobyxmoadg();

        int ppxfxbqfkf();

        int zoijcleaow();
    }

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final long f68741iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long f68742zoijcleaow;

        public iobyxmoadg(long j13, long j14) {
            this.f68741iobyxmoadg = j13;
            this.f68742zoijcleaow = j14;
        }
    }

    private static final class lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f68743iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f68744ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f68745zoijcleaow;

        public lqeggnwhkg(boolean z13, boolean z14, boolean z15) {
            this.f68743iobyxmoadg = z13;
            this.f68745zoijcleaow = z14;
            this.f68744ppxfxbqfkf = z15;
        }
    }

    private static final class nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final yggfygwlhe[] f68746iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f68747ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public int f68748wkgbmnqykc = 0;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public androidx.media3.common.iobyxmoadg f68749zoijcleaow;

        public nufgyqmvbu(int i13) {
            this.f68746iobyxmoadg = new yggfygwlhe[i13];
        }
    }

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f68750iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final long f68751ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final long f68752wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final byte[] f68753zoijcleaow;

        public ppxfxbqfkf(String str, byte[] bArr, long j13, long j14) {
            this.f68750iobyxmoadg = str;
            this.f68753zoijcleaow = bArr;
            this.f68751ppxfxbqfkf = j13;
            this.f68752wkgbmnqykc = j14;
        }
    }

    private static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lqeggnwhkg f68754iobyxmoadg;

        public wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
            this.f68754iobyxmoadg = lqeggnwhkgVar;
        }
    }

    /* JADX INFO: renamed from: n4.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private static final class C1478zoijcleaow {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f68755dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f68756eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final yadqdtsiqt f68757gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f68758iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final yadqdtsiqt f68759lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f68760nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f68761ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public long f68762wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f68763zoijcleaow;

        public C1478zoijcleaow(yadqdtsiqt yadqdtsiqtVar, yadqdtsiqt yadqdtsiqtVar2, boolean z13) throws ParserException {
            this.f68759lqeggnwhkg = yadqdtsiqtVar;
            this.f68757gxszxtbevo = yadqdtsiqtVar2;
            this.f68756eablkybsjg = z13;
            yadqdtsiqtVar2.sopmlzcsov(12);
            this.f68758iobyxmoadg = yadqdtsiqtVar2.jpowsppfya();
            yadqdtsiqtVar.sopmlzcsov(12);
            this.f68755dxjokdxxww = yadqdtsiqtVar.jpowsppfya();
            t3.kcexrzcfyt.iobyxmoadg(yadqdtsiqtVar.vdvldrhtss() == 1, "first_chunk must be 1");
            this.f68763zoijcleaow = -1;
        }

        public boolean iobyxmoadg() {
            int i13 = this.f68763zoijcleaow + 1;
            this.f68763zoijcleaow = i13;
            if (i13 == this.f68758iobyxmoadg) {
                return false;
            }
            this.f68762wkgbmnqykc = this.f68756eablkybsjg ? this.f68757gxszxtbevo.dsvhmnatus() : this.f68757gxszxtbevo.pkzmftpjix();
            if (this.f68763zoijcleaow == this.f68760nufgyqmvbu) {
                this.f68761ppxfxbqfkf = this.f68759lqeggnwhkg.jpowsppfya();
                this.f68759lqeggnwhkg.crxdokpmqz(4);
                int i14 = this.f68755dxjokdxxww - 1;
                this.f68755dxjokdxxww = i14;
                this.f68760nufgyqmvbu = i14 > 0 ? this.f68759lqeggnwhkg.jpowsppfya() - 1 : -1;
            }
            return true;
        }
    }

    private static int agtfadlqog(yadqdtsiqt yadqdtsiqtVar) {
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        int i13 = iWwaezpbzkn & 127;
        while ((iWwaezpbzkn & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
            i13 = (i13 << 7) | (iWwaezpbzkn & 127);
        }
        return i13;
    }

    private static iobyxmoadg btonecajqb(yadqdtsiqt yadqdtsiqtVar, int i13) {
        yadqdtsiqtVar.sopmlzcsov(i13 + 8);
        yadqdtsiqtVar.crxdokpmqz(4);
        return new iobyxmoadg(yadqdtsiqtVar.pkzmftpjix(), yadqdtsiqtVar.pkzmftpjix());
    }

    private static void cdpycssgdh(yadqdtsiqt yadqdtsiqtVar, int i13, int i14, int i15, int i16, String str, nufgyqmvbu nufgyqmvbuVar) {
        yadqdtsiqtVar.sopmlzcsov(i14 + 16);
        String str2 = "application/ttml+xml";
        com.google.common.collect.zdlpuopuiu zdlpuopuiuVarIstkbnxepw = null;
        long j13 = Long.MAX_VALUE;
        if (i13 != 1414810956) {
            if (i13 == 1954034535) {
                int i17 = i15 - 16;
                byte[] bArr = new byte[i17];
                yadqdtsiqtVar.draadjrbmk(bArr, 0, i17);
                zdlpuopuiuVarIstkbnxepw = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i13 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i13 == 1937010800) {
                j13 = 0;
            } else {
                if (i13 != 1664495672) {
                    throw new IllegalStateException();
                }
                nufgyqmvbuVar.f68748wkgbmnqykc = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        nufgyqmvbuVar.f68749zoijcleaow = new androidx.media3.common.iobyxmoadg.zoijcleaow().jztzpxfvev(i16).zeieaojujs(str2).uwvvkdfqfp(str).uawqvzlxes(j13).metgxyhuhe(zdlpuopuiuVarIstkbnxepw).cllcsxoeiz();
    }

    private static byte[] cqumvgiudr(yadqdtsiqt yadqdtsiqtVar, int i13, int i14) {
        int i15 = i13 + 8;
        while (i15 - i13 < i14) {
            yadqdtsiqtVar.sopmlzcsov(i15);
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            if (yadqdtsiqtVar.vdvldrhtss() == 1886547818) {
                return Arrays.copyOfRange(yadqdtsiqtVar.eablkybsjg(), i15, iVdvldrhtss + i15);
            }
            i15 += iVdvldrhtss;
        }
        return null;
    }

    private static Pair draadjrbmk(z2.ppxfxbqfkf.zoijcleaow zoijcleaowVar) {
        z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkfEablkybsjg = zoijcleaowVar.eablkybsjg(1701606260);
        if (c3260ppxfxbqfkfEablkybsjg == null) {
            return null;
        }
        yadqdtsiqt yadqdtsiqtVar = c3260ppxfxbqfkfEablkybsjg.f127708zoijcleaow;
        yadqdtsiqtVar.sopmlzcsov(8);
        int iRgvfuqvkyq = rgvfuqvkyq(yadqdtsiqtVar.vdvldrhtss());
        int iJpowsppfya = yadqdtsiqtVar.jpowsppfya();
        long[] jArr = new long[iJpowsppfya];
        long[] jArr2 = new long[iJpowsppfya];
        for (int i13 = 0; i13 < iJpowsppfya; i13++) {
            jArr[i13] = iRgvfuqvkyq == 1 ? yadqdtsiqtVar.dsvhmnatus() : yadqdtsiqtVar.pkzmftpjix();
            jArr2[i13] = iRgvfuqvkyq == 1 ? yadqdtsiqtVar.pmvmpeiblj() : yadqdtsiqtVar.vdvldrhtss();
            if (yadqdtsiqtVar.cdpycssgdh() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            yadqdtsiqtVar.crxdokpmqz(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static v2.dxjokdxxww dxjokdxxww(yadqdtsiqt yadqdtsiqtVar) {
        v2.dxjokdxxww.zoijcleaow zoijcleaowVar = new v2.dxjokdxxww.zoijcleaow();
        cdpycssgdh cdpycssgdhVar = new cdpycssgdh(yadqdtsiqtVar.eablkybsjg());
        cdpycssgdhVar.rgvfuqvkyq(yadqdtsiqtVar.gxszxtbevo() * 8);
        cdpycssgdhVar.kcexrzcfyt(1);
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(3);
        cdpycssgdhVar.oxmwwwfdhm(6);
        boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
        boolean zLqeggnwhkg2 = cdpycssgdhVar.lqeggnwhkg();
        if (iNufgyqmvbu == 2 && zLqeggnwhkg) {
            zoijcleaowVar.lqeggnwhkg(zLqeggnwhkg2 ? 12 : 10);
            zoijcleaowVar.zoijcleaow(zLqeggnwhkg2 ? 12 : 10);
        } else if (iNufgyqmvbu <= 2) {
            zoijcleaowVar.lqeggnwhkg(zLqeggnwhkg ? 10 : 8);
            zoijcleaowVar.zoijcleaow(zLqeggnwhkg ? 10 : 8);
        }
        cdpycssgdhVar.oxmwwwfdhm(13);
        cdpycssgdhVar.vdvldrhtss();
        int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(4);
        if (iNufgyqmvbu2 != 1) {
            y2.kcexrzcfyt.gxszxtbevo("BoxParsers", "Unsupported obu_type: " + iNufgyqmvbu2);
            return zoijcleaowVar.iobyxmoadg();
        }
        if (cdpycssgdhVar.lqeggnwhkg()) {
            y2.kcexrzcfyt.gxszxtbevo("BoxParsers", "Unsupported obu_extension_flag");
            return zoijcleaowVar.iobyxmoadg();
        }
        boolean zLqeggnwhkg3 = cdpycssgdhVar.lqeggnwhkg();
        cdpycssgdhVar.vdvldrhtss();
        if (zLqeggnwhkg3 && cdpycssgdhVar.nufgyqmvbu(8) > 127) {
            y2.kcexrzcfyt.gxszxtbevo("BoxParsers", "Excessive obu_size");
            return zoijcleaowVar.iobyxmoadg();
        }
        int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(3);
        cdpycssgdhVar.vdvldrhtss();
        if (cdpycssgdhVar.lqeggnwhkg()) {
            y2.kcexrzcfyt.gxszxtbevo("BoxParsers", "Unsupported reduced_still_picture_header");
            return zoijcleaowVar.iobyxmoadg();
        }
        if (cdpycssgdhVar.lqeggnwhkg()) {
            y2.kcexrzcfyt.gxszxtbevo("BoxParsers", "Unsupported timing_info_present_flag");
            return zoijcleaowVar.iobyxmoadg();
        }
        if (cdpycssgdhVar.lqeggnwhkg()) {
            y2.kcexrzcfyt.gxszxtbevo("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return zoijcleaowVar.iobyxmoadg();
        }
        int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(5);
        boolean z13 = false;
        for (int i13 = 0; i13 <= iNufgyqmvbu4; i13++) {
            cdpycssgdhVar.oxmwwwfdhm(12);
            if (cdpycssgdhVar.nufgyqmvbu(5) > 7) {
                cdpycssgdhVar.vdvldrhtss();
            }
        }
        int iNufgyqmvbu5 = cdpycssgdhVar.nufgyqmvbu(4);
        int iNufgyqmvbu6 = cdpycssgdhVar.nufgyqmvbu(4);
        cdpycssgdhVar.oxmwwwfdhm(iNufgyqmvbu5 + 1);
        cdpycssgdhVar.oxmwwwfdhm(iNufgyqmvbu6 + 1);
        if (cdpycssgdhVar.lqeggnwhkg()) {
            cdpycssgdhVar.oxmwwwfdhm(7);
        }
        cdpycssgdhVar.oxmwwwfdhm(7);
        boolean zLqeggnwhkg4 = cdpycssgdhVar.lqeggnwhkg();
        if (zLqeggnwhkg4) {
            cdpycssgdhVar.oxmwwwfdhm(2);
        }
        if ((cdpycssgdhVar.lqeggnwhkg() ? 2 : cdpycssgdhVar.nufgyqmvbu(1)) > 0 && !cdpycssgdhVar.lqeggnwhkg()) {
            cdpycssgdhVar.oxmwwwfdhm(1);
        }
        if (zLqeggnwhkg4) {
            cdpycssgdhVar.oxmwwwfdhm(3);
        }
        cdpycssgdhVar.oxmwwwfdhm(3);
        boolean zLqeggnwhkg5 = cdpycssgdhVar.lqeggnwhkg();
        if (iNufgyqmvbu3 == 2 && zLqeggnwhkg5) {
            cdpycssgdhVar.vdvldrhtss();
        }
        if (iNufgyqmvbu3 != 1 && cdpycssgdhVar.lqeggnwhkg()) {
            z13 = true;
        }
        if (cdpycssgdhVar.lqeggnwhkg()) {
            int iNufgyqmvbu7 = cdpycssgdhVar.nufgyqmvbu(8);
            int iNufgyqmvbu8 = cdpycssgdhVar.nufgyqmvbu(8);
            zoijcleaowVar.wkgbmnqykc(v2.dxjokdxxww.btonecajqb(iNufgyqmvbu7)).ppxfxbqfkf(((z13 || iNufgyqmvbu7 != 1 || iNufgyqmvbu8 != 13 || cdpycssgdhVar.nufgyqmvbu(8) != 0) ? cdpycssgdhVar.nufgyqmvbu(1) : 1) != 1 ? 2 : 1).eablkybsjg(v2.dxjokdxxww.gtknphoqwx(iNufgyqmvbu8));
        }
        return zoijcleaowVar.iobyxmoadg();
    }

    private static int eablkybsjg(int i13) {
        if (i13 == 1936684398) {
            return 1;
        }
        if (i13 == 1986618469) {
            return 2;
        }
        if (i13 == 1952807028 || i13 == 1935832172 || i13 == 1937072756 || i13 == 1668047728) {
            return 3;
        }
        return i13 == 1835365473 ? 5 : -1;
    }

    private static Pair esjtqupxsv(yadqdtsiqt yadqdtsiqtVar, int i13, int i14) throws ParserException {
        Pair pairGtknphoqwx;
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        while (iGxszxtbevo - i13 < i14) {
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            t3.kcexrzcfyt.iobyxmoadg(iVdvldrhtss > 0, "childAtomSize must be positive");
            if (yadqdtsiqtVar.vdvldrhtss() == 1936289382 && (pairGtknphoqwx = gtknphoqwx(yadqdtsiqtVar, iGxszxtbevo, iVdvldrhtss)) != null) {
                return pairGtknphoqwx;
            }
            iGxszxtbevo += iVdvldrhtss;
        }
        return null;
    }

    static Pair gtknphoqwx(yadqdtsiqt yadqdtsiqtVar, int i13, int i14) throws ParserException {
        int i15 = i13 + 8;
        int i16 = -1;
        int i17 = 0;
        String strYadqdtsiqt = null;
        Integer numValueOf = null;
        while (i15 - i13 < i14) {
            yadqdtsiqtVar.sopmlzcsov(i15);
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
            if (iVdvldrhtss2 == 1718775137) {
                numValueOf = Integer.valueOf(yadqdtsiqtVar.vdvldrhtss());
            } else if (iVdvldrhtss2 == 1935894637) {
                yadqdtsiqtVar.crxdokpmqz(4);
                strYadqdtsiqt = yadqdtsiqtVar.yadqdtsiqt(4);
            } else if (iVdvldrhtss2 == 1935894633) {
                i16 = i15;
                i17 = iVdvldrhtss;
            }
            i15 += iVdvldrhtss;
        }
        if (!"cenc".equals(strYadqdtsiqt) && !"cbc1".equals(strYadqdtsiqt) && !"cens".equals(strYadqdtsiqt) && !"cbcs".equals(strYadqdtsiqt)) {
            return null;
        }
        t3.kcexrzcfyt.iobyxmoadg(numValueOf != null, "frma atom is mandatory");
        t3.kcexrzcfyt.iobyxmoadg(i16 != -1, "schi atom is mandatory");
        yggfygwlhe yggfygwlheVarLereixgezr = lereixgezr(yadqdtsiqtVar, i16, i17, strYadqdtsiqt);
        t3.kcexrzcfyt.iobyxmoadg(yggfygwlheVarLereixgezr != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (yggfygwlhe) stevsuqkhv.nufgyqmvbu(yggfygwlheVarLereixgezr));
    }

    public static void gxszxtbevo(yadqdtsiqt yadqdtsiqtVar) {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        yadqdtsiqtVar.crxdokpmqz(4);
        if (yadqdtsiqtVar.vdvldrhtss() != 1751411826) {
            iGxszxtbevo += 4;
        }
        yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
    }

    private static void hcddaimhww(yadqdtsiqt yadqdtsiqtVar, int i13, int i14, int i15, int i16, String str, int i17, DrmInitData drmInitData, nufgyqmvbu nufgyqmvbuVar, int i18) throws ParserException {
        String str2;
        DrmInitData drmInitData2;
        int i19;
        int i23;
        float f13;
        int i24;
        int i25;
        int i26;
        int i27 = i14;
        int i28 = i15;
        DrmInitData drmInitDataPpxfxbqfkf = drmInitData;
        nufgyqmvbu nufgyqmvbuVar2 = nufgyqmvbuVar;
        yadqdtsiqtVar.sopmlzcsov(i27 + 16);
        yadqdtsiqtVar.crxdokpmqz(16);
        int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        int iWypolnanlu2 = yadqdtsiqtVar.wypolnanlu();
        yadqdtsiqtVar.crxdokpmqz(50);
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iIntValue = i13;
        if (iIntValue == 1701733238) {
            Pair pairEsjtqupxsv = esjtqupxsv(yadqdtsiqtVar, i27, i28);
            if (pairEsjtqupxsv != null) {
                iIntValue = ((Integer) pairEsjtqupxsv.first).intValue();
                drmInitDataPpxfxbqfkf = drmInitDataPpxfxbqfkf == null ? null : drmInitDataPpxfxbqfkf.ppxfxbqfkf(((yggfygwlhe) pairEsjtqupxsv.second).f68711zoijcleaow);
                nufgyqmvbuVar2.f68746iobyxmoadg[i18] = (yggfygwlhe) pairEsjtqupxsv.second;
            }
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
        }
        String str3 = "video/3gpp";
        if (iIntValue == 1831958048) {
            str2 = "video/mpeg";
        } else {
            str2 = iIntValue == 1211250227 ? "video/3gpp" : null;
        }
        float fIwizpuwonk = 1.0f;
        int i29 = 8;
        int i33 = 8;
        List listIstkbnxepw = null;
        String str4 = null;
        byte[] bArrCqumvgiudr = null;
        int i34 = -1;
        int i35 = -1;
        int i36 = -1;
        int i37 = -1;
        int i38 = -1;
        int iGtknphoqwx = -1;
        ByteBuffer byteBufferIobyxmoadg = null;
        iobyxmoadg iobyxmoadgVarBtonecajqb = null;
        ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = null;
        z2.gxszxtbevo.gtknphoqwx gtknphoqwxVar = null;
        boolean z13 = false;
        while (iGxszxtbevo - i27 < i28) {
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            int iGxszxtbevo2 = yadqdtsiqtVar.gxszxtbevo();
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            if (iVdvldrhtss == 0 && yadqdtsiqtVar.gxszxtbevo() - i27 == i28) {
                break;
            }
            t3.kcexrzcfyt.iobyxmoadg(iVdvldrhtss > 0, "childAtomSize must be positive");
            int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
            if (iVdvldrhtss2 == 1635148611) {
                t3.kcexrzcfyt.iobyxmoadg(str2 == null, null);
                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo2 + 8);
                t3.wkgbmnqykc wkgbmnqykcVarZoijcleaow = t3.wkgbmnqykc.zoijcleaow(yadqdtsiqtVar);
                List list = wkgbmnqykcVarZoijcleaow.f109554iobyxmoadg;
                nufgyqmvbuVar2.f68747ppxfxbqfkf = wkgbmnqykcVarZoijcleaow.f109559zoijcleaow;
                if (!z13) {
                    fIwizpuwonk = wkgbmnqykcVarZoijcleaow.f109552gtknphoqwx;
                }
                String str5 = wkgbmnqykcVarZoijcleaow.f109549draadjrbmk;
                int i39 = wkgbmnqykcVarZoijcleaow.f109548btonecajqb;
                int i43 = wkgbmnqykcVarZoijcleaow.f109555lqeggnwhkg;
                drmInitData2 = drmInitDataPpxfxbqfkf;
                i35 = i39;
                i38 = wkgbmnqykcVarZoijcleaow.f109556nufgyqmvbu;
                iGtknphoqwx = wkgbmnqykcVarZoijcleaow.f109550dxjokdxxww;
                i29 = wkgbmnqykcVarZoijcleaow.f109551eablkybsjg;
                listIstkbnxepw = list;
                str2 = "video/avc";
                str4 = str5;
                i19 = i43;
                i33 = wkgbmnqykcVarZoijcleaow.f109553gxszxtbevo;
            } else {
                if (iVdvldrhtss2 == 1752589123) {
                    t3.kcexrzcfyt.iobyxmoadg(str2 == null, null);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo2 + 8);
                    istkbnxepw istkbnxepwVarIobyxmoadg = istkbnxepw.iobyxmoadg(yadqdtsiqtVar);
                    List list2 = istkbnxepwVarIobyxmoadg.f109462iobyxmoadg;
                    nufgyqmvbuVar2.f68747ppxfxbqfkf = istkbnxepwVarIobyxmoadg.f109469zoijcleaow;
                    if (!z13) {
                        fIwizpuwonk = istkbnxepwVarIobyxmoadg.f109457draadjrbmk;
                    }
                    int i44 = istkbnxepwVarIobyxmoadg.f109467wflxmlrfwp;
                    int i45 = istkbnxepwVarIobyxmoadg.f109466ppxfxbqfkf;
                    String str6 = istkbnxepwVarIobyxmoadg.f109455agtfadlqog;
                    int i46 = istkbnxepwVarIobyxmoadg.f109460gtknphoqwx;
                    listIstkbnxepw = list2;
                    if (i46 != -1) {
                        i34 = i46;
                    }
                    int i47 = istkbnxepwVarIobyxmoadg.f109464nufgyqmvbu;
                    int i48 = istkbnxepwVarIobyxmoadg.f109458dxjokdxxww;
                    int i49 = istkbnxepwVarIobyxmoadg.f109456btonecajqb;
                    int i53 = istkbnxepwVarIobyxmoadg.f109461gxszxtbevo;
                    int i54 = istkbnxepwVarIobyxmoadg.f109463lqeggnwhkg;
                    gtknphoqwxVar = istkbnxepwVarIobyxmoadg.f109465ojitshcjhn;
                    drmInitData2 = drmInitDataPpxfxbqfkf;
                    iWypolnanlu2 = iWypolnanlu2;
                    iIntValue = iIntValue;
                    i38 = i48;
                    iGtknphoqwx = i49;
                    i29 = i53;
                    i35 = i44;
                    str2 = "video/hevc";
                    i36 = i45;
                    i19 = i47;
                    str4 = str6;
                    i33 = i54;
                } else {
                    drmInitData2 = drmInitDataPpxfxbqfkf;
                    if (iVdvldrhtss2 == 1818785347) {
                        t3.kcexrzcfyt.iobyxmoadg("video/hevc".equals(str2), "lhvC must follow hvcC atom");
                        z2.gxszxtbevo.gtknphoqwx gtknphoqwxVar2 = gtknphoqwxVar;
                        t3.kcexrzcfyt.iobyxmoadg(gtknphoqwxVar2 != null && gtknphoqwxVar2.f127631zoijcleaow.size() >= 2, "must have at least two layers");
                        yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo2 + 8);
                        istkbnxepw istkbnxepwVarPpxfxbqfkf = istkbnxepw.ppxfxbqfkf(yadqdtsiqtVar, (z2.gxszxtbevo.gtknphoqwx) y2.iobyxmoadg.eablkybsjg(gtknphoqwxVar2));
                        t3.kcexrzcfyt.iobyxmoadg(nufgyqmvbuVar2.f68747ppxfxbqfkf == istkbnxepwVarPpxfxbqfkf.f109469zoijcleaow, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i55 = istkbnxepwVarPpxfxbqfkf.f109464nufgyqmvbu;
                        i19 = i37;
                        if (i55 != -1) {
                            t3.kcexrzcfyt.iobyxmoadg(i19 == i55, "colorSpace must be the same for both views");
                        }
                        int i56 = istkbnxepwVarPpxfxbqfkf.f109458dxjokdxxww;
                        int i57 = i38;
                        if (i56 != -1) {
                            t3.kcexrzcfyt.iobyxmoadg(i57 == i56, "colorRange must be the same for both views");
                        }
                        int i58 = istkbnxepwVarPpxfxbqfkf.f109456btonecajqb;
                        if (i58 != -1) {
                            int i59 = iGtknphoqwx;
                            i26 = i59;
                            t3.kcexrzcfyt.iobyxmoadg(i59 == i58, "colorTransfer must be the same for both views");
                        } else {
                            i26 = iGtknphoqwx;
                        }
                        t3.kcexrzcfyt.iobyxmoadg(i29 == istkbnxepwVarPpxfxbqfkf.f109461gxszxtbevo, "bitdepthLuma must be the same for both views");
                        t3.kcexrzcfyt.iobyxmoadg(i33 == istkbnxepwVarPpxfxbqfkf.f109463lqeggnwhkg, "bitdepthChroma must be the same for both views");
                        List list3 = listIstkbnxepw;
                        if (list3 != null) {
                            listIstkbnxepw = com.google.common.collect.zdlpuopuiu.kcexrzcfyt().btonecajqb(list3).btonecajqb(istkbnxepwVarPpxfxbqfkf.f109462iobyxmoadg).gtknphoqwx();
                        } else {
                            listIstkbnxepw = list3;
                            t3.kcexrzcfyt.iobyxmoadg(false, "initializationData must be already set from hvcC atom");
                        }
                        gtknphoqwxVar = gtknphoqwxVar2;
                        str2 = "video/mv-hevc";
                        i38 = i57;
                        iGtknphoqwx = i26;
                        str4 = istkbnxepwVarPpxfxbqfkf.f109455agtfadlqog;
                    } else {
                        List listNufgyqmvbu = listIstkbnxepw;
                        i19 = i37;
                        i38 = i38;
                        iGtknphoqwx = iGtknphoqwx;
                        z2.gxszxtbevo.gtknphoqwx gtknphoqwxVar3 = gtknphoqwxVar;
                        if (iVdvldrhtss2 == 1986361461) {
                            draadjrbmk draadjrbmkVarPkzmftpjix = pkzmftpjix(yadqdtsiqtVar, iGxszxtbevo2, iVdvldrhtss);
                            if (draadjrbmkVarPkzmftpjix == null || draadjrbmkVarPkzmftpjix.f68730iobyxmoadg == null) {
                                i25 = i34;
                                i34 = i25;
                            } else if (gtknphoqwxVar3 == null || gtknphoqwxVar3.f127631zoijcleaow.size() < 2) {
                                i25 = i34;
                                if (i25 == -1) {
                                    i34 = draadjrbmkVarPkzmftpjix.f68730iobyxmoadg.f68754iobyxmoadg.f68744ppxfxbqfkf ? 5 : 4;
                                } else {
                                    i34 = i25;
                                }
                            } else {
                                t3.kcexrzcfyt.iobyxmoadg(draadjrbmkVarPkzmftpjix.zoijcleaow(), "both eye views must be marked as available");
                                t3.kcexrzcfyt.iobyxmoadg(!draadjrbmkVarPkzmftpjix.f68730iobyxmoadg.f68754iobyxmoadg.f68744ppxfxbqfkf, "for MV-HEVC, eye_views_reversed must be set to false");
                                i25 = i34;
                                i34 = i25;
                            }
                            gtknphoqwxVar = gtknphoqwxVar3;
                            iWypolnanlu2 = iWypolnanlu2;
                            iIntValue = iIntValue;
                            listIstkbnxepw = listNufgyqmvbu;
                            i38 = i38;
                            iGtknphoqwx = iGtknphoqwx;
                        } else {
                            int i63 = i34;
                            if (iVdvldrhtss2 == 1685480259 || iVdvldrhtss2 == 1685485123) {
                                i23 = i63;
                                iWypolnanlu2 = iWypolnanlu2;
                                iIntValue = iIntValue;
                                i33 = i33;
                                f13 = fIwizpuwonk;
                                i29 = i29;
                                i24 = iGtknphoqwx;
                                t3.agtfadlqog agtfadlqogVarIobyxmoadg = t3.agtfadlqog.iobyxmoadg(yadqdtsiqtVar);
                                if (agtfadlqogVarIobyxmoadg != null) {
                                    str2 = "video/dolby-vision";
                                    str4 = agtfadlqogVarIobyxmoadg.f109355ppxfxbqfkf;
                                }
                            } else if (iVdvldrhtss2 == 1987076931) {
                                t3.kcexrzcfyt.iobyxmoadg(str2 == null, null);
                                String str7 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo2 + 12);
                                byte bWwaezpbzkn = (byte) yadqdtsiqtVar.wwaezpbzkn();
                                byte bWwaezpbzkn2 = (byte) yadqdtsiqtVar.wwaezpbzkn();
                                int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                                i33 = iWwaezpbzkn >> 4;
                                byte b13 = (byte) ((iWwaezpbzkn >> 1) & 7);
                                if (str7.equals("video/x-vnd.on2.vp9")) {
                                    listNufgyqmvbu = y2.btonecajqb.nufgyqmvbu(bWwaezpbzkn, bWwaezpbzkn2, (byte) i33, b13);
                                }
                                boolean z14 = (iWwaezpbzkn & 1) != 0;
                                int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
                                int iWwaezpbzkn3 = yadqdtsiqtVar.wwaezpbzkn();
                                int iBtonecajqb = v2.dxjokdxxww.btonecajqb(iWwaezpbzkn2);
                                i38 = z14 ? 1 : 2;
                                iGtknphoqwx = v2.dxjokdxxww.gtknphoqwx(iWwaezpbzkn3);
                                str2 = str7;
                                iWypolnanlu2 = iWypolnanlu2;
                                i29 = i33;
                                gtknphoqwxVar = gtknphoqwxVar3;
                                i19 = iBtonecajqb;
                                listIstkbnxepw = listNufgyqmvbu;
                                i34 = i63;
                                iIntValue = iIntValue;
                            } else if (iVdvldrhtss2 == 1635135811) {
                                int i64 = iVdvldrhtss - 8;
                                byte[] bArr = new byte[i64];
                                yadqdtsiqtVar.draadjrbmk(bArr, 0, i64);
                                listIstkbnxepw = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr);
                                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo2 + 8);
                                v2.dxjokdxxww dxjokdxxwwVarDxjokdxxww = dxjokdxxww(yadqdtsiqtVar);
                                int i65 = dxjokdxxwwVarDxjokdxxww.f115322eablkybsjg;
                                int i66 = dxjokdxxwwVarDxjokdxxww.f115323gxszxtbevo;
                                i19 = dxjokdxxwwVarDxjokdxxww.f115324iobyxmoadg;
                                int i67 = dxjokdxxwwVarDxjokdxxww.f115328zoijcleaow;
                                iGtknphoqwx = dxjokdxxwwVarDxjokdxxww.f115326ppxfxbqfkf;
                                i29 = i65;
                                iWypolnanlu2 = iWypolnanlu2;
                                iIntValue = iIntValue;
                                i38 = i67;
                                gtknphoqwxVar = gtknphoqwxVar3;
                                i34 = i63;
                                i33 = i66;
                                str2 = "video/av01";
                            } else if (iVdvldrhtss2 == 1668050025) {
                                if (byteBufferIobyxmoadg == null) {
                                    byteBufferIobyxmoadg = iobyxmoadg();
                                }
                                ByteBuffer byteBuffer = byteBufferIobyxmoadg;
                                byteBuffer.position(21);
                                byteBuffer.putShort(yadqdtsiqtVar.cdpycssgdh());
                                byteBuffer.putShort(yadqdtsiqtVar.cdpycssgdh());
                                byteBufferIobyxmoadg = byteBuffer;
                                iWypolnanlu2 = iWypolnanlu2;
                                iIntValue = iIntValue;
                                gtknphoqwxVar = gtknphoqwxVar3;
                                listIstkbnxepw = listNufgyqmvbu;
                                i38 = i38;
                                iGtknphoqwx = iGtknphoqwx;
                                i34 = i63;
                            } else {
                                if (iVdvldrhtss2 == 1835295606) {
                                    if (byteBufferIobyxmoadg == null) {
                                        byteBufferIobyxmoadg = iobyxmoadg();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferIobyxmoadg;
                                    short sCdpycssgdh = yadqdtsiqtVar.cdpycssgdh();
                                    short sCdpycssgdh2 = yadqdtsiqtVar.cdpycssgdh();
                                    iIntValue = iIntValue;
                                    short sCdpycssgdh3 = yadqdtsiqtVar.cdpycssgdh();
                                    short sCdpycssgdh4 = yadqdtsiqtVar.cdpycssgdh();
                                    int i68 = i33;
                                    short sCdpycssgdh5 = yadqdtsiqtVar.cdpycssgdh();
                                    int i69 = i29;
                                    short sCdpycssgdh6 = yadqdtsiqtVar.cdpycssgdh();
                                    i23 = i63;
                                    short sCdpycssgdh7 = yadqdtsiqtVar.cdpycssgdh();
                                    float f14 = fIwizpuwonk;
                                    short sCdpycssgdh8 = yadqdtsiqtVar.cdpycssgdh();
                                    long jPkzmftpjix = yadqdtsiqtVar.pkzmftpjix();
                                    long jPkzmftpjix2 = yadqdtsiqtVar.pkzmftpjix();
                                    iWypolnanlu2 = iWypolnanlu2;
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(sCdpycssgdh5);
                                    byteBuffer2.putShort(sCdpycssgdh6);
                                    byteBuffer2.putShort(sCdpycssgdh);
                                    byteBuffer2.putShort(sCdpycssgdh2);
                                    byteBuffer2.putShort(sCdpycssgdh3);
                                    byteBuffer2.putShort(sCdpycssgdh4);
                                    byteBuffer2.putShort(sCdpycssgdh7);
                                    byteBuffer2.putShort(sCdpycssgdh8);
                                    byteBuffer2.putShort((short) (jPkzmftpjix / DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM));
                                    byteBuffer2.putShort((short) (jPkzmftpjix2 / DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM));
                                    byteBufferIobyxmoadg = byteBuffer2;
                                    i33 = i68;
                                    i29 = i69;
                                    listIstkbnxepw = listNufgyqmvbu;
                                    fIwizpuwonk = f14;
                                } else {
                                    i23 = i63;
                                    iWypolnanlu2 = iWypolnanlu2;
                                    iIntValue = iIntValue;
                                    i33 = i33;
                                    f13 = fIwizpuwonk;
                                    i29 = i29;
                                    if (iVdvldrhtss2 == 1681012275) {
                                        t3.kcexrzcfyt.iobyxmoadg(str2 == null, null);
                                        str2 = str3;
                                    } else if (iVdvldrhtss2 == 1702061171) {
                                        t3.kcexrzcfyt.iobyxmoadg(str2 == null, null);
                                        ppxfxbqfkfVarWflxmlrfwp = wflxmlrfwp(yadqdtsiqtVar, iGxszxtbevo2);
                                        String str8 = ppxfxbqfkfVarWflxmlrfwp.f68750iobyxmoadg;
                                        byte[] bArr2 = ppxfxbqfkfVarWflxmlrfwp.f68753zoijcleaow;
                                        listIstkbnxepw = bArr2 != null ? com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr2) : listNufgyqmvbu;
                                        str2 = str8;
                                        fIwizpuwonk = f13;
                                    } else if (iVdvldrhtss2 == 1651798644) {
                                        iobyxmoadgVarBtonecajqb = btonecajqb(yadqdtsiqtVar, iGxszxtbevo2);
                                    } else {
                                        if (iVdvldrhtss2 == 1885434736) {
                                            fIwizpuwonk = iwizpuwonk(yadqdtsiqtVar, iGxszxtbevo2);
                                            i33 = i33;
                                            i29 = i29;
                                            listIstkbnxepw = listNufgyqmvbu;
                                            i38 = i38;
                                            iGtknphoqwx = iGtknphoqwx;
                                            z13 = true;
                                        } else if (iVdvldrhtss2 == 1937126244) {
                                            bArrCqumvgiudr = cqumvgiudr(yadqdtsiqtVar, iGxszxtbevo2, iVdvldrhtss);
                                        } else if (iVdvldrhtss2 == 1936995172) {
                                            int iWwaezpbzkn4 = yadqdtsiqtVar.wwaezpbzkn();
                                            yadqdtsiqtVar.crxdokpmqz(3);
                                            if (iWwaezpbzkn4 == 0) {
                                                int iWwaezpbzkn5 = yadqdtsiqtVar.wwaezpbzkn();
                                                if (iWwaezpbzkn5 == 0) {
                                                    i23 = 0;
                                                } else if (iWwaezpbzkn5 == 1) {
                                                    i23 = 1;
                                                } else if (iWwaezpbzkn5 == 2) {
                                                    i23 = 2;
                                                } else if (iWwaezpbzkn5 == 3) {
                                                    i23 = 3;
                                                }
                                            }
                                        } else if (iVdvldrhtss2 == 1634760259) {
                                            int i73 = iVdvldrhtss - 12;
                                            byte[] bArr3 = new byte[i73];
                                            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo2 + 12);
                                            yadqdtsiqtVar.draadjrbmk(bArr3, 0, i73);
                                            listIstkbnxepw = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr3);
                                            v2.dxjokdxxww dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(new yadqdtsiqt(bArr3));
                                            int i74 = dxjokdxxwwVarLqeggnwhkg.f115322eablkybsjg;
                                            int i75 = dxjokdxxwwVarLqeggnwhkg.f115323gxszxtbevo;
                                            int i76 = dxjokdxxwwVarLqeggnwhkg.f115324iobyxmoadg;
                                            int i77 = dxjokdxxwwVarLqeggnwhkg.f115328zoijcleaow;
                                            iGtknphoqwx = dxjokdxxwwVarLqeggnwhkg.f115326ppxfxbqfkf;
                                            i29 = i74;
                                            i33 = i75;
                                            i38 = i77;
                                            fIwizpuwonk = f13;
                                            i19 = i76;
                                            str2 = "video/apv";
                                            gtknphoqwxVar = gtknphoqwxVar3;
                                            i34 = i23;
                                        } else if (iVdvldrhtss2 == 1668246642) {
                                            i24 = iGtknphoqwx;
                                            if (i19 == -1 && i24 == -1) {
                                                int iVdvldrhtss3 = yadqdtsiqtVar.vdvldrhtss();
                                                if (iVdvldrhtss3 == 1852009592 || iVdvldrhtss3 == 1852009571) {
                                                    int iWypolnanlu3 = yadqdtsiqtVar.wypolnanlu();
                                                    int iWypolnanlu4 = yadqdtsiqtVar.wypolnanlu();
                                                    yadqdtsiqtVar.crxdokpmqz(2);
                                                    boolean z15 = iVdvldrhtss == 19 && (yadqdtsiqtVar.wwaezpbzkn() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                                                    int iBtonecajqb2 = v2.dxjokdxxww.btonecajqb(iWypolnanlu3);
                                                    int i78 = z15 ? 1 : 2;
                                                    i33 = i33;
                                                    i29 = i29;
                                                    listIstkbnxepw = listNufgyqmvbu;
                                                    fIwizpuwonk = f13;
                                                    iGtknphoqwx = v2.dxjokdxxww.gtknphoqwx(iWypolnanlu4);
                                                    i38 = i78;
                                                    i19 = iBtonecajqb2;
                                                } else {
                                                    y2.kcexrzcfyt.nufgyqmvbu("BoxParsers", "Unsupported color type: " + z2.ppxfxbqfkf.iobyxmoadg(iVdvldrhtss3));
                                                }
                                            }
                                        } else {
                                            i24 = iGtknphoqwx;
                                        }
                                        int i79 = i23;
                                        gtknphoqwxVar = gtknphoqwxVar3;
                                        i34 = i79;
                                    }
                                    listIstkbnxepw = listNufgyqmvbu;
                                    fIwizpuwonk = f13;
                                }
                                int i710 = i23;
                                gtknphoqwxVar = gtknphoqwxVar3;
                                i34 = i710;
                            }
                            i33 = i33;
                            i29 = i29;
                            listIstkbnxepw = listNufgyqmvbu;
                            i38 = i38;
                            fIwizpuwonk = f13;
                            iGtknphoqwx = i24;
                            int i711 = i23;
                            gtknphoqwxVar = gtknphoqwxVar3;
                            i34 = i711;
                        }
                    }
                }
                iGxszxtbevo += iVdvldrhtss;
                i27 = i14;
                i28 = i15;
                nufgyqmvbuVar2 = nufgyqmvbuVar;
                iIntValue = iIntValue;
                drmInitDataPpxfxbqfkf = drmInitData2;
                iWypolnanlu2 = iWypolnanlu2;
                i37 = i19;
                str3 = str3;
            }
            iGxszxtbevo += iVdvldrhtss;
            i27 = i14;
            i28 = i15;
            nufgyqmvbuVar2 = nufgyqmvbuVar;
            iIntValue = iIntValue;
            drmInitDataPpxfxbqfkf = drmInitData2;
            iWypolnanlu2 = iWypolnanlu2;
            i37 = i19;
            str3 = str3;
        }
        DrmInitData drmInitData3 = drmInitDataPpxfxbqfkf;
        int i83 = iWypolnanlu2;
        float f15 = fIwizpuwonk;
        List list4 = listIstkbnxepw;
        int i84 = i34;
        int i85 = i37;
        int i86 = i38;
        int i87 = iGtknphoqwx;
        int i88 = i33;
        int i89 = i29;
        if (str2 == null) {
            return;
        }
        androidx.media3.common.iobyxmoadg.zoijcleaow zoijcleaowVarMbcevpiqjq = new androidx.media3.common.iobyxmoadg.zoijcleaow().jztzpxfvev(i16).zeieaojujs(str2).tzroggbefp(str4).auzgnhcxok(iWypolnanlu).okpsazkaxt(i83).opjhrmiecq(f15).lrnfpwlwnk(i17).iyctptxqzt(bArrCqumvgiudr).roivzttewh(i84).metgxyhuhe(list4).ydmasvzmpa(i35).sflfametgt(i36).jlmebxxoox(drmInitData3).uwvvkdfqfp(str).mbcevpiqjq(new v2.dxjokdxxww.zoijcleaow().wkgbmnqykc(i85).ppxfxbqfkf(i86).eablkybsjg(i87).gxszxtbevo(byteBufferIobyxmoadg != null ? byteBufferIobyxmoadg.array() : null).lqeggnwhkg(i89).zoijcleaow(i88).iobyxmoadg());
        if (iobyxmoadgVarBtonecajqb != null) {
            zoijcleaowVarMbcevpiqjq.stevsuqkhv(com.google.common.primitives.gxszxtbevo.gtknphoqwx(iobyxmoadgVarBtonecajqb.f68741iobyxmoadg)).bfopjjpdmp(com.google.common.primitives.gxszxtbevo.gtknphoqwx(iobyxmoadgVarBtonecajqb.f68742zoijcleaow));
        } else if (ppxfxbqfkfVarWflxmlrfwp != null) {
            zoijcleaowVarMbcevpiqjq.stevsuqkhv(com.google.common.primitives.gxszxtbevo.gtknphoqwx(ppxfxbqfkfVarWflxmlrfwp.f68751ppxfxbqfkf)).bfopjjpdmp(com.google.common.primitives.gxszxtbevo.gtknphoqwx(ppxfxbqfkfVarWflxmlrfwp.f68752wkgbmnqykc));
        }
        nufgyqmvbuVar.f68749zoijcleaow = zoijcleaowVarMbcevpiqjq.cllcsxoeiz();
    }

    private static ByteBuffer iobyxmoadg() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static zdlpuopuiu iozdgvuglv(z2.ppxfxbqfkf.zoijcleaow zoijcleaowVar, z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkf, long j13, DrmInitData drmInitData, boolean z13, boolean z14) throws ParserException {
        long[] jArr;
        long[] jArr2;
        androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz;
        z2.ppxfxbqfkf.zoijcleaow zoijcleaowVarWkgbmnqykc;
        Pair pairDraadjrbmk;
        z2.ppxfxbqfkf.zoijcleaow zoijcleaowVar2 = (z2.ppxfxbqfkf.zoijcleaow) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.wkgbmnqykc(1835297121));
        int iEablkybsjg = eablkybsjg(vdvldrhtss(((z2.ppxfxbqfkf.C3260ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar2.eablkybsjg(1751411826))).f127708zoijcleaow));
        if (iEablkybsjg == -1) {
            return null;
        }
        gtknphoqwx gtknphoqwxVarYadqdtsiqt = yadqdtsiqt(((z2.ppxfxbqfkf.C3260ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.eablkybsjg(1953196132))).f127708zoijcleaow);
        long j14 = j13 == -9223372036854775807L ? gtknphoqwxVarYadqdtsiqt.f68740zoijcleaow : j13;
        long j15 = jyumaefscl(c3260ppxfxbqfkf.f127708zoijcleaow).f127608ppxfxbqfkf;
        long jB = j14 != -9223372036854775807L ? stevsuqkhv.b(j14, 1000000L, j15) : -9223372036854775807L;
        z2.ppxfxbqfkf.zoijcleaow zoijcleaowVar3 = (z2.ppxfxbqfkf.zoijcleaow) y2.iobyxmoadg.eablkybsjg(((z2.ppxfxbqfkf.zoijcleaow) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar2.wkgbmnqykc(1835626086))).wkgbmnqykc(1937007212));
        eablkybsjg eablkybsjgVarKcexrzcfyt = kcexrzcfyt(((z2.ppxfxbqfkf.C3260ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar2.eablkybsjg(1835296868))).f127708zoijcleaow);
        z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkfEablkybsjg = zoijcleaowVar3.eablkybsjg(1937011556);
        if (c3260ppxfxbqfkfEablkybsjg == null) {
            throw ParserException.iobyxmoadg("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        nufgyqmvbu nufgyqmvbuVarIstkbnxepw = istkbnxepw(c3260ppxfxbqfkfEablkybsjg.f127708zoijcleaow, gtknphoqwxVarYadqdtsiqt.f68737iobyxmoadg, gtknphoqwxVarYadqdtsiqt.f68739wkgbmnqykc, eablkybsjgVarKcexrzcfyt.f68735ppxfxbqfkf, drmInitData, z14);
        if (z13 || (zoijcleaowVarWkgbmnqykc = zoijcleaowVar.wkgbmnqykc(1701082227)) == null || (pairDraadjrbmk = draadjrbmk(zoijcleaowVarWkgbmnqykc)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairDraadjrbmk.first;
            jArr2 = (long[]) pairDraadjrbmk.second;
            jArr = jArr3;
        }
        if (nufgyqmvbuVarIstkbnxepw.f68749zoijcleaow == null) {
            return null;
        }
        if (gtknphoqwxVarYadqdtsiqt.f68738ppxfxbqfkf != 0) {
            z2.zoijcleaow zoijcleaowVar4 = new z2.zoijcleaow(gtknphoqwxVarYadqdtsiqt.f68738ppxfxbqfkf);
            androidx.media3.common.iobyxmoadg.zoijcleaow zoijcleaowVarZoijcleaow = nufgyqmvbuVarIstkbnxepw.f68749zoijcleaow.zoijcleaow();
            v2.jyumaefscl jyumaefsclVar = nufgyqmvbuVarIstkbnxepw.f68749zoijcleaow.f9749draadjrbmk;
            iobyxmoadgVarCllcsxoeiz = zoijcleaowVarZoijcleaow.zfvoamnweg(jyumaefsclVar != null ? jyumaefsclVar.iobyxmoadg(zoijcleaowVar4) : new v2.jyumaefscl(zoijcleaowVar4)).cllcsxoeiz();
        } else {
            iobyxmoadgVarCllcsxoeiz = nufgyqmvbuVarIstkbnxepw.f68749zoijcleaow;
        }
        return new zdlpuopuiu(gtknphoqwxVarYadqdtsiqt.f68737iobyxmoadg, iEablkybsjg, eablkybsjgVarKcexrzcfyt.f68734iobyxmoadg, j15, jB, eablkybsjgVarKcexrzcfyt.f68736zoijcleaow, iobyxmoadgVarCllcsxoeiz, nufgyqmvbuVarIstkbnxepw.f68748wkgbmnqykc, nufgyqmvbuVarIstkbnxepw.f68746iobyxmoadg, nufgyqmvbuVarIstkbnxepw.f68747ppxfxbqfkf, jArr, jArr2);
    }

    private static nufgyqmvbu istkbnxepw(yadqdtsiqt yadqdtsiqtVar, int i13, int i14, String str, DrmInitData drmInitData, boolean z13) throws ParserException {
        int i15;
        yadqdtsiqtVar.sopmlzcsov(12);
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(iVdvldrhtss);
        for (int i16 = 0; i16 < iVdvldrhtss; i16++) {
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
            int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
            t3.kcexrzcfyt.iobyxmoadg(iVdvldrhtss2 > 0, "childAtomSize must be positive");
            int iVdvldrhtss3 = yadqdtsiqtVar.vdvldrhtss();
            if (iVdvldrhtss3 == 1635148593 || iVdvldrhtss3 == 1635148595 || iVdvldrhtss3 == 1701733238 || iVdvldrhtss3 == 1831958048 || iVdvldrhtss3 == 1836070006 || iVdvldrhtss3 == 1752589105 || iVdvldrhtss3 == 1751479857 || iVdvldrhtss3 == 1932670515 || iVdvldrhtss3 == 1211250227 || iVdvldrhtss3 == 1748121139 || iVdvldrhtss3 == 1987063864 || iVdvldrhtss3 == 1987063865 || iVdvldrhtss3 == 1635135537 || iVdvldrhtss3 == 1685479798 || iVdvldrhtss3 == 1685479729 || iVdvldrhtss3 == 1685481573 || iVdvldrhtss3 == 1685481521 || iVdvldrhtss3 == 1634760241) {
                i15 = iGxszxtbevo;
                hcddaimhww(yadqdtsiqtVar, iVdvldrhtss3, i15, iVdvldrhtss2, i13, str, i14, drmInitData, nufgyqmvbuVar, i16);
            } else if (iVdvldrhtss3 == 1836069985 || iVdvldrhtss3 == 1701733217 || iVdvldrhtss3 == 1633889587 || iVdvldrhtss3 == 1700998451 || iVdvldrhtss3 == 1633889588 || iVdvldrhtss3 == 1835823201 || iVdvldrhtss3 == 1685353315 || iVdvldrhtss3 == 1685353317 || iVdvldrhtss3 == 1685353320 || iVdvldrhtss3 == 1685353324 || iVdvldrhtss3 == 1685353336 || iVdvldrhtss3 == 1935764850 || iVdvldrhtss3 == 1935767394 || iVdvldrhtss3 == 1819304813 || iVdvldrhtss3 == 1936684916 || iVdvldrhtss3 == 1953984371 || iVdvldrhtss3 == 778924082 || iVdvldrhtss3 == 778924083 || iVdvldrhtss3 == 1835557169 || iVdvldrhtss3 == 1835560241 || iVdvldrhtss3 == 1634492771 || iVdvldrhtss3 == 1634492791 || iVdvldrhtss3 == 1970037111 || iVdvldrhtss3 == 1332770163 || iVdvldrhtss3 == 1716281667 || iVdvldrhtss3 == 1767992678) {
                i15 = iGxszxtbevo;
                nufgyqmvbu(yadqdtsiqtVar, iVdvldrhtss3, iGxszxtbevo, iVdvldrhtss2, i13, str, z13, drmInitData, nufgyqmvbuVar, i16);
            } else {
                if (iVdvldrhtss3 == 1414810956 || iVdvldrhtss3 == 1954034535 || iVdvldrhtss3 == 2004251764 || iVdvldrhtss3 == 1937010800 || iVdvldrhtss3 == 1664495672) {
                    cdpycssgdh(yadqdtsiqtVar, iVdvldrhtss3, iGxszxtbevo, iVdvldrhtss2, i13, str, nufgyqmvbuVar);
                } else if (iVdvldrhtss3 == 1835365492) {
                    yggfygwlhe(yadqdtsiqtVar, iVdvldrhtss3, iGxszxtbevo, i13, nufgyqmvbuVar);
                } else if (iVdvldrhtss3 == 1667329389) {
                    nufgyqmvbuVar.f68749zoijcleaow = new androidx.media3.common.iobyxmoadg.zoijcleaow().jztzpxfvev(i13).zeieaojujs("application/x-camera-motion").cllcsxoeiz();
                }
                i15 = iGxszxtbevo;
            }
            yadqdtsiqtVar.sopmlzcsov(i15 + iVdvldrhtss2);
        }
        return nufgyqmvbuVar;
    }

    private static float iwizpuwonk(yadqdtsiqt yadqdtsiqtVar, int i13) {
        yadqdtsiqtVar.sopmlzcsov(i13 + 8);
        return yadqdtsiqtVar.jpowsppfya() / yadqdtsiqtVar.jpowsppfya();
    }

    private static v2.jyumaefscl jpowsppfya(yadqdtsiqt yadqdtsiqtVar) {
        short sCdpycssgdh = yadqdtsiqtVar.cdpycssgdh();
        yadqdtsiqtVar.crxdokpmqz(2);
        String strYadqdtsiqt = yadqdtsiqtVar.yadqdtsiqt(sCdpycssgdh);
        int iMax = Math.max(strYadqdtsiqt.lastIndexOf(43), strYadqdtsiqt.lastIndexOf(45));
        try {
            return new v2.jyumaefscl(new z2.wkgbmnqykc(Float.parseFloat(strYadqdtsiqt.substring(0, iMax)), Float.parseFloat(strYadqdtsiqt.substring(iMax, strYadqdtsiqt.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static z2.eablkybsjg jyumaefscl(yadqdtsiqt yadqdtsiqtVar) {
        long jPmvmpeiblj;
        long jPmvmpeiblj2;
        yadqdtsiqtVar.sopmlzcsov(8);
        if (rgvfuqvkyq(yadqdtsiqtVar.vdvldrhtss()) == 0) {
            jPmvmpeiblj = yadqdtsiqtVar.pkzmftpjix();
            jPmvmpeiblj2 = yadqdtsiqtVar.pkzmftpjix();
        } else {
            jPmvmpeiblj = yadqdtsiqtVar.pmvmpeiblj();
            jPmvmpeiblj2 = yadqdtsiqtVar.pmvmpeiblj();
        }
        return new z2.eablkybsjg(jPmvmpeiblj, jPmvmpeiblj2, yadqdtsiqtVar.pkzmftpjix());
    }

    private static eablkybsjg kcexrzcfyt(yadqdtsiqt yadqdtsiqtVar) {
        long jB;
        yadqdtsiqtVar.sopmlzcsov(8);
        int iRgvfuqvkyq = rgvfuqvkyq(yadqdtsiqtVar.vdvldrhtss());
        yadqdtsiqtVar.crxdokpmqz(iRgvfuqvkyq == 0 ? 8 : 16);
        long jPkzmftpjix = yadqdtsiqtVar.pkzmftpjix();
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int i13 = iRgvfuqvkyq == 0 ? 4 : 8;
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                yadqdtsiqtVar.crxdokpmqz(i13);
                break;
            }
            if (yadqdtsiqtVar.eablkybsjg()[iGxszxtbevo + i14] != -1) {
                long jPkzmftpjix2 = iRgvfuqvkyq == 0 ? yadqdtsiqtVar.pkzmftpjix() : yadqdtsiqtVar.dsvhmnatus();
                if (jPkzmftpjix2 == 0) {
                    break;
                }
                jB = stevsuqkhv.b(jPkzmftpjix2, 1000000L, jPkzmftpjix);
                return new eablkybsjg(jPkzmftpjix, jB, wkgbmnqykc(yadqdtsiqtVar.wypolnanlu()));
            }
            i14++;
        }
        jB = -9223372036854775807L;
        return new eablkybsjg(jPkzmftpjix, jB, wkgbmnqykc(yadqdtsiqtVar.wypolnanlu()));
    }

    private static yggfygwlhe lereixgezr(yadqdtsiqt yadqdtsiqtVar, int i13, int i14, String str) {
        int i15;
        int i16;
        int i17 = i13 + 8;
        while (true) {
            byte[] bArr = null;
            if (i17 - i13 >= i14) {
                return null;
            }
            yadqdtsiqtVar.sopmlzcsov(i17);
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            if (yadqdtsiqtVar.vdvldrhtss() == 1952804451) {
                int iRgvfuqvkyq = rgvfuqvkyq(yadqdtsiqtVar.vdvldrhtss());
                yadqdtsiqtVar.crxdokpmqz(1);
                if (iRgvfuqvkyq == 0) {
                    yadqdtsiqtVar.crxdokpmqz(1);
                    i16 = 0;
                    i15 = 0;
                } else {
                    int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                    i15 = iWwaezpbzkn & 15;
                    i16 = (iWwaezpbzkn & 240) >> 4;
                }
                boolean z13 = yadqdtsiqtVar.wwaezpbzkn() == 1;
                int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
                byte[] bArr2 = new byte[16];
                yadqdtsiqtVar.draadjrbmk(bArr2, 0, 16);
                if (z13 && iWwaezpbzkn2 == 0) {
                    int iWwaezpbzkn3 = yadqdtsiqtVar.wwaezpbzkn();
                    bArr = new byte[iWwaezpbzkn3];
                    yadqdtsiqtVar.draadjrbmk(bArr, 0, iWwaezpbzkn3);
                }
                return new yggfygwlhe(z13, str, iWwaezpbzkn2, bArr2, i16, i15, bArr);
            }
            i17 += iVdvldrhtss;
        }
    }

    public static List lmojexxdyd(z2.ppxfxbqfkf.zoijcleaow zoijcleaowVar, zynmafqrjb zynmafqrjbVar, long j13, DrmInitData drmInitData, boolean z13, boolean z14, xa.eablkybsjg eablkybsjgVar) {
        zdlpuopuiu zdlpuopuiuVar;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < zoijcleaowVar.f127710wkgbmnqykc.size(); i13++) {
            z2.ppxfxbqfkf.zoijcleaow zoijcleaowVar2 = (z2.ppxfxbqfkf.zoijcleaow) zoijcleaowVar.f127710wkgbmnqykc.get(i13);
            if (zoijcleaowVar2.f127707iobyxmoadg == 1953653099 && (zdlpuopuiuVar = (zdlpuopuiu) eablkybsjgVar.apply(iozdgvuglv(zoijcleaowVar2, (z2.ppxfxbqfkf.C3260ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.eablkybsjg(1836476516)), j13, drmInitData, z13, z14))) != null) {
                arrayList.add(pmvmpeiblj(zdlpuopuiuVar, (z2.ppxfxbqfkf.zoijcleaow) y2.iobyxmoadg.eablkybsjg(((z2.ppxfxbqfkf.zoijcleaow) y2.iobyxmoadg.eablkybsjg(((z2.ppxfxbqfkf.zoijcleaow) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar2.wkgbmnqykc(1835297121))).wkgbmnqykc(1835626086))).wkgbmnqykc(1937007212)), zynmafqrjbVar));
            }
        }
        return arrayList;
    }

    private static v2.dxjokdxxww lqeggnwhkg(yadqdtsiqt yadqdtsiqtVar) {
        v2.dxjokdxxww.zoijcleaow zoijcleaowVar = new v2.dxjokdxxww.zoijcleaow();
        cdpycssgdh cdpycssgdhVar = new cdpycssgdh(yadqdtsiqtVar.eablkybsjg());
        cdpycssgdhVar.rgvfuqvkyq(yadqdtsiqtVar.gxszxtbevo() * 8);
        cdpycssgdhVar.kcexrzcfyt(1);
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(8);
        for (int i13 = 0; i13 < iNufgyqmvbu; i13++) {
            cdpycssgdhVar.kcexrzcfyt(1);
            int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(8);
            for (int i14 = 0; i14 < iNufgyqmvbu2; i14++) {
                cdpycssgdhVar.oxmwwwfdhm(6);
                boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
                cdpycssgdhVar.vdvldrhtss();
                cdpycssgdhVar.kcexrzcfyt(11);
                cdpycssgdhVar.oxmwwwfdhm(4);
                int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(4) + 8;
                zoijcleaowVar.lqeggnwhkg(iNufgyqmvbu3);
                zoijcleaowVar.zoijcleaow(iNufgyqmvbu3);
                cdpycssgdhVar.kcexrzcfyt(1);
                if (zLqeggnwhkg) {
                    int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(8);
                    int iNufgyqmvbu5 = cdpycssgdhVar.nufgyqmvbu(8);
                    cdpycssgdhVar.kcexrzcfyt(1);
                    zoijcleaowVar.wkgbmnqykc(v2.dxjokdxxww.btonecajqb(iNufgyqmvbu4)).ppxfxbqfkf(cdpycssgdhVar.lqeggnwhkg() ? 1 : 2).eablkybsjg(v2.dxjokdxxww.gtknphoqwx(iNufgyqmvbu5));
                }
            }
        }
        return zoijcleaowVar.iobyxmoadg();
    }

    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:151:0x020c  */
    /* JADX WARN: Code duplicated, block: B:153:0x021c  */
    /* JADX WARN: Code duplicated, block: B:156:0x0239  */
    /* JADX WARN: Code duplicated, block: B:158:0x023f  */
    /* JADX WARN: Code duplicated, block: B:163:0x025d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0262  */
    /* JADX WARN: Code duplicated, block: B:167:0x026d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0277  */
    /* JADX WARN: Code duplicated, block: B:170:0x027c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0287  */
    /* JADX WARN: Code duplicated, block: B:176:0x0295  */
    /* JADX WARN: Code duplicated, block: B:218:0x040a  */
    /* JADX WARN: Code duplicated, block: B:220:0x040d  */
    /* JADX WARN: Code duplicated, block: B:222:0x0414  */
    /* JADX WARN: Code duplicated, block: B:224:0x0422  */
    /* JADX WARN: Code duplicated, block: B:226:0x042a  */
    /* JADX WARN: Code duplicated, block: B:227:0x042f  */
    /* JADX WARN: Code duplicated, block: B:229:0x0437  */
    /* JADX WARN: Code duplicated, block: B:249:0x044b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x044b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0150  */
    private static void nufgyqmvbu(yadqdtsiqt yadqdtsiqtVar, int i13, int i14, int i15, int i16, String str, boolean z13, DrmInitData drmInitData, nufgyqmvbu nufgyqmvbuVar, int i17) throws ParserException {
        int iWypolnanlu;
        int iWypolnanlu2;
        int iYlkuphrtab;
        int iVdvldrhtss;
        int i18;
        String str2;
        int i19;
        String str3;
        List listIstkbnxepw;
        ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp;
        int iVdvldrhtss2;
        boolean z14;
        int iVdvldrhtss3;
        String str4;
        int iPpxfxbqfkf;
        byte[] bArr;
        int iWwaezpbzkn;
        byte[] bArr2;
        int iWwaezpbzkn2;
        String str5;
        byte[] bArr3;
        com.google.common.collect.zdlpuopuiu zdlpuopuiuVarCdpycssgdh;
        int iIntValue = i13;
        int i23 = i14;
        int i24 = i15;
        DrmInitData drmInitDataPpxfxbqfkf = drmInitData;
        yadqdtsiqtVar.sopmlzcsov(i23 + 16);
        if (z13) {
            iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
            yadqdtsiqtVar.crxdokpmqz(6);
        } else {
            yadqdtsiqtVar.crxdokpmqz(8);
            iWypolnanlu = 0;
        }
        if (iWypolnanlu == 0 || iWypolnanlu == 1) {
            iWypolnanlu2 = yadqdtsiqtVar.wypolnanlu();
            yadqdtsiqtVar.crxdokpmqz(6);
            iYlkuphrtab = yadqdtsiqtVar.ylkuphrtab();
            yadqdtsiqtVar.sopmlzcsov(yadqdtsiqtVar.gxszxtbevo() - 4);
            iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            if (iWypolnanlu == 1) {
                yadqdtsiqtVar.crxdokpmqz(16);
            }
            i18 = -1;
        } else {
            if (iWypolnanlu != 2) {
                return;
            }
            yadqdtsiqtVar.crxdokpmqz(16);
            iYlkuphrtab = (int) Math.round(yadqdtsiqtVar.ojitshcjhn());
            iWypolnanlu2 = yadqdtsiqtVar.jpowsppfya();
            yadqdtsiqtVar.crxdokpmqz(4);
            int iJpowsppfya = yadqdtsiqtVar.jpowsppfya();
            int iJpowsppfya2 = yadqdtsiqtVar.jpowsppfya();
            boolean z15 = (iJpowsppfya2 & 1) != 0;
            boolean z16 = (iJpowsppfya2 & 2) != 0;
            if (z15) {
                if (iJpowsppfya == 32) {
                    i18 = 4;
                } else {
                    i18 = -1;
                }
            } else if (iJpowsppfya == 8) {
                i18 = 3;
            } else if (iJpowsppfya == 16) {
                i18 = z16 ? 268435456 : 2;
            } else if (iJpowsppfya == 24) {
                i18 = z16 ? 1342177280 : 21;
            } else if (iJpowsppfya == 32) {
                i18 = z16 ? 1610612736 : 22;
            } else {
                i18 = -1;
            }
            yadqdtsiqtVar.crxdokpmqz(8);
            iVdvldrhtss = 0;
        }
        if (iIntValue == 1767992678) {
            iYlkuphrtab = -1;
            iWypolnanlu2 = -1;
        } else {
            if (iIntValue != 1935764850) {
                iYlkuphrtab = iIntValue == 1935767394 ? 16000 : 8000;
            }
            iWypolnanlu2 = 1;
        }
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        if (iIntValue == 1701733217) {
            Pair pairEsjtqupxsv = esjtqupxsv(yadqdtsiqtVar, i23, i24);
            if (pairEsjtqupxsv != null) {
                iIntValue = ((Integer) pairEsjtqupxsv.first).intValue();
                drmInitDataPpxfxbqfkf = drmInitDataPpxfxbqfkf == null ? null : drmInitDataPpxfxbqfkf.ppxfxbqfkf(((yggfygwlhe) pairEsjtqupxsv.second).f68711zoijcleaow);
                nufgyqmvbuVar.f68746iobyxmoadg[i17] = (yggfygwlhe) pairEsjtqupxsv.second;
            }
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
        }
        String str6 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (iIntValue != 1935767394) {
                if (iIntValue == 1936684916) {
                    str2 = "audio/raw";
                    i19 = 2;
                } else if (iIntValue == 1953984371) {
                    str2 = "audio/raw";
                    i19 = 268435456;
                } else if (iIntValue == 1819304813) {
                    if (i18 == -1) {
                        str2 = "audio/raw";
                        i19 = 2;
                    } else {
                        i19 = i18;
                        str2 = "audio/raw";
                    }
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = "audio/mpeg";
                } else if (iIntValue == 1835557169) {
                    str2 = "audio/mha1";
                } else if (iIntValue == 1835560241) {
                    i19 = i18;
                    str2 = "audio/mhm1";
                } else if (iIntValue == 1634492771) {
                    str2 = "audio/alac";
                } else if (iIntValue == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (iIntValue == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (iIntValue == 1332770163) {
                    str2 = "audio/opus";
                } else if (iIntValue == 1716281667) {
                    str2 = "audio/flac";
                } else if (iIntValue == 1835823201) {
                    str2 = "audio/true-hd";
                } else if (iIntValue == 1767992678) {
                    str2 = "audio/iamf";
                } else {
                    i19 = i18;
                    str2 = null;
                }
                int i25 = i19;
                str3 = null;
                listIstkbnxepw = null;
                ppxfxbqfkfVarWflxmlrfwp = null;
                iobyxmoadg iobyxmoadgVarBtonecajqb = null;
                while (iGxszxtbevo - i23 < i24) {
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
                    if (iVdvldrhtss2 > 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    t3.kcexrzcfyt.iobyxmoadg(z14, "childAtomSize must be positive");
                    iVdvldrhtss3 = yadqdtsiqtVar.vdvldrhtss();
                    if (iVdvldrhtss3 == 1835557187) {
                        yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 8);
                        yadqdtsiqtVar.crxdokpmqz(1);
                        iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
                        yadqdtsiqtVar.crxdokpmqz(1);
                        if (Objects.equals(str2, str6)) {
                            str5 = String.format("mhm1.%02X", Integer.valueOf(iWwaezpbzkn2));
                        } else {
                            str5 = String.format("mha1.%02X", Integer.valueOf(iWwaezpbzkn2));
                        }
                        String str7 = str5;
                        int iWypolnanlu3 = yadqdtsiqtVar.wypolnanlu();
                        bArr3 = new byte[iWypolnanlu3];
                        yadqdtsiqtVar.draadjrbmk(bArr3, 0, iWypolnanlu3);
                        if (listIstkbnxepw == null) {
                            zdlpuopuiuVarCdpycssgdh = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr3);
                        } else {
                            zdlpuopuiuVarCdpycssgdh = com.google.common.collect.zdlpuopuiu.cdpycssgdh(bArr3, (byte[]) listIstkbnxepw.get(0));
                        }
                        listIstkbnxepw = zdlpuopuiuVarCdpycssgdh;
                        str3 = str7;
                    } else {
                        if (iVdvldrhtss3 == 1835557200) {
                            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 8);
                            iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                            if (iWwaezpbzkn > 0) {
                                bArr2 = new byte[iWwaezpbzkn];
                                str4 = str6;
                                yadqdtsiqtVar.draadjrbmk(bArr2, 0, iWwaezpbzkn);
                                if (listIstkbnxepw == null) {
                                    listIstkbnxepw = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr2);
                                } else {
                                    listIstkbnxepw = com.google.common.collect.zdlpuopuiu.cdpycssgdh((byte[]) listIstkbnxepw.get(0), bArr2);
                                }
                            }
                        } else {
                            str4 = str6;
                            if (iVdvldrhtss3 != 1702061171 || (z13 && iVdvldrhtss3 == 2002876005)) {
                                if (iVdvldrhtss3 == 1702061171) {
                                    iPpxfxbqfkf = iGxszxtbevo;
                                } else {
                                    iPpxfxbqfkf = ppxfxbqfkf(yadqdtsiqtVar, 1702061171, iGxszxtbevo, iVdvldrhtss2);
                                }
                                if (iPpxfxbqfkf != -1) {
                                    ppxfxbqfkfVarWflxmlrfwp = wflxmlrfwp(yadqdtsiqtVar, iPpxfxbqfkf);
                                    str2 = ppxfxbqfkfVarWflxmlrfwp.f68750iobyxmoadg;
                                    bArr = ppxfxbqfkfVarWflxmlrfwp.f68753zoijcleaow;
                                    if (bArr != null) {
                                        if ("audio/vorbis".equals(str2)) {
                                            listIstkbnxepw = kegysxyocb.eablkybsjg(bArr);
                                        } else {
                                            if ("audio/mp4a-latm".equals(str2)) {
                                                t3.iobyxmoadg.zoijcleaow zoijcleaowVarEablkybsjg = t3.iobyxmoadg.eablkybsjg(bArr);
                                                int i26 = zoijcleaowVarEablkybsjg.f109438iobyxmoadg;
                                                int i27 = zoijcleaowVarEablkybsjg.f109440zoijcleaow;
                                                str3 = zoijcleaowVarEablkybsjg.f109439ppxfxbqfkf;
                                                iYlkuphrtab = i26;
                                                iWypolnanlu2 = i27;
                                            }
                                            listIstkbnxepw = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr);
                                        }
                                    }
                                }
                            } else if (iVdvldrhtss3 == 1651798644) {
                                iobyxmoadgVarBtonecajqb = btonecajqb(yadqdtsiqtVar, iGxszxtbevo);
                            } else if (iVdvldrhtss3 == 1684103987) {
                                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 8);
                                nufgyqmvbuVar.f68749zoijcleaow = t3.zoijcleaow.wkgbmnqykc(yadqdtsiqtVar, Integer.toString(i16), str, drmInitDataPpxfxbqfkf);
                            } else if (iVdvldrhtss3 == 1684366131) {
                                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 8);
                                nufgyqmvbuVar.f68749zoijcleaow = t3.zoijcleaow.nufgyqmvbu(yadqdtsiqtVar, Integer.toString(i16), str, drmInitDataPpxfxbqfkf);
                            } else if (iVdvldrhtss3 == 1684103988) {
                                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 8);
                                nufgyqmvbuVar.f68749zoijcleaow = t3.ppxfxbqfkf.wkgbmnqykc(yadqdtsiqtVar, Integer.toString(i16), str, drmInitDataPpxfxbqfkf);
                            } else if (iVdvldrhtss3 == 1684892784) {
                                if (iVdvldrhtss <= 0) {
                                    throw ParserException.iobyxmoadg("Invalid sample rate for Dolby TrueHD MLP stream: " + iVdvldrhtss, null);
                                }
                                iYlkuphrtab = iVdvldrhtss;
                                iWypolnanlu2 = 2;
                            } else if (iVdvldrhtss3 == 1684305011 || iVdvldrhtss3 == 1969517683) {
                                nufgyqmvbuVar.f68749zoijcleaow = new androidx.media3.common.iobyxmoadg.zoijcleaow().jztzpxfvev(i16).zeieaojujs(str2).kegysxyocb(iWypolnanlu2).nuxfzjnpeb(iYlkuphrtab).jlmebxxoox(drmInitDataPpxfxbqfkf).uwvvkdfqfp(str).cllcsxoeiz();
                            } else if (iVdvldrhtss3 == 1682927731) {
                                int i28 = iVdvldrhtss2 - 8;
                                byte[] bArr4 = f68724iobyxmoadg;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i28);
                                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 8);
                                yadqdtsiqtVar.draadjrbmk(bArrCopyOf, bArr4.length, i28);
                                listIstkbnxepw = wwaezpbzkn.iobyxmoadg(bArrCopyOf);
                            } else if (iVdvldrhtss3 == 1684425825) {
                                byte[] bArr5 = new byte[iVdvldrhtss2 - 8];
                                bArr5[0] = 102;
                                bArr5[1] = 76;
                                bArr5[2] = 97;
                                bArr5[3] = 67;
                                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 12);
                                yadqdtsiqtVar.draadjrbmk(bArr5, 4, iVdvldrhtss2 - 12);
                                listIstkbnxepw = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr5);
                            } else if (iVdvldrhtss3 == 1634492771) {
                                int i29 = iVdvldrhtss2 - 12;
                                byte[] bArr6 = new byte[i29];
                                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 12);
                                yadqdtsiqtVar.draadjrbmk(bArr6, 0, i29);
                                Pair pairYggfygwlhe = y2.btonecajqb.yggfygwlhe(bArr6);
                                int iIntValue2 = ((Integer) pairYggfygwlhe.first).intValue();
                                int iIntValue3 = ((Integer) pairYggfygwlhe.second).intValue();
                                listIstkbnxepw = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr6);
                                iYlkuphrtab = iIntValue2;
                                iWypolnanlu2 = iIntValue3;
                            } else if (iVdvldrhtss3 == 1767990114) {
                                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 9);
                                int iHkdspvbjdz = yadqdtsiqtVar.hkdspvbjdz();
                                byte[] bArr7 = new byte[iHkdspvbjdz];
                                yadqdtsiqtVar.draadjrbmk(bArr7, 0, iHkdspvbjdz);
                                listIstkbnxepw = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr7);
                            }
                            iGxszxtbevo += iVdvldrhtss2;
                            i23 = i14;
                            i24 = i15;
                            str6 = str4;
                        }
                        iGxszxtbevo += iVdvldrhtss2;
                        i23 = i14;
                        i24 = i15;
                        str6 = str4;
                    }
                    str4 = str6;
                    iGxszxtbevo += iVdvldrhtss2;
                    i23 = i14;
                    i24 = i15;
                    str6 = str4;
                }
                if (nufgyqmvbuVar.f68749zoijcleaow == null || str2 == null) {
                }
                androidx.media3.common.iobyxmoadg.zoijcleaow zoijcleaowVarUwvvkdfqfp = new androidx.media3.common.iobyxmoadg.zoijcleaow().jztzpxfvev(i16).zeieaojujs(str2).tzroggbefp(str3).kegysxyocb(iWypolnanlu2).nuxfzjnpeb(iYlkuphrtab).oipsdeybqn(i25).metgxyhuhe(listIstkbnxepw).jlmebxxoox(drmInitDataPpxfxbqfkf).uwvvkdfqfp(str);
                if (ppxfxbqfkfVarWflxmlrfwp != null) {
                    zoijcleaowVarUwvvkdfqfp.stevsuqkhv(com.google.common.primitives.gxszxtbevo.gtknphoqwx(ppxfxbqfkfVarWflxmlrfwp.f68751ppxfxbqfkf)).bfopjjpdmp(com.google.common.primitives.gxszxtbevo.gtknphoqwx(ppxfxbqfkfVarWflxmlrfwp.f68752wkgbmnqykc));
                } else if (iobyxmoadgVarBtonecajqb != null) {
                    zoijcleaowVarUwvvkdfqfp.stevsuqkhv(com.google.common.primitives.gxszxtbevo.gtknphoqwx(iobyxmoadgVarBtonecajqb.f68741iobyxmoadg)).bfopjjpdmp(com.google.common.primitives.gxszxtbevo.gtknphoqwx(iobyxmoadgVarBtonecajqb.f68742zoijcleaow));
                }
                nufgyqmvbuVar.f68749zoijcleaow = zoijcleaowVarUwvvkdfqfp.cllcsxoeiz();
                return;
            }
            str2 = "audio/amr-wb";
        }
        i19 = i18;
        int i210 = i19;
        str3 = null;
        listIstkbnxepw = null;
        ppxfxbqfkfVarWflxmlrfwp = null;
        iobyxmoadg iobyxmoadgVarBtonecajqb2 = null;
        while (iGxszxtbevo - i23 < i24) {
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
            if (iVdvldrhtss2 > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            t3.kcexrzcfyt.iobyxmoadg(z14, "childAtomSize must be positive");
            iVdvldrhtss3 = yadqdtsiqtVar.vdvldrhtss();
            if (iVdvldrhtss3 == 1835557187) {
                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 8);
                yadqdtsiqtVar.crxdokpmqz(1);
                iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
                yadqdtsiqtVar.crxdokpmqz(1);
                if (Objects.equals(str2, str6)) {
                    str5 = String.format("mhm1.%02X", Integer.valueOf(iWwaezpbzkn2));
                } else {
                    str5 = String.format("mha1.%02X", Integer.valueOf(iWwaezpbzkn2));
                }
                String str8 = str5;
                int iWypolnanlu4 = yadqdtsiqtVar.wypolnanlu();
                bArr3 = new byte[iWypolnanlu4];
                yadqdtsiqtVar.draadjrbmk(bArr3, 0, iWypolnanlu4);
                if (listIstkbnxepw == null) {
                    zdlpuopuiuVarCdpycssgdh = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr3);
                } else {
                    zdlpuopuiuVarCdpycssgdh = com.google.common.collect.zdlpuopuiu.cdpycssgdh(bArr3, (byte[]) listIstkbnxepw.get(0));
                }
                listIstkbnxepw = zdlpuopuiuVarCdpycssgdh;
                str3 = str8;
            } else {
                if (iVdvldrhtss3 == 1835557200) {
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 8);
                    iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                    if (iWwaezpbzkn > 0) {
                        bArr2 = new byte[iWwaezpbzkn];
                        str4 = str6;
                        yadqdtsiqtVar.draadjrbmk(bArr2, 0, iWwaezpbzkn);
                        if (listIstkbnxepw == null) {
                            listIstkbnxepw = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr2);
                        } else {
                            listIstkbnxepw = com.google.common.collect.zdlpuopuiu.cdpycssgdh((byte[]) listIstkbnxepw.get(0), bArr2);
                        }
                    }
                } else {
                    str4 = str6;
                    if (iVdvldrhtss3 != 1702061171) {
                        if (iVdvldrhtss3 == 1702061171) {
                            iPpxfxbqfkf = iGxszxtbevo;
                        } else {
                            iPpxfxbqfkf = ppxfxbqfkf(yadqdtsiqtVar, 1702061171, iGxszxtbevo, iVdvldrhtss2);
                        }
                        if (iPpxfxbqfkf != -1) {
                            ppxfxbqfkfVarWflxmlrfwp = wflxmlrfwp(yadqdtsiqtVar, iPpxfxbqfkf);
                            str2 = ppxfxbqfkfVarWflxmlrfwp.f68750iobyxmoadg;
                            bArr = ppxfxbqfkfVarWflxmlrfwp.f68753zoijcleaow;
                            if (bArr != null) {
                                if ("audio/vorbis".equals(str2)) {
                                    listIstkbnxepw = kegysxyocb.eablkybsjg(bArr);
                                } else {
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        t3.iobyxmoadg.zoijcleaow zoijcleaowVarEablkybsjg2 = t3.iobyxmoadg.eablkybsjg(bArr);
                                        int i211 = zoijcleaowVarEablkybsjg2.f109438iobyxmoadg;
                                        int i212 = zoijcleaowVarEablkybsjg2.f109440zoijcleaow;
                                        str3 = zoijcleaowVarEablkybsjg2.f109439ppxfxbqfkf;
                                        iYlkuphrtab = i211;
                                        iWypolnanlu2 = i212;
                                    }
                                    listIstkbnxepw = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr);
                                }
                            }
                        }
                    } else {
                        if (iVdvldrhtss3 == 1702061171) {
                            iPpxfxbqfkf = iGxszxtbevo;
                        } else {
                            iPpxfxbqfkf = ppxfxbqfkf(yadqdtsiqtVar, 1702061171, iGxszxtbevo, iVdvldrhtss2);
                        }
                        if (iPpxfxbqfkf != -1) {
                            ppxfxbqfkfVarWflxmlrfwp = wflxmlrfwp(yadqdtsiqtVar, iPpxfxbqfkf);
                            str2 = ppxfxbqfkfVarWflxmlrfwp.f68750iobyxmoadg;
                            bArr = ppxfxbqfkfVarWflxmlrfwp.f68753zoijcleaow;
                            if (bArr != null) {
                                if ("audio/vorbis".equals(str2)) {
                                    listIstkbnxepw = kegysxyocb.eablkybsjg(bArr);
                                } else {
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        t3.iobyxmoadg.zoijcleaow zoijcleaowVarEablkybsjg3 = t3.iobyxmoadg.eablkybsjg(bArr);
                                        int i213 = zoijcleaowVarEablkybsjg3.f109438iobyxmoadg;
                                        int i214 = zoijcleaowVarEablkybsjg3.f109440zoijcleaow;
                                        str3 = zoijcleaowVarEablkybsjg3.f109439ppxfxbqfkf;
                                        iYlkuphrtab = i213;
                                        iWypolnanlu2 = i214;
                                    }
                                    listIstkbnxepw = com.google.common.collect.zdlpuopuiu.istkbnxepw(bArr);
                                }
                            }
                        }
                    }
                    iGxszxtbevo += iVdvldrhtss2;
                    i23 = i14;
                    i24 = i15;
                    str6 = str4;
                }
                iGxszxtbevo += iVdvldrhtss2;
                i23 = i14;
                i24 = i15;
                str6 = str4;
            }
            str4 = str6;
            iGxszxtbevo += iVdvldrhtss2;
            i23 = i14;
            i24 = i15;
            str6 = str4;
        }
        if (nufgyqmvbuVar.f68749zoijcleaow == null) {
        }
    }

    public static int ojitshcjhn(int i13) {
        return i13 & 16777215;
    }

    private static v2.jyumaefscl oxmwwwfdhm(yadqdtsiqt yadqdtsiqtVar, int i13) {
        yadqdtsiqtVar.crxdokpmqz(8);
        ArrayList arrayList = new ArrayList();
        while (yadqdtsiqtVar.gxszxtbevo() < i13) {
            v2.jyumaefscl.iobyxmoadg iobyxmoadgVarWkgbmnqykc = n4.btonecajqb.wkgbmnqykc(yadqdtsiqtVar);
            if (iobyxmoadgVarWkgbmnqykc != null) {
                arrayList.add(iobyxmoadgVarWkgbmnqykc);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new v2.jyumaefscl(arrayList);
    }

    static draadjrbmk pkzmftpjix(yadqdtsiqt yadqdtsiqtVar, int i13, int i14) throws ParserException {
        yadqdtsiqtVar.sopmlzcsov(i13 + 8);
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        wkgbmnqykc wkgbmnqykcVarZynmafqrjb = null;
        while (iGxszxtbevo - i13 < i14) {
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            t3.kcexrzcfyt.iobyxmoadg(iVdvldrhtss > 0, "childAtomSize must be positive");
            if (yadqdtsiqtVar.vdvldrhtss() == 1702454643) {
                wkgbmnqykcVarZynmafqrjb = zynmafqrjb(yadqdtsiqtVar, iGxszxtbevo, iVdvldrhtss);
            }
            iGxszxtbevo += iVdvldrhtss;
        }
        if (wkgbmnqykcVarZynmafqrjb == null) {
            return null;
        }
        return new draadjrbmk(wkgbmnqykcVarZynmafqrjb);
    }

    public static iwizpuwonk pmvmpeiblj(zdlpuopuiu zdlpuopuiuVar, z2.ppxfxbqfkf.zoijcleaow zoijcleaowVar, zynmafqrjb zynmafqrjbVar) throws ParserException {
        gxszxtbevo btonecajqbVar;
        boolean z13;
        int iJpowsppfya;
        int iJpowsppfya2;
        int iJpowsppfya3;
        int i13;
        int i14;
        long[] jArr;
        int[] iArr;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        int i15;
        boolean z14;
        int i16;
        zdlpuopuiu zdlpuopuiuVarIobyxmoadg;
        int[] iArr2;
        long[] jArr2;
        int[] iArr3;
        long j13;
        long j14;
        int i17;
        int i18;
        int iVdvldrhtss;
        int i19;
        int[] iArr4;
        int[] iArr5;
        int i23;
        zdlpuopuiu zdlpuopuiuVarIobyxmoadg2 = zdlpuopuiuVar;
        z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkfEablkybsjg = zoijcleaowVar.eablkybsjg(1937011578);
        if (c3260ppxfxbqfkfEablkybsjg != null) {
            btonecajqbVar = new dxjokdxxww(c3260ppxfxbqfkfEablkybsjg, zdlpuopuiuVarIobyxmoadg2.f68719lqeggnwhkg);
        } else {
            z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkfEablkybsjg2 = zoijcleaowVar.eablkybsjg(1937013298);
            if (c3260ppxfxbqfkfEablkybsjg2 == null) {
                throw ParserException.iobyxmoadg("Track has no sample table size information", null);
            }
            btonecajqbVar = new btonecajqb(c3260ppxfxbqfkfEablkybsjg2);
        }
        int iPpxfxbqfkf = btonecajqbVar.ppxfxbqfkf();
        if (iPpxfxbqfkf == 0) {
            return new iwizpuwonk(zdlpuopuiuVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (zdlpuopuiuVarIobyxmoadg2.f68723zoijcleaow == 2) {
            long j15 = zdlpuopuiuVarIobyxmoadg2.f68717gxszxtbevo;
            if (j15 > 0) {
                zdlpuopuiuVarIobyxmoadg2 = zdlpuopuiuVarIobyxmoadg2.iobyxmoadg(zdlpuopuiuVarIobyxmoadg2.f68719lqeggnwhkg.zoijcleaow().jhduphickx(iPpxfxbqfkf / (j15 / 1000000.0f)).cllcsxoeiz());
            }
        }
        z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkfEablkybsjg3 = zoijcleaowVar.eablkybsjg(1937007471);
        if (c3260ppxfxbqfkfEablkybsjg3 == null) {
            c3260ppxfxbqfkfEablkybsjg3 = (z2.ppxfxbqfkf.C3260ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.eablkybsjg(1668232756));
            z13 = true;
        } else {
            z13 = false;
        }
        yadqdtsiqt yadqdtsiqtVar = c3260ppxfxbqfkfEablkybsjg3.f127708zoijcleaow;
        yadqdtsiqt yadqdtsiqtVar2 = ((z2.ppxfxbqfkf.C3260ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.eablkybsjg(1937011555))).f127708zoijcleaow;
        yadqdtsiqt yadqdtsiqtVar3 = ((z2.ppxfxbqfkf.C3260ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.eablkybsjg(1937011827))).f127708zoijcleaow;
        z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkfEablkybsjg4 = zoijcleaowVar.eablkybsjg(1937011571);
        yadqdtsiqt yadqdtsiqtVar4 = c3260ppxfxbqfkfEablkybsjg4 != null ? c3260ppxfxbqfkfEablkybsjg4.f127708zoijcleaow : null;
        z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkfEablkybsjg5 = zoijcleaowVar.eablkybsjg(1668576371);
        yadqdtsiqt yadqdtsiqtVar5 = c3260ppxfxbqfkfEablkybsjg5 != null ? c3260ppxfxbqfkfEablkybsjg5.f127708zoijcleaow : null;
        C1478zoijcleaow c1478zoijcleaow = new C1478zoijcleaow(yadqdtsiqtVar2, yadqdtsiqtVar, z13);
        yadqdtsiqtVar3.sopmlzcsov(12);
        int iJpowsppfya4 = yadqdtsiqtVar3.jpowsppfya() - 1;
        int iJpowsppfya5 = yadqdtsiqtVar3.jpowsppfya();
        int iJpowsppfya6 = yadqdtsiqtVar3.jpowsppfya();
        if (yadqdtsiqtVar5 != null) {
            yadqdtsiqtVar5.sopmlzcsov(12);
            iJpowsppfya = yadqdtsiqtVar5.jpowsppfya();
        } else {
            iJpowsppfya = 0;
        }
        if (yadqdtsiqtVar4 != null) {
            yadqdtsiqtVar4.sopmlzcsov(12);
            iJpowsppfya3 = yadqdtsiqtVar4.jpowsppfya();
            if (iJpowsppfya3 > 0) {
                iJpowsppfya2 = yadqdtsiqtVar4.jpowsppfya() - 1;
            } else {
                iJpowsppfya2 = -1;
                yadqdtsiqtVar4 = null;
            }
        } else {
            iJpowsppfya2 = -1;
            iJpowsppfya3 = 0;
        }
        int iZoijcleaow = btonecajqbVar.zoijcleaow();
        String str = zdlpuopuiuVarIobyxmoadg2.f68719lqeggnwhkg.f9769ojitshcjhn;
        if (iZoijcleaow != -1 && ("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iJpowsppfya4 == 0 && iJpowsppfya == 0 && iJpowsppfya3 == 0) {
            int i24 = c1478zoijcleaow.f68758iobyxmoadg;
            long[] jArr3 = new long[i24];
            int[] iArr6 = new int[i24];
            while (c1478zoijcleaow.iobyxmoadg()) {
                int i25 = c1478zoijcleaow.f68763zoijcleaow;
                jArr3[i25] = c1478zoijcleaow.f68762wkgbmnqykc;
                iArr6[i25] = c1478zoijcleaow.f68761ppxfxbqfkf;
            }
            n4.wkgbmnqykc.zoijcleaow zoijcleaowVarIobyxmoadg = n4.wkgbmnqykc.iobyxmoadg(iZoijcleaow, jArr3, iArr6, iJpowsppfya6);
            jArr = zoijcleaowVarIobyxmoadg.f68702iobyxmoadg;
            int[] iArr7 = zoijcleaowVarIobyxmoadg.f68706zoijcleaow;
            int i26 = zoijcleaowVarIobyxmoadg.f68704ppxfxbqfkf;
            long[] jArr4 = zoijcleaowVarIobyxmoadg.f68705wkgbmnqykc;
            int[] iArr8 = zoijcleaowVarIobyxmoadg.f68700eablkybsjg;
            long j16 = zoijcleaowVarIobyxmoadg.f68701gxszxtbevo;
            j14 = zoijcleaowVarIobyxmoadg.f68703lqeggnwhkg;
            zdlpuopuiuVarIobyxmoadg = zdlpuopuiuVarIobyxmoadg2;
            iArr2 = iArr7;
            i13 = i26;
            jArr2 = jArr4;
            iArr3 = iArr8;
            j13 = j16;
        } else {
            long[] jArr5 = new long[iPpxfxbqfkf];
            int[] iArr9 = new int[iPpxfxbqfkf];
            long[] jArr6 = new long[iPpxfxbqfkf];
            int[] iArr10 = new int[iPpxfxbqfkf];
            int i27 = iJpowsppfya4;
            int iJpowsppfya7 = iJpowsppfya2;
            int i28 = iJpowsppfya;
            i13 = 0;
            int i29 = 0;
            int iVdvldrhtss2 = 0;
            int iJpowsppfya8 = 0;
            long j17 = 0;
            long j18 = 0;
            long j19 = 0;
            zdlpuopuiu zdlpuopuiuVar2 = zdlpuopuiuVarIobyxmoadg2;
            int i33 = 0;
            while (true) {
                if (i33 >= iPpxfxbqfkf) {
                    i14 = iJpowsppfya3;
                    jArr = jArr5;
                    iArr = iArr9;
                    jArrCopyOf = jArr6;
                    iArrCopyOf = iArr10;
                    i15 = i29;
                    break;
                }
                long j23 = j18;
                int i34 = i29;
                boolean zIobyxmoadg = true;
                while (i34 == 0) {
                    zIobyxmoadg = c1478zoijcleaow.iobyxmoadg();
                    if (!zIobyxmoadg) {
                        break;
                    }
                    int i35 = iJpowsppfya6;
                    long j24 = c1478zoijcleaow.f68762wkgbmnqykc;
                    i34 = c1478zoijcleaow.f68761ppxfxbqfkf;
                    j23 = j24;
                    iJpowsppfya6 = i35;
                    iJpowsppfya3 = iJpowsppfya3;
                    iPpxfxbqfkf = iPpxfxbqfkf;
                }
                int i36 = iPpxfxbqfkf;
                int i37 = iJpowsppfya6;
                i14 = iJpowsppfya3;
                if (!zIobyxmoadg) {
                    y2.kcexrzcfyt.nufgyqmvbu("BoxParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr5, i33);
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr9, i33);
                    jArrCopyOf = Arrays.copyOf(jArr6, i33);
                    iArrCopyOf = Arrays.copyOf(iArr10, i33);
                    jArr = jArrCopyOf2;
                    iArr = iArrCopyOf2;
                    iPpxfxbqfkf = i33;
                    i15 = i34;
                    break;
                }
                if (yadqdtsiqtVar5 != null) {
                    while (iJpowsppfya8 == 0 && i28 > 0) {
                        iJpowsppfya8 = yadqdtsiqtVar5.jpowsppfya();
                        iVdvldrhtss2 = yadqdtsiqtVar5.vdvldrhtss();
                        i28--;
                    }
                    iJpowsppfya8--;
                }
                int i38 = iVdvldrhtss2;
                jArr5[i33] = j23;
                int iIobyxmoadg = btonecajqbVar.iobyxmoadg();
                iArr9[i33] = iIobyxmoadg;
                C1478zoijcleaow c1478zoijcleaow2 = c1478zoijcleaow;
                gxszxtbevo gxszxtbevoVar = btonecajqbVar;
                j19 += (long) iIobyxmoadg;
                if (iIobyxmoadg > i13) {
                    i13 = iIobyxmoadg;
                }
                jArr6[i33] = j17 + ((long) i38);
                iArr10[i33] = yadqdtsiqtVar4 == null ? 1 : 0;
                if (i33 == iJpowsppfya7) {
                    iArr10[i33] = 1;
                    i18 = i14 - 1;
                    if (i18 > 0) {
                        iJpowsppfya7 = ((yadqdtsiqt) y2.iobyxmoadg.eablkybsjg(yadqdtsiqtVar4)).jpowsppfya() - 1;
                    }
                    i17 = iJpowsppfya7;
                } else {
                    i17 = iJpowsppfya7;
                    i18 = i14;
                }
                j17 += (long) i37;
                iJpowsppfya5--;
                if (iJpowsppfya5 != 0 || i27 <= 0) {
                    iVdvldrhtss = i37;
                    i19 = i27;
                } else {
                    int iJpowsppfya9 = yadqdtsiqtVar3.jpowsppfya();
                    iVdvldrhtss = yadqdtsiqtVar3.vdvldrhtss();
                    i19 = i27 - 1;
                    iJpowsppfya5 = iJpowsppfya9;
                }
                int i39 = iVdvldrhtss;
                long j25 = j23 + ((long) iArr9[i33]);
                i29 = i34 - 1;
                i33++;
                j18 = j25;
                iVdvldrhtss2 = i38;
                iJpowsppfya7 = i17;
                iPpxfxbqfkf = i36;
                c1478zoijcleaow = c1478zoijcleaow2;
                int i43 = i19;
                iJpowsppfya6 = i39;
                i27 = i43;
                iJpowsppfya3 = i18;
                btonecajqbVar = gxszxtbevoVar;
            }
            long j26 = j17 + ((long) iVdvldrhtss2);
            if (yadqdtsiqtVar5 == null) {
                z14 = true;
                break;
            }
            while (true) {
                if (i28 <= 0) {
                    z14 = true;
                    break;
                }
                if (yadqdtsiqtVar5.jpowsppfya() != 0) {
                    z14 = false;
                    break;
                }
                yadqdtsiqtVar5.vdvldrhtss();
                i28--;
            }
            if (i14 == 0 && iJpowsppfya5 == 0 && i15 == 0 && i27 == 0) {
                i16 = iJpowsppfya8;
                if (i16 == 0 && z14) {
                    zdlpuopuiuVarIobyxmoadg = zdlpuopuiuVar2;
                }
                iArr2 = iArr;
                jArr2 = jArrCopyOf;
                iArr3 = iArrCopyOf;
                j13 = j26;
                j14 = j19;
            } else {
                i16 = iJpowsppfya8;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Inconsistent stbl box for track ");
            zdlpuopuiuVarIobyxmoadg = zdlpuopuiuVar2;
            sb3.append(zdlpuopuiuVarIobyxmoadg.f68718iobyxmoadg);
            sb3.append(": remainingSynchronizationSamples ");
            sb3.append(i14);
            sb3.append(", remainingSamplesAtTimestampDelta ");
            sb3.append(iJpowsppfya5);
            sb3.append(", remainingSamplesInChunk ");
            sb3.append(i15);
            sb3.append(", remainingTimestampDeltaChanges ");
            sb3.append(i27);
            sb3.append(", remainingSamplesAtTimestampOffset ");
            sb3.append(i16);
            sb3.append(!z14 ? ", ctts invalid" : "");
            y2.kcexrzcfyt.nufgyqmvbu("BoxParsers", sb3.toString());
            iArr2 = iArr;
            jArr2 = jArrCopyOf;
            iArr3 = iArrCopyOf;
            j13 = j26;
            j14 = j19;
        }
        long j27 = zdlpuopuiuVarIobyxmoadg.f68717gxszxtbevo;
        if (j27 > 0) {
            long jD = stevsuqkhv.d(j14 * 8, 1000000L, j27, RoundingMode.HALF_DOWN);
            if (jD > 0 && jD < 2147483647L) {
                zdlpuopuiuVarIobyxmoadg = zdlpuopuiuVarIobyxmoadg.iobyxmoadg(zdlpuopuiuVarIobyxmoadg.f68719lqeggnwhkg.zoijcleaow().stevsuqkhv((int) jD).cllcsxoeiz());
            }
        }
        int[] iArr11 = iArr3;
        long jB = stevsuqkhv.b(j13, 1000000L, zdlpuopuiuVarIobyxmoadg.f68721ppxfxbqfkf);
        long[] jArr7 = zdlpuopuiuVarIobyxmoadg.f68714dxjokdxxww;
        if (jArr7 == null) {
            stevsuqkhv.c(jArr2, 1000000L, zdlpuopuiuVarIobyxmoadg.f68721ppxfxbqfkf);
            return new iwizpuwonk(zdlpuopuiuVarIobyxmoadg, jArr, iArr2, i13, jArr2, iArr11, jB);
        }
        if (jArr7.length == 1 && zdlpuopuiuVarIobyxmoadg.f68723zoijcleaow == 1 && jArr2.length >= 2) {
            long j28 = ((long[]) y2.iobyxmoadg.eablkybsjg(zdlpuopuiuVarIobyxmoadg.f68712btonecajqb))[0];
            iArr4 = iArr11;
            long jB2 = stevsuqkhv.b(zdlpuopuiuVarIobyxmoadg.f68714dxjokdxxww[0], zdlpuopuiuVarIobyxmoadg.f68721ppxfxbqfkf, zdlpuopuiuVarIobyxmoadg.f68722wkgbmnqykc) + j28;
            if (zoijcleaow(jArr2, j13, j28, jB2)) {
                long j29 = j13 - jB2;
                long jB3 = stevsuqkhv.b(j28 - jArr2[0], zdlpuopuiuVarIobyxmoadg.f68719lqeggnwhkg.f9759iozdgvuglv, zdlpuopuiuVarIobyxmoadg.f68721ppxfxbqfkf);
                long jB4 = stevsuqkhv.b(j29, zdlpuopuiuVarIobyxmoadg.f68719lqeggnwhkg.f9759iozdgvuglv, zdlpuopuiuVarIobyxmoadg.f68721ppxfxbqfkf);
                if ((jB3 != 0 || jB4 != 0) && jB3 <= 2147483647L && jB4 <= 2147483647L) {
                    zynmafqrjbVar.f109586iobyxmoadg = (int) jB3;
                    zynmafqrjbVar.f109587zoijcleaow = (int) jB4;
                    stevsuqkhv.c(jArr2, 1000000L, zdlpuopuiuVarIobyxmoadg.f68721ppxfxbqfkf);
                    return new iwizpuwonk(zdlpuopuiuVarIobyxmoadg, jArr, iArr2, i13, jArr2, iArr4, stevsuqkhv.b(zdlpuopuiuVarIobyxmoadg.f68714dxjokdxxww[0], 1000000L, zdlpuopuiuVarIobyxmoadg.f68722wkgbmnqykc));
                }
            }
        } else {
            iArr4 = iArr11;
        }
        long[] jArr8 = zdlpuopuiuVarIobyxmoadg.f68714dxjokdxxww;
        if (jArr8.length == 1 && jArr8[0] == 0) {
            long j33 = ((long[]) y2.iobyxmoadg.eablkybsjg(zdlpuopuiuVarIobyxmoadg.f68712btonecajqb))[0];
            for (int i44 = 0; i44 < jArr2.length; i44++) {
                jArr2[i44] = stevsuqkhv.b(jArr2[i44] - j33, 1000000L, zdlpuopuiuVarIobyxmoadg.f68721ppxfxbqfkf);
            }
            return new iwizpuwonk(zdlpuopuiuVarIobyxmoadg, jArr, iArr2, i13, jArr2, iArr4, stevsuqkhv.b(j13 - j33, 1000000L, zdlpuopuiuVarIobyxmoadg.f68721ppxfxbqfkf));
        }
        boolean z15 = zdlpuopuiuVarIobyxmoadg.f68723zoijcleaow == 1;
        int[] iArr12 = new int[jArr8.length];
        int[] iArr13 = new int[jArr8.length];
        long[] jArr9 = (long[]) y2.iobyxmoadg.eablkybsjg(zdlpuopuiuVarIobyxmoadg.f68712btonecajqb);
        boolean z16 = false;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        while (true) {
            long[] jArr10 = zdlpuopuiuVarIobyxmoadg.f68714dxjokdxxww;
            if (i45 >= jArr10.length) {
                break;
            }
            int i48 = i13;
            long j34 = jArr9[i45];
            if (j34 != -1) {
                boolean z17 = z16;
                long jB5 = stevsuqkhv.b(jArr10[i45], zdlpuopuiuVarIobyxmoadg.f68721ppxfxbqfkf, zdlpuopuiuVarIobyxmoadg.f68722wkgbmnqykc);
                iArr12[i45] = stevsuqkhv.lqeggnwhkg(jArr2, j34, true, true);
                long j35 = j34 + jB5;
                iArr13[i45] = stevsuqkhv.wkgbmnqykc(jArr2, j35, z15, false);
                int i49 = iArr12[i45];
                while (true) {
                    i23 = iArr12[i45];
                    if (i23 < 0 || (iArr4[i23] & 1) != 0) {
                        break;
                    }
                    iArr12[i45] = i23 - 1;
                }
                if (i23 < 0) {
                    iArr12[i45] = i49;
                    while (true) {
                        int i53 = iArr12[i45];
                        if (i53 >= iArr13[i45] || (iArr4[i53] & 1) != 0) {
                            break;
                        }
                        iArr12[i45] = i53 + 1;
                    }
                }
                if (zdlpuopuiuVarIobyxmoadg.f68723zoijcleaow == 2 && iArr12[i45] != iArr13[i45]) {
                    while (true) {
                        int i54 = iArr13[i45];
                        if (i54 >= jArr2.length - 1 || jArr2[i54 + 1] > j35) {
                            break;
                        }
                        iArr13[i45] = i54 + 1;
                    }
                }
                int i55 = iArr13[i45];
                int i56 = iArr12[i45];
                i46 += i55 - i56;
                z16 = z17 | (i47 != i56);
                i47 = i55;
            }
            i45++;
            jArr9 = jArr9;
            iArr2 = iArr2;
            i13 = i48;
            iPpxfxbqfkf = iPpxfxbqfkf;
        }
        int[] iArr14 = iArr2;
        int i57 = i13;
        int i58 = 0;
        boolean z18 = z16 | (i46 != iPpxfxbqfkf);
        long[] jArr11 = z18 ? new long[i46] : jArr;
        int[] iArr15 = z18 ? new int[i46] : iArr14;
        int i59 = z18 ? 0 : i57;
        int[] iArr16 = z18 ? new int[i46] : iArr4;
        long[] jArr12 = new long[i46];
        boolean z19 = false;
        int i63 = 0;
        int i64 = i59;
        long j36 = 0;
        while (i58 < zdlpuopuiuVarIobyxmoadg.f68714dxjokdxxww.length) {
            long j37 = zdlpuopuiuVarIobyxmoadg.f68712btonecajqb[i58];
            int i65 = iArr12[i58];
            int[] iArr17 = iArr12;
            int i66 = iArr13[i58];
            if (z18) {
                int i67 = i66 - i65;
                System.arraycopy(jArr, i65, jArr11, i63, i67);
                System.arraycopy(iArr14, i65, iArr15, i63, i67);
                iArr5 = iArr4;
                System.arraycopy(iArr5, i65, iArr16, i63, i67);
            } else {
                iArr5 = iArr4;
            }
            boolean z23 = z19;
            iArr4 = iArr5;
            int i68 = i64;
            while (i65 < i66) {
                int i69 = i66;
                int i73 = i58;
                long jB6 = stevsuqkhv.b(j36, 1000000L, zdlpuopuiuVarIobyxmoadg.f68722wkgbmnqykc);
                long j38 = j36;
                long jB7 = stevsuqkhv.b(jArr2[i65] - j37, 1000000L, zdlpuopuiuVarIobyxmoadg.f68721ppxfxbqfkf);
                if (jB7 < 0) {
                    z23 = true;
                }
                jArr12[i63] = jB6 + jB7;
                if (z18 && iArr15[i63] > i68) {
                    i68 = iArr14[i65];
                }
                i63++;
                i65++;
                j36 = j38;
                i58 = i73;
                i66 = i69;
            }
            int i74 = i58;
            j36 += zdlpuopuiuVarIobyxmoadg.f68714dxjokdxxww[i74];
            i58 = i74 + 1;
            i64 = i68;
            z19 = z23;
            iArr12 = iArr17;
            iArr13 = iArr13;
            jArr = jArr;
        }
        long jB8 = stevsuqkhv.b(j36, 1000000L, zdlpuopuiuVarIobyxmoadg.f68722wkgbmnqykc);
        if (z19) {
            zdlpuopuiuVarIobyxmoadg = zdlpuopuiuVarIobyxmoadg.iobyxmoadg(zdlpuopuiuVarIobyxmoadg.f68719lqeggnwhkg.zoijcleaow().ikoacuggdj(true).cllcsxoeiz());
        }
        return new iwizpuwonk(zdlpuopuiuVarIobyxmoadg, jArr11, iArr15, i64, jArr12, iArr16, jB8);
    }

    private static int ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar, int i13, int i14, int i15) throws ParserException {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        t3.kcexrzcfyt.iobyxmoadg(iGxszxtbevo >= i14, null);
        while (iGxszxtbevo - i14 < i15) {
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            t3.kcexrzcfyt.iobyxmoadg(iVdvldrhtss > 0, "childAtomSize must be positive");
            if (yadqdtsiqtVar.vdvldrhtss() == i13) {
                return iGxszxtbevo;
            }
            iGxszxtbevo += iVdvldrhtss;
        }
        return -1;
    }

    public static int rgvfuqvkyq(int i13) {
        return (i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    private static int vdvldrhtss(yadqdtsiqt yadqdtsiqtVar) {
        yadqdtsiqtVar.sopmlzcsov(16);
        return yadqdtsiqtVar.vdvldrhtss();
    }

    private static ppxfxbqfkf wflxmlrfwp(yadqdtsiqt yadqdtsiqtVar, int i13) {
        yadqdtsiqtVar.sopmlzcsov(i13 + 12);
        yadqdtsiqtVar.crxdokpmqz(1);
        agtfadlqog(yadqdtsiqtVar);
        yadqdtsiqtVar.crxdokpmqz(2);
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        if ((iWwaezpbzkn & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            yadqdtsiqtVar.crxdokpmqz(2);
        }
        if ((iWwaezpbzkn & 64) != 0) {
            yadqdtsiqtVar.crxdokpmqz(yadqdtsiqtVar.wwaezpbzkn());
        }
        if ((iWwaezpbzkn & 32) != 0) {
            yadqdtsiqtVar.crxdokpmqz(2);
        }
        yadqdtsiqtVar.crxdokpmqz(1);
        agtfadlqog(yadqdtsiqtVar);
        String strNufgyqmvbu = v2.iwizpuwonk.nufgyqmvbu(yadqdtsiqtVar.wwaezpbzkn());
        if ("audio/mpeg".equals(strNufgyqmvbu) || "audio/vnd.dts".equals(strNufgyqmvbu) || "audio/vnd.dts.hd".equals(strNufgyqmvbu)) {
            return new ppxfxbqfkf(strNufgyqmvbu, null, -1L, -1L);
        }
        yadqdtsiqtVar.crxdokpmqz(4);
        long jPkzmftpjix = yadqdtsiqtVar.pkzmftpjix();
        long jPkzmftpjix2 = yadqdtsiqtVar.pkzmftpjix();
        yadqdtsiqtVar.crxdokpmqz(1);
        int iAgtfadlqog = agtfadlqog(yadqdtsiqtVar);
        byte[] bArr = new byte[iAgtfadlqog];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, iAgtfadlqog);
        return new ppxfxbqfkf(strNufgyqmvbu, bArr, jPkzmftpjix2 > 0 ? jPkzmftpjix2 : -1L, jPkzmftpjix > 0 ? jPkzmftpjix : -1L);
    }

    private static String wkgbmnqykc(int i13) {
        char[] cArr = {(char) (((i13 >> 10) & 31) + 96), (char) (((i13 >> 5) & 31) + 96), (char) ((i13 & 31) + 96)};
        for (int i14 = 0; i14 < 3; i14++) {
            char c13 = cArr[i14];
            if (c13 < 'a' || c13 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    public static v2.jyumaefscl wwaezpbzkn(z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkf) {
        yadqdtsiqt yadqdtsiqtVar = c3260ppxfxbqfkf.f127708zoijcleaow;
        yadqdtsiqtVar.sopmlzcsov(8);
        v2.jyumaefscl jyumaefsclVar = new v2.jyumaefscl(new v2.jyumaefscl.iobyxmoadg[0]);
        while (yadqdtsiqtVar.iobyxmoadg() >= 8) {
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
            if (iVdvldrhtss2 == 1835365473) {
                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                jyumaefsclVar = jyumaefsclVar.zoijcleaow(ylkuphrtab(yadqdtsiqtVar, iGxszxtbevo + iVdvldrhtss));
            } else if (iVdvldrhtss2 == 1936553057) {
                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                jyumaefsclVar = jyumaefsclVar.zoijcleaow(oxmwwwfdhm.zoijcleaow(yadqdtsiqtVar, iGxszxtbevo + iVdvldrhtss));
            } else if (iVdvldrhtss2 == -1451722374) {
                jyumaefsclVar = jyumaefsclVar.zoijcleaow(jpowsppfya(yadqdtsiqtVar));
            }
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + iVdvldrhtss);
        }
        return jyumaefsclVar;
    }

    private static gtknphoqwx yadqdtsiqt(yadqdtsiqt yadqdtsiqtVar) {
        long j13;
        int i13;
        yadqdtsiqtVar.sopmlzcsov(8);
        int iRgvfuqvkyq = rgvfuqvkyq(yadqdtsiqtVar.vdvldrhtss());
        yadqdtsiqtVar.crxdokpmqz(iRgvfuqvkyq == 0 ? 8 : 16);
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        yadqdtsiqtVar.crxdokpmqz(4);
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int i14 = iRgvfuqvkyq == 0 ? 4 : 8;
        int i15 = 0;
        while (true) {
            j13 = -9223372036854775807L;
            if (i15 >= i14) {
                yadqdtsiqtVar.crxdokpmqz(i14);
                break;
            }
            if (yadqdtsiqtVar.eablkybsjg()[iGxszxtbevo + i15] != -1) {
                long jPkzmftpjix = iRgvfuqvkyq == 0 ? yadqdtsiqtVar.pkzmftpjix() : yadqdtsiqtVar.dsvhmnatus();
                if (jPkzmftpjix == 0) {
                    break;
                }
                j13 = jPkzmftpjix;
                break;
            }
            i15++;
        }
        yadqdtsiqtVar.crxdokpmqz(10);
        int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        yadqdtsiqtVar.crxdokpmqz(4);
        int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
        int iVdvldrhtss3 = yadqdtsiqtVar.vdvldrhtss();
        yadqdtsiqtVar.crxdokpmqz(4);
        int iVdvldrhtss4 = yadqdtsiqtVar.vdvldrhtss();
        int iVdvldrhtss5 = yadqdtsiqtVar.vdvldrhtss();
        if (iVdvldrhtss2 == 0 && iVdvldrhtss3 == 65536 && iVdvldrhtss4 == -65536 && iVdvldrhtss5 == 0) {
            i13 = 90;
        } else if (iVdvldrhtss2 == 0 && iVdvldrhtss3 == -65536 && iVdvldrhtss4 == 65536 && iVdvldrhtss5 == 0) {
            i13 = 270;
        } else {
            i13 = (iVdvldrhtss2 == -65536 && iVdvldrhtss3 == 0 && iVdvldrhtss4 == 0 && iVdvldrhtss5 == -65536) ? 180 : 0;
        }
        return new gtknphoqwx(iVdvldrhtss, j13, iWypolnanlu, i13);
    }

    private static void yggfygwlhe(yadqdtsiqt yadqdtsiqtVar, int i13, int i14, int i15, nufgyqmvbu nufgyqmvbuVar) {
        yadqdtsiqtVar.sopmlzcsov(i14 + 16);
        if (i13 == 1835365492) {
            yadqdtsiqtVar.zynmafqrjb();
            String strZynmafqrjb = yadqdtsiqtVar.zynmafqrjb();
            if (strZynmafqrjb != null) {
                nufgyqmvbuVar.f68749zoijcleaow = new androidx.media3.common.iobyxmoadg.zoijcleaow().jztzpxfvev(i15).zeieaojujs(strZynmafqrjb).cllcsxoeiz();
            }
        }
    }

    private static v2.jyumaefscl ylkuphrtab(yadqdtsiqt yadqdtsiqtVar, int i13) {
        yadqdtsiqtVar.crxdokpmqz(8);
        gxszxtbevo(yadqdtsiqtVar);
        while (yadqdtsiqtVar.gxszxtbevo() < i13) {
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            if (yadqdtsiqtVar.vdvldrhtss() == 1768715124) {
                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                return oxmwwwfdhm(yadqdtsiqtVar, iGxszxtbevo + iVdvldrhtss);
            }
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + iVdvldrhtss);
        }
        return null;
    }

    public static v2.jyumaefscl zdlpuopuiu(z2.ppxfxbqfkf.zoijcleaow zoijcleaowVar) {
        z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkfEablkybsjg = zoijcleaowVar.eablkybsjg(1751411826);
        z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkfEablkybsjg2 = zoijcleaowVar.eablkybsjg(1801812339);
        z2.ppxfxbqfkf.C3260ppxfxbqfkf c3260ppxfxbqfkfEablkybsjg3 = zoijcleaowVar.eablkybsjg(1768715124);
        if (c3260ppxfxbqfkfEablkybsjg == null || c3260ppxfxbqfkfEablkybsjg2 == null || c3260ppxfxbqfkfEablkybsjg3 == null || vdvldrhtss(c3260ppxfxbqfkfEablkybsjg.f127708zoijcleaow) != 1835299937) {
            return null;
        }
        yadqdtsiqt yadqdtsiqtVar = c3260ppxfxbqfkfEablkybsjg2.f127708zoijcleaow;
        yadqdtsiqtVar.sopmlzcsov(12);
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        String[] strArr = new String[iVdvldrhtss];
        for (int i13 = 0; i13 < iVdvldrhtss; i13++) {
            int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
            yadqdtsiqtVar.crxdokpmqz(4);
            strArr[i13] = yadqdtsiqtVar.yadqdtsiqt(iVdvldrhtss2 - 8);
        }
        yadqdtsiqt yadqdtsiqtVar2 = c3260ppxfxbqfkfEablkybsjg3.f127708zoijcleaow;
        yadqdtsiqtVar2.sopmlzcsov(8);
        ArrayList arrayList = new ArrayList();
        while (yadqdtsiqtVar2.iobyxmoadg() > 8) {
            int iGxszxtbevo = yadqdtsiqtVar2.gxszxtbevo();
            int iVdvldrhtss3 = yadqdtsiqtVar2.vdvldrhtss();
            int iVdvldrhtss4 = yadqdtsiqtVar2.vdvldrhtss() - 1;
            if (iVdvldrhtss4 < 0 || iVdvldrhtss4 >= iVdvldrhtss) {
                y2.kcexrzcfyt.nufgyqmvbu("BoxParsers", "Skipped metadata with unknown key index: " + iVdvldrhtss4);
            } else {
                z2.iobyxmoadg iobyxmoadgVarDxjokdxxww = n4.btonecajqb.dxjokdxxww(yadqdtsiqtVar2, iGxszxtbevo + iVdvldrhtss3, strArr[iVdvldrhtss4]);
                if (iobyxmoadgVarDxjokdxxww != null) {
                    arrayList.add(iobyxmoadgVarDxjokdxxww);
                }
            }
            yadqdtsiqtVar2.sopmlzcsov(iGxszxtbevo + iVdvldrhtss3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new v2.jyumaefscl(arrayList);
    }

    private static boolean zoijcleaow(long[] jArr, long j13, long j14, long j15) {
        int length = jArr.length - 1;
        return jArr[0] <= j14 && j14 < jArr[stevsuqkhv.ojitshcjhn(4, 0, length)] && jArr[stevsuqkhv.ojitshcjhn(jArr.length - 4, 0, length)] < j15 && j15 <= j13;
    }

    private static wkgbmnqykc zynmafqrjb(yadqdtsiqt yadqdtsiqtVar, int i13, int i14) throws ParserException {
        yadqdtsiqtVar.sopmlzcsov(i13 + 8);
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        while (iGxszxtbevo - i13 < i14) {
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            t3.kcexrzcfyt.iobyxmoadg(iVdvldrhtss > 0, "childAtomSize must be positive");
            if (yadqdtsiqtVar.vdvldrhtss() == 1937011305) {
                yadqdtsiqtVar.crxdokpmqz(4);
                int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                return new wkgbmnqykc(new lqeggnwhkg((iWwaezpbzkn & 1) == 1, (iWwaezpbzkn & 2) == 2, (iWwaezpbzkn & 8) == 8));
            }
            iGxszxtbevo += iVdvldrhtss;
        }
        return null;
    }
}
