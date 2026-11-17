package e6;

import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class agtfadlqog implements wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f30521iobyxmoadg;

    public agtfadlqog(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f30521iobyxmoadg = webViewProviderFactoryBoundaryInterface;
    }

    @Override // e6.wflxmlrfwp
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) dl.iobyxmoadg.iobyxmoadg(StaticsBoundaryInterface.class, this.f30521iobyxmoadg.getStatics());
    }

    @Override // e6.wflxmlrfwp
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) dl.iobyxmoadg.iobyxmoadg(WebkitToCompatConverterBoundaryInterface.class, this.f30521iobyxmoadg.getWebkitToCompatConverter());
    }

    @Override // e6.wflxmlrfwp
    public String[] iobyxmoadg() {
        return this.f30521iobyxmoadg.getSupportedFeatures();
    }
}
