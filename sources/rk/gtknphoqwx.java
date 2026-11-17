package rk;

import java.net.ProtocolException;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.pmvmpeiblj;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f82950wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final pmvmpeiblj f82951iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f82952ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f82953zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final gtknphoqwx iobyxmoadg(String statusLine) throws ProtocolException {
            pmvmpeiblj pmvmpeibljVar;
            int i13;
            String strSubstring;
            zdlpuopuiu.btonecajqb(statusLine, "statusLine");
            if (kcexrzcfyt.stevsuqkhv(statusLine, "HTTP/1.", false, 2, null)) {
                i13 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    pmvmpeibljVar = pmvmpeiblj.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    pmvmpeibljVar = pmvmpeiblj.HTTP_1_1;
                }
            } else if (kcexrzcfyt.stevsuqkhv(statusLine, "ICY ", false, 2, null)) {
                pmvmpeibljVar = pmvmpeiblj.HTTP_1_0;
                i13 = 4;
            } else {
                if (!kcexrzcfyt.stevsuqkhv(statusLine, "SOURCETABLE ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                pmvmpeibljVar = pmvmpeiblj.HTTP_1_1;
                i13 = 12;
            }
            int i14 = i13 + 3;
            if (statusLine.length() < i14) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            String strSubstring2 = statusLine.substring(i13, i14);
            zdlpuopuiu.dxjokdxxww(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            Integer numVdvldrhtss = kcexrzcfyt.vdvldrhtss(strSubstring2);
            if (numVdvldrhtss == null) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            int iIntValue = numVdvldrhtss.intValue();
            if (statusLine.length() <= i14) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i14) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                strSubstring = statusLine.substring(i13 + 4);
                zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new gtknphoqwx(pmvmpeibljVar, iIntValue, strSubstring);
        }

        private iobyxmoadg() {
        }
    }

    public gtknphoqwx(pmvmpeiblj protocol, int i13, String message) {
        zdlpuopuiu.btonecajqb(protocol, "protocol");
        zdlpuopuiu.btonecajqb(message, "message");
        this.f82951iobyxmoadg = protocol;
        this.f82953zoijcleaow = i13;
        this.f82952ppxfxbqfkf = message;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        if (this.f82951iobyxmoadg == pmvmpeiblj.HTTP_1_0) {
            sb3.append("HTTP/1.0");
        } else {
            sb3.append("HTTP/1.1");
        }
        sb3.append(' ');
        sb3.append(this.f82953zoijcleaow);
        sb3.append(' ');
        sb3.append(this.f82952ppxfxbqfkf);
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
