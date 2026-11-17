package modern.payments.ecomAndroid.util;

import android.content.res.AssetManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H&J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r\"\u00020\u0001H&¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmodern/payments/ecomAndroid/util/ResourceManager;", "", "getAssets", "Landroid/content/res/AssetManager;", "getColor", "", "resourceId", "getDimen", "", "getRawFile", "", "getString", "args", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ResourceManager {
    AssetManager getAssets();

    int getColor(int resourceId);

    float getDimen(int resourceId);

    String getRawFile(int resourceId);

    String getString(int resourceId);

    String getString(int resourceId, Object... args);
}
