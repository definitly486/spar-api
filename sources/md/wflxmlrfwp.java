package md;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final URL f66832iobyxmoadg;

    public wflxmlrfwp(URL url) {
        this.f66832iobyxmoadg = url;
    }

    public URLConnection iobyxmoadg() {
        return this.f66832iobyxmoadg.openConnection();
    }

    public String toString() {
        return this.f66832iobyxmoadg.toString();
    }
}
