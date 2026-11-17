package androidx.media3.datasource;

import b3.lqeggnwhkg;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final int f9866jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final lqeggnwhkg f9867yggfygwlhe;

    public HttpDataSource$HttpDataSourceException(lqeggnwhkg lqeggnwhkgVar, int i13, int i14) {
        super(wkgbmnqykc(i13, i14));
        this.f9867yggfygwlhe = lqeggnwhkgVar;
        this.f9866jyumaefscl = i14;
    }

    public static HttpDataSource$HttpDataSourceException lqeggnwhkg(final IOException iOException, final lqeggnwhkg lqeggnwhkgVar, int i13) {
        int i14;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i14 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i14 = GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION;
        } else {
            i14 = (message == null || !xa.zoijcleaow.eablkybsjg(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i14 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, lqeggnwhkgVar) { // from class: androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, lqeggnwhkgVar, i14, i13);
    }

    private static int wkgbmnqykc(int i13, int i14) {
        if (i13 == 2000 && i14 == 1) {
            return 2001;
        }
        return i13;
    }

    public HttpDataSource$HttpDataSourceException(String str, lqeggnwhkg lqeggnwhkgVar, int i13, int i14) {
        super(str, wkgbmnqykc(i13, i14));
        this.f9867yggfygwlhe = lqeggnwhkgVar;
        this.f9866jyumaefscl = i14;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, lqeggnwhkg lqeggnwhkgVar, int i13, int i14) {
        super(iOException, wkgbmnqykc(i13, i14));
        this.f9867yggfygwlhe = lqeggnwhkgVar;
        this.f9866jyumaefscl = i14;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, lqeggnwhkg lqeggnwhkgVar, int i13, int i14) {
        super(str, iOException, wkgbmnqykc(i13, i14));
        this.f9867yggfygwlhe = lqeggnwhkgVar;
        this.f9866jyumaefscl = i14;
    }
}
