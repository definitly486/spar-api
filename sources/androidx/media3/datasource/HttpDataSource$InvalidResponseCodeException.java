package androidx.media3.datasource;

import b3.lqeggnwhkg;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final String f9869cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final Map f9870esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final int f9871iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public final byte[] f9872lereixgezr;

    public HttpDataSource$InvalidResponseCodeException(int i13, String str, IOException iOException, Map map, lqeggnwhkg lqeggnwhkgVar, byte[] bArr) {
        super("Response code: " + i13, iOException, lqeggnwhkgVar, 2004, 1);
        this.f9871iwizpuwonk = i13;
        this.f9869cqumvgiudr = str;
        this.f9870esjtqupxsv = map;
        this.f9872lereixgezr = bArr;
    }
}
