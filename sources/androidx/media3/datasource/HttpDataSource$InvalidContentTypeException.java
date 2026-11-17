package androidx.media3.datasource;

import b3.lqeggnwhkg;

/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidContentTypeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final String f9868iwizpuwonk;

    public HttpDataSource$InvalidContentTypeException(String str, lqeggnwhkg lqeggnwhkgVar) {
        super("Invalid content type: " + str, lqeggnwhkgVar, 2003, 1);
        this.f9868iwizpuwonk = str;
    }
}
