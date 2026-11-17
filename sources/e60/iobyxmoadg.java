package e60;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f30600iobyxmoadg = new iobyxmoadg();

    private iobyxmoadg() {
    }

    public final void iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        Locale locale = new Locale(xx.iobyxmoadg.f123319iobyxmoadg.wypolnanlu());
        Locale.setDefault(locale);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        context.createConfigurationContext(configuration);
    }
}
