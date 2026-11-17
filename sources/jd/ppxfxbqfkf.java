package jd;

import com.google.firebase.perf.util.Timer;
import hd.lqeggnwhkg;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements ResponseHandler {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ResponseHandler f51113iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f51114ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Timer f51115zoijcleaow;

    public ppxfxbqfkf(ResponseHandler responseHandler, Timer timer, lqeggnwhkg lqeggnwhkgVar) {
        this.f51113iobyxmoadg = responseHandler;
        this.f51115zoijcleaow = timer;
        this.f51114ppxfxbqfkf = lqeggnwhkgVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public Object handleResponse(HttpResponse httpResponse) {
        this.f51114ppxfxbqfkf.wwaezpbzkn(this.f51115zoijcleaow.eablkybsjg());
        this.f51114ppxfxbqfkf.oxmwwwfdhm(httpResponse.getStatusLine().getStatusCode());
        Long lIobyxmoadg = wkgbmnqykc.iobyxmoadg(httpResponse);
        if (lIobyxmoadg != null) {
            this.f51114ppxfxbqfkf.iozdgvuglv(lIobyxmoadg.longValue());
        }
        String strZoijcleaow = wkgbmnqykc.zoijcleaow(httpResponse);
        if (strZoijcleaow != null) {
            this.f51114ppxfxbqfkf.yadqdtsiqt(strZoijcleaow);
        }
        this.f51114ppxfxbqfkf.ppxfxbqfkf();
        return this.f51113iobyxmoadg.handleResponse(httpResponse);
    }
}
