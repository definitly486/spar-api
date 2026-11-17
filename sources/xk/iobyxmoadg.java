package xk;

import bl.eablkybsjg;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import mj.wkgbmnqykc;
import mk.wflxmlrfwp;
import rg.zoijcleaow;
import uk.agtfadlqog;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private byte[] f122652ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private byte[] f122653wkgbmnqykc;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final C3086iobyxmoadg f122647eablkybsjg = new C3086iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final String f122648gxszxtbevo = iobyxmoadg.class.getSimpleName() + ".gz";

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final byte[] f122649lqeggnwhkg = {(byte) 42};

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final List f122650nufgyqmvbu = jyumaefscl.eablkybsjg("*");

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final iobyxmoadg f122646dxjokdxxww = new iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicBoolean f122651iobyxmoadg = new AtomicBoolean(false);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final CountDownLatch f122654zoijcleaow = new CountDownLatch(1);

    /* JADX INFO: renamed from: xk.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3086iobyxmoadg {
        public /* synthetic */ C3086iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String zoijcleaow(byte[] bArr, byte[][] bArr2, int i13) {
            int i14;
            int iZoijcleaow;
            boolean z13;
            int iZoijcleaow2;
            int length = bArr.length;
            int i15 = 0;
            while (i15 < length) {
                int i16 = (i15 + length) / 2;
                while (i16 > -1 && bArr[i16] != ((byte) 10)) {
                    i16--;
                }
                int i17 = i16 + 1;
                int i18 = 1;
                while (true) {
                    i14 = i17 + i18;
                    if (bArr[i14] == ((byte) 10)) {
                        break;
                    }
                    i18++;
                }
                int i19 = i14 - i17;
                int i23 = i13;
                boolean z14 = false;
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    if (z14) {
                        iZoijcleaow = 46;
                        z13 = false;
                    } else {
                        boolean z15 = z14;
                        iZoijcleaow = wflxmlrfwp.zoijcleaow(bArr2[i23][i24], KotlinVersion.MAX_COMPONENT_VALUE);
                        z13 = z15;
                    }
                    iZoijcleaow2 = iZoijcleaow - wflxmlrfwp.zoijcleaow(bArr[i17 + i25], KotlinVersion.MAX_COMPONENT_VALUE);
                    if (iZoijcleaow2 != 0) {
                        break;
                    }
                    i25++;
                    i24++;
                    if (i25 == i19) {
                        break;
                    }
                    if (bArr2[i23].length != i24) {
                        z14 = z13;
                    } else {
                        if (i23 == bArr2.length - 1) {
                            break;
                        }
                        i23++;
                        z14 = true;
                        i24 = -1;
                    }
                }
                if (iZoijcleaow2 >= 0) {
                    if (iZoijcleaow2 <= 0) {
                        int i26 = i19 - i25;
                        int length2 = bArr2[i23].length - i24;
                        int length3 = bArr2.length;
                        for (int i27 = i23 + 1; i27 < length3; i27++) {
                            length2 += bArr2[i27].length;
                        }
                        if (length2 >= i26) {
                            if (length2 <= i26) {
                                return new String(bArr, i17, i19, wkgbmnqykc.f67326zoijcleaow);
                            }
                        }
                    }
                    i15 = i14 + 1;
                }
                length = i16;
            }
            return null;
        }

        public final iobyxmoadg ppxfxbqfkf() {
            return iobyxmoadg.f122646dxjokdxxww;
        }

        private C3086iobyxmoadg() {
        }
    }

    private final void eablkybsjg() {
        boolean z13 = false;
        while (true) {
            try {
                try {
                    wkgbmnqykc();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z13 = true;
                } catch (IOException e13) {
                    agtfadlqog.f113749iobyxmoadg.lqeggnwhkg().btonecajqb("Failed to read public suffix list", 5, e13);
                    if (z13) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
    }

    private final List gxszxtbevo(String str) {
        List listMhtqkkgtqm = kcexrzcfyt.mhtqkkgtqm(str, new char[]{'.'}, false, 0, 6, null);
        return zdlpuopuiu.eablkybsjg(jyumaefscl.skhdrjzrfn(listMhtqkkgtqm), "") ? jyumaefscl.czzsidtyhn(listMhtqkkgtqm, 1) : listMhtqkkgtqm;
    }

    private final void wkgbmnqykc() {
        InputStream resourceAsStream = iobyxmoadg.class.getResourceAsStream(f122648gxszxtbevo);
        if (resourceAsStream == null) {
            return;
        }
        eablkybsjg eablkybsjgVarPpxfxbqfkf = bl.zdlpuopuiu.ppxfxbqfkf(new bl.agtfadlqog(bl.zdlpuopuiu.btonecajqb(resourceAsStream)));
        try {
            byte[] bArrAuzgnhcxok = eablkybsjgVarPpxfxbqfkf.auzgnhcxok(eablkybsjgVarPpxfxbqfkf.readInt());
            byte[] bArrAuzgnhcxok2 = eablkybsjgVarPpxfxbqfkf.auzgnhcxok(eablkybsjgVarPpxfxbqfkf.readInt());
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            zoijcleaow.iobyxmoadg(eablkybsjgVarPpxfxbqfkf, null);
            synchronized (this) {
                zdlpuopuiu.lqeggnwhkg(bArrAuzgnhcxok);
                this.f122652ppxfxbqfkf = bArrAuzgnhcxok;
                zdlpuopuiu.lqeggnwhkg(bArrAuzgnhcxok2);
                this.f122653wkgbmnqykc = bArrAuzgnhcxok2;
            }
            this.f122654zoijcleaow.countDown();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                zoijcleaow.iobyxmoadg(eablkybsjgVarPpxfxbqfkf, th2);
                throw th3;
            }
        }
    }

    private final List zoijcleaow(List list) {
        String str;
        String strZoijcleaow;
        String str2;
        List listWflxmlrfwp;
        List listWflxmlrfwp2;
        if (this.f122651iobyxmoadg.get() || !this.f122651iobyxmoadg.compareAndSet(false, true)) {
            try {
                this.f122654zoijcleaow.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            eablkybsjg();
        }
        if (this.f122652ppxfxbqfkf == null) {
            throw new IllegalStateException(("Unable to load " + f122648gxszxtbevo + " resource from the classpath.").toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i13 = 0; i13 < size; i13++) {
            byte[] bytes = ((String) list.get(i13)).getBytes(wkgbmnqykc.f67326zoijcleaow);
            zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i13] = bytes;
        }
        int i14 = 0;
        while (true) {
            str = null;
            if (i14 >= size) {
                strZoijcleaow = null;
                break;
            }
            C3086iobyxmoadg c3086iobyxmoadg = f122647eablkybsjg;
            byte[] bArr2 = this.f122652ppxfxbqfkf;
            if (bArr2 == null) {
                zdlpuopuiu.pmvmpeiblj("publicSuffixListBytes");
                bArr2 = null;
            }
            strZoijcleaow = c3086iobyxmoadg.zoijcleaow(bArr2, bArr, i14);
            if (strZoijcleaow != null) {
                break;
            }
            i14++;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                str2 = null;
                break;
            }
            bArr3[i15] = f122649lqeggnwhkg;
            C3086iobyxmoadg c3086iobyxmoadg2 = f122647eablkybsjg;
            byte[] bArr4 = this.f122652ppxfxbqfkf;
            if (bArr4 == null) {
                zdlpuopuiu.pmvmpeiblj("publicSuffixListBytes");
                bArr4 = null;
            }
            String strZoijcleaow2 = c3086iobyxmoadg2.zoijcleaow(bArr4, bArr3, i15);
            if (strZoijcleaow2 != null) {
                str2 = strZoijcleaow2;
                break;
            }
            i15++;
        }
        if (str2 != null) {
            int i16 = size - 1;
            for (int i17 = 0; i17 < i16; i17++) {
                C3086iobyxmoadg c3086iobyxmoadg3 = f122647eablkybsjg;
                byte[] bArr5 = this.f122653wkgbmnqykc;
                if (bArr5 == null) {
                    zdlpuopuiu.pmvmpeiblj("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strZoijcleaow3 = c3086iobyxmoadg3.zoijcleaow(bArr5, bArr, i17);
                if (strZoijcleaow3 != null) {
                    str = strZoijcleaow3;
                    break;
                }
            }
        }
        if (str != null) {
            return kcexrzcfyt.mhtqkkgtqm('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strZoijcleaow == null && str2 == null) {
            return f122650nufgyqmvbu;
        }
        if (strZoijcleaow == null || (listWflxmlrfwp = kcexrzcfyt.mhtqkkgtqm(strZoijcleaow, new char[]{'.'}, false, 0, 6, null)) == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        if (str2 == null || (listWflxmlrfwp2 = kcexrzcfyt.mhtqkkgtqm(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listWflxmlrfwp2 = jyumaefscl.wflxmlrfwp();
        }
        return listWflxmlrfwp.size() > listWflxmlrfwp2.size() ? listWflxmlrfwp : listWflxmlrfwp2;
    }

    public final String ppxfxbqfkf(String domain) {
        int size;
        int size2;
        zdlpuopuiu.btonecajqb(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        zdlpuopuiu.dxjokdxxww(unicodeDomain, "unicodeDomain");
        List listGxszxtbevo = gxszxtbevo(unicodeDomain);
        List listZoijcleaow = zoijcleaow(listGxszxtbevo);
        if (listGxszxtbevo.size() == listZoijcleaow.size() && ((String) listZoijcleaow.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listZoijcleaow.get(0)).charAt(0) == '!') {
            size = listGxszxtbevo.size();
            size2 = listZoijcleaow.size();
        } else {
            size = listGxszxtbevo.size();
            size2 = listZoijcleaow.size() + 1;
        }
        return lj.wflxmlrfwp.hkdspvbjdz(lj.wflxmlrfwp.zynmafqrjb(jyumaefscl.ikoacuggdj(gxszxtbevo(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
