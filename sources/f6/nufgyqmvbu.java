package f6;

import gg.draadjrbmk;
import gg.gtknphoqwx;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu implements Comparable {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final nufgyqmvbu f32923istkbnxepw;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final nufgyqmvbu f32926zynmafqrjb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final gtknphoqwx f32927cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f32928iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f32929jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f32930yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f32931zdlpuopuiu;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f32922esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final nufgyqmvbu f32924lereixgezr = new nufgyqmvbu(0, 0, 0, "");

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final nufgyqmvbu f32925pmvmpeiblj = new nufgyqmvbu(0, 1, 0, "");

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final nufgyqmvbu iobyxmoadg() {
            return nufgyqmvbu.f32925pmvmpeiblj;
        }

        public final nufgyqmvbu zoijcleaow(String str) {
            if (str == null || kcexrzcfyt.zfvoamnweg(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String strGroup = matcher.group(1);
            Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
            if (numValueOf == null) {
                return null;
            }
            int iIntValue = numValueOf.intValue();
            String strGroup2 = matcher.group(2);
            Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
            if (numValueOf2 == null) {
                return null;
            }
            int iIntValue2 = numValueOf2.intValue();
            String strGroup3 = matcher.group(3);
            Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
            if (numValueOf3 == null) {
                return null;
            }
            int iIntValue3 = numValueOf3.intValue();
            String description = matcher.group(4) != null ? matcher.group(4) : "";
            zdlpuopuiu.dxjokdxxww(description, "description");
            return new nufgyqmvbu(iIntValue, iIntValue2, iIntValue3, description, null);
        }

        private iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {
        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final BigInteger invoke() {
            return BigInteger.valueOf(nufgyqmvbu.this.wkgbmnqykc()).shiftLeft(32).or(BigInteger.valueOf(nufgyqmvbu.this.eablkybsjg())).shiftLeft(32).or(BigInteger.valueOf(nufgyqmvbu.this.gxszxtbevo()));
        }
    }

    static {
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(1, 0, 0, "");
        f32926zynmafqrjb = nufgyqmvbuVar;
        f32923istkbnxepw = nufgyqmvbuVar;
    }

    public /* synthetic */ nufgyqmvbu(int i13, int i14, int i15, String str, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(i13, i14, i15, str);
    }

    private final BigInteger ppxfxbqfkf() {
        Object value = this.f32927cqumvgiudr.getValue();
        zdlpuopuiu.dxjokdxxww(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public final int eablkybsjg() {
        return this.f32930yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f32931zdlpuopuiu == nufgyqmvbuVar.f32931zdlpuopuiu && this.f32930yggfygwlhe == nufgyqmvbuVar.f32930yggfygwlhe && this.f32929jyumaefscl == nufgyqmvbuVar.f32929jyumaefscl;
    }

    public final int gxszxtbevo() {
        return this.f32929jyumaefscl;
    }

    public int hashCode() {
        return ((((527 + this.f32931zdlpuopuiu) * 31) + this.f32930yggfygwlhe) * 31) + this.f32929jyumaefscl;
    }

    public String toString() {
        return this.f32931zdlpuopuiu + '.' + this.f32930yggfygwlhe + '.' + this.f32929jyumaefscl + (!kcexrzcfyt.zfvoamnweg(this.f32928iwizpuwonk) ? zdlpuopuiu.oxmwwwfdhm("-", this.f32928iwizpuwonk) : "");
    }

    public final int wkgbmnqykc() {
        return this.f32931zdlpuopuiu;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public int compareTo(nufgyqmvbu other) {
        zdlpuopuiu.btonecajqb(other, "other");
        return ppxfxbqfkf().compareTo(other.ppxfxbqfkf());
    }

    private nufgyqmvbu(int i13, int i14, int i15, String str) {
        this.f32931zdlpuopuiu = i13;
        this.f32930yggfygwlhe = i14;
        this.f32929jyumaefscl = i15;
        this.f32928iwizpuwonk = str;
        this.f32927cqumvgiudr = draadjrbmk.zoijcleaow(new zoijcleaow());
    }
}
