package modern.payments.ecomAndroid.domain.storage;

import android.content.SharedPreferences;
import gg.wwaezpbzkn;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.exception.EcomInternalException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lmodern/payments/ecomAndroid/domain/storage/CustomSharedPreferences;", "", "", "key", "", "isDataExist", "(Ljava/lang/String;)Z", "", "keys", "", "([Ljava/lang/String;)Ljava/util/Map;", "Lgg/wwaezpbzkn;", "removeData", "([Ljava/lang/String;)V", "value", "putData", "(Ljava/lang/String;Ljava/lang/Object;)V", "T", "defaultValue", "getData", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CustomSharedPreferences {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <T> T getData(CustomSharedPreferences customSharedPreferences, String key, T t13) {
            T t14;
            zdlpuopuiu.btonecajqb(key, "key");
            SharedPreferences sharedPreferences = customSharedPreferences.getSharedPreferences();
            if (sharedPreferences != null) {
                if (t13 instanceof Boolean) {
                    t14 = (T) Boolean.valueOf(sharedPreferences.getBoolean(key, ((Boolean) t13).booleanValue()));
                } else if (t13 instanceof String) {
                    t14 = (T) sharedPreferences.getString(key, (String) t13);
                } else if (t13 instanceof Float) {
                    t14 = (T) Float.valueOf(sharedPreferences.getFloat(key, ((Number) t13).floatValue()));
                } else if (t13 instanceof Integer) {
                    t14 = (T) Integer.valueOf(sharedPreferences.getInt(key, ((Number) t13).intValue()));
                } else {
                    if (!(t13 instanceof Long)) {
                        throw EcomInternalException.SharedPreferencesIllegalType.INSTANCE;
                    }
                    t14 = (T) Long.valueOf(sharedPreferences.getLong(key, ((Number) t13).longValue()));
                }
                if (t14 != null) {
                    return t14;
                }
            }
            throw EcomInternalException.SharedPreferencesNotInitialized.INSTANCE;
        }

        public static boolean isDataExist(CustomSharedPreferences customSharedPreferences, String key) {
            zdlpuopuiu.btonecajqb(key, "key");
            SharedPreferences sharedPreferences = customSharedPreferences.getSharedPreferences();
            if (sharedPreferences != null) {
                return sharedPreferences.contains(key);
            }
            return false;
        }

        public static void putData(CustomSharedPreferences customSharedPreferences, String key, Object obj) {
            wwaezpbzkn wwaezpbzknVar;
            zdlpuopuiu.btonecajqb(key, "key");
            SharedPreferences sharedPreferences = customSharedPreferences.getSharedPreferences();
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (obj instanceof Boolean) {
                    editorEdit.putBoolean(key, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    editorEdit.putString(key, (String) obj);
                } else if (obj instanceof Float) {
                    editorEdit.putFloat(key, ((Number) obj).floatValue());
                } else if (obj instanceof Integer) {
                    editorEdit.putInt(key, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    editorEdit.putLong(key, ((Number) obj).longValue());
                } else if (obj != null) {
                    throw EcomInternalException.SharedPreferencesIllegalType.INSTANCE;
                }
                editorEdit.apply();
                editorEdit.apply();
                wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } else {
                wwaezpbzknVar = null;
            }
            if (wwaezpbzknVar == null) {
                throw EcomInternalException.SharedPreferencesNotInitialized.INSTANCE;
            }
        }

        public static void removeData(CustomSharedPreferences customSharedPreferences, String[] keys) {
            zdlpuopuiu.btonecajqb(keys, "keys");
            SharedPreferences sharedPreferences = customSharedPreferences.getSharedPreferences();
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                for (String str : keys) {
                    editorEdit.remove(str);
                }
                editorEdit.apply();
                editorEdit.apply();
            }
        }

        public static Map<String, Boolean> isDataExist(CustomSharedPreferences customSharedPreferences, String[] keys) {
            zdlpuopuiu.btonecajqb(keys, "keys");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : keys) {
                linkedHashMap.put(str, Boolean.valueOf(customSharedPreferences.isDataExist(str)));
            }
            return linkedHashMap;
        }
    }

    <T> T getData(String key, T defaultValue);

    SharedPreferences getSharedPreferences();

    Map<String, Boolean> isDataExist(String[] keys);

    boolean isDataExist(String key);

    void putData(String key, Object value);

    void removeData(String[] keys);
}
