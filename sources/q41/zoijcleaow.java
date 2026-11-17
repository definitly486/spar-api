package q41;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import i1.nufgyqmvbu;
import java.util.Arrays;
import kotlin.jvm.internal.zdlpuopuiu;
import kr0.wkgbmnqykc;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f77852iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Resources f77853zoijcleaow;

    public zoijcleaow(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f77852iobyxmoadg = context;
        this.f77853zoijcleaow = context.getResources();
    }

    @Override // q41.iobyxmoadg
    public String eablkybsjg(int i13, Object[] objArr) {
        return (objArr == null || objArr.length == 0) ? getString(i13) : getString(i13, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // q41.iobyxmoadg
    public String getString(int i13) {
        String string = this.f77853zoijcleaow.getString(i13);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        return string;
    }

    @Override // q41.iobyxmoadg
    public Typeface gxszxtbevo(int i13) {
        if (i13 == 0) {
            return null;
        }
        try {
            return nufgyqmvbu.dxjokdxxww(this.f77852iobyxmoadg, i13);
        } catch (Throwable th2) {
            wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            return null;
        }
    }

    @Override // q41.iobyxmoadg
    public String[] iobyxmoadg(int i13) {
        String[] stringArray = this.f77853zoijcleaow.getStringArray(i13);
        zdlpuopuiu.dxjokdxxww(stringArray, "getStringArray(...)");
        return stringArray;
    }

    @Override // q41.iobyxmoadg
    public String lqeggnwhkg(int i13, int i14) {
        String quantityString = this.f77853zoijcleaow.getQuantityString(i13, i14);
        zdlpuopuiu.dxjokdxxww(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @Override // q41.iobyxmoadg
    public String nufgyqmvbu(int i13, int i14, Object... formatArgs) {
        zdlpuopuiu.btonecajqb(formatArgs, "formatArgs");
        String quantityString = this.f77853zoijcleaow.getQuantityString(i13, i14, Arrays.copyOf(formatArgs, formatArgs.length));
        zdlpuopuiu.dxjokdxxww(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @Override // q41.iobyxmoadg
    public int ppxfxbqfkf(int i13) {
        return this.f77853zoijcleaow.getDimensionPixelSize(i13);
    }

    @Override // q41.iobyxmoadg
    public Drawable wkgbmnqykc(int i13) {
        if (i13 == 0) {
            return null;
        }
        try {
            return androidx.core.content.iobyxmoadg.getDrawable(this.f77852iobyxmoadg, i13);
        } catch (Throwable th2) {
            wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
            return null;
        }
    }

    @Override // q41.iobyxmoadg
    public float zoijcleaow(int i13) {
        return this.f77853zoijcleaow.getDimension(i13);
    }

    @Override // q41.iobyxmoadg
    public String getString(int i13, Object... formatArgs) {
        zdlpuopuiu.btonecajqb(formatArgs, "formatArgs");
        String string = this.f77853zoijcleaow.getString(i13, Arrays.copyOf(formatArgs, formatArgs.length));
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        return string;
    }
}
