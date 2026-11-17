package r8;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;

/* JADX INFO: loaded from: classes2.dex */
public class esjtqupxsv implements agtfadlqog {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Set f82041zoijcleaow = Collections.unmodifiableSet(new HashSet(Arrays.asList(HostSelectionInterceptorImpl.PROTOCOL_HTTP, HostSelectionInterceptorImpl.PROTOCOL_HTTPS)));

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f82042iobyxmoadg;

    public static class iobyxmoadg implements ojitshcjhn {
        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new esjtqupxsv(oxmwwwfdhmVar.wkgbmnqykc(nufgyqmvbu.class, InputStream.class));
        }
    }

    public esjtqupxsv(agtfadlqog agtfadlqogVar) {
        this.f82042iobyxmoadg = agtfadlqogVar;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(Uri uri, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return this.f82042iobyxmoadg.zoijcleaow(new nufgyqmvbu(uri.toString()), i13, i14, lqeggnwhkgVar);
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Uri uri) {
        return f82041zoijcleaow.contains(uri.getScheme());
    }
}
