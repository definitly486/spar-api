package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.yggfygwlhe;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class ojitshcjhn implements rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg f10473iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f10474ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f10475wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f10476zoijcleaow;

    public ojitshcjhn(String str, boolean z13, androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadg) {
        y2.iobyxmoadg.iobyxmoadg((z13 && TextUtils.isEmpty(str)) ? false : true);
        this.f10473iobyxmoadg = interfaceC0162iobyxmoadg;
        this.f10476zoijcleaow = str;
        this.f10474ppxfxbqfkf = z13;
        this.f10475wkgbmnqykc = new HashMap();
    }

    @Override // androidx.media3.exoplayer.drm.rgvfuqvkyq
    public byte[] iobyxmoadg(UUID uuid, wflxmlrfwp.iobyxmoadg iobyxmoadgVar) throws MediaDrmCallbackException {
        String str;
        String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
        if (this.f10474ppxfxbqfkf || TextUtils.isEmpty(strZoijcleaow)) {
            strZoijcleaow = this.f10476zoijcleaow;
        }
        if (TextUtils.isEmpty(strZoijcleaow)) {
            b3.lqeggnwhkg.zoijcleaow zoijcleaowVar = new b3.lqeggnwhkg.zoijcleaow();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(zoijcleaowVar.dxjokdxxww(uri).iobyxmoadg(), uri, yggfygwlhe.kcexrzcfyt(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = v2.nufgyqmvbu.f115644eablkybsjg;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = v2.nufgyqmvbu.f115646ppxfxbqfkf.equals(uuid) ? PaymentFlowNetworkModuleKt.REQUEST_TYPE : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f10475wkgbmnqykc) {
            map.putAll(this.f10475wkgbmnqykc);
        }
        return btonecajqb.iobyxmoadg(this.f10473iobyxmoadg.iobyxmoadg(), strZoijcleaow, iobyxmoadgVar.iobyxmoadg(), map);
    }

    public void ppxfxbqfkf(String str, String str2) {
        y2.iobyxmoadg.eablkybsjg(str);
        y2.iobyxmoadg.eablkybsjg(str2);
        synchronized (this.f10475wkgbmnqykc) {
            this.f10475wkgbmnqykc.put(str, str2);
        }
    }

    @Override // androidx.media3.exoplayer.drm.rgvfuqvkyq
    public byte[] zoijcleaow(UUID uuid, wflxmlrfwp.wkgbmnqykc wkgbmnqykcVar) {
        return btonecajqb.iobyxmoadg(this.f10473iobyxmoadg.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow() + "&signedRequest=" + stevsuqkhv.lmojexxdyd(wkgbmnqykcVar.iobyxmoadg()), null, Collections.emptyMap());
    }
}
