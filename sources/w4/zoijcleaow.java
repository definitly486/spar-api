package w4;

import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.common.collect.iwizpuwonk;
import com.google.common.collect.jyumaefscl;
import com.google.common.collect.kegysxyocb;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f118718iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f118719ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f118720zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Pattern f118717wkgbmnqykc = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final jyumaefscl f118713eablkybsjg = jyumaefscl.istkbnxepw("auto", DevicePublicKeyStringDef.NONE);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final jyumaefscl f118714gxszxtbevo = jyumaefscl.cdpycssgdh("dot", "sesame", "circle");

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final jyumaefscl f118715lqeggnwhkg = jyumaefscl.istkbnxepw("filled", "open");

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final jyumaefscl f118716nufgyqmvbu = jyumaefscl.cdpycssgdh("after", "before", "outside");

    private zoijcleaow(int i13, int i14, int i15) {
        this.f118718iobyxmoadg = i13;
        this.f118720zoijcleaow = i14;
        this.f118719ppxfxbqfkf = i15;
    }

    public static zoijcleaow iobyxmoadg(String str) {
        if (str == null) {
            return null;
        }
        String strEablkybsjg = xa.zoijcleaow.eablkybsjg(str.trim());
        if (strEablkybsjg.isEmpty()) {
            return null;
        }
        return zoijcleaow(jyumaefscl.jyumaefscl(TextUtils.split(strEablkybsjg, f118717wkgbmnqykc)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x0102  */
    /* JADX WARN: Code duplicated, block: B:71:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:73:0x0109  */
    private static zoijcleaow zoijcleaow(jyumaefscl jyumaefsclVar) {
        byte b13;
        int i13;
        int i14;
        String str;
        int iHashCode;
        String str2 = (String) iwizpuwonk.ppxfxbqfkf(kegysxyocb.eablkybsjg(f118716nufgyqmvbu, jyumaefsclVar), "outside");
        int iHashCode2 = str2.hashCode();
        int i15 = 2;
        byte b14 = 0;
        int i16 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                if (iHashCode2 == 92734940 && str2.equals("after")) {
                    b13 = 0;
                } else {
                    b13 = -1;
                }
            } else if (str2.equals("outside")) {
                b13 = 1;
            } else {
                b13 = -1;
            }
        } else if (str2.equals("before")) {
            b13 = 2;
        } else {
            b13 = -1;
        }
        if (b13 != 0) {
            i13 = b13 != 1 ? 1 : -2;
        } else {
            i13 = 2;
        }
        kegysxyocb.eablkybsjg eablkybsjgVarEablkybsjg = kegysxyocb.eablkybsjg(f118713eablkybsjg, jyumaefsclVar);
        if (!eablkybsjgVarEablkybsjg.isEmpty()) {
            String str3 = (String) eablkybsjgVarEablkybsjg.iterator().next();
            int iHashCode3 = str3.hashCode();
            if (iHashCode3 == 3005871) {
                str3.equals("auto");
            } else if (iHashCode3 == 3387192 && str3.equals(DevicePublicKeyStringDef.NONE)) {
                i16 = 0;
            }
            return new zoijcleaow(i16, 0, i13);
        }
        kegysxyocb.eablkybsjg eablkybsjgVarEablkybsjg2 = kegysxyocb.eablkybsjg(f118715lqeggnwhkg, jyumaefsclVar);
        kegysxyocb.eablkybsjg eablkybsjgVarEablkybsjg3 = kegysxyocb.eablkybsjg(f118714gxszxtbevo, jyumaefsclVar);
        if (eablkybsjgVarEablkybsjg2.isEmpty() && eablkybsjgVarEablkybsjg3.isEmpty()) {
            return new zoijcleaow(-1, 0, i13);
        }
        String str4 = (String) iwizpuwonk.ppxfxbqfkf(eablkybsjgVarEablkybsjg2, "filled");
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1274499742) {
            if (iHashCode4 == 3417674 && str4.equals("open")) {
                i14 = 2;
            }
            str = (String) iwizpuwonk.ppxfxbqfkf(eablkybsjgVarEablkybsjg3, "circle");
            iHashCode = str.hashCode();
            if (iHashCode != -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode == 99657 || !str.equals("dot")) {
                        b14 = -1;
                    }
                } else if (str.equals("sesame")) {
                    b14 = 1;
                } else {
                    b14 = -1;
                }
            } else if (str.equals("circle")) {
                b14 = 2;
            } else {
                b14 = -1;
            }
            if (b14 != 0) {
                if (b14 != 1) {
                    i15 = 1;
                } else {
                    i15 = 3;
                }
            }
            return new zoijcleaow(i15, i14, i13);
        }
        str4.equals("filled");
        i14 = 1;
        str = (String) iwizpuwonk.ppxfxbqfkf(eablkybsjgVarEablkybsjg3, "circle");
        iHashCode = str.hashCode();
        if (iHashCode != -1360216880) {
            if (iHashCode != -905816648) {
                if (iHashCode == 99657) {
                    b14 = -1;
                } else {
                    b14 = -1;
                }
            } else if (str.equals("sesame")) {
                b14 = 1;
            } else {
                b14 = -1;
            }
        } else if (str.equals("circle")) {
            b14 = 2;
        } else {
            b14 = -1;
        }
        if (b14 != 0) {
            if (b14 != 1) {
                i15 = 1;
            } else {
                i15 = 3;
            }
        }
        return new zoijcleaow(i15, i14, i13);
    }
}
