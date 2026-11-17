package gk;

import hk.hcddaimhww;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.tzroggbefp;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final dk.gxszxtbevo f37707iobyxmoadg = fk.wwaezpbzkn.iobyxmoadg("kotlinx.serialization.json.JsonUnquotedLiteral", ck.iobyxmoadg.ylkuphrtab(tzroggbefp.f60034iobyxmoadg));

    public static final iozdgvuglv btonecajqb(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        iozdgvuglv iozdgvuglvVar = btonecajqbVar instanceof iozdgvuglv ? (iozdgvuglv) btonecajqbVar : null;
        if (iozdgvuglvVar != null) {
            return iozdgvuglvVar;
        }
        wkgbmnqykc(btonecajqbVar, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final long draadjrbmk(iozdgvuglv iozdgvuglvVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iozdgvuglvVar, "<this>");
        try {
            return new hk.wwaezpbzkn(iozdgvuglvVar.iobyxmoadg()).wflxmlrfwp();
        } catch (JsonDecodingException e13) {
            throw new NumberFormatException(e13.getMessage());
        }
    }

    public static final int dxjokdxxww(iozdgvuglv iozdgvuglvVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iozdgvuglvVar, "<this>");
        try {
            long jWflxmlrfwp = new hk.wwaezpbzkn(iozdgvuglvVar.iobyxmoadg()).wflxmlrfwp();
            if (-2147483648L <= jWflxmlrfwp && jWflxmlrfwp <= 2147483647L) {
                return (int) jWflxmlrfwp;
            }
            throw new NumberFormatException(iozdgvuglvVar.iobyxmoadg() + " is not an Int");
        } catch (JsonDecodingException e13) {
            throw new NumberFormatException(e13.getMessage());
        }
    }

    public static final Boolean eablkybsjg(iozdgvuglv iozdgvuglvVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iozdgvuglvVar, "<this>");
        return hcddaimhww.wkgbmnqykc(iozdgvuglvVar.iobyxmoadg());
    }

    public static final dk.gxszxtbevo gtknphoqwx() {
        return f37707iobyxmoadg;
    }

    public static final String gxszxtbevo(iozdgvuglv iozdgvuglvVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iozdgvuglvVar, "<this>");
        if (iozdgvuglvVar instanceof pmvmpeiblj) {
            return null;
        }
        return iozdgvuglvVar.iobyxmoadg();
    }

    public static final iozdgvuglv iobyxmoadg(Boolean bool) {
        return bool == null ? pmvmpeiblj.INSTANCE : new iwizpuwonk(bool, false, null, 4, null);
    }

    public static final double lqeggnwhkg(iozdgvuglv iozdgvuglvVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iozdgvuglvVar, "<this>");
        return Double.parseDouble(iozdgvuglvVar.iobyxmoadg());
    }

    public static final float nufgyqmvbu(iozdgvuglv iozdgvuglvVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iozdgvuglvVar, "<this>");
        return Float.parseFloat(iozdgvuglvVar.iobyxmoadg());
    }

    public static final iozdgvuglv ppxfxbqfkf(String str) {
        return str == null ? pmvmpeiblj.INSTANCE : new iwizpuwonk(str, true, null, 4, null);
    }

    private static final Void wkgbmnqykc(btonecajqb btonecajqbVar, String str) {
        throw new IllegalArgumentException("Element " + cllcsxoeiz.zoijcleaow(btonecajqbVar.getClass()) + " is not a " + str);
    }

    public static final iozdgvuglv zoijcleaow(Number number) {
        return number == null ? pmvmpeiblj.INSTANCE : new iwizpuwonk(number, false, null, 4, null);
    }
}
