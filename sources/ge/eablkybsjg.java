package ge;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {
    private final Map zza = new HashMap();

    protected abstract Object create(Object obj);

    @KeepForSdk
    public Object get(Object obj) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(obj)) {
                    return this.zza.get(obj);
                }
                Object objCreate = create(obj);
                this.zza.put(obj, objCreate);
                return objCreate;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
