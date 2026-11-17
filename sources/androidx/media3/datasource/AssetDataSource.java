package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import b3.lqeggnwhkg;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class AssetDataSource extends b3.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f9849dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final AssetManager f9850eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Uri f9851gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private InputStream f9852lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f9853nufgyqmvbu;

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th2, int i13) {
            super(th2, i13);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f9850eablkybsjg = context.getAssets();
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        return this.f9851gxszxtbevo;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void close() {
        this.f9851gxszxtbevo = null;
        try {
            try {
                InputStream inputStream = this.f9852lqeggnwhkg;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f9852lqeggnwhkg = null;
                if (this.f9849dxjokdxxww) {
                    this.f9849dxjokdxxww = false;
                    vdvldrhtss();
                }
            } catch (IOException e13) {
                throw new AssetDataSourceException(e13, 2000);
            }
        } catch (Throwable th2) {
            this.f9852lqeggnwhkg = null;
            if (this.f9849dxjokdxxww) {
                this.f9849dxjokdxxww = false;
                vdvldrhtss();
            }
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) throws AssetDataSourceException {
        try {
            Uri uri = lqeggnwhkgVar.f15057iobyxmoadg;
            this.f9851gxszxtbevo = uri;
            String strSubstring = (String) y2.iobyxmoadg.eablkybsjg(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith(CardDateFormatTextWatcher.DIVIDER_CHARACTER)) {
                strSubstring = strSubstring.substring(1);
            }
            oxmwwwfdhm(lqeggnwhkgVar);
            InputStream inputStreamOpen = this.f9850eablkybsjg.open(strSubstring, 1);
            this.f9852lqeggnwhkg = inputStreamOpen;
            if (inputStreamOpen.skip(lqeggnwhkgVar.f15058lqeggnwhkg) < lqeggnwhkgVar.f15058lqeggnwhkg) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j13 = lqeggnwhkgVar.f15059nufgyqmvbu;
            if (j13 != -1) {
                this.f9853nufgyqmvbu = j13;
            } else {
                long jAvailable = this.f9852lqeggnwhkg.available();
                this.f9853nufgyqmvbu = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f9853nufgyqmvbu = -1L;
                }
            }
            this.f9849dxjokdxxww = true;
            kcexrzcfyt(lqeggnwhkgVar);
            return this.f9853nufgyqmvbu;
        } catch (AssetDataSourceException e13) {
            throw e13;
        } catch (IOException e14) {
            throw new AssetDataSourceException(e14, e14 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) throws AssetDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        long j13 = this.f9853nufgyqmvbu;
        if (j13 == 0) {
            return -1;
        }
        if (j13 != -1) {
            try {
                i14 = (int) Math.min(j13, i14);
            } catch (IOException e13) {
                throw new AssetDataSourceException(e13, 2000);
            }
        }
        int i15 = ((InputStream) stevsuqkhv.nufgyqmvbu(this.f9852lqeggnwhkg)).read(bArr, i13, i14);
        if (i15 == -1) {
            return -1;
        }
        long j14 = this.f9853nufgyqmvbu;
        if (j14 != -1) {
            this.f9853nufgyqmvbu = j14 - ((long) i15);
        }
        rgvfuqvkyq(i15);
        return i15;
    }
}
