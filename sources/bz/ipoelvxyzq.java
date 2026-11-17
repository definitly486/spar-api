package bz;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
class ipoelvxyzq extends metgxyhuhe {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final String f17471lqeggnwhkg = t6.iwizpuwonk.iobyxmoadg(new byte[]{-123, -1, 17, -128, 124, -82, -56, 91, -76, -54, 69, -44, 79, 86, -47, 53, -40, 76, -61, 74, 111, 101, -11, -75, 64, -41, 3, 79, 103, 19, 125, 44});

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final String f17472nufgyqmvbu = t6.iwizpuwonk.iobyxmoadg(new byte[]{-68, 76, -25, 3, -108, 89, -40, -14, 17, 111, -18, 26, -23, 45, -101, 61, -16, 40, 43, 95, 101, -120, -24, 92, -17, 123, 34, -39, 14, -76, -13, 96});

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17473eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f17474gxszxtbevo;

    ipoelvxyzq(Context context, boolean z13) {
        super(kc2.lqeggnwhkg.RSA_ApplicationKey);
        this.f17473eablkybsjg = context;
        this.f17474gxszxtbevo = z13;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws u4 {
        if (!this.f17474gxszxtbevo) {
            throw new u4(t6.iwizpuwonk.iobyxmoadg(new byte[]{-114, -57, 43, -68, -118, 33, 115, 92, -78, 7, 126, -86, 113, -87, -26, 33, 66, -26, 18, 63, 74, -120, 16, 74, -55, -4, -83, 34, -92, -81, 82, 118, 19, -9, 6, -117, -79, 53, 54, 57, -44, 48, 97, 11, -28, -111, 84, 56}));
        }
        SharedPreferences sharedPreferences = this.f17473eablkybsjg.getSharedPreferences(f17471lqeggnwhkg, 0);
        String str = f17472nufgyqmvbu;
        String string = sharedPreferences.getString(str, t6.iwizpuwonk.iobyxmoadg(new byte[]{57, 113, -35, -27, -115, -45, -57, -75, -111, 90, -74, 36, -56, 66, 57, -73}));
        if (!TextUtils.isEmpty(string.trim())) {
            return string;
        }
        String strReplaceAll = UUID.randomUUID().toString().toUpperCase(Locale.ROOT).replaceAll(t6.iwizpuwonk.iobyxmoadg(new byte[]{-104, 45, 7, 24, -29, -61, -98, -84, -121, -47, -10, -3, 34, 17, 86, 63}), t6.iwizpuwonk.iobyxmoadg(new byte[]{57, 113, -35, -27, -115, -45, -57, -75, -111, 90, -74, 36, -56, 66, 57, -73}));
        sharedPreferences.edit().putString(str, strReplaceAll).apply();
        return strReplaceAll;
    }
}
