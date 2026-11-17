package k5;

import androidx.navigation.wflxmlrfwp;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bk.zoijcleaow f53827iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f53828ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private String f53829wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f53830zoijcleaow;

    /* JADX INFO: renamed from: k5.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private enum EnumC1151iobyxmoadg {
        PATH,
        QUERY
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f53834iobyxmoadg;

        static {
            int[] iArr = new int[EnumC1151iobyxmoadg.values().length];
            try {
                iArr[EnumC1151iobyxmoadg.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1151iobyxmoadg.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f53834iobyxmoadg = iArr;
        }
    }

    public iobyxmoadg(bk.zoijcleaow serializer) {
        zdlpuopuiu.btonecajqb(serializer, "serializer");
        this.f53828ppxfxbqfkf = "";
        this.f53829wkgbmnqykc = "";
        this.f53827iobyxmoadg = serializer;
        this.f53830zoijcleaow = serializer.iobyxmoadg().nufgyqmvbu();
    }

    private final EnumC1151iobyxmoadg eablkybsjg(int i13, wflxmlrfwp wflxmlrfwpVar) {
        return ((wflxmlrfwpVar instanceof h5.zoijcleaow) || this.f53827iobyxmoadg.iobyxmoadg().dxjokdxxww(i13)) ? EnumC1151iobyxmoadg.QUERY : EnumC1151iobyxmoadg.PATH;
    }

    private final void iobyxmoadg(String str) {
        this.f53828ppxfxbqfkf += '/' + str;
    }

    private final void zoijcleaow(String str, String str2) {
        this.f53829wkgbmnqykc += (this.f53829wkgbmnqykc.length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    public final void ppxfxbqfkf(int i13, String name, wflxmlrfwp type, List value) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(value, "value");
        int i14 = zoijcleaow.f53834iobyxmoadg[eablkybsjg(i13, type).ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                return;
            }
            Iterator it = value.iterator();
            while (it.hasNext()) {
                zoijcleaow(name, (String) it.next());
            }
            return;
        }
        if (value.size() == 1) {
            iobyxmoadg((String) jyumaefscl.opjhrmiecq(value));
            return;
        }
        throw new IllegalArgumentException(("Expected one value for argument " + name + ", found " + value.size() + "values instead.").toString());
    }

    public final String wkgbmnqykc() {
        return this.f53830zoijcleaow + this.f53828ppxfxbqfkf + this.f53829wkgbmnqykc;
    }
}
