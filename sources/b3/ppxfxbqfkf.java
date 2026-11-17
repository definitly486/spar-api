package b3;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf extends iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private lqeggnwhkg f15075eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private byte[] f15076gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f15077lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f15078nufgyqmvbu;

    public ppxfxbqfkf() {
        super(false);
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        lqeggnwhkg lqeggnwhkgVar = this.f15075eablkybsjg;
        if (lqeggnwhkgVar != null) {
            return lqeggnwhkgVar.f15057iobyxmoadg;
        }
        return null;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void close() {
        if (this.f15076gxszxtbevo != null) {
            this.f15076gxszxtbevo = null;
            vdvldrhtss();
        }
        this.f15075eablkybsjg = null;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) throws ParserException, DataSourceException {
        oxmwwwfdhm(lqeggnwhkgVar);
        this.f15075eablkybsjg = lqeggnwhkgVar;
        Uri uriNormalizeScheme = lqeggnwhkgVar.f15057iobyxmoadg.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        y2.iobyxmoadg.zoijcleaow("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrK = stevsuqkhv.k(uriNormalizeScheme.getSchemeSpecificPart(), StringUtils.COMMA);
        if (strArrK.length != 2) {
            throw ParserException.wkgbmnqykc("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrK[1];
        if (strArrK[0].contains(";base64")) {
            try {
                this.f15076gxszxtbevo = Base64.decode(str, 0);
            } catch (IllegalArgumentException e13) {
                throw ParserException.wkgbmnqykc("Error while parsing Base64 encoded string: " + str, e13);
            }
        } else {
            this.f15076gxszxtbevo = stevsuqkhv.opjhrmiecq(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j13 = lqeggnwhkgVar.f15058lqeggnwhkg;
        byte[] bArr = this.f15076gxszxtbevo;
        if (j13 > bArr.length) {
            this.f15076gxszxtbevo = null;
            throw new DataSourceException(2008);
        }
        int i13 = (int) j13;
        this.f15077lqeggnwhkg = i13;
        int length = bArr.length - i13;
        this.f15078nufgyqmvbu = length;
        long j14 = lqeggnwhkgVar.f15059nufgyqmvbu;
        if (j14 != -1) {
            this.f15078nufgyqmvbu = (int) Math.min(length, j14);
        }
        kcexrzcfyt(lqeggnwhkgVar);
        long j15 = lqeggnwhkgVar.f15059nufgyqmvbu;
        return j15 != -1 ? j15 : this.f15078nufgyqmvbu;
    }

    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        int i15 = this.f15078nufgyqmvbu;
        if (i15 == 0) {
            return -1;
        }
        int iMin = Math.min(i14, i15);
        System.arraycopy(stevsuqkhv.nufgyqmvbu(this.f15076gxszxtbevo), this.f15077lqeggnwhkg, bArr, i13, iMin);
        this.f15077lqeggnwhkg += iMin;
        this.f15078nufgyqmvbu -= iMin;
        rgvfuqvkyq(iMin);
        return iMin;
    }
}
