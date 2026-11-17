package modern.payments.ecomAndroid.util;

import android.content.Context;
import android.content.res.AssetManager;
import gg.lqeggnwhkg;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.wkgbmnqykc;
import modern.payments.ecomAndroid.util.holder.StringHolderKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/util/ResourceManagerImpl;", "Lmodern/payments/ecomAndroid/util/ResourceManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAssets", "Landroid/content/res/AssetManager;", "getColor", "", "resourceId", "getDimen", "", "getRawFile", "", "getString", "args", "", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ResourceManagerImpl implements ResourceManager {
    private final Context context;

    public ResourceManagerImpl(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.context = context;
    }

    @Override // modern.payments.ecomAndroid.util.ResourceManager
    public AssetManager getAssets() {
        AssetManager assets = this.context.getAssets();
        zdlpuopuiu.dxjokdxxww(assets, "getAssets(...)");
        return assets;
    }

    @Override // modern.payments.ecomAndroid.util.ResourceManager
    public int getColor(int resourceId) {
        return this.context.getResources().getColor(resourceId);
    }

    @Override // modern.payments.ecomAndroid.util.ResourceManager
    public float getDimen(int resourceId) {
        return this.context.getResources().getDimension(resourceId);
    }

    @Override // modern.payments.ecomAndroid.util.ResourceManager
    public String getRawFile(int resourceId) throws Throwable {
        String line;
        InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(resourceId);
        zdlpuopuiu.dxjokdxxww(inputStreamOpenRawResource, "openRawResource(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, wkgbmnqykc.f67326zoijcleaow), 8192);
        Throwable th2 = null;
        try {
            line = bufferedReader.readLine();
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            try {
                bufferedReader.close();
            } catch (Throwable th5) {
                lqeggnwhkg.iobyxmoadg(th4, th5);
            }
            line = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        zdlpuopuiu.lqeggnwhkg(line);
        zdlpuopuiu.dxjokdxxww(line, "use(...)");
        return line;
    }

    @Override // modern.payments.ecomAndroid.util.ResourceManager
    public String getString(int resourceId) {
        return StringHolderKt.getText(StringHolderKt.StringHolder(resourceId), this.context);
    }

    @Override // modern.payments.ecomAndroid.util.ResourceManager
    public String getString(int resourceId, Object... args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return StringHolderKt.getText(StringHolderKt.StringHolder(resourceId, Arrays.copyOf(args, args.length)), this.context);
    }
}
