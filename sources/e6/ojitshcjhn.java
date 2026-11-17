package e6;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f30595iobyxmoadg;

    public ojitshcjhn(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f30595iobyxmoadg = webkitToCompatConverterBoundaryInterface;
    }

    public btonecajqb iobyxmoadg(WebSettings webSettings) {
        return new btonecajqb((WebSettingsBoundaryInterface) dl.iobyxmoadg.iobyxmoadg(WebSettingsBoundaryInterface.class, this.f30595iobyxmoadg.convertSettings(webSettings)));
    }
}
