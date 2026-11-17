package androidx.camera.extensions.internal;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx implements Comparable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final gtknphoqwx f3998zdlpuopuiu = ppxfxbqfkf(1, 0, 0, "");

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final gtknphoqwx f3997yggfygwlhe = ppxfxbqfkf(1, 1, 0, "");

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final gtknphoqwx f3996jyumaefscl = ppxfxbqfkf(1, 2, 0, "");

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final gtknphoqwx f3995iwizpuwonk = ppxfxbqfkf(1, 3, 0, "");

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final gtknphoqwx f3993cqumvgiudr = ppxfxbqfkf(1, 4, 0, "");

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final Pattern f3994esjtqupxsv = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    gtknphoqwx() {
    }

    public static gtknphoqwx dxjokdxxww(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f3994esjtqupxsv.matcher(str);
        if (matcher.matches()) {
            return ppxfxbqfkf(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    public static gtknphoqwx ppxfxbqfkf(int i13, int i14, int i15, String str) {
        return new ppxfxbqfkf(i13, i14, i15, str);
    }

    private static BigInteger wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        return BigInteger.valueOf(gtknphoqwxVar.gxszxtbevo()).shiftLeft(32).or(BigInteger.valueOf(gtknphoqwxVar.lqeggnwhkg())).shiftLeft(32).or(BigInteger.valueOf(gtknphoqwxVar.nufgyqmvbu()));
    }

    abstract String eablkybsjg();

    public final boolean equals(Object obj) {
        if (!(obj instanceof gtknphoqwx)) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        return Integer.valueOf(gxszxtbevo()).equals(Integer.valueOf(gtknphoqwxVar.gxszxtbevo())) && Integer.valueOf(lqeggnwhkg()).equals(Integer.valueOf(gtknphoqwxVar.lqeggnwhkg())) && Integer.valueOf(nufgyqmvbu()).equals(Integer.valueOf(gtknphoqwxVar.nufgyqmvbu()));
    }

    public abstract int gxszxtbevo();

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(gxszxtbevo()), Integer.valueOf(lqeggnwhkg()), Integer.valueOf(nufgyqmvbu()));
    }

    public int iobyxmoadg(int i13, int i14) {
        return gxszxtbevo() == i13 ? Integer.compare(lqeggnwhkg(), i14) : Integer.compare(gxszxtbevo(), i13);
    }

    abstract int lqeggnwhkg();

    abstract int nufgyqmvbu();

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(gxszxtbevo() + "." + lqeggnwhkg() + "." + nufgyqmvbu());
        if (!TextUtils.isEmpty(eablkybsjg())) {
            sb3.append("-" + eablkybsjg());
        }
        return sb3.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public int compareTo(gtknphoqwx gtknphoqwxVar) {
        return wkgbmnqykc(this).compareTo(wkgbmnqykc(gtknphoqwxVar));
    }
}
