package ce;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements Closeable, Flushable {

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final String[] f19765yadqdtsiqt;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private String f19766cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f19767esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private String f19768iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f19770lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private String f19771pmvmpeiblj;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Writer f19773zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f19774zynmafqrjb;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final Pattern f19764istkbnxepw = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final String[] f19763cdpycssgdh = new String[UserVerificationMethods.USER_VERIFY_PATTERN];

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int[] f19772yggfygwlhe = new int[32];

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f19769jyumaefscl = 0;

    static {
        for (int i13 = 0; i13 <= 31; i13++) {
            f19763cdpycssgdh[i13] = String.format("\\u%04x", Integer.valueOf(i13));
        }
        String[] strArr = f19763cdpycssgdh;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f19765yadqdtsiqt = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public ppxfxbqfkf(Writer writer) {
        pmvmpeiblj(6);
        this.f19766cqumvgiudr = StringUtils.PROCESS_POSTFIX_DELIMITER;
        this.f19774zynmafqrjb = true;
        Objects.requireNonNull(writer, "out == null");
        this.f19773zdlpuopuiu = writer;
    }

    private ppxfxbqfkf cqumvgiudr(int i13, char c13) throws IOException {
        wkgbmnqykc();
        pmvmpeiblj(i13);
        this.f19773zdlpuopuiu.write(c13);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void dsvhmnatus(String str) throws IOException {
        String str2;
        String[] strArr = this.f19770lereixgezr ? f19765yadqdtsiqt : f19763cdpycssgdh;
        this.f19773zdlpuopuiu.write(34);
        int length = str.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i13 < i14) {
                        this.f19773zdlpuopuiu.write(str, i13, i14 - i13);
                    }
                    this.f19773zdlpuopuiu.write(str2);
                    i13 = i14 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i13 < i14) {
                    this.f19773zdlpuopuiu.write(str, i13, i14 - i13);
                }
                this.f19773zdlpuopuiu.write(str2);
                i13 = i14 + 1;
            }
        }
        if (i13 < length) {
            this.f19773zdlpuopuiu.write(str, i13, length - i13);
        }
        this.f19773zdlpuopuiu.write(34);
    }

    private ppxfxbqfkf dxjokdxxww(int i13, int i14, char c13) throws IOException {
        int iLereixgezr = lereixgezr();
        if (iLereixgezr != i14 && iLereixgezr != i13) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f19771pmvmpeiblj != null) {
            throw new IllegalStateException("Dangling name: " + this.f19771pmvmpeiblj);
        }
        this.f19769jyumaefscl--;
        if (iLereixgezr == i14) {
            zdlpuopuiu();
        }
        this.f19773zdlpuopuiu.write(c13);
        return this;
    }

    private void iobyxmoadg() throws IOException {
        int iLereixgezr = lereixgezr();
        if (iLereixgezr == 5) {
            this.f19773zdlpuopuiu.write(44);
        } else if (iLereixgezr != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        zdlpuopuiu();
        zynmafqrjb(4);
    }

    private void jlmebxxoox() throws IOException {
        if (this.f19771pmvmpeiblj != null) {
            iobyxmoadg();
            dsvhmnatus(this.f19771pmvmpeiblj);
            this.f19771pmvmpeiblj = null;
        }
    }

    private int lereixgezr() {
        int i13 = this.f19769jyumaefscl;
        if (i13 != 0) {
            return this.f19772yggfygwlhe[i13 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void pmvmpeiblj(int i13) {
        int i14 = this.f19769jyumaefscl;
        int[] iArr = this.f19772yggfygwlhe;
        if (i14 == iArr.length) {
            this.f19772yggfygwlhe = Arrays.copyOf(iArr, i14 * 2);
        }
        int[] iArr2 = this.f19772yggfygwlhe;
        int i15 = this.f19769jyumaefscl;
        this.f19769jyumaefscl = i15 + 1;
        iArr2[i15] = i13;
    }

    private static boolean vdvldrhtss(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void wkgbmnqykc() throws IOException {
        int iLereixgezr = lereixgezr();
        if (iLereixgezr == 1) {
            zynmafqrjb(2);
            zdlpuopuiu();
            return;
        }
        if (iLereixgezr == 2) {
            this.f19773zdlpuopuiu.append(',');
            zdlpuopuiu();
        } else {
            if (iLereixgezr == 4) {
                this.f19773zdlpuopuiu.append((CharSequence) this.f19766cqumvgiudr);
                zynmafqrjb(5);
                return;
            }
            if (iLereixgezr != 6) {
                if (iLereixgezr != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f19767esjtqupxsv) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            zynmafqrjb(7);
        }
    }

    private void zdlpuopuiu() throws IOException {
        if (this.f19768iwizpuwonk == null) {
            return;
        }
        this.f19773zdlpuopuiu.write(10);
        int i13 = this.f19769jyumaefscl;
        for (int i14 = 1; i14 < i13; i14++) {
            this.f19773zdlpuopuiu.write(this.f19768iwizpuwonk);
        }
    }

    private void zynmafqrjb(int i13) {
        this.f19772yggfygwlhe[this.f19769jyumaefscl - 1] = i13;
    }

    public final boolean agtfadlqog() {
        return this.f19774zynmafqrjb;
    }

    public ppxfxbqfkf btonecajqb() {
        return dxjokdxxww(1, 2, ']');
    }

    public final void cdpycssgdh(String str) {
        if (str.length() == 0) {
            this.f19768iwizpuwonk = null;
            this.f19766cqumvgiudr = StringUtils.PROCESS_POSTFIX_DELIMITER;
        } else {
            this.f19768iwizpuwonk = str;
            this.f19766cqumvgiudr = ": ";
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19773zdlpuopuiu.close();
        int i13 = this.f19769jyumaefscl;
        if (i13 > 1 || (i13 == 1 && this.f19772yggfygwlhe[i13 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f19769jyumaefscl = 0;
    }

    public ppxfxbqfkf crxdokpmqz(boolean z13) throws IOException {
        jlmebxxoox();
        wkgbmnqykc();
        this.f19773zdlpuopuiu.write(z13 ? "true" : "false");
        return this;
    }

    public ppxfxbqfkf draadjrbmk() {
        return dxjokdxxww(3, 5, '}');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f19769jyumaefscl == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f19773zdlpuopuiu.flush();
    }

    public final void hkdspvbjdz(boolean z13) {
        this.f19774zynmafqrjb = z13;
    }

    public final void istkbnxepw(boolean z13) {
        this.f19770lereixgezr = z13;
    }

    public ppxfxbqfkf jyumaefscl() throws IOException {
        if (this.f19771pmvmpeiblj != null) {
            if (!this.f19774zynmafqrjb) {
                this.f19771pmvmpeiblj = null;
                return this;
            }
            jlmebxxoox();
        }
        wkgbmnqykc();
        this.f19773zdlpuopuiu.write("null");
        return this;
    }

    public ppxfxbqfkf kcexrzcfyt(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f19771pmvmpeiblj != null) {
            throw new IllegalStateException();
        }
        if (this.f19769jyumaefscl == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f19771pmvmpeiblj = str;
        return this;
    }

    public ppxfxbqfkf kegysxyocb(long j13) throws IOException {
        jlmebxxoox();
        wkgbmnqykc();
        this.f19773zdlpuopuiu.write(Long.toString(j13));
        return this;
    }

    public ppxfxbqfkf lqeggnwhkg() throws IOException {
        jlmebxxoox();
        return cqumvgiudr(1, '[');
    }

    public ppxfxbqfkf mbcevpiqjq(Boolean bool) throws IOException {
        if (bool == null) {
            return jyumaefscl();
        }
        jlmebxxoox();
        wkgbmnqykc();
        this.f19773zdlpuopuiu.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public ppxfxbqfkf ntlheqmsrt(Number number) throws IOException {
        if (number == null) {
            return jyumaefscl();
        }
        jlmebxxoox();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!vdvldrhtss(cls) && !f19764istkbnxepw.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f19767esjtqupxsv) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
        }
        wkgbmnqykc();
        this.f19773zdlpuopuiu.append((CharSequence) string);
        return this;
    }

    public ppxfxbqfkf nufgyqmvbu() throws IOException {
        jlmebxxoox();
        return cqumvgiudr(3, '{');
    }

    public final boolean ojitshcjhn() {
        return this.f19770lereixgezr;
    }

    public boolean rgvfuqvkyq() {
        return this.f19767esjtqupxsv;
    }

    public ppxfxbqfkf ulzqkzuiru(String str) throws IOException {
        if (str == null) {
            return jyumaefscl();
        }
        jlmebxxoox();
        wkgbmnqykc();
        dsvhmnatus(str);
        return this;
    }

    public final void wwaezpbzkn(boolean z13) {
        this.f19767esjtqupxsv = z13;
    }

    public ppxfxbqfkf wypolnanlu(double d13) throws IOException {
        jlmebxxoox();
        if (this.f19767esjtqupxsv || !(Double.isNaN(d13) || Double.isInfinite(d13))) {
            wkgbmnqykc();
            this.f19773zdlpuopuiu.append((CharSequence) Double.toString(d13));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d13);
    }
}
