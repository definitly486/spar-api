package k9;

import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements Serializable {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f54199esjtqupxsv = new iobyxmoadg(null, -1, -1, -1, -1);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    final transient Object f54200cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    protected final int f54201iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    protected final int f54202jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    protected final long f54203yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected final long f54204zdlpuopuiu;

    public iobyxmoadg(Object obj, long j13, long j14, int i13, int i14) {
        this.f54200cqumvgiudr = obj;
        this.f54204zdlpuopuiu = j13;
        this.f54203yggfygwlhe = j14;
        this.f54202jyumaefscl = i13;
        this.f54201iwizpuwonk = i14;
    }

    private int iobyxmoadg(StringBuilder sb3, String str) {
        sb3.append('\"');
        sb3.append(str);
        sb3.append('\"');
        return str.length();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        Object obj2 = this.f54200cqumvgiudr;
        if (obj2 == null) {
            if (iobyxmoadgVar.f54200cqumvgiudr != null) {
                return false;
            }
        } else if (!obj2.equals(iobyxmoadgVar.f54200cqumvgiudr)) {
            return false;
        }
        return this.f54202jyumaefscl == iobyxmoadgVar.f54202jyumaefscl && this.f54201iwizpuwonk == iobyxmoadgVar.f54201iwizpuwonk && this.f54203yggfygwlhe == iobyxmoadgVar.f54203yggfygwlhe && lqeggnwhkg() == iobyxmoadgVar.lqeggnwhkg();
    }

    public int hashCode() {
        Object obj = this.f54200cqumvgiudr;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this.f54202jyumaefscl) + this.f54201iwizpuwonk) ^ ((int) this.f54203yggfygwlhe)) + ((int) this.f54204zdlpuopuiu);
    }

    public long lqeggnwhkg() {
        return this.f54204zdlpuopuiu;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(80);
        sb3.append("[Source: ");
        wkgbmnqykc(sb3);
        sb3.append("; line: ");
        sb3.append(this.f54202jyumaefscl);
        sb3.append(", column: ");
        sb3.append(this.f54201iwizpuwonk);
        sb3.append(']');
        return sb3.toString();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    protected StringBuilder wkgbmnqykc(StringBuilder sb3) {
        int length;
        int iIobyxmoadg;
        Object obj = this.f54200cqumvgiudr;
        if (obj == null) {
            sb3.append("UNKNOWN");
            return sb3;
        }
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (obj instanceof byte[]) {
            name = "byte[]";
        } else if (obj instanceof char[]) {
            name = "char[]";
        }
        sb3.append('(');
        sb3.append(name);
        sb3.append(')');
        int length2 = 0;
        String str = " chars";
        if (!(obj instanceof CharSequence)) {
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                length = cArr.length;
                iIobyxmoadg = iobyxmoadg(sb3, new String(cArr, 0, Math.min(length, 500)));
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int iMin = Math.min(bArr.length, 500);
                iobyxmoadg(sb3, new String(bArr, 0, iMin, Charset.forName("UTF-8")));
                length2 = bArr.length - iMin;
                str = " bytes";
            }
            if (length2 > 0) {
                sb3.append("[truncated ");
                sb3.append(length2);
                sb3.append(str);
                sb3.append(']');
            }
            return sb3;
        }
        CharSequence charSequence = (CharSequence) obj;
        length = charSequence.length();
        iIobyxmoadg = iobyxmoadg(sb3, charSequence.subSequence(0, Math.min(length, 500)).toString());
        length2 = length - iIobyxmoadg;
        if (length2 > 0) {
            sb3.append("[truncated ");
            sb3.append(length2);
            sb3.append(str);
            sb3.append(']');
        }
        return sb3;
    }
}
