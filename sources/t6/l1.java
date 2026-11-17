package t6;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.Objects;
import zone.bi.mobile.fingerprint.api.FingerprintGeneralException;

/* JADX INFO: loaded from: classes2.dex */
class l1 extends zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SharedPreferences f109837iobyxmoadg;

    l1(Context context, String str) {
        this.f109837iobyxmoadg = context.getSharedPreferences(str, 0);
    }

    @Override // t6.zdlpuopuiu
    protected void wkgbmnqykc(kc2.lqeggnwhkg lqeggnwhkgVar, q0 q0Var) {
        if (q0Var == null) {
            this.f109837iobyxmoadg.edit().remove(lqeggnwhkgVar.wkgbmnqykc()).apply();
            return;
        }
        Class clsNufgyqmvbu = lqeggnwhkgVar.nufgyqmvbu();
        if (clsNufgyqmvbu == String.class) {
            this.f109837iobyxmoadg.edit().putString(lqeggnwhkgVar.wkgbmnqykc(), (String) q0Var.iobyxmoadg()).apply();
        } else if (clsNufgyqmvbu == Integer.class) {
            this.f109837iobyxmoadg.edit().putInt(lqeggnwhkgVar.wkgbmnqykc(), ((Integer) q0Var.iobyxmoadg()).intValue()).apply();
        } else if (clsNufgyqmvbu == Long.class) {
            this.f109837iobyxmoadg.edit().putLong(lqeggnwhkgVar.wkgbmnqykc(), ((Long) q0Var.iobyxmoadg()).longValue()).apply();
        } else if (clsNufgyqmvbu == Boolean.class) {
            this.f109837iobyxmoadg.edit().putBoolean(lqeggnwhkgVar.wkgbmnqykc(), ((Boolean) q0Var.iobyxmoadg()).booleanValue()).apply();
        } else if (clsNufgyqmvbu == Float.class) {
            this.f109837iobyxmoadg.edit().putFloat(lqeggnwhkgVar.wkgbmnqykc(), ((Float) q0Var.iobyxmoadg()).floatValue()).apply();
        }
        this.f109837iobyxmoadg.edit().putLong(lqeggnwhkgVar.wkgbmnqykc() + "_time", q0Var.zoijcleaow()).apply();
    }

    @Override // t6.zdlpuopuiu
    protected q0 zoijcleaow(kc2.lqeggnwhkg lqeggnwhkgVar) {
        Serializable serializableValueOf;
        Class clsNufgyqmvbu = lqeggnwhkgVar.nufgyqmvbu();
        if (!this.f109837iobyxmoadg.contains(lqeggnwhkgVar.wkgbmnqykc())) {
            return null;
        }
        if (clsNufgyqmvbu == String.class) {
            serializableValueOf = this.f109837iobyxmoadg.getString(lqeggnwhkgVar.wkgbmnqykc(), null);
        } else if (clsNufgyqmvbu == Integer.class) {
            serializableValueOf = Integer.valueOf(this.f109837iobyxmoadg.getInt(lqeggnwhkgVar.wkgbmnqykc(), -1));
        } else if (clsNufgyqmvbu == Long.class) {
            serializableValueOf = Long.valueOf(this.f109837iobyxmoadg.getLong(lqeggnwhkgVar.wkgbmnqykc(), -1L));
        } else if (clsNufgyqmvbu == Boolean.class) {
            serializableValueOf = Boolean.valueOf(this.f109837iobyxmoadg.getBoolean(lqeggnwhkgVar.wkgbmnqykc(), false));
        } else {
            if (clsNufgyqmvbu != Float.class) {
                throw new FingerprintGeneralException("unknown value class for SharedPreferencesCacheStore: " + clsNufgyqmvbu.getCanonicalName());
            }
            serializableValueOf = Float.valueOf(this.f109837iobyxmoadg.getFloat(lqeggnwhkgVar.wkgbmnqykc(), -1.0f));
        }
        long j13 = this.f109837iobyxmoadg.getLong(lqeggnwhkgVar.wkgbmnqykc() + "_time", 0L);
        Objects.requireNonNull(serializableValueOf);
        return new q0(serializableValueOf, j13);
    }
}
