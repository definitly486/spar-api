package z2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v2.jyumaefscl;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements jyumaefscl.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f127690iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f127691ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f127692wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final byte[] f127693zoijcleaow;

    public iobyxmoadg(String str, byte[] bArr, int i13, int i14) {
        gxszxtbevo(str, bArr, i14);
        this.f127690iobyxmoadg = str;
        this.f127693zoijcleaow = bArr;
        this.f127691ppxfxbqfkf = i13;
        this.f127692wkgbmnqykc = i14;
    }

    private static String eablkybsjg(List list) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("track types = ");
        xa.gxszxtbevo.gxszxtbevo(',').zoijcleaow(sb3, list);
        return sb3.toString();
    }

    private static void gxszxtbevo(String str, byte[] bArr, int i13) {
        byte b13;
        str.hashCode();
        boolean z13 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i13 == 23 && bArr.length == 4) {
                    z13 = true;
                }
                y2.iobyxmoadg.iobyxmoadg(z13);
                break;
            case "auxiliary.tracks.interleaved":
                if (i13 == 75 && bArr.length == 1 && ((b13 = bArr[0]) == 0 || b13 == 1)) {
                    z13 = true;
                }
                y2.iobyxmoadg.iobyxmoadg(z13);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i13 == 78 && bArr.length == 8) {
                    z13 = true;
                }
                y2.iobyxmoadg.iobyxmoadg(z13);
                break;
            case "auxiliary.tracks.map":
                y2.iobyxmoadg.iobyxmoadg(i13 == 0);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iobyxmoadg.class != obj.getClass()) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f127690iobyxmoadg.equals(iobyxmoadgVar.f127690iobyxmoadg) && Arrays.equals(this.f127693zoijcleaow, iobyxmoadgVar.f127693zoijcleaow) && this.f127691ppxfxbqfkf == iobyxmoadgVar.f127691ppxfxbqfkf && this.f127692wkgbmnqykc == iobyxmoadgVar.f127692wkgbmnqykc;
    }

    public int hashCode() {
        return ((((((527 + this.f127690iobyxmoadg.hashCode()) * 31) + Arrays.hashCode(this.f127693zoijcleaow)) * 31) + this.f127691ppxfxbqfkf) * 31) + this.f127692wkgbmnqykc;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    public String toString() {
        String strEablkybsjg;
        int i13 = this.f127692wkgbmnqykc;
        if (i13 != 0) {
            if (i13 == 1) {
                strEablkybsjg = stevsuqkhv.lmojexxdyd(this.f127693zoijcleaow);
            } else if (i13 == 23) {
                strEablkybsjg = String.valueOf(Float.intBitsToFloat(com.google.common.primitives.gxszxtbevo.gxszxtbevo(this.f127693zoijcleaow)));
            } else if (i13 == 67) {
                strEablkybsjg = String.valueOf(com.google.common.primitives.gxszxtbevo.gxszxtbevo(this.f127693zoijcleaow));
            } else if (i13 == 75) {
                strEablkybsjg = String.valueOf(Byte.toUnsignedInt(this.f127693zoijcleaow[0]));
            } else if (i13 != 78) {
                strEablkybsjg = stevsuqkhv.p(this.f127693zoijcleaow);
            } else {
                strEablkybsjg = String.valueOf(new yadqdtsiqt(this.f127693zoijcleaow).dsvhmnatus());
            }
        } else if (this.f127690iobyxmoadg.equals("auxiliary.tracks.map")) {
            strEablkybsjg = eablkybsjg(wkgbmnqykc());
        } else {
            strEablkybsjg = stevsuqkhv.p(this.f127693zoijcleaow);
        }
        return "mdta: key=" + this.f127690iobyxmoadg + ", value=" + strEablkybsjg;
    }

    public List wkgbmnqykc() {
        y2.iobyxmoadg.nufgyqmvbu(this.f127690iobyxmoadg.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b13 = this.f127693zoijcleaow[1];
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < b13; i13++) {
            arrayList.add(Integer.valueOf(this.f127693zoijcleaow[i13 + 2]));
        }
        return arrayList;
    }
}
