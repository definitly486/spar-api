package modern.payments.ecomAndroid.domain.storage.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lmodern/payments/ecomAndroid/domain/storage/impl/DefaultSharedPreferencesImpl;", "Lmodern/payments/ecomAndroid/domain/storage/CustomSharedPreferences;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultSharedPreferencesImpl implements CustomSharedPreferences {
    private static final String SPAY_SDK_DATA = "ECOM_SDK_DATA";
    private final SharedPreferences sharedPreferences;

    public DefaultSharedPreferencesImpl(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.sharedPreferences = context.getSharedPreferences(SPAY_SDK_DATA, 0);
    }

    @Override // modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences
    public <T> T getData(String str, T t13) {
        return (T) CustomSharedPreferences.DefaultImpls.getData(this, str, t13);
    }

    @Override // modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences
    public SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    @Override // modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences
    public Map<String, Boolean> isDataExist(String[] strArr) {
        return CustomSharedPreferences.DefaultImpls.isDataExist(this, strArr);
    }

    @Override // modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences
    public void putData(String str, Object obj) {
        CustomSharedPreferences.DefaultImpls.putData(this, str, obj);
    }

    @Override // modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences
    public void removeData(String[] strArr) {
        CustomSharedPreferences.DefaultImpls.removeData(this, strArr);
    }

    @Override // modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences
    public boolean isDataExist(String str) {
        return CustomSharedPreferences.DefaultImpls.isDataExist(this, str);
    }
}
